--jobs where min salary in [2000, 5000] ordered by job title

select job_id, job_title, min_salary 
from jobs
where min_salary between 2000 and 5000
order by job_title ;

--all countries in region Europe

--FIRST STEP: region id for Europe
select region_id
from regions
where region_name = 'Europe';

--SECOND STEP: European countries
select country_name
from countries
where region_id = 1;

--per fare questi due passaggi in uno solo --> NATURAL JOIN:

--natural classi join
select country_name
from countries , regions 
where countries.region_id = regions.region_id and region_name = 'Europe';
--natural join modern
select country_name, region_name
from countries natural join regions
where region_name = 'Europe';
--natural join explicit
select country_name, region_name
from countries join regions
using(region_id);
--cross join (prodotto cartesiano)
select country_name, region_name
from countries , regions ;
--cross join modern
select country_name, region_name
from countries cross join regions;

--ESERCIZIO:
--1)employees: first_name, last_name where departement name is IT
select first_name, last_name, department_name
from employees join departments
using(department_id)
where department_name = 'IT';
--oppure:
--using_on_for full description of joined columns
select e.first_name, e.last_name, d.department_name
from employees e join departments d
on(e.department_id = d.department_id )
where department_name = 'IT';

--self join, voglio prendere il nome e cognome dell'employee e il nome e cognome del suo manager
select emp.first_name || ' ' || emp.last_name as "Employee", 
       mng.first_name || ' ' || mng.last_name as "Manager"
from employees emp join employees mng
on(emp.manager_id = mng.employee_id)
order by 2;

--more than two tables
select e.first_name, e.last_name, l.city, d.department_name
from employees e, departments d, locations l
where e.department_id = d.department_id
  and d.location_id = l.location_id
order by 4;
--riscriviamo usando il ON e JOIN
select e.first_name, e.last_name, l.city, d.department_name
from employees e join departments d
on( e.department_id = d.department_id)
 join locations l
on(d.location_id = l.location_id)
order by 4;
--riscriviamo usando il USING e JOIN
select e.first_name, e.last_name, l.city, d.department_name
from employees e join departments d
using(department_id)
  join locations l
using(location_id)
where city = 'Oxford'
order by 4;

--ESERCIZIO

--1) Eemployees having Steven King as manager,
--   Shipping department
--   Order by first name 
--first part:
select e.first_name, e.last_name
from employees e join employees m
on(m.employee_id = e.manager_id)
where m.first_name = 'Steven' and m.last_name = 'King'
order by 1;
--second part:
select e.first_name, e.last_name 
from employees e join departments d
using(department_id)
where d.department_name = 'Shipping'
order by 1;
--COMPLETO:
select e.first_name, e.last_name, d.department_name, m.last_name
from employees e join employees m
on(m.employee_id = e.manager_id)
join departments d
on(d.department_id = e.department_id)
where m.first_name = 'Steven' and m.last_name = 'King' and d.department_name = 'Shipping'
order by 4; 


select first_name, last_name, department_name
from employees left outer join departments
using(department_id)
where last_name like 'Gr%'
or department_id between 110 and 120;

-- 2) department: name and associated manager (when existing)
--order by name
--employees: name and manager name 
select d.department_name,
       e.first_name || '' || e.last_name as "Manager"
from departments d left outer join employees e 
on(d.manager_id = e.employee_id)
order by 1;

--3) employees: name and manager name
select e.first_name || ' ' || e.last_name as "Employee",
      m.first_name || ' ' || m.last_name as "Manager",
      e.salary
from employees e left outer join employees m
on(e.manager_id = m.employee_id)
order by salary desc;

--functions
select ascii('A') as "A", chr(90) as "Z", ascii('a') 
from dual;

--contact
select concat(first_name, last_name)
from employees
where employee_id = 100;

select region_name, instr(region_name, 'Middle'), instr(region_name, 'East')
from regions
where region_id = 4;

select region_name,
       instr(region_name, 'a'),
       instr(region_name, 'a', 10),
       instr(region_name, 'a', 10, 2),
       instr(region_name, 'a', 10, 3)
