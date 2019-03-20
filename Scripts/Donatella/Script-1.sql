--jobs where min salary in [2000,500]ordered by job title

select job_title,  min_salary
from jobs
where min_salary between 2000 and 5000
order by job_title;

--connessione fra due tabelle
--all countries in region Europe
--first part: region Europe
select region_id, region_name
from regions
where region_name='Europe';

--second step: European countries

select country_name
from countries 
where region_id=1;

---select con due tabelle assieme

--cross join cartesiano
select country_name
from countries c, regions r
where c.region_id= r.region_id and region_name ='Europe';

--join natural classic
select country_name,region_name
from countries natural join regions;

--natural join moderna explicit
select country_name,region_name
from countries  join regions
using(region_id);

--cross join modern
select country_name, region_name
from countries c cross join region r;

--employees:first name, last name where department name is IT
select first_name, last_name, department_name
from employees join departments
using(department_id)
where department_name ='IT';

--il vantaggio che sono uniti per uguaglianza on: specificare com'è fatta la nostra descrizione
select e.first_name, e.last_name, d.department_name
from employees e join departments d
on(e.department_id=d.department_id)
where department_name ='IT';

--self join
select emp.first_name || ''|| emp.last_name as"Employee",
       mng.first_name|| ''|| mng.last_name as"Manager"
from employees emp join employees mng
on(emp.manager_id=mng.employee_id)
order by 1;

--more than two tables
select e.first_name, e.last_name,l.city,d.department_name
from employees e, departments d, locations l
where e.department_id=d.department_id
and d.location_id=l.location_id
order by 4;

--modern on

select e.first_name, e.last_name,l.city,d.department_name
from employees e join departments d
on(e.department_id=d.department_id)
join locations l
on (d.location_id=l.location_id)
order by 4;

--modern w/using

select e.first_name, e.last_name,l.city,d.department_name
from employees e join departments d
using(department_id)
join locations l
using (location_id)
order by 4;

 -- Oxford
 
select e.first_name, e.last_name,l.city,d.department_name
from employees e join departments d
using(department_id)
join locations l
using (location_id)
where city= 'Oxford'
order by 3;

--employees having Steve King as manager
--Shipping department
--order by first name (1)

--prima parte

select e.first_name,e.last_name, m.last_name
from employees e  join employees m
on(m.employee_id=e.manager_id)
where m.first_name ='Steven'and m.last_name ='King';
order by 1;

--seconda parte

select e.first_name,e.last_name
from employees e  join departments d
using(department_id)
where d.department_name = 'Shipping'
order by 1;

---mettere assieme

select e.first_name,e.last_name
from employees e  join employees m
on(e.manager_id=m.employee_id)
join departments d
on(e.department_id=d.department_id)
where d.department_name = 'Shipping'
and m.first_name ='Steven'and m.last_name ='King'
order by 1;

--null on a fk:
select first_name,last_name,department_id
from employees
where last_name like 'Gr%';

--senza null:
select first_name,last_name,department_id
from employees join departments
using (department_id)
where last_name like 'Gr%';

select first_name,last_name,department_name
from employees left outer join departments
using (department_id)
where last_name like 'Gr%';

--modern
select first_name,last_name,d.department_name
from employees e, departments d
where e.department_id=d.department_id (+)
and last_name like'Gr%';

select first_name, last_name,department_id
from employees
where department_id between 110 and 120;

select first_name,last_name,department_name
from employees right outer join departments
using (department_id)
where department_id between 110 and 120;

select first_name,last_name,department_name
from employees full outer join departments
using (department_id)
where last_name like 'Gr%'
or department_id between 110 and 120;

--departments: name and associated manger (when existing) order by name:

select d.department_name, 
e.first_name||''||e.last_name as "Manager"
from departments d left outer join employees e
on (d.manager_id=e.employee_id)
order by 1;

--employees:name and manager name

