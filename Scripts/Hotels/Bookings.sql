
---TABLE
DROP TABLE bookings;

create table bookings (
booking_id number (12) primary key,
hotel_id number (6) constraint bookings_hotel_id_fk references hotels(hotel_id),
client_id number (4) constraint bookings_client_id_fk references clients(client_id),
availability date,
payment number (5, 2) 
);

-- SEQUENCE
drop sequence bookings_seq;
create sequence bookings_seq;

start with 001 increment by 1;

--INSERT
insert into bookings(booking_id, client_id, hotel_id, availability, payment)
values (001, 1, 121,'01-APR-2019', 70.50);

insert into bookings(booking_id, client_id, hotel_id, availability, payment)
values (bookings_seq.nextval, 2, 122, '17-GIU-2019', 92.70);

insert into bookings(booking_id, client_id, hotel_id, availability, payment)
values (bookings_seq.nextval, 3, 123, '14-AGO-2019', 135.20);

insert into bookings(booking_id, client_id, hotel_id, availability, payment)
values (bookings_seq.nextval, 4, 124, '30-SET-2019', 99.10)

insert into bookings(booking_id, client_id, hotel_id, availability, payment)
values (bookings_seq.nextval, 5, 125, '05-SET-2019', 81.68);

insert into bookings(booking_id, client_id, hotel_id, availability, payment)
values (bookings_seq.nextval, 6, 125, '12-OTT-2019', 60.00);

insert into bookings(booking_id, client_id, hotel_id, availability, payment)
values (bookings_seq.nextval, 5, 124, '01-MAR-2019', 70.50);

insert into bookings(booking_id, client_id, hotel_id, availability, payment)
values (bookings_seq.nextval, 4, 123, '01-MAR-2019', 70.50);

insert into bookings(booking_id, client_id, hotel_id, availability, payment)
values (bookings_seq.nextval, 3, 122, '01-MAR-2019', 70.50);

insert into bookings(booking_id, client_id, hotel_id, availability, payment)
values (bookings_seq.nextval, 2, 121, '01-MAR-2019', 70.50);

insert into bookings(booking_id, client_id, hotel_id, availability, payment)
values (bookings_seq.nextval, 1, 122, '01-MAR-2019', 70.50);

insert into bookings(booking_id, client_id, hotel_id, availability, payment)
values (bookings_seq.nextval, 6, 123, '01-MAR-2019', 70.50);
