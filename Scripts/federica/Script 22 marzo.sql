--subquery
--Esempio 1:
--step 1
select employee_id
from employees
where frist_name = 'Steven' and last_name = 'King';

--step 2
select employee_id, first_name, last_name, manager_id
from employees
where manager_id = 100;

--metodo subquery
select employee_id, frist_name, last_name
from employees
where manager_id = (
select employee_id
from employees
where first_name = 'Steven' and last_name = 'King'
);--non funziona!

--in questo modo funziona perchè mi accetta più valori:
select employee_id, frist_name, last_name
from employees
where manager_id in (
select employee_id
from employees
where last_name = 'King'
);

--Esempio 2: trovare i dipendenti che hanno uno stipendio maggiore della media
--step 1 inner query: calcolo salario medio
select avg(salary)
from employees;

--step 2: 
select first_name, last_name, employee_id, salary
from employees
where salary > (
      select avg(salary)--ci metto dentro la inner query che avevo fatto
      from employees
)
order by 4 desc;

--Esempio 3: 
--salario medio per dipartimento (inner query);
select department_id, round(avg(salary))
from employees
group by department_id
order by 2 desc;

--escludere il dip. con lo stipendio medio più alto, quindi fare una query che mi individua il salario più alto;
select department_id, round(avg(salary))
from employees
group by department_id
having avg(salary) < (    --questa è la subquery, cioè la inner query creata prima, con HAVING faccio il filtro.
       select max(avg(salary))
       from employees
       group by department_id)
order by 2 desc;

--dipendenti con il salario medio più basso:
select department_id, round(avg(salary))
from employees
group by department_id
having avg(salary) < (    
       select avg(avg(salary))
       from employees
       group by department_id)
order by 2 desc;

select department_id, round(avg(salary))
from employees
group by department_id
having avg(salary) > (    
       select min(avg(salary))
       from employees
       group by department_id)
order by 2 desc;

--Esempio 4: utilizzo del FROM
select first_name
from  (
     select employee_id, first_name, last_name  --questa è una tabella temporanea
     from employees
     where employee_id between 112 and 115
)
where last_name like 'P%';

--trovare il numero di stati per ogni regione
select region_id, count(rowid) 
from countries
group by region_id;

--subquery
select r.region_name, c.country_count
from regions r natural join(
     select region_id, count(rowid) as country_count
     from countries
     group by region_id
) c;

--Esercizio: nome del manager per i dipendenti che si chiamano 'Jennifer'
--inner query:
select *
from employees
where first_name = 'Jennifer';

--con subquery
select employee_id, first_name, last_name
from employees
where employee_id in (
select manager_id
from employees
where first_name = 'Jennifer'
);

--Esercizio: selezionare i dipendenti che non sono manager
--inner query:
select distinct manager_id
from employees
where manager_id is not null;

--subquery:
select employee_id, first_name, last_name
from employees
where employee_id not in (
      select distinct manager_id
      from employees
      where manager_id is not null
)
order by 2,3;

--Esercizio:
select e.last_name, e.employee_id, m.last_name, m.department_id
from employees e left outer join employees m
on(e.manager_id = m.employee_id)
order by 3, 1;

--Esercizio: trovare, dato cognome, numero dip. e tutti gli impiegati che lavorano nel solito dip., i colleghi
select e.department_id, e.last_name, c.last_name
from employees e join employees c
on(e.department_id = c.department_id)
where e.employee_id != c.employee_id
order by 1, 2;

--Esercizio: trovare i nomi di tutti gli impiegati assunti dopo 'Davies'
select hire_date
from employees
where last_name = 'Davies';

select first_name, last_name, hire_date
from employees
where hire_date > (
      select hire_date
      from employees
      where last_name = 'Davies');

--Esercizio: trovare nome e le date di assunzione degli impiegati che sono stati assunti prima del loro manager
select e.last_name, e.hire_date, m.last_name, m.hire_date
from employees e join employees m
on(e.manager_id = m.employee_id)
where e.hire_date < m.hire_date
order by 1;

--Esercizio: employee_id, cognome e salario di tutti gli impiegati che guadagnano più della media
select avg(salary)
from employees;

select employee_id, last_name, salary
from employees
where salary > (
      select avg(salary)
      from employees
)
order by 3;

--Esercizio: individuare tutti gli impiegati che lavorano in un dipartimento in cui almeno un impiegato ha il cognome con la lettera 'U'
--inner query
select department_id, last_name
from employees
where last_name like '%u%';

select employee_id, last_name
from employees
where department_id in (
      select distinct department_id
      from employees
      where last_name like '%u%'
);

--Esercizio: individuare, per cognome, numero dip. e numero imp., i dipendenti che lavorano nel dip con location id 1770
select last_name, department_id, job_id
from employees join departments
using (department_id)
where location_id = 1700;

--Esercizio: trovare per cognome e salario tutti i dipendenti che hanno come manager King
select last_name, salary
from employees
where manager_id = (
      select employee_id
      from employees
      where first_name = 'Steven' and last_name = 'King'
);

--Esercizio: esprimere il numero del dip, cognome e numero imp per ogni impiegato che lavora nel dipartimento esecutivo
select department_id, last_name, job_id
from employees join departments
using(department_id)
where department_name = 'Executive';

--Esercizio: impiegati con salario più alto di quello di ogni altro impiegato del dipartimento 60
--inner query:
select salary
from employees
where department_id = 60;

select last_name, salary
from employees
where salary > (select min(salary)
                from employees
                where department_id = 60
);

--Esercizio: trovare gli impiegati che guadagnano più della media e che lavorano in un dipartimento con almeno un impiegato il cui cognome contine la lettera 'u'
select employee_id, last_name, salary
from employees
where salary > (
      select avg(salary)
      from employees) and department_id in (
      select distinct department_id
      from employees
      where last_name like '%u%');
      
--Esercizio: scrivere nome del dip, città, provincia
select department_name, city, state_province
from departments natural join locations 
order by 1;

--Esercizio: 
select first_name, last_name, department_id, department_name
from employees left join departments
using (department_id);

--Esercizio: trovare gli impiegati che lavorano nello stesso dipartimento di 'Taylor'
--inner query:
select department_id
from employees
where last_name = 'Taylor';

select first_name, last_name, department_id
from employees
where department_id in (
        select department_id
        from employees
        where last_name = 'Taylor'
);

--Esercizio: dipendenti assunti tra 01-01-93 e 31-11-97
select first_name, last_name, hire_date
from employees
where hire_date between '01-Gen-2003' and '31-Ago-2007'
order by 3;

--Esercizio: nome del dipartimento, salario medio e numero di impiegati nel dipartimento che prendono la commissione
select department_name, round(avg(salary))
from employees join departments
group by department_id;

select department_name
from employees join departments
using(department_id);

select department_id, round(avg(salary)), count(commission_pct)
from departments
join employees using (department_id)
group by department_name;
