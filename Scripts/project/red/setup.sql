-- hotels

drop table red_hotels;

create table red_hotels (
hotel_id number (6) primary key,
hotel_name varchar2 (40),
city varchar2 (30),
room_counter number (6) 
);

create sequence red_hotel_seq
start with 121 increment by 1;

--insert data in hotels
insert into red_hotels (hotel_id, hotel_name, city, room_counter)
values(red_hotel_seq.nextval , 'Hotel Tulipano', 'Milano', 10);

insert into red_hotels (hotel_id, hotel_name, city, room_counter)
values(red_hotel_seq.nextval , 'Hotel Margherita', 'Roma', 10);

insert into red_hotels (hotel_id, hotel_name, city, room_counter)
values(red_hotel_seq.nextval , 'Hotel Girasole', 'Firenze', 7);

insert into red_hotels (hotel_id, hotel_name, city, room_counter)
values(red_hotel_seq.nextval , 'Hotel Giglio', 'Napoli', 5);

insert into red_hotels (hotel_id, hotel_name, city, room_counter)
values(red_hotel_seq.nextval , 'Hotel Orchidea', 'Venezia', 5);

-- clients 

DROP TABLE red_clients;

CREATE TABLE red_clients (
client_id NUMBER (4),
client_name varchar2(100),
email varchar2(50),
phone varchar2(25),
hotel_id NUMBER (6) 
);

create sequence red_clients_seq
start with 001 increment by 1;

DROP SEQUENCE red_clients_seq;

INSERT INTO red_clients
VALUES (red_clients_seq.nextval, 'Ryan Reynolds', 'r.reynols@icloud.com','3335566781', 1);

INSERT INTO red_clients
VALUES (red_clients_seq.nextval, 'Brad Pitt', 'brangelina_no_more@outlook.com','3472625894', 1);

INSERT INTO red_clients
VALUES (red_clients_seq.nextval, 'Luca Argentero', 'bigbrother3@gmail.com','3298765123', 2);

INSERT INTO red_clients
VALUES (red_clients_seq.nextval, 'Gerry Scotti', 'g.scotti@gmail.com','3345632567', 2);

INSERT INTO red_clients
VALUES (red_clients_seq.nextval, 'Raffaella Carrà', 'raffa.forever@gmail.com','3479067281', 5);

INSERT INTO red_clients
VALUES (red_clients_seq.nextval, 'Julia Roberts', 'r.Julia@gmail.com','3365432178', 3);

INSERT INTO red_clients
VALUES (red_clients_seq.nextval, 'Gianni Sperti', 'giannismile@gmail.com','3287623416', 4);

INSERT INTO red_clients
VALUES (red_clients_seq.nextval, 'Angelina Jolie', 'angelina_alone@icloud.com','3298754231', 5);

INSERT INTO red_clients
VALUES (red_clients_seq.nextval, 'Tina Cipollari', 'gemma.hate@gmail.com','3479865123', 4);

INSERT INTO red_clients
VALUES (red_clients_seq.nextval, 'Ryan Gosling', 'dance.ryan@gmail.com','3362367154', 3);

--bookings

drop table red_bookings;

create table red_bookings (
booking_id number (6) primary key,
hotel_id number (6),
client_id number (4),
check_in date,
payment number (5, 2)
);

create sequence red_bookings_seq
start with 001 increment by 1;

DROP SEQUENCE red_bookings_seq;

insert into red_bookings(booking_id, hotel_id, client_id, check_in, payment)
values (001, 121, 1,'10-APR-2019', 80.50);

insert into red_bookings(booking_id, hotel_id, client_id, check_in, payment)
values (red_bookings_seq.nextval, 122, 2, '06-MAR-2019', 100.70);

insert into red_bookings(booking_id, hotel_id, client_id, check_in, payment)
values (red_bookings_seq.nextval, 123, 3, '11-AGO-2019', 60.20);

insert into red_bookings(booking_id, hotel_id, client_id, check_in, payment)
values (red_bookings_seq.nextval, 124, 4,'21-DIC-2019', 200.60);

insert into red_bookings(booking_id, hotel_id, client_id, check_in, payment)
values (red_bookings_seq.nextval, 125, 5,'25-AGO-2019', 120.60);

insert into red_bookings(booking_id, hotel_id, client_id, check_in, payment)
values (red_bookings_seq.nextval,121, 6,'23-GEN-2019', 60.80);

insert into red_bookings(booking_id, hotel_id, client_id, check_in, payment)
values (red_bookings_seq.nextval, 122, 7,'19-FEB-2019', 124.60);

insert into red_bookings(booking_id, hotel_id, client_id, check_in, payment)
values (red_bookings_seq.nextval, 123, 8,'12-LUG-2019', 89.60);

insert into red_bookings(booking_id, hotel_id, client_id, check_in, payment)
values (red_bookings_seq.nextval, 123, 9,'30-GEN-2019', 90.50);

insert into red_bookings(booking_id, hotel_id, client_id, check_in, payment)
values (red_bookings_seq.nextval, 125, 10,'16-OTT-2019', 70.60);