select e.first_name||''|| e.last_name as "Employee",
       m.first_name||''|| m.last_name as "Manager", 
       e.salary
      from employees e left outer join employees m
on(e.manager_id=m.employee_id)
order by salary desc;

--functions
select ascii ('A') as "A",chr(90) as "Z",
ascii ('a')
from dual;


--concat:

select concat(first_name, last_name)
from employees
where employee_id=100;
from dual;

--instr:

select region_name, instr(region_name,'Middle'), instr(region_name,'East'),instr(region_name,'Upper')
from regions
where region_id=4;

select region_name, instr(region_name,'a'), 
instr(region_name,'a',10),
instr(region_name,'a',10,2),
instr(region_name,'a',10,3)
from regions
where region_id=4;

select hire_date,instr (hire_date,'GIU')
from employees
where employee_id=100;

select region_name, length(region_name)
from regions;

select salary, length(salary),length(100.01)
from employees
where employee_id=100;

select upper(first_name), lower(last_name), initcap(lower(first_name))
from employees
where employee_id=112;


select rpad ('hello',30,'.'),
lpad('hello',30,'-_'),
lpad('hello',3,'-_')
from dual;

select ltrim('  hello'),
rtrim('helloAbAb','Ab'),
trim('0' from '000hello0000')
from dual;


--nvl()
select nvl(commission_pct,0)
from employees;

select nvl2(commission_pct,'has commission','no commission')
from employees;

select job_title, replace(job_title,'Administration','Admin')
from jobs;

--substr()
select job_title, substr(job_title,16,4)
from jobs
where job_id='AD_VP';

select job_title, upper(substr(job_title,16,4))
from jobs
where job_id='AD_VP';

--math

select abs(-10),abs(10),
ceil(5.8),ceil(-5.2),
floor(5.8),floor(-5.2),
mod(8,4),mod(8,3),
power (2,-3),power(2,3)
from dual;


select power(2,-3), power(2,3),
round(5.75), round(5.2),
round(5.75,1),round(5.75,-1)
from dual;

select power(2,-3), power(2,3),
sqrt(25),sqrt(5),
round(5.75),round(5.2),
round(5.75,1),round(5.75,-1)
from dual;

select round(51.75,-2),round(4.75,-1),
round(5.312,1)
from dual;

select sign(-5),sign(5),sign(0)
from dual;

select trunc(5.75),trunc(5.75,1),trunc(5.75,-1)
from dual;

select to_char(1234.54), to_char(1234.54,'99,999.99'),
to_char(2019,'RN'),to_number('970,23')*2,
cast ('05-GEN-18'as date),
cast(12345.456 as number(10,2))
from dual;

--aggregate function
select avg(salary),variance(salary),stddev(salary),avg(distinct salary)
from employees
order by salary;

select count(*),count(employee_id),count(department_id),count(rowid)
from employees;

select sum(salary),max(salary),min(salary),
max(first_name),min(last_name),min(hire_date),max(hire_date)
from employees;

select avg(salary)
from employees
where department_id=30;

select  distinct department_id,count(rowid),trunc (avg(salary))
from employees
group by department_id
order by 3 desc;

select distinct department_id
from employees
order by 1;

---salario medio dei dipendeti a seconda della sede di lavoro
---employees:group by location  country_id,
--- give average salary

select avg(salary),l.country_id
from employees e  join departments d
on(e.department_id=d.department_id)
join locations l
on(l.location_id=d.location_id)
group by country_id 

--having
select manager_id,trunc(avg(salary))
from employees
group by manager_id 
having avg(salary)>8500
order by 2 desc;

--where: filter on where
select manager_id,trunc(avg(salary))
from employees
where salary >8500
group by manager_id 
order by 2 desc;

--filter on employees than on groups of employees

select manager_id,trunc(avg(salary))
from employees
where salary >6000
group by manager_id 
having avg(salary)>8500
order by 2 desc;
