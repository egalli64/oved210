-- procedure increase salary coder 107
set serveroutput on

create or replace procedure increase_coder_salary
as 
begin
   update coders
   set salary = salary + 1
   where coder_id = 107;
   commit;
end;
/

-- test
begin 
   increase_coder_salary();
end;
/

call increase_coder_salary();
 
------------------------------------------------------------------------------------------------------------------------------

-- aumento il salario senza specificare a chi, lo specifico poi nel test
create or replace procedure increase_coder_salary(
  p_coder_id in coders.coder_id%type
)as 
begin
   update coders
   set salary = salary + 1
   where coder_id = p_coder_id;
   commit;
end;
/

-- test
   call increase_coder_salary(105);