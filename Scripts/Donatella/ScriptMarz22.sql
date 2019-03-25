---subquery:
select employee_id
from employees
where first_name='Steven' and last_name='King';

select employee_id, first_name, last_name,manager_id
from employees
where manager_id=100;
--2query assieme:
select employee_id, first_name, last_name
from employees
where manager_id=(
select employee_id
from employees
where first_name='Steven' and last_name='King'
);

--using in for many values returned by subquery:
select employee_id, first_name, last_name
from employees
where manager_id in (
select employee_id
from employees
where last_name='King'
);
--salary average
select avg(salary)
from employees;
--con la subquery:
select employee_id,first_name,last_name, salary
from employees
where salary >(
select avg(salary)
from employees
)
order by 4 desc;

--salay medio di ogni dipartimento

select department_id,round(avg(salary))
from employees
group by department_id
order by 2 desc;


--FILTRARE(togliere) DAL MIO RISULTO IL GRUPPO CHE HA IL SALARIO PIù ALTO

--il massimo dei salari:
select department_id,round(avg(salary))
from employees
group by department_id
having AVG(SALARY) < ( 
select max(avg(salary))
from employees
group by department_id
)
order by 2 desc;

--la media dei salari:
select department_id,round(avg(salary))
from employees
group by department_id
having AVG(SALARY) < ( 
select avg(avg(salary))
from employees
group by department_id
)
order by 2 desc;

--voglio trovare i tutti gli impiegati ma solo quelli che hanno come cognome P:
select first_name
from (
select employee_id,first_name,last_name
from employees
where employee_id between 112 and 115
)
where last_name like 'P%';

--contami le rghe dove region_id=1:

select r.region_name, c.country_count
from regions r natural join (
select region_id,count(rowid) as country_count
from countries
group by region_id
) c;

select country_name, region_id
from countries
group by region_id
)
--employees: employee_id; first_name, last_name di tutti gli impiegati che hanno come manager 
--una che si chiama jennifer:

select employee_id, first_name, last_name
from employees
where employee_id in (
select manager_id
from employees
where  first_name ='Jennifer'
);
--non mi interessano i manager

select employee_id, first_name, last_name
from employees
where employee_id  not in (
select  distinct manager_id
from employees
where manager_id is not null
)
order by 2,3;

 Esercizi vari:
  --2.5
select e.last_name, e.employee_id,m.last_name,m.department_id
from employees e left outer join employees m
on(e.manager_id=m.employee_id)
order by 3,1;

--2.6 self join sul dipartimento escludendo alcune righe
select e.department_id , e.last_name, c.last_name
from employees e join employees c
on(e.department_id=c.department_id)
where e.employee_id!=c.employee_id
order by 1,2;

--2.7

select hire_date
from employees
where last_name='Devies';

select  last_name, hire_date
from employees
where hire_date >'29-GEN-05'(
select hire_date
from employees
where last_name='Devies'
);

--assunti prima del manager:

Select e.last_name,e.hire_date,m.first_name, m.hire_date
from employees e join employees m
on(e.manager_id=m.employee_id)
where e.hire_date < m.hire_date;

---salario medio di tutti gli impiegati
select employee_id, last_name, salary
from employees
where salary > (
select avg(salary)
from employees
);

---sapere una u nei cognomi dei dipendenti
select employee_id, last_name
from employees
where department_id in (
select distinct department_id
from employees 
where last_name like '%u%'
);

---
select last_name, department_id, job_id
from employees e join departments d
using(department_id)
where location_id =1700;

---
select last_name, salary
from employees 
where manager_id in(
select employee_id
from employees
where last_name = 'King'
);

select e.department_id, e.last_name, e.job_id
from employees e join departments d
on(d.department_id=e.department_id)
where  department_name ='Executive';

--department 60/ minore di tutti:
select last_name,salary
from employees
where salary >(
select min(salary)
from employees
where department_id=60
);

--maggiore di tutti:
select last_name,salary
from employees
where salary >(
select max(salary)
from employees
where department_id=60
);
--3.8
select employee_id, last_name,salary
from employees
where department_id in (
select distinct department_id
from employees 
where last_name like '%u%' 
) and salary> (
select avg(salary)
from employees
);






select department_id,round(avg(salary))
from employees
group by department_id
having AVG(SALARY) < ( 
select avg(avg(salary))
from employees
group by department_id
)
order by 2 desc;


---department name, city and state province for each department

select  department_name,city, state_province
from departments natural join locations;

select first_name, last_name, department_id, department_name
from employees left join departments
using(department_id);

select first_name, last_name, department_id
from employees 
where department_id in (select department_id
from employees
where last_name='Taylor'
);

--first name, last name, 
select first_name, last_name, hire_date
from employees
where hire_date between'1-GEN-03'and '31-AGO-07';

--department name, salario medio, employees number commissioni

select department_id, C
from employees 
group by department_id;

select department_name, count(commission_pct), round(avg(salary)
from departments
join employees using(department_id)
using(department_id)






