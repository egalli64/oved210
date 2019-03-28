-- CREATE TABLE

CREATE TABLE coders as
   SELECT EMPLOYEE_ID AS coder_id, FIRST_NAME, LAST_NAME, HIRE_DATE,SALARY
   FROM hr.employees
   WHERE DEPARTMENT_ID = 60;
   
  CREATE TABLE simple (
  simple_id NUMBER(6, 0) PRIMARY KEY,
  status char,
  name varchar2(20),
  coder_id NUMBER
  );
 
 ALTER TABLE simple
 ADD counter NUMBER(38, 0);


ALTER TABLE SIMPLE
DROP COLUMN counter;
  
 SELECT table_name
 FROM user_tables;
 
SELECT*
FROM simple;
 

ALTER TABLE SIMPLE
ADD CONSTRAINT simple_status_ck check(status IN('A', 'B', 'X'));


ALTER TABLE SIMPLE
ADD CONSTRAINT simple_id_ck CHECK(MOD(simple_id,2) = 1);

ALTER TABLE SIMPLE
MODIFY name CONSTRAINT simple_name_nn NOT NULL;

INSERT INTO SIMPLE(simple_id, status, name, coder_id)
VALUES(2, 'A', 'even id', 1);


INSERT INTO SIMPLE
VALUES(3, 'A', null, 1);

ALTER TABLE SIMPLE
DROP CONSTRAINT simple_name_nn;

ALTER TABLE CODERS 
ADD CONSTRAINT coders_pk PRIMARY KEY(coder_id);

ALTER TABLE CODERS
ADD CONSTRAINT simple_coder_id_pk 
coder_id REFERENCES coders(coder_id);

ALTER TABLE SIMPLE
DROP COLUMN coder_id;

ALTER TABLE SIMPLE
ADD CONSTRAINT simple_coder_id_fk
coder_id REFERENCES coders(coder_id) ON DELETE CASCADE;

ALTER TABLE SIMPLE
ADD CONSTRAINT simple_coder_id_fk
coder_id REFERENCES coders(coder_id) ON DELETE SET NULL;
--warning
UPDATE SIMPLE
SET coder_id = 12;

-- ADD TO coders
-- id: 12, hire_date: today, salary: 4000
INSERT INTO CODERS
values(12, 'Tom', 'Jones', SYSDATE, 4000);

SELECT*
FROM CODERS;

INSERT INTO SIMPLE
VALUES(1, 'A', 'first', 103);

INSERT INTO SIMPLE
VALUES(3, 'A', 'second', 105);

INSERT INTO SIMPLE
VALUES(5, 'A', 'missing', 42);

DELETE FROM CODERS
WHERE coder_id = 12;

SELECT*
FROM SIMPLE;

DELETE FROM SIMPLE
WHERE SIMPLE_ID = 5;

--duplicated values
INSERT INTO SIMPLE
VALUES(5, 'A', 'second', 105);

DELETE FROM SIMPLE
WHERE SIMPLE_ID = 5;

ALTER TABLE  simple
ADD CONSTRAINT simple_name_uq UNIQUE(first_name, last_name);

-- this shoud fail
INSERT TO coders
VALUES(212, 'Valli', 'Pataballa', SYSDATE, 4000);

SELECT table_name, constraint_name, status
FROM user_constraints
WHERE table_name = 'SIMPLE';

DROP TABLE simple;


CREATE TABLE INFOS (
  info_id NUMBER(6, 0) 
  CONSTRAINT infos_pk PRIMARY KEY 
  CONSTRAINT infos_id_ck CHECK (MOD (info_id, 2) = 1),
  status char DEFAULT 'A'
  CONSTRAINT infos_status_ck CHECK (status IN ('A', 'B', 'X')),
  name varchar2(20)
  CONSTRAINT infos_name_uq unique,
  coder_id NUMBER
  CONSTRAINT infos_coder_id_fk
  REFERENCES coders(coder_id) ON DELETE cascade
  );
 
 --DROP TABLE infos;
 
  INSERT INTO INFOS
 values(1, 'A', 'first',12);
 
 INSERT INTO INFOS(info_id, name, CODER_ID)
 values(5,'third', 12);
 
