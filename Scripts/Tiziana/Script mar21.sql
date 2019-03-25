--Prima parte esercizi

select employee_id, last_name, job_id, hire_date as "STARDATE"
from employees 
order by 1;


select distinct job_id
from employees;


select employee_id as " Emp # ", last_name as "Employee", job_id as " Job", hire_date as " Hire date"
from employees;

select last_name || ' , ' || job_id as "Employee and Title" 
from employees;

select employee_id ||' , '|| first_name ||' , '|| last_name ||' , '|| email ||' , '|| phone_number ||' , '||
hire_date ||' , '|| job_id ||' , '|| salary ||' , '|| commission_pct ||' , '|| manager_id ||' , '|| department_id as "The Output"
from employees;


select last_name, salary
from employees
where salary > 12000
order by 2 desc;


select last_name , department_id
from employees
where employee_id = 176;


select last_name, salary
from employees
where salary not between 5000 and 12000
order by 1 desc;


select first_name, last_name, job_id, hire_date
from employees
where last_name = 'Matos' or last_name = 'Taylor'
order by 4 asc;


select last_name, department_id
from employees
where department_id = 50 or department_id = 20
order by 1;


select last_name, department_id, salary as "MONTLHY SALARY"
from employees
where (department_id = 20 or department_id = 50) and salary between 5000 and 12000
order by 1;


select last_name, to_char(hire_date)
from employees
where hire_date < '31-dic-2005' and hire_date > '01-gen-2005'
order by 1;


select last_name
from employees
where manager_id is null
order by 1;


select last_name, salary, commission_pct
from employees
where commission_pct is not null
order by salary desc , commission_pct desc
order by 1;


select last_name, employee_id, salary, department_id
from employees
where manager_id = 103
order by 1;


select last_name 
from employees
where lower(last_name) like '%a%' and lower(last_name) like '%e%'
order by 1;

select last_name, job_id, salary 
from employees
where (job_id = 'SA_REP' or job_id = 'ST_CLERK') and (salary != 2500 and salary != 3500 and salary != 7000)
order by 1;


--Seconda parte esercizi

select to_char(sysdate) as "Date"
from dual;


select last_name, employee_id, salary, trunc(salary + ((salary*15.5) / 100)) as "NEW SALARY"
from employees;


select last_name, employee_id, salary, round(salary + ((salary*15.5) / 100)) as "NEW SALARY", round((salary*15.5) / 100) as "INCREASE"
from employees;


select last_name, length(last_name)
from employees
where last_name like 'H%'
order by 1;


select last_name, round(months_between (sysdate, hire_date)) as "Months worked"
from employees
order by 2;


select last_name, lpad(salary, 15, '$') as salary
from employees
order by employee_id;


select last_name, lpad('*', round(salary/1000),'*') as "Salaries in asterisk"
from employees
order by 2 desc;


select last_name, trunc((sysdate - hire_date)/7) as "Tenure"
from employees
where department_id = 90
order by 2;

--voglio trovare i nomi degli impiegati e il rispettivo numero delle settimane
--in cui lavorano nel dipartimento 90 --> allora con la sottrazione mi trovo
--il tempo da cui l'impiegato lavora e poi divido per 7 per trovarmi il numero delle settimane

select last_name || ' earns ' || salary || ' monthly but wants ' || to_char(salary*3, '$99,999.99') as "DreamSalaries"
from employees;

select last_name, nvl(to_char(commission_pct), 'No commission') as "Comm"
from employees
order by 1;



--Teoria sulle date(continuate sul quaderno)

select employee_id, hire_date, to_char(hire_date, 'MONTH DD, YYYY')
from employees;

select sysdate, add_months(sysdate, 2)
from dual;

select round(to_date('25-OTT-19'), 'YYYY')
from dual;


---Altri esercizi
select last_name, to_char(hire_date) as "HIRE DATE", 
                  to_char(next_day(add_months(hire_date, 6), 'Lunedi'),'fmDay", the "ddspth" of "Month","YYYY') as "REVIEW"
from employees;


select max(salary), min(salary), sum(salary), round(avg(salary))
from employees;


select job_id, max(salary) as Maximum , min(salary) as Minimum, sum(salary) as Sum, round(avg(salary)) as Average
from employees
group by job_id;


select job_id, count(employee_id) as Count
from employees
group by job_id;


select count(distinct manager_id) as Count
from employees;


select max(salary) - min(salary)
from employees;


select manager_id, min(salary)
from employees
group by manager_id 
having min(salary) > 6000 and manager_id is not null
order by 2 desc;


select location_id, street_address, state_province, country_name
from locations natural join countries
order by 1;

select e.last_name, d.department_id, d.department_name
from employees e join departments d
on (e.department_id = d.department_id);


select e.last_name, e.job_id, d.department_id, d.department_name 
from employees e join departments d
on (e.department_id = d.department_id)
join locations l
on (d.location_id = l.location_id)
where l.city = 'Toronto';


select e.last_name as employee , e.employee_id as emp#, m.last_name as manager, m.department_id  as mng#
from employees e join employees m
on(e.manager_id = m.employee_id)
order by 3,1;


select e.last_name as employee , e.employee_id as emp#, m.last_name as manager, m.department_id  as mng#
from employees e left outer join employees m 
on (e.manager_id = m.employee_id) 
order by 3,1; 







   
 











