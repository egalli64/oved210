SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID, TO_CHAR(HIRE_DATE) AS "STARTDATE"
FROM EMPLOYEES
ORDER BY EMPLOYEE_ID;

SELECT DISTINCT JOB_ID
FROM EMPLOYEES
ORDER BY 1;

SELECT EMPLOYEE_ID AS "EMP#", LAST_NAME AS "EMPLOYEE", JOB_ID AS "JOB", TO_CHAR(HIRE_DATE) AS "HIRE DATE"
FROM EMPLOYEES
ORDER BY EMPLOYEE_ID;

SELECT LAST_NAME || ', ' || JOB_ID AS "Employee and title"
FROM EMPLOYEES;

SELECT (EMPLOYEE_ID || ', ' || LAST_NAME || ', ' || FIRST_NAME ||', '|| PHONE_NUMBER || ', '|| HIRE_DATE || ', ' || SALARY || ', ' || COMMISSION_PCT || ' '||MANAGER_ID || ', '|| DEPARTMENT_ID || ', '|| EMAIL) AS "THE OUTPUT"
FROM EMPLOYEES;

SELECT LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > 12000
ORDER BY SALARY DESC;

SELECT LAST_NAME, DEPARTMENT_ID
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 176;

SELECT LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY < 5000 
    OR SALARY > 12000;
    
SELECT LAST_NAME, JOB_ID, HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Taylor' OR LAST_NAME = 'Matos'
ORDER BY HIRE_DATE ASC;
   
SELECT LAST_NAME, DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 20 OR DEPARTMENT_ID = 50
ORDER BY LAST_NAME;
  
SELECT LAST_NAME AS "Employee", SALARY AS "Monthly salary"
FROM EMPLOYEES
WHERE SALARY BETWEEN 5000 AND 12000 AND (DEPARTMENT_ID = 20 OR DEPARTMENT_ID = 50)
ORDER BY 2 DESC;
 
SELECT LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN '01-GEN-2005' AND '31-DIC-2005'
ORDER BY 1;

SELECT LAST_NAME, JOB_ID
FROM EMPLOYEES
WHERE MANAGER_ID IS NULL;

SELECT LAST_NAME, SALARY, COMMISSION_PCT *100
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL
ORDER BY SALARY DESC;

SELECT LAST_NAME, EMPLOYEE_ID, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE MANAGER_ID = 103
ORDER BY LAST_NAME;

SELECT LAST_NAME
FROM EMPLOYEES
WHERE LOWER(LAST_NAME) LIKE '%a%'
    and LOWER(LAST_NAME) LIKE '%e%'
ORDER BY 1;

SELECT TO_CHAR(SYSDATE) AS "DATE"
FROM DUAL;

SELECT EMPLOYEE_ID, LAST_NAME, SALARY, ROUND(SALARY + (SALARY * 0.155)) AS "New salary"
FROM EMPLOYEES
ORDER BY 1;

SELECT EMPLOYEE_ID, LAST_NAME, SALARY, ROUND(SALARY + (SALARY * 0.155)) AS "New salary", 
                                       ROUND(SALARY * 0.155) AS "INCREASE"
FROM EMPLOYEES
ORDER BY 1;

SELECT LENGTH(LAST_NAME), LAST_NAME
FROM EMPLOYEES
WHERE LAST_NAME LIKE 'H%';
--WHERE SUBSTR(LAST_NAME, 0,1) = UPPER('h');

SELECT MONTHS_BETWEEN(SYSDATE, '01-GEN-2019'), 
FROM DUAL;

SELECT ROUND(MONTHS_BETWEEN(SYSDATE, HIRE_DATE)) AS "Months_worked", LAST_NAME
FROM EMPLOYEES
ORDER BY 1;

SELECT LAST_NAME, LPAD(SALARY, 15,'$') AS "SALARY"
FROM EMPLOYEES
ORDER BY EMPLOYEE_ID;

SELECT LPAD('*',(SALARY/1000),'*') AS "SALARY PAD", SALARY
FROM EMPLOYEES
ORDER BY SALARY DESC;

SELECT LAST_NAME, TRUNC((SYSDATE - HIRE_DATE)/7, 0) AS "TENURE"
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 90
ORDER BY 2 DESC;

