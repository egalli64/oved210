--create table. Creazione di una tabella estraendo i dati da un'altra

select employee_id as coder_id, first_name, last_name, hire_date, salary
from hr.employees
where department_id = 60;

--voglio crearmi una tabella su oved in cui inserire i dati riportati sopra.
create table coders as 
select employee_id as coder_id, first_name, last_name, hire_date, salary
from hr.employees
where department_id = 60;

--per creare una tabella da zero, tra parentesi le colonne che voglio associare a questa tabella
--6, 0 vuol dire un numero intero a sei cifre
--PRIMARY KEY = valore che mi identifica univocamente una riga, non ci possono essere due righe con la stessa primary key
--voglio aggiungere anche uno stato
--è poss aggiungere anche stringhe: 
create table simple (
simple_id number(6, 0) primary key,
status char, 
name varchar2(20),
--voglio creare una foreign key, stesso nome  estesso tipo in modo da poter fare una connessione
coder_id number
);

--tabella di sistema, tutte le tabelle possedute dall'utente corrente ovvero oved
select table_name
from user_tables;

select*
from simple;

--I've forgotten about it!
--per aggiungere elementi alla tabella in seguito alla creazione
alter table simple
add counter number(38, 0);

--per rimuovere la colonna aggiunta sopra
alter table simple
drop column counter;

--simple=tabellaa, status=colonna 

select*
from simple;

alter table simple
--nella colonna status ci possono stare solo A, B o X.
add constraint simple_status_ck check(status in ('A', 'B', 'X'));


--posso dirgli che voglio avere un constraint sull'id, il modulo di simple id
--con il check ho applicato la funzione modulo che lavora come in java
--diviso 2 sarà = 0 se sono pari, 1 se dispari
alter table simple
add constraint simple_id_ck check(mod(simple_id, 2)=1);

--non vogliamo che il valore sia accettabile all'interno di simple
alter table simple
add constraint simple_name_nn check(mod(simple_id, 2)=1);

alter table simple
modify name constraint simple_name_nn not null;

--se non specifico le colonne oracle, le prende tutte in ordine
insert into simple(simple_id, status, name, coder_id) 
values(11, 'Z', 'bad status', 1);

--sto cercando di creare una riga dove primary k è pari, ma la nosta primary k è dispari
insert into simple(simple_id, status, name, coder_id) 
values(2, 'A', 'even id', 1);

insert into simple
values(3, 'A', NULL, 1);

--( ADESSO NAME PUò ASSUMERI VALORI NULL)
ALTER TABLE simple
drop constraint simple_name_nn;

--ORA è POSSIBILE ESEGUIRE L'OPERAZIONE
insert into simple
values(3, 'A', NULL, 1);

--voglio modificare la tabella coders aggiungendoci un constrect che chiamero coders primary k
alter table coders
add constraint coders_pk primary key(coder_id);

--per farla diventare davvero una primary key 'espressione rigo 18'

alter table simple
drop column coder_id;

--aggiungimi a simple un campo coder_id e mettici all'interno un constraint che fa da foreign k che si legherà alla tabella coders su coder_id
alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id);

insert into coders
values(12, 'Alessandro', 'Quintale', sysdate, 4000);

select*
from coders;

insert into simple
values(1, 'A', 'first', 103);

select*
from simple;

delete 
from simple
where simple_id = 3;

commit;

delete from simple;

commit;



insert into simple
values(3, 'A', 'second', 105);

--ho cercato di mettere una riga che faceva riferimento alla primary k in coders ma non esiste 
insert into simple
values(5, 'A', 'missing', 42);



--dobbiamo prima eliminare la colonna,ovvero il campo che è la nostra foreign key,  in simple non ci sarà più la colonna coder_id.
--per ricreare la foreign key occorre eliminare la colonna e ricrearla
alter table simple
drop column coder_id;

--ora possiamo decidere  di crearla secondo questi due statement

--se viene eliminato il PK i miei campi che hanno quella FK vengono eliminati
--come soluzione : gli posso dire che se elimino il cod 12 tutte le righe in simple che si riferiscono al codice 12 devono essere eliminate, quindi chi ha quel fk subisce un effetto a cascata
alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id) on delete cascade;


--tutti quelli che lo usavano come FK non possono più tenerlo e posso decidere se eliminarli o mettere la FK a null per significar eche non hanno più
--un riferimento su cui andare
alter table simple
add constraint simple_coder_id_fk
coder_id references coders(coder_id) on delete set null;

--warning! working on all rows!
--tutte le righe che sono in simple avranno come riferim il codice 12
update simple
set coder_id = 12;

--in simple vengono eliminate tutte le righe e in coders viene eliminata la riga 12 da noi creata.

alter table simple
drop column coder_id;



insert into coders
values(12, 'Alessandro', 'Quintale', sysdate, 4000);

insert into simple
values(3, 'A', 'second', 105);

insert into simple
values(1, 'A', 'first', 103);

update simple
set coder_id = 12;


--duplicated values
insert into simple
values(5, 'A', 'second', 105);

delete from simple
where simple_id = 5;

alter table simple
add constraint simple_name_uq unique(name);

alter table coders
add constraint coders_name_uq unique(first_name, last_name);

insert into coders
values(212, 'Valli', 'Pataballa', sysdate, 4000);

select*
from user_constraints
where table_name = 'SIMPLE';

drop table simple;

