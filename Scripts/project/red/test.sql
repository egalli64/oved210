
--hotels

drop table red_hotels;

create table red_hotels (
hotel_id number (6) primary key,
hotel_name varchar2 (40),
city varchar2 (30),
room_counter number (6),
CONSTRAINT uq_hotel_name_City UNIQUE (hotel_name, city)
);

create sequence red_hotel_seq
start with 121 increment by 1;

drop sequence red_hotel_seq;

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




--clients 

drop table red_clients;

CREATE TABLE red_clients (
client_id number (6) PRIMARY KEY,
client_name varchar2(100),
email varchar2(50),
phone varchar2(25),
CONSTRAINT uc_email UNIQUE (email)
);

create sequence red_client_seq
start with 001 increment by 1;

DROP SEQUENCE red_client_seq;


--insert data in clients
INSERT INTO red_clients
VALUES (red_client_seq.nextval, 'Ryan Reynolds', 'r.reynols@icloud.com','3335566781');

INSERT INTO red_clients
VALUES (red_client_seq.nextval, 'Ryan Reynolds', 'r.reynols@icloud.com','3335566781');

INSERT INTO red_clients
VALUES (red_client_seq.nextval, 'Brad Pitt', 'brangelina_no_more@outlook.com','3472625894');

INSERT INTO red_clients
VALUES (red_client_seq.nextval, 'Luca Argentero', 'bigbrother3@gmail.com','3298765123');

INSERT INTO red_clients
VALUES (red_client_seq.nextval, 'Gerry Scotti', 'g.scotti@gmail.com','3345632567');

INSERT INTO red_clients
VALUES (red_client_seq.nextval, 'Raffaella Carrà', 'raffa.forever@gmail.com','3479067281');

INSERT INTO red_clients
VALUES (red_client_seq.nextval, 'Julia Roberts', 'r.Julia@gmail.com','3365432178');

INSERT INTO red_clients
VALUES (red_client_seq.nextval, 'Gianni Sperti', 'giannismile@gmail.com','3287623416');

INSERT INTO red_clients
VALUES (red_client_seq.nextval, 'Angelina Jolie', 'angelina_alone@icloud.com','3298754231');

INSERT INTO red_clients
VALUES (red_client_seq.nextval, 'Tina Cipollari', 'gemma.hate@gmail.com','3479865123');

INSERT INTO red_clients
VALUES (red_client_seq.nextval, 'Ryan Gosling', 'dance.ryan@gmail.com','3362367154');




--bookings
drop table red_bookings;

create table red_bookings (
booking_id number (6) PRIMARY key,
hotel_id number (6) CONSTRAINT red_bookings_hotel_id_fk REFERENCES red_hotels(hotel_id) ON DELETE CASCADE,
client_id number (6)CONSTRAINT red_bookings_client_id_fk  REFERENCES red_clients(client_id) ON DELETE CASCADE,
check_in date,
check_out date,
payment varchar (100)
);


create sequence red_bookings_seq
start with 001 increment by 1;



--insert data in bookings
insert into red_bookings(booking_id, hotel_id, client_id, check_in, check_out, payment)
values (red_bookings_seq.nextval, 121, 1,'10-APR-2019', '15-APR-2019', 'credit card');

insert into red_bookings(booking_id, hotel_id, client_id, check_in, check_out, payment)
values (red_bookings_seq.nextval, 122, 2, '06-MAR-2019', '08-MAR-2019', 'cash');

insert into red_bookings(booking_id, hotel_id, client_id, check_in, check_out, payment)
values (red_bookings_seq.nextval, 123, 3, '11-AGO-2019','13-AGO-2019', 'cash');

insert into red_bookings(booking_id, hotel_id, client_id, check_in, check_out, payment)
values (red_bookings_seq.nextval, 124, 4,'21-DIC-2019', '23-DIC-2019', 'paypal');

insert into red_bookings(booking_id, hotel_id, client_id, check_in, check_out, payment)
values (red_bookings_seq.nextval, 125, 5,'25-AGO-2019', '28-AGO-2019', 'credit card');

insert into red_bookings(booking_id, hotel_id, client_id, check_in, check_out, payment)
values (red_bookings_seq.nextval,121, 6,'23-GEN-2019', '25-GEN-2019', 'cash');

insert into red_bookings(booking_id, hotel_id, client_id, check_in, check_out, payment)
values (red_bookings_seq.nextval, 122, 7,'19-FEB-2019', '22-FEB-2019', 'cash');

insert into red_bookings(booking_id, hotel_id, client_id, check_in, check_out, payment)
values (red_bookings_seq.nextval, 123, 8,'12-LUG-2019','15-LUG-2019', 'paypal');

insert into red_bookings(booking_id, hotel_id, client_id, check_in, check_out, payment)
values (red_bookings_seq.nextval, 123, 9,'30-GEN-2019', '2-FEB-2019', 'cash');

insert into red_bookings(booking_id, hotel_id, client_id, check_in, check_out, payment)
values (red_bookings_seq.nextval, 125, 10,'16-OTT-2019', '18-OTT-2019', 'paypal');

SELECT c.CLIENT_NAME, b.check_in
FROM RED_CLIENTS c JOIN RED_BOOKINGS b
USING (CLIENT_ID);

