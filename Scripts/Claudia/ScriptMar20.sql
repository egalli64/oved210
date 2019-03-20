--  jobs WHERE min salary IN [2000 - 5000] ordered BY job title
 SELECT JOB_TITLE, MIN_SALARY
 FROM jobs
 WHERE MIN_SALARY BETWEEN 2000 AND 5000
ORDER BY job_title;
 
--ALL countries IN region Europe
--prima parte del problema
SELECT REGION_ID
FROM REGIONS
WHERE REGION_NAME = 'Europe'

--seconda parte
SELECT COUNTRY_NAME
FROM COUNTRIES
WHERE REGION_ID = 1

SELECT COUNTRY_NAME
FROM COUNTRIES c, REGIONS r
WHERE c.REGION_ID = r.REGION_ID AND region_name = 'Europe'

SELECT country_name, region_name
FROM COUNTRIES NATURAL JOIN REGIONS

SELECT country_name, region_name
FROM COUNTRIES JOIN REGIONS 
USING(region_id) 

--emplooyes : first name, last name where department name is IT
--se ci sono 2 chiavi il natural join non funziona!!!
--SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_NAME
--FROM DEPARTMENTS NATURAL JOIN EMPLOYEES 
--WHERE DEPARTMENT_ID = '60'

SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_NAME
FROM EMPLOYEES JOIN DEPARTMENTS
USING(DEPARTMENT_ID)
WHERE department_name = 'IT'

--usando "on"
SELECT e.first_name, e.last_name, d.department_name
FROM EMPLOYEES JOIN DEPARTMENTS
on(e.department_id = d.department_id)
WHERE department_name = 'IT'

--self join
SELECT emp.FIRST_NAME || ' ' || emp.LAST_NAME AS "Employees",
		mng.FIRST_NAME || ' ' || mng.LAST_NAME AS "Manager"
FROM EMPLOYEES emp JOIN EMPLOYEES mng
on(emp.MANAGER_ID = mng.EMPLOYEE_ID)
ORDER BY 1;

--più tabelle
SELECT e.FIRST_NAME, e.LAST_NAME, l.CITY, d.DEPARTMENT_NAME
FROM EMPLOYEES e, DEPARTMENTS d, LOCATIONS l
WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID
AND d.LOCATION_ID = l.LOCATION_ID
ORDER BY 4;

--più tabelle usando il JOIN
SELECT e.FIRST_NAME, e.LAST_NAME, l.CITY, d.DEPARTMENT_NAME
FROM EMPLOYEES e JOIN DEPARTMENTS d
ON(E.DEPARTMENT_ID = D.DEPARTMENT_ID)
JOIN LOCATIONS L
ON(d.LOCATION_ID = l.LOCATION_ID)
ORDER BY 4;

--modo moderno di scriverlo con USING
SELECT e.FIRST_NAME, e.LAST_NAME, l.CITY, d.DEPARTMENT_NAME
FROM EMPLOYEES e JOIN DEPARTMENTS d
USING(DEPARTMENT_ID)
JOIN LOCATIONS L
USING(LOCATION_ID)
ORDER BY 4;

-- manager: steven king
--shipping department, in ordine di first name
SELECT emp.first_name, emp.last_name, mng.FIRST_NAME, mng.LAST_NAME, d.DEPARTMENT_NAME
FROM EMPLOYEES emp JOIN EMPLOYEES mng
on(MNG.employee_id = emp.manager_id)
JOIN DEPARTMENTS d
on(emp.department_id = d.DEPARTMENT_ID)
WHERE d.DEPARTMENT_NAME = 'Shipping'
AND mng.FIRST_NAME = 'Steven' and mng.LAST_NAME = 'King'
ORDER BY 1;

SELECT emp.first_name, emp.last_name
FROM EMPLOYEES emp JOIN DEPARTMENTS d
using(department_id)
WHERE d.DEPARTMENT_NAME = 'Shipping'
ORDER BY 1;

SELECT first_name, last_name, department_name
FROM EMPLOYEES JOIN DEPARTMENTS
USING(department_id)
WHERE LAST_NAME LIKE '%Gr%'

--gli dico di mettere lo stesso il nome che in department ha un "null" come department_name con il comando LEFT OUTER JOIN
SELECT first_name, last_name, department_name
FROM EMPLOYEES LEFT OUTER JOIN DEPARTMENTS
USING(department_id)
WHERE LAST_NAME LIKE '%Gr%'

SELECT first_name, last_name, DEPARTMENT_ID
FROM EMPLOYEES 
WHERE DEPARTMENT_ID BETWEEN 110 AND 120;

SELECT first_name, last_name, DEPARTMENT_NAME
FROM EMPLOYEES FULL OUTER JOIN DEPARTMENTS
USING(DEPARTMENT_ID)
WHERE LAST_NAME LIKE 'Gr%' 
	OR DEPARTMENT_ID BETWEEN 110 AND 120;

--departments : name and associated manager (se esiste) ordinato per nome
SELECT d.DEPARTMENT_NAME, e.FIRST_NAME || ' ' || e.LAST_NAME AS "Manager"
FROM DEPARTMENTS d LEFT OUTER JOIN  EMPLOYEES e 
on(d.MANAGER_ID = e.EMPLOYEE_ID)
ORDER BY 1;
 
