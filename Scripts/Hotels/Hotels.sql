create table hotels (
hotel_id number (6) primary key,
hotel_name varchar2 (40),
city varchar2 (30),
room_counter number (6) 
);

drop table hotels;


create table rooms (
hotel_id number (6) constraint hotels_hotel_id_fk references hotels(hotel_id),
room_id number (6)
);

drop table rooms;

create sequence hotel_seq
start with 121 increment by 1;

--insert data in hotels
insert into hotels (hotel_id, hotel_name, city, room_counter)
values(hotel_seq.nextval , 'Hotel Tulipano', 'Milano', 10);

insert into hotels (hotel_id, hotel_name, city, room_counter)
values(hotel_seq.nextval , 'Hotel Margherita', 'Roma', 10);

insert into hotels (hotel_id, hotel_name, city, room_counter)
values(hotel_seq.nextval , 'Hotel Girasole', 'Firenze', 7);

insert into hotels (hotel_id, hotel_name, city, room_counter)
values(hotel_seq.nextval , 'Hotel Giglio', 'Napoli', 5);

insert into hotels (hotel_id, hotel_name, city, room_counter)
values(hotel_seq.nextval , 'Hotel Orchidea', 'Venezia', 5);


create sequence rooms_seq
start with 200 increment by 1;

insert into rooms
values(121, rooms_seq.nextval);

insert into rooms
values(122, rooms_seq.nextval);

insert into rooms
values(123, rooms_seq.nextval);

insert into rooms
values(124, rooms_seq.nextval);

insert into rooms
values(125, rooms_seq.nextval);



drop sequence hotels_seq;



