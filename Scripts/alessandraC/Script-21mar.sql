select employee_id, last_name, job_id, hire_date as "Stardate"
from employees
order by employee_id

-- ordinare in gruppi x tipi di mansioni
select job_id
from employees
group by job_id


--come modificare il nome alle tabelle
select employee_id as "Emp #",
		last_name as "Employee",
		job_id as "job",
		to_char(hire_date) as "Hire date"
from employees

--employees: last name concatenated with the job_id
select (last_name|| ' ' ||job_id) as "Employee and title"
from employees


--mostrare tutti i dati dalle tabella, con colonna unica output e creiamo una concatenazione di tutti i valori
select (employee_id ||' ' ||
		first_name || ' '||
		last_name ||' ' ||
		email ||' ' ||
		phone_number ||' ' ||
		hire_date ||' ' ||
		job_id ||' ' ||
		salary ||' ' ||
		commission_pct ||' ' ||
		manager_id
		|| ' ' ||
		department_id) as "THE_OUTPUT"
from employees


select last_name, salary
from employees
where salary > 12000
order by salary desc


--cognome, dipartimento del lavoratore 176
select last_name, department_id
from employees
where employee_id = 176


select last_name, salary
from employees
where salary not between 5000 and 12000
order by 2 desc


select first_name, last_name, job_id, hire_date as "Stardate"
from employees
where last_name = 'Matos' or last_name = 'Taylor'
order by hire_date desc


select last_name, department_id
from employees
where department_id = 20 or department_id = 50
order by last_name


--siamo interessati a conoscere il salrio compreso tra 5000 e 12000 e il dipartimento tra 20 e 50
select last_name as "Employee", salary as "Monthy salary"
from employees
where salary between 5000 and 12000
	and (department_id = 20 or department_id = 50)
order by 2 desc


select last_name, hire_date 
from employees
where hire_date between '1-gen-2005' and '31-GEN-2005'
order by 1


select last_name
from employees
where manager_id is null


select last_name, salary, commission_pct
from employees
where commission_pct is not null
order by salary desc, commission_pct desc


--dipendenti il cui manager è il 103
select employee_id, last_name, salary, department_id
from employees
where manager_id = 103
order by 2


select last_name 
from employees
where last_name like '%a%' and last_name like '%e%'


--salario di 2500, 3000 e 7000 e appartenenti a due categorie di id
select last_name, job_id, salary
from employees
where job_id in ('SA_REP','ST_CLERK')
	and salary not in (2500, 3500, 7000)
	order by 3 desc
	
--stampa la data odierna
select to_char(sysdate) as "Date"
from dual

--incremento salario %
select employee_id, last_name, salary, trunc(salary + (salary * 15.5 / 100)) as "Increase 15.5%"
from employees
order by 1

--valore assoluto del salario(sottrae al vecchio salario il nuovo salario)
select employee_id, last_name, salary,
	round(salary + (salary * 15)/100) as "New salary",
	round(salary * 15/100) as "increase"
from employees
order by 1


--stampa il nome e la lunghezza degli employees, ma non per tutti, solo la lunghezza del last_name di quelli che cominciano x H
select last_name, length(last_name)
from employees
where last_name like 'H%'

---duration assunzione
select months_between(sysdate, '01-gen-19')
from dual

--conosce il numero di mesi di impiego dei dipendenti
select last_name, round(months_between (sysdate, hire_date)) as "Months Worked"
from employees
order by 2 desc


--salario in una colonna di 15 caratteri con $ nelle colonne mancanti
select last_name, lpad(salary, 15, '&') as "Salary"
from employees


--ammontare del salario in migliaia e con *
select last_name,
	lpad('*', salary/1000, '*') as salaries_in_asterisk
from employees
order by salary desc

--nome dei dipendenti appartenenti al dipartimento 90 e numero di settimane lavorate
select last_name,
	trunc(sysdate - hire_date)/7 as "Tenure"
from employees
where department_id = 90
order by 2 asc

select last_name, salary, to_char(salary * 3, '$99,999.00') as "DREAM SALARIES"
from employees
order by 2 desc

--cognome, commissione si e no
select last_name,
		nvl(to_char(commission_pct), 'no commission')
from employees


-------


select sysdate
from dual

--converte la data in parole
select employee_id, hire_date, to_char(hire_date, 'MONTH, DD, YYYY')
from employees

--data + orario oggi
select to_char(sysdate, 'DD MONTH YYYY HH24:MI:SS')
from dual

--data formato giapponese
select to_date('12-gen-1944', 'DD MONTH YYYY'), to_date('7.4.18', 'MM.DD.YY')
from dual

select to_char(
	to_date ('05-feb-2019 19:32:18', 'DD-MON-YYYY HH24:MI:SS'),
	'HH24:MI:SS')
	'MON')
	from dual
	
--aggiunge 1 mese a partire da quello corrente	
select sysdate, add_months(sysdate, 13)
from dual

--ultimo giorno del mese
select last_day('01-feb-2018')
from dual

select months_between(sysdate, '15-gen-01')
from dual

--il primo lunedi del mese
select next_day('01-giu-19', 'lunedi')
from dual

 --arrotondamento all'anno successivo - round - + troncamento nell'anno in corso - trunc
select round(to_date('25-ott-19'), 'YYYY'),
	trunc(to_date('25-OTT-19'), 'YYYY')
from dual
	
--the first monday 6 months from now
select next_day(add.months(sysdate, 6), 'monday')
from dual

--day of week
select to_char(sysdate, 'day')
from dual



-----


--the day 6 months in the future from now
select last_name, next_day(add_months(hire_date, 6), 'lunedi') to_char(hire_date, 'fmDay", the "ddspth" of "Month", "YYYY')
from employees


--massimo minimo somma e media di salary
select max(salary), min(salary), sum(salary), round(avg(salary))
from employees


select job_id, max(salary), min(salary), sum(salary), round(avg(salary))
from employees
group by job_id
order by 1 asc

--dipendenti raggruppati per tipo di lavoro
select job_id, count(employee_id)
from employees
group by job_id


--quanti manager ci sono in employee
select count(distinct manager_id)
from employees

--trova la differenza tra il max e il min salary
select max(salary), min(salary), max(salary) - min(salary)
from employees
order by salary asc


--manager_id e il min salary del suo employee
select manager_id, min(salary)
from employees
having manager_id is not null and min(salary) > 6000
group by manager_id
order by 2 desc


select location_id, street_address, city, country_name
from locations natural join countries
order by 1


select last_name, department_id, department_name
from employees join departments
using (department_id)
order by 2


--tutti i dipendenti che lavorano a Toronto
select e.last_name, e.job_id, d.department_id, d.department_name, l.city
from employees e join departments d
on(e.department_id = d.department_id)
	join locations l
on(d.location_id = l.location_id)
where city = 'Toronto'

select e.last_name as "Employee", e.employee_id as "Emp #", m.manager_id as "Mng#", m.last_name as "Manager"
from employees e join employees m
on(e.manager_id = m.manager_id)
order by 3, 1





