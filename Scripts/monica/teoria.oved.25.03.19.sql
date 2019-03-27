--CREATE TABLE 

CREATE TABLE coders AS 
	SELECT employee_id AS coder_id, first_name, last_name, hire_date, salary
	FROM hr.employees
	WHERE department_id = 60;
	
CREATE TABLE simple(
	simple_id NUMBER (6, 0) PRIMARY KEY,    -- specifico il tipo di valore che voglio inserire
	status char, --rappresenta solo un carattere 
	name varchar2 (20), --rappresenta una stringa con max 20 caratteri
	coder_id NUMBER);

-- per vedere le tabelle che ho 

SELECT table_name
	FROM user_tables;

-- per vedere cosa ho dentro la tabella 

SELECT *
	FROM SIMPLE;

-- per aggiungere una colonna mancante

ALTER TABLE SIMPLE
ADD counter NUMBER(38,0)

--alter permette anche di modificare 

ALTER TABLE SIMPLE
ADD CONSTRAINT simple_status_ck CHECK (status IN ('A', 'B', 'X')); -- constraint serve per limitare il num.di dati presenti all'interno della colonna 

ALTER TABLE SIMPLE
DROP COLUMN counter

ALTER TABLE SIMPLE
ADD CONSTRAINT simple_id_ck CHECK (MOD(simple_id, 2)= 1); -- gli sto dicendo che i simple id sono tutti dispari

ALTER TABLE SIMPLE
MODIFY name CONSTRAINT simple_name_nn NOT NULL;   -- scrivo cosi per dire che la colonna non può contenere valori null


INSERT inTO simple(simple_id, status, name, coder_id)
	VALUES (2, 'A ', 'even id', 1);


INSERT INTO simple
	VALUES (3, 'A ', null, 1);
	
ALTER TABLE simple 
DROP CONSTRAINT simple_name_nn;

ALTER TABLE CODERS
ADD CONSTRAINT coders_pk PRIMARY KEY (coder_id);

ALTER TABLE SIMPLE
DROP COLUMN coder_id;
 

ALTER TABLE SIMPLE
ADD CONSTRAINT simple_coder_id_fk
coder_id REFERENCES coders (coder_id); 

--add to coders 
--id: 12, hire_date: today , salary: 4000

INSERT INTO CODERS
VALUES (12, 'Moia', 'Con', SYSDATE, 4000)

DELETE FROM CODERS
WHERE CODER_ID = 12

INSERT INTO SIMPLE
VALUES (1, 'A', 'first', 103)

INSERT INTO SIMPLE
VALUES (3, 'A', 'first', 105)


ALTER TABLE simple 
DROP COLUMN coder_id  -- cosi elimino da simple code id 


ALTER TABLE SIMPLE
ADD CONSTRAINT simple_coder_id_fk
coder_id REFERENCES CODERS (coder_id) ON DELETE SET null;


ALTER TABLE SIMPLE
ADD CONSTRAINT simple_coder_id_fk
coder_id REFERENCES CODERS (coder_id) ON DELETE CASCADE;

UPDATE SIMPLE
SET coder_id = 12


DELETE FROM coders 
WHERE coder_id = 12;

--duplicated values
INSERT INTO SIMPLE
VALUES (5, 'A', 'SECOND',105 )

DELETE FROM simple 
WHERE simple_id = 5 

ALTER TABLE SIMPLE
ADD CONSTRAINT simple_name_uq UNIQUE (name);

ALTER TABLE CODERS
ADD CONSTRAINT coders_name_uq UNIQUE (first_name, last_name);


INSERT INTO coders
VALUES (212, 'Valli', 'Pataballa', SYSDATE, 4000)

SELECT table_name, CONSTRAINT_name, status
FROM user_constraints
WHERE table_name = 'SIMPLE'


CREATE TABLE infos(
	infos_id number (6,0) 
	CONSTRAINT infos_pk PRIMARY KEY,
	CONSTRAINT infos_id_ck CHECK (MOD(infos_id, 2)= 1),  --unici valori possibili (dispari)
	status CHAR DEFAULT 'A' --deve essere A e se nessuno specifica potrebbe essere solo B e X
	CONSTRAINT infos_status_ck CHECK (status IN ('A', 'B', 'X')),
	name varchar2(20)
	CONSTRAINT infos_name_uq UNIQUE, 
	coder_id NUMBER
	CONSTRAINT infos_coder_id_fk
	REFERENCES CODERS (coder_id) ON DELETE CASCADE
);

--inseriamo elementi

INSERT INTO infos
VALUES (1, 'A', 'first', 12)

INSERT INTO infos
VALUES (3, default, 'second', 12)

INSERT INTO infos (infos_id, name, coder_id)
VALUES (5, 'third', 12)

DELETE FROM CODERS
WHERE coder_id = 12;

--rinominare
RENAME infos TO my_statuses

-- commentare

COMMENT ON TABLE my_statues IS ' some extra information on coders'

truncate TABLE my_statues -- elimina tutte le righe della tabella

DROP TABLE my_statues -- elimina tutta la tabella completamente

--
CREATE SEQUENCE my_seq

SELECT * FROM user_sequences

SELECT my_seq.nextval
FROM dual 

ALTER SEQUENCE my_seq INCREMENT BY 2;
 
DROP SEQUENCE my_seq;

CREATE SEQUENCE my_seq
START WITH 201 INCREMENT BY 2;

INSERT INTO infos
VALUES (my_seq.nextval, DEFAULT, 'Lom', 103)

INSERT INTO infos
VALUES (my_seq.nextval, DEFAULT, 'Will', 105)

DROP SEQUENCE my_seq;

--cosa sono le VIEW??

--dò un accesso ristretto alle tabelle

CREATE OR REPLACE VIEW restricted_coders AS 
	SELECT coder_id, first_name, LAST_name
	FROM coders 
	WITH READ ONLY;
	
SELECT *
FROM RESTRICTED_CODERS

UPDATE RESTRICTED_CODERS 
SET FIRST_name = 'Tom'
WHERE CODER_ID = 103

DROP VIEW RESTRICTED_CODERS