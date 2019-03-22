select employee_id, last_name, job_id, to_char(hire_date) as "STARTDATE"
from employees
order by employee_id;

---
select distinct job_id
from employees;

---
select employee_id as "Emp#", 
       last_name as "Employee", 
       job_id as "Job", 
       to_char(hire_date) as "Hire Date"
from employees
order by employee_id;

---
select last_name || ', ' || job_id as "Employee and Title"
from employees;

---
select employee_id || ', ' || first_name || ', ' || last_name || ', ' || email || ', ' || phone_number || ', ' || hire_date || ', ' || job_id || ', ' || salary || ', ' ||
       commission_pct || ', ' || manager_id || ', ' || department_id as "THE OUTPUT"
from employees;

---
select last_name, salary
from employees
where salary > 12000;

---
select last_name, department_id
from employees
where employee_id = 176;

--- 
select last_name, salary
from employees
where salary not between 5000 and 12000
order by 2 desc;

---
select first_name, last_name, job_id, hire_date
from employees
where last_name = 'Matos' or last_name = 'Taylor'
order by 3 asc;

---
select last_name, department_id
from employees
where department_id = 50 or department_id = 20
order by 1;

---
select last_name, salary, department_id
from employees
where salary between 5000 and 12000 and (department_id = 20 or department_id = 50)
order by 2 desc;

--- 
select last_name, to_char(hire_date)
from employees
where hire_date between '01-Gen-05' and '31-dic-05'
order by 1;

---
select last_name, job_id
from employees
where manager_id is null;

---
select last_name, salary, commission_pct
from employees
where commission_pct is not null
order by salary desc, commission_pct desc;

---
select employee_id, last_name, salary, department_id
from employees
where manager_id = 103
order by 2;

---
select last_name
from employees
where lower(last_name) like '%a%' and lower(last_name) like '%e%';

---
select last_name, job_id, salary
from employees
where job_id in ('SA_REP', 'ST_CLERK') 
  and salary not in (2500, 3500, 7000)
 order by salary;

---
select to_char(sysdate) as "Date"
from dual;

---
select employee_id, last_name, salary, trunc(salary + ((salary * 15.5)/100)) as "New Salary"
from employees
order by 1;

---
select employee_id, last_name, salary, round(salary + ((salary * 15.5)/100)) as "New Salary", round((salary * 15.5)/100) as "Increse"
from employees
order by 1;

---
select last_name as "Name", length(last_name) as "Length" 
from employees
where last_name like 'H%';

---
select round(months_between(sysdate, '01-gen-19'))
from dual;

---
select last_name, round(months_between(sysdate , hire_date)) as "MONTHS_WORKED"
from employees
order by 2 desc;

---
select last_name, lpad(salary, 15, '$') as "SALARY"
from employees
order by employee_id;

---
select last_name, lpad ('*', salary/1000, '*') as "SALARY_IN_ASTERISK"
from employees
order by salary desc;

---
select last_name, trunc((sysdate - hire_date)/7) as "TENURE"
from employees
where department_id = 90
order by 2 desc;

---
select  last_name || ' earns ' || to_char(salary, '$99,999.99') || ' monthly but wants ' ||
        to_char((salary*3), '$99,999.99') as "DREAM_SALARIES"
from employees
order by 1;

---
select last_name, nvl(to_char(commission_pct), 'No Commission') as "COMM"
from employees
order by 2;

--
select employee_id, hire_date, to_char(hire_date, 'MONTH DD, YYYY')
from employees;

select to_char(sysdate, 'DD MONTH YYYY HH24:MI:SS')
from dual;

select to_date ('12 Gennaio 1944', 'DD MONTH YYYY'), to_date('7.4.18', 'MM.DD.YY')
from dual;

select to_char(to_date('05-feb-2019 19:32:18', 'DD-MON-YYYY HH24:MI:SS'), 'HH24:MI.SS')
from dual;

select sysdate, add_months(sysdate, 13)
from dual;

select last_day('01-FEB-2016')
from dual;

select months_between(sysdate, '15-GEN-01')
from dual;

select next_day('01-GIU-19', 'LUNEDI')
from dual;

select round(to_date ('25-OTT-19'), 'YYYY'), trunc(to_date ('25-OTT-19'), 'YYYY')
from dual;

-- select last_name, to_char(hire_date) AS "HIRE_DATE", 'the ' || to_char(next_day(add_months(hire_date, 6), 'Lunedi'), 'fmDay') || ' , ' || to_char(add_months(hire_date, 6), 'fmDdSP" of "Month" , "YYYY') as "REVIEW"
select last_name, to_char(hire_date) AS "HIRE_DATE",
                  to_char(next_day(add_months(hire_date, 6), 'Lunedi'), 'fmDay" , the "ddspth" of "Month" , "YYYY') as "REVIEW"
from employees;

---
select job_id, max(salary) as "Maximum", min(salary) as "Minimum", sum(salary) as "Sum", round(avg(salary)) as "Average"
from employees
group by job_id
order by job_id;

---
select job_id, count(employee_id) as "Count"
from employees
group by job_id;



---
select count(distinct manager_id) as "NUMBER OF MANAGER"
from employees;

---
select max(salary) - min(salary) as difference
from employees;

---
select manager_id, min(salary)
from employees
group by manager_id
having min(salary) > 6000 and manager_id is not null
order by 2 desc;

---
select location_id, street_address, city, state_province, country_name
from locations natural join countries;

---
select last_name, department_id, department_name
from employees join departments 
using (department_id);

---
select last_name, job_id, department_id, department_name
from employees join departments
using(department_id)
join locations
using(location_id)
where city = 'Toronto';

---
select e.last_name as "Emploee", e.employee_id as "Emp#", m.last_name as "Manager", m.manager_id as "Man#"
from employees e join employees m
on (m.employee_id = e.manager_id)
order by 3 , 1;











