--CREARE E MODIFICARE TABELLE 
create table coders as 
select employee_id as coder_id, first_name, last_name, hire_date, salary
from hr.employees
where department_id = 60;

--creare una tabella da zero
create table simple(
     simple_id number(6,0) primary key,
     status char, 
     name varchar2(20), 
     coder_id number
);

--Quando mi scordo di mettere un elemento dentro la tabella:
alter table simple
add counter number (38,0);

alter table simple
drop column counter;

select table_name
from user_tables;

select *
from simple;

--dare restrizioni:
alter table simple
add constraint simple_status_ck check(status in ('A', 'B','X'));--voglio solo questi caratteri nella colonna

alter table simple
add constraint simple_id_ck check(mod(simple_id, 2) = 1);--voglio solo numeri dispari nella colonna

--modificare la restrizione:
alter table simple
modify name constraint simple_name_nn not null;--'nn' sta per not null, voglio solo valori non nulli nella colonna e quindi mi spunterà verde nella tabella

insert into simple(simple_id, status, name, coder_id)
values(11, 'Z', 'bad status', 1);--RESTRIZIONE VIOLATA

insert into simple(simple_id, status, name, coder_id)
values(3, 'A', NULL, 1);--IMPOSSIBILE INSERIRE NULL

--violiamo in constraint not null con il drop:
alter table simple
drop constraint simple_name_nn;--ora prende anche valori nulli, il drop mi annulla le operazioni prima

--aggiungiamo una primary key:
alter table coders
add constraints coders_pk primary key(coder_id);

alter table simple
drop column coder_id;--con drop cancello le modifche apportate

alter table simple 
add constraint simple_coder_id_fk 
coder_id references coders(coder_id);

--Esempio:
--add to coders
--id 12, hire_date: today, salary: 4000
insert into coders
values(12, 'Mario', 'Rossi', sysdate, 4000);

select *
from coders;

insert into simple
values(1, 'A', 'first', 103);

insert into simple
values(3, 'A', 'second', 105);

alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id) on delete cascade;--elimina tutte le righe dove c'è la foreign key

alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id) on delete set null;--mette valori nulli

update simple
set coder_id = 12;

delete from coders
where coder_id = 12;

--duplicare valori:
insert into simple
values(5, 'A', 'second', 105);

delete from simple 
where simple_id = 5;

alter table simple
add constraint simple_name_uq unique(name);

alter table coders
add constraint coders_name_uq unique(first_name, last_name);

--questo da errore:
insert into coders
values(212, 'Valli', 'Pataballa', sysdate, 4000);

select *
from user_constraints
where table_name = 'SIMPLE';

--ELIMINARE UNA TABELLA:
drop table simple;
--ricrearla:
create table infos (
     info_id number(6,0) 
      constraint infos_pk primary key
      constraint infos_id_ck check(mod(info_id, 2) = 1),
     status char default 'A'
      constraint infos_status_ck check(status in ('A', 'B','X')),
     name varchar2(20)
      constraint infos_name_uq unique,
     coder_id number
      constraint infos_coder_id_fk
      references coders(coder_id) on delete cascade
);

insert into infos 
values(1, 'A', 'first', 12);

insert into infos 
values(3, default, 'second', 12);

insert into infos(info_id, name, coder_id)
values(5, 'third', 12);

delete from coders
where coder_id = 12;

--rinominare una tabella:
rename infos to my_statuses;

--aggiungere commenti su tabella o colonne:
comment on table my_statuses is 'Some extra information on coders';

comment on column my_statuses.status is 'Status in the statuses';

--cancella tutte le righe e non posso fare il rollback
truncate table my_statuses;
--cancella tutta la tabella:
drop table my_statuses;

--sequence:
create sequence my.seq;

select* from user_sequences;

select my_seq.nextval
from dual;

alter sequence my_seq increment by 2;

drop sequence my_seq;

create sequence my_seq
start with 201 increment by 2;

insert into my_statuses
values(my_seq.nextval, default, 'Tom', 103);

insert into my_statuses
values(my_seq.nextval, default, 'Billi', 105);

create or replace view restricted_coders as 
select coder_id, last_name, first_name
from coders
with read only;

select *
from restricted_coders;

update restricted_coders
set first_name = 'Tom'
where coder_id = 103;


drop view restricted_coders;