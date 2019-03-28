
SELECT LAST_NAME, TO_CHAR(HIRE_DATE) AS "STARDATE", EMPLOYEE_ID, JOB_ID
FROM EMPLOYEES
ORDER BY EMPLOYEE_ID;


--Vogliamo mostrare una query con yutti i job_id unici dalla tabella employee (UNICI quimndi usiamo distinct)
SELECT DISTINCT JOB_ID
FROM EMPLOYEES
ORDER BY 1;

-- vogliamo modificare la prima query perchè vogliamo cambiare intestazione. quindi usiamo altri alias per le colonne
SELECT EMPLOYEE_ID AS "emp #",
LAST_NAME AS "employee",
JOB_ID AS "Job",
TO_CHAR(HIRE_DATE) AS "Hire Date"
FROM EMPLOYEES
ORDER BY EMPLOYEE_ID;


--Vogliamo mostrare per tutti i dipendenti il cognome e il job id, concatenati IN un unico campo, e vogliamo che questo campo sia employee AND title
SELECT (LAST_NAME || ',' || JOB_ID) AS "Employee and Title"
FROM EMPLOYEES;  -- || ',' || --> operatore di concatenazione


-- Vogliamo fare una query IN cui mostrare tutte le colonne ma riassunte IN un'unica colonna creando una concatenazione di valori
SELECT (EMPLOYEE_ID || ',' || FIRST_NAME || ',' || LAST_NAME || ',' || EMAIL || ',' || PHONE_NUMBER || ',' || HIRE_DATE || ',' || JOB_ID || ',' || SALARY || ',' || COMMISSION_PCT || ',' || MANAGER_ID || ',' || DEPARTMENT_ID) AS "THE_OUTPUT"
FROM EMPLOYEES
ORDER BY EMPLOYEE_ID;

--report che mostri cognomi e salari degli impiegati che guadagnano piu di 12000$
SELECT FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > 12000
ORDER BY 3 desc;

-- mostrare il cognome e il department_id per employee 176
SELECT LAST_NAME, DEPARTMENT_ID
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 176;

--mostrare cognome e salario degli impiegati che hanno un salario non compreso tra 5000 e 12000
SELECT LAST_NAME, SALARY 
FROM EMPLOYEES
WHERE SALARY  NOT BETWEEN 5000 AND 12000
ORDER BY 2 DESC;

-- mostrare  il cognome e job id e DATA di assunzione per gli impiegati che si chiamano MATOS e TAYLOR ordinati IN ascending ORDER BY HIRE DATE
SELECT LAST_NAME, JOB_ID, HIRE_DATE
FROM EMPLOYEES
WHERE LAST_NAME = 'Matos' OR LAST_NAME = 'Taylor'
ORDER BY  HIRE_DATE ASC;

-- Mostrare il cognome e il department id di tutti gli impiegati nel dipartimento 20 o dipartimento 50 IN ascending alphabetical ORDER BY last_name
SELECT LAST_NAME, DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 20 OR DEPARTMENT_ID = 50
ORDER BY LAST_NAME;


SELECT LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY   BETWEEN 5000 AND 12000
AND (DEPARTMENT_ID = 20  OR DEPARTMENT_ID = 50)
ORDER BY 2;

-- mostra il cognome e DATA assunzione degli impiegati, ma solo per quelli  che sono stati assunti nel 2005
SELECT LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE >= '1-GEN 05' AND HIRE_DATE <= '31-DIC-05'
--WHERE HIRE_DATE between'1-GEN 05' AND HIRE_DATE  '31-DIC-05'
ORDER BY 1;


-- mostra cognome e job id di tutti gli employees che non hanno un manager
SELECT LAST_NAME, JOB_ID
FROM EMPLOYEES
WHERE MANAGER_ID IS NULL;

-- mostra last name salary e commission degli impiegati 
SELECT LAST_NAME, SALARY, COMMISSION_PCT
FROM EMPLOYEES 
WHERE COMMISSION_PCT IS NOT NULL 
ORDER BY SALARY DESC, COMMISSION_PCT DESC;

-- mostra 
SELECT EMPLOYEE_ID, LAST_NAME, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE MANAGER_ID = 103
ORDER BY LAST_NAME;

-- mostra i cognomi di tutti gli impiegati che hanno nel loro cognome sia una A che una E
SELECT LAST_NAME
FROM EMPLOYEES
WHERE  lower(LAST_NAME) LIKE '%a%' AND lower  (LAST_NAME) LIKE '%e%';


-- mostra cognome, salario e job id di tutti gli impiegati il cui job id è sa_rep oppure st_clerk, il cui salario non è 2500 3500 7000
SELECT LAST_NAME, Salary, JOB_ID 
FROM EMPLOYEES 
WHERE  JOB_ID IN ('SA_REP','ST_CLERK') AND SALARY NOT IN  (2500, 3500, 7000)
ORDER BY 2 DESC;

