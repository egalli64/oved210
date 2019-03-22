--select country_id, country_name
--from countries;

--select first_name, last_name
--from employees;

select country_id, country_name
from countries;

select region_name
from regions;

select *
from countries
where country_id = 'ar';

-- dual table to read sysdate (and more)
select sysdate
from dual;

select 2 + 2
from dual;

-- user_tables
select table_name
from user_tables;

-- oracle only
-- describe jobs;

-- varchar2(20)
-- number(6,2), number(6), integer
-- char(20)
-- data

select rowid, region_id, region_name
from regions
where region_id = 1;

-- date
select sysdate, sysdate - 1
from dual;

select to_date('30-gen-19'), to_date('30-gen-19') + 1, to_date('30-gen-19') + 2
from dual;

select max_salary, min_salary,(max_salary + min_salary) / 2 as "average salary"
from jobs
where job_id = 'ad_pres';

-- concatenation
select first_name || ' ' || last_name as "name"
from employees
where employee_id = 100;

select first_name, last_name, commission_pct
from employees
where commission_pct is not null;

select first_name, last_name, commission_pct
from employees
where commission_pct is null;

select first_name, last_name, 12 * salary * commission_pct as "year full salary"
from employees;

-- nvl()
select first_name, last_name, nvl(commission_pct, 0) as "null-free commission"
from employees;

-- distinct
select distinct manager_id
from employees;

select distinct last_name
from employees;

-- select a single row
select *
from employees
where last_name = 'king';

select *
from employees
where employee_id != 100;

select *
from employees
where employee_id < 110;

select *
from employees
where first_name <= 'bruce';

select *
from regions
where region_id > any(1, 2, 3);

select *
from regions
where region_id > all(1, 2, 3);

-- employees:
-- 1) hired on first 6 months 2005
select first_name, last_name, hire_date
from employees
where hire_date >= '01-gen-05' and hire_date < '01-lug-05';

-- 2) salary > 5000$
select first_name, last_name, salary
from employees
where salary >= 5000;

-- 3) job_id is st_clerk
select first_name, last_name, job_id
from employees
where job_id = 'ST_CLERK';

---

-- like _ %
select last_name
from employees
where last_name like '_ul%' or last_name like 'Gr%';

select last_name
from employees
where last_name not like '%a%';

select *
from employees
where employee_id in (107, 144, 145);

select *
from regions
where region_id not in (2, 3);

-- pay attention to null!
select *
from regions
where region_id not in (2, 3, null);

select *
from regions
where region_id is not null;

-- between
select *
from regions
where region_id between 2 and 3;

-- and
select first_name, last_name, hire_date
from employees
where hire_date >= '01-gen-05' and hire_date < '01-lug-05';

-- or
select employee_id, first_name, last_name, hire_date
from employees
where hire_date > '01-gen-08' or employee_id = 100;

-- not
select *
from regions
where region_id not between 2 and 3;

-- order by
select first_name, last_name, hire_date
from employees
where last_name = 'Grant' or last_name = 'King'
order by last_name asc, first_name desc;

select first_name, last_name, hire_date
from employees
where last_name = 'Grant' or last_name = 'King'
order by 3 desc;

-- employees: ST_CLERK, salary [2000, 3000] higher salary first
select first_name, last_name, salary
from employees
where salary between 2000 and 3000 and job_id = 'ST_CLERK'
order by salary desc;

-- employees: with commission_pct, order by first name
select first_name, last_name, commission_pct
from employees
where commission_pct is not null
order by first_name;

-- employees: with phone number including '121' order by hire date
select first_name, last_name, phone_number, hire_date
from employees
where phone_number like '%121%'
order by hire_date;


-- employees: hired on 2007 with manager Payam, by first name
select employee_id, first_name, last_name
from employees
where first_name = 'Payam';

select first_name, last_name, hire_date, manager_id
from employees
where hire_date between '01-gen-07' and '31-dic-07' and manager_id = 122
order by first_name;
