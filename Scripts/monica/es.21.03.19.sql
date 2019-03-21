SELECT employee_ID , Last_name, job_id, to_char(hire_date) AS "STARTDATE"
FROM EMPLOYEES
ORDER BY EMPLOYEE_ID;


SELECT DISTINCT job_id
FROM EMPLOYEES
ORDER BY 1;

SELECT  employee_ID AS "Emp#"  , Last_name AS "Employee" , job_id AS  "Job", hire_date AS "Hire date"
FROM EMPLOYEES
ORDER BY EMPLOYEE_ID;

SELECT (last_name || ',' || job_id) AS "employee and title"
FROM EMPLOYEES;

SELECT (EMPLOYEE_ID || ',' || 
first_name || ',' || 
last_name || ',' || 
email || ',' || 
phone_number || ',' || 
hire_date || ',' ||
job_id || ',' || 
salary || ',' ||  
commission_pct ||',' ||
manager_id|| ',' ||
department_id )
 AS "the_output"
FROM EMPLOYEES
ORDER BY first_name;

SELECT last_name, salary
FROM EMPLOYEES
WHERE SALARY > 12000;

SELECT last_name, department_id 
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 176
ORDER by Last_name;

SELECT Last_name, Salary
FROM EMPLOYEES
WHERE salary not BETWEEN 5000 AND 12000
ORDER BY 2 desc;

SELECT FIRST_NAME, Last_name, job_id, hire_date
FROM EMPLOYEES
WHERE Last_name = 'Matos' OR LAST_NAME 'Taylor'
ORDER BY hire_date DESC;


SELECT last_name, department_id
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 20 or DEPARTMENT_ID = 50
ORDER BY last_name;

SELECT Last_name AS "Employee" , Salary AS "Monthly Salary"
FROM EMPLOYEES
WHERE (DEPARTMENT_ID = 20 or DEPARTMENT_ID = 50)
AND salary  BETWEEN 5000 AND 12000
ORDER BY 2 desc;

SELECT Last_name, Hire_date
FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN '01-gen-05' AND  '31-dic-05'
ORDER BY 1;


SELECT Last_name, job_id
FROM EMPLOYEES
WHERE MANAGER_ID IS NULL;  

SELECT last_name, salary, commission_pct
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL
ORDER BY salary DESC , 3 DESC;

SELECT EMPLOYEE_ID,last_name, salary, DEPARTMENT_ID
FROM EMPLOYEES
WHERE MANAGER_ID = 103
ORDER BY LAST_NAME;

SELECT last_name
FROM EMPLOYEES
WHERE lower (LAST_NAME) LIKE '%e%' AND  lower (last_name) like '%a%'
ORDER BY 1;


SELECT last_name, job_id, salary
FROM EMPLOYEES
WHERE (JOB_ID = 'SA_REP' OR JOB_ID = 'ST_CLERK')
AND salary NOT IN (2500 , 3500 , 7000)
ORDER BY 3 DESC;


SELECT to_char (sysdate) AS "date" 
from dual;

SELECT employee_id, last_name, salary, salary + trunc((salary *15.5 / 100)) AS "NEW salary"
FROM EMPLOYEES;


SELECT LAST_name as "name", length(last_name) AS "Length"
FROM EMPLOYEES
WHERE LAST_NAME LIKE 'H%';


SELECT MONTHS_BETWEEN(sysdate,'01-gen-19')
FROM  dual;

SELECT last_name, ROUND (MONTHS_BETWEEN(sysdate, hire_date )) AS "months_worked"
FROM EMPLOYEES;

SELECT Last_name, LPAD(salary, 15, '$')  AS "salary"
FROM EMPLOYEES;

SELECT Last_name, LPAD( '*',TRUNC(salary/1000),'*' ) AS "salary"
FROM EMPLOYEES
ORDER BY salary DESC;


SELECT last_name, ROUND((SYSDATE - HIRE_DATE)/7) AS "tenure"
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 90
ORDER BY 2 DESC;


SELECT (last_name ||  ' earns ' || TO_CHAR(salary, '$99,999') || ' monthly but wants ' ||TO_CHAR (salary*3, '$99,999') )  AS "dream salaries"
FROM EMPLOYEES
ORDER BY LAST_NAME;


SELECT Last_name, nvl( TO_CHAR(COMMISSION_PCT),'no commmission') AS "Comm"
FROM EMPLOYEES;


SELECT TO_CHAR(sysdate, 'dd month yyyy hh24:MI:ss')
FROM dual;

SELECT last_name, hire_date, NEXT_DAY( ADD_MONTHS(hire_date,6), 'lunedi') 
FROM EMPLOYEES;


SELECT last_name, hire_date, TO_char( NEXT_DAY( ADD_MONTHS(hire_date,6), 'lunedi'), 'fmDay ", the "ddspth" of "month", "YYYY') 
FROM EMPLOYEES;


SELECT max (salary), min (salary), sum (salary), ROUND(AVG(salary))
FROM EMPLOYEES;

SELECT job_id, max (salary), min (salary), sum (salary), ROUND(AVG(salary))
FROM EMPLOYEES
GROUP BY job_id;

SELECT job_id, count(EMPLOYEE_id) AS "count (*)"
FROM EMPLOYEES
GROUP BY JOB_ID;

SELECT count(manager_id) AS "number of manager"
FROM EMPLOYEES
WHERE manager_id IS NOT NULL
GROUP BY manager_id;

SELECT max (salary) - min (salary) AS "difference"
FROM EMPLOYEES;

SELECT manager_id, min (salary)
FROM EMPLOYEES
HAVING min(salary) > 6000 AND MANAGER_ID IS NOT null
GROUP BY MANAGER_ID
ORDER BY 2 desc;


SELECT e.last_name, e.department_id, d.department_name
FROM EMPLOYEES e JOIN DEPARTMENTS d
ON (e.DEPARTMENT_ID = d.DEPARTMENT_ID);


SELECT LAST_name, job_id, department_id, department_name
FROM EMPLOYEES  JOIN DEPARTMENTS 
using(department_id)
JOIN LOCATIONS
USING (location_id)
WHERE location_id = '1800'


SELECT first_name, 
FROM EMPLOYEES e JOIN EMPLOYEES m


