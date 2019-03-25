-- 1.

create table employees(
	id number(4) constraint employees_pk primary key,
	last_name varchar(25),
	first_name varchar(25),
	userid varchar(8),
	salary number(9, 2)
);

-- drop table employees;

-- 2.
insert into employees
values(1, 'Patel', 'Ralph', 'rpatel', 895);


-- 3.
insert into employees
	(id, last_name, first_name, userid, salary)
values(2, 'Dancs', 'Betty', 'bdancs', 860);

-- 5.
insert into employees
values(3, 'Biri', 'Ben', 'bbiri', 1100);

insert into employees
values(4, 'Newman', 'Chad', 'cnewman', 750);

insert into employees
values(5, 'Ropeburn', 'Audrey', 'aropebur', 1550);

-- 8. 3 last name -> Drexel
update employees
set last_name = 'Drexel'
where id = 3;

-- 9. salary = 1000 for each having salary < 900
update employees
set salary = 1000
where salary < 900;

-- 11. delete Betty Dancs
delete from employees
where last_name = 'Dancs' and first_name = 'Betty';