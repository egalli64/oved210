--subquery
--1 part
select employee_id
from employees
where first_name = 'Steven' and last_name ='King'

--2 part
select employee_id, first_name, last_name, manager_id
from employees
where manager_id = 100;

--subquery
select employee_id, first_name, last_name
from employees
where manager_id in (
	select employee_id
	from employees
	where last_name = 'King')

-- salary average	
select avg(salary)
from employees

--salario > media
select employee_id, first_name, last_name, salary
from employees
where salary > (
	select avg(salary)
	from employees
	)
order by 4 desc


--salario medio per ogni dipartimento
select department_id, round(avg(salary))
from employees
group by department_id
order by 2 desc

-- avg salary by dept excluding the hightest avg department
select department_id, round(avg(salary))
from employees
group by department_id
having avg(salary) < (
	select max(avg(salary))
	from employees
	group by department_id
)
	order by 2 desc
	
--minimo della media dei salari
select department_id, round(avg(salary))
from employees
group by department_id
having avg(salary) < (
	select avg(avg(salary))
	from employees
	group by department_id
)
	order by 2 desc

	
select first_name
from(
	select employee_id, first_name, last_name
	from employees
	where employee_id between 112 and 115
)
where last_name like'P%'


select r.region_name, c.country_count
from regions r natural join (
	select region_id, count(rowid) as country_count
	from countries
	group by region_id
) c

--manager di impiegati con nome jennifer
select employee_id, first_name, last_name
from employees
where employee_id in (
	select manager_id
	from employees
	where first_name = 'Jennifer'
)
order by 2



--stampa i dipendenti che non sono  mnager
select employee_id, first_name, last_name 
from employees
where employee_id not in (
	select distinct manager_id
	from employees
	where manager_id is not null
)
order by 2, 3


select e.employee_id, e.last_name, m.manager_id, m.last_name
from employees e left outer join employees m
on(e.manager_id = m.manager_id)
order by 3, 1

--indicare le combinazioni di colleghi per ogni dipartimento
select e.department_id, e.last_name as "Employee", c.last_name as "Colleague"
from employees e join employees c
on (e.department_id = c.department_id)
where e.employee_id != c.employee_id
order by 1, 3

--assunti dopo davies
select first_name, last_name, to_char(hire_date, 'dd, month, yyyy')
from employees
	where hire_date > (
	select hire_date
	from employees
	where last_name = 'Davies'
	)
order by 1
	
--nomi e date di assunzione di quelli assunti prima del loro manager
select e.last_name, e.hire_date, c.last_name, c.hire_date
from employees e join employees c
on(e.manager_id = c.employee_id)
where e.hire_date < c.hire_date
order by 1;

--impiegati che guadagnano più della media
select employee_id, last_name, salary
from employees
	where salary > (
	select avg(salary)
	from employees
	)
order by 3 desc

--employee id e il cognome degli impiegati che lavorano in un dipartimento con un cognome che contiene la lettera 'u'
select employee_id, last_name
from employees
	where department_id in (
	select department_id
	from employees
	where last_name like '%u%'
	)

-- impiegati il cui dipartimento è locato in 1700
select e.last_name, d.department_id, e.job_id
from employees e join departments d
on(e.department_id = d.department_id)
where location_id = 1700



select last_name, salary
from employees
	where manager_id in (
	select employee_id
	from employees
	where first_name = 'Steven' and last_name = 'King'
)


select e.department_id, e.last_name, e.job_id
from employees e join departments d
on(e.department_id = d.department_id)
where department_name = 'Executive'


--tutti i dipendenti i cui salari sono maggiori rispetto ai salari del dipartimento 60
select last_name, salary
from employees
where salary > (
	select min(salary)
	from employees
	where department_id = 60
	)
order by 2

--oppure (per prendere tutti i salari)
select last_name, salary
from employees
where salary > all (
	select salary
	from employees
	where department_id = 60
	)
order by 2

--impiegati che guadagnano più della media e che c'è almeno un employee il cui cognome contiene la lettera u
select employee_id, last_name, salary
from employees
where department_id in (
	select department_id
	from employees
	where last_name like '%u%'
)
and salary > (
select avg(salary)
from employees
	)

--stampare department name, city and state province
select d.department_name, l.city, l.state_province
from departments d join locations l
on(d.location_id = l.location_id)
order by 1


select first_name, last_name, department_id, department_name
from employees left join departments
using(department_id)


select first_name, last_name, department_id
from employees
where department_id in (
	select department_id
	from employees
	where last_name = 'Taylor'

)

--dipendenti assunti dal 1 gennaio 03 al 31 agosto 2007
select first_name, last_name, hire_date
from employees
where hire_date between '1-gen-03' and '31-agosto 07'
order by 3


select department_name, round(avg(salary)), count(commission_pct)
from employees join departments
using(department_id)
group by (department_name)






	

	
	
	

	
