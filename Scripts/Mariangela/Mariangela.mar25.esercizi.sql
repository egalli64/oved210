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
	