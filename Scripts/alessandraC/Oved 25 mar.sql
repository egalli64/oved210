--create table

create table coders as 
	select employee_id as coder_id, first_name, last_name, hire_date, salary
	from hr.employees
	where department_id = 60

create table simple(
	simple_id number (6, 0) primary key,
	status char,
	name varchar2(20),
	coder_id number
);

--I've forgotten about it!
alter table simple
add counter number(38, 0)


--on second thought, we don't need it!
alter table simple
drop column counter

select table_name
from user_tables

select *
from simple

alter table simple
add constraint simple_status_ck check(status in ('A', 'B', 'X'))

-- alter table simple
-- drop constraint simple_status_ck

alter table simple
add constraint simple_id_ck check(mod (simple_id, 2) = 1)

--x evitare che le regioni contengano valori nulli
alter table simple
modify name constraint simple_name_nn not null

insert into simple(simple_id, status, name, coder_id)
values (11, 'Z', 'bad status', 1);


insert into simple(simple_id, status, name, coder_id)
values (2, 'A', 'even id', 1);

insert into simple
values(3, 'A', null, 1)

alter table simple
drop constraint simple_name_nn

--mi creo una primary key nella tabella coders
alter table coders
add constraint coders_pk primary key(coder_id)


alter table simple
drop column coder_id


--add to coders
--id: 12, hire_date: today, salary: 4000

insert into coders
values (12, 'Mike', 'Steel', sysdate, 4000)

select *
from coders


insert into simple
values(1, 'A', 'first', 103)

delete from simple
where simple_id = 3

delete from simple
where simple_id = 11

insert into simple
values(3, 'A', 'second', 105)

insert into simple
values(5, 'A', 'missing', 42)

delete from coders
where coder_id = 12

select *
from simple

--delete

alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id)

alter table simple
drop column coder_id


alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id) on delete cascade

alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id) on delete set null


--warning! working on all rows!
update simple
set coder_id = 12


--duplicated values
insert into simple
values(5, 'A', 'second', 105)

delete from simple
where simple_id = 5

alter table coders
add constraint simple_name_uq unique(name)


alter table coders
add constraint coders_name_uq unique(first_name, last_name)

-- this should fail
insert into coders
values (212, 'Valli', 'Pataballa', sysdate, 4000)


select *
from user_constraints
where table_name = 'simple'


drop table simple


drop table infos


create table infos (
	info_id number (6, 0)
		constraint infos_pk primary key
		constraint infos_id_ck check(mod(info_id, 2) = 1),
	status char default 'A'
		constraint infos_status_ck check(status in ('A', 'B', 'X')),
	name varchar2(20)
	constraint infos_name_uq unique, 
	coder_id number
		constraint infos_coder_id_fk
		references coders(coder_id) on delete cascade
)


insert into infos
values (1, 'A', 'first', 12);

insert into infos
values(3, default, 'second', 12)

insert into infos(info_id, name, coder_id)
values(5, 'third', 12)


delete from coders
where coder_id = 12


--rename table

rename infos to my_statues

--comments
comment on table my_statues is 'Some extra information on coders'


comment on column my_statues.status is 'Status is the statues'


truncate table my_statues


drop table my_statues


--sequence

create sequence my_seq


select * from user_sequences

select my_seq.nextval
from dual

alter sequence my_seq increment by 2

drop my_seq


create sequence my_seq
start with 201 increment by 2

insert into infos
values (my_seq.nextval, default, 'Tom', 103)

insert into infos
values(my_seq.nextval, default, 'Bill', 105)


--view

create or replace view restricted_coders as
	select coder_id, first_name, last_name
	from coders
	with read only
	
	
	select *
	from restricted_coders
	
	update restricted_coders
	set first_name = 'Tom'
	where coder_id = 103
	
	
--exercise
create table my_employees(
	id number(4) constraint employees_pk primary key,
	last_name varchar(25),
	first_name varchar(25),
	user_id varchar(8),
	salary number(9, 2)
)

drop table employees;

insert into my_employees
values (1, 'Patel', 'Ralph', 'rpatel', 895)

insert into my_employees(id, last_name, first_name, user_id, salary)
values (2, 'Dancs', 'Betty', 'bdancs', 860)

insert into my_employees(id, last_name, first_name, user_id, salary)
values(3, 'Biri', 'Ben', 'bbiri', 1100)
	
insert into my_employees(id, last_name, first_name, user_id, salary)
values(4, 'Newman', 'Chad', 'cnewman', 750)

insert into my_employees(id, last_name, first_name, user_id, salary)
values(5, 'Ropeburn', 'Audrey', 'aropebur', 1550)


update my_employees
set last_name = 'Drexel'
where id = 3;


update my_employees
set salary = 1000
where salary < 900
	

--delete Betty Dancs
delete from my_employees
where last_name = 'Dancs' and first_name = 'Betty'

commit

delete from my_employees

rollback

--create new table

create table dept (
id number (7) constraint dept_pk primary key,
	name varchar2(25)
);


create table emp (
	id number (7) constraint emp_pk primary key,
	last_name varchar(25),
	first_name varchar(25),
	dept_id number(7) constraint emp_dept_id_fk references dept(id)

)

alter table emp add (
 commission number (2, 2)
 )


alter table emp modify (
last_name varchar2(50)
)


--eliminazione colonna
alter table emp drop (
first_name)
)

--tentative marking of column as unused
--dept_id non è utilizzata
alter table emp set unused (dept_id)

--when safe, drop them
alter table emp drop unused columns;

select *
from all_table_column
where table_name = 'EMP' and column_name = 'DEPT_ID'



	
	