set serveroutput on;

create or replace procedure get_coder_name (
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

declare
v_first_name coders.first_name%type;
v_last_name coders.last_name%type;
begin
    get_coder_name(107, v_first_name, v_last_name);
    dbms_output.put_line('Coder 107 is ' || v_first_name || '' || v_last_name);
end;
/


-- find_max (a NUMBER input ,b NUMBER input, max output)
-- find_max (3, 12, max) -> max = 12

create or replace procedure find_max (
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
    a:= 18;
    b:= 42;
    
    find_max(a,b,c);
    
    dbms_output.put_line('Max is ' || c);
end;

drop procedure find_max;

create or replace function find_max (
    p_a IN number,
    p_b IN number) 
return number as 
   --no variables here
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
    a:= 18;
    b:= 42;
    
    dbms_output.put_line('Max is ' || find_max(a,b));
end;

select find_max(12,42)
FROM dual;


--MY_NVL(a,b) return a when a is not null, otherwise b

create or replace function my_nvl (
    p_a IN number,
    p_b IN number) 
return number as 
   --no variables here
begin
    if p_a is null then
        return p_b;
    else
        return p_a;
    end if;
end;
/

select my_nvl(4, null)
from dual;

select my_nvl(null, 4)
from dual;

select my_nvl(14,2)
from dual;

select he.employee_id, my_nvl (he.commission_pct, 0)
from hr.employees he;


--function circle_area (p_radius numeric) - > circle area
--(in: number / out : area)

create or replace function circle_area (
    p_radius IN number)
    return number as
    
    begin
        return p_radius * p_radius * 3.14;
    --oppure p_radius **2 * acos(-1);
    
    end;
    /
    
    select circle_area (3)
    from dual;
    
-- procedure increase_salary_for_coders()


create or replace procedure increase_salary_for_coders (
    p_low IN coders.coder_id%type,
    p_high IN coders.coder_id%type,
    p_increase IN number

    ) as 
    type t_cursor is ref cursor;
    v_cursor t_cursor;
    v_cod coders%rowtype;
       
begin
    open v_cursor 
    for  
    select *
    from coders
    where coder_id 
    between p_low and p_high;
   
    loop
        fetch v_cursor into v_cod;
        exit when v_cursor%notfound;

        update coders
        set salary = salary + p_increase
        where coder_id = v_cod.coder_id;

    end loop;
       
end;
/


create or replace procedure increase_salary_for_coders_simple (
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

call increase_salary_for_coders (104,107,100);




