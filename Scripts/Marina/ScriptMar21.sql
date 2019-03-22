-- employees : employee id / last name / job_id /hire date -> rename "Startdate"

select employee_id, last_name, job_id, to_char(hire_date) as "STARTDATE"
from employees
order by 1;

select distinct job_id
from employees;

select employee_id as "Emp #", last_name as "Employee", job_id as "Job", to_char(hire_date) as "Hire Date"
from employees
order by 1;

select last_name || ', ' || job_id as "Employee and Title"
from employees;

select employee_id || ', ' || first_name || ', ' || last_name || ', ' || email || ', ' || phone_number || ', ' ||to_char(hire_date) || ', ' || job_id || ', ' || salary || ', ' || commission_pct || ', ' || manager_id || ', ' || department_id  as "The Output"
from employees;

-- last name, salary from employees who earn more than 12,000 dollars

select last_name, salary
from employees
where salary > 12000
order by salary desc;

-- last_name and department_id for employee n.176

select last_name, department_id
from employees
where employee_id = 176;

-- employees with salary < 5000 and < 12000

select last_name, salary
from employees
where salary not between 5000 and 12000
order by salary desc;

select first_name, last_name, job_id, to_char(hire_date)
from employees
where last_name = 'Matos' or last_name = 'Taylor'
order by hire_date asc;

select last_name, department_id
from employees
where department_id = 20 or department_id = 50
order by last_name asc;

select last_name as "Employee", salary as "Monthly Salary"
from employees
where salary between 5000 and 12000 and (department_id = 20 or department_id = 50)
order by salary desc;

select last_name, hire_date
from employees
where hire_date >= '01-GEN-05' and hire_date <= '31-DIC-05'
order by last_name;

select last_name, job_id
from employees
where manager_id is null;

select last_name, salary, commission_pct
from employees
where commission_pct is not null
order by salary, commission_pct desc;


select employee_id, last_name, salary, department_id
from employees
where manager_id = 103
order by last_name;

select last_name
from employees
where lower(last_name) like '%e%' or lower(last_name) like '%a%';


select last_name, job_id, salary
from employees
where job_id = 'ST_CLERK' or job_id= 'SA_REP' 
and (salary != 2500 or salary != 3500 or salary !=7000);


select last_name, job_id, salary
from employees
where job_id in ('ST_CLERK', 'SA_REP')
and salary not in (2500, 3500, 7000)
order by 3 desc;

select to_char(sysdate) as "Date"
from dual;

select employee_id, last_name, salary, round(salary + (salary * 15) / 100) as "New Salary", round(salary*15/100) as "Increase"
from employees
order by 1;

select last_name, length(last_name)
from employees
where last_name like 'H%';

select last_name, round(months_between (sysdate, hire_date)) as "Months worked"
from employees
order by 2 desc;

select last_name, lpad(salary, 15, '$') as "Salary"
from employees;

select last_name, lpad('*', round(salary/1000), '*') as Salary_in_asterisk
from employees
order by 2 desc;

select last_name, trunc((sysdate - hire_date)/7) as tenure
from employees
where department_id = 90
order by 2;

select last_name || ' earns ' || salary || ' monthly but wants ' || to_char (salary*3, '$99,999.99') as "Dream Salaries"
from employees;


select last_name, nvl(to_char(commission_pct), 'No Commission') as comm
from employees;

select last_name, hire_date as Hire_Date, 
to_char (next_day(add_months(hire_date, 6), 'LUN'), 'fmDay ", the " ddspth "of " Month ", "YYYY')  as Review
from employees;

SELECT job_id, max(salary) as Maximum, min(salary) as Minimum, sum(salary) as Sum, round(avg(salary)) as Average
from employees
group by job_id;

select job_id , count(employee_id) as Count
from employees
group by job_id;

select count (distinct manager_id) as "Number of Managers"
from employees;


select (max(salary) - min (salary)) as difference
from employees;

-- manager id and employer with lowest salary


select manager_id, min(salary)
from employees
group by  manager_id
having min(salary) > 6000 and manager_id is not null
order by 2;


select location_id, street_address, state_province, country_name
from locations natural join countries
order by 1;

select last_name, department_id, department_name
from employees join departments
using (department_id)
order by 1;

select e.last_name, e.job_id, d.department_id, d.department_name
from employees e join departments d
on (e.department_id = d.department_id)
join locations l
on (d.location_id = l.location_id)
where l.city = 'Toronto';

select e.employee_id as "Emp#" , e.last_name as "Employee", m.manager_id as "Mng#", m.last_name as "Manager"
from employees e join employees m
on (e.manager_id = m.employee_id)
where m.manager_id is not null
order by m.manager_id;
