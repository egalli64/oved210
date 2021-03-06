-- jobs where min salary in [2000, 5000] ordered by job title

SELECT job_title, min_salary
FROM JOBS
WHERE MIN_SALARY BETWEEN 2000 AND 5000
ORDER BY JOB_TITLE;

--connessione fra due tabelle

--FIRST STEP
--all countries in region Europe
SELECT region_id
FROM REGIONS
WHERE REGION_NAME = 'Europe';

--SECOND STEP
SELECT COUNTRY_NAME
FROM COUNTRIES
WHERE REGION_ID = 1;

--due tabelle su una query sola (connessione -> join)
--natural classic join
SELECT COUNTRY_NAME
FROM COUNTRIES, REGIONS 
WHERE countries.REGION_ID = regions.REGION_ID AND region_name = 'Europe';

--natural modern join
SELECT COUNTRY_NAME, region_name
FROM COUNTRIES NATURAL join REGIONS 
WHERE region_name = 'Europe';

--natural explicit join
SELECT COUNTRY_NAME, region_name
FROM COUNTRIES join REGIONS 
using (region_id); 

--cross join (prodotto cartesiano)
SELECT COUNTRY_NAME, region_name
FROM COUNTRIES c, REGIONS r;

--cross join modern
SELECT COUNTRY_NAME, region_name
FROM COUNTRIES c CROSS join REGIONS r;

--ESERCIZIO
--employees: first name, last name where department name is IT
SELECT FIRST_NAME, LAST_NAME, department_name
FROM EMPLOYEES join DEPARTMENTS 
USING (DEPARTMENT_ID)
WHERE DEPARTMENT_NAME = 'IT';

--USING_ON_FOR FULL DESCRIPTION OF JOINED COLUMNS
SELECT E.FIRST_NAME, E.LAST_NAME, D.department_name
FROM EMPLOYEES E join DEPARTMENTS D
ON (E.DEPARTMENT_ID = D.DEPARTMENT_ID) --ON: PER SPECIFICARE LA NOSTRA CONNESSIONE
WHERE DEPARTMENT_NAME = 'IT';

--SELF JOIN
SELECT E.FIRST_NAME || ' ' || E.LAST_NAME AS "Employee", m.FIRST_NAME || ' ' || m.LAST_NAME AS "Manager"
FROM EMPLOYEES E JOIN EMPLOYEES M
ON (E.MANAGER_ID = M.EMPLOYEE_ID)
ORDER BY 1;

--ESERCIZIO
--more than two table
SELECT e.FIRST_NAME, e.LAST_NAME, l.CITY, d.DEPARTMENT_NAME
FROM EMPLOYEES e, DEPARTMENTS d, LOCATIONS l
WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID
	AND d.LOCATION_ID = l.LOCATION_ID
ORDER BY 4;

--con JOIN
SELECT e.FIRST_NAME, e.LAST_NAME, l.CITY, d.DEPARTMENT_NAME
FROM EMPLOYEES e JOIN DEPARTMENTS d
ON (e.DEPARTMENT_ID = d.DEPARTMENT_ID)
JOIN LOCATIONS l
ON (d.LOCATION_ID = l.LOCATION_ID)
ORDER BY 4;

--con using
SELECT e.FIRST_NAME, e.LAST_NAME, l.CITY, d.DEPARTMENT_NAME
FROM EMPLOYEES e JOIN DEPARTMENTS d
using(DEPARTMENT_ID)
JOIN LOCATIONS l
using (LOCATION_ID)
WHERE CITY = 'Oxford'
ORDER BY 4;

--ESERCIZIO
--employees having Steven King as manager
--shipping department
--order by first name
SELECT e.first_name, e.LAST_NAME, d.department_name, m.LAST_NAME
FROM EMPLOYEES e join EMPLOYEES m
ON (E.MANAGER_ID = M.EMPLOYEE_ID)
JOIN DEPARTMENTS d 
ON (d.DEPARTMENT_ID = e.DEPARTMENT_ID)
WHERE m.FIRST_NAME = 'Steven' and m.LAST_NAME = 'King' AND d.department_name = 'Shipping'
ORDER BY 1;

SELECT first_name, last_name, department_name
FROM EMPLOYEES JOIN DEPARTMENTS
USING (DEPARTMENT_ID)
WHERE LAST_NAME LIKE 'Gr%';

SELECT first_name, last_name, department_name
FROM EMPLOYEES LEFT OUTER JOIN DEPARTMENTS -- outer join : salvare elementi a sinistra anche se non hanno elementi di connessione
USING (DEPARTMENT_ID)
WHERE LAST_NAME LIKE 'Gr%';

SELECT first_name, last_name, DEPARTMENT_ID
FROM EMPLOYEES 
WHERE DEPARTMENT_ID = 110;

--departments: name and associated manager (when existing)
-- order by name
SELECT d.DEPARTMENT_name,
		e.FIRST_NAME || ' ' || e.LAST_NAME AS "Manager"
FROM DEPARTMENTS d LEFT OUTER join EMPLOYEES e
ON (d.MANAGER_ID = e.EMPLOYEE_ID)
ORDER BY 1;

