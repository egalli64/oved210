--jobs where min salary in [2000, 5000], ordered by for job_title

select job_title, min_salary
from jobs
where min_salary between 2000 and 5000
order by job_title;

--connection for two tables
--all countries in region Europe

--First step: region_id for Europe

select region_id
from regions
where region_name = Europe;

--second step:  European countries
select country_name
from countries
where region_id = 1;

--oppure query su due tabelle contemporaneamente (join = connessione tra due tabelle)
select country_name
from countries c, regions r
where c.region_id = r.region_id and r.region_name = 'Europe';


select country_name, region_name
from countries natural join regions;
--where regions_name = Europe

--oppure
select country_name, region_name
from countries join regions
using(region_id);


--cross join (prodotto cartesiano)
select country_name, region_name
from countries c, regions r


--cross join modern
select country_name, region_name
from countries c cross join regions r
where region_name = 'Europe';


-- employees: first name, last_name where department name is IT

select first_name, last_name, department_name
from employees e join departments d
using (e.department_id = d.department_id)
where department_name = 'IT';

-- using on for full description of joined columns

select e.first_name, e.last_name, d.department_name
from employees e join departments d
on (e.department_id = d.department_id)
where department_name = 'IT';


--self join ( join con employees due volte)

select emp.first_name || ' ' || emp.last_name as "Employee",
	   mng.first_name || ' ' || mng.last_name as "Manager"
from employees emp join employees mng
on(emp.manager_id = mng.employee_id)
order by 1;

-- more than two tables;

select e.first_name, e.last_name, l.city, d.department_name
from employees e, departments d, locations l
where e.department_id = d.department_id
	 and d.location_id = l.location_id
	order by 4;


--oppure modern w/ using

select e.first_name, e.last_name, l.city, d.department_name
from employees e join departments d
using(department_id)
join locations l
using(location_id)
order by 4;

-- oppure on

select e.first_name, e.last_name, l.city, d.department_name
from employees e join departments d
on (e.department_id = d.department_id)
join locations l
on(d.location_id= l.location_id)
order by 4;

--
select e.first_name, e.last_name, l.city, d.department_name
from employees e join departments d
using(department_id)
join locations l
using(location_id)
where city = 'Oxford'
order by 3;



-- employees having Steven King as manager
--shipping department
--order by first name

--first part
select e.first_name, e.last_name
from employees e join employees m
on (e.manager_id = m.employee_id)
where m.first_name = 'Steven' and m.last_name = 'King'
order by first_name;

--second part
select e.first_name, e.last_name, d.department_name
from employees e join departments d
using(department_id)
where d.department_name = 'Shipping'
order by 1;

--union
select e.first_name, e.last_name, d.department_name
from employees e join employees m
on(e.manager_id = m.employee_id)
	join departments d
on(e.department_id = d.department_id)
where m.first_name = 'Steven' and m.last_name = 'King'
		and d.department_name = 'Shipping'
order by 1;


-- cerca chi ha department null

select first_name, last_name, department_id
from employees
where last_name like 'Gr%'

-- left outer join

select first_name, last_name, department_name
from employees left outer join departments
using (department_id)
where last_name like 'Gr%'

--

select first_name, last_name, department_id
from employees
where department_id = 110;

select *
from departments
where department_id = 120;



select first_name, last_name, department_name
from employees left outer join departments
using(department_id)
where department_id between 110 and 120;


-- departments: name and associate manager(when existing)
--				order by name

select d.department_name,
	e.first_name || ' ' || e.last_name as "Manager"
from employees e right outer join departments d
on(d.manager_id = e.employee_id)
order by e.last_name;


--employees: name employees and manager name

select e.first_name, e.last_name, d.manager_id
from employees e join departments d
where department_id


---employees order by salary

select e.first_name || ' ' || e.last_name as "Employee",
	m.first_name || ' ' || m.last_name as "Manager"
from employees e left outer join employees m
on (e.employee_id = m.manager_id)
order by salary desc;



--functions
select ascii('A') as "A", chr(90) as "Z", ascii ('a')	
from dual;

--concat
select concat(first_name, last_name)
from employees
where employee_id = 100;


select region_name, instr(region_name, 'Middle'), instr(region_name, 'a')
from regions
where region_id = 4;

