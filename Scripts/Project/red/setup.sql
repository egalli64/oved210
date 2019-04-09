drop table red_hotels;

create table red_hotels (
hotel_id number (6) primary key,
hotel_name varchar2 (40),
city varchar2 (30),
room_counter number (6) 
);

create sequence red_hotel_seq
start with 121 increment by 1;

--insert data in hotels
insert into red_hotels (hotel_id, hotel_name, city, room_counter)
values(red_hotel_seq.nextval , 'Hotel Tulipano', 'Milano', 10);

insert into red_hotels (hotel_id, hotel_name, city, room_counter)
values(red_hotel_seq.nextval , 'Hotel Margherita', 'Roma', 10);

insert into red_hotels (hotel_id, hotel_name, city, room_counter)
values(red_hotel_seq.nextval , 'Hotel Girasole', 'Firenze', 7);

insert into red_hotels (hotel_id, hotel_name, city, room_counter)
values(red_hotel_seq.nextval , 'Hotel Giglio', 'Napoli', 5);

insert into red_hotels (hotel_id, hotel_name, city, room_counter)
values(red_hotel_seq.nextval , 'Hotel Orchidea', 'Venezia', 5);

