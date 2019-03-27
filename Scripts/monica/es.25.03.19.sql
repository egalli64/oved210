

--per inserire una nuova regione quindi una riga della tabella

SELECT *
FROM REGIONS;

INSERT INTO regions (region_id, region_name)
VALUES (11, 'Antartica'); 

INSERT INTO regions (region_id)
values (12);

INSERT INTO regions (region_id, region_name)
VALUES (13, NULL); 

-- comando UPDATE (modifico una riga già esistente)

UPDATE REGIONS
SET region_name = 'Oceania'
WHERE REGION_ID = 12;

UPDATE REGIONS
SET region_name = 'Region' || REGION_ID --concatena la stringa region con la region_id cioe il numero
WHERE REGION_ID > 10;

--delete (where)
DELETE FROM REGIONS
WHERE REGION_ID > 10; -- cancella le righe che avevo creato in precedenza


--COMMIT AND ROLLBACK
 INSERT INTO REGIONS(region_id, region_name)
 VALUES (11, 'Antartica');
 
ROLLBACK;


-- sotto le prove delle funzioni
INSERT INTO REGIONS
VALUES (100, 'Oceania') 

UPDATE REGIONS
SET REGION_NAME = 'Polo' 
WHERE REGION_ID =100


DELETE FROM REGIONS
WHERE REGION_ID = 100

--
SELECT *
FROM REGIONS;

INSERT INTO regions (region_id, region_name)
VALUES (13, 'Antartica'); 

SAVEPOINT sp1;

INSERT INTO regions (region_id, region_name)
VALUES (14, 'Oceania');

ROLLBACK TO sp1;

ROLLBACK;

--




