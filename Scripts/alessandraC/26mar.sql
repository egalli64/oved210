create table employees2 as 
	select employee_id as id,
			first_name,
			last_name,
			salary,
			department_id as dept_id
	from hr.employees;
	

alter table employees2 read only

alter table employees2 read write



update employees2
set first_name = 'Tom'
where id = 100

select * from employees where id = 100

truncate table employees2

