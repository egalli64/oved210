--jobs where min salary in [2000, 5000] ordered by job title
select min_salary, job_title
from jobs
where min_salary between 2000 and 5000
order by job_title;

--First step: region ide from Europe
select region_id
from regions
where region_name = 'Europe';

--Second step: european countries
select country_name
from countries
where region_id = 1;

--Unico step: due tabelle contemporaneamente
select country_name, region_name
from countries c, regions r
where c.region_id = r.region_id and r.region_name = 'Europe';

--oppure: natural join modern
select country_name, region_name
from countries natural join regions;

--oppure: modern join explicit
select country_name, region_name
from countries join regions
using(region_id);

--oppure: cross join (prodotto cartesiano)
select country_name, region_name
from countries c, regions r;

--oppure: cross join modern
select country_name, region_name
from countries c cross join regions r;
--la differenza nei metodi sta nel fatto che il primo è più esplicito 

--employees: first_name, last_name where department name is IT 
select first_name, last_name
from employees natural join departments
where department_name = 'IT';

--using_on_for full description of joined columns
select e.first_name, e.last_name, d.department_name
from employees e join departments departments
on(e.department_id = d.department_id)
where department_name = 'IT';

--self join
select emp.first_name || ' ' || emp.last_name as "Employee",
       mng.first_name || ' ' || mng.last_name as "Manager"
from employees emp join employees mng
on(emp.manager_id = mng.employee_id)
order by 1;

--more than two tables
select e.first_name, e.last_name, d.department_name, l.city
from employees e join department d 
on(e.department_id = d.department_id)
join locations l
on (d.location_id = l.location_id)
order by 4;

--employees having Steven King as manager 
--Shipping department 
--ordered by first_name
select e.first_name, e.last_name, d.department_name
from employees e join employees m 
on(e.manager_id = m.employee_id)
join departments d 
on(d.department_id = e.department_id)
where d.department_name = 'Shipping' and m.first_name = 'Steven' and m.last_name = 'King'
order by e.first_name;

--null or a FK
select first_name, last_name, department_name
from employees join departments
where last_name like 'Gr%';

--
select first_name, last_name, department_name
from employees join departments
using (department_id)
where last_name like 'Gr%';

--left outer join
select first_name, last_name, department_name
from employees left outer join departments
using (department_id)
where last_name like 'Gr%';

select first_name, last_name, department_id
from employees full outer join departments
using (department_id)
where last_name like 'Gr%'
or department_id between 110 and 120;

--departments: name and associated manager (when existing)
--order by name
select first_name, last_name, department_name
from departments d left outer join employees e 
on(e.manager_id = d.manager_id)
order by e.first_name;

--emplyees: name and manager name
select e.first_name || ' ' || e.last_name as "Employee",
       m.first_name || ' ' || m.last_name as "Manager",
       e.salary
from employees e left outer join employees m 
on (m.employee_id = e.manager_id)
order by salary desc;

--functions
select ascii('A') ad "A", chr(90) as "Z", ascii('a')
from dual;

--concat
select concat(first_name, last_name)
from employees
where employee_id = 100;

select region_name, instr(region_name, 'Middle'), instr(region_name, 'Upper')
from regions
where region_id = 4;

select region_name, instr(region_name, 'a'), instr(region_name, 'a', 10)
from regions
where region_id = 4;

select hire_data, instr(hire_date, 'GIU')
from employees
where employee_id = 100;

select region_name, length(region_name)
from regions;

select salary, length(salary)
from employees
where employee_id = 100;

select salary, length(salary), length(100.01)
from employees
where employee_id = 100;

select upper(first_name), lower(last_name)
from employees
where employee_id = 100;

select upper(first_name), 
       lower(last_name),
       initcap(lower(first_name))
from employees
where employee_id = 112;

select rpad('hello', 30, '.'),
       lpad('hello', 30, '.')
from dual;

select ltrim('  hello'),
       rtrim('helloAbAb', 'Ab'),
        trim('0'from'000hello0000')
from dual;

--nvl
select nvl(commission_pct, 0)
from employees;

select nvl2(commission_pct, 'has commission', 'no commission')
from employees;

select job_title, replace(job_title, 'Administration', 'Admin')
from jobs;

--substr()
select job_title, upper(substr(job_title, 16,4))
from jobs
where job_id = 'AD_VP';

--math
select abs(-10), abs(10),
ceil(5.8), ceil(-5.2),
floor(5.8), floor(-5.2),
mod(8,4), mod(8,3),
power(2,1), power(2,3)
from dual;

select sqrt(25), sqrt(5),
       round(5.75), round(5.2),
       round(5.75, 1), round(5.75, -1)     
from dual;

select sign(-5), sign(5), sign(0)
from dual;

select trunc(5.75), trunc(5.75, 1), trunc(5.75, -1)
from dual;

select to_char(1234.54), to_char(1234.54, '99,999.99'),
       to_char(2019, 'RN'),to_number('970,23' * 2)
from dual;

select cast('05-GEN-18' as date),
       cast(12345.456 as number (10,2))
from dual;

--aggregate functions
select avg(salary), variance(salary), stddev(salary), avg(distinct salary)
from employees
order by salary;

select count(*), count(employee_id),count(department_id), count(rowid)
from employees;

select sum(salary), 
       max(salary), min(salary),
       max(first_name), min(last_name),
       max(hire_date), min(hire_date)
from employees;

select avg(salary)
from employees
where department_id = 30;

select department_id
from employees
group by department_id
order by 1;

select department_id, count(rowid), trunc(avg(salary))
from employees
group by department_id
order by 3 desc;

select distinct department_id
from employees
order by 1;

--Esercizio: salario medio dei dipendenti per sede di lavoro (country_id)
--employees: group them by location country_id,
--give average salary
select l.country_id, avg(salary)
from employees e join departments d
on(e.department_id = d.department_id)
join locations l
on(d.location_id = l.location_id)
group by l.country_id;

--having
select manager_id, trunc(avg(salary))
from employees
group by manager_id
having avg(salary) > 8500
order by 2 desc;




