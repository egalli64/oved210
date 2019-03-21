-- 1.2
select employee_id, last_name, job_id, to_char(hire_date) as "STARDATE"
from employees
order by employee_id;

--1.3 display all unique job IDs from EMPLOYEES
select distinct job_id
from employees
order by 1;

--1.4
select employee_id as "Emp #",
	last_name as "Employee",
	job_id as "Job",
	to_char(hire_date) as "Hire Date"
from employees
order by employee_id;

--1.5. Employees: last name concatenated with the job ID
-- (separated by a comma and space)
-- and name the column Employee and Title.
select (last_name || ', ' || job_id) as "Employee and Title"
from employees;

--1.6. employees: display all the data
-- Separate each column output by a comma. Name the column THE_OUTPUT.
select (
    employee_id || ',' ||
    first_name || ',' ||
    last_name || ',' ||
    email || ',' ||
    phone_number || ',' ||
    hire_date || ',' ||
    job_id || ',' ||
    salary || ',' ||
    commission_pct || ',' ||
    manager_id || ',' ||
    department_id ) as "THE_OUTPUT"
from employees
order by employee_id;

-- 2.1
select last_name, salary
from employees
where salary > 12000
order by 2 desc;

-- 2.2
select last_name, department_id
from employees
where employee_id = 176;

-- 2.3
select last_name, salary
from employees
where salary not between 5000 and 12000
order by 2 desc;

-- 2.4
select first_name, last_name, job_id, hire_date
from employees
where last_name = 'Matos' or last_name = 'Taylor'
order by hire_date asc;

-- 2.5
select last_name, department_id
from employees
where department_id = 20 or department_id = 50
order by last_name;

-- 2.6
select last_name, salary
from employees
where salary between 5000 and 12000
  and (department_id = 20 or department_id = 50)
order by 2 desc;

-- 2.7
select last_name, hire_date
from employees
where hire_date between '01-GEN-05' and '31-DIC-05'
order by 1;

-- 2.8
select last_name
from employees
where manager_id is null;

-- 2.9
select last_name, salary, commission_pct
from employees
where commission_pct is not null
order by 2 desc, 3 desc

-- 2.11
select employee_id, last_name, salary, department_id
from employees
where manager_id = 103
order by 2;

-- 2.12
select last_name
from employees
where lower(last_name) like '%a%' and lower(last_name) like '%e%'
order by 1;

-- 2.13
select last_name, job_id, salary
from employees
where job_id in ('SA_REP', 'ST_CLERK')
  and salary not in (2500, 3500, 7000)
order by 3 desc;

-- 3.1
select to_char(sysdate) as "Date"
from dual;

-- 3.2
select employee_id, last_name,
	salary,
	round(salary + salary * 0.155) as "New Salary"
from employees
order by 1;

--3.3
select employee_id, last_name, salary,
    round(salary + salary * 0.155) as "New Salary",
    round(salary * 0.155) as "Increase"
from employees
order by 1;

--3.4
select last_name as "Name", length(last_name) as "Length"
from employees
-- where substr(last_name, 0, 1) = upper('h');
where last_name like 'H%';


--3.5
select round(months_between(sysdate, '01-GEN-19'))
from dual;

select last_name,
	round(months_between (sysdate, hire_date)) as months_worked
from employees
order by 2 desc;

--3.6
select last_name, lpad(salary, 15, '$') as salary
from employees
order by employee_id;

select sysdate - hire_date
from employees;


--3.7
select last_name,
	lpad('*', salary / 1000, '*') as "salaries in asterisk"
from employees
order by salary desc;

--3.8
select last_name,
	trunc((sysdate - hire_date)/7) as tenure
from employees
where department_id = 90
order by 2 desc;


select to_char(salary, '$99G999D00'), to_char(salary, 'fmL99G999D00')
from employees;

select last_name, nvl(to_char(commission_pct), 'missing')
from employees;

----

select sysdate
from dual;

select employee_id, hire_date, to_char(hire_date, 'MONTH DD, YYYY')
from employees;

select to_char(sysdate, 'DD MONTH YYYY HH24:MI:SS')
from dual;

select to_date('12 Gennaio 1944', 'DD MONTH YYYY'), to_date('7.4.18', 'MM.DD.YY')
from dual;

select to_char(
	to_date('05-FEB-2019 19:32:18', 'DD-MON-YYYY HH24:MI:SS'),
--	'HH24:MI:SS')
	'MON')
from dual;

select sysdate, add_months(sysdate, 13) 
from dual;

select last_day('01-FEB-2016')
from dual;

select months_between(sysdate, '15-GEN-01')
from dual;

select next_day('01-GIU-19', 'LUNEDI')
from dual;

select round(to_date('25-OTT-19'), 'YYYY'),
	trunc(to_date('25-OTT-19'), 'YYYY')
from dual

----

-- the day 6 months in the future from now
select hire_date, add_months(hire_date, 6)
from employees
where employee_id = 100;

-- the first monday 6 months from now
select hire_date, next_day(add_months(hire_date, 6), 'lunedì')
from employees;

-- day of week
select to_char(sysdate, 'Day')
from dual;

select to_char(sysdate, 'ddspth')
from dual;

select to_char(sysdate, 'Month')
from dual;

SELECT TO_CHAR(SYSDATE, '"In month "RM" of year "YEAR')
FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'fmDay", the "ddspth" of "Month", "YYYY')
FROM DUAL;

----------
-- 1.

select max(salary), min(salary), sum(salary), round(avg(salary))
from employees;

-- 2.
select job_id,
	max(salary), min(salary), sum(salary), round(avg(salary))
from employees
group by job_id;

-- 3.
select job_id, count(employee_id)
from employees
group by job_id;

select count(distinct manager_id)
from employees;

select count(manager_id)
from employees
group by manager_id;

-- 5.
select max(salary) - min(salary)
from employees;

-- 6.
select manager_id, min(salary)
from employees
having manager_id is not null and min(salary) > 6000
group by manager_id
order by 2 desc;

---
-- 2.1
select location_id, street_address, city, state_province, country_name
from locations natural join countries;

-- 2.2
select last_name, department_id, department_name
from employees join departments
using(department_id)
order by department_id;

-- 2.3
select last_name, job_id, department_id, department_name
from employees join departments
using(department_id)
join locations
using(location_id)
where city = 'Toronto';

-- 2.4
select e.last_name, e.employee_id, m.last_name, m.department_id
from employees e join employees m
on(e.manager_id = m.employee_id)
order by 3, 1


