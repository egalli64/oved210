-- create table


create table coders as
	select employee_id as coder_id, first_name, last_name, hire_date, salary
	from hr.employees
	where department_id = 60;
	
create table infos (
	info_id number (6, 0) 
		constraint infos_pk primary key
		constraint infos_id_ck check (mod(info_id, 2) = 1), 
	status char default 'A'
		constraint infos_status_ck check (status in ('A', 'B', 'X')),
	name varchar2(20)
		constraint infos_name_uq unique,
	coder_id number
		constraint infos_coder_id_fk
		references coders (coder_id) on delete cascade
);

drop table infos;


select table_name
from user_tables;

select *
from simple;

alter table simple
add counter number (38,0);

alter table simple
add constraint simple_status_ck check (status in ('A', 'B', 'X'));

alter table simple
drop column counter;

alter table simple
add constraint simple_id_ck check (mod(simple_id, 2) = 1);


alter table simple
modify name constraint simple_name_nn not null;

insert into simple (simple_id, status, name, coder_id)
values (11, 'A', 'bad status', 1);

insert into simple (simple_id, status, name, coder_id)
values (11, 'A', 'even id', 1);

insert into simple
values (3, 'A', NULL, 1);

alter table simple
drop constraint simple_name_nn;

alter table coders
add constraint coders_pk primary key (coder_id);

alter table simple
drop column coder_id;

alter table simple
add constraint simple_coder_id_fk
coder_id references coders (coder_id) on delete set null;

alter table simple
drop column coder_id;

alter table simple
add constraint simple_coder_id_fk
coder_id references coders (coder_id) on delete cascade;


update simple
set coder_id = 12;

-- add to coders 
-- id: 12, hire_date: today, salary: 4000;

insert into coders (coder_id, first_name, last_name, hire_date, salary)
values (12, 'Pinco', 'Pallino', sysdate, 4000);

select *
from coders;

insert into infos
values (1, 'A', 'first', 12);

select *
from simple;

delete from simple
where simple_id = 3;

delete from simple
where simple_id = 11;

commit;

insert into infos
values (3, default , 'second', 12);


insert into simple
values (5, 'A', 'missing', 42);

delete from coders
where coder_id = 12;


insert into coders (coder_id, first_name, last_name, hire_date, salary)
values (12, 'Pinco', 'Pallino', sysdate, 4000)

insert into simple
values (3, 'A', 'second', 105);


insert into simple
values (5, 'A', 'missing', 42);

insert into infos (info_id, name, coder_id)
values (5, 'third', 12);

delete from simple
where simple_id = 5;

alter table simple
add constraint simple_name_uq unique(name);

delete from coders
where coder_id = 12;

rename infos to my_status;

comment on table my_status is 'Some extra information on coders';

comment on column my_status.status is 'Status in my statuses';


truncar
alter table coders
add constraint coders_name_uq unique(first_name, last_name);

drop table simple;

create sequence my_seq;

select * from user_sequences;

select my_seq.nextval
from dual;

drop sequence my_seq;

create sequence my_seq
start with 201 increment by 2;

insert into my_status
values (my_seq.nextval, default, 'Bill', 105);

create or replace view restricted_coders as 
	select coder_id, first_name, last_name
	from coders
	with read only;
	
select *
from restricted_coders;

drop view restricted_coders;

	
create table my_employee (
	id number (4) constraint employees_pk primary key,
	last_name varchar2 (25),
	first_name varchar2 (25),
	userid varchar2 (8),
	salary number (9 , 2)
);

insert into my_employee
values (1, 'Patel', 'Ralph', 'rpatel', 895);

insert into my_employee (id, last_name, first_name, userid, salary)
values (2, 'Dancs', 'Betty', 'bdancs', 860);

insert into my_employee (id, last_name, first_name, userid, salary)
values (3, 'Biri', 'Ben', 'bbiri', 1100);

insert into my_employee (id, last_name, first_name, userid, salary)
values (4, 'Newman', 'Chad', 'cnewman', 750);

insert into my_employee (id, last_name, first_name, userid, salary)
values (5, 'Roseburn', 'Audrey', 'aropebur', 1550);

update my_employee
set last_name = 'Drexel'
where id = 3;

update my_employee
set salary = 1000
where salary < 900;

delete from my_employee
where last_name= 'Dancs' and first_name = 'Betty';

commit;

delete from my_employee;

rollback;

create table dept (
	id number (7) constraint dept_pk primary key,
	name varchar2 (25)
);

create table emp (
	id number (7) constraint emp_pk primary key,
	last_name varchar2 (25),
	first_name varchar2 (25),
	dept_id number(7) constraint emp_dept_id_fk 
		references dept(id)
);

drop table emp;

alter table emp
add commission number (2,2);

alter table emp modify last_name varchar2 (50);