SELECT (LAST_NAME || ' earns '|| TO_CHAR(SALARY,'fm$99,999.00') || ' monthly but wants '|| TO_CHAR(SALARY*3,'fm$99,999.00')) AS "DREAMSALARIES"
FROM EMPLOYEES
ORDER BY EMPLOYEE_ID;

SELECT LAST_NAME, NVL(TO_CHAR(COMMISSION_PCT),'NO COMMISSION')
FROM EMPLOYEES
ORDER BY EMPLOYEE_ID;

SELECT TO_CHAR(SYSDATE)
FROM DUAL;

SELECT EMPLOYEE_ID, HIRE_DATE, TO_CHAR(HIRE_DATE,'MONTH DD, YYYY')
FROM EMPLOYEES;

SELECT TO_DATE('12 GENNAIO 1944', 'DD MONTH YYYY'), TO_DATE('7.4.18','MM.DD.YY')
FROM DUAL;

SELECT TO_CHAR(TO_DATE('05-FEB-2019 19:32:18', 'DD-MON-YYYY HH24:MI:SS'), 'HH24:MI:SS')
FROM DUAL; -- mi estrae solo la parte delle ore

SELECT sysdate, ADD_MONTHS(SYSDATE, 13)
FROM dual; -- sommi i mesi alla DATA corrente 

SELECT LAST_DAY('01-FEB-2016')
FROM DUAL;

SELECT MONTHS_BETWEEN(SYSDATE, '15-GEN-01')
FROM DUAL;

SELECT NEXT_DAY('01-GIU-19', 'LUNEDI')
FROM DUAL;

SELECT ROUND(TO_DATE('25-OTT-19'),'YYYY'), TRUNC(TO_DATE('25-OTT-19'),'YYYY')
FROM DUAL; --ROUND ME LO PORTA ALL'ANNO SUCCESSIVO, IL TRUNC ALLO STESSO ANNO PERCHE' RESTITUISCE IL VALORE DELL'ANNO IN QUELLA DATA


SELECT NEXT_DAY(ADD_MONTHS(HIRE_DATE,6),'lunedi'),TO_CHAR((HIRE_DATE),'Day", the "ddspth" of "Month"," YYYY')
FROM EMPLOYEES;


SELECT JOB_ID, MAX(SALARY) AS "Maximum", MIN(SALARY) AS "Minimum", SUM(SALARY) AS "Sum", ROUND(AVG(SALARY)) AS "Average"
FROM EMPLOYEES 
GROUP BY JOB_ID;

SELECT JOB_ID, COUNT(EMPLOYEE_ID)
FROM EMPLOYEES
GROUP BY JOB_ID;

SELECT COUNT(DISTINCT MANAGER_ID)
FROM EMPLOYEES;

SELECT (MAX(SALARY) - MIN(SALARY))
FROM EMPLOYEES;

SELECT MANAGER_ID, MIN(SALARY)
FROM EMPLOYEES
HAVING MANAGER_ID IS NOT NULL 
    AND MIN(SALARY) > 6000
GROUP BY MANAGER_ID
ORDER BY 2 DESC;

SELECT LOCATION_ID, STREET_ADDRESS, CITY, STATE_PROVINCE, COUNTRY_NAME
FROM COUNTRIES  NATURAL JOIN LOCATIONS;

SELECT EMP.LAST_NAME, EMP.DEPARTMENT_ID, DEP.DEPARTMENT_NAME
FROM EMPLOYEES EMP JOIN DEPARTMENTS DEP
ON(EMP.DEPARTMENT_ID = DEP.DEPARTMENT_ID)
ORDER BY DEPARTMENT_ID;

SELECT EMP.LAST_NAME, EMP.JOB_ID, EMP.DEPARTMENT_ID, DEP.DEPARTMENT_NAME
FROM EMPLOYEES EMP JOIN DEPARTMENTS DEP
ON(EMP.DEPARTMENT_ID = DEP.DEPARTMENT_ID)
JOIN LOCATIONS L
ON(L.LOCATION_ID = DEP.LOCATION_ID)
WHERE L.CITY = 'Toronto';

SELECT EMP.LAST_NAME AS "Employee", EMP.EMPLOYEE_ID AS "Emp#", MNG.LAST_NAME AS "Manager", MNG.MANAGER_ID AS "MGR#"
FROM EMPLOYEES EMP JOIN EMPLOYEES MNG
ON(EMP.MANAGER_ID = MNG.EMPLOYEE_ID)
ORDER BY 3;

