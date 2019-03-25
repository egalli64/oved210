-- DML (Data Manipulation Language)
-- INSERT, UPDATE, DELETE

SELECT *
FROM REGIONS;
--creare nuova riga
INSERT INTO REGIONS(REGION_ID, REGION_NAME)
VALUES(11, 'Antartica');

INSERT INTO REGIONS(region_id)
values(12);

INSERT INTO regions(region_id, REGION_NAME)
values(13, null);

--UPDATE : permette di modificare una riga già esistente 
UPDATE regions 
SET region_name = 'Oceania'
WHERE region_id = 12;

UPDATE REGIONS
SET region_name = 'Region' || REGION_ID
WHERE REGION_ID > 10;

-- DELETE (where)
DELETE FROM REGIONS
WHERE REGION_ID > 10;

DELETE FROM REGIONS

--commit and rollback
INSERT INTO REGIONS(REGION_ID, REGION_NAME)
VALUES(13, 'Antartica');

SAVEPOINT sp1;

INSERT INTO REGIONS(REGION_ID, REGION_NAME)
VALUES(14, 'Oceania');

ROLLBACK TO sp1;

ROLLBACK;