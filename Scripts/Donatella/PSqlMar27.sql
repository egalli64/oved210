---increase_salary_coder107: aumentare di un dollaro il salario di Diana Lorentz sulla tabella coder:

create or replace procedure increase_salary_coder107
   as
   begin
         update coders
         set salary=salary +1
         where coder_id=107;
         commit;
end;
/
 
---test for procedure
begin 
 increase_salary_coder107();
end;

call increase_salary_coder107();
call increase_salary_coder107();

--increase call paramentro quale vuoi modificare ad esempio 106():
create or replace procedure increase_salary_coder(
p_coder_id in coders.coder_id%type
)

   as
   begin
         update coders
         set salary=salary +1
         where coder_id=p_coder_id;
         commit;
end;
/

call increase_salary_coder(106);

