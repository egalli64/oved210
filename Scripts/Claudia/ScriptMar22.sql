--subquery
SELECT EMPLOYEE_ID
FROM EMPLOYEES
WHERE FIRST_NAME = 'Steven' AND LAST_NAME = 'King';

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE MANAGER_ID = 100;

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE MANAGER_ID = (SELECT EMPLOYEE_ID
FROM EMPLOYEES
WHERE FIRST_NAME = 'Steven' AND LAST_NAME = 'King');

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE MANAGER_ID in (SELECT EMPLOYEE_ID
FROM EMPLOYEES
WHERE LAST_NAME = 'King');

--esempio
--subquery
SELECT avg(salary)
FROM EMPLOYEES

--innerquery
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > (SELECT avg(SALARY) FROM EMPLOYEES)
ORDER BY 4 DESC

--salari medi per ogni dipartimento
SELECT DEPARTMENT_id, ROUND(avg(salary)) AS "AVG SALARY DP"
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY 2 DESC

--esclusione avg salary più alto
SELECT DEPARTMENT_id, ROUND(avg(salary)) AS "AVG SALARY DP"
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING round(avg(SALARY)) < (
	SELECT max(round(avg(SALARY)))
	FROM EMPLOYEES
	GROUP BY DEPARTMENT_ID)
ORDER BY 2 DESC

--la media della media dei salari o il minimo della media dei salari
SELECT DEPARTMENT_id, ROUND(avg(salary)) AS "AVG SALARY DP"
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING round(avg(SALARY)) < (
	SELECT avg(avg(SALARY))
	FROM EMPLOYEES
	GROUP BY DEPARTMENT_ID)
ORDER BY 2 DESC

--subquery posta nel FROM
SELECT FIRST_NAME
FROM (
	SELECT EMPLOYEE_id, FIRST_NAME, LAST_NAME
	FROM EMPLOYEES
	WHERE EMPLOYEE_ID BETWEEN 112 AND 115
)
WHERE LAST_NAME LIKE 'P%'

--quanti countries ci sono in ogni regions
SELECT COUNT(ROWID)
FROM COUNTRIES
WHERE REGION_ID = 1

SELECT r.REGION_NAME, c.country_count
FROM REGIONS r NATURAL JOIN (
SELECT COUNT(ROWID) AS COUNTRY_COUNT, REGION_ID
FROM COUNTRIES
GROUP BY REGION_ID) c;

--employee id, first name, last name da tabella Employees dei dipendenti che si chiamano
SELECT MANAGER_ID
FROM EMPLOYEES
WHERE FIRST_NAME = 'Jennifer'

SELECT employee_id, first_name, last_name, MANAGER_ID
FROM  EMPLOYEES
WHERE EMPLOYEE_ID IN (SELECT MANAGER_ID
FROM EMPLOYEES
WHERE FIRST_NAME = 'Jennifer'
)

--voglio sapere quali employees non sono manager
SELECT DISTINCT manager_id
FROM EMPLOYEES

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE EMPLOYEE_ID not in (
SELECT DISTINCT manager_id
FROM EMPLOYEES
WHERE MANAGER_ID IS NOT NULL
)
ORDER BY 2, 3;

--riprendere esercizio di ieri
select e.last_name, e.employee_id, m.last_name, m.department_id
from employees e LEFT OUTER join employees m
on(e.manager_id = m.employee_id)
order by 3, 1

SELECT E.department_id, E.last_name AS "EMPLOYEE", C.LAST_NAME AS "COLLEGUE"
FROM EMPLOYEES E JOIN EMPLOYEES C
ON(E.DEPARTMENT_ID = C.DEPARTMENT_ID)
WHERE E.EMPLOYEE_ID != C.EMPLOYEE_ID
ORDER BY 1, 2;

--impiegati assunti dopo Davies
SELECT HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Davies'

SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE > (SELECT HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Davies'
)

