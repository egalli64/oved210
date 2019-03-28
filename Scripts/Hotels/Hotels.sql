create table hotels (
hotel_id number (6,0) primary key,
hotel_name varchar2 (40),
city varchar2 (30),
room_counter number (6,0) 

);


create table rooms (
hotel_id number (6,0) constraint hotels_hotel_id_fk references hotels(hotel_id),
room_id number (6,0)

);
