-- subquery
SELECT employee_id
FROM EMPLOYEES
WHERE FIRST_NAME = 'Steven' AND LAST_NAME = 'King';


SELECT employee_id, first_name, last_name
FROM EMPLOYEES
WHERE MANAGER_ID = 100;

-- using IN for many values returned by subquery
SELECT employee_id, first_name, last_name
FROM EMPLOYEES
WHERE MANAGER_ID in (
SELECT EMPLOYEE_ID
FROM EMPLOYEES
WHERE  LAST_NAME = 'King'
);

-- AVG calcola la media dei salari
SELECT  avg (salary)
FROM EMPLOYEES;

-- tutti i dip che hanno lo stipendio maggiore della media 
SELECT employee_id, first_name, last_name, SALARY
FROM EMPLOYEES
WHERE SALARY > (
SELECT  avg (salary)
FROM EMPLOYEES 
)
ORDER BY 4 desc;

--voglio il salario medio per ogni dipartimento [avg salary by department]
SELECT ROUND (avg(salary)), department_id
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY 1 DESC;

--scrivere una query che esclude il dipart con il salario piu alto
-- voglio fare una query che mi identifichi il salario più alto
SELECT ROUND (avg(salary)), department_id
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING avg(salary) < (
SELECT max (avg (salary)) --oppure avg(avg(salary)) media della media  con Max ecc calcolo il massimo della media dei salari
FROM EMPLOYEES 
GROUP BY DEPARTMENT_ID
)
ORDER BY 1 DESC;


--MIN
SELECT ROUND (avg(salary)), department_id
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING avg(salary) > (
SELECT min (avg (salary)) 
FROM EMPLOYEES 
GROUP BY DEPARTMENT_ID
)
ORDER BY 1 DESC;


-- iniziamo dalla subquery

SELECT first_name
FROM (           -- questo from mi genera una tabella temporanea in cui io mi faccio le mie operazioni
    SELECT employee_id, first_name, last_name
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID BETWEEN 112 AND 115
    )
  WHERE last_name LIKE 'P%';
 
 --quanti countries in ogni regione
 
 SELECT COUNT(rowid)
 FROM COUNTRIES
 WHERE REGION_ID = 1;

SELECT COUNT(rowid)
 FROM COUNTRIES
 GROUP BY REGION_ID;

SELECT r.region_name, c.country_count
FROM REGIONS r NATURAL JOIN  (
SELECT REGION_ID, count(rowid) AS country_count
FROM countries 
GROUP BY REGION_ID
) c;

-- voglio il nome del manager per i dipendenti che si chiamano jennifer
SELECT employee_id, last_name, first_name
FROM EMPLOYEES
WHERE FIRST_NAME= 'Jennifer';

SELECT employee_id, last_name, first_name
FROM EMPLOYEES
WHERE  EMPLOYEE_ID  IN  (
     SELECT MANAGER_ID
     FROM EMPLOYEES
     WHERE FIRST_NAME = 'Jennifer'
);

-- voglio sapere chi sono i miei dipendenti che non sono manager
SELECT employee_id, last_name, first_name
FROM EMPLOYEES
WHERE MANAGER_ID IS NULL;

SELECT employee_id, last_name, first_name
FROM EMPLOYEES
WHERE EMPLOYEE_ID NOT IN (
SELECT DISTINCT MANAGER_ID
FROM EMPLOYEES
WHERE MANAGER_ID IS NOT NULL 
)
ORDER BY 2,3;


--ESERCIZI

SELECT e.last_name, e.employee_id, m.last_name, m.department_id
FROM EMPLOYEES e  LEFT JOIN EMPLOYEES m
ON(e.MANAGER_ID = m.EMPLOYEE_ID )
ORDER BY 3, 1;

-- mostra gli employee, last name, depart number di tutti gli employee che lavorano nello stesso dipart
SELECT c.LAST_NAME, e.last_name, e.department_id
FROM EMPLOYEES e JOIN employees  c -- con la join è come se avessi entrambe le tabelle
ON (e.DEPARTMENT_ID = c.department_id)
WHERE e.EMPLOYEE_ID != c.EMPLOYEE_ID
--ORDER BY 1,2;

