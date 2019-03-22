SELECT *
FROM COUNTRIES;
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

SELECT SYSDATE
FROM DUAL;

SELECT 2+2
FROM DUAL;

SELECT TABLE_NAME
FROM USER_TABLES;

--oracle only
--DESCRIBE JOBS;


--VARCHAR2(20)
--NUMBER(6,2), NUMBER(6), INTEGER
--CHAR(20)
--DATA

SELECT ROWID,REGION_ID, REGION_NAME
FROM REGIONS
WHERE REGION_ID = 1;

--DATE
SELECT SYSDATE, SYSDATE - 1
FROM DUAL;

SELECT TO_DATE('30-GEN-19'), TO_DATE('30-GEN-19') + 1, TO_DATE('30-GEN-19') +2
FROM DUAL;

SELECT MAX_SALARY, MIN_SALARY, (MAX_SALARY + MIN_SALARY) / 2 AS "AVERAGE SALARY"
FROM JOBS
WHERE JOB_ID = 'AD_PRES';

SELECT FIRST_NAME || ' ' || LAST_NAME AS "Name"
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 100;

select first_name, last_name, commission_pct
from employees
where commission_pct is not null;

select first_name, last_name, commission_pct
from employees
where commission_pct is null;

select first_name, last_name, 12 * salary * commission_pct as "year salary"
from employees;

-- NVL()
select first_name, last_name, nvl (commission_pct, 0) as "Null - free commission"
from employees;

--distinct elimina duplicati
select distinct manager_id
from employees;

select distinct last_name
from employees;

-- select a single row
select *
from EMPLOYEES
where LAST_NAME = 'King';

select *
from EMPLOYEES
where FIRST_NAME <= 'Bruce';

SELECT *
FROM REGIONS
WHERE REGION_ID > all(1, 2, 3);
--all: maggiore del più grande

SELECT *
FROM REGIONS
WHERE REGION_ID > any(1, 2, 3);
--ANY : maggiore del più piccolo

--ESERCIZIO
--employees:
--1) hired on first 6 months 2005
--2) salary > 5000 $
--3) job_id is ST_CLERK

--1)HIRE_DATE
SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE >= '01-GEN-05' AND HIRE_DATE < '01-LUG-05';

--2)SALARY
SELECT FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY >= 5000;

--3)JOB_ID
SELECT FIRST_NAME, LAST_NAME, JOB_ID

FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK';
---

--like_%
SELECT last_name
FROM EMPLOYEES
WHERE LAST_NAME LIKE '_ul%' OR LAST_NAME LIKE 'Gr%';

SELECT last_name
FROM EMPLOYEES
WHERE LAST_NAME NOT LIKE '%%';

SELECT*
FROM EMPLOYEES
WHERE EMPLOYEE_ID IN (107, 144, 145);

SELECT*
FROM REGIONS
WHERE REGION_ID NOT IN (2,3);

SELECT*
FROM REGIONS
WHERE REGION_ID IS NOT null;  --in contro null non funziona

SELECT*
FROM REGIONS
WHERE REGION_ID BETWEEN 2 AND 3;

SELECT first_name, last_name, hire_date
FROM EMPLOYEES
WHERE HIRE_DATE >= '01-gen-05' and HIRE_DATE < '01-lug-05';

SELECT first_name, last_name, hire_date
FROM EMPLOYEES
WHERE HIRE_DATE >= '01-gen-05' or EMPLOYEE_ID = 100;

--NOT
SELECT*
FROM REGIONS
WHERE REGION_ID NOT BETWEEN 2 AND 3;

--ORDER BY
SELECT first_name, last_name, hire_date
FROM EMPLOYEES
WHERE LAST_NAME = 'Grant' OR LAST_NAME = 'King'
ORDER BY LAST_NAME ASC, FIRST_NAME desc;

SELECT first_name, last_name, hire_date
FROM EMPLOYEES
WHERE LAST_NAME = 'Grant' OR LAST_NAME = 'King'
ORDER BY 3; --terzo campo : per DATA di assunzione

--employees: ST_CLERKS, salary [2000, 3000] higher salary FIRST
SELECT first_name, LAST_NAME, SALARY, JOB_ID
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK' AND SALARY BETWEEN 2000 AND 3000
ORDER BY 3 DESC;

-- employees: WITH commission_pct, ORDER BY FIRST name
SELECT first_name, last_name, COMMISSION_PCT
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT null
ORDER BY first_name desc;

-- employees: WITH phone NUMBER INCLUDING '121' ORDER BY hire Date
SELECT first_name, last_name, PHONE_NUMBER, HIRE_DATE
FROM EMPLOYEES
WHERE PHONE_NUMBER LIKE '%121%'
ORDER BY HIRE_DATE;

-- employees: hired ON 2007 WITH manager Payam, BY FIRST name
SELECT first_name, last_name, MANAGER_ID, HIRE_DATE
FROM EMPLOYEES
WHERE MANAGER_ID = 122 AND HIRE_DATE BETWEEN '01-GEN-07' AND '31-dic-07'
ORDER BY FIRST_NAME;