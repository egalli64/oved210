--subquery
SELECT employee_id
FROM EMPLOYEES
WHERE FIRST_NAME = 'Steven' AND LAST_NAME = 'King';

SELECT employee_id, FIRST_name, last_name
FROM EMPLOYEES
WHERE MANAGER_ID = 100;

--per riscriverla con una query sola
--selez gli id il cui manager id è l'employee che si chiama steven king
select employee_id, first_name, last_name
from employees
where manager_id = (
select employee_id
from employees
where first_name = 'Steven' and last_name = 'King');

select employee_id, first_name, last_name
from employees
where manager_id in (
select employee_id
from employees
where last_name = 'King');

--tutti i dip che hanno lo stipendio maggiore della media
SELECT employee_id, first_name, last_name, salary
FROM EMPLOYEES
WHERE SALARY > ( 
SELECT avg(SALARY)
FROM EMPLOYEES)
ORDER BY 4 desc;

--salario medio per ogni dipartimento
--esclude il dipartimento che ha il salario più alto, voglio filtrare(togliere) il gruppo che ha il salario medio più alto
--voglio fare suna sub query che mi identifica il salario più alto
SELECT department_id, round(avg(salary))
FROM EMPLOYEES 
GROUP BY DEPARTMENT_ID
having avg(salary) < (
SELECT max(avg(SALARY))
FROM EMPLOYEES 
GROUP BY DEPARTMENT_ID)
ORDER BY 2 DESC;

--opp
SELECT department_id, round(avg(salary))
FROM EMPLOYEES 
GROUP BY DEPARTMENT_ID
having avg(salary) > (
SELECT min(avg(SALARY))
FROM EMPLOYEES 
GROUP BY DEPARTMENT_ID)
ORDER BY 2 DESC;

--esempio
--select che mi ritorna alcuni employee_id
--il from quando faccio una sub query mi considera il select come un'altra tabella
SELECT first_name
FROM ( --il from è come se mi generasse una tabella esterna in cui faccio le mie operazioni
SELECT EMPLOYEE_id, first_name, last_name
FROM EMPLOYEES
WHERE EMPLOYEE_ID BETWEEN 112 AND 115
)
WHERE last_name LIKE 'P%'; --cognomi degli impiegati con id compreso tra 112 e 115 che cominciano per p

--QUANTI COUNTRIES IN OGNI REGIONE

(

SELECT COUNt(rowid)
FROM COUNTRIES
GROUP BY region_id;

)


--nome della regione e country associate
select r.region_name, c.country_count
from regions r natural join (
select region_id, count(rowid) as country_count
from countries
group by region_id
) c;

--vogliamo dalla tab employees , nome manager per i dipendenti che si chiamano jennifer
select manager_id, employee_id, first_name, last_name
from employees
where employee_id in (
select MANAGER_ID
from employees
WHERE first_name = 'Jennifer');

--tutti gli employee che non sono manager

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
FROM EMPLOYEES 
WHERE EMPLOYEE_ID NOT IN(
SELECT DISTINCT MANAGER_ID
FROM EMPLOYEES
WHERE MANAGER_ID IS NOT NULL
)
ORDER BY 2, 3;


--EMPLOYEE, LAST_NAME, DEPARTMENT number di tutti gli employee che lavorano nello stesso d
select e.department_id, e.LAST_NAME, c.LAST_NAME
from EMPLOYEES e JOIN EMPLOYEES c
 on(e.department_id = c.department_id)
 WHERE e.EMPLOYEE_ID != c.EMPLOYEE_ID
 ORDER BY 1, 2;

--nomi degli impiegati assunti dopo davies

select last_name, HIRE_DATE
from employees
where HIRE_DATE > (
select HIRE_DATE
from employees
where LAST_NAME = 'Davies');

--nomi e data di assunzione degli employee assunti prima del manager
--devo confront employye e manager
--devo vedere come se fosse la tabella degli employee e la tabella dei manager
select e.LAST_NAME, m.LAST_NAME, e.HIRE_DATE, m.HIRE_DATE
from EMPLOYEES e JOIN EMPLOYEES m
 on(e.manager_id = m.EMPLOYEE_ID) --come condizione manager_id dovra essere uguale employee_id, cosi da leggere i valori 
 WHERE e.HIRE_DATE < m.HIRE_DATE
 ORDER BY 1;

--natural join,non specifichiamo su cosa lo facciamo non si usa on e using
--per essere tranquillo possiamo usare join con using e specifichiamo la colonna che deve avere lo stesso nome dalla parte di PK E DALLA PARTE DELLA FK o on
--country-region ad esempio, utilizziamo using region_id, on 
--INNER JOIN, vengono scartate le righe dove ci sono i null
--left  JOIN
--RIGHT JOIN
--full join per combinare

