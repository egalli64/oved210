--procedure increase_salary_coder_107

create procedure increase_diana_salary
as
begin      
    update coders
    set salary = salary + 1
    where coder_id = 107;
    commit;

end increase_diana_salary;
/

call increase_diana_salary(107);


begin 
    increase_diana_salary_107();
end;