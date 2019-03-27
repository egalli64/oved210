--pl/sql procedure, function, trigger

--creare una procedura per incrementare il salario di alcuni dipendenti
create procedure update_coder_salary(
    p_coder_id in coders.coder_id%type,
    p_factor in number
    ) as 
    v_count integer;
    begin
    select count(rowid)
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
    ROLLBACK;
        
    end update_coder_salary;
    
    call update_coder_salary(103,1);
    
    call update_coder_salary(p_coder_id => 104, p_factor => 1.5);
    
    begin
    update_coder_salary(105, 3);
    end;
 /
 
 --incremento di un dollaro per il salario per coder_id = 107
 
 create procedure update_salary as
 begin
 update coders
 set salary = salary + 1
 where coder_id = 107;
 commit;
 end update_salary;
 /
 call update_salary();

 --incremento salario di un dollaro con parametro coder_id
 create procedure update_salaries_forCoder(
 p_coder_id in coders.coder_id%type)
 as
 begin
 update coders
 set salary = salary + 1
 where coder_id = p_coder_id;
 end update_salaries_forCoder;
    
begin
update_salaries_forcoder(104);
end;
    