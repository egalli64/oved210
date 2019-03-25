-- CREATE TABLE

CREATE TABLE coders AS 
	SELECT employee_id AS coder_id, first_name, last_name, hire_date, salary
	FROM hr.employees
	WHERE department_id = 60;

CREATE TABLE simple(
	simple_id number(6, 0) PRIMARY KEY,
	status char, 
	name varchar2(20),
	coder_id NUMBER
);
--per modificare tabella
ALTER TABLE SIMPLE
ADD counter number(38, 0);

ALTER TABLE SIMPLE
DROP COLUMN counter;

SELECT table_name
FROM user_tables;

SELECT *
FROM simple;

ALTER TABLE SIMPLE
add CONSTRAINT simple_status_ck CHECK(status IN('A', 'B', 'X'));

ALTER TABLE SIMPLE
add CONSTRAINT simple_id_ck check(MOD(simple_id, 2)= 1);

ALTER TABLE SIMPLE
MODIFY name CONSTRAINT simple_name_nn NOT null;

INSERT INTO simple (simple_id, status, name, CODER_ID)
VALUES(11, 'Z', 'bad status', 1);

INSERT INTO simple (simple_id, status, name, CODER_ID)
VALUES(2, 'A', 'even id', 1);

INSERT INTO simple
VALUES(3, 'A', null, 1);

ALTER TABLE SIMPLE
DROP CONSTRAINT simple_name_nn;

ALTER TABLE CODERS
ADD CONSTRAINT coders_pk PRIMARY KEY(coder_id);

ALTER TABLE SIMPLE
DROP COLUMN coder_id;

ALTER TABLE SIMPLE
ADD CONSTRAINT simple_coder_id_fk
coder_id REFERENCES coders(coder_id);

--ADD TO coders
--id : 12, hire_date : today, salary:4000
INSERT INTO CODERS
values(12, 'Sara', 'Jones', SYSDATE, 4000);

SELECT*
FROM CODERS;

INSERT INTO SIMPLE
VALUES (1, 'A', 'first', 103);

INSERT INTO SIMPLE
VALUES (3, 'A', 'second', 105);

INSERT INTO SIMPLE
VALUES (5, 'A', 'missing', 42);

SELECT*
FROM SIMPLE;

DELETE FROM SIMPLE
WHERE SIMPLE_ID = 3;

ALTER TABLE SIMPLE
DROP COLUMN coder_id;

ALTER TABLE SIMPLE
ADD CONSTRAINT SIMPLE_coder_id_fk
coder_id REFERENCES CODERS(coder_id) ON DELETE CASCADE;

ALTER TABLE SIMPLE
ADD CONSTRAINT SIMPLE_coder_id_fk
coder_id REFERENCES CODERS(coder_id) ON DELETE SET null;

UPDATE SIMPLE
SET CODER_ID = 12;

DELETE FROM CODERS
WHERE CODER_ID = 12;

-- duplicated VALUES
INSERT INTO SIMPLE
VALUES (5, 'A', 'second', 105);

DELETE FROM SIMPLE
WHERE SIMPLE_ID = 5;

ALTER TABLE SIMPLE
ADD CONSTRAINT simple_name_uq UNIQUE (name);

ALTER TABLE CODERS
ADD CONSTRAINT coders_name_uq UNIQUE (first_name, last_name);

--this should fail
INSERT INTO CODERS
VALUES (212, 'Valli', 'Pataballa', SYSDATE, 4000);

SELECT table_name, CONSTRAINT_name, status
FROM user_constraints
WHERE table_name = 'SIMPLE';

DROP TABLE SIMPLE;

CREATE TABLE INFOS (
	INFO_id NUMBER (6, 0)
		CONSTRAINT INFOS_PK PRIMARY KEY
		CONSTRAINT INFOS_ID_CK CHECK(MOD(INFO_ID, 2) = 1),
	STATUS CHAR DEFAULT 'A'
		CONSTRAINT INFOS_STATUS_CK CHECK(STATUS IN ('A','B', 'X')),
	NAME VARCHAR2(20)
		CONSTRAINT INFOS_NAME_UQ UNIQUE,
	CODER_ID NUMBER
		CONSTRAINT INFOS_CODER_ID_FK
		REFERENCES CODERS(CODER_ID) ON DELETE CASCADE
);

INSERT INTO INFOS
VALUES (1, 'A', 'FIRST', 12);

INSERT INTO INFOS 
VALUES (3, DEFAULT, 'SECOND', 12);


