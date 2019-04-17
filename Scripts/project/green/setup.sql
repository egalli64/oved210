drop table GREEN_BOOKINGS;

drop table GREEN_CLIENTS;

drop table GREEN_ROOMS;

drop table GREEN_HOTELS;


DROP SEQUENCE green_clients_seq;

DROP SEQUENCE green_hotels_seq;

DROP SEQUENCE green_rooms_seq;

DROP SEQUENCE green_bookings_seq;


create sequence green_clients_seq
start with 1 increment by 1;

create sequence green_hotels_seq
start with 1 increment by 1;

create sequence green_rooms_seq
start with 1 increment by 1;

create sequence green_bookings_seq
start with 1 increment by 1;


create table green_clients (
client_id number (4) constraint green_clients_pk primary key,
client_name varchar2(100),
email varchar2(50) CONSTRAINT email UNIQUE,
phone number (25),
hotel_id number (6) 
);


insert into green_clients
values (green_clients_seq.nextval, 'Alan Brie', 'a.brie@gmail.com',3675626954, 1);

insert into green_clients
values (green_clients_seq.nextval, 'Bill Clinton ', 'b.clinton@gmail.com',3475526924, 2);

insert into green_clients
values (green_clients_seq.nextval, 'Steven	King ', 's.king@gmail.com',3275726254, 3);

insert into green_clients
values (green_clients_seq.nextval, 'Neena	Kochhar ', 'n.kochhar@gmail.com',3285523253, 11);

insert into green_clients
values (green_clients_seq.nextval, 'Lex	De Haan ', 'l.dehaan@gmail.com',3376789251, 4);

insert into green_clients
values (green_clients_seq.nextval, 'Alexander Hunold ', 'a.hunold@gmail.com',3345716852, 5);

insert into green_clients
values (green_clients_seq.nextval, 'Bruce	Ernst ', 'b.ernst@gmail.com',3675626954, 6);

insert into green_clients
values (green_clients_seq.nextval, 'Daniel	Faviet  ', 'd.faviet@gmail.com',3475526924, 7);

insert into green_clients
values (green_clients_seq.nextval, 'Valli	Pataballa ', 'v.patabella@gmail.com',3275726254, 8);

insert into green_clients
values (green_clients_seq.nextval, 'Diana	Lorentz ', 'd.lorentz@gmail.com',3285523253, 9);

insert into green_clients
values (green_clients_seq.nextval, 'Nancy	Greenberg ', 'n.greenberg@gmail.com',3376789251, 10);



create table green_hotels (
hotel_id number (6) primary key,
hotel_name varchar2 (40),
city varchar2 (30),
room_counter number (6) 
);


insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'Hotel Tulipano', 'Milano', 10);

insert into green_hotels(hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'Hotel Margherita', 'Roma', 10);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'Hotel Girasole', 'Firenze', 7);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'Hotel Giglio', 'Napoli', 5);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'Hotel Orchidea', 'Venezia', 5);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'Hotel Fresia', 'Milano', 10);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'Hotel Imperial', 'Roma', 10);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'Hotel Grisalide', 'Firenze', 7);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'Hotel Rosa', 'Napoli', 5);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'Hotel Violetta', 'Venezia', 5);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'Hotel Xheko', 'Roma', 10);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'Hotel Primula', 'Firenze', 7);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'Hotel Pino', 'Napoli', 5);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'Hotel Stella', 'Venezia', 5);


create table green_rooms (
hotel_id number (6) constraint green_rooms_fk references green_hotels(hotel_id) on delete cascade,
room_id number (6)
);


insert into green_rooms
values(1, green_rooms_seq.nextval);

insert into green_rooms
values(2, green_rooms_seq.nextval);

insert into green_rooms
values(3, green_rooms_seq.nextval);

insert into green_rooms
values(4, green_rooms_seq.nextval);

insert into green_rooms
values(5, green_rooms_seq.nextval);



create table green_bookings (
booking_id number (12) primary key,
hotel_id number (6) constraint green_bookings_hotel_id_fk references green_hotels(hotel_id) on delete cascade,
client_id number (4) constraint green_bookings_client_id_fk REFERENCES green_clients(client_id) on delete cascade,
check_in date,
check_out date,
payment varchar(50) 
);


insert into green_bookings(booking_id, client_id, hotel_id, check_in, check_out,payment)
values (green_bookings_seq.nextval, 1, 1,'07-gen-2019','10-gen-2019', 'Credit Card');

insert into green_bookings(booking_id, client_id, hotel_id, check_in, check_out, payment)
values (green_bookings_seq.nextval, 2, 1, '09-gen-2019','15-gen-2019', 'Debit Card');

insert into green_bookings(booking_id, client_id, hotel_id, check_in, check_out, payment)
values (green_bookings_seq.nextval, 3, 2, '04-feb-2019','15-feb-2019', 'Paypal');

insert into green_bookings(booking_id, client_id, hotel_id, check_in, check_out, payment)
values (green_bookings_seq.nextval, 4, 3, '15-mar-2019','20-mar-2019', 'Paypal');

insert into green_bookings(booking_id, client_id, hotel_id, check_in, check_out, payment)
values (green_bookings_seq.nextval, 5, 4, '25-apr-2019','30-apr-2019', 'Debit Card');

insert into green_bookings(booking_id, client_id, hotel_id, check_in, check_out, payment)
values (green_bookings_seq.nextval, 6, 5, '10-mag-2019','15-mag-2019', 'Credit Card');

insert into green_bookings(booking_id, client_id, hotel_id, check_in, check_out, payment)
values (green_bookings_seq.nextval, 5, 6, '09-giu-2019','15-giu-2019', 'Debit Card');

insert into green_bookings(booking_id, client_id, hotel_id, check_in, check_out, payment)
values (green_bookings_seq.nextval, 4, 7, '15-giu-2019','20-giu-2019', 'Credit Card');

insert into green_bookings(booking_id, client_id, hotel_id, check_in, check_out, payment)
values (green_bookings_seq.nextval, 3, 8, '16-giu-2019','18-giu-2019', 'Paypal');

insert into green_bookings(booking_id, client_id, hotel_id, check_in, check_out, payment)
values (green_bookings_seq.nextval, 2, 9, '27-lug-2019','30-lug-2019', 'Credit Card');



