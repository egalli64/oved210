--jobs WHERE min salary IN [2000,5000] ordered BY job title

SELECT JOB_TITLE, MIN_SALARY
FROM JOBS
WHERE MIN_SALARY BETWEEN 2000 AND 5000
ORDER BY JOB_TITLE;

--all countries IN region Europe

SELECT REGION_ID
FROM REGIONS
WHERE REGION_NAME = 'Europe';

--SECOND step : European countries
SELECT COUNTRY_NAME
FROM COUNTRIES
WHERE REGION_ID = 1;

SELECT COUNTRY_NAME, REGION_NAME
FROM COUNTRIES c, REGIONS r
WHERE c.REGION_ID = r.REGION_ID AND REGION_NAME = 'Europe';

SELECT COUNTRY_NAME, REGION_NAME
FROM COUNTRIES NATURAL JOIN REGIONS; --GUARDO DOVE SI CONGIUNGONO NATURALMENTE LE DUE TABELLE

--OPPURE
SELECT COUNTRY_NAME, REGION_NAME
FROM COUNTRIES JOIN REGIONS
USING (REGION_ID); --REGION ID è IL LEGAME TRA LE DUE TABELLE 

--cross join (prodotto cartsiano)
SELECT COUNTRY_NAME, REGION_NAME
FROM COUNTRIES C, REGIONS REGIONS;

--CROSS JOIN modern
SELECT COUNTRY_NAME, REGION_NAME
FROM COUNTRIES C CROSS JOIN REGIONS R;

--employees FIRST name, LAST name WHERE  department name IS IT
SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES JOIN DEPARTMENTS
USING(DEPARTMENT_ID)
WHERE DEPARTMENT_NAME = 'IT';

--USING ON   FOR FULL description OF joined columns
SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES E JOIN DEPARTMENTS D
ON(E.DEPARTMENT_ID = D.DEPARTMENT_ID) -- ho detto esplicitamente come voglio che siano uniti, ovvero per uguaglianza tra dip.ID
WHERE DEPARTMENT_NAME = 'IT';                                       --usiamo ON per specificare la nostra connessione al posto di USING (soprattutto quando i 2 dep.ID sono diversi)

--self join 
SELECT EMP.FIRST_NAME ||''|| EMP.LAST_NAME AS "EMPLOYEE",
       MNG.FIRST_NAME ||''|| MNG.LAST_NAME AS "MANAGER"
FROM EMPLOYEES EMP JOIN EMPLOYEES MNG
ON(EMP.MANAGER_ID = MNG.EMPLOYEE_ID)
ORDER BY 1;

--more than two tables
SELECT e.FIRST_NAME, e.LAST_NAME,l.CITY, d.DEPARTMENT_NAME
FROM EMPLOYEES e, DEPARTMENTS d, LOCATIONS l 
WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID 
   AND d.LOCATION_ID = l.LOCATION_ID
ORDER BY 4;

--modern with on
SELECT e.FIRST_NAME, e.LAST_NAME,l.CITY, d.DEPARTMENT_NAME
FROM EMPLOYEES e join DEPARTMENTS d
on(e.DEPARTMENT_ID = d.DEPARTMENT_ID)
JOIN LOCATIONS l
on(d.LOCATION_ID = l.LOCATION_ID)
ORDER BY 4;

--modern with using
SELECT e.FIRST_NAME, e.LAST_NAME,l.CITY, d.DEPARTMENT_NAME
FROM EMPLOYEES e join DEPARTMENTS d
using(DEPARTMENT_ID)
JOIN LOCATIONS l
USING(LOCATION_ID)
WHERE city = 'Oxford'
ORDER BY 3;

-- employees HAVING steven king AS manager;
-- SHipping dept.
-- ORDER BY FIRST Name 

SELECT EMP.FIRST_NAME, EMP.LAST_NAME, MNG.FIRST_NAME, MNG.LAST_NAME --, D.DEPARTMENT_NAME
FROM EMPLOYEES EMP JOIN EMPLOYEES MNG
ON(EMP.MANAGER_ID = MNG.EMPLOYEE_ID)
JOIN DEPARTMENTS D 
ON(EMP.DEPARTMENT_ID = D.DEPARTMENT_ID)
WHERE MNG.FIRST_NAME = 'Steven' AND MNG.LAST_NAME = 'King'
    AND D.DEPARTMENT_NAME = 'Shipping' 
ORDER BY 1;

SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_NAME
FROM EMPLOYEES JOIN DEPARTMENTS
USING(DEPARTMENT_ID)
WHERE LAST_NAME LIKE 'Gr%';

