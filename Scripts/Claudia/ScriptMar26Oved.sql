--2.8 creare una tabella selezionata da una standard
CREATE TABLE Employees2 AS 
SELECT employee_id, first_name, last_name, salary, DEPARTMENT_ID
	FROM hr.employees

--2.9 modalità Reading ONLY
ALTER TABLE EMPLOYEES2 READ ONLY;

--2.10 eliminare tutte le righe (non è possibile eliminare se siamo in READ ONLY)
DELETE FROM EMPLOYEES2;

--2.11 uscire da modalità Reading
ALTER TABLE EMPLOYEES2 READ WRITE;

--eliminare righe e verifichiamo che non ci siano righe
truncate TABLE EMPLOYEES2;

SELECT count(rowid) FROM EMPLOYEES2;

--2.12 cancellare tutte le tabelle
DROP TABLE DEPT;
DROP TABLE EMP;
DROP TABLE EMPLOYEES2;
DROP TABLE CODERS;
DROP TABLE MY_STATUSES;
DROP TABLE MYEMPLOYEE;







