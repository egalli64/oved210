
set serveroutput on

create or replace procedure get_coder_name(
    p_coder_id in coders.coder_id%type,
    p_first_name out coders.first_name%type,
    p_last_name out coders.last_name%type
) as
begin
    select first_name, last_name
    into p_first_name, p_last_name
    from coders
    where coder_id = p_coder_id;
end;
/

--test 
declare
    v_first_name coders.first_name%type;
    v_last_name coders.last_name%type;
begin
    get_coder_name(107,v_first_name, v_last_name);
    dbms_output.put_line(' Coder 107 is ' || v_first_name || ' ' || v_last_name);
end;
/



--find max come PROCEDURA
--find_max ( a in, b in, max out)
--find_max (3, 12, max) --> max=12;

create or replace procedure find_max(
    p_a in number,
    p_b in number,
    p_max out number
)as
begin 
	if p_a > p_b then
        p_max := p_a;
    else
        p_max := p_b;
    end if;
end;
/

--test
declare
    a number;
    b number;
    c number;
begin
    a := 3;
    b := 12;
    
    find_max(a, b, c);
    dbms_output.put_line(' Max is ' || c );
end;
    
    
    
drop procedure find_max;


--fin_max come FUNZIONE
create or replace function find_max(
    p_a in number,
    p_b in number)
return number as
    -- no variables here!
begin 
    if p_a > p_b then
        return p_a;
    else
        return p_b;
    end if;
end;
/

--test
declare
    a number;
    b number;
begin
    a := 3;
    b := 12;

    dbms_output.put_line(' Max is ' || find_max(a, b));
end;

--oppure   
select find_max(3, 12)
from dual;
    

--my_numeric_value(a, b) return a if when a is not null, while b 

create or replace function my_numeric_nvl(
    p_a in number,
    p_b in number)
return number as
begin
    if p_a is null then
        return p_b;
    else
        return p_a;
    end if;
end;
        
--test
select my_numeric_nvl( 12, null)
from dual;
--altro test
select he.employee_id, my_numeric_nvl(he.commission_pct, 0)
from hr.employees he;




--function circe area(p_radius numeric) -> circle area
create or replace function circle_area(
    p_radius in number)
return number as
begin
    return((p_radius*p_radius)* 3.14);
end;

--test
select circle_area (6)
from dual;



-- procedure increase_salary_for_coders()
-- low, high: interval coders id to increase salary
-- increase: how much to increase salaries


--open cursor for
create or replace procedure interval_increase_salary(
    p_low in coders.coder_id%type,
    p_high in coders.coder_id%type,
    p_increase in coders.salary%type
) as
    type t_coder_cursor is ref cursor return coders%rowtype;
    v_coder_cursor t_coder_cursor;
    v_cur coders%rowtype;
begin
    open v_coder_cursor for 
    select *
    from coders
    where coder_id 
    between p_low and p_high;

    loop
        fetch v_coder_cursor into v_cur;
        exit when v_coder_cursor%notfound;
 
        update coders
        set salary = salary + p_increase
        where coder_id = v_cur.coder_id;
    end loop;
end;
/
--test
call interval_increase_salary (105, 107, 1000);



--metodo alternativo con cursor
create or replace procedure increase_salary_for_coders(
    p_low in coders.coder_id%type,
    p_high in coders.coder_id%type,
    p_increase in coders.salary%type
) as
    v_coder_id coders.coder_id%type;
    cursor v_coder_cursor is
        select coder_id
        from coders
        where coder_id
        between p_low and p_high;
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
--test
call increase_salary_for_coders(106, 107, 1000);



--altro metodo alternativo con cursor
create or replace procedure increase_salary_for_coders(
    p_low in coders.coder_id%type,
    p_high in coders.coder_id%type,
    p_increase in coders.salary%type
) as
begin
    update coders
    set salary = salary + p_increase
    where coder_id between p_low and p_high;
    commit;
end;
/


