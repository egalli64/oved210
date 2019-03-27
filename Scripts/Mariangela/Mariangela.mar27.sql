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