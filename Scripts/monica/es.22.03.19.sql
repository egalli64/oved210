
--22/03/19
--subquery
 SELECT
	employee_id
FROM
	EMPLOYEES
WHERE
	first_name = 'Steven'
	AND last_name = 'King';
--
 SELECT
	employee_id,
	first_name,
	last_name
FROM
	EMPLOYEES
WHERE
	MANAGER_ID = 100;
--
 SELECT
	employee_id,
	first_name,
	last_name
FROM
	EMPLOYEES
WHERE
	manager_id = (
	SELECT
		employee_id
	FROM
		EMPLOYEES
	WHERE
		first_name = 'Steven'
		AND last_name = 'King');
-- utilizza in perchè vi sono più valori
 SELECT
	employee_id,
	first_name,
	last_name
FROM
	EMPLOYEES
WHERE
	manager_id IN (
	SELECT
		employee_id
	FROM
		EMPLOYEES
	WHERE
		last_name = 'King');
--tutti i dipendenti che hanno lo stipendio maggiore della MEDIA
 SELECT
	FIRST_name,
	LAST_name,
	salary AS "salary > avg"
FROM
	EMPLOYEES
WHERE
	SALARY > (
	SELECT
		AVG(salary)
	FROM
		EMPLOYEES)
ORDER BY
	3 DESC;
-- 1) voglio i salari medio per ogni dipartimento
 SELECT
	DEPARTMENT_ID,
	ROUND(AVG(salary)) AS "avg salary"
FROM
	EMPLOYEES
GROUP BY
	DEPARTMENT_ID
ORDER BY
	2 DESC;
-- 2) non interessa il dipartimento con lo stipendio più alto
 SELECT
	DEPARTMENT_id,
	ROUND(AVG(salary)) AS "avg salary"
FROM
	EMPLOYEES
GROUP BY
	DEPARTMENT_ID
HAVING
	AVG(salary) < (
	SELECT
		MAX(AVG(salary))
	FROM
		EMPLOYEES
	GROUP BY
		DEPARTMENT_ID )
ORDER BY
	2 DESC;
-- con l'esempio di sotto genero una tabella temporanea
--esempio banale 
 SELECT
	first_name
FROM
	(
	SELECT
		EMPLOYEE_id,
		FIRST_NAME,
		LAST_NAME
	FROM
		EMPLOYEES
	WHERE
		EMPLOYEE_ID BETWEEN 112 AND 115 )
WHERE
	last_name LIKE 'P%';
-- voglio sapere quanti stati ci sono IN ogni regione
 SELECT
	r.REGION_NAME,
	c.country_count
FROM
	REGIONS r NATURAL
JOIN (
	SELECT
		COUNT(country_id) AS country_count ,
		region_id
	FROM
		COUNTRIES
	GROUP BY
		REGION_ID ) c

-- voglio il  employee_id, first_name, last_name, di tutti gli impiegati che hanno come manager jennifer                              

	SELECT manager_id
	FROM EMPLOYEES
	WHERE FIRST_NAME = 'Jennifer';
		
		
SELECT EMPLOYEE_id, first_name, LAST_NAME
FROM EMPLOYEES
WHERE EMPLOYEE_ID IN 
( SELECT manager_id
	FROM EMPLOYEES
	WHERE FIRST_NAME = 'Jennifer')
ORDER BY 1;
		
-- voglio sapere i dipendenti (employee_id,Last,First) che non sono manager
SELECT EMPLOYEE_id, first_name, LAST_NAME
FROM EMPLOYEES
WHERE EMPLOYEE_ID  NOT in (
SELECT DISTINCT manager_id
	FROM EMPLOYEES
	WHERE MANAGER_ID is NOT null )
		ORDER BY 1;
		
--	includo king in questo gruppo considerando l'ultimo es. del 21/03 aggiungendo left outer
	
SELECT e.LAST_NAME, e.EMPLOYEE_ID, m.last_name, m.DEPARTMENT_ID 
FROM EMPLOYEES e LEFT OUTER JOIN EMPLOYEES m
ON (e.MANAGER_ID = m.MANAGER_ID) 
ORDER BY 3,1;

--


SELECT E.DEPARTMENT_ID, E.LAST_NAME, C.LAST_NAME
FROM EMPLOYEES e  JOIN EMPLOYEES C
ON (E.DEPARTMENT_ID = C.DEPARTMENT_ID) 
WHERE E.EMPLOYEE_ID != C.EMPLOYEE_ID
ORDER BY 1,2;

