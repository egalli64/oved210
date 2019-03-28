
---TABLE

create table bookings (
booking_id number (12) primary key,
hotel_id number (6), -- constraint bookings_hotel_id_fk references hotels(hotel_id),
client_id number (4) constraint bookings_client_id_fk references clients(client_id),
availability date,
payment number (5, 2) 
);

DROP TABLE bookings;

-- SEQUENCE
create sequence booking_seq;

--INSERT
insert into bookings(booking_id, availability, payment)
values (004, '01-APR-2019', 70.50);

insert into bookings(booking_id, availability, payment)
values (001, '17-GIU-2019', 92.70);

insert into bookings(booking_id, availability, payment)
values (005, '14-AGO-2019', 135.20);

insert into bookings(booking_id, availability, payment)
values (002, '30-SET-2019', 99.10)

insert into bookings(booking_id, availability, payment)
values (003, '05-SET-2019', 81.68);

insert into bookings(booking_id, availability, payment)
values (006, '12-OTT-2019', 60.00);

insert into bookings(booking_id, availability, payment)
values (008, '01-MAR-2019', 70.50);

insert into bookings(booking_id, availability, payment)
values (011, '01-MAR-2019', 70.50);

insert into bookings(booking_id, availability, payment)
values (010, '01-MAR-2019', 70.50);

insert into bookings(booking_id, availability, payment)
values (009, '01-MAR-2019', 70.50);

insert into bookings(booking_id, availability, payment)
values (07, '01-MAR-2019', 70.50);

insert into bookings(booking_id, availability, payment)
values (012, '01-MAR-2019', 70.50);