INSERT INTO INFOS (INFO_ID, NAME, CODER_ID)
VALUES (5, 'THIRD', 12);

DELETE FROM CODERS
WHERE CODER_ID = 12;

--RENAME
RENAME INFOS TO MY_STATUES;

--COMMENTS
COMMENT ON TABLE MY_STATUES IS 'Some extra information on coders';

COMMENT ON column MY_STATUES.STATUS IS 'Status in the statues';

--!!!
truncate TABLE MY_STATUES;  -- NON SI PUò FARE IL ROLLBACK
DROP TABLE MY_STATUES;

--sequence

CREATE SEQUENCE my_seq;

SELECT*
FROM user_sequences;

SELECT my_seq.nextval
FROM dual;

ALTER SEQUENCE my_seq INCREMENT BY 2;

DROP SEQUENCE my_seq;

CREATE SEQUENCE my_seq
START WITH 201 INCREMENT BY 2;

INSERT INTO infos
VALUES (my_seq.nextval, DEFAULT, 'Sara', 103)

INSERT INTO infos
VALUES (my_seq.nextval, DEFAULT, 'Bill', 105)

CREATE OR REPLACE VIEW restricted_coders AS 
	SELECT CODER_ID, LAST_NAME, FIRST_NAME
	FROM CODERS 
	WITH READ ONLY;

SELECT*
FROM RESTRICTED_CODERS;

UPDATE RESTRICTED_CODERS
SET FIRST_NAME = 'Sara'
WHERE CODER_ID = 103;

DROP VIEW RESTRICTED_CODERS;

--ESERCIZIO 1

CREATE TABLE my_employee(
	id number(4) CONSTRAINT employees_pk PRIMARY KEY,
	status char, 
	last_name varchar2(25),
	first_name varchar2(25),
	userid varchar2(8),
	salary NUMBER (9, 2)
);

DROP TABLE MY_EMPLOYEE;

--ESERCIZIO 2
INSERT INTO MY_EMPLOYEE
	(ID, LAST_NAME, FIRST_NAME, USERID, SALARY)
VALUES (1, 'Patel', 'Ralph', 'rpatel', 895);

--ESERCIZIO 3
INSERT INTO MY_EMPLOYEE
	(ID, LAST_NAME, FIRST_NAME, USERID, SALARY)
VALUES (2, 'Dancs', 'Betty', 'bdancs', 860);

--ESERCIZIO 4
INSERT INTO MY_EMPLOYEE
	(ID, LAST_NAME, FIRST_NAME, USERID, SALARY)
VALUES (3, 'Biri', 'Ben', 'bbiri', 1100);

--ESERCIZIO 5
INSERT INTO MY_EMPLOYEE
	(ID, LAST_NAME, FIRST_NAME, USERID, SALARY)
VALUES (4, 'Newman', 'Chad', 'cnewman', 750);

--ESERCIZIO 6
INSERT INTO MY_EMPLOYEE
	(ID, LAST_NAME, FIRST_NAME, USERID, SALARY)
VALUES (5, 'Ropeburn', 'Audrey', 'aropebur', 1550);

--ESERCIZIO 7
UPDATE MY_EMPLOYEE
SET LAST_NAME = 'Drexel'
WHERE id = 3;

--ESERCIZIO 8 SALARY = 1000 FOR EACH SALARY < 900
UPDATE MY_EMPLOYEE
SET SALARY = 1000
WHERE SALARY < 900;

--ESERCIZIO 9 DELETE BETTY DANCS
DELETE FROM MY_EMPLOYEE
WHERE FIRST_NAME = 'Betty' and LAST_NAME = 'Dancs';

COMMIT;

--ESERCIZIO 10 DELETE ALL ROWS FROM TABLE
DELETE FROM MY_EMPLOYEE;

ROLLBACK;

--ESERCIZIO 11 
CREATE TABLE dept(
	id number(7) CONSTRAINT dept_pk PRIMARY KEY,
	name varchar2(25)
);

CREATE TABLE emp(
	id number(7) CONSTRAINT emp_pk PRIMARY KEY,
	first_name varchar2(25),
	last_name varchar2(25),
	dept_id NUMBER (7)
		CONSTRAINT emp_dept_id_fk 
		REFERENCES dept (id) ON DELETE CASCADE
);

--ESERCIZIO 12
ALTER TABLE EMP
ADD COMMISSION NUMBER (2, 2);

