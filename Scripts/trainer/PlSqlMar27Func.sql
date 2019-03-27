set serveroutput on

create or replace procedure get_coder_name(
    p_coder_id IN coders.coder_id%type,
    p_first_name OUT coders.first_name%type,
    p_last_name OUT coders.last_name%type
) as
begin
    select first_name, last_name
    into p_first_name, p_last_name
    from coders
    where coder_id = p_coder_id;
end;
/

-- testing for my procedure
declare
    v_first_name coders.first_name%type;
    v_last_name coders.last_name%type;    
begin
    get_coder_name(107, v_first_name, v_last_name);
    dbms_output.put_line('Coder 107 is ' || v_first_name || ' ' || v_last_name);
end;
/

-- find_max(a in, b in, max out) 
-- ex: find_max(3, 12, max) -> max = 12
create or replace procedure find_max(
    p_a IN number,
    p_b IN number,
    p_max OUT number
) as
begin
    if p_a > p_b then
        p_max := p_a;
    else
        p_max := p_b;
    end if;
end;
/

declare
    a number;
    b number;
    c number;
begin
    a := 18;
    b := 42;
    
    find_max(a, b, c);
    dbms_output.put_line('Max is ' || c);
end;
/

drop PROCEDURE find_max;

create or replace function find_max(
    p_a IN number,
    p_b IN number) 
return number as
begin
    if p_a > p_b then
        return p_a;
    else
        return p_b;
    end if;
end;
/

declare
    a number;
    b number;
begin
    a := 18;
    b := 42;

    dbms_output.put_line('Max is ' || find_max(a, b));
end;
/

select find_max(12, 42)
from dual;

-- my_numeric_nvl(a, b) return a when a is not null, otherwise b
create or replace function my_numeric_nvl(
    p_value IN number,
    p_alt IN number) 
return number as
begin
    if p_value is null then
        return p_alt;
    else
        return p_value;
    end if;
end;
/

select my_numeric_nvl(null, 42), my_numeric_nvl(12, 42)
from dual;

select he.employee_id, my_numeric_nvl(he.commission_pct, 0)
from hr.employees he;

-- function circle_area(p_radius numeric) -> circle area
create or replace function circle_area(
    p_radius IN number) 
return number as
    v_pi number := acos(-1);
begin
    return p_radius ** 2 * v_pi;
end;
/

select circle_area(7), circle_area(1)
from dual;

-- procedure increase_salary_for_coders()
-- low, high: interval coders id to increase salary
-- increase: how much to increase salaries
create or replace procedure increase_salary_for_coders(
    p_low IN coders.coder_id%type,
    p_high IN coders.coder_id%type,
    p_increase IN coders.salary%type
) as
    type t_coder_cursor is ref cursor return coders%rowtype;
    v_coder_cursor t_coder_cursor;
    v_cur coders%rowtype;
begin
    open v_coder_cursor
        for select *
        from coders
        where coder_id
        BETWEEN p_low and p_high;
    loop
        fetch v_coder_cursor into v_cur;
        exit when v_coder_cursor%notfound;

        update coders
        set salary = salary + p_increase
        where coder_id = v_cur.coder_id;
    end loop;
    commit;
end;
/

create or replace procedure increase_salary_for_coders(
    p_low IN coders.coder_id%type,
    p_high IN coders.coder_id%type,
    p_increase IN coders.salary%type
) as
    v_coder_id coders.coder_id%type;
    cursor v_coder_cursor is
        select coder_id
        from coders
        where coder_id
        BETWEEN p_low and p_high;
begin
    open v_coder_cursor;

    loop
        fetch v_coder_cursor
        into v_coder_id;
        exit when v_coder_cursor%notfound;
        
        update coders
        set salary = salary + p_increase
        where coder_id = v_coder_id;
    end loop;
    commit;
end;
/

call increase_salary_for_coders(106, 107, 1000);

create or replace procedure increase_salary_for_coders(
    p_low IN coders.coder_id%type,
    p_high IN coders.coder_id%type,
    p_increase IN coders.salary%type
) as
begin
    update coders
    set salary = salary + p_increase
    where coder_id between p_low and p_high;
    commit;
end;
/