--nomi degli impiegati assunti prima del proprio manager
SELECT e.LAST_NAME, e.HIRE_DATE, m.last_name, m.hire_date
FROM EMPLOYEES e JOIN EMPLOYEES m
on(e.MANAGER_ID = m.EMPLOYEE_ID)
WHERE e.HIRE_DATE < m.HIRE_DATE
ORDER BY 1;

--impiegati che guadagnano più della media
SELECT trunc(AVG(SALARY))
FROM EMPLOYEES

SELECT employee_id, last_name, salary
FROM EMPLOYEES
WHERE SALARY > (SELECT trunc(AVG(SALARY))
FROM EMPLOYEES )
ORDER BY 3 DESC

--impiegati di un dipartimento in cui almeno un impiegato ha il nome che contiene la lettera "u"
SELECT DISTINCT DEPARTMENT_ID
FROM EMPLOYEES
WHERE LAST_NAME LIKE '%u%'
ORDER BY 1 DESC

SELECT employee_id, last_name, DEPARTMENT_ID
FROM EMPLOYEES 
WHERE DEPARTMENT_ID in (SELECT DISTINCT DEPARTMENT_ID
FROM EMPLOYEES
WHERE LAST_NAME LIKE '%u%' )
ORDER BY 3 DESC

--impiegati per cui la location id è 1700 suddivisi per dipartimento
SELECT last_name, department_id, job_id
FROM EMPLOYEES JOIN DEPARTMENTS
USING(DEPARTMENT_id)
WHERE location_id = 1700
ORDER BY 2 DESC

--salario e nome dei dipendenti sottoposti a King
SELECT e.LAST_NAME, e.SALARY, e.MANAGER_ID
FROM EMPLOYEES e JOIN EMPLOYEES M
on(e.MANAGER_ID = m.EMPLOYEE_ID)
WHERE e.MANAGER_ID = 100
ORDER BY SALARY DESC

--trovare i dipendenti che si trovano nell'executive department
SELECT d.DEPARTMENT_ID, e.LAST_NAME, e.JOB_ID
FROM EMPLOYEES e  JOIN DEPARTMENTS d
ON( e.DEPARTMENT_ID = d.DEPARTMENT_ID)
WHERE department_name = 'Executive'

--nomi dei dipendenti il cui salario è più alto di uno dei salari dei dipendenti del dipartimento 60
SELECT SALARY
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 60

SELECT last_name, salary
FROM EMPLOYEES
WHERE SALARY > any( SELECT SALARY
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 60)

--impiegati che guadagnano più della media del salario e che hanno nel loro last name una lettera "u"
SELECT LAST_NAME
FROM EMPLOYEES
WHERE LAST_NAME like '%u%'

SELECT avg(SALARY)
FROM EMPLOYEES

SELECT EMPLOYEE_ID, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > (SELECT trunc(AVG(SALARY))
FROM EMPLOYEES
WHERE LAST_NAME like '%u%')

--nome dipartimento, città, stato provincia per ogni dipartimento
SELECT department_name, city, state_province
FROM DEPARTMENTS NATURAL JOIN LOCATIONS
ORDER BY 1

--nomi dipendenti per dipartimento in cui c'è un impiegato di nome "Taylor"
SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (
SELECT DEPARTMENT_ID
FROM EMPLOYEES
WHERE LAST_NAME = 'Taylor'
)

--nomi dipendenti che hanno cominciato dopo 1 gen 2003 e finito prima del 31 ago 2007
SELECT first_name, last_name, hire_date
FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN '01-Gen-03' AND '31-Ago-07'
ORDER BY 1

--nome dipartimento, salario medio e numero di impiegati, che hanno o non hanno commissioni
SELECT DEPARTMENT_name, COUNT(COMMISSION_PCT), trunc(avg(SALARY))
FROM EMPLOYEES JOIN DEPARTMENTS
USING(DEPARTMENT_id)
GROUP BY DEPARTMENT_name






