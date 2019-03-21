--jobs where min salary in [2000, 5000] ordered by job title 

select job_title, min_salary
from jobs
where min_salary between 2000 and 5000
order by job_title;

--voglio fare una connessione tra due tabelle
--all countries in region Europe


--First part: region id for Europe
select region_id
from regions
where region_name = 'Europe';

--Second step: Europe countries
select country_name
from countries
where region_id = 1;

--non voglio che i dati arrivino d auna tabella ma da due, countries e regions, basta metterci una virgola in mezzo
--ho fatto il prodotto cartesiano tra due prodotti, ogni elemento di countries mi è stato messo con ogni elemento di regions
--mettimi insieme i dati di una tabella con i dati di un'altra rispettando una qualche regola
--per dirglielo faccio una where

--select country_name
--from countries, regions
--where countries.region_id = regions.region_id and region_name = 'Europe';

--DI SEGUITO I DUE MODI PER CREARE UNA CONNESSIONE TRA DUE TABELLE
--NATURAL JOIN CLASSICA
--join --> connessione tra due tabelle
select country_name
from countries c, regions r --per rinominare countries ci mettiamo c, e in regions r
where c.region_id = r.region_id and region_name = 'Europe';


--c'è un modo più leggibile per scrivere la stessa cosa
--MODERN JOIN EXPLICIT

select country_name, region_name
from countries join regions  --uno è primary key e l'altro forein kew e li mette insieme
using(region_id);  --sto dicendo faccio la join usando region_id come legame

--CROSS JOIN (prodotto cartesiano)
select country_name, region_name
from countries c cross join regions r; --non sto facendo un pasticcio, sto dicendo è davvero intenzionalmente una cross join.


--employees: first name, last name where department name is IT
select first_name, last_name
from employees join departments
using(department_id)  -- CHE COLONNA STO USANDO PER FARE JOIN
where department_name = 'IT'; 

--MODO ALTERNATIVO
--USING_ON_ FOR FULL DESCRIPTION OF JOINED COLUMNS
--on invece di using   sono uniti per uguaglianza con department id
--on per specificare la nostra connessione, diventerebbe necesario se avessi nomi diversi e devo dire on
select first_name, last_name, department_name
from employees e join departments d
on(e.department_id = d. department_id)
where department_name = 'IT';

--SELF JOIN
--quando voglio usare i manager all'interno della mia tabella devo fare una join con gli employees
--i nomi di tutti gli employee e il cognome del loro manager
select emp.first_name || ' ' || emp.last_name as "Employee",
       emp.first_name || ' ' || mng.last_name as "Manager"
from employees emp join employees mng  --pensare ad mng come se fosse un'altra tabella, anche se è sempre employee
on(emp.manager_id = mng.employee_id) --employee_id del manager associato
order by 1; --vuool dire mettimeli in ordine di employee

--more than two tables
--voglio scrivere una query che mi coinvolge la tabella emploee, departments e location
select e.first_name, e.last_name, l.city, d.department_name
from employees e, departments d, locations l
where e.department_id = d.department_id
  and d.location_id = l.location_id--voglio che location id sia la stessa che c'è in departments
  order by 4; --ordinati per department_name, quarta colonna
  
  --riscriviamo la query in maniera moderna usando il join
  --modern w/ on
  select e.first_name, e.last_name, l.city, d.department_name
  from employees e join departments d
  on(e.department_id = d.department_id)
  join locations l
  on(d.location_id = l.location_id)
  order by 4;
 
 --modern w/ using (only employees based in Oxford)
 select e.first_name, e.last_name, l.city, d.department_name
 from employees e join departments d
 using(department_id)
 join locations l
 using(location_id)
 where city = 'Oxford'
 order by 3;
 
  
--employees having Steven King as manager,
--shipping department
--voglo quelli che hanno per manager steve king quindi metteroò una close
select first_name, last_name
from employees 
where manager_id = 100
order by 1;   

--FIRST PART
select e.first_name, e.last_name, m.last_name
from employees e join employees m 
on(m.employee_id = e.manager_id)
where m.first_name = 'Steven' and m.last_name = 'King';

--SECOND PART
select e.first_name, e.last_name
from employees e join departments d
on(department_id)
join(department_id)
on(d department_id = e department_id)
where deparment_name = 'Shipping';


select e.first_name, e.last_name, d.department_name, m.last_name
from employees e join employees m 
on(m.employee_id = e.manager_id)
join departments d
on(d.department_id = e.department_id)
where m.first_name = 'Steven' and m.last_name = 'King' and d.department_name = 'Shipping'
order by 3;


--null on a FK  modo in cui diciamo che kimberly grant non ha un dipartimento associato
select first_name, last_name, department_id
from employees
where last_name like 'Gr%';

---nome cognome di tutti quelli che cominciano per gr e il loro dipartimento
select first_name, last_name, department_name
from employees join departments
using(department_id)
where last_name like 'Gr%';

