-- subquery
select employee_id
from employees
where first_name = 'Steven' and last_name = 'King';

select employee_id, first_name, last_name, manager_id
from employees
where manager_id = 100;

select employee_id, first_name, last_name
from employees
where manager_id = (
	select employee_id
	from employees
	where first_name = 'Steven' and last_name = 'King'
);

-- using IN for many values returned by subquery
select employee_id, first_name, last_name
from employees
where manager_id in (
	select employee_id
	from employees
	where last_name = 'King'
);

-- salary average is 6461.83
select avg(salary)
from employees;

select employee_id, first_name, last_name, salary
from employees
where salary > 6461.83
order by 4 desc;

select employee_id, first_name, last_name, salary
from employees
where salary > (
	select avg(salary)
	from employees
)
order by 4 desc;

-- avg salary by dept
select department_id, round(avg(salary))
from employees
group by department_id
order by 2 desc;

-- avg salary by dept excluding the highest averaged department
select department_id, round(avg(salary))
from employees
group by department_id
having avg(salary) < (
	select max(avg(salary))
	from employees
	group by department_id
)
order by 2 desc;

select department_id, round(avg(salary))
from employees
group by department_id
having avg(salary) > (
	select avg(avg(salary))
	from employees
	group by department_id
)
order by 2 desc;


select first_name
from (
	select employee_id, first_name, last_name
	from employees
	where employee_id between 112 and 115
)
where last_name like 'P%';

select r.region_name, c.country_count
from regions r natural join (
	select region_id, count(rowid) as country_count
	from countries
	group by region_id
) c;

-- managers of Jennifer(s)
select manager_id
from employees
where first_name = 'Jennifer';


select employee_id, first_name, last_name
from employees
where employee_id in (
	select manager_id
	from employees
	where first_name = 'Jennifer'
);

-- non managers
select distinct manager_id
from employees
where manager_id is not null;

select employee_id, first_name, last_name
from employees
where employee_id not in (
	select distinct manager_id
	from employees
	where manager_id is not null
)
order by 2, 3;

select manager_id, employee_id
from employees

-- department name, city, and state province for each department
select department_name, city, state_province
from departments natural join locations
order by 1;

-- employees first name, last name, department number and name
select first_name, last_name, department_id, department_name
from employees left join departments
using(department_id);

-- first name, last name, and department number
-- for those employees who works in the same department as Taylor
select first_name, last_name, department_id
from employees
where department_id in (
	select department_id
	from employees
	where last_name = 'Taylor'
);


-- full name (first and last name ) of employee,
-- and starting date for all the jobs which
-- started on or after 1st January, 1993
-- and ending with on or before 31 August, 1997
select first_name, last_name, hire_date
from employees
where hire_date between '01-Gen-03' and '31-Ago-07'
order by 3;

-- name of the department, average salary and
-- number of employees working in that department who got commission
select department_id, round(avg(salary))
from employees
group by department_id;

select department_name
from employees join departments
using(department_id);

SELECT department_name, round(AVG(salary)), COUNT(commission_pct) 
FROM departments 
JOIN employees USING (department_id) 
GROUP BY department_name;