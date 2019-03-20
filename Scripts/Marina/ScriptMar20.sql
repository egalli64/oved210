-- jobs where min salary in [2000, 5000] ordered by job title

select job_title, job_id, min_salary
from jobs
where min_salary between 2000 and 5000
order by job_title;


-- first step: all countries in region Europe
select region_id
from regions
where region_name = 'Europe';

-- second step : European countries
select country_name
from countries
where region_id = 1;

select *
from countries, regions

-- natural join classic
select country_name
from countries c, regions r
where c.region_id = r.region_id and r.region_name = 'Europe';

-- natural join modern
select country_name
from countries join  regions
using (region_id);

-- natural join explicit
select country_name
from countries natural join regions
where region_name = 'Europe';


-- cross join (prodotto cartesiano)
select country_name
from countries c, regions r;

-- cross join modern
select country_name
from countries c cross join regions r;


-- employees : first name ordered, where department name is IT 

select first_name, last_name
from departments join employees
using (department_id)
where department_name = 'IT'
order by first_name;

select e.first_name, e.last_name
from departments d join employees e 
on (e.department_id = d.department_id)
where department_name = 'IT';

--self join
select e.first_name || ' ' || e.last_name as "Employee",
m.first_name || ' ' || m.last_name as "Manager"
from employees e join employees m
on (e.manager_id = m.employee_id)
order by 1;

-- MORE THAN TWO TABLES:
select e.first_name, e.last_name, d.department_name
from employees e, departments d, locations l
where e.department_id = d.department_id 
and d.location_id = l.location_id
where l.city = 'Oxford'
order by 3;

-- employees having steven king as manager
-- shipping department
--order by name

select first_name, last_name
from employees join departments 
where manager_id = 100 and department_id = 50
order by 1;


select e.first_name, e.last_name
from employees e join employees m
on (e.manager_id = m.employee_id)
join departments d
on (d.department_id = e.department_id)
where m.first_name = 'Steven' and m.last_name = 'King' and d.department_name = 'Shipping'
order by 1;

select first_name, last_name, department_name
from employees join departments 
using (department_id)
where last_name like 'Gr%';

select first_name, last_name, department_name
from employees left outer join departments 
using (department_id)
where last_name like 'Gr%';


-- departments: name and associated manager (when existing), order by name

select d.department_name, e.first_name || ' ' || e.last_name as "Manager"
from departments d left outer join employees e
on (d.manager_id = e.manager_id)
order by 1;

-- employees: employee name and manager name 

select e.first_name || ' ' || e.last_name as "Employee",
m.first_name || ' ' || m.last_name as "Manager", e.salary
from employees e left outer join employees m
on (m.employee_id = e.manager_id)
order by e.salary desc;

-- employees: order by salary
select first_name, last_name, salary
from employees
order by salary desc;

-- functions
select ascii('A'), ascii ('a'), chr(90)
from dual;

select hire_date, instr (hire_date, 'GIU')
from employees
where employee_id = 100;

select region_name, length (region_name)
from regions;

select salary, length (salary)
from employees
where employee_id = 100;

select nvl2 (commission_pct, 'has commission', 'no commission')
from employees;

select sqrt (5)
from dual;

select cast (12345.234 as number (10,2))
from dual;

select avg (salary), avg (distinct salary)
from employees
order by salary;


-- employees: group them by location.country_id, 
-- give average salary

select trunc(avg(e.salary)) as "Average Salary", l.country_id as "Country"
from employees e join departments d
on (e.department_id = d.department_id)
join locations l
on (d.location_id = l.location_id)
group by l.country_id
order by 1;
