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

insert into hotels (hotel_id, hotel_name, city, room_counter)
values(121 , 'Hotel Tulipano', 'Milano', 10);


insert into hotels (hotel_id, hotel_name, city, room_counter)
values(122 , 'Hotel Margherita', 'Roma', 10);


insert into hotels (hotel_id, hotel_name, city, room_counter)
values(123 , 'Hotel Girasole', 'Firenze', 7);


insert into hotels (hotel_id, hotel_name, city, room_counter)
values(124 , 'Hotel Giglio', 'Napoli', 5);


insert into hotels (hotel_id, hotel_name, city, room_counter)
values(125 , 'Hotel Orchidea', 'Venezia', 5);