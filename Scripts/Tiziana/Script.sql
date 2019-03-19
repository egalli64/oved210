--select country_id,country_name
--from countries;


select first_name,last_name 
from employees;


select country_id,country_name
from countries;


select regions_name
from regions;


select *
from countries
where country_id='AR';


select 2+2
from dual;


--user tables
select table_name
from user_tables;


describe jobs;

--varchar2(20)
--numer(6,2), number(6), integer
--char(20)
--data

select rowid, region_id, region_name
from regions
where region_id =1;


--date
select sysdate, sysdate-1
from dual;


select to_date('30-gen-19'),to_date('30-gen-19')+1 
from dual;


select max_salary, min_salary,(max_salary + min_salary)/2 as "Average Salary"
from jobs
where job_id = 'AD_PRES';


--Concatenation
select first_name || ' ' || last_name as "Name"
from employees
where employee_id = 100;


select*
from employees
where employee_id in(144,145);


select first_name, last_name, commission_pct
from employees
where commission_pct is not null;


select first_name, last_name, commission_pct
from employees
where commission_pct is null;


select first_name, last_name, 12*salary* commission_pct as "Year Full Salary"
from employees;


--NVL()
select first_name, last_name, nvl(commission_pct, 0) as "Null_free commission"
from employees;


--distinct
select distinct manager_id
from employees;


select distinct last_name
from employees;

--select a single row
SELECT *
FROM EMPLOYEES
WHERE LAST_NAME 'King';


SELECT*
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 100;

SELECT*
FROM EMPLOYEES
WHERE EMPLOYEE_ID != 100;


SELECT*
FROM EMPLOYEES
WHERE EMPLOYEE_ID < 110;


SELECT*
FROM EMPLOYEES
WHERE first_name <= 'Bruce';


SELECT*
FROM REGIONS
WHERE REGION_ID > any(1,2,3);


SELECT*
FROM REGIONS
WHERE REGION_ID > all(1,2,3);

--employees:
--1) hired on first 6 months 2005;
--2) salary> 5000$
--3) job_id is ST_CLERK

SELECT*
FROM EMPLOYEES
WHERE HIRE_DATE <= '30-GIU-2005' AND HIRE_DATE >= '1-GEN-2005';

SELECT*
FROM EMPLOYEES
WHERE SALARY >= 5000;

SELECT*
FROM EMPLOYEES
WHERE JOB_ID = 'ST_CLERK';

--------

--like_%
select last_name
from employees
where last_name like'_ul%' or last_name 'Gr%';

select last_name
from employees
where last_name not like '%a%';

select*
from employees
where employee_id in(144,145);

select*
from regions
where region_id not in(2,3);


--pay attention to null!
select*
from regions
where region_id not in(2,3,null);

select*
from regions
where region_id is not null;

--between
select*
from regions
where region_id between 2 and 3;

--and
SELECT*
FROM EMPLOYEES
WHERE HIRE_DATE <= '30-GIU-2005' AND HIRE_DATE >= '1-GEN-2005';

--or
select first_name, last_name, hire_date
from employees
where hire_date >= '01-gen-05' or employee_id = 100;


--not
select* 
from regions
where region_id not between2 and 3;


--order by
SELECT*
FROM EMPLOYEES
WHERE HIRE_DATE <= '30-GIU-2005' AND HIRE_DATE >= '1-GEN-2005'
order by last_name;


--order by
select first_name, last_name, hire_date
from employees
where last_name='Grann' or last_name='King'
order by last_name asc, first_name desc;


select first_name, last_name, hire_date
from employees
where last_name='Grant' or last_name='King'
order by 3 desc;


--employees: ST_CLERKS, salary[2000,3000] higer salary first
select first_name, last_name, salary
from employees
where job_id = 'ST_CLERK' and salary between 2000 and 3000
order by 3 desc;

--oppure così
--select first_name, last_name, salary
--from employees
--where job_id = 'ST_CLERK' and salary<=3000 and salary>=2000
--order by 3 desc;


--employees:with commission_pct, order by first name
select first_name, last_name, commission_pct
from employees
where commission_pct is not null 
order by 1;

--employees:with phone number including'121' order by hire date
select first_name, last_name, phone_number, hire_date
from employees
where phone_number like '%121%'
order by 3;

--employees:hired on 2007 with manager Payam, by first name
select first_name,last_name,hire_date, manager_id
from employees
where hire_date between '01-gen-2007' and '31-dic-2007' and manager_id = 122
order by 1;