--voglio preservare anche gli elemnti che non hanno la foreign k ( kimberly = nulla, non ha dipertimento)outer join
select first_name, last_name, department_name
from employees left outer join departments  --se qualcuno nella tabella di sinistra, in questo caso emloyees, non esiste, mettimi un null
using(department_id)
where last_name like 'Gr%';

//alternativa poco usata-->

select first_name, last_name, department_name
from employees e, departments d 
where e.department_id = d.department_id (+) --mettici lo stesso il valore anche se departments è null
and last_name like 'Gr%';

select first_name, last_name, department_id
from employees
where department_id between 110 and 120; -- non mi mostra quelli a sinistra perchè non c' nulla


select*
from departments
where department_id = 120;

--dipatimenti e employee associati e dipartimenti che non hanno employee

select first_name, last_name, department_name
from employees right outer join departments
using(department_id)
where department_id between 110 and 120; --right outer compare treasury

select first_name, last_name, department_name
from employees left outer join departments
using(department_id)
where department_id between 110 and 120; -- scompare il treasury

--FULL OUTER JOIN MI METTE ENTRAMBI LEFT E RIGHT
select first_name, last_name, department_name
from employees full outer join departments
using(department_id)
where department_id between 110 and 120;

--STAMPARE TUTTI I DIPARTIMENTI CON IL NOME E COGNOME DEL MANAGER SE C'è

--departments: name and associated manager (when existing) -- tutti i nomi del dipartimento e i manager,
--se non c'è il manager voglio comunque i nome del dipartimento

select d.department_name, e.first_name, e.last_name
from employees e right outer join departments d 
on(d.manager_id = e.manager_id)
order by 2;

--departments: name and associated manager (when existing)
--order by name

select d.department_name,
e.first_name || ' ' || e.last_name as "Manager"
from employees e right outer join departments d
on(d.manager_id = e.employee_id)
order by e.last_name;


--employees: first name e last name suo e del manager
-- in ordine di salario

select m.first_name || ' ' || m.last_name as "Manager",
       e.first_name || ' ' || e.last_name as "Employee",
       e.salary
       from employees m right outer join employees e 
       on(m.employee_id = e.manager_id)
       order by salary desc;
      

      --functions
      --esiste un metodo che mi converte un carattere nel valore che viene utilizzato per descrivere quel carattere
      select ascii('A') as "A", chr(90) as "Z", ascii('a')   
      from dual;
     
     -- concat
     select concat(first_name, last_name)
     from employees
     where employee_id = 100;

    --la instring mi ritorna anche la posizione di un carattere
    --instr(region_name, 'a', 10) -->  partendo dalla posizione 10, la prima a me la trova in posizione 13
    --instr(region_name, 'a', 10, 2) --> voglio la seconda a dopo il 10
    select region_name, instr(region_name, 'Middle'), instr(region_name, 'East'), instr(region_name, 'Upper'), instr(region_name, 'a'), instr(region_name, 'a', 10), 
    instr(region_name, 'a', 10, 2)
    from regions
    where region_id = 4;
    
   
   --assunto a giugno
   --MI HA CONVERTITO HIRE_DATE NELLA STRINGA 
   select hire_date, instr(hire_date, 'GIU')  
   from employees
   where employee_id = 100;
   
  --gli passeremo la stringa di cui vogliamo la lunghezza
  select region_name, length(region_name)
  from regions;
  
 select salary, length(salary)
 from employees
 where employee_id = 100;
 
select salary, length(salary), length(100.01)
 from employees
 where employee_id = 100;
 
--ci sono metodi per trasformare le stringhe in minuscole e maiuscole
--initcap mi prende una stringa e mi capitalizza solo l'iniziale
select upper(first_name), 
       lower(last_name),
       initcap(lower(first_name))
from employees
where employee_id = 112;


--scrivi la tua stringa in una colonna di 30 caratteri e riempi gli altri spazi con tanti punti
select rpad('hello', 30, '.'),
lpad('hello', 30, '-_'),
lpad('hello', 3, '-_-')
from dual;


--lefttrim mi elimina gli spazi bianchi a sinistra
--voglio eliminare gli Ab che ci sono a destra della mia stringa
--trim elimina sia da destra che sinistra l'elemento zero
select ltrim('   hello'),
rtrim('helloAbAb', 'Ab'),
trim('0' from '000hello0000')
from dual;

--nvl()
select nvl(commission_pct, 0)
from employees

--non sono interessato al valore effettivo della commissione ma a chi ha commission
select nvl2(commission_pct, 'has commission', 'no commission')
from employees


--voglio sostituire administartion con admin
--administration mi viene modificato in admin
select job_title, replace(job_title, 'Administration', 'Admin')
from jobs;

