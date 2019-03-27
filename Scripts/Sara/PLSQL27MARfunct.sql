--------------------------------------------ESERCIZI-----------------------------------------------------------
set serveroutput on 

create or replace procedure get_coder_name(   -- questa procedura ha 3 parametri:
    p_coder_id in coders.coder_id%type,  --parametro input
    p_first_name out coders.first_name%type, --parametro output
    p_last_name out coders.last_name%type
)as 
begin
    SELECT first_name, last_name
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


--------------------------------------------------------------------------------------------------------------
-- find_max(a in, b in, max out)
-- find_max(3, 12, max) -> max = 12

create or replace procedure find_max(
    p_a in number,
    p_b in number,
    p_max out number
) as
begin
    if  p_a > p_b then
        p_max := p_a;
    else 
        p_max := p_b;
    end if;
end;
/

-- test   
declare
    a number;
    b number;
    c number;
begin
    a := 15;
    b := 50;
    
    find_max(a, b, c);
    dbms_output.put_line('Max is ' || c);
end;
/
------------------------------------------------------------------------------------------------------------
drop procedure find_max;    
-------------------------------------------------------------------------------------------------------------
create or replace function find_max(
    p_a in number,
    p_b in number)
return number as
begin
    if  p_a > p_b then
        return p_a;
    else 
        return p_b;
    end if;
end;
/

-- test   
declare
    a number;
    b number;
begin
    a := 15;
    b := 50;
    dbms_output.put_line('Max is ' || find_max(a, b));
end;
/    

select find_max(12, 42)
from dual;

-------------------------------------------------------------------------------------------------------------
-- my_numeric_nvl(a, b) return a when a is not null, otherwise b
-- select commission_pct
-- from HR.employees;

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
/

--test
declare
    p_a number;
    p_b number;
begin
    p_a := null;
    p_b := 42;
    dbms_output.put_line('my_numeric_nvl is ' ||  p_a || ' ' ||p_b);
end;
/ 
--altro tipo di test
select my_numeric_nvl (null, 42)
from dual;
-- altro tipo di test
select he.employee_id, my_numeric_nvl(he.commission_pct, 0)
from hr.employees he;

-------------------------------------------------------------------------------------------------------------
-- function circle_area(p_radius numeric) -> circle area
create or replace function circle_area(
    p_radius in number)
return number as
    v_pi number := acos(-1); --variabile pi greco
begin
    return p_radius ** 2 * v_pi; -- ** -> sono le parentesi quadre,  ** 2 -> al quadrato
end;
/

--test
select circle_area(8), circle_area(2)
from dual;

---------------------------------------------------------------------------------------------------------------
-- procedure increase_salary_for_coders()
-- low, high : interval coders id to increase salary
-- increase : how much to increase salaries

create or replace procedure increase_salary_for_coders(  
    p_low in coders.coder_id%type,
    p_high in coders.coder_id%type,
    p_increase in coders.salary%type)
as 
begin
        update coders
        set salary = salary + p_increase
        where coder_id between p_low and p_high;
        commit;
end;
/

-- test
call increase_salary_for_coders(106, 107, 1000);