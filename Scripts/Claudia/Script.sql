SELECT
    country_id, country_name
FROM countries;

select first_name, last_name
from employees;

--SELECT
    --country_id, country_name
--FROM countries, regions;

SELECT
    *
FROM countries
where country_id = 'AR';

SELECT SYSDATE, SYSDATE - 1
FROM DUAL;


SELECT 2+2
FROM DUAL;


--USER TABLES
SELECT table_name
FROM USER_TABLES;
--describe funziona solo in Oracle

SELECT ROWID,region_id, REGION_NAME
FROM REGIONS
WHERE REGION_ID = 1

SELECT TO_DATE('30-GEN-19')
FROM DUAL;

SELECT max_salary, min_salary, (max_salary + MIN_SALARY) / 2 AS "AVERAGE SALARY"
FROM JOBS
WHERE JOB_ID = 'AD_PRES';

select first_name || ' ' || last_name as "name"
from employees
where employee_id = 100;

select *
from employees
where employee_id in (144, 145);

select first_name, last_name, commission_pct
from employees
where commission_pct is null;

select first_name, last_name, 12 * salary * commission_pct as "year full salary"
from employees

select first_name, last_name, nvl(commission_pct, 0)
from employees

select distinct manager_id
from employees;

select distinct last_name
from employees;

SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 105;

SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID != 100;

SELECT *
FROM REGIONS
WHERE REGION_ID > any(1, 2, 3);

SELECT *
FROM REGIONS
WHERE REGION_ID > ALL(1, 2, 3);

--employees : chi sono dipendenti assunti nei primi 6 mesi del 2005
-- dipendenti che hanno salary >= 5.000 $
-- jobId è ST_CLERK

SELECT *
FROM EMPLOYEES
WHERE HIRE_DATE >= '01-GEN-05' AND HIRE_DATE <= '30-GIU-05';

SELECT *
FROM EMPLOYEES
WHERE SALARY >= 5000;

SELECT *
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK';

SELECT LAST_NAME
FROM EMPLOYEES
WHERE LAST_NAME LIKE '_ul%'

SELECT LAST_NAME
FROM EMPLOYEES
WHERE LAST_NAME LIKE 'Gr%'

--order by
SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Grant' or LAST_NAME = 'King'
ORDER BY LAST_name ASC, FIRST_NAME desc;

SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Grant' or LAST_NAME = 'King'
ORDER BY 3; --il 3 si riferisce alla select, terza condizione(hire_date)

--employees : ST_CLERK, SALARY[2000, 3000] HIGHER salary first

SELECT FIRST_NAME, LAST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK' AND SALARY >= 2000 AND SALARY <= 3000
ORDER BY 4 DESC

--employees : con commission_pct, order by first name
SELECT first_name, last_name, COMMISSION_PCT
FROM EMPLOYEES
WHERE COMMISSION_PCT > 0 
ORDER BY FIRST_NAME ASC

--employees : phone number including '121' order by hire date
SELECT FIRSt_name, last_name, phone_number, hire_date
FROM EMPLOYEES
WHERE PHONE_NUMBER LIKE '%121%'
ORDER BY HIRE_DATE ASC

--employees : hired on 2007 with manager Payam, by first name
SELECT first_name, last_name, HIRE_DATE, manager_id
FROM EMPLOYEES
WHERE manager_id = 122 AND HIRE_DATE >= '01-gen-2007' AND HIRE_DATE <= '31-dic-2007'
ORDER BY FIRST_NAME ASC


