SELECT*
FROM COUNTRIES;

---select country_Id ,country_name
---from countries;


---SELECT first_name,last_name
---from employees;

select country_Id ,country_name
from countries;

select region_name
from regions;

SELECT *
from countries
where country_id = 'AR';

SELECT SYSDATE
FROM dual;

SELECT 2 + 2
from dual;

--user_tables
select table_name
from user_tables;

descr jobs;

--varchar(20) non può avere più di 20 caratteri
--number(6,2), number(6), integer
--char(20) deve essere sempre  e solo 20 ed è poco usata, 
--data (sysdate mi mette la data di oggi from dual)

select rowid, region_id,region_name
from regions
where region_id=1;

--date
select sysdate,sysdate-1
from dual;

select to_date ('30-GEN-19'), to_date('30-GEN-19')+1, to_date('30-GEN-19')+ 2
from dual;

SELECT max_salary, min_salary,(max_salary +min_salary)/2 as"AVERAGE SALARY"
FROM jobs
where job_id='AD_PRES';

select first_name||' '|| last_name as"Name"
from employees
where employee_id=100;

select first_name, last_name, COMMISSION_PCT
from employees
where commission_pct is  null;

select first_name, last_name, 12 * salary * COMMISSION_PCT as "Year Full Salary"
from employees

--NVL()

SELECT * FROM table
SELECT first_name, last_name, NVL(COMMISSION_PCT,0) as "Null-free commission"
FROM employees;

--distinct
SELECT  DISTINCT manager_id
FROM employees;

SELECT distinct last_name
    FROM employees;
    
   ---SELECT asingle ROW
   SELECT*
   FROM EMPLOYEES
   WHERE LAST_NAME= 'King';
   
    SELECT*
   FROM EMPLOYEES
   WHERE EMPLOYEE_ID <>100;
   
    SELECT*
   FROM EMPLOYEES
   WHERE EMPLOYEE_ID < 110;
   
    SELECT*
   FROM EMPLOYEES
   WHERE FIRST_NAME <= 'Bruce';
   
    SELECT*
   FROM REGIONS
   WHERE REGION_ID > any(1,2,3);
   
     SELECT*
   FROM REGIONS
   WHERE REGION_ID > all(1,2,3);
   
  --employees:
  --impiegati assunti nei primi sei mesi del 2005
  --impiegati hanno lo stipendi maggiore di 5mila dollari
  --job_id St_Clerk
  
  SELECT FIRST_NAME NAME, LAST_NAME, HIRE_DATE
  FROM EMPLOYEES
  WHERE HIRE_DATE >='1-gen-05'AND HIRE_DATE <'1-LUG-05';
  
  
  SELECT FIRST_NAME,LAST_NAME,SALARY
  FROM EMPLOYEES
  WHERE SALARY >= 5000;
  
 SELECT FIRST_NAME,LAST_NAME,JOB_ID
 FROM EMPLOYEES
 WHERE JOB_ID = 'ST_CLERK';
 
--LIKE_%
select LAST_NAME
FROM employees
WHERE LAST_NAME LIKE'_ul%'or last_name like'Gr%';

select LAST_NAME
FROM employees
WHERE LAST_NAME not like '%a';

select*
FROM employees
WHERE employee_id in(107,144,145);

--pay attention to null
select*
FROM regions
WHERE region_id not in (2,3);

select*
FROM regions
WHERE region_id  is not  null;

--between
select*
FROM regions
WHERE region_id  between 2 and 3;

select*
FROM regions
WHERE region_id  between 2 and 3;

--and
  SELECT FIRST_NAME NAME, LAST_NAME, HIRE_DATE
  FROM EMPLOYEES
  WHERE HIRE_DATE >='1-gen-05'AND HIRE_DATE <'1-LUG-05';
 
  --or
 SELECT employee_id, FIRST_NAME NAME, LAST_NAME, HIRE_DATE
  FROM EMPLOYEES
  WHERE HIRE_DATE >'1-gen-08' or employee_id=100;
  
 --not
  SELECT *
  FROM regions
  WHERE region_id not between 2 and 3;
  
 --order by
  SELECT  FIRST_NAME NAME, LAST_NAME, HIRE_DATE
  FROM EMPLOYEES
  WHERE last_name='Grant' or last_name='King'
  order by last_name asc,first_name desc;
  
  SELECT  FIRST_NAME NAME, LAST_NAME, HIRE_DATE
  FROM EMPLOYEES
  WHERE last_name='Grant' or last_name='King'
  order by 3;
  
   SELECT  FIRST_NAME NAME, LAST_NAME, HIRE_DATE
  FROM EMPLOYEES
  WHERE last_name='Grant' or last_name='King'
  order by 3 desc;
  
 ---employees: st_claerk,salary[2000,3000] highet salary first
 Select First_name,last_name, salary, job_id
 from employees
 where job_id = 'ST_CLERK' and salary between 2000 and  3000
order by salary desc;

---employees: with commission_pct, order by first name
select first_name, last_name, commission_pct
from employees
where commission_pct is not null
order by first_name;

--employees: with phone number including'121' order by hire date
select first_name,last_name, phone_number,hire_date
from employees
where phone_number like '%121%'
order by hire_date;

--  hired 2007 with manager Payam, by first

select employee_id, first_name, last_name
from employees
where first_name= 'Payam';

select  first_name, last_name, hire_date, manager_id
from employees
where manager_Id=122 and hire_date between '31-gen-07'and '31-dic-07'
order by first_name;