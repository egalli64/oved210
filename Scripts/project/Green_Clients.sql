CREATE TABLE clients (
client_id NUMBER(4) CONSTRAINT clients_pk PRIMARY KEY,
client_name varchar2(100),
email varchar2(50),
phone NUMBER(25),
hotel_id NUMBER(6)
);

DROP TABLE clients;



INSERT INTO CLIENTS
VALUES (1, 'Alan Rama', 'a.brie@gmail.com',3675626954, 121)

INSERT INTO CLIENTS
VALUES (2, 'Bill Clinton ', 'b.griffin@gmail.com',3475526924, 122)

INSERT INTO CLIENTS
VALUES (3, 'Steven King ', 'h.simpson@gmail.com',3275726254, 123)


INSERT INTO CLIENTS
VALUES (4, 'Neena Kochhar ', 'l.simpson@gmail.com',3285523253, 122)

INSERT INTO CLIENTS
VALUES (5, 'Lex	De Haa ', 'b.wayne@gmail.com',3376789251, 124)

INSERT INTO CLIENTS
VALUES (6, 'Alexander Hunold ', 'l.gaga@gmail.com',3345716852, 125)

INSERT INTO CLIENTS
VALUES (7, 'Bruce Ernst ', 'a.brie@gmail.com',3675626954, 121)

INSERT INTO CLIENTS
VALUES (8, 'David Austin ', 'b.griffin@gmail.com',3475526924, 122)

INSERT INTO CLIENTS
VALUES (9, 'Valli Pataballa ', 'h.simpson@gmail.com',3275726254, 123)


INSERT INTO CLIENTS
VALUES (10, 'Diana Lorentz ', 'l.simpson@gmail.com',3285523253, 122)

INSERT INTO CLIENTS
VALUES (11, 'Nancy Greenberg ', 'b.wayne@gmail.com',3376789251, 124)

INSERT INTO CLIENTS
VALUES (12, 'Daniel	Faviet ', 'l.gaga@gmail.com',3345716852, 125)