--employee_id, last_name, salari di chi guadagna più della media 
--in ordine di salario

SELECT EMPLOYEE_ID, last_name, salary
FROM EMPLOYEES 
WHERE SALARY > (
SELECT avg(SALARY)
FROM EMPLOYEES)
ORDER BY 2 desc;

--query che mostra employee_id e last_name di tutti gli employee che lavorano 
--nei dipart in cui un dipendente contiene un cognome con la lett u

SELECT employee_id, last_name
FROM EMPLOYEES
WHERE DEPARTMENT_ID in (
SELECT DISTINCT DEPARTMENT_ID
FROM EMPLOYEES
WHERE last_name LIKE '%u%');

--last_name, depa_id job_id di tutti gli employee
--la cui location del dipartimento è 1700

SELECT last_name, department_id, job_id
from employees join departments 
 using(department_id)
 where location_id = 1700;

--stamp cognome e salario dei dipendenti che hanno come manager king
--devo vedere la tabella employees come 2 tabelle
--1 tab per gli employee e 1 per i manager
SELECT e.last_name, e.salary
FROM employees e join EMPLOYEES m
on e.MANAGER_ID = m.EMPLOYEE_ID
WHERE m.LAST_NAME = 'King';




SELECT last_name, salary
FROM EMPLOYEES
WHERE MANAGER_ID in (
SELECT EMPLOYEE_ID 
FROM EMPLOYEES
WHERE last_name LIKE 'King');

--dep id
--per ogni impiegato nel dipartimento executive

SELECT DEPARTMENT_ID, last_name, job_id
FROM DEPARTMENTS JOIN EMPLOYEES
using(DEPARTMENT_ID)
-- on(d.DEPARTMENT_ID = e.DEPARTMENT_ID)
WHERE DEPARTMENT_NAME = 'Executive';

--opp soluz con sub
SELECT DEPARTMENT_ID, LAST_NAME, JOB_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID = (
SELECT DEPARTMENT_ID
FROM DEPARTMENTS
WHERE department_name = 'Executive');

-- last name 
--dipart il cui stip è maggiore di tutti i salari di qualunque employee del dip 60
--dip 60, salari = 100, 200, 300
--dip 50, salari = 220 accettiamo, l'i           
---salario degli employees

SELECT last_name, salary
FROM EMPLOYEES 
WHERE salary > any(
SELECT SALARY 
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 60)
ORDER BY 2;

--soluzione equivalente
SELECT last_name, salary
FROM EMPLOYEES 
WHERE salary > (
SELECT min(SALARY) 
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 60)
ORDER BY 2;

--opp maggiore di tutti
SELECT last_name, salary
FROM EMPLOYEES 
WHERE salary > all(
SELECT SALARY 
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 60)
ORDER BY 2;


--salario più alto della media e lavorano in un dip con il cognome che contiene almeno unau

SELECT employee_id, last_name, salary
FROM EMPLOYEES
WHERE DEPARTMENT_id in(
SELECT DISTINCT DEPARTMENT_ID
FROM EMPLOYEES
WHERE last_name LIKE '%u%'
) AND 
salary > (
SELECT avg(salary)
FROM EMPLOYEES);

--query per stampare department_name, city, state_province 
--vogliamo sapere 
SELECT department_name, city, state_province
FROM DEPARTMENTS d JOIN LOCATIONS l
ON(d.LOCATION_ID = l.LOCATION_ID);

--di tutti gli employee che hanno e che non hanno dipart
--first_name, last_name, department_id, department_name
SELECT first_name, last_name, department_id, department_name
FROM employees LEFT JOIN DEPARTMENTS
using(department_id);


--employee che lavorano nello stesso dipartimento di taylor

SELECT first_name, last_name, DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (
SELECT DISTINCT DEPARTMENT_ID
FROM EMPLOYEES
WHERE last_name = 'Taylor');

-- dipendenti assunti dal 1 genn 93 e 31 agosto 97
SELECT first_name, last_name, HIRE_DATE
FROM EMPLOYEES
WHERE hire_date BETWEEN '01-GEN-03' AND '31-AGO-07';

--nome dip, salario medio per dipartmnt, nr employee che lavorano in quel dip che hanno la commissione
--raggrupp per dip, ci stamp il nome del dip, salario medio per dip, e employee che lavorano in quel dipart che hanno commissioni
 

--il count scarta i null quinid non c'è bisogno di scrivere commission_pct is not null

SELECT department_name, round(avg(salary)), count(commission_pct)
FROM DEPARTMENTS
JOIN EMPLOYEES USING(department_id)
GROUP BY DEPARTMENT_NAME;