-- stampare la data di oggi da system date
SELECT TO_CHAR(SYSDATE) AS "Date"
FROM dual;

-- mostra numero.last name e salary. dove il salario è incrementato del 15.5%
SELECT EMPLOYEE_ID, LAST_NAME, (SALARY + (SALARY * 0.155)) AS "NEW SALARY"
FROM EMPLOYEES;

--colonna che sottrae il vecchio salario al nuovo salario e vogliamo sapere il valore assoluto (increase)
SELECT EMPLOYEE_ID, LAST_NAME, SALARY,
round(salary + salary * 0.155) AS "New Salary",
round(salary * 0.155) AS "Increase"
FROM EMPLOYEES;


-- lunghezza del last name per tutti gli employees che cominciano per h
SELECT LAST_NAME, LENGTH(LAST_NAME) AS "Lenght"
FROM EMPLOYEES
WHERE LAST_NAME LIKE 'H%';


-- mostra per ogni employee la duration cioè da quanto tempo è stato assunto e il numero di mesi da oggi a quando è stato assunto
SELECT LAST_NAME, ROUND (MONTHS_BETWEEN (sysdate, HIRE_DATE)) AS "MONTHS_WORKED"
FROM EMPLOYEES
ORDER BY 2 DESC;

--
SELECT  LAST_NAME, lpad(salary, 15, '$') AS salary 
FROM EMPLOYEES 
ORDER BY SALARY;


--
SELECT LAST_NAME, SALARY,  TRUNC (SALARY/1000), lpad('*', SALARY/1000, '*') AS salaries_in_asterisk
FROM EMPLOYEES
ORDER BY salary DESC;

--
SELECT  LAST_NAME,  trunc ((sysdate - HIRE_DATE)/7)  AS TENURE
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 90
ORDER BY 2 DESC;

-- mostrare che ci ritorni una sola colonna, 
SELECT TO_CHAR  (SALARY, 'fm$99,999.00') TO_CHAR (SALARY, 'fmL99G999D00')
FROM EMPLOYEES
ORDER BY SALARY ASC;


--mostra cognome e commission, se non hanno commissioni diciamo no commission
select  LAST_NAME, nvl(TO_CHAR (commission_pct), 'missing' ) 
FROM EMPLOYEES;

---------


SELECT sysdate 
FROM dual;


SELECT employee_id, hire_date, TO_CHAR(hire_date, 'MONTH DD, YYYY')
FROM EMPLOYEES


SELECT TO_CHAR(sysdate, 'DD MONTH YYYY HH24:MI:SS')
FROM dual;

-- convertire dalla stringa alla data
SELECT TO_DATE('12 Gennaio 1994','DD MONTH YYYY'), TO_DATE('7.4.18', 'MM.DD.YY')
FROM dual;

--
SELECT  TO_CHAR( 
TO_DATE('05-FEB-2019' '19:32:18', 'DD-MON-YYYY HH24:MI:SS'),
--'HH24:MI:SS')
'MON')
FROM dual;

SELECT sysdate, add_months(SYSDATE,13)
FROM dual;

--per sapere qual è l ultimo giorno del mese
SELECT LAST_DAY('01-FEB-2016')
FROM dual;

SELECT MONTHS_BETWEEN(sysdate, '15-GEN-01')
FROM dual;

--giorno successivo ad una certa DATA
SELECT NEXT_DAY('01-GIU-19', 'LUNEDI')
FROM dual;

--
SELECT ROUND (TO_DATE('25-OTT-19'), 'YYYY'), --con round se siamo dopo metà dell anno mi riporta all inizio dell  anno successivo quindi 2010
TRUNC  (TO_DATE('25-OTT-19'), 'YYYY') -- con trunc se siamo a meta dell anno mi riporta all inizio dello stesso anno
FROM dual;

-- da rivedere
SELECT hire_date, ADD_MONTHS(hire_date, 6)
FROM EMPLOYEES


--esercizio the day 6 months in the future from now
SELECT  add_months(SYSDATE,6)
FROM dual;

-- the FIRST monday 6 months FROM now
SELECT NEXT_DAY (ADD_MONTHS(sysdate,6), 'lunedì')
FROM dual;

--day of week
SELECT  TO_CHAR (SYSDATE, 'Day')
FROM dual;
 
SELECT  TO_CHAR (SYSDATE, 'ddspth')
FROM dual;
 
SELECT  TO_CHAR (SYSDATE, 'Month')
FROM dual;
 

SELECT  TO_CHAR (SYSDATE, 'fmDay", the "ddspth" of "Month", "YYYY')
FROM dual;
 
