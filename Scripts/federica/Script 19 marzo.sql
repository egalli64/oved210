select *
from countries;

SELECT  first_name, last_name
from employees;

select country_id, country_name
from countries;

select region_name
from regions;

select *
from countries where country_id = 'AR';

select sysdate
from dual;

select table_name
from user_tables;

--Oracle only describe jobs;

--VARCHAR2 (20)
--NUMBER (6), NUMBER (6.2)
--INTEGER
--CHAR (20)
--DATE

SELECT ROWID, region_id, region_name
FROM regions where region_id = 1;

--date
select sysdate - 1
from dual;

select to_date ('30-GEN-2019'), to_date ('30-GEN-2019') + 1, to_date ('30-GEN-2019') - 1
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

select first_name, last_name, commission_pct
from employees
where commission_pct is null;

select first_name, last_name, 12 * salary * commission_pct as "Year Full Salary"
from employees;

--NVL()
select first_name, last_name, NVL(commission_pct, 0) as "Null free commission"
from employees;

--distinct
select distinct manager_id
from employees;

select distinct last_name
from employees;

SELECT *
FROM COUNTRIES; 

--select a single row
SELECT *
FROM EMPLOYEES
WHERE LAST_NAME = 'Austin';

SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID != 100;

SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID < 110;

SELECT *
FROM EMPLOYEES
WHERE FIRST_NAME <= 'Bruce';

SELECT *
FROM REGIONS 
WHERE REGION_ID > ANY(1,2,3);

SELECT *
FROM REGIONS 
WHERE REGION_ID > ALL(1,2,3);

--esercizio:
--employees:
--1)hired on first 6 months 2005;
--2)salary > 5000$
--3)JOB_ID is ST_CLERK

SELECT *
FROM EMPLOYEES
WHERE HIRE_DATE < '01-LUG-2005' AND HIRE_DATE > '30-DIC-2004';

SELECT SALARY, FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE SALARY >= 5000;

SELECT JOB_ID, FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK';

select last_name
from employees
where last_name like 'Ul%';

select last_name
from employees
where last_name like 'Gr%';

select *
from employees
where employee_id in (187, 144,145);


select *
from regions
where region_id not in (2, 3);


--attenzione al null!
select *
from regions
where region_id not in (2, 3, null);
--non si può usare not in con null ma si deve usare not null
select *
from regions
where region_id is not null;

--between
select *
from regions
where region_id between 2 and 3;

--order by
select first_name, last_name, hire_date
from employees
where last_name = 'Grant' or last_name = 'King'
order by last_name asc, first_name desc;

--order by 3
select first_name, last_name, hire_date
from employees
where last_name = 'Grant' or last_name = 'King'
order by 3;

--employees: ST_CLERKS, salary [2000, 3000] higer salary first
select first_name, last_name, salary, job_id
from employees
where job_id = 'ST_CLERK' and salary between 2000 and 3000
order by salary desc;

--employees: with commission_pct, order by first name
select first_name, last_name, commission_pct
from employees
where commission_pct is not null
order by first_name;

--employees: with phone number including '121' order by hire date
select first_name, last_name, phone_number
from employees
where phone_number like '%121%'
order by hire_date;

--employees: hired on 2007 with manager Payam, order by first name
select employees_id, first_name, last_name
from employees
where first_name = 'Payam';

select first_name, last_name, hire_date, manager_id
from employees
where manager_id = 122 and hire_date between '31-dic-2006' and '01-gen-2008'
order by first_name;



