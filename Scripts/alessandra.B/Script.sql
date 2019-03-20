--select country_id,country_name
--from countries;

--select first_name , last_name 
--from employees; 

select country_id,country_name
from countries;

select region_name
from regions;

select *
from countries
where country_id = 'AR';

select SYSDATE
from dual;

select 2 + 2
from dual;

select table_name
from user_tables;

--describe jobs;
--VARCHAR2 (20) --> stringa di 20 caratteri, VARCHAR2 indica una stringa
--NUMBER(6,2)--> numero composto da 6 cifre intere e due cifre decimali (dopo la virgola, se metto solo 6 è un numero intero a 6 cifre)
--char(20)--> è sempre una stringa a 20 caratteri, se scrivo "ciao" mi riempie i primi 4 caratteri e i restanti 16 li riempie con spazi bianchi (limita la lunghezza della stringa)
--date --> la data di oggi

select rowid, region_id, region_name --rowid è l'indice di Oracle per la riga (è l'Hash number che identifica la riga). la usiamo se non abbiamo la primary key per accedere a una riga
from regions
where region_id = 1;

select sysdate, sysdate -1 
from dual;

select to_date('30-GEN-19'),  to_date('30-GEN-19') + 1,  to_date('30-GEN-19')+ 2
from dual;

select max_salary, min_salary, (max_salary + min_salary) /2 as "average" -- in questo caso dopo as, per identificare una stringa, uso il doppio apici ""
from jobs
where job_id = 'AD_PRES'
-- voglio la media tra salario massimo e minimo del presidente

select first_name ||' '|| last_name  as "Name"  --|| indica la concatenazione delle stringhe, abbiamo aggiunto ' ' per fare lo space tra le due parole 
from employees
where employee_id = 100;

select *
from employees
where employee_id in (144,145);

select first_name, last_name, commission_pct
from employees
where commission_pct is not null;  -- " is null " nel caso in cui la commissione fosse  null

select first_name, last_name, 12 * salary * commission_pct as "Year Full Salary"
from employees;

--NVL() significa "if commission is null, wirte 0": se il primo parametro è null, ritorna il 2 parametro, altrimenti ritorna il 1.
select first_name, last_name, nvl(commission_pct, 0) as "Null-free commission"
from employees;

--distinct
select distinct manager_id
from employees

select distinct last_name
from employees;

--select a single row

SELECT*
FROM EMPLOYEES
WHERE LAST_NAME = 'King';

SELECT*
FROM EMPLOYEES
WHERE EMPLOYEE_ID != 100;

SELECT*
FROM EMPLOYEES
WHERE EMPLOYEE_ID < 110;

SELECT*
FROM EMPLOYEES
WHERE FIRST_NAME < 'Bruce';

SELECT*
FROM REGIONS
WHERE REGION_ID > ANY(1,2,3); --maggiore di 1 è 2, maggiore di 2 è 3, maggiore di 3 è 4

SELECT*
FROM REGIONS
WHERE REGION_ID > ALL(1,2,3); -- maggiore sia di 1, che di 2, che di 3 è solo 4.

--employees;
-- 1) hired on FIRST 6 months 2005
-- 2) salary > 5000$
-- 3) job_id IS ST_CLERK 

SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE < '30-GIU-2005' AND HIRE_DATE > '01-GEN-2005';

SELECT FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > 5000;

SELECT FIRST_NAME, LAST_NAME, JOB_ID
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK';

--like_% --> Underscore _ vuol dire una lettera che precede una stringa
SELECT LAST_NAME
FROM EMPLOYEES
WHERE LAST_NAME LIKE '_ul%' OR LAST_NAME LIKE 'Gr%'


SELECT LAST_NAME
FROM EMPLOYEES
WHERE LAST_NAME NOT LIKE '%a%';

SELECT*
FROM EMPLOYEES
WHERE EMPLOYEE_ID IN (107,144,145);


--pay attention to null!
SELECT*
FROM REGIONS
WHERE REGION_ID NOT IN (2,3,null);

--between
SELECT*
FROM REGIONS
WHERE REGION_ID BETWEEN 2 AND 3; -- in questo caso il compreso comprende anche 2 e 3 con la funzione between


--AND
SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE < '30-GIU-2005' AND HIRE_DATE > '01-GEN-2005';


--OR
SELECT FIRST_NAME, LAST_NAME, HIRE_DATE, EMPLOYEE_ID
FROM EMPLOYEES
WHERE HIRE_DATE > '01-GEN-2008' OR EMPLOYEE_ID = 100;

--NOT
SELECT*
FROM REGIONS
WHERE REGION_ID NOT BETWEEN 2 AND 3; 

--ORDER BY

SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Grant' OR LAST_NAME = 'King'
ORDER BY 3; -- il 3 mi dice di ordinare in base alla colonna 3, in questo caso la data di assunzione 

--employees: ST_CLERK, salary [2000,3000], higher salary first (desc)

SELECT FIRST_NAME, LAST_NAME, SALARY, JOB_ID
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK' AND SALARY BETWEEN 2000 AND 3000
ORDER BY SALARY DESC;

--employees with commission_pct, order by first name

SELECT FIRST_NAME, LAST_NAME, COMMISSION_PCT
FROM EMPLOYEES
WHERE COMMISSION_PCT > 0 --is not null
ORDER BY FIRST_NAME;

--employees with phone number includin '121' order by hire date

SELECT FIRST_NAME, LAST_NAME, PHONE_NUMBER, HIRE_DATE
FROM EMPLOYEES
WHERE PHONE_NUMBER LIKE '%121%'
ORDER BY HIRE_DATE;

--employees hired IN 2007 WITH manager Payam, ORDER BY first name

SELECT FIRST_NAME, LAST_NAME, MANAGER_ID, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE >= '01-GEN-2007' AND HIRE_DATE <='31-DIC-2007' AND MANAGER_ID = 122 
ORDER BY FIRST_NAME;