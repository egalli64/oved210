--pl/sql procedure, function, trigger

create or replace procedure update_coder_salary (
    p_coder_id in coders.coder_id%type,
    p_factor in number 
) as 
    v_count integer;
    
begin
    select count (rowid) 
    into v_count
    from coders
    where coder_id = p_coder_id; --conto il n di righe che hanno x coder id quello passato dal chiamante
    
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


call update_coder_salary(103, 1);

call update_coder_salary(p_coder_id => 104, p_factor => 1.5);

begin
update_coder_salary(105, 3);
end;
/

drop procedure update_coder_salary;


