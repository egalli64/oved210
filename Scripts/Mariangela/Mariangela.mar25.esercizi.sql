--- ESERCIZI

create table my_employee (
	id number (4) 
	constraint my_employee_pk primary key,
	last_name varchar2(25),
	first_name varchar2(25),
	userid varchar2(8),
	salary number (9,2)
	
);

-- drop table my_employee;

insert into my_employee
values(1, 'Patel', 'Ralph', 'rpatel', 895);

insert into my_employee (id, last_name, first_name, userid, salary)
values(2, 'Dancs', 'Betty', 'bdancs', 860);

insert into my_employee
values(3, 'Biri', 'Ben', 'bbiri', 1100);

insert into my_employee
values(4, 'Newman', 'Chad', 'cnewman', 750);

insert into my_employee
values(5, 'Ropeburn', 'Audrey', 'aropebur', 1550);

update my_employee
set last_name = 'Drexel'
where id = 3;

update my_employee
set salary = 1000
where salary < 900;

delete from my_employee
where last_name = 'Dancs' and first_name = 'Betty';

commit;

delete from my_employee;

rollback;


----
create table dept (
	id number (7) 
		constraint dept_pk primary key,
	name varchar2(25)
);

create table emp (
	id number (7) constraint emp_pk primary key,
	last_name varchar2(25),
	first_name varchar2(25),
	dept_id number(7) 
	constraint emp_dep_id_fk references dept(id)
	);

alter table emp
add commission number (2,2);

alter table emp modify (
last_name varchar2(50)
);

alter table emp set unused(dept_id); -- quando non voglio eliminare la colonna ma indico che non viene usata 

alter table emp drop unused column; -- per cancellarla in un secondo momento 

select*
from ALL_TAB_COLUMNS
where table_name = 'EMP'

create table employees as
	select employee_id as id,
		first_name, 
		last_name, 
		salary, 
		department_id as dept_id
	from hr.employees;

-- drop table employees;

alter table employees read only;

delete from employees;

alter table employees read write;

update employees
set first_name = 'Tom'
where id = 100;

select * 
from employees
where id = 100;

truncate table employees;

select count(round) from employees;

drop table dept;
drop table emp;
drop table employees;
drop table coders;
drop table my_employee;
drop table my_statuses;
