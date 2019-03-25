SELECT *
FROM COUNTRIES;

-SELECT country_id , country_name
--from countries;

--SELECT first_name, last_name
--FROM  employees;

select country_id, country_name
from countries;

select region_name
from regions;

select *
from countries
where country_id = 'AR';


-- dual table to read sysdate
 select SYSDATE
 from dual;
 
 select 2 + 2
 from dual;
 
 -- usertables
select table_name
from  user_tables;

-- oracle only
-- describe jobs;
 
 
 -- varchar2(20)
 -- number (6,2), number(6), integer
 -- char(20)
 -- data
 
 
 select rowid, region_id, region_name
 from regions
 where region_id = 1;
 
 --date
 select sysdate, sysdate - 1
 from dual;
 
 select to_date('30-GEN-19'), to_date('30-GEN-19') + 1, to_date('30-GEN-19') + 2
 
 from dual;
 
 select max_salary, min_salary, (max_salary + min_salary) / 2  "AVERAGE SALARY"
 from jobs
 where job_id = 'AD_PRES';
 
 
 --concatenation
 select first_name || ' ' || last_name as "Name"
 from employees
 where employee_id = 100;
 
 select*
 from employees
 where employee_id in (144, 145);
 
 
 select first_name, last_name, commission_pct
 from employees
 where commission_pct is null;
 
 
 select first_name, last_name, 12 * salary * commission_pct as "year Full salary"
 from employees;
 
 --NVL()
 select first_name, last_name, nvl  (commission_pct, 0) as "Null-free commission"
 from employees;
 
 
 --distinct
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
where EMPLOYEE_ID != 100;

select *  
from EMPLOYEES
where EMPLOYEE_ID < 110;

select *  
from EMPLOYEES
where FIRST_NAME <= 'Bruce;'

SELECT*
FROM REGIONS
WHERE REGION_ID > ALL(1, 2, 3);


SELECT*
FROM REGIONS
WHERE REGION_ID > ANY(1, 2, 3);

--employees
--1) hired on first 6 months 2005
--2) salary > 5000$
--3) job_id is ST_CLERK


-- 1) hired on first 6 months 2005
SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE >= '01-GEN-05' AND HIRE_DATE < '01-LUG-05';

--2) salary>5000$
SELECT FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY >= 5000;

--3) job_id is st_clerk
SELECT FIRST_NAME, LAST_NAME, JOB_ID
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK';

---


-- like_%
SELECT LAST_NAME
FROM EMPLOYEES
WHERE LAST_NAME LIKE '_ul%' OR LAST_NAME LIKE 'Gr%'; --cognomi che hanno dentro ul


SELECT LAST_NAME
FROM EMPLOYEES
WHERE LAST_NAME NOT LIKE '%a%';

SELECT*
FROM EMPLOYEES
WHERE EMPLOYEE_ID IN (107, 144, 145);

-- pay attention to null
SELECT*
FROM REGIONS
WHERE REGION_ID NOT IN (2, 3, NULL);

SELECT*
FROM REGIONS
WHERE REGION_ID IS NOT NULL;

--between serve per vedere se il nostro valore è incluso in un intervallo
SELECT*
FROM REGIONS
WHERE REGION_ID BETWEEN 2 AND 3;


SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE >= '01-GEN-08' AND HIRE_DATE < '01-LUG-05';

SELECT  EMPLOYEE_ID, FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE >= '01-GEN-08' OR EMPLOYEE_ID = 100;

--not
SELECT *
FROM REGIONS
WHERE REGION_ID NOT BETWEEN 2 AND 3;

--order by
SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Grant' OR LAST_NAME = 'King'
ORDER BY LAST_NAME ASC, FIRST_NAME DESC;

SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Grant' OR LAST_NAME = 'King'
ORDER BY 3 DESC;


--employees: ST_CLERKS, salary [2000, 3000] higher salary first
SELECT FIRST_NAME, LAST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK' AND SALARY  BETWEEN 2000 AND 3000
ORDER BY 4 DESC;


--employees: with commission_pct, order by first name

select first_name, last_name, commission_pct
 from employees
 where commission_pct IS NOT NULL
ORDER BY FIRST_NAME;


--employees : with phone number including '121' order by hire date
SELECT FIRST_NAME, LAST_NAME, PHONE_NUMBER, HIRE_DATE
FROM EMPLOYEES
WHERE  PHONE_NUMBER LIKE '%121%'
ORDER BY HIRE_DATE;

--employees: hired on 2007 with manager Payam, by first name
SELECT  EMPLOYEE_ID, FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME = 'Payam';

SELECT FIRST_NAME, LAST_NAME, HIRE_DATE, MANAGER_ID
FROM EMPLOYEES
WHERE MANAGER_ID = 122 AND HIRE_DATE BETWEEN '01-GEN-07' AND '31-DIC-07'
ORDER BY FIRST_NAME











 