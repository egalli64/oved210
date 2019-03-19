SELECT*
FROM COUNTRIES;

select country_id, country_name
from countries;
-- vogliamo stampare la regione  acui appartine e prendere dati sia da countries che da regions

--select first_name, last_name
--from employees;

select country_id, country_name
from countries;

select region_name
from regions;

select*
from countries
where country_id = 'AR';


--POSSIAMO USARE UNA TABELLA FINTA, 
-- non esisteuna data corrente, quindi usiamo una tabella fittizia
select SYSDATE
from dual;

-- quando non ho una tabella a cui riferirmi posso usare una tabella fittizia (from dual)

select 2 + 2 
from dual;

-- posso usare questo comando per vedere effettivamente quali siano le tabelle (user_tables;)
select table_name
from user_tables;  
--mi dice cosa c'è all'interno della tabella
--oracle only
describe jobs;  --non può essere null 
--il tipo chiave VARCHAR2(10)-> EQUIVALENTE ALLA STRINGA E PUò AVERE AL MASSIMO 10 CARATTERI
--NUMBER(6)-> mi descrive un numero, sia quelli interi che float in point.

-- i più usati sono i varchar2(20)
--number(6,2), number(6), integer
--char(20), esiste un corrispettivo di caratteri come in java.. il char viene usato quando voglio specificare la lunghezza esatta
--data-> mi rappresenta una data, sysdate è la data di oggi

select rowid, region_id, region_name --rowid è l'indice che oracle usa per identificare quella riga
from regions
where region_id = 1; --mi stampa la riga 1, nella tabella region

--date-> stampare la data corrente e quella di ieri
select sysdate, sysdate - 1
from dual;

select to_date('30-GEN-19'), to_date('30-GEN-19')+ 1, to_date('30-GEN-19') + 2 
FROM DUAL;

--voglio vedere il salario medio per il job_id del presidente
select max_salary, min_salary, (max_salary + min_salary) / 2 as "AVERAGE SALARY" 
from jobs
where job_id = 'AD_PRES';

select first_name || ' ' || last_name as "NAME"   --(PER DARE UN NOME ALLA COLONNA --(operatore di concatenazione per stampare separatamente
from employees
where employee_id = 100;

Select*
from employees
where employee_id in (144, 145); -- dati degli impiegati che si trovano in questo range.

is null--mi permette di controllare se un campo è o non ìè null
--impiegati collegati alla vendita

Select first_name, last_name, commission_pct --nome cognome e commissione di tutti gli impiegati la cui commissione non è null
from employees
where commission_pct is not null;

---per vedere quelli che non hanno un acommissione

select first_name, last_name, commission_pct 
from employees
where commission_pct is null;

select first_name, last_name, 12 * salary * commission_pct as "Year Full Salary"
from employees;

--NVL() NULL VALUE--> che mi prende due valori
select first_name, last_name, nvl(commission_pct, 0) as "Null-free commission"  -- se commission pct è diverso da null ritorna commission altrimenti l'altro valore 0
from employees;

-- distinct  --non prendermi tutti i manager ma una volta ciascuno, 
select distinct manager_id
from employees;

select distinct last_name --distinct per leggere i cognomi univoci
from employees;

--select a single row
select*
from EMPLOYEES
where LAST_NAME = 'King';  

--tutti gli employee tranne steven king
SELECT*
FROM EMPLOYEES
WHERE EMPLOYEE_ID ! = 100;

--tutti gli employee che hanno un id minore di 110
SELECT*
FROM EMPLOYEES
WHERE EMPLOYEE_ID < 110;

--POSSO USARE L'OPERATORE MINORE ANCHE SULLE STRINGHE, ORDINE ALFABETICO
SELECT*
FROM EMPLOYEES
WHERE FIRST_NAME < 'BRUCE';

SELECT*
FROM EMPLOYEES
WHERE FIRST_NAME <= 'BRUCE';

--Per fare dei cntrolli ANY-
SELECT*
FROM REGIONS
WHERE region_id > any(1, 2, 3); --maggiore di almeno uno quindi del più piccolo e abbiamo(2-3-4)

SELECT*
FROM REGIONS
WHERE region_id > all(1, 2, 3);  --maggiore di tutti quanti (prendimi quella riga in region, dove region_id è maggiore di 1, 2, 3.


--employees:
--1)chi sono quegli impiegati che sono stati assunti nei primi 6 mesi del 2005?
--2)chi sono gli impiegati che hanno uno stipendio maggiore di 5000$?
--3)job_id is ST_CLERK

select FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE >= '01-GEN-05' AND HIRE_DATE < '01-LUG-05';


SELECT FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY >= 5000;

SELECT FIRST_NAME, LAST_NAME, JOB_ID
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK'

--LIKE_%
select last_name
from employees
--where last_name like '_ul%'; --sto cercando i cognomi che hanno dentro ul
--where last_name like 'Gr%';  -- i nomi che iniziano per gr è importante prima lettera maiuscola
where last_name like '_ul%' or last_name like 'Gr%';

select last_name
from employees
where last_name not like '%a%';

--voglio tutti e soli gli id che sono in un certo insieme

select*
from employees
where employee_id in (107, 144, 145);

select*
from regions
where region_id not in (2, 3);

--pay attention to null!
select*
from regions
where region_id not in (2, 3, null); --in contro null funziona male

--il solito modo per lavorare contro i null è quello di utilizzare l'operatore is o is not
select*
from regions
where region_id is not null;

--between per vedere se il valore è incluso in un intervallo
select*
from regions
where region id between 2 and 3; --compresi 2 e 3, in java l'estremo sup 3 invece è escluso

--and
select FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE >= '01-GEN-05' AND HIRE_DATE < '01-LUG-05'; --devono essere vere entrambe

--or
select employee_id, first_name, last_name, hire_date
from employees
where hire_date > '01-gen-08'or employee_id = 100; --selezionati gli assunti dal 2008 più steven king, dev'essere vero uno o l'altro

--not
select*
from regions
where region_id not between 2 and 3; --mi prende 1 e 4, quelli che non sono compresi tra 2 e 3

--order by
select FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE >= '01-GEN-05' AND HIRE_DATE < '01-LUG-05'
order by last_name;   --ordinamento per nome

--SE NON SCRIVO Nè ASC Nè DESC SI INTENDE L'ORDINE NATURALE
select first_name, last_name, hire_date
from employees
where last_name = 'Grant' or last_name = 'King'
order by last_name asc, first_name desc;  --asc per dire ordine normale, desc per ordinare i nome in modo decrescente , se ci sono due nomi uguali al secondo applica la seconda chiave di ordinamento

--voglio ordinare per 3, è la terza colonna che appare neLLA SELECT, ORDINAMELI PER DATA DI ASSUNZIONE.
select first_name, last_name, hire_date
from employees
where last_name = 'Grant' or last_name = 'King'
order by 3;

--employees: ST_CLERK, salary[2000, 3000] higher salary first
--tra gli impiegati, qualifica st_clerk con un salario tra i 2000 e 3000, ordinati per slaario dal più alto al più basso



select first_name, last_name, salary, job_id
from employees
where job_id = 'ST_CLERK' and salary between 2000 and 3000
order by salary desc;

-- employees: with commission_pct, order by first name

select first_name, last_name, commission_pct
from employees
where commission_pct is not null
order by first_name;

--ordinati per data di assunzione
--employees: with phone number including '121' order by hire date

select first_name, last_name, hire_date
from employees
where phone_number like '%121%'
order by hire_date;

--assunti nel 2007 che hanno come manager payam ordinati per nome di battesimo

select employee_id, first_name, last_name
from employees
where first_name = 'Payam';

select first_name, last_name, hire_date, manager_id
from employees
where manager_id = 122 and hire_date between '01-gen-07' and '31-dic-07'
order by first_name;