--employees : name and manager name
SELECT emp.FIRST_NAME || ' ' || emp.LAST_NAME AS "Employees",
		mng.FIRST_NAME || ' ' || mng.LAST_NAME AS "Manager"
FROM EMPLOYEES emp LEFT OUTER JOIN EMPLOYEES mng
on(emp.MANAGER_ID = mng.EMPLOYEE_ID)
ORDER BY 1;

--employees : name and manager name ordinati per salario
SELECT emp.FIRST_NAME || ' ' || emp.LAST_NAME AS "Employees",
		mng.FIRST_NAME || ' ' || mng.LAST_NAME AS "Manager", emp.SALARY
FROM EMPLOYEES emp LEFT OUTER JOIN EMPLOYEES mng
on(emp.MANAGER_ID = mng.EMPLOYEE_ID)
ORDER BY SALARY DESC

--funzioni
SELECT ascii('A'), CHR(90)
FROM dual;

--concatenazione
SELECT CONCAT(FIRST_NAME, LAST_NAME)
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 100

SELECT REGION_NAME, instr(REGION_NAME, 'Middle')
FROM REGIONS
WHERE REGION_ID = 4;

SELECT REGION_NAME, instr(REGION_NAME, 'a'), instr(REGION_NAME, 'a', 10), instr(REGION_NAME, 'a', 10, 2), instr(REGION_NAME, 'a', 10, 3)
FROM REGIONS
WHERE REGION_ID = 4;

--riconosce la data scritta come stringa nell'espressione della data, la legge in ordine gg/mm/anno
SELECT HIRE_DATE, instr(HIRE_DATE, 'GEN')
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 102;

SELECT region_name, LENGTH(region_name)
FROM REGIONS;

SELECT salary, LENGTH(SALARY), length(101.01)
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 100

SELECT upper(first_name), lower(LAST_NAME), INITCAP(LOWER(FIRST_NAME))
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 112

SELECT rpad('hello', 30, '.'), LPAD('hello', 30, '.')
FROM dual

SELECT ltrim('    hello'), rtrim('helloABAB', 'AB'), TRIM('0' FROM '000hello0000')
FROM DUAL

--nvl
SELECT nvl(commission_pct, 0)
FROM EMPLOYEES

SELECT nvl2(commission_pct, 'has commission', 'no commission')
FROM EMPLOYEES

SELECT job_title, REPLACE(JOB_TITLE, 'Administration', 'Admin')
FROM JOBS

--substring
SELECT job_title, UPPER(SUBSTR(JOB_TITLE, 16, 4))
FROM JOBS
WHERE JOB_ID = 'AD_VP'

--MATH
SELECT abs(-10),
	ceil(5.8), ceil(-5.8),
	floor(-5.8), floor(5.2),
	mod(8 , 4), mod(8 , 3),
FROM dual

SELECT power(2, 1), power(2 , 3),
	sqrt(25), sqrt(5),
	ROUND(5.75), round(5.75, 1), round(5.75, -1),
	sign(-5), sign(5), sign(0),
	trunc(5.75)
FROM dual

SELECT to_char(1234.54), TO_CHAR(1234.54, '99,999.99'), to_char(2019, 'RN'),
TO_NUMBER('970,23')* 2, CAST('05-GEN-18' AS DATE), CAST(12345.234 AS NUMBER(10, 2))
FROM dual

--FUNZIONI AGGREGATE
SELECT avg(salary), VARIANCE(SALARY), STDDEV(SALARY), avg(DISTINCT salary)
FROM EMPLOYEES
ORDER BY SALARY

SELECT count(*), count(EMPLOYEE_ID), count(DEPARTMENT_ID), count(rowid)
FROM EMPLOYEES

SELECT sum(SALARY), max(SALARY), min(SALARY), max(FIRST_NAME), min(LAST_NAME),
	max(HIRE_DATE), min(HIRE_DATE)
FROM EMPLOYEES

SELECT avg(salary)
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 30

SELECT DEPARTMENT_ID, count(rowid), trunc(avg(SALARY))
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY 3 DESC;

SELECT DISTINCT department_id
FROM EMPLOYEES
ORDER BY 1;

--employees : salario medio dei dipendenti a seconda della sede di lavoro raggruppati per country_id
SELECT trunc(avg(SALARY)), l.COUNTRY_ID
FROM EMPLOYEES e JOIN DEPARTMENTS d
on(e.DEPARTMENT_ID = d.DEPARTMENT_ID)
JOIN LOCATIONS l
on(l.LOCATION_ID = d.LOCATION_ID)
GROUP BY l.COUNTRY_ID

--having : filter groups
--quali sono i manager più generosi
SELECT manager_id, trunc(avg(salary))
FROM EMPLOYEES
GROUP BY MANAGER_ID
HAVING avg(salary) > 8500
ORDER BY 2 DESC

SELECT manager_id, trunc(avg(salary))
FROM EMPLOYEES
WHERE salary > 8500
GROUP BY MANAGER_ID
ORDER BY 2 DESC

--doppio filtro prima con where (sulle righe) e poi con having (sui gruppi)
SELECT manager_id, trunc(avg(salary))
FROM EMPLOYEES
WHERE salary > 6000
GROUP BY MANAGER_ID
HAVING avg(SALARY) > 8500
ORDER BY 2 DESC













