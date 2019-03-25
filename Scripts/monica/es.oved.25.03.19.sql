
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


--13*es. aggiungere colonna alla tabella

ALTER TABLE emp
ADD (commission NUMBER (2,2))


