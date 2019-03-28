--subquery

SELECT EMPLOYEE_ID
FROM EMPLOYEES
WHERE FIRST_NAME = 'STEVEN' AND LAST_NAME = 'KING';

SELECT EMPLOYEE_ID, FRIST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE MANAGER_ID = 100;

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE MANAGER_ID = (
   SELECT EMPLOYEE_ID
   FROM EMPLOYEES
   WHERE FIRST_NAME = 'Steven' AND LAST_NAME = 'King'); 

  --USING 'IN' FOR MANY VALUES
SELECT C
FROM EMPLOYEES
WHERE MANAGER_ID in (  -- utilizzo in nel caso in cui ci fossero più manager con cognome King, se metto = mi crasha perchè non riconosce entrambi ma solo uno
   SELECT EMPLOYEE_ID
   FROM EMPLOYEES
   WHERE LAST_NAME = 'King'); 
  
-- SALARY AVERAGE
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > (
   SELECT AVG(SALARY)
   FROM EMPLOYEES
)
ORDER BY 4 DESC;
 
SELECT DEPARTMENT_ID, ROUND(AVG(SALARY))
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING AVG(SALARY) < (
SELECT MAX(AVG(SALARY))
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
)
ORDER BY 2 DESC;

SELECT FIRST_NAME
FROM (   -- la subquery da from mi considera questa come se fosse una tabella a parte
   SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
   FROM EMPLOYEES
   WHERE EMPLOYEE_ID BETWEEN 112 AND 115
   ) 
WHERE LAST_NAME LIKE 'P%';

SELECT R.REGION_NAME, C.COUNTRY_COUNT
FROM REGIONS R NATURAL JOIN (
	SELECT COUNT(COUNTRY_ID) AS COUNTRY_COUNT, REGION_ID
	FROM COUNTRIES
	GROUP BY REGION_ID
	) C ;

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
FROM EMPLOYEES 
WHERE EMPLOYEE_ID IN (
   SELECT MANAGER_ID
   FROM EMPLOYEES
   WHERE FIRST_NAME = 'Jennifer'
   );
  
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE EMPLOYEE_ID NOT IN (

    SELECT DISTINCT MANAGER_ID
    FROM EMPLOYEES
    WHERE MANAGER_ID IS NOT NULL
   );

SELECT EMP.LAST_NAME AS "Employee", EMP.EMPLOYEE_ID AS "Emp#", MNG.LAST_NAME AS "Manager", MNG.MANAGER_ID AS "MGR#"
FROM EMPLOYEES EMP LEFT OUTER JOIN EMPLOYEES MNG
ON(EMP.MANAGER_ID = MNG.EMPLOYEE_ID)
ORDER BY 2;


SELECT EMP.DEPARTMENT_ID, (EMP.LAST_NAME) AS EMPLOYEE, (COL.LAST_NAME) AS COLLEAGUE
FROM EMPLOYEES EMP JOIN EMPLOYEES COL
ON(EMP.DEPARTMENT_ID = COL.DEPARTMENT_ID)
WHERE EMP.EMPLOYEE_ID != COL.EMPLOYEE_ID
ORDER BY 1, 2;


SELECT EMP.FIRST_NAME, EMP.LAST_NAME, EMP.HIRE_DATE
FROM EMPLOYEES EMP JOIN EMPLOYEES HIR 
ON(EMP.HIRE_DATE = HIR.HIRE_DATE)
WHERE HIR.HIRE_DATE > '29-GEN-2005'
ORDER BY HIR.HIRE_DATE;

SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES 
WHERE HIRE_DATE > (
    SELECT HIRE_DATE
    FROM EMPLOYEES
    WHERE LAST_NAME = 'Davies'
)
ORDER BY HIRE_DATE;

SELECT EMP.FIRST_NAME , EMP.HIRE_DATE AS HIREDATE, MNG.LAST_NAME, MNG.HIRE_DATE AS MNGHIREDATE
FROM EMPLOYEES EMP JOIN EMPLOYEES MNG
ON(EMP.MANAGER_ID = MNG.EMPLOYEE_ID) 
WHERE EMP.HIRE_DATE < MNG.HIRE_DATE
ORDER BY EMP.HIRE_DATE;

SELECT EMPLOYEE_ID, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > (
SELECT AVG(SALARY)
FROM EMPLOYEES
)
ORDER BY SALARY ASC;

