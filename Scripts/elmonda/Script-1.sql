SELECT employee_id, last_name, job_id, TO_CHAR(hire_date) AS "STARTDATE"
FROM EMPLOYEES
ORDER BY EMPLOYEE_ID;

--VOGLIAMO MOSTRARE TUTTI I JOB_ID UNICI DALLA TABELLA EMPLOYEES
SELECT DISTINCT JOB_ID
FROM EMPLOYEES
ORDER BY 1;

--vogliamo modificare la prima query perchè vogliamo cambiare intestazione, quindi usiamo altri alias per le colonne
SELECT employee_id AS "Emp #",
last_name AS "Employee",
job_id AS "Job",
to_char(HIRE_DATE) AS "Hire Date"
FROM employees
ORDER BY employee_id;

--vogliamo mostare per tutti i dipendenti il cognome e il job id e li vogliamo concatenati in un unico campo e vogliamo che il campo
--sia employee and Title
SELECT (last_name || ',' || job_id) AS "Employee and Title"
FROM EMPLOYEES;

--fare una query in cui mostrare tutte le colonne riassunte in una colonna unica chiamata output
--dobbiamo creare una concatenazione di tutti i valori
SELECT ( EMPLOYEE_ID || ',' || FIRST_NAME || ',' || LAST_NAME || ',' || EMAIL || ',' || PHONE_NUMBER || ',' || HIRE_DATE || ',' || JOB_ID || ',' || SALARY || ',' || COMMISSION_PCT || ',' || MANAGER_ID || ',' || DEPARTMENT_ID) AS "THE_OUTPUT"
FROM EMPLOYEES
ORDER BY employee_id;

--report che mostri cognomi e salari degli impiegati che guadagnano più di 12000 dollari
SELECT LAST_name, salary
FROM EMPLOYEES
WHERE SALARY > 12000
ORDER BY salary DESC;

--vogliamo mostrare il cognome  e il department id per il employee 176
SELECT last_name, department_id
FROM employees
WHERE employee_id = 176;

--siamo interessati ai dip che hanno il più alto e il più basso salario
--cognome e salario maggiore o minore di 5000
SELECT last_name, salary
FROM employees
where salary NOT between 5000 AND 12000
ORDER BY 2 DESC;

--mostrare job_id, last_name e hire DATE per gli impiegati che si chiamano matos AND taylor

SELECT first_name, last_name, job_id, hire_date
FROM EMPLOYEES
WHERE last_name = 'Matos' OR last_name = 'Taylor'
ORDER BY hire_date ASC;

--cognome e departement id degli impiegati nel dipartimento 20 o 50
--ordine naturale per cognome
SELECT last_name, DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 20 OR DEPARTMENT_ID = 50
ORDER BY last_name;

--
SELECT (last_name) AS "Employee", (salary) AS "Monthy Salary"
FROM employees
where salary between 5000 AND 12000
AND (DEPARTMENT_ID = 20 OR DEPARTMENT_ID = 50)
ORDER BY 2 DESC;

---
--vogliamo i cognomi di tutti i dipend e la DATA di assunzione assunti nel 2005

SELECT last_name, hire_date
FROM EMPLOYEES
WHERE hire_date BETWEEN '01-gen-05' AND '31-dic-05'
ORDER BY HIRE_DATE;

--query per cercare il cognome  e il job title di tutti gli employees che non hanno un manager
SELECT last_name, job_id
FROM EMPLOYEES
WHERE MANAGER_ID is null;

--LAST name salary commission di tutti gli employees che hanno una commission
--IN ordine discendente di salario e commissione
SELECT last_name, SALARY, COMMISSION_PCT 
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL
ORDER BY salary desc, COMMISSION_PCT DESC;

--vogliamo query su manager id 103 e che sia messo per ordine di cognome, 
--mostrare employy_id, last_name, salary, department_id. per i dip che hanno come manager id 103

SELECT employee_id, last_name, salary, department_id
FROM EMPLOYEES
WHERE MANAGER_ID = 103
ORDER BY last_name;

