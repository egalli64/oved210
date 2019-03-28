set serveroutput on

create or replace procedure get_coder_name(
   p_coder_id IN coders.coder_id%type,
   p_first_name OUT coders.first_name%type,
   p_last_name OUT coders.last_name%type
) is
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
   DBMS_OUTPUT.PUT_LINE('Coder 107 is ' || v_first_name || ' ' || v_last_name);
end;
/

------------------------------------------------------------------------------------------------------------------------------

-- find_max(a INPUT, b INPUT, max OUT) 
-- ex: find_max(3, 12, max) --> max = 12

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

-- test

declare 
   a number;
   b number;
   c number;
begin
   a := 13;
   b := 37;

   find_max(a, b, c);
   DBMS_OUTPUT.PUT_LINE('Max is ' || c);
end;
/

drop procedure find_max;

create or replace FUNCTION find_max(
   p_a IN number,
   p_b IN number
)return number as 
   -- no variables here!
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
   a := 13;
   b := 37;

   DBMS_OUTPUT.PUT_LINE('Max is ' || find_max(a, b));
end;
/

select find_max(12, 42)
from dual;

------------------------------------------------------------------------------------------------------------------------------

-- my_numeric_nvl(a, b) return a when a is not null, otherwise b
-- due paramentri in input 

-- select commission_pct
-- from HR.employees

create or replace function my_numeric_nvl(
   p_value in number,
   p_alt in number
)return number as 
begin
   if p_value is null then
       return p_alt;
   else 
      return p_value;
   end if;
end;
/

-- test
declare
   p_value number;  
   p_alt number;
begin
   p_value := null;
   p_alt := 42;
   
   DBMS_OUTPUT.PUT_LINE('my_numeric_value is' || p_value || ' ' || p_alt);
end;
/

select my_numeric_nvl(null, 42)
from dual;

select he.employee_id, my_numeric_nvl(he.commission_pct, 0)
from hr.employee he;

------------------------------------------------------------------------------------------------------------------------------

-- function circle_area(p_radius numeric) --> circle area 

-- esempio (non è corretta però perchè ritorna sempre pgreco)
create or replace function circle_area(
   p_radius number
) return number as 
begin 
   return acos(-1);  -- ACOS per far ritornare il pgreco
end;
/
select circle_area(7), circle_area(1)
from dual;

drop function circle_area;


create or replace function circle_area(
   p_radius number
) return number as 
begin 
   return p_radius * p_radius * 3.14;
end;
/

select circle_area(7), circle_area(1)
from dual;

------------------------------------------------------------------------------------------------------------------------------

-- procedure increase_salary_for_coders()
-- low, high: interval coders id to increase salary
-- increase: how much to increase salaries

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