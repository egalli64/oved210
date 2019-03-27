--DDL
--Create, Truncate, Drop, Alter

--create table

create table coders as 
	select employee_id as coder_id, first_name, last_name, hire_date, salary
	from hr.employees
	where department_id = 60;


create table simple (
	simple_id number(6,0) primary key,
	status char,
	name varchar2(20),
	coder_id number);



--alter table
--I've forgotten about it!
alter table simple
add counter number(38,0);
	
select table_name
from user_tables;

select*
from simple;

alter table simple
add constraint simple_status_ck check(status in ('A', 'B', 'X'));


alter table simple
drop column counter;


alter table simple
add constraint simple_id_ck check(mod(simple_id, 2) = 1 ); 


alter table simple
modify name constraint simple_name_nn not null;


insert into simple(simple_id, status, name, coder_id) 
values(11, 'z', 'bad status', 1);


insert into simple(simple_id, status, name, coder_id) 
values(2, 'A', 'even id', 1);


insert into simple(simple_id, status, name, coder_id) 
values(3, 'A', NULL, 1);


alter table simple
drop constraint simple_name_nn;


alter table coders
add constraint coders_pk primary key(coder_id);


alter table simple
drop column coder_id;


alter table simple
add constraint simple_coder_id_fk
coder_id references coders (coder_id);

alter table simple
add constraint simple_coder_id_fk
coder_id references coders (coder_id) on delete cascade;

alter table simple
add constraint simple_coder_id_fk
coder_id references coders (coder_id) on delete set null;


-- warning! working on all rows!
update simple
set coder_id = 10;


--add to coders
--id: 12, hire_date:today, salary: 4000

--aggiungi Mario Rossi
insert into coders(coder_id, first_name, last_name, hire_date, salary)
values(10, 'Mario', 'Rossi', sysdate, 4000);


select*
from coders;

select*
from simple;


delete from simple
where simple_id = 11;

commit;

insert into simple
values(1, 'A', 'first', 103);

insert into simple
values(3, 'A', 'second', 105);

insert into simple
values(5, 'A', 'missing', 42);


delete from coders
where coder_id = 10;


--duplicated values
insert into simple
values(5, 'A', 'second', 105);

delete from simple
where simple_id = 5;

alter table simple
add constraint simple_name unique(name);


alter table coders
add constraint coders_name unique(first_name, last_name);

--this should fail
insert into coders 
values(212, 'Valli','Pataballa', sysdate, 4000);

delete from coders
where coder_id = 212;


select*
from user_constraints
where table_name = 'SIMPLE';

--elimina tabella simple
drop table simple;





---create new table infos
create table infos (
	info_id number(6,0)
		constraint infos_pk primary key
		constraint infos_id_ck check(mod(info_id, 2) = 1 ), 
	status char default 'A'
		constraint infos_status_ck check(status in ('A', 'B', 'X')),
	name varchar2(20)
		constraint infos_name_uq unique,
	coder_id number
		constraint infos_coder_id_fk
		references coders(coder_id) on delete cascade
	);

insert into coders(coder_id, first_name, last_name, hire_date, salary)
values(10, 'Mario', 'Rossi', sysdate, 4000);


insert into infos
values(1,'A', 'first', 10);

insert into infos
values(3, default, 'second', 10);

insert into infos(info_id, name, coder_id)
values(5, 'third', 10);

delete from coders
where coder_id = 10;

rename infos to my_statues;

comment on table my_statues is 'Some extra information on coders';

comment on column my_statues.status is 'Status in the statues';


truncate table my statues;

drop table my statues;



--sequence
create sequence my_seq;

select* from user_sequences;


select my_seq.nextval
from dual;

alter sequence my_seq increment by 2;

drop sequence my_seq;

create sequence my_seq
start with 201 increment by 2;

insert into my_statues
values(my_seq.nextval, default,'Tom', 103);

insert into my_statues
values(my_seq.nextval, default,'Bill', 105);


--view
create or replace view restricted_coders as 
	select coder_id, first_name, last_name
	from coders
	with read only;

select*
from restricted_coders;



--Esercizi
--create table my_employee
create table my_employee(
	id number(4) constraint my_employee_pk primary key,
	last_name varchar2(25),
	first_name varchar2(25),
	userid varchar(8),
	salary number(9,2));

insert into my_employee
values(1, 'Patel', 'Ralph', 'rpatel', 895);

insert into my_employee (id, last_name, first_name, userid, salary )
values(2, 'Dancs', 'Betty', 'bdancs', 860 );

insert into my_employee 
values(3, 'Biri', 'Ben', 'bbiri', 1100);

insert into my_employee
values(4, 'Newman', 'Chad' , 'cnewman', 750);

insert into my_employee
values(5, 'Ropeburn', 'Audrey', 'aropebur', 1550);

update my_employee
set last_name = 'Drexel'
where id = 3;

update my_employee
set salary = 1000
where salary < 900;

delete from my_employee
where first_name = 'Betty' and last_name = 'Dancs';

commit;

delete from my_employee;

rollback;




---create table dept
create table dept(
	id number (7) constraint dept_pk primary key,
	name varchar2 (25));

alter table emp 
add commission number (2,2);


alter table emp 
modify last_name varchar2(50);


alter table emp
drop (last_name);



--tentative marking of column as unused
alter table emp set unused(dept_id);

--when safe, drop them
alter table emp drop unused column;



--CONTINUA ESERCIZI (26 MARZO)

--create table employees
create table employees as
	select employee_id as id, first_name, last_name, salary, department_id as dept_id
	from hr.employees;

alter table employees read only;

delete from employees;

truncate table employees;

update employees
set first_name = 'Tom'
where id = 100;

--tutti i tentativi di modificare la mia tabella sono falliti perchè la tabella è read only!!

alter table employees read write;

update employees
set first_name = 'Tom'
where id = 100;

select*
from employees 
where id = 100;

truncate table employees;

select count(rowid) from employees;

drop table dept;
drop table emp;
drop table employees;
drop table coders;
drop table my_employee;
drop table my_statues;





	
	
	

