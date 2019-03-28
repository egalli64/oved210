
---TABLE

create table bookings (
booking_id number (12) primary key,
hotel_id number (6) constraint hotels_hotel_id_fk references hotels(hotel_id),
client_id number (4) constraint clients_client_id_fk references clients(client_id),
availability date,
payment number (4, 2)
);


-- SEQUENCE
create sequence booking_seq;

--INSERT
insert into bookings(booking_id, availability, payment)
values (004, '01-APR-2019', 70,50);

insert into bookings(booking_id, availability, payment)
values (001, '17-GIU-2019', 92,70);

insert into bookings(booking_id, availability, payment)
values (004, '14-AGO-2019', 135,00);

insert into bookings(booking_id, availability, payment)
values (002, '30-SET-2019', 100,10);

insert into bookings(booking_id, availability, payment)
values (003, '05-SET-2019', 81,68);

insert into bookings(booking_id, availability, payment)
values (004, '12-OTT-2019', 60,00);

insert into bookings(booking_id, availability, payment)
values (003, '01-MAR-2019', 70,50);

insert into bookings(booking_id, availability, payment)
values (001, '01-MAR-2019', 70,50);

insert into bookings(booking_id, availability, payment)
values (002, '01-MAR-2019', 70,50);

insert into bookings(booking_id, availability, payment)
values (002, '01-MAR-2019', 70,50);

insert into bookings(booking_id, availability, payment)
values (003, '01-MAR-2019', 70,50);

insert into bookings(booking_id, availability, payment)
values (004, '01-MAR-2019', 70,50);
