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
email varchar2(50),
phone number (25),
hotel_id number (6) 
);


insert into green_clients
values (green_clients_seq.nextval, 'alan brie', 'a.brie@gmail.com',3675626954, 1);

insert into green_clients
values (green_clients_seq.nextval, 'bill	clinton ', 'b.clinton@gmail.com',3475526924, 2);

insert into green_clients
values (green_clients_seq.nextval, 'steven	king ', 's.king@gmail.com',3275726254, 3);

insert into green_clients
values (green_clients_seq.nextval, 'neena	kochhar ', 'n.kochhar@gmail.com',3285523253, 11);

insert into green_clients
values (green_clients_seq.nextval, 'lex	de haan ', 'l.dehaan@gmail.com',3376789251, 4);

insert into green_clients
values (green_clients_seq.nextval, 'alexander	hunold ', 'a.hunold@gmail.com',3345716852, 5);

insert into green_clients
values (green_clients_seq.nextval, 'bruce	ernst ', 'b.ernst@gmail.com',3675626954, 6);

insert into green_clients
values (green_clients_seq.nextval, 'daniel	faviet  ', 'd.faviet@gmail.com',3475526924, 7);

insert into green_clients
values (green_clients_seq.nextval, 'valli	pataballa ', 'v.patabella@gmail.com',3275726254, 8);

insert into green_clients
values (green_clients_seq.nextval, 'diana	lorentz ', 'd.lorentz@gmail.com',3285523253, 9);

insert into green_clients
values (green_clients_seq.nextval, 'nancy	greenberg ', 'n.greenberg@gmail.com',3376789251, 10);



create table green_hotels (
hotel_id number (6) primary key,
hotel_name varchar2 (40),
city varchar2 (30),
room_counter number (6) 
);


insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'hotel tulipano', 'milano', 10);

insert into green_hotels(hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'hotel margherita', 'roma', 10);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'hotel girasole', 'firenze', 7);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'hotel giglio', 'napoli', 5);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'hotel orchidea', 'venezia', 5);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'hotel fresia', 'milano', 10);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'hotel imperial', 'roma', 10);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'hotel grisalide', 'firenze', 7);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'hotel rosa', 'napoli', 5);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'hotel violetta', 'venezia', 5);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'hotel xheko', 'roma', 10);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'hotel primula', 'firenze', 7);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'hotel pino', 'napoli', 5);

insert into green_hotels (hotel_id, hotel_name, city, room_counter)
values(green_hotels_seq.nextval , 'hotel stella', 'venezia', 5);


create table green_rooms (
hotel_id number (6) references green_hotels(hotel_id),
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
hotel_id number (6) references green_hotels(hotel_id),
client_id number (4) references green_clients(client_id),
availability date,
payment number (5, 2) 
);

--insert
insert into green_bookings(booking_id, client_id, hotel_id, availability, payment)
values (green_bookings_seq.nextval, 1, 1,'01-apr-2019', 70.50);

insert into green_bookings(booking_id, client_id, hotel_id, availability, payment)
values (green_bookings_seq.nextval, 2, 1, '17-giu-2019', 92.70);

insert into green_bookings(booking_id, client_id, hotel_id, availability, payment)
values (green_bookings_seq.nextval, 3, 2, '14-ago-2019', 135.20);

insert into green_bookings(booking_id, client_id, hotel_id, availability, payment)
values (green_bookings_seq.nextval, 4, 3, '30-set-2019', 99.10);

insert into green_bookings(booking_id, client_id, hotel_id, availability, payment)
values (green_bookings_seq.nextval, 5, 4, '05-set-2019', 81.68);

insert into green_bookings(booking_id, client_id, hotel_id, availability, payment)
values (green_bookings_seq.nextval, 6, 5, '12-ott-2019', 60.00);

insert into green_bookings(booking_id, client_id, hotel_id, availability, payment)
values (green_bookings_seq.nextval, 5, 6, '01-mar-2019', 70.50);

insert into green_bookings(booking_id, client_id, hotel_id, availability, payment)
values (green_bookings_seq.nextval, 4, 7, '01-mar-2019', 70.50);

insert into green_bookings(booking_id, client_id, hotel_id, availability, payment)
values (green_bookings_seq.nextval, 3, 8, '01-mar-2019', 70.50);

insert into green_bookings(booking_id, client_id, hotel_id, availability, payment)
values (green_bookings_seq.nextval, 2, 9, '01-mar-2019', 70.50);



