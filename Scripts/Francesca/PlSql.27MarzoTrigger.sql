--trigger

create table coder_salaries(
  coder_id number(6,0),
  old_salary number(8,2),
  new_salary number(8,2)
);

create or replace trigger coder_salary_update
before update of salary on coders  --before,cio� deve chiamarlo prima di fare l'update
for each row 
begin
  insert into coder_salaries values(
    :old.coder_id, :old.salary, :new.salary);
end coder_salary_update;
/

update coders
set salary = salary + 100;