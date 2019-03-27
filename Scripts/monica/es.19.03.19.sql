--select country_id, country_name    //19/03/19 
--from countrie

--SELECT FIRST_NAME, LAST_NAME
--FROM EMPLOYEES;

select country_id, country_name
from countries;

select region_name
from regions;

select *
from countries
where country_id = 'AR';

--dual table to read susdate (and more)
select sysdate
from dual;

select 2 + 2
from dual;
  
--user_tables
select table_name     
from user_tables;

descr jobs;

--varchar2(20)
--number (6,2), number (6), integer
--char(20)
--data

select ROWID, region_id, region_name
from regions
where region_id = 1;

select sysdate, sysdate-1
from dual;

select to_date('30-gen-19')
from dual;




select to_date('30-gen-19'),to_date('30-gen-19')+1,to_date('30-gen-19')+2
from dual;

select max_salary,min_salary,(max_salary + min_salary)/2 as "average salary"
from jobs
where job_id = 'AD_PRES';


select first_name || ' ' || last_name as "Name"
from employees
where employee_id = 100;

select *
from employees
where employee_id in (144, 145);

select first_name, last_name, commission_pct
from employees
where commission_pct is not null;

select first_name, last_name,commission_pct
from employees
where commission_pct is  null;

--nvl ()
select first_name, last_name, nvl( commission_pct, 0) as "Null-free commission"
from employees;

-- distinct
select distinct manager_id
from employees;

select distinct last_name
from employees;

--select single row
SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 105;

SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID != 100;


SELECT *
FROM REGIONS
WHERE REGION_ID > ANY (1,2,3);

SELECT *
FROM REGIONS
WHERE REGION_ID > All (1,2,3);

--esercizio n.1
-- employees:
--1) hired ON FIRST 6 months 2005
--2)salary> 5000$
--3) job_id IS ST_clerk


SELECT *
FROM EMPLOYEES
WHERE HIRE_DATE >= '01-gen-05' AND HIRE_DATE < '01-lug-05';


SELECT *
FROM EMPLOYEES
WHERE SALARY >= 5000;

SELECT *
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK';

--like_%
SELECT LAST_NAME
FROM EMPLOYEES
WHERE LAST_NAME LIKE '_ul%';

SELECT LAST_NAME
FROM EMPLOYEES
WHERE LAST_NAME NOT LIKE '%a%';

SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID IN (107,144,145);

SELECT *
FROM REGIONS
WHERE REGION_ID IN (2,3,NULL);

SELECT *
FROM REGIONS
WHERE REGION_ID IS NOT NULL;

--between
SELECT *
FROM REGIONS
WHERE REGION_ID BETWEEN 2 AND 3;

--order by
SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Grant' OR LAST_NAME = 'King' 
ORDER BY LAST_NAME ASC, FIRST_NAME DESC;

SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Grant' OR LAST_NAME = 'King' 
ORDER BY HIRE_DATE DESC;

SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Grant' OR LAST_NAME = 'King' 
ORDER BY 3; -- rappresenta la terza colonna, nel nostro caso hire_date

SELECT first_name, last_name, job_id, salary
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK' AND salary BETWEEN 2000 AND 3000
ORDER BY 4 DESC;

SELECT first_name, last_name, commission_pct
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL
ORDER BY 1;

SELECT first_name, last_name, phone_number, hire_date
FROM EMPLOYEES
WHERE PHONE_NUMBER LIKE '%121%'
ORDER BY 4;

SELECT first_name, last_name, hire_date, manager_id 
FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN '01-gen-07' AND  '31-dic-07' AND MANAGER_ID = 122
ORDER BY FIRST_NAME;

