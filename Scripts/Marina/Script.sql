SELECT *
FROM COUNTRIES;
--select country_id, country_name
--from countries

--select first_name, last_name
--from employees;

--select country_id, country_name
--from countries, regions;

-- select a single row
select *
from EMPLOYEES
where EMPLOYEE_ID = 105;

select *
from EMPLOYEES
where EMPLOYEE_ID != 100;

select *
from EMPLOYEES
where EMPLOYEE_ID < 110;

select *
from EMPLOYEES
where FIRST_NAME <= 'Bruce';

select *
from REGIONS
where REGION_ID > ALL(1,2,3);

select *
from REGIONS
where REGION_ID > ANY(1,2,3);

select *
from countries
where country_id = 'AR';

select SYSDATE
from dual

select table_name
from user_tables;

desc jobs;

--varchar2(20)
-- number


select *
from regions
where region_id = 1;

select max_salary, min_salary, (max_salary + min_salary) / 2 as "AVERAGE SALARY"
from jobs
where job_id = 'AD_PRES';

select first_name || ' ' || last_name as "Name"
from employees
where employee_id = 100;

select *
from employees
where employee_id in (144, 145);


select  first_name, last_name, commission_pct
from employees
where commission_pct is not null;

select  first_name, last_name, nvl(commission_pct, 0) as "Null-free commission"
from employees;

select distinct last_name
from employees;

-- employees:

-- 1) hired on first 6 months 2005

SELECT *
FROM EMPLOYEES
WHERE HIRE_DATE >= '01-GEN-05' AND HIRE_DATE <= '01-LUG-05';

-- 2) salary > 5000$

SELECT *
FROM EMPLOYEES
WHERE SALARY >= 5000;

-- 3) job_id is ST_CLERK

SELECT *
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK';

select last_name
from employees
where last_name like '_ul%' or last_name like 'Gr%';


select last_name
from employees
where last_name not like '%a%';

select *
from employees
where employee_id in (144, 145);

select *
from regions
where region_id not in (2, 3);

select employee_id, first_name, last_name, hire_date
from employees
where hire_date > '01-gen-08' or employee_id = 100;

select *
from regions
where region_id not between 2 and 3;

SELECT first_name, last_name, hire_date
FROM EMPLOYEES
WHERE last_name = 'Grant' or last_name = 'King'
order by last_name asc, first_name desc;

SELECT first_name, last_name, hire_date
FROM EMPLOYEES
WHERE last_name = 'Grant' or last_name = 'King'
order by 3 desc;

-- employees: ST_CLERKS, SALARY [2000,3000], higher salary first

SELECT first_name, last_name, salary
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK' and salary between 2000 and 3000
order by 3 desc;

-- employees: with commission_pct, order by first name
SELECT first_name, commission_pct
FROM EMPLOYEES
where commission_pct is not null
order by 1 asc;

-- employees: with phone number including 121 order by hire date
SELECT first_name, last_name, phone_number, hire_date
FROM EMPLOYEES
WHERE phone_number like '%121%'
order by 4 asc;

-- employees: hired on 2007 with manager Payam, by first_name
select employee_id, first_name, last_name
from employees
where first_name = 'Payam';

SELECT first_name, last_name, hire_date, manager_id
FROM EMPLOYEES
WHERE hire_date between '01-gen-2007' and '31-dic-2007' and manager_id = 122
order by 1 asc;

