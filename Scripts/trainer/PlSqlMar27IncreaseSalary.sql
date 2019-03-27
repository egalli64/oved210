-- procedures:
--    increase_salary_coder_107()
--    increase_salary_coder()

create or replace procedure increase_salary_coder_107
as
begin
    update coders
    set salary = salary + 1
    where coder_id = 107;
    commit;
end;
/

create or replace procedure increase_salary_coder(
    p_coder_id IN coders.coder_id%type
)
as
begin
    update coders
    set salary = salary + 1
    where coder_id = p_coder_id;
    commit;
end;
/

-- test for procedure
begin
    increase_salary_coder_107();
end;
/

call increase_salary_coder_107();

call increase_salary_coder(106);

