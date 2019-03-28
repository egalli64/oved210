-- procedure increase_salary_coder_107

create or replace procedure increase_salary_coder( 
    p_coder_id in coders.coder_id%type
)as
begin 
     update coders 
     set salary = salary + 1
     where coder_id = p_coder_id;
     commit;
end ;
/

-- test for procedure
call increase_salary_coder(107);
call increase_salary_coder(106);

  