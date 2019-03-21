--ESERCIZIO:
--1) Employees: show id, last name, job id, hire date, for each employee
select  employee_id, last_name, job_id, to_char(hire_date) as "StarDate"
from employees
order by 1;

--2) Employees: display all unique job ids from employees
select distinct job_id
from employees
order by 1;

--3) Employees: emp#, employee, job, hire date 
select employee_id as "#Emp", last_name as "Employee", job_id as "Job", to_char(hire_date) as "HireDate"
from employees
order by 1;

--4) Employees: Employee and title: last name and job concatenated
select (last_name || ' , ' || job_id) as "Employee adn Title"
from employees;

--5) Employees: tutte le colonne riassunte in una unica intitolata The_Output
select (employee_id||','||first_name||','||last_name||','||email||','||phone_number||',,'||hire_date||','||job_id||','||salary||','||commission_pct||',,'||manager_id||',,'||department_id) 
      as "The_Output"
from employees
order by employee_id;

--6) Employees: last_name and salary more than 12,000$
select last_name, salary
from employees
where salary > 12000
order by salary desc;

--7) Employees: last name end department for employee number 176
select last_name, department_id
from employees
where employee_id = 176;

--8) Employees: last name high salaried and low salaried in not in the range 5000 through 12000
select last_name, salary
from employees
where salary not between 5000 and 12000
order by salary desc;

--9) Employees: cognome, job id, hire date, che si chiamano Matos OR Taylor order by hire date asc
select first_name, last_name, job_id, to_char(hire_date)
from employees
where last_name = 'Matos' or last_name = 'Taylor'
order by hire_date asc;

--10) Employees: last_name, department id, nel 20 o 50, in ordine alfabetico
select last_name, department_id
from employees
where department_id = 20 or department_id = 50
order by 1;

--11) Employees: employee and monthly salary, salario tra i 5000 e 12000 e nel dipartimento 20 OR 50
select last_name as "Employee", salary as "MonthlySalary"
from employees
where salary between 5000 and 12000
     and (department_id = 20 or department_id = 50)
order by 2 desc;

--12) Employees: last name, hire date SOLO per quelli assunti nel 2005
select last_name, to_char(hire_date)
from employees
where hire_date >= '01-GEN-2005' and hire_date <= '31-DIC-2005'
order by hire_date asc;

--13) Employees: last name, job title senza manager
select last_name, job_id
from employees
where manager_id is null;

--14) Employees:last name, salary, commission, di employee che hanno una commission, order by salary e commission desc
select last_name, salary, commission_pct
from employees
where commission_pct is not null
order by salary desc, commission_pct desc;

--15) Employees: employee id, last name salary e department con manager id = 102, order by last name.
select last_name, employee_id, salary, department_id
from employees
where manager_id = 103
order by 1;

--16) Employees: last name che hanno "a" e "e" nel cognome
select last_name
from employees
where lower(last_name) like '%a%' and lower(last_name) like '%e%'
order by last_name;

--17) Employees: last name, job, salary not 2500 3500 7000, con job id = sales representative or a stock clerk
select last_name, job_id, salary
from employees
where salary not in(2500, 3500, 7000)
     and job_id in ('SA_REP', 'ST_CLERK')
order by 3 DESC;

--18) Employees: data odierna 
select to_char(sysdate) as "Date"
from dual;

--19) Employees: last name, salary, employee id, salary increased by 15.5% as "New salary"
select  employee_id, last_name, salary, (salary + trunc(salary *0.155)) as "NewSalary"
from employees
order by 4 desc;

--20) Employees: vecchio salrio - nuovo salario as increase
select employee_id, last_name, salary, 
       round(salary + salary * 0.155) as "NewSalary",
       round (salary * 0.155) as "Increase"
from employees
order by 5 desc;

--21) Employees: last name , la sua lunghezza per tutti gli employees che cominciano con H:
select last_name, length(last_name)
from employees
where last_name like 'H%'
order by 1;

--22) Employees: duration of employmet as "Month_Worked" dall'assunzione ad oggi quanto tempo è passato, arrotondato (quindi ROUND)
select round(months_between(sysdate, '01-GEN-2019')) as "Month_Worked"
from dual;

select last_name, round(months_between(sysdate, hire_date)) as "Month_Worked"
from employees
order by 2 desc;

--23) 15 caratteri, left_padded with $ per riempire as salary
select last_name, lpad(salary , 15, '$') as "Salary"
from employees
order by employee_id;

--24) salaries_in_asterisk *: voglio mettere gli * al posto delle cifre che mi vanno a rappresentare la quantità del salario
select last_name, lpad('*', round(salary/100), '*')  as "salaries_in_asterisk" 
from employees
order by salary desc;

--25) last name, trunc number of weeks as tenure, solo per il dip 90
select last_name, trunc((sysdate - hire_date)/7) as "Tenure"
from employees
where department_id = 90
order by 2 desc;
