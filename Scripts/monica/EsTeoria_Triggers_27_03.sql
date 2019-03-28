-- triggers

create table coder_salaries (
     coder_id number (6,0),
     old_salary number (8,2),
     new_salary number (8,2)
);
     
create or replace trigger coder_salary_update   -- nome del trigger
before update of salary on coders      -- devo descrivere l'evento per cu viene chiamato, in questo caso

for each row      -- per ogni riga modificata dall update
begin
    insert into coder_salaries values(
    :old.coder_id, :old.salary, :new.salary);
    
end coder_salary_update;
/

update coders
set salary = salary +100;