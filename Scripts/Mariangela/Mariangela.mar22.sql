-- subquery
select employee_id
from employees
where first_name = 'Steven' and last_name = 'King';

select employee_id, first_name, last_name
from employees
where manager_id = 100;

select employee_id, first_name, last_name
from employees
where manager_id = (
	select employee_id
	from employees
	where first_name = 'Steven' and last_name = 'King'
);

-- per accettare più valori sostituisco = con in nel where
select employee_id, first_name, last_name
from employees
where manager_id in (
	select employee_id
	from employees
	where last_name = 'King'
);

-- salary average
 select employee_id, first_name, last_name, salary
 from employees
 where salary > (
 select avg(salary)
 from employees
)
order by 4 desc;

-- avg salary by departments
select department_id, round(avg(salary))
from employees
group by department_id 
order by 2 desc;

---
select department_id, round(avg(salary))
from employees
group by department_id 
having round(avg(salary)) < (
	select max(avg(salary))
	from employees
	group by department_id
	)
order by 2 desc;

---
select first_name
from (
	select employee_id, first_name, last_name
	from employees
	where employee_id between 112 and 115
	)
where last_name like 'P%';

--- numero di paesi nelle regioni

select r.region_name, c.country_count
from regions r natural join (
select region_id, count(rowid) as country_count
from countries
group by region_id
) c;

--- manager che hanno come dipendenti 'Jennifer'
select employee_id, first_name, last_name
from employees
where employee_id in (
	select manager_id
	from employees
	where first_name = 'Jennifer'
);

--- tutti gli impiegati che non sono manager
select employee_id, first_name, last_name
from employees
where employee_id not in (
	select distinct manager_id
	from employees
	where manager_id is not null
	)
order by 2,3;

---
select e.last_name, e.employee_id, m.last_name, m.department_id
from employees e left outer join employees m
on(e.manager_id = m.employee_id) 
order by 3, 1;

---
select e.department_id, e.first_name || ' ' || e.last_name as employee, c.first_name || ' ' || c.last_name as colleague
from employees e join employees c
on (e.department_id = c.department_id) 
where e.employee_id != c.employee_id
order by 1;

---
select first_name, last_name, hire_date
from employees
where hire_date > (
	select hire_date
	from employees
	where last_name = 'Davies'
)
order by 3 asc;

---
select e.last_name, to_char(e.hire_date), m.last_name, to_char(m.hire_date)
from employees e join employees m
on (m.employee_id = e.manager_id)
where e.hire_date < m.hire_date
order by 1, 3;

---
 select employee_id, last_name, salary
 from employees
 where salary > (
 	select avg(salary)
 	from employees
 	)
 order by 3;

---
select employee_id, last_name
from employees
where department_id in (
	select department_id
	from employees
	where last_name like '%u%'
	);

---

select last_name, department_id, job_id
from employees join departments 
using (department_id)
where location_id = 1700;

---

select last_name, salary
from employees
where manager_id = (
	select employee_id
	from employees
	where first_name = 'Steven' and last_name = 'King' 
	);

select e.last_name, e.salary
from employees e join employees m
on e.manager_id = m.employee_id
where m.last_name = 'King';

---

select department_id, last_name, job_id
from employees join departments
using (department_id)
where department_name = 'Executive';

---

select last_name
from employees
where salary > any (
	select salary
	from employees
	where department_id = 60
	);

---

select employee_id, last_name, salary
from employees
where department_id in (
	select department_id
	from employees
	where last_name like '%u%'
	) and salary > (
	select avg(salary)
	from employees
	);

-- department name, city and state province for each department

select department_name, city, state_province
from departments natural join locations
order by 1;

--- 
select first_name, last_name, department_id, department_name
from employees left outer join departments
using(department_id);


---

select first_name, last_name, department_id
from employees
where department_id in (
	select department_id
	from employees
	where last_name = 'Taylor'
	);
	

--- 

select first_name, last_name, hire_date
from employees
where hire_date between '01-GEN-03' and '31-AGO-07';

---

select department_name, round(avg(salary)), count(commission_pct)
from employees join departments
using (department_id)
group by department_name;










	




	






