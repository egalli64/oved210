--employees: employee_id;last name, job_id; hire data=STARDate

select employee_id,last_name,job_id,hire_date as "STARDATE"
from employees 
order by employee_id;

---display all unique job IDs from employees:
select  distinct job_id
from employees;

--
select employee_id as"EMP#",last_name as"Employee",job_id as "Job",hire_date as "Hire Date"
from employees 
order by employee_id;


select (last_name||',''|| job_id) as "Employee and Title"
from employees;

select (employee_id||','||
first_name||','||
last_name||','||
email||','||
phone_number||','||
hire_date||','||
job_id||','||
salary||','||
manager_id ||','||
department_id) as "THE_OUTPUT"
from employees ;

select last_name, salary
from employees
where salary>12000
order by 2 desc;

select last_name, department_id
from employees
where employee_id=176;

-- il salario non è tra 5000 e 12000:
select last_name, salary
from employees
where salary not between 5000 and 12000
order by 2 desc;

--
select last_name, job_id, hire_date
from employees
where last_name = 'Matos' or  last_name='Taylor'
order by hire_date asc;

select last_name, department_id
from employees
where department_id ='20' or department_id='50'
order by last_name ;

select Last_name, salary
from employees
where salary  between 5000 and 12000
and (department_id=20 or department_id=50)
order by 2 desc;


--2005
select last_name, hire_date
from employees
where hire_date <= '01-GEN-2005'and hire_date <='31-GEN-2005'
order by 1;

select last_name, job_id
from employees
where manager_id  is Null;

select last_name, salary, commission_pct
from employees
where  commission_pct is not null
order by 2 desc, 3 desc;

select employee_id, last_name, salary, department_id
from employees
where manager_id= 103
order by 2 asc;

select last_name
from employees
where lower (last_name) like '%a%' and lower(last_name) like '%e%'
order by 1;

select last_name, job_id, salary
from employees
where job_id in ('SA_REP','ST_CLERK')
AND SALARY NOT IN(2500,3500,7000)
ORDER BY 3 DESC;

select to char(sysdate) as "Date"
from dual;

select employee_id, last_name, salary,round( salary +
salary *0.155) as "New Salary"
from employees
by order 1;

select employee_id, last_name, salary, round( salary +
salary * 0.155) as "New Salary", round (salary * 0.155) as "increase"
from employees
by order 1;

select last_name as "Name", length(last_name) as "length"
from employees
where last_name like 'H%';

select months_between (sysdate,'01-GEN-19')
from dual;


select last_name, round(months_between(sysdate,hire_date )) as "Moths_Worked"
from employees
order by 2 desc;

select last_name, lpad(salary,15, $) as salary
from employees;

select last_name, lpad ('*',salary/1000,'*') as "SALARIES_IN_ASTERISK"
from employees
order by salary desc;

select last_name,trunc((sysdate-hire_date)/7) as "Tenute"
from employees
where department_id=90
order by 2 desc;

select (first_name||','|| as ernas,to_char(salary,'L99g999D00')
from employees;

select  last_name, nvl(to_char(commission_pct),'no commission') as "Comm"
from employees;

Teoria pomeriggio:

select sysdate
from dual;

select employee_id, hire_date, to_char(hire_date, 'Month DD, YYYY')
from employees;

select to_char(sysdate,'DD MONTH YYYY HH24:MI:SS')
from dual;

SELECT TO_DATE('12 GENNAIO 1944','DD MONTH YYYY' ), TO_DATE('7.4.18', 'MM.DD.YY')
FROM DUAL;

select TO_DATE('05-FEB-2019 19:32:18','DD-MON-YYYY HH24:MI.SS')
FROM DUAL;

select to_char(TO_DATE('05-FEB-2019 19:32:18','DD-MON-YYYY'), 'HH24:MI.SS'))
FROM DUAL;


select TO_DATE('05-FEB-2019 19:32:18','DD-MON-YYYY HH24:MI.SS'),'MON')
FROM dual;

select sysdate, add_months(sysdate,13)
from dual;


select last_day('01-FEB-2018')
FROM dual;

select months_between(sysdate,'15-GEN-01')
FROM dual;

select next_day('1-GIU-19','LUNEDI')
from dual;

select round(to_date('25-OTT-19'), 'YYYY'),trunc(to_date('25-OTT-19'), 'YYYY')
FROM DUAL;

esercizio:

select last_name, hire_date, to_char(next_day(add_months(hire_date, 6),'LUNEDI')),'fmDay", the"ddspth" of "Month", YYYY') as "Review"
from employees;

SELECT MAX(Salary) as "Maximinum", 
min(salary) as"MINIMUN", 
SUM(salary) , 
round(AVG(salary))AS "Average"
FROM employees;

SELECT JOB_ID,  MAX(Salary) as "Maximinum", 
min(salary) as"MINIMUN", 
SUM(salary) , 
round(AVG(salary))AS "Average"
from employees
group by JOB_ID;

select JOB_ID, COUNT(ROWID)
FROM employees
GROUP BY job_id;

SELECT COUNT(distinct(manager_id))
FROM employees

SELECT MAX(salary)- MIN(SALARY)
FROM employees

SELECT MANAGER_ID, MIN(SALARY)
FROM employees
GROUP BY manager_id
HAVING  manager_id IS NOT NULL AND MIN(SALARY) > 6000
ORDER BY 2 DESC;



SELECT LOCATION_ID, l.street_address, l.city, l.state_province, c.country_name
FROM locations L natural join countries c;

select last_name, department_id, department_name
from employees  join departments
using(department_id)
order by department_id;

select last_name, job_id, department_id, department_name
from employees join departments
using(department_id)
join locations
using(location_id)
where city ='Toronto';

select e.last_name, e.employee_id,m.last_name,m.department_id
from employees e join employees m
on(e.manager_id=m.employee_id)
order by m.last_name;



