-- create table

create table coders as
	select employee_id as coder_id,
			first_name,
			last_name,
			hire_date,
			salary
	from hr.employees
	where department_id = 60;

create table simple (
	simple_id number(6, 0) primary key,
	status char,
	name varchar2(20),
	coder_id number
);

-- I've forgotten about it!
alter table simple
add counter number(38, 0);

-- on secound thought, we don't need it
alter table simple
drop column counter;

select table_name
from user_tables;

select *
from simple;

alter table simple
add constraint simple_status_ck check(status in ('A', 'B', 'X'));

alter table simple
add constraint simple_id_ck check(mod(simple_id, 2) = 1);

alter table simple
modify name constraint simple_name_nn not null;

insert into simple(simple_id, status, name, coder_id)
values(11, 'Z', 'bad status', 1);

insert into simple(simple_id, status, name, coder_id)
values(2, 'A', 'even id', 1);

insert into simple
values(3, 'A', NULL, 1);

alter table simple
drop constraint simple_name_nn;

alter table coders
add constraint coders_pk primary key(coder_id);

alter table simple
drop column coder_id;

alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id);

alter table simple
drop column coder_id;

alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id) on delete cascade;

alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id) on delete set null;

-- warning! working on all rows!
update simple
set coder_id = 12;

-- add to coders
-- id: 12, hire_date: today, salary:4000
insert into coders
values(12, 'Tom', 'Jones', SYSDATE, 4000);

select *
from simple;

insert into simple
values(1, 'A', 'first', 103);

insert into simple
values(3, 'A', 'second', 105);

insert into simple
values(5, 'A', 'missing', 42);

delete from coders
where coder_id = 12;

-- duplicated values
insert into simple
values(5, 'A', 'second', 105);

delete from simple
where simple_id = 5;

alter table simple
add constraint simple_name_uq unique(name);

alter table coders
add constraint coders_name_uq unique(first_name, last_name);

-- this should fail
insert into coders
values(212, 'Valli', 'Pataballa', SYSDATE, 4000);

select *
from user_constraints
where table_name ='SIMPLE';

drop table simple;


create table infos (
	info_id number(6, 0)
		constraint infos_pk primary key
		constraint infos_id_ck check(mod(info_id, 2) = 1),
	status char default 'A'
		constraint infos_status_ck check(status in ('A', 'B', 'X')),
	name varchar2(20)
		constraint infos_name_uq unique,
	coder_id number
		constraint infos_coder_id_fk
		references coders(coder_id) on delete cascade
);

-- drop table infos;

insert into infos
values(1, 'A', 'first', 12);

insert into infos
values(3, default, 'second', 12);

insert into infos(info_id, name, coder_id)
values(5, 'third', 12);

delete from coders
where coder_id = 12;

-- rename
rename infos to my_statuses;

-- comments
comment on table my_statuses is 'Some extra information on coders';

comment on column my_statuses.status is 'Status in the statuses';

-- !!!
truncate table my_statuses;

drop table my_statuses;

-- sequence
-- grant create sequence to oved;

create sequence my_seq;

select * from user_sequences;

select my_seq.nextval
from dual;

alter sequence my_seq increment by 2;

drop sequence my_seq;

create sequence my_seq
start with 201 increment by 2;

insert into infos
values(my_seq.nextval, default, 'Tom', 103)

insert into infos
values(my_seq.nextval, default, 'Bill', 105)

-- grant create view to oved

create or replace view restricted_coders as
	select coder_id, first_name, last_name
	from coders
	with read only;

select *
from restricted_coders;

update restricted_coders
set first_name = 'Tom'
where coder_id = 103;

drop view restricted_coders;