--cognomi impiegati con (a) e (e) nel loro cognome
SELECT last_name 
from employees
where lower(last_name) like '%a%' and lower(last_name) like '%e%'
ORDER BY 1;

--last_name, job_id,  salary per tutti gli impiegati il cui job id è sa_rep st_clerk
--salario non è 2,500,  3500 e 7000 
select last_name, job_id, salary
FROM EMPLOYEES
WHERE (job_id = 'SA_REP' OR job_id = 'ST_CLERK')
 AND SALARY NOT IN (2500, 3500, 7000)
 ORDER BY 3 DESC;

--STAMPARE LA DATA DI OGGI
--usare from dual come tabella fittizia
select to_char(sysdate) AS "Date"
from dual;

--employee_id, last_name, salary, NewSalary
--il salario incrementato del 15.5%-- salario *
-- vogliamo un numero intero quindi round
SELECT employee_id, last_name, round(salary + (salary * 0.155))  AS "NewSalary"
FROM EMPLOYEES;

---colonna che sottrae il vecchio salario al nuovo salario
--vogliamo sapere il valore assoluto  (Increase)

SELECT employee_id, last_name, round(salary + (salary * 0.155))  AS "NewSalary", 
      round(salary - (salary * 0.155)) AS "Increase"
FROM EMPLOYEES;

--last_name e lunghezza per employees che cominciano per h

select last_name AS "Name", length(last_name) AS "Length"
from employees
where last_name like 'H%';

--per ogni employee da quanto tempo è stato assunto
--numero di mesi tra oggi e lA data di assunzione
select last_name, ROUND(months_between(sysdate, hire_date)) AS "Months_Worked"
from EMPLOYEES
ORDER BY 2 DESC;


--salario
--left pading, $ come riempitivo
SELECT last_name, lpad(salary, 15, '$') AS "Salary"
FROM EMPLOYEES
ORDER BY salary;

--vogliamo mettere un * per ogni migliaio di dollari, per 100000 10 *
SELECT last_name, salary, lpad('*', SALARY/1000, '*') AS salaries_in_asterisk
FROM EMPLOYEES
ORDER BY salary DESC;

--query per mostrare il cognome  eil numero di settimane di impiego per tutti gli employees 
--nel dipartimento 90
SELECT LAST_NAME, ROUND((sysdate - HIRE_DATE)/7) AS TENURE
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 90
ORDER BY 2 DESC;

--SELECT che ci ritorni una sola colonna
--LAST name guadagna  3 volte in più quello che è il salario normale
SELECT (last_name || 'earns' || TO_CHAR(salary, '$99,999.99') || 'monthly but whants' || to_char(SALARY*3, 'fm$99,999.99') ) AS "Dreams Salaries"
FROM EMPLOYEES;

--query che mostra cognomi degli impiegati e commission, se non hanno commissioni no commission

SELECT last_name, nvl(to_char(commission_pct), 'no commission') AS "COMM"
FROM EMPLOYEES;

select sysdate
from dual;

--voglio che mi stampi il mese per esteso, il giorno dd, yyyy anno in formato completo
select employee_id, hire_date, to_char(hire_date, 'MONTH DD, YYYY')
from EMPLOYEES;

--DATA CORRENTE, CON ORE MIN E SEC
select to_char(sysdate, 'DD MONTH, YYYY HH24:MI:SS')
from dual;

