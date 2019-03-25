--CREATE TABLE

CREATE TABLE coders as
	SELECT employee_id AS coder_id, first_name, last_name, hire_date, salary
	FROM hr.employees
	WHERE department_id = 60;

--creare una tabella nuova
CREATE TABLE simple(
	simple_id number(6, 0) PRIMARY KEY,
	status char,
	name varchar2(20),
	coder_id NUMBER
);

--aggiungere nuova colonna
ALTER TABLE simple
ADD counter NUMBER(38, 0);

--rimuovere una colonna
ALTER TABLE SIMPLE
DROP COLUMN COUNTER;

SELECT table_name
FROM user_tables;

SELECT *
FROM simple;

ALTER TABLE simple
ADD CONSTRAINT simple_status_ck CHECK(status IN ('A', 'B', 'X'));

ALTER TABLE simple
ADD CONSTRAINT simple_id_ck check(MOD(simple_id, 2) = 1);

ALTER TABLE simple
MODIFY name CONSTRAINT simple_name_nn NOT null;

INSERT INTO simple(simple_id, status, name, CODER_ID)
VALUES(11, 'A', 'bad status', 1);

INSERT INTO SIMPLE
VALUES(3, 'A', NULL, 1);

ALTER TABLE SIMPLE
DROP CONSTRAINT SIMPLE_NAME_NN;

ALTER TABLE CODERS
ADD CONSTRAINT CODERS_PK PRIMARY KEY(CODER_ID);

ALTER TABLE SIMPLE
DROP COLUMN CODER_ID;

ALTER TABLE SIMPLE
ADD CONSTRAINT SIMPLE_CODER_ID_FK 
CODER_ID REFERENCES CODERS(CODER_ID);

--ADD TO CODERS: ID: 12, HIRE_DATE: TODAY, SALARY: 4000
INSERT INTO CODERS
VALUES(10, 'Tom', 'Jones', sysdate, 4000)

--inserire valori nella tabella SIMPLE
INSERT INTO SIMPLE
values(1, 'A', 'first', 103)

SELECT *
FROM SIMPLE

INSERT INTO SIMPLE
VALUES(3, 'A', 'second', 105)

ALTER TABLE SIMPLE
DROP COLUMN CODER_ID;

ALTER TABLE SIMPLE
ADD CONSTRAINT SIMPLE_CODER_ID_FK 
CODER_ID REFERENCES CODERS(CODER_ID) ON DELETE CASCADE;

ALTER TABLE SIMPLE
ADD CONSTRAINT SIMPLE_CODER_ID_FK 
CODER_ID REFERENCES CODERS(CODER_ID) ON DELETE SET NULL;

UPDATE SIMPLE
SET CODER_ID = 10;

DELETE FROM CODERS
WHERE CODER_ID = 10;

--valori duplicati
INSERT INTO SIMPLE
VALUES(5, 'A', 'second', 105)

DELETE FROM SIMPLE
WHERE SIMPLE_ID = 5;

--cosa fare se non voglio duplicati
ALTER TABLE SIMPLE
ADD CONSTRAINT simple_name_uq unique(name);

ALTER TABLE CODERS
ADD CONSTRAINT coders_name_uq unique(first_name, last_name);

INSERT INTO CODERS
VALUES(212, 'Valli', 'Pataballa', sysdate, 4000)

SELECT *
FROM user_constraints
WHERE table_name = 'Simple'

DROP TABLE SIMPLE;

CREATE TABLE infos(
	info_id number(6, 0) 
		CONSTRAINT infos_pk PRIMARY KEY
		CONSTRAINT infos_id_ck check(MOD(info_id, 2) = 1),
	status char DEFAULT 'A'
		CONSTRAINT infos_status_ck CHECK(status IN ('A', 'B', 'X')),
	name varchar2(20)
		CONSTRAINT infos_name_uq UNIQUE,
	coder_id NUMBER
		CONSTRAINT infos_coder_id_fk
		REFERENCES coders(coder_id) ON DELETE CASCADE
);

INSERT INTO CODERS
VALUES(10, 'Tom', 'Jones', sysdate, 4000)

INSERT INTO INFOS
values(1, 'A', 'first', 10)