--di uso comune è la substring
--substr()
--PARTE DA 16, MI PRENDE 4 CARATTERI E MI TIRA FUORI VICE
select job_title, SUBSTR(JOB_TITLE, 16, 4)
from jobs
where job_id = 'AD_VP'

--PER VEDERLO IN MAIUSCOLO
select job_title, UPPER(SUBSTR(JOB_TITLE, 16, 4))
from jobs
where job_id = 'AD_VP'

--math
--power-potenze, 2^0=1

select abs(-10), abs(10),
ceil(5.8), ceil(-5.2),
floor(5.8), floor(-5.2),
mod(8, 4), mod(8, 3),
power(2, 0), power(2, 3)
from dual;


--round(5.75, 1) possimao dirgli che vogliamo una cifra decimale e avremo 5,8
--round(51.75, -2)--> voglio due cifre a sinistra del decimale
select power(2, -3), power(2, 3),
round(5.75), round(5.2), 
round(5.75, 1), round(5.75, -1),
from dual;

select round(51.75, -2), round(51.75, -1),
round(5.312, 1)
from dual;

--verifica se un numero ha segno positivo o negativo
select sign(-5), sign(5), sign(0)
from dual;

select trunc(5.75), trunc(5.75, 1), trunc(5.75, -1)
from dual;


--to char ci fa la conversione in stringhe
--comunqeu viene fatto in automatico in sql
select to_char(1234.54), '4'
from dual;

--gli passiamo un formato
--to_char mi accetta questo parametro secon in cui gli dico come voglio che venga formattata quella stringa to_char(1234.54, '99,999.99')
select to_char(1234.54), to_char(1234.54, '99,999.99'),
to_char(2019, 'RN')
from dual;

--TONUMBER MI CONVERTE A NUMERO QUELLO CHE è UNA STRINGA
select to_char(1234.54), to_char(1234.54, '99,999.99'),
to_char(2019, 'RN'), TO_NUMBER('970,23') * 2,
cast('05-GEN-18' as date),
cast(12345.234 as number(10,2))
from dual;

--ESISTE UN METODO CAST CHE CI PERMETTE DI TRASFORMARE UNA STRINGA IN QUALCOS ALTRO
--DI SOLITO PER LE DATE
--il vantaggio del cast è che mi genera un oggetto del tipo specificato


--aggregate functions
--per la media dei salari avg
--varianza 
--deviazione standard
--con una varianza cosi alta ci potrebbe essere uno sbilanciamento alto nei salari
--per avere più nformazioni potremmo confrontare la media dei salari con la media dei salari considerati una sola volta
--sono funzioni aggregate poichè lavorano su più dati/collezioni contemporaneamente
select avg(salary), variance(salary), stddev(salary), avg(distinct salary)
from employees
order by salary;

--count(*) mi dice su quante colonne sto lavorando
--contami quanti (employee_id) ci sono
--tutte le colonne hanno un rowid quindi per avere il numero esatto di tutte le righe uso questa funzione count(rowid)
select count(*), count(employee_id),
count(department_id), count(rowid)
from employees;

--altre funzioni aggregate per eseguire operazioni statistiche
select sum(salary),
       max(salary), min(salary),
       max(first_name), min(last_name),
       max(hire_date), min(hire_date)
from employees;


--voglio vdere  i salari medi per department_id purchasing-->30
select avg(salary)
from employees
where department_id = 30;


--voglio vedere i miei department_id nella tabella employees
--conviene ragruppare department_id
--cosi ho la lista dei miei dipartimenti dalla mia tabella
select department_id
from employees
group by department_id
order by 1;

--equivalente
select distinct department_id
from employees
group by department_id
order by 1;

--quanti sono hgli employees che appartengono a quel dipartimento 
select department_id, count(rowid)
from employees
group by department_id
order by 2 desc;

--salario medio per ogni dipartimento
select distinct department_id, count(rowid), avg(salary) 
from employees
group by department_id
order by 3 desc;

select distinct department_id, count(rowid), trunc(avg(salary)) 
from employees
group by department_id
order by 3 desc;


--salario medio dei dipendenti a seconda della sede di lavoro
--employees: group them by location.country_id,
--give average salary


select distinct l.country_id, trunc(avg(salary))
from employees e join departments d 
on(e.department_id = d.department_id)
join locations l
on(d.location_id = l.location_id)
group by l.country_id
order by 2 desc;

--voglio vedere i salari dei dipendenti a seconda dei manager
--usando having riesco a filtrare i miei risultati invece di where
--having
select manager_id, trunc(avg(salary))
from employees
group by manager_id
having avg(salary) > 8500
order by 2 desc;

-- where: filter on employees
select manager_id, trunc(avg(salary))
from employees
where salary > 8500
group by manager_id
order by 2 desc;

-- filter on employees than on groups of employees
select manager_id, trunc(avg(salary))
from employees
where salary > 6000
group by manager_id
having avg(salary) > 8500
order by 2 desc;
