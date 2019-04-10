--hotels
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




--clients 
CREATE TABLE red_clients (
client_name varchar2(100) PRIMARY KEY,
email varchar2(50),
phone varchar2(25),
hotel_id NUMBER (6) CONSTRAINT red_clients_hotel_id_fk REFERENCES red_hotels(hotel_id)
);

--insert data in clients
INSERT INTO red_clients
VALUES ('Ryan Reynolds', 'r.reynols@icloud.com','3335566781', 121);

INSERT INTO red_clients
VALUES ('Brad Pitt', 'brangelina_no_more@outlook.com','3472625894', 121);

INSERT INTO red_clients
VALUES ('Luca Argentero', 'bigbrother3@gmail.com','3298765123', 122);

INSERT INTO red_clients
VALUES ('Gerry Scotti', 'g.scotti@gmail.com','3345632567', 122);

INSERT INTO red_clients
VALUES ('Raffaella Carrà', 'raffa.forever@gmail.com','3479067281', 125);

INSERT INTO red_clients
VALUES ('Julia Roberts', 'r.Julia@gmail.com','3365432178', 123);

INSERT INTO red_clients
VALUES ('Gianni Sperti', 'giannismile@gmail.com','3287623416', 124);

INSERT INTO red_clients
VALUES ('Angelina Jolie', 'angelina_alone@icloud.com','3298754231', 125);

INSERT INTO red_clients
VALUES ('Tina Cipollari', 'gemma.hate@gmail.com','3479865123', 124);

INSERT INTO red_clients
VALUES ('Ryan Gosling', 'dance.ryan@gmail.com','3362367154', 123);




--bookings
create table red_bookings (
booking_id number (6),
hotel_id number (6) CONSTRAINT red_bookings_hotel_id_fk REFERENCES red_hotels(hotel_id),
client_name varchar2(100) CONSTRAINT red_bookings_client_name_fk REFERENCES red_clients(client_name),
check_in date,
check_out date,
payment number (5, 2)
);

create sequence red_bookings_seq
start with 001 increment by 1;

--insert data in bookings
insert into red_bookings(booking_id, hotel_id, client_name, check_in, check_out, payment)
values (001, 121, 'Ryan Reynolds','10-APR-2019', '15-APR-2019', 80.50);

insert into red_bookings(booking_id, hotel_id, client_name, check_in, check_out, payment)
values (red_bookings_seq.nextval, 122, 'Brad Pitt', '06-MAR-2019', '08-MAR-2019', 100.70);

insert into red_bookings(booking_id, hotel_id, client_name, check_in, check_out, payment)
values (red_bookings_seq.nextval, 123, 'Luca Argentero', '11-AGO-2019','13-AGO-2019', 60.20);

insert into red_bookings(booking_id, hotel_id, client_name, check_in, check_out, payment)
values (red_bookings_seq.nextval, 124, 'Gerry Scotti','21-DIC-2019', '23-DIC-2019', 200.60);

insert into red_bookings(booking_id, hotel_id, client_name, check_in, check_out, payment)
values (red_bookings_seq.nextval, 125, 'Raffaella Carrà','25-AGO-2019', '28-AGO-2019', 120.60);

insert into red_bookings(booking_id, hotel_id, client_name, check_in, check_out, payment)
values (red_bookings_seq.nextval,121, 'Julia Roberts','23-GEN-2019', '25-GEN-2019', 60.80);

insert into red_bookings(booking_id, hotel_id, client_name, check_in, check_out, payment)
values (red_bookings_seq.nextval, 122, 'Gianni Sperti','19-FEB-2019', '22-FEB-2019', 124.60);

insert into red_bookings(booking_id, hotel_id, client_name, check_in, check_out, payment)
values (red_bookings_seq.nextval, 123, 'Angelina Jolie','12-LUG-2019','15-LUG-2019', 89.60);

insert into red_bookings(booking_id, hotel_id, client_name, check_in, check_out, payment)
values (red_bookings_seq.nextval, 123, 'Tina Cipollari','30-GEN-2019', '2-FEB-2019', 90.50);

insert into red_bookings(booking_id, hotel_id, client_name, check_in, check_out, payment)
values (red_bookings_seq.nextval, 125, 'Ryan Gosling','16-OTT-2019', '18-OTT-2019', 70.60);

