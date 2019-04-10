create table BLUE_HOTELS (
HOTEL_ID number (6) primary key,
HOTEL_NAME varchar2 (40),
CITY varchar2 (30),
ROOM_COUNTER number (6) 
);


create table BLUE_ROOMS (
HOTEL_ID number (6) references BLUE_HOTELS(HOTEL_ID),
ROOM_ID number (6)
);


create sequence BLUE_HOTELS_SEQ
start with 1 increment by 1;


	
insert into BLUE_HOTELS (HOTEL_ID, HOTEL_NAME, CITY, ROOM_COUNTER)
values(1, 'Hotel Tulipano', 'Milano', 10);

insert into BLUE_HOTELS (HOTEL_ID, HOTEL_NAME, CITY, ROOM_COUNTER)
values(BLUE_HOTELS_SEQ.NEXTVAL , 'Hotel Margherita', 'Roma', 10);

insert into BLUE_HOTELS (HOTEL_ID, HOTEL_NAME, CITY, ROOM_COUNTER)
values(BLUE_HOTELS_SEQ.NEXTVAL , 'Hotel Girasole', 'Firenze', 7);

insert into BLUE_HOTELS (HOTEL_ID, HOTEL_NAME, CITY, ROOM_COUNTER)
values(BLUE_HOTELS_SEQ.NEXTVAL , 'Hotel Giglio', 'Napoli', 5);

insert into BLUE_HOTELS (HOTEL_ID, HOTEL_NAME, CITY, ROOM_COUNTER)
values(BLUE_HOTELS_SEQ.NEXTVAL , 'Hotel Orchidea', 'Venezia', 5);


create sequence BLUE_HOTELS_SEQ
start with 200 increment by 1;

insert into BLUE_ROOMS
values(1, 200);

insert into BLUE_ROOMS
values(2, BLUE_HOTELS_SEQ.NEXTVAL);

insert into BLUE_ROOMS
values(3, BLUE_HOTELS_SEQ.NEXTVAL);

insert into BLUE_ROOMS
values(4, BLUE_HOTELS_SEQ.NEXTVAL);

insert into BLUE_ROOMS
values(5, BLUE_HOTELS_SEQ.NEXTVAL);


create table BLUE_CLIENTS (
CLIENT_ID number (4) constraint BLUE_CLIENTS_PK primary key,
CLIENT_NAME varchar2(100),
EMAIL varchar2(50),
PHONE number (25))

--DROP table clients;

create sequence BLUE_HOTELS_SEQ;

select BLUE_HOTELS_SEQ.NEXTVAL
from dual;
--DROP sequence clients_seq

insert into BLUE_CLIENTS
values (1, 'Alan Brie', 'a.brie@gmail.com',3675626954)

insert into BLUE_CLIENTS
values (BLUE_HOTELS_SEQ.NEXTVAL, 'Brian Griffin', 'b.griffin@gmail.com',3475526924)

insert into BLUE_CLIENTS
values (BLUE_HOTELS_SEQ.NEXTVAL, 'Homer Simpson', 'h.simpson@gmail.com',3275726254)


insert into BLUE_CLIENTS
values (BLUE_HOTELS_SEQ.NEXTVAL, 'Lisa Simpson', 'l.simpson@gmail.com',3285523253)

insert into BLUE_CLIENTS
values (BLUE_HOTELS_SEQ.NEXTVAL, 'Bruce Wayne', 'b.wayne@gmail.com',3376789251)

insert into BLUE_CLIENTS
values (BLUE_HOTELS_SEQ.NEXTVAL, 'Lady Gaga', 'l.gaga@gmail.com',3345716852)

create table BLUE_BOOKINGS (
BOOKING_ID number (12) primary key,
HOTEL_ID number (6) constraint BLUE_BOOKINGS_ID_FK references BLUE_HOTELS(HOTEL_ID),
CLIENT_ID number (4) references BLUE_CLIENTS(CLIENT_ID),
AVAILABILITY date,
PAYMENT number (5, 2) 
);
--DROP table BLUE_BOOKINGS;
create sequence BLUE_BOOKING_SEQ
start with 1 increment by 1;

select BLUE_BOOKING_SEQ.NEXTVAL
from dual;

--DROP sequence BLUE_BOOKING_SEQ;

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, AVAILABILITY, PAYMENT)
values (1, 1, 1,'01-APR-2019', 70.50);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, AVAILABILITY, PAYMENT)
values (BLUE_BOOKING_SEQ.NEXTVAL, 3, 3, '14-AGO-2019', 135.20);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, AVAILABILITY, PAYMENT)
values (BLUE_BOOKING_SEQ.NEXTVAL, 4, 4, '30-SET-2019', 99.10)

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, AVAILABILITY, PAYMENT)
values (BLUE_BOOKING_SEQ.NEXTVAL, 5, 5, '05-SET-2019', 81.68);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, AVAILABILITY, PAYMENT)
values (BLUE_BOOKING_SEQ.NEXTVAL, 6, 5, '12-OTT-2019', 60.00);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, AVAILABILITY, PAYMENT)
values (BLUE_BOOKING_SEQ.NEXTVAL, 5, 4, '01-MAR-2019', 70.50);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, AVAILABILITY, PAYMENT)
values (BLUE_BOOKING_SEQ.NEXTVAL, 4, 3, '01-MAR-2019', 70.50);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, AVAILABILITY, PAYMENT)
values (BLUE_BOOKING_SEQ.NEXTVAL, 3, 2, '01-MAR-2019', 70.50);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, AVAILABILITY, PAYMENT)
values (BLUE_BOOKING_SEQ.NEXTVAL, 1, 2, '01-MAR-2019', 70.50);

insert into BLUE_BOOKINGS(BOOKING_ID, CLIENT_ID, HOTEL_ID, AVAILABILITY, PAYMENT)
values (BLUE_BOOKING_SEQ.NEXTVAL, 6, 3, '01-MAR-2019', 70.50);