SELECT EMPLOYEE_ID, LAST_NAME, DEPARTMENT_ID
FROM EMPLOYEES 
WHERE  DEPARTMENT_ID IN (
SELECT UNIQUE DEPARTMENT_ID
FROM EMPLOYEES
WHERE LAST_NAME LIKE '%u%'
);

SELECT EMP.LAST_NAME, EMP.DEPARTMENT_ID, EMP.JOB_ID
FROM EMPLOYEES EMP JOIN DEPARTMENTS DEP
ON(EMP.DEPARTMENT_ID = DEP.DEPARTMENT_ID)
WHERE DEP.LOCATION_ID = 1700;

SELECT EMP.LAST_NAME, EMP.SALARY , MNG.LAST_NAME
FROM EMPLOYEES EMP JOIN EMPLOYEES MNG
ON(EMP.MANAGER_ID = MNG.EMPLOYEE_ID)
WHERE MNG.LAST_NAME = 'King';


SELECT DEP.DEPARTMENT_ID, EMP.LAST_NAME, EMP.JOB_ID
FROM EMPLOYEES EMP JOIN DEPARTMENTS DEP
ON(EMP.DEPARTMENT_ID = DEP.DEPARTMENT_ID)
WHERE DEP.DEPARTMENT_NAME = 'Executive';

SELECT LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > ALL(  -- SE LO VOGLIO MAGGIORE ALMENO DI 1, METTO ANY, SE NO METTO ALL
SELECT SALARY
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 60)
ORDER BY 2;

SELECT EMPLOYEE_ID, LAST_NAME, SALARY 
FROM EMPLOYEES
WHERE SALARY > (
	SELECT AVG(SALARY)
	FROM EMPLOYEES)
AND DEPARTMENT_ID IN (
	SELECT DISTINCT DEPARTMENT_ID
	FROM EMPLOYEES 
	WHERE LAST_NAME LIKE '%u%'
);

SELECT DISTINCT DEPARTMENT_NAME, CITY, STATE_PROVINCE
FROM LOCATIONS LOC JOIN DEPARTMENTS DEP
ON(DEP.LOCATION_ID =  LOC.LOCATION_ID);

SELECT EMP.FIRST_NAME, EMP.LAST_NAME, DEP.DEPARTMENT_ID
FROM EMPLOYEES EMP LEFT JOIN DEPARTMENTS DEP
ON(EMP.DEPARTMENT_ID = DEP.DEPARTMENT_ID);

SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_ID
FROM EMPLOYEES 
WHERE DEPARTMENT_ID in (
   SELECT DEPARTMENT_ID
   FROM EMPLOYEES 
   WHERE LAST_NAME = 'Taylor')
;


SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE >= '01-GEN-2003' AND HIRE_DATE <='31-AGO-2007';


SELECT DEP.DEPARTMENT_NAME, ROUND(AVG(EMP.SALARY)), COUNT(EMP.EMPLOYEE_ID)
FROM EMPLOYEES EMP JOIN DEPARTMENTS DEP
ON(EMP.DEPARTMENT_ID = DEP.DEPARTMENT_ID)
--WHERE EMP.COMMISSION_PCT IS NOT NULL
GROUP BY DEP.DEPARTMENT_NAME;


-- INSERT
SELECT *
FROM regions;

INSERT INTO REGIONS(REGION_ID, REGION_NAME)
VALUES (11, 'Antartica'); --questo cambiamento lo vedo solo io, perchè non ho ancora fatto la commit

INSERT INTO REGIONS (REGION_ID)
VALUES(12);

INSERT INTO REGIONS (REGION_ID)
VALUES(13);
--UPDATE (WHERE)

UPDATE REGIONS
SET REGION_NAME = 'Oceania'
WHERE REGION_ID = 12;

UPDATE REGIONS 
SET REGION_NAME = 'Region ' || REGION_ID
WHERE REGION_ID > 10;

--DELETE WHERE
DELETE FROM REGIONS
WHERE REGION_ID > 10;


--COMMIT AND ROLLBACK
SELECT *
FROM REGIONS;

INSERT INTO REGIONS(REGION_ID, REGION_NAME)
VALUES(15,'Antartica');

ROLLBACK;

INSERT INTO REGIONS(REGION_ID,REGION_NAME)
VALUES(13, 'Antartide');

SAVEPOINT SP1;


INSERT INTO REGIONS(REGION_ID, REGION_NAME)
VALUES(16,'Oceania');

ROLLBACK TO SP1;

ROLLBACK;

---


