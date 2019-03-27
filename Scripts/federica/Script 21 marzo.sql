select last_name, lpad('*', salary/1000, '*') as "salary in asterisk"
from employees
order by employee_id;

--create a report that produces the following for each employee:
--<employee last_name> earns
select last_name || ' earns ' || salary || ' monthly but wants ' || to_char((salary*3), 'fm$99G999D0') as "dream salary"
from employees
order by last_name;

--last_name, commission
select last_name, nvl(to_char(commission_pct), 'No Commission') as "COMM"
from employees
order by 1;

--sysdate
select employee_id, hire_date, to_char(hire_date, 'MONTH DD, YYYY')
from employees;

select to_char(sysdate, 'DD MONTH YYYY HH24:MI:55')
from dual;

select to_date('12 Gennaio 1944', 'DD MONTH YYYY'), to_date('7.4.18', 'MM.DD.YY')
from dual;

select last_date('01-FEB-16')
from dual;

select months_between(sysdate,'01-FEB-16')
from dual;

select next_day('01-FEB-16', 'LUNEDI')
from dual;

select round(to_date('01-FEB-16'), 'YYYY'),
       trunc(to_date('25-OTT-19'), 'YYYY')
from dual;

--employees: hire date the first monday 6 months from now
select last_name, to_char(sysdate, 'fmDay", the "ddspth" of "Month", "YYYY') as "REVIEW"
from employees
order by 1;

select max(salary), min(salary), sum(salary), round(avg(salary))
from employees;

select job_id, max(salary) as "Maximum", min(salary) as "Minimum", sum(salary) as "Sum", round(avg(salary)) as "Average"
from employees
group by job_id
order by job_id;

select job_id, count(employee_id) as "Count"
from employees
group by job_id;

select count(manager_id)
from employees;

select max(salary) - min(salary) as "Difference" 
from employees;

select manager_id, min(salary)
from employees
group by manager_id
having min(salary) >= 6000 and manager_id is not null
order by 2 desc;

select location_id, street_address, city, state_province, country_name
from locations natural join countries;

select last_name, department_id, department_name
from employees join departments
using (department_id)
order by department_id;

select last_name, job_id, department_id, department_name
from employees join departments
using (department_id)
join locations
using(location_id)
where city = 'Toronto';

select last_name as "Employee", employee_id as "Emp#", last_name as "Manager", manager_is as "Man#"
from employees emp self join employees mng
on(emp.manager_id = mng.employee_id);

