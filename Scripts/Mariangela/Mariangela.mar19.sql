-- select country_id, country_name
-- from countries;

SELECT first_name, last_name
from employees;

select region_name
from regions;

select*
from countries
where country_id = 'AR';

select SYSDATE
from dual;

select max_salary, min_salary, (max_salary + min_salary) / 2 as "AVERAGE SALARY"
from jobs
where job_id = 'AD_PRES';

select first_name || ' ' || last_name as "Name"
from employees
where employee_id = 100;

select first_name, last_name, commission_pct
from employees
where commission_pct is not null;

-- select a single raw
SELECT *
FROM EMPLOYEES
WHERE LAST_NAME = 'King';

SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID != 100;
-- si può scrivere anche WHERE EMPLOYEE_ID <> 100;

SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID < 110;

SELECT *
FROM EMPLOYEES
WHERE FIRST_NAME < 'Bruce';

-- any all
SELECT *
FROM REGIONS
WHERE REGION_ID > ANY(1,2,3);

SELECT *
FROM REGIONS
WHERE REGION_ID > ALL(1,2,3);

--employees:
-- 1) hired ON FIRST 6 MONTH 2005
-- 2) salary > 5000$
-- 3) job_id IS ST_CLERK


SELECT HIRE_DATE, FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE HIRE_DATE < '01-LUG-05' AND HIRE_DATE > '31-DIC-04';


SELECT SALARY, FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE SALARY >= 5000;

SELECT JOB_ID, FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK';

--like _%
select last_name
from employees
where last_name like '_ul%';

select last_name
from employees
where last_name like 'Gr%';

--in
select *
from employees
where employee_id in (107, 144, 145);

select *
from regions
where region_id not in (2, 3);

---between
select *
from regions
where region_id between 2 and 3;

-- order by
SELECT HIRE_DATE, FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE HIRE_DATE < '01-LUG-05' AND HIRE_DATE > '31-DIC-04'
order by last_name asc, first_name desc;

SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE < '01-LUG-05' AND HIRE_DATE > '31-DIC-04'
order by 3;

-- employees: ST_CLERK, salary [2000, 3000] higher salary first

select salary, first_name, last_name , job_id
from employees
where job_id = 'ST_CLERK' and salary between 2000 and 3000
order by 1 desc;

-- employees: with commission_pct, order by first name

select commission_pct, first_name, last_name 
from employees
where commission_pct is not null
order by 2;

-- employees: wiyh phone number including '121' order by hire date 

select phone_number, hire_date, first_name, last_name
from employees
where phone_number like '%121%'
order by 2;

-- employees: hired on 2007 with manager Payam, order by first name
select employee_id, first_name, last_name
from employees
where first_name = 'Payam';

select  hire_date, first_name, last_name, manager_id
from employees
where manager_id = 122 and hire_date between '1-gen-2007' and '31-dic-2007'
order by 2;

