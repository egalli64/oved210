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
      where first_name = 'Steven' and last_name = 'King');
     
--using IN for many values returned by suquery
select employee_id, first_name, last_name
from employees
where manager_id in (
      select employee_id
      from employees
      where last_name = 'King');
     
--salary average      
select avg(salary)
from employees;

select employee_id, first_name, last_name, salary
from employees
where salary > (
      select avg(salary)
      from employees)
order by 4 desc;

--avg salary by dept
select round(avg(salary)), department_id
from employees
group by department_id
order by 1 desc;


--Esercizi

select round(avg(salary)), department_id
from employees
group by department_id
having avg(salary) < (
       select max (avg(salary))
       from employees
       group by department_id)
order by 2 desc;


select department_id, round(avg(salary))
from employees
group by department_id
having avg(salary) < (
       select avg (avg(salary))
       from employees
       group by department_id)
order by 2 desc;


select department_id, round(avg(salary))
from employees
group by department_id
having avg(salary) > (
       select avg (avg(salary))
       from employees
       group by department_id)
order by 2 desc;


select first_name
from(select employee_id, first_name, last_name
     from employees
     where employee_id between 112 and 115)
where last_name like'P%';    


select r.region_name, c.country_count
from regions r natural join (
     select region_id, count(rowid) as country_count
     from countries
     group by region_id) c
order by 1;
    
    
select employee_id, first_name, last_name
from employees
where employee_id in ( 
      select manager_id
      from employees
      where first_name = 'Jennifer')
order by 1;      
 

select employee_id, first_name, last_name
from employees
where employee_id not in (
      select distinct manager_id
      from employees
      where manager_id is not null)
order by 2,3;

 
select last_name, to_char(hire_date)
from employees
where hire_date > (
      select hire_date
      from employees
      where last_name = 'Davies')
order by 1;


select e.last_name as employee, e.department_id as department, c.last_name as colleague
from employees e join employees c
on (c.department_id = e.department_id)
where e.employee_id != c.employee_id
order by 1;


select e.last_name, to_char(e.hire_date), m.last_name, to_char(m.hire_date)
from employees e join employees m
on (e.manager_id = m.employee_id)
where e.hire_date < m.hire_date
order by 1;

     
select employee_id, last_name, salary
from employees
where salary > (
       select avg (salary)
       from employees)     
order by 2 desc;  


select employee_id, last_name
from employees
where department_id in (
	      select department_id
          from employees
          where last_name like '%u%')
order by 1;          
       

select last_name, department_id, job_id
from employees join departments 
using (department_id)
where location_id =1700;


select last_name, salary
from employees
where manager_id in (
		select employee_id
	    from employees
	    where last_name = 'King');
	    
---oppure con la join	    
select e.last_name, e.salary
from employees e join employees m
on(e.manager_id = m.employee_id)
where(m.last_name = 'King');
	    

select e.last_name, d.department_id, e.job_id
from employees e join departments d
on (e.department_id = d.department_id)
where department_name = 'Executive';


select last_name
from employees 
where salary > any(
		select salary
		from employees
		where department_id = 60);
	
	
select employee_id, last_name, salary
from employees
where department_id in (
	      select department_id
          from employees
          where last_name like '%u%')
 and salary > any(
 select avg(salary)
 from employees);


select department_name, department_id, city, state_province
from departments join locations
using (location_id);


select department_id, first_name, last_name 
from employees left outer join departments
using (department_id);


select first_name, last_name, department_id
from employees
where department_id in (		
           select department_id
           from employees
           where last_name = 'Taylor');
 
          
select first_name, last_name, job_id, department_id
from employees
where hire_date between '01-gen-03' and '31-ago-07';
 

select department_name, round(avg(salary)), count(commission_pct)
from employees join departments
using(department_id)
group by department_name;
 
		


