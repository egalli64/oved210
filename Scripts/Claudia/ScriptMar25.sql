--DML (Data Manipulation Language)
--INSERT, UPDATE, DELETE

SELECT *
FROM REGIONS;

INSERT INTO REGIONS(REGION_ID, REGION_NAME)
VALUES(11, 'Antartica');

INSERT INTO REGIONS(region_id)
VALUES(12);

INSERT INTO REGIONS(region_id, REGION_NAME)
VALUES(13, null);

--UPDATE (WHERE)
UPDATE REGIONS
SET REGION_NAME = 'Oceania'
WHERE REGION_ID = 12;

UPDATE REGIONS
SET REGION_NAME = 'Region ' || REGION_ID
WHERE REGION_ID > 10;

--DELETE (WHERE)
DELETE FROM REGIONS
WHERE REGION_ID > 10;

--COMMIT e ROLLBACK
INSERT INTO REGIONS(REGION_ID, REGION_NAME)
VALUES(11, 'Antartica');

ROLLBACK;

INSERT INTO REGIONS
VALUES(100, 'Oceania')
ROLLBACK;

INSERT INTO REGIONS
VALUES(101, 'Antartica')

SAVEPOINT sp1;

INSERT INTO REGIONS
VALUES(100, 'Oceania')

ROLLBACK TO sp1;

ROLLBACK;

--








