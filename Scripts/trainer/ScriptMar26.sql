-- 2.8

drop table employees;

create table employees as
	select employee_id as id,
		   first_name,
		   last_name, 
		   salary,
		   department_id as dept_id
	from hr.employees;

-- 2.9
alter table employees read only;

-- 2.10
delete from employees;

truncate table employees;

update employees
set first_name = 'Tom'
where id = 100;

-- 2.11
alter table employees read write;

update employees
set first_name = 'Tom'
where id = 100;

select * from employees where id = 100;

truncate table employees;

select count(rowid) from employees;

-- 2.12
drop table dept;
drop table emp;
drop table employees;
drop table infos;
drop table coders;
