SELECT *
FROM countries
-- select country_id, country_name
-- from countries;

-- select first_name, last_name
-- from employees;


select country_id, country_name
from countries;

select region_name
from regions;

select *
from countries
were country_id = 'AR';

select Sysdate
from dual

select 2 + 2
from dual

-- user tables
select table_name
from user_tables;


describe jobs;


--varchar2(20)
--number(6,2),  umber(6,0)
-- integer
--char(20)
--date


select rowid, region_id, region_name
from regions
where region_id = 1

--data
select sysdate, sysdate - 1
from dual;

select to_date('30_GEN_19')
from dual

-- Consente operazioni sulle date
select to_date('30_GEN_19'), to_date ('30_Gen_19') + 1, to_date('30_gen_19') + 2
from dual

-- se voglio fare un alias devo usare ""
select max_salary, min_salary,(max_salary + min_salary) / 2 as "AVERAGE SALARY"
from jobs;
where job_id = 'AD_PRESIDENT';


select first_name || ' ' || last_name as "Name"
from employees
where employee_id = 100;

--per individuare le specifiche di un dipendente
select *
from employees
where employee_id in(144, 145)

--per quelli che hanno le provvigioni
select first_name, last_name, commission_pct
from employees
where commission_pct is not null

--per quelli che non hanno provvigioni
select first_name, last_name, commission_pct
from employees
where commission_pct is null

--si intende il compenso totale tra provvigione e stipendio all'anno, ma essendo alcuni senza oprovvigioni(moltiplicando x null esce null)
select first_name, last_name, 12* salary * commission_pct as "year full salary"
from employees


--NVL(Null Value)

--questa funzione serve come sostituto di if
salect first_name, last_name, nvl(commission_pct, 0) as "Null-free commission"
from employees

--distinct
select distinct manager_id
from employees;

select distinct last_name
from employees;

--select
select *
from EMPLOYEES
where LAST_NAME = "king";

select *
from EMPLOYEES
where EMPLOYEE_ID != 100;


select *
from EMPLOYEES
where EMPLOYEE_ID < 110;


select *
from EMPLOYEES
where FIRST_NAME < "Bruce";

select *
from regions
where region_id > amy {1, 2, 3};

select *
from REGIONS
WHERE REGION_ID > all{1, 2, 3};

-- EMPLOYEES;
1) hired on first 6 months 2005
2) salary > 5000 $
3) JOB_ID is ST_CLEAR



SELECT *
FROM EMPLOYEES
WHERE HIRE_DATE >= '1-GEN-2005' AND HIRE_DATE < '1-LUG-2005'; 

SELECT *
FROM EMPLOYEES
WHERE SALARY >= 5000;

select first_name, last_name, job_id
from employees
where job_id = 'ST_CLERK';


--like %
select last_name
from employees
where last_name like '_ul%'or last_name like 'Gr%';

select last_name
from employees
where last_name not like '%a%';


select *
from regions
WHERE REGION_ID iN (107, 144, 145);

-- pay attention to null
select *
from regions
WHERE region_id not iN (2, 3);

select *
from regions
WHERE REGION_ID not iN (2, 3, null);

-- pay attention to null
select *
from regions
WHERE region_id is not null;


--between
select *
from regions
where region_id between 2 and 3;

--or
SELECT employee_id, first_name, last_name, hire_date
FROM EMPLOYEES
WHERE HIRE_DATE >= '1-GEN-08' or employee_id = 100; 


--not 
select *
from regions
where region_id not between 2 and 3;


--order by
SELECT first_name, last_name, hire_date
from employees
WHERE last_name = 'Grant' or last_name = 'King'
order by last_name asc, first_name desc;

select first_name, last_name, hire_date
from employees
where last_name = 'Grant' or last_name = 'King' 
order by 3;

-- employees; ST_CLEAR, salary [2000. 3000] higher salary first
--

select first_name, last_name, salary
from employees
where job_id = 'ST_CLERK' and salary between 2000 and 3000
order by salary desc;

--EMPLOYEES: WITH COMMISSION_PCT, ORDER BY FIRST NAME (% COMMISSIONI ORDINATI X COGNOME)

select first_name, last_name, commission_pct
from employees
where commission_pct is not null
order by first_name;

-- NUMERO TELFONO ORDINATI PER 121 E E ORDINATI PER DATA ASSUNZIONE

select first_name, last_name, phone_number, hire_date
from employees
where phone_number like '%121%'
order by hire_date;

--employees hired on 2007 with manager Payam, by first_name

select employee_id, first_name, last_name
from employees
where first_name = 'Payam';

select first_name, last_name, hire_date, manager_id
from employees
where hire_date between '01 gen 07' and '31 dic 07' and manager_id = 122
order by first_name;






is null
--permette di controllare se un campo è null o meno


