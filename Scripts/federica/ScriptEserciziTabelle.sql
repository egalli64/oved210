--ESERCIZI
create table my_employee (
id number(4) 
constraint my_employee_pk primary key,
last_name varchar2(25),
first_name varchar2(25),
userid varchar2(8),
salary number(9,2)
);

drop table my_employee;

--Esercizio 2
insert into my_employee
values(1, 'Patel', 'Ralph', 'rpatel', 895);

--Esercizio 3:
insert into my_employee (id, last_name, first_name, userid, salary)
values(2, 'Dancs', 'Betty', 'bdancs', 860);

insert into my_employee (id, last_name, first_name, userid, salary)
values(3, 'Biri', 'Ben', 'bbbri', 1100);

insert into my_employee (id, last_name, first_name, userid, salary)
values(4, 'Newman', 'Chad', 'cnewman', 750);

insert into my_employee (id, last_name, first_name, userid, salary)
values(5, 'Ropeburn', 'Audrey', 'aropebur', 1550);

--Esercizio 4:
update my_employee
set last_name = 'Drexel'
where id = 3;

update my_employee
set salary = 1000
where salary < 900;

--Esercizio 5:
delete from my_employee
where last_name = 'Dancs' and first_name = 'Betty';

commit;

--Esercizio 6: cancellare tutte le righe della tabella
delete from my_employee;

rollback;

--Esercizio:
create table dept ( 
id number(7)
constraint dept_pk primary key,
name varchar2(25)
);

--Esercizio:
create table emp (
id number(7) constraint emp_pk primary key,
last_name varchar2(25),
first_name varchar2(25),
dept_id number(7) 
   constraint emp_dept_id_fk references dept(id)
);

alter table emp
add commission number(2,2);

alter table emp modify(
last_name varchar2(50)
);

alter table emp drop(first_name);

alter table emp set unused(dept_id);--non elimina la colonna ma indica che non è usata

alter table emp drop unused columns;--elimina la colonna non usata

--Esercizio:
--con il comando 'create' creo una tabella vuota
create table employees (
id number(6),
first_name varchar2(20),
last_name varchar2(25) constraint employees_pk primary key,
salary number(8,2),
dept_id number(4)
);

drop table employees;

--con il comando 'select' creo una tabella che mi prende i dati da una esistente
create table employees as 
select employee_id as id,
first_name, 
last_name, 
salary, 
department_id as dept_id
from hr.employees;

alter table employees read only;

--eliminare le righe dalla tabella
delete from employees;--non lo fa perchè è read only

alter table employees read write;

update employees
set first_name = 'Tom'
where id = 100;

select *
from employees
where id = 100;

truncate table employees;--tabella vuota

select count(round) from employees;--non me lo esegue perchè è vuota

drop table employees;
drop table dept;
drop table emp;
drop table coders;
drop table my_employee;
drop table my_statuses;





