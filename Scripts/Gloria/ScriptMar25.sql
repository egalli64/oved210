--CREATE TABLE 

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

--I've forgotten about it!
alter table simple
add counter number (38, 0);

alter table simple
drop column counter; 

select table_name
from user_tables;

select * 
from simple;

alter table simple
add constraint simple_status_ck check (status in ('A', 'B', 'X'));

--i simple id devono essere tutti dispari
alter table simple
add constraint simple_id_ck check(mod(simple_id, 2) = 1);

alter table simple
modify name constraint simple_name_nn not null;

insert into simple(simple_id, status, name, coder_id)
values(11, 'Z', 'bad status', 1);

insert into simple(simple_id, status, name, coder_id)
values(2, 'A', 'even id', 1);

insert into simple
values(3, 'A', null, 1);

alter table simple
drop constraint simple_name_nn;

alter table coders
add constraint coders_pk primary key(coder_id);

alter table simple
drop column coder_id;

alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id);

--add to coder
--id: 12, hire_date: today, salary: 4000, first and lasta name
insert into coders
values(12, 'Tom', 'Jones', sysdate, 4000);

select *
from coders;

insert into simple
values(1, 'A', 'first', 103);

select * 
from simple;

delete from simple
where simple_id = 3;

insert into simple
values(3, 'A', 'second', 105);

insert into simple
values(5, 'A', 'missing', 42);

delete from coders
where coder_id = 12;

alter table simple
drop column coder_id;

alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id) on delete cascade;

alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id) on delete set null;

--warning! working on all rows!
update simple
set coder_id = 12;

--add to coders

--duplicated values
insert into simple 
where simple_id = 5;

delete from simple
where simple_id = 5;

alter table simple
add constraint simple_name_uq unique(name);

alter table codersadd constraint coders_name_uq unique(first_name, last_name);

-- this should fail
insert into coders
values(212, 'Valli', 'Pataballa', sysdate, 4000);

select table *
from user_constraints
where table_name = 'SIMPLE';
--eliminare tabelle
drop table simple;

create table infos (
  infos_id number(6, 0)
     constraint infos_pk primary key
     constraint infos_id_ck check(mod(infos_id, 2) = 1),
  status char default 'A'
     constraint infos_status_ck check(status in('A', 'B', 'X')),
  name varchar2(20)
     constraint infos_name_uq unique,
  coder_id number
     constraint infos_coder_id_fk
     references coders(coder_id) on delete cascade
);

--drop table infos;

insert into infos 
values(1, 'A' , 'first', 12);

insert into infos 
values(3, default, 'second', 12);

insert into infos(info_id, name, coder_id)
values (5, 'third', 12);

delete from coders
--where coder_id = 12;

--rename 
rename infos to my_statues;

--comments
comment on table my_statues is 'Some extra information on coders';

comment on column my_statues.status is 'Status is the statues';

--!!!
truncate table my_statues;

drop table my_statues;

--sequence
--grant create sequence to oved;
create sequence my_seq;

select * 
from user_sequences;

select my_seq.nextval
from dual;

alter sequence my_seq increment by 2;

drop sequence my_seq;

create sequence my_seq;
start with 201 increment by 2;

insert into infos
values(my_seq.nextval, default, 'Tom', 103);

insert into infos
values(my_seq.nextval, default, 'Bill', 105);

--grant create view oved;
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


--ESERCIZI:

--1) 
create table employee(
 id number (4) constraint employees_pk primary key,
 last_name varchar2 (25),
 first_name varchar2 (25),
 userid varchar2 (8),
 salary number (9, 2)
);

drop table employee;

insert into employee
values(1, 'Patel', 'Ralph', 'rpatel', 895);

insert into employee 
   (id, last_name, first_name, userid, salary)
values(2, 'Dancs', 'Betty', 'bdancs', 860);

insert into employee 
   (id, last_name, first_name, userid, salary)
values(3, 'Biri', 'Ben', 'bbiri', 1100);

insert into employee
  (id, last_name, first_name, userid, salary)
values(6, 'Newman', 'Chad', 'cnewman', 850);

insert into employee
   (id, last_name, first_name, userid, salary)
values(5, 'Ropeburn', 'Audrey', 'aropebur', 1550);

--last_name --> drexel
update employee
set last_name = 'Drexel'
where id = 3;

--salary = 1000 for each having salary < 900
update employee
set salary = 1000
where salary < 900;

--delete betty dancs
delete from employee
where last_name = 'Dancs' and first_name = 'Betty';

-- 
commit;

--elimino tutte le righe che ci sono nella tabella
delete from employee;

--rollback
rollback;

--ESERCIZIO

--2)
drop table dept;

create table dept (
   id number (7) constraint dept_pk primary key,
   name varchar2 (25)
);

-- alter table dept
-- modify id constraint dept_id_nn not null; 

--3)
drop table emp;

create table emp (
   id number (7) constraint emp_pk primary key,
   first_name varchar2 (25),
   last_name varchar2 (25),
   dept_id number(7) 
     constraint emp_dept_id_fk references dept(id) on delete cascade
);


alter table emp
   add commission number (2, 2);

alter table emp modify(
   last_name varchar2(50)        
);

--tentative marking of column as unused 
alter table emp set unused (dept_id);
--when safe, drop them 
alter table emp drop unused columns;


--ESERCIZIO
--4)
create table employees2 as 
 select employee_id as id,
        first_name,
        last_name,
        salary,
        department_id as dept_id
 from hr.employees;
 
alter table employees2 read only;

delete from employees2;

truncate table employees2;

update employees2
set first_name = 'Tom'
where id = 100;

select * from employees2 where id = 100;

truncate table employees2;

select count(rowid)from employees2;


--5)
drop table dept;
drop table emp;
drop table employees2;
drop table infos;
drop table coders;