select region_name, instr(region_name, 'Middle'), instr(region_name, 'a')
from regionswhere region_id = 4;
instr(region_name, 'a', 10)
instr(region_name, 'a', 10, 2),
instr(region_name, 'a', 10, 3)
from regions
where region_id = 4;


select hire_date, instr(hire_date, 'GIU')
from employees
where employee_id = 100;

--length

select region_name, length(region_name)
from regions


select salary, length(salary), length(100)
from employees
where employee_id = 100;

select upper(first_name), lower(last_name)
from employees
where employee_id = 112;

select upper(first_name),
lower(last_name),
initcap(lower(first_name))
from employees
where employee_id = 112;


select rpad('hello', 30, '.'),
	lpad('hello', 30, '_')
	lpad('hello', 3, '-_-')
from dual;

select ltrim('  hello'),
	rtrim('helloAbAb', 'Ab'),
	trim('0' from '000hello000')
from dual;

--nvl
select nvl(commission_pct, 0) 
from employees


--nvl 2
select nvl(commission_pct, 0) 
from employees

select nvl2(commission_pct, 'has commission', 'no commission')
from employees


select job_title, replace(job_title, 'Administration', 'Admin')
from jobs


-- substr()
select job_title, substr(job_title, 16, 40)
from jobs
where job_id = 'AD_VP'

select job_title, upper(substr(job_title, 16, 4))
from jobs
Where job_id = 'AD_VP'

--MATH
select abs(-10), abs(10),
	ceil(5.8), ceil(-5.2)
	floor(5.8), floor(-5.2),
	mod(8, 4), mod(8, 3),
from dual;


select power(2, -3), power(2, 3),
sqrt(25), sqrt(5)

select round(5, 75), round(5.2),
	round(5.75, 1), round(5.75, -1),
	round(51.75, -2), round(4.75, -1),
	round(5.312, 1), round
	

select to_char(1234.54), to_char(1234.54, '99,999.99'),
	to_char(2019, 'RN'), to_number('970,23') * 2
	cast('5-GEN-18' as date),
	cast(12345.234 as number(10,2))
from dual;


select sign(-5), sign(5), sign(0)
from dual;

-- arrotonda le cifre, togliendo i decimali

select trunc(5.75), trunc(5.75, 1), trunc(5.75, -1)
from dual;


--aggregate functions

select avg (salary)
from employees
order by salary;

select avg(salary), variance(salary), stddev(salary), avg(distinct salary)
from employees
order by salary


select avg(distinct salary)
from employees
order by salary


select count(*), count(employee_id), count(department_id), count(rowid)
from employees

--sum

select sum(salary)
from employees

select sum(salary), max(salary), min(salary)
from employees


--nome dei dipendenti con min e max salary

select sum(salary),
	max(salary), min(salary),
	max(first_name), min(last_name)
from employees


--date di erogazione max/min salary

select sum(salary),
	max(salary), min(salary),
	max(first_name), min(last_name),
	max(hire_date), min(hire_date)
from employees

select avg(salary)
from employees
where department_id = 30


--raggruppare i dipartimenti ( ottengo la lista dei dipartimenti - dividendo gli employee in gruppi, cioe quanti sono i dipendenti che appartengono a quel dipartimento);

select department_id, count(rowid), trunc(avg(salary))
from employees
group by department_id
order by 1;

--qui non sono ordinati in gruppi(il distinct li lascia separati)

select distinct department_id
from employees
order by 1;



--employees: group them by location.country_id, give average salary (salario dei dipendenti divisi per country_id)

select avg(e.salary), l.country_id
from employees e join departments d
  on (e.department_id = d.department_id)
  join locations l
  on (d.location_id = l.location_id)
group by l.country_id;



-- having come filtro sui gruppi 

select manager_id, trunc(avg(salary))
from employees
group by manager_id
having avg(salary) > 8500
order by 2 desc

--where come filtro sulle righe

select manager_id, trunc(avg(salary))
from employees
where salary > 8500
group by manager_id
order by 2 desc

--having + where come doppio filtro su righe + gruppi di persone

select manager_id, trunc(avg(salary))
from employees
where salary > 6000
group by manager_id
having avg(salary) > 8500
order by 2 desc