--se ci sono DATE scritte IN un certo formato, posso convertirle IN stringhe usando la funzine TO DATE
--to_date è il reciproco di to_char --to_date(7.4.18', 'MM.DD.YY')
-- conversione stringa in oggetto date -->   to_date('12 Gennaio 1944', 'DD MONTH YYYY')

select to_date('12 Gennaio 1944', 'DD MONTH YYYY'), to_date('7.4.18',
'MM.DD.YY')
from dual;


select to_date('05-FEB-2019 19:32:18', 'DD-MON-YYYY HH24:MI:SS')
from dual;

--posso estrarre da una DATA solo l'ora
select to_char(
to_date('05-FEB-2019 19:32:18', 'DD-MON-YYYY HH24:MI:SS'),
'HH24:MI:SS') --parametro di estrazione, MI ESTRAE LA DATA
--'MON'--- MI ESTRAE IL MESE
from dual;

--somma di 13 mesi alla data odierna
select sysdate, add_months(sysdate, 13)
from dual;


--la funzione last day mi torna l'ultimo giorno del mese specificato
select last_day('01-FEB-2016')
from dual;

select months_between(sysdate, '15-GEN-01')
from dual;

--il prossimo lunedì del mese corrente
select next_day('01-GIU-19', 'LUNEDI')
from dual;

--scadenze 
-- se ho delle informazioni registrate nella seconda metà dell'anno e le voglio portare all'anno succ faccio il round
SELECT round(to_date('25-OTT-19'), 'YYYY'), 
       trunc(to_date('25-OTT-19'), 'YYYY')
from dual;

--review per chi è nel passato
--last_name, data di assunzione e data in cui è stata fatta la review
--sommare 6 mesi alla hire date, troviamo il primo lunedi successivo e poi convertire

SELECT last_name, HIRE_DATE, to_char(next_day(add_months(hire_date, 6), 'LUNEDI'),
'fmDay", the "ddspth" OF "Month", "yyyy')
FROM EMPLOYEES;


--day of week

SELECT to_char(SYSDATE, 'ddspth')
FROM dual;

SELECT to_char(SYSDATE, 'Month')
FROM dual;

SELECT to_char(SYSDATE, '"In Month "RM" of year "YEAR')
FROM dual;
--fm prima del parametro toglie gli spazi
SELECT to_char(SYSDATE, 'fmDay", the "ddspth" OF "Month", "yyyy' )
FROM dual;

--find 
SELECT max(salary), min(salary), sum(SALARY), round(avg(salary))
FROM EMPLOYEES;


--massimo stipendio per job_id
SELECT job_id, max(salary), min(salary), sum(SALARY),
round(avg(salary))
FROM EMPLOYEES
GROUP BY JOB_ID
ORDER BY JOB_ID;

--vogliamo sapere per ogni job id quanti employee ci sono
--quanti dipendenti per ogni ruoolo

select JOB_ID, COUNT(EMPLOYEE_ID)
from employees
group by JOB_ID
order by 1;

--quanti manager ci sono in employees
select count(distinct MANAGER_ID)
from employees;

--trovare la differenza tra il più alto e il più basso salario
select MAX(salary) - min(salary)
from employees
order by salary;

--
--escludi gruppi dei Manager di cui il salario è minore di 6000, voglio vedere i salari dai 6000 IN su, 
--order by per id

select manager_id, min(salary)
from employees
having min(salary) > 6000 AND manager_id is not null
group by manager_id
ORDER BY 2 DESC;

--query che produca gli indirizzi di tutti i dipartimenti
--location_id, street_address, city, state_province, country_name

SELECT location_id, street_address, city, state_province, country_name
FROM locations l NATURAL JOIN  countries;

-- last_name, department_id, department_name per tutti gli impiegati

SELECT last_name, department_id, department_name
FROM EMPLOYEES E JOIN  DEPARTMENTS d
USING(department_id);

--siamo interessati a tutti i dipendenti 
--cognome job id e department id di tutti gli employees che lavorano a Toronto

SELECT last_name, job_id, d.department_id, department_name
FROM EMPLOYEES e JOIN  DEPARTMENTS d
on(e.DEPARTMENT_ID = d.DEPARTMENT_ID)
join locations l
on(d.LOCATION_ID = l.location_id)
WHERE city = 'Toronto';

--employee e il nome del manager associato
--Employee, Emp#, Manager, Mgr#
--includere anche il nome del manager che ha come valore null
--VOGLIO SALVAGUARDARE EMPLOYEES 
SELECT e.last_name, e.EMPLOYEE_ID, m.last_name, m.DEPARTMENT_ID 
FROM EMPLOYEES e LEFT JOIN EMPLOYEES m 
on(e.MANAGER_ID = m.EMPLOYEE_ID)
ORDER BY 3, 1;












 
