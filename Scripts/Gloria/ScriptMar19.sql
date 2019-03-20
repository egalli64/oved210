select *
from countries;

--select country_id, country_name
--from countries;

--SELECT first_name, last_name
--from employees; 

select country_id, country_name
from countries;

select region_name
from regions;

select *
from countries
where country_id = 'AR';

--dual table per stampare la data corrente
select SYSDATE
from dual;

-- user_tables
select table_name
from user_tables;

--ORACLE ONLY!!!
--describe jobs;

--varchar2(20) --> stringa di 20 caratteri
--number(6,2), numbero(6) --> indica la quantità di cifre e decimali
--integer --> indica solo numeri interi
--char(20) --> è sempre una stinga MA eiste solo di 20 caratteri, quindi se scrivo la parola 'ciao' che è di soli 4 caratteri, gli spazi mancanti fino ad arrivare a 20 caratteri, mi mette spazi bianchi
--data

--mi stampa la riga uno delle regions
select *
from regions
where region_id = 1;

--mi stampa sia la data di oggi che quella di ieri
select sysdate, sysdate - 1
from dual;

--chiedo di stampare la data di oggi ma anche quella dei due giorni successivi
select to_date('30-GEN-19'), to_date('30-GEN-19') + 1, to_date('30-GEN-19') + 2
from dual;

--la scritta tra i doppi apici "" mi va a modificare il nome della tabella (inserendo quello che voglio) nella pagina dei risultati
select max_salary, min_salary, (max_salary + min_salary) / 2 as "AVERAGE SALARY"
from jobs
where job_id = 'AD_PRES';

select distinct last_name
from employees;

--select a single row; seleziona tra gli impiegati quello che ha un id 105
select * 
from employees
where employee_id = 105;
--oppure:
select * 
from employees
where last_name = 'King';

--utilizzo il segno diverso
select *
from employees
where employee_id != 100;
--un equivalente è:
select *
from employees
where employee_id <> 100;

--voglio utilizzare il MINORE 
select *
from employees
where employee_id < 110;
--oppure: mi mostra fino al nome BRUCE compreso
select *
from employees
where first_name <= 'Bruce';

select *
from employees
where last_name = 'King';

select *
from regions
where region_id > any(1, 2, 3);
--mi seleziona quello maggiore di tutti i numeri presenti nella parentesi
select *
from regions
where region_id > all(1, 2, 3);


--ESERCIZI:

--employees:
--1) hired on first 6 months 2005?
--2) salary > 5000 $
--3) job_id is ST_CLERK

--1)
select first_name, last_name, hire_date
from employees
where hire_date >= '01-GEN-2005' and hire_date < '01-LUG-2005';

--2)
select first_name, last_name, salary
from employees
where salary >= 5000;

--3)

select first_name, last_name, job_id
from employees
where job_id = 'ST_CLERK';
---

-- LIKE __% --> l'unders. vuol dire che non importa come inizia il cognome ma deve contenere quello che gli chiedo, e la percentuale vuol dire che può finire e contenere quanti caratteri vuole
select last_name
from employees
where last_name like '_ul%' or last_name like 'Gr%'; -- senza l'unders. vuol dire che deve iniziare con quelle lettere

select last_name
from employees
where last_name not like '%a%'; 

select *
from employees
where employee_id in (107, 144, 145);

select *
from regions
where region_id not in (2, 3);

--pay attention to null!
select *
from regions
where region_id not in (2, 3, null);

select *
from regions
where region_id is not null;

--BETWEEN per vedere se un valore è incluso nel nostro intervallo
select *
from regions
where region_id between 2 and 3;

--OR
select employee_id, first_name, last_name, hire_date
from employees
where hire_date > '01-GEN-2008' or employee_id = 100;

--NOT
select *
from regions
where region_id not between 2 and 3;

--ORDER BY; asc = ordine crescente, desc = ordine decrescente
select first_name, last_name, hire_date
from employees
where last_name = 'Grant' or last_name = 'King'
order by last_name asc, first_name desc;

--order by scritto così vuol dire che me li ordina in senso decrescente, in base all'assunzione perchè è la tabella numero 3
select first_name, last_name, hire_date
from employees
where last_name = 'Grant' or last_name = 'King'
order by 3 desc;


--ESERCIZIO:

--1) employees: ST-CLERK, salary[2000, 3000] higher salary first
select first_name, last_name, salary, job_id
from employees
where job_id = 'ST_CLERK' and salary between 2000 and 3000
order by 3 desc;

--2) employees: with commission_pct, order by first_name
select first_name, last_name, commission_pct
from employees
where commission_pct is not null
order by 1;

--3) employees: with phone number including '121' order by hire date
select first_name, last_name, phone_number, hire_date
from employees
where phone_number like '%121%'
order by hire_date asc;

--4) employees: hired on 2007 with manager Payam, by first name 
select employee_id, first_name, last_name
from employees
where first_name = 'Payam';
--...continua...
select first_name, last_name, manager_id, hire_date
from employees
where manager_id = 122 and hire_date between '01-GEN-2007' AND '31-DIC-2007'
order by first_name;