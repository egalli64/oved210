
--1* esercizio creare la tabella

CREATE TABLE my_employee (
id NUMBER (4) CONSTRAINT employees_pk PRIMARY key,
last_name varchar2(25),
first_name varchar2(25) ,
userid varchar2(25),
salary NUMBER (9,2));

--DROP TABLE EMPLOYEEs      -> lo uso quando voglio cancellare tutto 

--2* es. inserire la riga senza specificare il nome della colonna

INSERT INTO MY_EMPLOYEE
VALUES (1, 'Patel', 'Ralph', ' rpatel', 895)

--3* es. inserire la seconda riga IN modo completo
INSERT INTO MY_EMPLOYEE(id, last_name, first_name, userid, salary)
VALUES (2, 'Dancs', 'Betty', 'bdancs', 860)

--4*es. aggiungere altri componenti
INSERT INTO MY_EMPLOYEE
VALUES (3, 'Biri', 'Ben', ' bbiri', 1100)

INSERT INTO MY_EMPLOYEE
VALUES (4, 'Newman', 'Chad', ' cnewman', 750)

INSERT INTO MY_EMPLOYEE
VALUES (5, 'Ropeburn', 'Audry', ' aroperburn', 1550)

-- 5*es. vogliamo cambiare il cognome alla riga 3

UPDATE MY_EMPLOYEE
SET last_name = 'Drexel'
WHERE id = 3

--6*es. cambiare il salario di chi ha 900 IN 1000

UPDATE MY_EMPLOYEE
SET salary = 1000
WHERE salary < 900

--7* es. eliminare Betty Dancs
DELETE FROM MY_EMPLOYEE
WHERE last_name = 'Dancs' and first_name = 'Betty'

--8* es. fare il commit
COMMIT;

--9*es. eliminare le righe della colonna non con truncate perchè non si può fare il rollback
truncate TABLE MY_EMPLOYEE

DROP TABLE MY_EMPLOYEE

--10*es. delete cosi posso fare il rollback
DELETE FROM MY_EMPLOYEE

ROLLBACK; -- così torna tutto come prima 

--11* es. creare nuova tabella

CREATE TABLE dept (
id NUMBER (7) CONSTRAINT dept_pk PRIMARY key,
name varchar2(25))

--12*creare altra tabella

CREATE TABLE emp (
id NUMBER (7) CONSTRAINT emp_pk PRIMARY key,
Last_name varchar2(25),
first_name varchar2(25),
dept_id NUMBER (7)
	CONSTRAINT emp_dept_id_fk
	REFERENCES dept (id) ON DELETE CASCADE 
)


--13*es. aggiungere/ modificare /cancellare colonna alla tabella

ALTER TABLE emp
ADD (commission NUMBER (2,2))

ALTER TABLE EMP
modify(
LAST_name varchar2(50))

ALTER TABLE emp 
DROP ( first_name);

--ESERECIZI GIORNO "26/03/19"

--1*es. congelare una tabella senza eliminarla

ALTER TABLE emp SET unused (dept_id)

--2* es. eliminare definitivamente la colonna che ho congelato in precedenza

ALTER TABLE emp drop unused COLUMNS

--3* es : creare tabella 
CREATE TABLE employee2 (
id NUMBER (6) CONSTRAINT employee2_pk PRIMARY key,
first_name varchar2(20),
last_name varchar2(25) ,
salary NUMBER (8,2),
dept_id NUMBER (4)
);


DROP TABLE EMPLOYEE2;

--4* es: creare la stessa tabella di sopra con il select dalla tabella hr.employees cosi si copiano automaticamente i dati
CREATE TABLE employees2 AS 
	SELECT employee_id AS id, first_name, last_name, salary, DEPARTMENT_ID AS dept_id
	FROM hr.employees
	
--5*es: tutti le modifiche che faccio non sono possibili dal read only
ALTER TABLE EMPLOYEES2 READ ONLY 

--6* es: cosa succede se cerco di eliminare tutte le righe della tabella (non permette)
DELETE FROM EMPLOYEES2;


--7*es: la faccio tornare utilizzabile
ALTER TABLE EMPLOYEES2 READ WRITE

--8* modifico employee

UPDATE EMPLOYEES2
SET FIRST_NAME = 'Tom'
WHERE id = 100


TRUNCATE TABLE EMPLOYEES2

--9* es: cancella tutte le tabelle
DROP TABLE DEPT
DROP TABLE emp 
DROP TABLE EMPLOYEES2
DROP TABLE coders
DROP TABLE INFOS
DROP TABLE SIMPLE
DROP TABLE MY_EMPLOYEE

