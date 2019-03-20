
-- jobs where min salary in [2000, 5000] ordered by job title
 select
	min_salary,
	job_title
from
	jobs
where
	min_salary between 2000 and 5000
order by
	job_title;
-- all countries in region Europe
-- First step: region id for Europe
 select
	region_id
from
	regions
where
	region_name = 'Europe';
-- Second step: european countries
 select
	country_name
from
	countries
where
	region_id = 1;
-- cross join (prodotto cartesiano)
 select
	country_name,
	region_name
from
	countries c,
	regions r;
-- cross join modern
 select
	country_name,
	region_name
from
	countries c
cross join regions r;
-- natural join classic
 select
	country_name
from
	countries c,
	regions r
where
	c.region_id = r.region_id
	and region_name = 'Europe';
-- natural join modern
 select
	country_name,
	region_name
from
	countries natural
join regions;
-- modern join
 select
	country_name,
	region_name
from
	countries
join regions
		using(region_id);
-- employees: first name, last name where department name is IT
 select
	first_name,
	last_name,
	department_name
from
	employees
join departments
		using(department_id)
where
	department_name = 'IT';
-- using _on_ for full description of joined columns
 select
	e.first_name,
	e.last_name,
	d.department_name
from
	employees e
join departments d on
	(e.department_id = d.department_id)
where
	department_name = 'IT';

-- self join

select  emp.first_name || ' ' || emp.last_name as "Employee",
	    mng.first_name || ' ' || mng.last_name as "Manager"
from employees emp join employees mng
on(emp.manager_id = mng.employee_id)
order by 1;

-- more than two tables

select e.first_name, e.last_name, l.city, d.department_name
from employees e, departments d, locations l
where e.department_id = d.department_id
  and d.location_id = l.location_id 
 order by 4;

-- modern w/ on

select e.first_name, e.last_name, l.city, d.department_name
from employees e join departments d
on(e.department_id = d.department_id)
join locations l
on(d.location_id = l.location_id) 
order by 4;

-- modern w/ using (only employees based in Oxford)

select e.first_name, e.last_name, l.city, d.department_name
from employees e join departments d
using(department_id)
join locations l
using(location_id) 
where city = 'Oxford'
order by 4;

-- employees having Steven King as a manager,
-- Shipping department
-- order by first name

select e.first_name, e.last_name, d.department_name
from employees e join employees m
on(e.manager_id = m.employee_id)
join departments d
on(d.department_id = e.department_id)
where d.department_name = 'Shipping' and m.first_name = 'Steven' and m.last_name = 'King'
order by e.first_name;

-- null on a FK
select first_name, last_name, department_id
from employees 
where last_name like 'Gr%';

--non compare valore null tra i risultati

select first_name, last_name, department_id
from employees join departments
using(department_id)
where last_name like 'Gr%';

-- per vistualizzare i null 

select first_name, last_name, department_id
from employees left outer join departments
using(department_id)
where last_name like 'Gr%';

-- departments: name and associated manager (when existing) order by name

select first_name, last_name, department_name
from employees e right outer join departments d
on(e.manager_id = d.manager_id)
order by 1;

-- employees: name and manager name

select e.first_name || ' ' || e.last_name as "Employee",
       m.first_name || ' ' || m.last_name as "Manager" ,
       e.salary
from employees e left outer join employees m
on(e.manager_id = m.employee_id)
order by salary desc;

--functions
select ascii ('A') as "A", chr(90) as "Z", ascii('a')
from dual;


-- concat
select concat(first_name, last_name)
from employees
where employee_id = 100;

--instr
select region_name, instr(region_name, 'Middle')
from regions
where region_id = 4;

--length
select region_name, length(region_name)
from regions;

select salary, length(salary), length(100.01)
from employees
where employee_id = 100;

-- upper lower
select upper(first_name), lower(last_name)
from employees
where employee_id = 100;

-- initcap
select initcap(lower(first_name))
from employees
where employee_id = 122;

-- rpad
select rpad('Hello', 30, '.')
from dual;

-- lpad
select lpad ('Hello', 3)
from dual;

-- ltrim rtrim
select ltrim ('       hello'),
       rtrim ('helloAbAb', 'Ab'),
       trim ('0' from '000hello000')
from dual;

-- nvl()
select nvl(commission_pct, 0)
from employees;

select nvl2(commission_pct, 'has commission', 'no commission')
from employees;

-- replace
select job_title, replace(job_title, 'Administration', 'Admin')
from jobs;

-- substr()
select job_title, substr(job_title, 16, 4)
from jobs
where job_id = 'AD_VP';

-- math
select abs(-10), abs(10),
ceil(5.8), ceil (-5.2),
floor(5.8), floor(-5.2),
mod(8, 4), mod(8, 3),
power(2, 1), power(2, 3),
round(5.75), round(5.2),
round (5.75, 1), round (5.75, -1),
sign (-5), sign(5), sign(0),
trunc(5.75), trunc(5.75, 1), trunc(5.75, -1)
from dual;

-- to_char
select to_char(1234.54), to_char(1234.54, '99,999.99'),
       to_char(2019, 'RN')
from dual;

-- to_number
select to_number('970,23' * 2)
from dual;

-- cast
select cast('05-gen-19' as date),
       cast(12345.456 as number(10,2))
from dual;


-- aggregate functions

select avg(salary), variance(salary), stddev(salary)
from employees
order by salary;

select count(*), count(employee_id), count(rowid)
from employees;

select sum(salary), max(salary), min(salary),
       max(first_name), min(first_name),
       max(hire_date), min(hire_date)
from employees;

select avg(salary)
from employees
where department_id = 30;

select department_id
from employees
group by department_id;

select department_id, count(rowid)
from employees
group by department_id
order by 2 desc;

select distinct department_id
from employees
order by 1;

-- employees: group them by location.countr_id, 
-- give average salary

select l.country_id, trunc(avg(salary))
from employees e join departments d
on(e.department_id = d.department_id)
join locations l
on (d.location_id = l.location_id)
group by l.country_id
order by 2 desc;

-- having: filter groups
select manager_id, trunc(avg(salary))
from employees
group by manager_id
having avg(salary) > 8500
order by 2 desc;

-- where: filter on employees
select manager_id, trunc(avg(salary))
from employees
where salary > 8500
group by manager_id
order by 2 desc;

-- filter on employees than on groups of employees
select manager_id, trunc(avg(salary))
from employees
where salary > 6000
group by manager_id
having avg(salary) > 8500
order by 2 desc;



