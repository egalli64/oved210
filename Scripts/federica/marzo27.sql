--PL/SQL
--procedure increase salary coder 107
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

--test for procedure
call increase_salary();

begin
increase_salary();
end;

/

--procedure increase salary su tutti gli id
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

--test for procedure
call increase_salary_coder(106);

--procedure con un parametro in INPUT e due parametri di OUPUT
create or replace procedure get_coder_name(
p_coder_id in coders.coder_id%type,
p_first_name out coders.first_name%type,
p_last_name out coders.last_name%type)
as

begin
select first_name, last_name
into p_first_name, p_last_name
from coders
where coder_id = p_coder_id;

end;
/
--testare la procedure
declare
v_first_name coders.first_name%type;
v_last_name coders.last_name%type;

begin
get_coder_name(107, v_first_name, v_last_name);

dbms_output.put_line('Coder 107 is ' || v_first_name || ' ' || v_last_name);

end;
/

--funzione find max(input a,b, output max): dare il maggior valore tra a e b
--find max (3,12) --> max = 12.
create or replace function find_max(
p_a in number,
p_b in number)
return number as

begin
if p_a > p_b then
return p_a;

else
return p_b;
end if;
end;

/
--test procedura
declare
a number;
b number;

begin 
a := 18;
b := 42;

dbms_output.put_line('Max is ' || find_max(a,b));

end;
/

--alternativa
select find_max(12,42)
from dual;

--funzione NVL: my_nvl(a,b) return 'a' when a is not null, otherwise b
create or replace function my_nvl (
p_a in number,
p_b in number)
return number as 

begin 
if p_a is not null then
return p_a;

else
return p_b;

end if;
end;
/

--test della funzione
--primo test: a = null, b = 6
declare
a number;
b number;

begin
a := null;
b := 6;

dbms_output.put_line('Result is ' || my_nvl(a,b));

end;
/
--secondo test: a = 9 e b = 6
declare
a number;
b number;

begin
a := 9;
b := 6;

dbms_output.put_line('Result is ' || my_nvl(a,b));

end;

--alternativa test
select my_nvl(null,42), my_numeric_nvl(12,42)
from dual;

--applicato alla tabella intera
select hr.employee_id, my_nvl(he.commission_pct, 0)
from hr.employees he;

--Esercizio: scrivere la funzione circle_area(p_redius numeric)--> return circle area
create or replace function circle_area (
p_radius in number)
return number as

begin
return (p_radius * p_radius * 3.14);

end;
/

--test funzione
select circle_area(6)
from dual;

--procedure increase_salary_for_coders()
--low, high: interval coders id to increase salary
--increase: how much to increase salaries
create or replace procedure increase_salary_for_coders(
p_low in coders.coder_id%type,
p_high in coders.coder_id%type,
p_increase in coders.salary%type)
as  

v_coder_id coders.coder_id%type;

cursor v_coder_cursor is
  select coder_id
  from coders
  where coder_id between p_low and p_high;

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

end;
/
call increase_salary_for_coders(103, 106,10);