from regions
where region_id = 4;

select hire_date, instr(hire_date, 'GIU')
from employees
where employee_id = 100;

select region_name, length(region_name)
from regions;

--LUNGHEZZA
select salary, length(salary), length(100.01)
from employees
where employee_id = 100;

--MINUSCOLO, MAIUSCOLO
select upper(first_name), 
       lower(last_name), 
       initcap(lower(first_name))
from employees
where employee_id = 112;

--scrivere la stringa in un colonna di 30 caratteri e riempi i caratteri restanti da hello, con tanti punti, oppure se metto meno caratteri, mi tronca la parola che volevo scrivere
select rpad('hello', 30, '.'),
       lpad('hello', 30, '-_'),
       lpad('hello', 3, '.')
from dual;

--per togliere 
select ltrim('    hello'),
       rtrim('helloAbAb', 'Ab'),
       trim('0' from '000hello000')
from dual;

--nvl()
select nvl(commission_pct, 0)
from employees;

select nvl2(commission_pct, 'has commission', 'no commission')
from employees;

select job_title, replace(job_title, 'Administration', 'Admin')
from jobs;

--substr()
select job_title, upper(substr(job_title, 16, 4))
from jobs
where job_id = 'AD_VP';

--matematica
--valore assoluto
select abs(-10), abs(10)
from dual;
--ceil/floor/modulo/potenza
select abs(-10), abs(10),
    ceil (5.2), ceil(-5.2), -- SEMPRE PER ECCESSO 
    floor(5.8), floor(-5.2), -- SEMPRE PER DIFETTO
    mod(8, 4), mod(8, 3), -- MODULO 
    power(2, -3), power(2, 3) -- POTENZA
from dual;

select power(2, -3), power(2, 3),
       sqrt(25), sqrt(5), -- RADICE QUADRATA
       round(5.75), round (5.2), round(5.75, 1), round(5.75, -1), round(51.75, -2) -- ARROTONDAMENTO PER ECCESSO O DIFETTO A SECONDA DEL DECIMALE
from dual;

select trunc(5.75), 
from dual;

select to_char(1234.54), to_char(1234.54, '99,999.99'),
     to_char(2019, 'RN'), to_number('970,23') * 2,
     cast('05-GEN-18' as date),
     cast(12345.234 as number(10,2))
from dual;

--aggregate functions (avarage, variance, deviazione standard)
select avg(salary), variance(salary), stddev(salary), avg(distinct salary)
from employees
order by salary;

--mi dice su quante righe sto lavorando; count(rowid) è il conteggio più sicuro da fare
select count(*), count(employee_id), count(department_id), count(rowid)
from employees;

select sum(salary), 
       max(salary), min(salary),
       max(first_name), min(last_name), 
       max(hire_date), min(hire_date)
from employees;

--media dei salari dentro il dipartimento 30
select avg(salary)
from employees
where department_id = 30;

--dipartimenti ordinati per popolarità (o salario) e per dipartimento posso vedere il salario medio
select department_id, count(rowid), trunc(avg(salary))
from employees
group by department_id
order by 3 desc;

--con il dinstinct non posso fare operazioni di raggruppamento
select distinct department_id
from employees
order by 1;

--ESERCIZIO:

--1) salario medio dei dipendenti a seconda della sede di lavoro
--employees: group them by location.country_id, 
--give average salary
select l.country_id, trunc(avg(salary))
from employees e join departments d
on(d.department_id = e.department_id)
join locations l
on(d.location_id = l.location_id)
group by l.country_id
order by 2;

--HAVING: FILTER GROUPS
select manager_id, trunc(avg(salary))
from employees
group by manager_id
having avg(salary) > 8500
order by 2 desc;
--WHERE: FILTER ON EMPLOYEES
select manager_id, trunc(avg(salary))
from employees
where salary >8500
group by manager_id
order by 2 desc;
--FILTER ON EMPLOYEES THAN ON GROUPS OF EMPLOYEES
select manager_id, trunc(avg(salary))
from employees
where salary > 6000
group by manager_id
having avg(salary) > 8500
order by 2 desc;

