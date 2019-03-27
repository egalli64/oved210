--create table

create table coders as

select employee_id as coder_id, first_name, last_name, hire_date, salary
from hr.employees
where department_id=60;

--creare tabelle da zero
 create table simple(
 simple_id number(6,0) primary key,
 status char,
 name varchar2(20),
 coder_id number
 );
 
--I've forgotten about it!
alter table simple
add counter number(38,0);
--rimovere colonna: 
alter table simple
drop column counter;

select table_name 
from user_tables;

select*
from simple;

alter table simple
add constraint simple_status_ck check(status in ('A','B','X'));

alter table simple 
add constraint simple_id_ck check(mod(simple_id,2)=1);

alter table simple 
modify name  constraint simple_id_nn not null;

insert into simple(simple_id, status, name, coder_id)
values(11,'Z','bad status',1);

insert into simple(simple_id, status, name, coder_id)
values(2,'A','even id ',1);

insert into simple
values(3,'A',NULL,1);

ALTER TABLE simple
DROP constraint SIMPLE_NAME_NN;

ALTER TABLE coders
ADD constraint CODER_PK PRIMARY KEY(CODER_ID);

alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id);

ALTER TABLE SIMPLE 
drop column coder_id;

alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id) on delete cascade;

alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id) on delete set null;

--warring! working  on all rows!
update simple
set coder_id=12;

--add to coders 
--id 12, hire date: to date, salary 4000;
insert into coders
values(12,'Tom','Jones',sysdate, 4000);

select*
from coders;


select*
from simple;

insert into simple
values(1,'A','first',103);

insert into simple
values(3,'A','second',105);

delete from coders
where coder_id=12;

--
insert into simple
values(5,'A','second',105);

delete from simple 
where simple_id=5;

alter table simple 
add constraint simple_name_uq unique(name);


alter table coders
add constraint coders_name_uq unique(first_name,last_name);

-- this should fail!
insert into coders
values(212,'Valli','Pataballa',sysdate, 4000);

select *
from user_constraints
where table_name='SIMPLE';

--elimanare una tabella

drop table simple;
--creazione di una tabella:

create table infos(
 info_id number(6,0)
 constraint infos_pk primary key
  constraint infos_id_ck check(mod(info_id,2)=1),
 status char default 'A'
  constraint infos_status_ck check(status in ('A','B','X')),
 name varchar2(20)
 constraint infos_name_uq unique,
 coder_id number
constraint infos_coder_id_fk
 references coders(coder_id) on delete cascade

 );

--drop table infos;
insert into coders
values(12,'Tom','Jones',sysdate, 4000);

insert into infos
values(1,'A','first',12);

insert into infos
values(3,default,'second',12);

insert into infos (info_id,name,coder_id)
values(5,'third',12);


delete from coders
where coder_id=12;

--remane
rename my_statues to my_statuses;

--comments tabella
comment on table my_statues is 'Some extrainformation on coders';
--comments colonna
comment on column my_statuses.status is 'Status in the statuses';

--!!!
truncate table my_statuses;

drop table my_statuses;

--sequence
--grant create sequence to oved;
create sequence my_seq;

select * from user_sequences;

select my_seq.nextval
from dual;

alter sequence my_seq increment by 2;

drop sequence my_seq;

create sequence my_seq
start with 201 increment by 2;

insert into infos
values(my_seq.nextval,default, 'Tom',103);

insert into infos
values(my_seq.nextval,default, 'Bill',105);

--
create or replace view restricted_coders as 
select coder_id,first_name, last_name
from coders
with read only;

select*
from restricted_coders;

update restricted_coders
set first_name='Tom'
where coder_id=103;

drop view restricted_coders;

--esercizi vari:
--1
create table employees(
id number(4) constraint employees_pk primary key,
last_name varchar(25),
first_name varchar(25),
userid varchar(8),
salary number(9,2)
);

---2

insert into employees
values(1,'Patel','Ralph','rpatel',895);

insert into employees
  (id,last_name,first_name,userid,salary)
  values(2,'Dancs','Betty','bdancs',860);
insert into employees
values(3,'Biri','Ben','bbiri',1100);
insert into employees
values(4,'Newman','Chad','cnewman',750);
insert into employees
values(5,'Ropeburn','Audrey','aropebur',1550);

--8.3 last_name -> Drexel

update employees
set last_name ='Drexel'
where id=3;

--9.salary di 1000<900:
update employees
set salary =1000
where salary < 900;

--11. delete Betty Dancs:
delete from employees
where last_name='Dancs' and first_name= 'Betty';

commit;

---delete all rows
delete from employees;

rollback;

--create table dept

create table dept(
id number(7) constraint dept_pk primary key,
name varchar2(25)

);

create table emp(
id number(7) constraint empt_pk primary key,

last_number varchar(25),
first_name varchar(25),
dept_id number(7)
constraint emp_dept_id_fk 
references dept(id) 
);

alter table emp 
add commission number(2,2);

--last_name varchar(50) invece di (25).
alter table emp
modify(last_number varchar(50)
);
alter table emp drop(
first_name
);

--tentative marking of column as unused:
alter table emp set unused(dept_id);

--when safe, drop them:
alter table emp drop unused columns;


select*
from ALL_TAB_COLUMNS
where table_name='EMP';

select *
from USER_UNUSED_COL_TABS;

--8
create table employees2 as
select employee_id as Id, first_name, last_name, salary,