-- i nomi di tutti gli impiegati che sono stati assunti dopo Devis
SELECT  HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Davies';

SELECT LAST_NAME, HIRE_DATE
FROM EMPLOYEES 
WHERE HIRE_DATE > '29-GEN-05';

-- trova i nomi e le date di assunzione dei miei dipendenti che sono stati assunti prima del manager
SELECT  e.LAST_NAME,e.hire_date, m.LAST_NAME, m.HIRE_DATE
FROM EMPLOYEES e JOIN EMPLOYEES m
ON( e.MANAGER_ID = m.EMPLOYEE_ID)
WHERE e.HIRE_DATE < m.HIRE_DATE
ORDER BY 1;

--mostra employee id, last e first name, salario degli impiegati che guadagnano più della media del salario,e ordina per salario asc

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY>(
SELECT avg(SALARY)
FROM EMPLOYEES
) 
ORDER BY 3;


-- stampa tutti gli impiegati che lavorano in un dipartimento, in cui almeno un dipendente presenta la lettera U nel cognome
SELECT EMPLOYEE_ID, LAST_NAME
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (
SELECT DISTINCT  DEPARTMENT_ID
FROM EMPLOYEES
WHERE LAST_NAME like '%u%');
 

-- stampa last name, department e job id di tutti gli impiegati, dove la location del dipartimento è 1700
SELECT LAST_NAME, DEPARTMENT_ID, JOB_ID
FROM EMPLOYEES  JOIN DEPARTMENTS
USING (DEPARTMENT_ID)
WHERE LOCATION_ID = 1700;

SELECT LAST_NAME, SALARY
FROM EMPLOYEES 
WHERE  MANAGER_ID  in (
     SELECT EMPLOYEE_ID
     FROM EMPLOYEES
     WHERE LAST_NAME = 'King');
    
    -- oppure la query di sopra si puo anche scrivere cosi
    SELECT e.LAST_NAME, e.SALARY
    FROM EMPLOYEES e JOIN EMPLOYEES m
    ON e.MANAGER_ID = m.EMPLOYEE_ID
    WHERE m.LAST_NAME = 'king';

--
SELECT LAST_NAME, DEPARTMENT_ID, JOB_ID
FROM DEPARTMENTS  JOIN EMPLOYEES
USING (DEPARTMENT_ID)
WHERE DEPARTMENT_NAME = 'Executive'

SELECT last_name, salary
FROM EMPLOYEES
WHERE SALARY> (
SELECT min(salary)
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 60
)
ORDER BY 2;

--
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME,SALARY
FROM EMPLOYEES
WHERE SALARY>(
SELECT avg(SALARY)
FROM EMPLOYEES
WHERE LAST_NAME like '%u%'

) 
ORDER BY 3;

SELECT EMPLOYEE_ID, LAST_NAME,SALARY
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (
SELECT DISTINCT  DEPARTMENT_ID
FROM EMPLOYEES
WHERE LAST_NAME like '%u%' 
)
AND SALARY> (
SELECT AVG(SALARY)
FROM EMPLOYEES
);


SELECT DEPARTMENT_NAME, city, state_province
FROM DEPARTMENTS NATURAL JOIN LOCATIONS
ORDER BY 1;

 
SELECT  FIRST_NAME, LAST_NAME, DEPARTMENT_ID, DEPARTMENT_NAME
FROM EMPLOYEES  LEFT JOIN DEPARTMENTS
USING(DEPARTMENT_ID);

 SELECT
 FROM EMPLOYEES
 WHERE DEPARTMENT_ID IN(
 SELECT DEPARTMENT_ID
 FROM EMPLOYEES
 WHERE LAST_NAME = 'Taylor');

SELECT first_name, last_name, hire_date
FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN '01_Gen_03' AND '31-Ago-07';




 


