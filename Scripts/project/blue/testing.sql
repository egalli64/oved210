drop sequence BLUE_HOTELS_SEQ;
drop sequence BLUE_CLIENTS_SEQ;
drop sequence BLUE_BOOKING_SEQ;

drop table BLUE_BOOKINGS;
drop table BLUE_HOTELS;
drop table BLUE_CLIENTS;


create table BLUE_HOTELS (
HOTEL_ID number (6) primary key,
HOTEL_NAME varchar2 (40),
CITY varchar2 (30),
ROOM_COUNTER number (6), 
constraint constr_hotel_name_city unique (HOTEL_NAME, CITY)
);

select * 
from BLUE_HOTELS
order by HOTEL_ID;

create sequence BLUE_HOTELS_SEQ
start with 1 increment by 1;

insert into BLUE_HOTELS (HOTEL_ID, HOTEL_NAME, CITY, ROOM_COUNTER)
values(BLUE_HOTELS_SEQ.NEXTVAL, 'Hotel Tulipano', 'Milano', 10);

insert into BLUE_HOTELS (HOTEL_ID, HOTEL_NAME, CITY, ROOM_COUNTER)
values(BLUE_HOTELS_SEQ.NEXTVAL , 'Hotel Margherita', 'Roma', 10);

insert into BLUE_HOTELS (HOTEL_ID, HOTEL_NAME, CITY, ROOM_COUNTER)
values(BLUE_HOTELS_SEQ.NEXTVAL , 'Hotel Girasole', 'Firenze', 7);

insert into BLUE_HOTELS (HOTEL_ID, HOTEL_NAME, CITY, ROOM_COUNTER)
values(BLUE_HOTELS_SEQ.NEXTVAL , 'Hotel Giglio', 'Napoli', 5);

insert into BLUE_HOTELS (HOTEL_ID, HOTEL_NAME, CITY, ROOM_COUNTER)
values(BLUE_HOTELS_SEQ.NEXTVAL , 'Hotel Orchidea', 'Venezia', 5);

--drop table BLUE_ROOMS;
--create table BLUE_ROOMS (
--HOTEL_ID number (6)  primary key references BLUE_HOTELS(HOTEL_ID),
--ROOM_ID number (6)
--);
--drop sequence BLUE_ROOMS_SEQ;

--create sequence BLUE_ROOMS_SEQ
--start with 200 increment by 1;

--insert into BLUE_ROOMS
--values(100, 200);

--insert into BLUE_ROOMS
--values(101, BLUE_ROOMS_SEQ.NEXTVAL);

--insert into BLUE_ROOMS
--values(102, BLUE_ROOMS_SEQ.NEXTVAL);

--insert into BLUE_ROOMS
--values(103, BLUE_ROOMS_SEQ.NEXTVAL);

--insert into BLUE_ROOMS
--values(104, BLUE_ROOMS_SEQ.NEXTVAL);

create table BLUE_CLIENTS (
CLIENT_ID number (4) primary key,
CLIENT_NAME varchar2(100),
EMAIL varchar2(50) unique,
PHONE number (25));

select * 
from BLUE_CLIENTS
order by CLIENT_ID;

create sequence BLUE_CLIENTS_SEQ
start with 1 increment by 1;

insert into BLUE_CLIENTS
values (BLUE_CLIENTS_SEQ.NEXTVAL, 'Alan Brie', 'a.brie@gmail.com',3675626954);

insert into BLUE_CLIENTS
values (BLUE_CLIENTS_SEQ.NEXTVAL, 'Brian Griffin', 'b.griffin@gmail.com',3475526924);

insert into BLUE_CLIENTS
values (BLUE_CLIENTS_SEQ.NEXTVAL, 'Homer Simpson', 'h.simpson@gmail.com',3275726254);

insert into BLUE_CLIENTS
values (BLUE_CLIENTS_SEQ.NEXTVAL, 'Lisa Simpson', 'l.simpson@gmail.com',3285523253);

insert into BLUE_CLIENTS
values (BLUE_CLIENTS_SEQ.NEXTVAL, 'Bruce Wayne', 'b.wayne@gmail.com',3376789251);

insert into BLUE_CLIENTS
values (BLUE_CLIENTS_SEQ.NEXTVAL, 'Lady Gaga', 'l.gaga@gmail.com',3345716852);

create table BLUE_BOOKINGS (
BOOKING_ID number (12) primary key,
HOTEL_ID number (6) constraint BLUE_BOOKINGS_ID_FK references BLUE_HOTELS(HOTEL_ID) ON DELETE CASCADE,
CLIENT_ID number (4) constraint BLUE_BOOKING_ID_FK references BLUE_CLIENTS(CLIENT_ID) ON DELETE CASCADE,
CHECK_IN date,
CHECK_OUT date,
ROOMS number (2) 
);

select * 
from BLUE_BOOKINGS
order by BOOKING_ID;

create sequence BLUE_BOOKING_SEQ
start with 1 increment by 1;

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, CHECK_IN, CHECK_OUT, ROOMS)
values (BLUE_BOOKING_SEQ.NEXTVAL, 1, 1,'01-APR-2019','03-APR-2019', 1);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, CHECK_IN, CHECK_OUT, ROOMS)
values (BLUE_BOOKING_SEQ.NEXTVAL, 2, 1, '14-AGO-2019','17-AGO-2019', 2);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, CHECK_IN, CHECK_OUT, ROOMS)
values (BLUE_BOOKING_SEQ.NEXTVAL, 3, 2, '30-SET-2019', '01-OTT-2019', 3);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, CHECK_IN, CHECK_OUT, ROOMS)
values (BLUE_BOOKING_SEQ.NEXTVAL, 4, 3, '05-SET-2019', '07-SET-2019', 2);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, CHECK_IN, CHECK_OUT, ROOMS)
values (BLUE_BOOKING_SEQ.NEXTVAL, 5, 1, '12-OTT-2019','21-OTT-2019', 1);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, CHECK_IN, CHECK_OUT, ROOMS)
values (BLUE_BOOKING_SEQ.NEXTVAL, 3, 2, '01-APR-2019','04-APR-2019', 1);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, CHECK_IN, CHECK_OUT, ROOMS)
values (BLUE_BOOKING_SEQ.NEXTVAL, 1, 4, '01-MAR-2019', '06-MAR-2019', 2);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, CHECK_IN, CHECK_OUT, ROOMS)
values (BLUE_BOOKING_SEQ.NEXTVAL, 2, 1, '02-MAR-2019','10-MAR-2019', 2);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, CHECK_IN, CHECK_OUT, ROOMS)
values (BLUE_BOOKING_SEQ.NEXTVAL, 3, 2, '01-MAR-2019', '05-MAR-2019', 1);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, CHECK_IN, CHECK_OUT, ROOMS)
values (BLUE_BOOKING_SEQ.NEXTVAL, 4, 3, '01-MAR-2019','03-MAR-2019', 1);

--ALTER TABLE BLUE_BOOKINGS
--ADD constraint BLUE_BOOKING_ID_FK
--FOREIGN key (client_id)
--REFERENCES BLUE_CLIENTS(client_id)
--ON DELETE CASCADE;