SELECT *
FROM INFOS

INSERT INTO INFOS
VALUES(3, DEFAULT, 'second', 10)

--stesso modo di sopra per inserire i valori della tabella, ma esplicito 
INSERT INTO INFOS(INFO_ID, NAME, CODER_ID)
VALUES(5,'third', 10)

DELETE FROM CODERS
WHERE CODER_ID = 10;

--rinominare tabella
RENAME infos TO my_statuses;

--commenti su tabella e colonne
COMMENT ON TABLE my_statuses IS 'Some extra information on Coders';
COMMENT ON COLUMN MY_STATUSES.STATUS IS 'Status in the statuses';

--non è un comando DML, ma seve per svuotare la tabella
TRUNCATE TABLE MY_STATUSES;

--sequenze
CREATE SEQUENCE my_seq;

SELECT *
FROM user_sequences;

SELECT my_seq.nextval
FROM dual;

ALTER SEQUENCE my_seq INCREMENT BY 2;

DROP SEQUENCE my_seq;

CREATE SEQUENCE my_seq
START WITH 201 INCREMENT BY 2;

INSERT INTO MY_STATUSES
values(my_seq.nextval, DEFAULT, 'Tom', 103)

INSERT INTO MY_STATUSES
values(my_seq.nextval, DEFAULT, 'Bill', 105)

--VIEW
CREATE OR REPLACE VIEW restricted_coders as
	SELECT coder_id, first_name, last_name
	FROM CODERS
	WITH READ ONLY;

SELECT *
FROM RESTRICTED_CODERS;

UPDATE RESTRICTED_CODERS
SET FIRST_NAME = 'Tom'
WHERE CODER_ID = 103;

--esercizio
--1
CREATE TABLE myEmployee(
	employee_id number(4, 0) 
		CONSTRAINT myEmployee_pk PRIMARY KEY
		CONSTRAINT myEmployee_employee_id_nn NOT NULL,
	first_name varchar2(25)
		CONSTRAINT myEmployee_first_name_uq UNIQUE,
	last_name varchar2(25)
		CONSTRAINT myEmployee_last_name_uq UNIQUE,
	user_id varchar(8),
	salary NUMBER(9, 2)	
);

--2
INSERT INTO MYEMPLOYEE
values(1, 'Ralph', 'Patel', 'rpatel', 895)

INSERT INTO MYEMPLOYEE
values(2, 'Betty', 'Dancs', 'bdancs', 860)

INSERT INTO MYEMPLOYEE
values(3, 'Ben', 'Biri', 'bbiri', 1100)

INSERT INTO MYEMPLOYEE
values(4, 'Chad', 'Newman', 'cnewman', 750)

INSERT INTO MYEMPLOYEE
values(5, 'Audrey', 'Ropeburn', 'aropebur', 1550)

--8 cambiare al 3 last name -> Drexel
UPDATE MYEMPLOYEE
SET LAST_NAME = 'Drexel'
WHERE EMPLOYEE_ID = 3;

--9 cambiare salario a 1000 per chi ha salario < 900
UPDATE MYEMPLOYEE
SET SALARY = 1000
WHERE SALARY < 900

--11 eliminare Betty Dancs
DELETE FROM MYEMPLOYEE
WHERE FIRST_NAME = 'Betty' AND LAST_NAME = 'Dancs';

COMMIT;

--16 cancella tutte le righe
DELETE from MYEMPLOYEE;

--18 rimetti le righe eliminate
ROLLBACK;

--2.2
CREATE TABLE Dept(
	id number(7, 0) 
	CONSTRAINT Dept_pk PRIMARY KEY,
	name varchar2(25)
);

CREATE TABLE Emp(
	id number(7, 0) 
		CONSTRAINT Emp_pk PRIMARY KEY,
	first_name varchar2(25)
		CONSTRAINT Emp_first_name_uq UNIQUE,
	last_name varchar2(25)
		CONSTRAINT Emp_last_name_uq UNIQUE,
	dept_id NUMBER(7)
		CONSTRAINT Emp_dept_id_fk 
		REFERENCES DEPT(id) ON DELETE CASCADE
);

ALTER TABLE EMP
ADD Commission NUMBER (2, 2);