--LEFT outer join
SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_NAME
FROM EMPLOYEES LEFT OUTER JOIN DEPARTMENTS  --se qualcuno nella tabella di sinistra (employees) non esiste, mettimelo lo stesso e sotto deparmente metti null
USING(DEPARTMENT_ID)
WHERE LAST_NAME LIKE 'Gr%';

--RIGHT outer join
SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_NAME
FROM EMPLOYEES RIGHT OUTER JOIN DEPARTMENTS  --se qualcuno nella tabella di Destra (departments) non esiste, mettimelo lo stesso e sotto employees metti null
USING(DEPARTMENT_ID)
WHERE DEPARTMENT_ID BETWEEN 110 AND 120;

--FULL outer join
SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_NAME
FROM EMPLOYEES FULL OUTER JOIN DEPARTMENTS  --mette tutti gli elemente delle due tabelle che altrimenti resterebbero esclusi
USING(DEPARTMENT_ID)
WHERE DEPARTMENT_ID BETWEEN 110 AND 120 
    or LAST_NAME LIKE 'Gr%';
    
--departments : name AND associated manager (if existing), order by name
  
   SELECT D.DEPARTMENT_NAME, 
          EMP.FIRST_NAME || ' ' || EMP.LAST_NAME AS "MANAGER"
   FROM EMPLOYEES EMP RIGHT OUTER JOIN DEPARTMENTS D
   ON(D.MANAGER_ID = EMP.EMPLOYEE_ID)
   ORDER BY 2;
  
  --EMPLOYEES : NAME AND MANAGER NAME
  
   SELECT EMP.FIRST_NAME || ' ' || EMP.LAST_NAME AS "EMPLOYEE",
          MNG.FIRST_NAME || ' ' || MNG.LAST_NAME AS "MANAGER" , 
          EMP.SALARY
   FROM EMPLOYEES EMP LEFT OUTER JOIN EMPLOYEES MNG
   ON(EMP.MANAGER_ID = MNG.EMPLOYEE_ID)
   ORDER BY 3 DESC;
   
  --FUNCTIONS
  SELECT ascii('A'), CHR(90)
  FROM DUAL;
 
 --CONCAT
 SELECT CONCAT(FIRST_NAME, LAST_NAME)
 FROM EMPLOYEES
 WHERE EMPLOYEE_ID = 100;

SELECT REGION_NAME, 
INSTR(REGION_NAME, 'a'), 
INSTR(REGION_NAME, 'a',10), -- il 10 dopo la virgola indica la posizione da cui vuoi partire per trovare la seconda 'a' nella stringa
INSTR(REGION_NAME, 'a',10,2) --aggiungendo dopo 10 ,2 vuol dire che voglio la seconda dopo la posizione 10
FROM REGIONS
WHERE REGION_ID = 4;

  SELECT HIRE_DATE, INSTR(HIRE_DATE, 'GIU')
  FROM EMPLOYEES
  WHERE EMPLOYEE_ID = 100;

 
SELECT REGION_NAME, LENGTH(REGION_NAME)
FROM REGIONS;
 
SELECT SALARY, LENGTH(SALARY)
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 100;

SELECT UPPER(FIRST_NAME), LOWER(LAST_NAME), LENGTH(LOWER(LAST_NAME))
FROM EMPLOYEES
WHERE EMPLOYEE_ID= 112;

SELECT INITCAP(LOWER(FIRST_NAME)) -- INITCAP FA IN MAIUSCOLO LE INIZIALI
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 112;

SELECT RPAD('HELLO', 30, '.'), --rpad (DA SINISTRA A DESTRA) vuol dire scrivi la stringa hello in una colonna di 20 caratteri e riempi il resto con -
LPAD('HELLO',30,'.') -- LPAD (da DESTRA A SINISTRA)
FROM DUAL;

SELECT LTRIM('  HELLO'),-- ELIMINA GLI SPAZI BIANCHI ALLA SINISTRA DELLA STRING
       RTRIM('HELLOABAB', 'AB'), -- gli dico di eliminare tutti gli AB alla detra della stringa.
       TRIM('0' FROM '000hello000') --TRIM TOGLIE SIA A SINISTRA CHE A DESTRA
FROM DUAL;

--NVL
SELECT NVL(COMMISSION_PCT, 0) --STAMPA 0 SE LA COMMISISON PCT è NULL, ALTRIMENTI LA COMMISSION NORMALE
FROM EMPLOYEES;

--NVL2

