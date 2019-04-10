create table Blue_hotels (
hotel_id number (6) primary key,
hotel_name varchar2 (40),
city varchar2 (30),
room_counter number (6) 
);


create table Blue_rooms (
hotel_id number (6) constraint hotels_hotel_id_fk references hotels(hotel_id),
room_id number (6)
);


create sequence Blue_hotels_seq
start with 1 increment by 1;

SELECT Blue_hotels_seq.nextval
FROM dual;

DROP SEQUENCE hotel_seq;

insert into Blue_hotels (hotel_id, hotel_name, city, room_counter)
values(1, 'Hotel Tulipano', 'Milano', 10);

insert into BLUE_HOTELS (hotel_id, hotel_name, city, room_counter)
values(Blue_hotels_seq.nextval , 'Hotel Margherita', 'Roma', 10);

insert into Blue_hotels (hotel_id, hotel_name, city, room_counter)
values(Blue_hotels_seq.nextval , 'Hotel Girasole', 'Firenze', 7);

insert into Blue_hotels (hotel_id, hotel_name, city, room_counter)
values(Blue_hotels_seq.nextval , 'Hotel Giglio', 'Napoli', 5);

insert into Blue_hotels (hotel_id, hotel_name, city, room_counter)
values(Blue_hotels_seq.nextval , 'Hotel Orchidea', 'Venezia', 5);


create sequence Blue_rooms_seq
start with 200 increment by 1;

DROP SEQUENCE rooms_seq;

SELECT Blue_rooms_seq.nextval
FROM dual;

insert into Blue_rooms
values(1, 200);

insert into Blue_rooms
values(2, Blue_rooms_seq.nextval);

insert into Blue_rooms
values(3, Blue_rooms_seq.nextval);

insert into Blue_rooms
values(4, Blue_rooms_seq.nextval);

insert into Blue_rooms
values(5, Blue_rooms_seq.nextval);


CREATE TABLE Blue_clients (
client_id NUMBER (4) CONSTRAINT Blue_clients_pk PRIMARY KEY,
client_Name varchar2(100),
email varchar2(50),
phone NUMBER (25),
hotel_id NUMBER (6) CONSTRAINT Blue_clients_hotel_id_fk REFERENCES Blue_hotels(hotel_id)
)

DROP TABLE clients;

CREATE SEQUENCE Blue_clients_seq;

SELECT Blue_clients_seq.nextval
FROM dual;
DROP SEQUENCE clients_seq

INSERT INTO Blue_clients
VALUES (1, 'Alan Brie', 'a.brie@gmail.com',3675626954, 1)

INSERT INTO Blue_clients
VALUES (Blue_clients_seq.nextval, 'Brian Griffin', 'b.griffin@gmail.com',3475526924, 2)

INSERT INTO Blue_clients
VALUES (Blue_clients_seq.nextval, 'Homer Simpson', 'h.simpson@gmail.com',3275726254, 3)


INSERT INTO Blue_clients
VALUES (Blue_clients_seq.nextval, 'Lisa Simpson', 'l.simpson@gmail.com',3285523253, 2)

INSERT INTO Blue_clients
VALUES (Blue_clients_seq.nextval, 'Bruce Wayne', 'b.wayne@gmail.com',3376789251, 4)

INSERT INTO Blue_clients
VALUES (Blue_clients_seq.nextval, 'Lady Gaga', 'l.gaga@gmail.com',3345716852, 5)

create table Blue_bookings (
booking_id number (12) primary key,
hotel_id number (6) constraint Blue_bookings_id_fk references Blue_hotels(hotel_id),
client_id number (4) constraint Blue_bookings_client_id_fk references Blue_clients(client_id),
availability date,
payment number (5, 2) 
);

create sequence Blue_bookings_seq
start with 1 increment by 1;

SELECT Blue_bookings_seq.nextval
FROM dual;

DROP SEQUENCE bookings_seq;

insert into Blue_bookings(booking_id, client_id, hotel_id, availability, payment)
values (1, 1, 1,'01-APR-2019', 70.50);

insert into Blue_bookings(booking_id, client_id, hotel_id, availability, payment)
values (Blue_bookings_seq.nextval, 2, 2, '17-GIU-2019', 92.70);

insert into Blue_bookings(booking_id, client_id, hotel_id, availability, payment)
values (Blue_bookings_seq.nextval, 3, 3, '14-AGO-2019', 135.20);

insert into Blue_bookings(booking_id, client_id, hotel_id, availability, payment)
values (Blue_bookings_seq.nextval, 4, 4, '30-SET-2019', 99.10)

insert into Blue_bookings(booking_id, client_id, hotel_id, availability, payment)
values (Blue_bookings_seq.nextval, 5, 5, '05-SET-2019', 81.68);

insert into Blue_bookings(booking_id, client_id, hotel_id, availability, payment)
values (Blue_bookings_seq.nextval, 6, 5, '12-OTT-2019', 60.00);

insert into Blue_bookings(booking_id, client_id, hotel_id, availability, payment)
values (Blue_bookings_seq.nextval, 5, 4, '01-MAR-2019', 70.50);

insert into Blue_bookings(booking_id, client_id, hotel_id, availability, payment)
values (Blue_bookings_seq.nextval, 4, 3, '01-MAR-2019', 70.50);

insert into Blue_bookings(booking_id, client_id, hotel_id, availability, payment)
values (Blue_bookings_seq.nextval, 3, 2, '01-MAR-2019', 70.50);

insert into Blue_bookings(booking_id, client_id, hotel_id, availability, payment)
values (Blue_bookings_seq.nextval, 2, 1, '01-MAR-2019', 70.50);

insert into Blue_bookings(booking_id, client_id, hotel_id, availability, payment)
values (Blue_bookings_seq.nextval, 1, 2, '01-MAR-2019', 70.50);

insert into Blue_bookings(booking_id, client_id, hotel_id, availability, payment)
values (Blue_bookings_seq.nextval, 6, 3, '01-MAR-2019', 70.50);
