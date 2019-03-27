--trigger

create table coder_salaries (
    coder_id number(6, 0),
    old_salary number(8, 2),
    new_salary number(8, 2)
);

--creo un trigger(=coder_salary_update)
--voglio che venga chiamato quando c'è un update sulla tabella coders nel campo del salary


create or replace trigger coder_salary_update
before update of salary on coders
for each row 
begin
    insert into coder_salaries values(
        :old.coder_id, :old.salary, :new.salary);               --accedi alla versione vecchia della tabella
end coder_salary_update;
/


