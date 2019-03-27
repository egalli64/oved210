--procedura x aumentare il salario di un dollaro in più di 107

create or replace procedure increase_diana_salary
as
begin 
        update coders
        set salary = salary + 1
        where coder_id = 107;
        commit;
    
end increase_diana_salary;
/


begin
increase_diana_salary;
end;

call increase_diana_salary ();


drop procedure increase_diana_salary;

create or replace procedure increase_coder_salary (
p_coder_id in coders.coder_id%type
)as 

begin 
    update coders
    set salary = salary + 1
    where coder_id = p_coder_id;
    commit;
    
end;
/


drop procedure increase_coder_salary;

begin
increase_coder_salary(105);
end;

