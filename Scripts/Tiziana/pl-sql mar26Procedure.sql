--pl/sql procedure, functions, trigger

--procedure
create or replace procedure update_coder_salary(
    p_coder_id in coders.coder_id%type,
    p_factor in number
) as 
    v_count integer; 
begin
    select count(rowid)      --conto il numero di righe
    into v_count
    from coders
    where coder_id = p_coder_id;
    
    if v_count = 1 then                    
        update coders
        set salary = salary + (salary * p_factor)
        where coder_id = p_coder_id;
        commit; 
    end if;
exception
    when others then
        rollback;

end update_coder_salary;
/

--test1
call update_coder_salary(103, 1);

--altro test
call update_coder_salary(p_coder_id => 104, p_factor => 1.5);


--test2
begin 
    update_coder_salary(105, 3);
end;
/



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

--test
call increase_diana_salary(107);

--altro test
begin 
    increase_diana_salary_107();
end;








    