---ricreiamo la tabella
create table infos (
   info_id number(6, 0)
       constraint infos_pk primary key
       constraint infos_id_ck check(mod(info_id, 2)=1), --DICIAMO che gli unici valori validi sono dispari
   status char default 'A'-- in questo campo, se specifico qualcosa va bene quello che ho specificato altrimenti per default vine messa una A
       constraint infos_status_ck check(status in ('A', 'B', 'X')),
   name varchar2(20) --al massimo 20 caratteri
       constraint infos_name_uq unique, --diciamo che è unico non ci possono essere dup
--voglio creare una foreign key, stesso nome  e stesso tipo in modo da poter fare una connessione
   coder_id number
       constraint infos_coder_id_fk
       references coders(coder_id) on delete cascade --quando eliminero' una riga da coders mi causerà l'eliminazione in infos
);

--drop table infos;

--ora possimao inserire valori
insert into coders
values(12, 'Alessandro', 'Quintale', sysdate, 4000);


insert into infos
values(1, 'A', 'first', 12);

insert into infos
values(3, default, 'second', 12);

insert into infos(info_id, name, coder_id)
values(5, 'third', 12);

delete from coders
where coder_id = 12;

--rename
rename infos to my_statuses;

--comments sia sulla tabella che sulle colonne
comment on table my_statuses is 'Some extra information on coders';

comment on column my_statuses.status is 'Status in the Statuses';

--
--delete from coders e truncate table my_statuses hanno la stessa funzione, però con delete si può fare il rollback

truncate table my_statuses; --svuota la tabella e non si può utilizzare il rollback
drop table my_statuses; --mi elimina tutta la tabella

--grant create sequence to oved;

create sequence my_seq;

select* from user_sequences;

--per leggere una sequenza , fare il select su from dual
--lo scopo è avere una sequenza che mi genera numeri univoci, se chiamo la sequenza non mi risponderà mai con lo stesso numero
--è un modo per risolvere il rischio di clash di scontri
select my_seq.nextval  --voglio leggere il valore successivo dalla mia sequenza
from dual;

--gli posso dire che voglio che mi incrementi saltando un valore di volta in volta
alter sequence my_seq increment by 2;


drop sequence my_seq; --mi elimina la sequenza

create sequence my_seq
start with 201 increment by 2;

insert into MY_STATUSES
values(my_seq.nextval, default, 'Tom', 103);


insert into MY_STATUSES
values(my_seq.nextval, default, 'Bill', 105);


--funzione delle VIEW  --> dare ad alcuni utenti un accesso ristretto delle tabelle
--grant create view to oved;
create or replace view restricted_coders as
select coder_id, first_name, last_name
from coders
with read only;

select*
from restricted_coders;

update restricted_coders
set first_name = 'Tom'
where coder_id = 103;

drop view restricted_coders;


--creare tabella my_employee
--pk sara ID

create table employees (
id number(4) constraint employees_pk primary key,
last_name varchar2 (25),
first_name varchar2 (25),
userid varchar2 (8),
salary number (9, 2)
);

--drop table hr.employees;
insert into hr.employees
values(1, 'Patel', 'Ralph', 'rPatel', 895);


--inserire seconda riga in modo completo, nome colonne e valori

insert into employees 
(id, last_name, first_name, userid, salary)
values(2, 'Dancs', 'Betty', 'bdancs', 8);


insert into employees
values(3, 'Biri', 'Ben', 'Bbiri', 1100);

insert into employees
values(4, 'Newman', 'Chad', 'Cnewman', 750);

insert into employees
values(5, 'Ropeburn', 'Audrey', 'aropebur', 1550);


--vogliamo cambiare il cognome dell'impiegato 3, last name deve diventare Drexel
update employees
set last_name = 'Drexel'
where id = 3;

--cambiamo il salario a 1000 per tutti i dip che hanno un salario inferiore a 900

update employees
set salary = 1000
where salary <900;

--11 delete Betty Dancs
delete from employees
where last_name = 'Dans' and first_name = 'Betty';

commit;

delete from employees;

rollback;

--creiamo tabella DEPT
--ID
--NAME

create table dept (
id number(7) constraint dept_pk primary key,
name varchar2 (25)
);


--2.2 create table emp 

create table emp (
id number(7) constraint emp_pk primary key,
last_name varchar2 (25),
first_name varchar2 (25),
dept_id number (7) constraint emp_dept_id_fk --nome tabella, nome campo, e il legame
references dept(id)
);


--colonna commission, per aggiungere una colonna 
alter table emp add(
commission number(2, 2)
); --add per aggiungere


--per modificare una tabella e precisamente per cambiare la struttura
alter table emp modify(  ---per modificarle
last_name varchar2(50)
);

alter table emp drop(  --per eliminarle
first_name 
);


--modify drop 

--droppare una colonna è una cosa delicata,
--unused c'è ancora ma non è utilizzata, unused è un comando di alter
--per dire che dept_id non è utilizzata

--tentative marking of column as unused
alter table emp set unused(dept_id);  --marchiamo la colonna

--when safe , drop them
alter table emp drop unused columns;--se dopo svariato tempo nessuno si lamenta, le droppiamo

select dept_id
from emp;

select*
from ALL_TAB_COLUMNS
where table_name = 'EMP'; 


select*
FROM USER_UNUSED_COL_TABS;

---TAB EMPLOYEES2
--EMPLOYEE_ID, FIRST_NAME, SALARY AND DEPT_ID
drop table employees2;
drop table employees;

create table employees as  
select employee_id as id,
first_name,
last_name,
salary,
department_id as dept_id
from hr.employees;

--es 2.9
--read only
alter table employees read only;

--cosa succede 
delete from employees;

truncate table employees;

update my employees
set first_name ='Tom'
where id = 100;

--facciamola tornare read right
alter table employees read write;

--modifichiamola
select* from employees where id = 100;

truncate table employees;

select count(rowid) from employees;

--2.12
--drop delle tabelle.

drop table dept;
drop table emp;
drop table employees;
drop table coders;





