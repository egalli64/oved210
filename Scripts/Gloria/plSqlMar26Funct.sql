-- pl/sql procedure, function, trigger

-- connect as: sqlplus / as sysdba;
-- alter session set container = xepdb1;
-- grant create procedure to oved;
-- grant create trigger to oved;

create or replace procedure update_coder_salary(
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
   rollback;
   
   
end update_coder_salary;
/