--
SELECT HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Davies'

SELECT LAST_name, hire_date
FROM EMPLOYEES
WHERE hire_date > (SELECT HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Davies'
)
ORDER BY 2;


-- nomi impiegati assunti prima del loro manager

SELECT e.LAST_NAME, e.HIRE_DATE, m.LAST_NAME, m.HIRE_DATE
FROM EMPLOYEES e JOIN EMPLOYEES m
ON (e.MANAGER_ID = m.EMPLOYEE_ID)   -- creo una connessione tra il manager e l'impiegato
WHERE e.HIRE_DATE < m.HIRE_DATE
ORDER BY 1;


-- 
SELECT ROUND(avg(salary))   --subquery
FROM EMPLOYEES
GROUP BY EMPLOYEE_ID

SELECT EMPLOYEE_id, last_name, salary
FROM EMPLOYEES
WHERE SALARY > (SELECT ROUND(avg(salary))
FROM EMPLOYEES
)
ORDER BY 3;

--scrivere employee_id e last_name che lavorano in un dipartimento dove almeno un impiegato ha il conognome con la lettera u 

SELECT DISTINCT DEPARTMENT_id
FROM EMPLOYEES
WHERE LAST_NAME LIKE '%u%'


SELECT last_name, employee_id, DEPARTMENT_ID
FROM EMPLOYEES 
WHERE DEPARTMENT_ID IN (SELECT DISTINCT DEPARTMENT_id
FROM EMPLOYEES
WHERE LAST_NAME LIKE '%u%'
)
ORDER BY  3 DESC;

--  sotto esercizio sbagliato esperimento mio 
SELECT  LOCATION_id
FROM DEPARTMENTS
ORDER BY DEPARTMENT_ID

SELECT last_name, DEPARTMENT_id, job_id
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN  (SELECT LOCATION_id
FROM DEPARTMENTS
) 
ORDER BY 2;

-- 

SELECT e.last_name, e.salary
FROM EMPLOYEES e JOIN EMPLOYEES m
ON e.MANAGER_ID =m.EMPLOYEE_ID
WHERE m.last_name = 'King'

--
SELECT DEPARTMENT_name
FROM DEPARTMENTS
WHERE DEPARTMENT_name= 'Executive'

SELECT department_id, last_name, job_id
FROM EMPLOYEES
WHERE DEPARTMENT_ID = (
	SELECT DEPARTMENT_ID
	FROM DEPARTMENTS
	WHERE DEPARTMENT_name= 'Executive'
)
ORDER BY DEPARTMENT_ID;

--
SELECT salary
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 60

SELECT last_name, SALARY
FROM EMPLOYEES
WHERE salary > ANY (SELECT salary
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 60)
ORDER BY last_name;

SELECT last_name, SALARY
FROM EMPLOYEES
WHERE salary > all (SELECT salary
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 60)
ORDER BY SALARY;

--
 

SELECT avg(salary)
FROM EMPLOYEES
WHERE LAST_NAME LIKE '%u%'

SELECT EMPLOYEE_id, last_name, salary
FROM EMPLOYEES
WHERE salary > (SELECT avg(salary)
FROM EMPLOYEES
WHERE LAST_NAME LIKE '%u%')
ORDER BY 1;

--

SELECT department_name, city ,state_province
FROM DEPARTMENTS  NATURAL JOIN LOCATIONS 
ORDER BY 1;

--
SELECT department_id
FROM EMPLOYEES
WHERE last_name = 'Taylor'

SELECT first_name, last_name, DEPARTMENT_id
FROM EMPLOYEES
WHERE DEPARTMENT_ID in (SELECT department_id
FROM EMPLOYEES
WHERE last_name = 'Taylor');


--
SELECT EMPLOYEE_ID
FROM EMPLOYEES
WHERE hire_date BETWEEN '01-gen-03' AND '31-ago-07'
--

SELECT count(EMPLOYEE_id)
FROM EMPLOYEES
WHERE COMMISSION_PCT IS not NULL
--GROUP BY DEPARTMENT_ID;

SELECT department_id, avg(salary)
FROM EMPLOYEES
WHERE EMPLOYEE_ID != (SELECT count(EMPLOYEE_id)
                     FROM EMPLOYEES
                     WHERE COMMISSION_PCT IS NOT NULL)
GROUP BY DEPARTMENT_ID ;
               
               
               
               
               
               
               
               
               
               
               
