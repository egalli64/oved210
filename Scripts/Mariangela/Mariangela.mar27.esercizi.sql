set serveroutput on;

create or replace procedure increase_salary
as 

begin

update coders
set salary = salary + 1
where coder_id = 107;
commit;
end increase_salary;
/

drop procedure increase_salary;

-- test for procedure
call increase_salary();

begin
increase_salary();
end;
/

create or replace procedure increase_salary_coder (
p_coder_id in coders.coder_id%type)
as 

begin

update coders
set salary = salary + 1
where coder_id = p_coder_id;
commit;
end increase_salary_coder;
/

drop procedure increase_salary_coder;
call increase_salary_coder(106);


----
create or replace procedure get_coder_name (
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

-- test for my procedure
declare
    v_first_name coders.first_name%type;
    v_last_name coders.last_name%type;
begin
get_coder_name (107, v_first_name, v_last_name);

dbms_output.put_line('Coder 107 is ' || v_first_name || ' ' || v_last_name);

end;
/

--- find_max(a in, b in, max out)
--- find max(3, 12, max) -> max = 12
create or replace procedure find_max (
p_a IN number,
p_b IN number,
p_c OUT number
) as
begin
    if p_a > p_b then
    p_c := p_a;
 else
    p_c := p_b;
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

drop procedure find_max;

create or replace function find_max (
p_a IN number,
p_b IN number
) return number as
-- no variables in this case
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


-- my_nvl (a, b) return a when a is not null, otherwise b

create or replace function my_nvl (
p_a IN number,
p_b In number
) return number as

begin
if p_a is null then
return p_b;
else 
return p_a;
end if;

end;
/

declare
    a number;
    b number;
   
 begin 
    a := null;
    b := 42;
    
    dbms_output.put_line('Result is ' || my_nvl(a, b));
end;
/

declare
    a number;
    b number;
   
 begin 
    a := 9;
    b := 42;
    
    dbms_output.put_line('Result is ' || my_nvl(a, b));
end;
/

select he.employee_id, my_nvl(he.commission_pct, 0) --funzionamento della nvl originale 
from hr.employees he;

create or replace function circle_area(
p_radius IN number)
return number as
begin 
return(p_radius * p_radius * 3.14);

end;
/
 select circle_area(4)
 from dual;
 
 -- procedure increase_salary_for_coders()
 -- low, high: interval coders id to increase salary
 -- increase: how much to increase salaries
 
create or replace procedure increase_salary_for_coders (
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

call increase_salary_for_coders (103, 105, 200);