--employees: name and manager name, salary
SELECT e.FIRST_NAME || ' ' || e.LAST_NAME AS "Employee",
		m.FIRST_NAME || ' ' || m.LAST_NAME AS "Manager",
		e.SALARY
FROM EMPLOYEES e LEFT OUTER JOIN EMPLOYEES m
ON (e.MANAGER_ID = m.EMPLOYEE_ID)
ORDER BY salary DESC;

--functions
SELECT ascii('A') AS "A", chr(90) AS "Z", ascii('a')
FROM dual;

--CONCAT
SELECT CONCAT(FIRST_NAME, LAST_NAME)
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 100;

SELECT REGION_NAME, 
		instr(REGION_NAME, 'a'),
		instr(REGION_NAME, 'a', 10),
		instr(REGION_NAME, 'a', 10, 2),
		instr(REGION_NAME, 'a', 10, 3)
FROM REGIONS
WHERE REGION_ID = 4;

SELECT HIRE_DATE, instr(HIRE_DATE, 'GIU')
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 100;

SELECT REGION_NAME, LENGTH(REGION_NAME)
FROM REGIONS;

SELECT SALARY, LENGTH(SALARY)
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 100;

SELECT UPPER(FIRST_NAME),
		LOWER (LAST_NAME),
		INITCAP(LOWER(FIRST_NAME))
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 112;

SELECT RPAD('HELLO', 30, '.'),
		LPAD('HELLO', 30, '-_-'),
		LPAD('HELLO', 3, '-_-')
FROM DUAL;

SELECT LTRIM('HELLO') ,
		RTRIM('HELLO', 'Ab'),
		TRIM('0' FROM '000HELLO000')
FROM DUAL;

--nvl()
SELECT nvl(commission_pct,0)
FROM EMPLOYEES

SELECT nvl2(commission_pct, 'has commission', 'no commission')
FROM EMPLOYEES

SELECT job_title, REPLACE(job_title, 'administration', 'Admin')
FROM JOBS
WHERE job_id = 'AD_VP'

SELECT job_title, SUBSTR(job_title, 16, 4)
FROM JOBS
WHERE job_id = 'AD_VP'

--MATH
SELECT ABS(-10), ABS (10),
		SQRT(25), SQRT(5),
		CEIL(5.8), CEIL(-5.2),
		FLOOR(5.8), FLOOR(-5.2),
		MOD(8,4), MOD(8,3),
		POWER(2,0), POWER(2,3),
		ROUND(5.75), ROUND(5.2), 
		ROUND(5.75, 1), ROUND(5.75, -1)
FROM DUAL;

SELECT TRUNC(5.75), TRUNC(5.75, 1), TRUNC(5.75, -1)
FROM DUAL;

SELECT TO_CHAR(1234.54), TO_CHAR(1234.54, '99,999.99'), TO_CHAR(2019, 'RN'),
		CAST('05-GEN-18' AS DATE), CAST(12345.456 AS NUMBER (10,2))

		FROM DUAL;
		
--AGGREGATE FUNCTIONS
SELECT AVG(SALARY), VARIANCE(SALARY), STDDEV(SALARY), AVG (DISTINCT SALARY)
FROM EMPLOYEES
ORDER BY SALARY;

SELECT COUNT(*), COUNT(EMPLOYEE_ID), COUNT (ROWID)
FROM EMPLOYEES;

SELECT SUM(SALARY), MAX(SALARY), MIN(SALARY), MAX(FIRST_NAME), MIN(LAST_NAME), MAX(HIRE_DATE), MIN(HIRE_DATE)
FROM EMPLOYEES;

SELECT AVG(SALARY)
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 30;

SELECT DEPARTMENT_ID, COUNT(ROWID), TRUNC(AVG(SALARY))
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY 2 DESC;

SELECT DISTINCT DEPARTMENT_ID  --CON DISTINCT NON POSSO FARE OPERAZIONI DI RAGGRUPPAMENTO
FROM EMPLOYEES
ORDER BY 1;

--ESERCIZIO

--1) SALARIO MEDIO DEI DIPENDENTI A SECONDA DELLA SEDE DI LAVORO
--EMPLOYEES: GROUP THEM BY LOCATION .COUNTRY_ID,
--GIVE AVERAGE SALARY
SELECT L.COUNTRY_ID, TRUNC(AVG(SALARY))
FROM EMPLOYEES E JOIN DEPARTMENTS D
ON (D.DEPARTMENT_ID = E.DEPARTMENT_ID)
JOIN LOCATIONS L
ON (D.LOCATION_ID = L.LOCATION_ID)
GROUP BY L.COUNTRY_ID
ORDER BY 2;

--HAVING (filtra i raggruppamenti)
SELECT MANAGER_ID, TRUNC(AVG(SALARY))
FROM EMPLOYEES
GROUP BY MANAGER_ID
HAVING avg(SALARY) > 8500
ORDER BY 2 DESC;

-- where (filtra le righe)
SELECT MANAGER_ID, TRUNC(AVG(SALARY))
FROM EMPLOYEES
WHERE SALARY > 6000
GROUP BY MANAGER_ID
HAVING avg(SALARY) > 8500
ORDER BY 2 DESC;


