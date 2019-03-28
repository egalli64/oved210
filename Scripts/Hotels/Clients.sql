-- setup Clients TABLE

--create table
CREATE TABLE clients (
id NUMBER (4) CONSTRAINT clients_pk PRIMARY KEY,
clientName varchar2(100),
email varchar2(50),
phone NUMBER (25),
hotel_id NUMBER (6));

DROP TABLE clients;
--create sequence

CREATE SEQUENCE clients_seq
DROP SEQUENCE clients_seq;


SELECT clients_seq.nextval
FROM dual;


-- insert values

INSERT INTO CLIENTS
VALUES (1, 'Alan Brie', 'a.brie@gmail.com',3675626954, 121)

INSERT INTO CLIENTS
VALUES (clients_seq.nextval, 'Brian Griffin', 'b.griffin@gmail.com',3475526924, 122)

INSERT INTO CLIENTS
VALUES (clients_seq.nextval, 'Homer Simpson', 'h.simpson@gmail.com',3275726254, 123)


INSERT INTO CLIENTS
VALUES (clients_seq.nextval, 'Lisa Simpson', 'l.simpson@gmail.com',3285523253, 122)

INSERT INTO CLIENTS
VALUES (clients_seq.nextval, 'Bruce Wayne', 'b.wayne@gmail.com',3376789251, 124)

INSERT INTO CLIENTS
VALUES (clients_seq.nextval, 'Lady Gaga', 'l.gaga@gmail.com',3345716852, 125)