DELETE FROM CODERS
WHERE CODER_ID = 12;

--rename(rinominare)
RENAME infos TO my_statuses;

--comments
COMMENT ON TABLE my_statuses IS 'Some extra information on coders';

COMMENT ON COLUMN MY_STATUSES.STATUS IS 'Status in the statuses';

TRUNCATE TABLE MY_STATUSES; --elimina ma resta la struttura della tabella
DROP TABLE MY_STATUSES; --elimina completamente la tabella


--sequence
--grant create sequence to oved;

CREATE SEQUENCE my_seq;

SELECT * FROM user_sequences;

SELECT my_seq.nextval
FROM dual;

ALTER SEQUENCE my_seq INCREMENT BY 2;

DROP SEQUENCE my_seq;


CREATE SEQUENCE my_seq
START WITH 201 INCREMENT BY 2;

INSERT INTO MY_STATUSES
VALUES(my_seq.nextval, DEFAULT, 'Tom', 103)

INSERT INTO MY_STATUSES
VALUES(my_seq.nextval, DEFAULT, 'Bill', 105)

CREATE OR REPLACE VIEW restricted_coders AS 
SELECT CODER_ID, FIRST_NAME, LAST_NAME
FROM CODERS
WITH READ ONLY;

SELECT *
FROM restricted_coders;

UPDATE restricted_coders
SET first_name = 'Tom'
WHERE coder_id = 103;

DROP VIEW restricted-coders;








--ESERCIZI
CREATE TABLE employees (
  id NUMBER(4, 0) CONSTRAINT employees_pk PRIMARY KEY,
  last_name varchar2(25),
  first_name varchar2(25),
  userid varchar(8),
  salary number(9, 2)
  );
 
-- DROP TABLE employees;

 --2 esercizio
 
 INSERT INTO EMPLOYEES
 VALUES (1, 'Patel', 'Ralph', 'rpatel', 895);

--2 dancs Betty bdancs 860
INSERT INTO EMPLOYEES 
  (id, LAST_NAME, FIRST_NAME, USERID, SALARY)
VALUES (2, 'Dancs', 'Betty', 'bdancs', 860);

--3 Biri ben bbiri 1100
--4 newman Chad cnewman 750
--5 Ropeburn Audrey aropebur 1550

--3
INSERT INTO EMPLOYEES
 VALUES (3, 'Biri', 'Ben', 'bbiri', 1100);

--4
INSERT INTO EMPLOYEES
 VALUES (4, 'Newman', 'Chad', 'cnewman', 750);

--5
INSERT INTO EMPLOYEES
 VALUES (5, 'Ropeburn', 'Audrey', 'aropebur', 1550);

--8.3 last name -> Drexel
UPDATE EMPLOYEES
SET first_name = 'Drexel'
WHERE id = 3;

--9. salary = 1000 for each having salary<900
UPDATE EMPLOYEES
SET SALARY = 1000
WHERE SALARY < 900;

--11 delete Betty Dancs
DELETE FROM EMPLOYEES
WHERE FIRST_NAME = 'Betty' AND LAST_NAME = 'Dancs';

COMMIT;

-- delete all rows
DELETE FROM EMPLOYEES;

ROLLBACK;


CREATE TABLE dept (
  id NUMBER(7, 0) CONSTRAINT dept_pk PRIMARY KEY,
  name varchar2(25)
 );

CREATE TABLE emp (
  id NUMBER(7, 0) CONSTRAINT emp_pk PRIMARY KEY,
  last_name varchar2(25),
  first_name varchar2(25),
  dept_id NUMBER (7)
  CONSTRAINT emp_dept_id_fk REFERENCES dept(id)
 );


ALTER TABLE emp ADD commission NUMBER(2,2);






 



