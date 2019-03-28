-- setup Clients TABLE

--create table
CREATE TABLE clients (
id NUMBER (4) CONSTRAINT clients_pk PRIMARY key,
clientName varchar2(100),
email varchar2(50),
phone NUMBER (25),
hotel_id NUMBER (6));

--create sequence

CREATE SEQUENCE clients_seq

-- insert values

INSERT INTO CLIENTS
VALUES (01, 'Alan Brie', 'a.brie@gmail.com',3675626954,)
