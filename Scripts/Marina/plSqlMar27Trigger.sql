--trigger

create table coder_salaries (
    coder_id number (6,0) constraint coder_salaries_fk references coders(coder_id),
    old_salary number (8, 2),
    new_salary number (8, 2)
);

create or replace trigger coder_salary_update
before update of salary on coders
for each row
begin
    insert into coder_salaries values(
        :old.coder_id,-- marker per dire che sto facendo cambiamento sulla tabella (: old = accedimi al valore vecchio)
        :old.salary,
        :new.salary);
        
end coder_salary_update;
/

update coders
set salary = salary + 100;