SELECT NVL2(COMMISSION_PCT,'HAS COMMISSION', 'NO COMMISSION'),FIRST_NAME, LAST_NAME --stampa has commission per chi ha commission, e no commission per chi non li ha
FROM EMPLOYEES;

--REPLACE
SELECT JOB_TITLE, REPLACE(JOB_TITLE, 'Administration', 'Admin') --CAMBIA DA ADMINISTRATION AD ADMIN
FROM JOBS;

--SUBSTR
SELECT JOB_TITLE, SUBSTR(JOB_TITLE, 16, 4) --I PRIMI 4 CARATTERI A PARTIRE DALLA POSIZIONE 16
FROM JOBS
WHERE JOB_ID = 'AD_VP';

--MATH
SELECT ABS(-10), ABS(10),   --abs restituisce il valore assoluto
    CEIL(5.8), CEIL(-5.2), --ceil fa l'arrotondamento al valore più alto
    FLOOR(5.8), FLOOR(-5.2), --floor fa l'arrotondamento al valore più basso
    MOD(8,4), MOD(8,3) -- è l'operatore che riporta il resto della divisione tra 8/4 e 8/3   
FROM DUAL;

SELECT  POWER(2,0),POWER(2,3),--la potenza di 2 alla 0, la potenza di 2 alla 3
        ROUND(5.75), ROUND(5.2), --arrotondamento
        ROUND(5.75, 1), ROUND(5.75, -2), -- se metto , -1 sto lavorando sulle decine a sinistra della virgola. Se metto 0 sulle unità e 2 sulle centinaia. Se metto 1 va alla destra della virgola.
        SQRT(25), SQRT(5) -- radice quadrata
FROM dual;

SELECT sign(-5), sign(5), sign(0)
FROM dual;

SELECT TRUNC(5.75), TRUNC(5.75,1), TRUNC(5.75, -1) --tronca e basta senza arrotondare, ma puoi specificare su che livello troncare
FROM dual;

SELECT TO_CHAR(1234.54), TO_CHAR(1234.54, '99,999.99'), -- ti formatta in maniera anglofona
to_char(2019, 'RN'), to_number('970,23')*2,-- ti sta dicendo di formattarlo come numero romano, il to_number 
cast('05-GEN-2018' AS DATE), --converte in data
cast(13245
,56 AS NUMBER(10,2)) --cast in un numero di 10 cifre di cui 2 decimali
FROM dual;

--aggregate functions

SELECT AVG(SALARY), VARIANCE(SALARY), STDDEV(SALARY), AVG(DISTINCT SALARY) --average salary, varianza e dev.std
FROM employees
ORDER BY salary;


SELECT count(*), COUNT(EMPLOYEE_ID), count(DEPARTMENT_ID), COUNT(rowid) -- count(rowid) = count(*)
FROM EMPLOYEES;

SELECT SUM(SALARY), MAX(SALARY),
       MIN(SALARY), MAX(FIRST_NAME), --l'ultimo nome in lista
       MIN(LAST_NAME),--primo cognome in lista
       MAX(HIRE_DATE), MIN(HIRE_DATE)
FROM EMPLOYEES;
       
SELECT AVG(SALARY)
FROM EMPLOYEES
WHERE DEPARTMENT_ID= 30;

SELECT DEPARTMENT_ID, COUNT(ROWID), TRUNC(AVG(SALARY))
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY 3 DESC;

SELECT DISTINCT DEPARTMENT_ID
FROM EMPLOYEES
ORDER BY 1;

-- employees: group them by location.country_id,
-- give average salary

SELECT AVG(SALARY), L.COUNTRY_ID
FROM EMPLOYEES EMP JOIN DEPARTMENTS D
ON(EMP.DEPARTMENT_ID = D.DEPARTMENT_ID)
JOIN LOCATIONS L 
ON(D.LOCATION_ID = L.LOCATION_ID)
GROUP BY L.COUNTRY_ID;


--HAVING
SELECT MANAGER_ID, TRUNC(AVG(SALARY)) 
FROM EMPLOYEES
GROUP BY MANAGER_ID
HAVING AVG(SALARY) > 8500
ORDER BY 2 DESC;

SELECT MANAGER_ID, TRUNC(AVG(SALARY)) 
FROM EMPLOYEES
WHERE SALARY > 8500
GROUP BY MANAGER_ID
ORDER BY 2 DESC;


SELECT MANAGER_ID, TRUNC(AVG(SALARY)) 
FROM EMPLOYEES
WHERE SALARY > 6000
GROUP BY MANAGER_ID
HAVING AVG(SALARY) > 8500
ORDER BY 2 DESC;


