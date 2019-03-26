--Dml (Data manipulation language)
-- insert,update,delete
select *
from regions;


insert into  regions(region_id, region_name)
values(11,'Antartica');

insert into  regions(region_id)
values(12);

insert into  regions(region_id,region_name)
values(13,null);

--update
update regions
set region_name='Oceania'
where region_id=12;

update regions
set region_name='Region'||region_id
where region_id>10;

--delete(where)
delete from regions
where region_id>10;

--commit and rollback
select *
from regions;
insert into  regions(region_id, region_name)
values(13,'Antartica');

rollback;

--esercizi:

insert into regions(region_id, region_name)
values(11, 'Antartica');

update regions
set region_name='Oceania'
where region_id=12;

delete from regions
where region_id>10;

insert into regions(region_id,region_name)
values(12,'Antartica');

rollback;

--particolarità commit rollback;
select *
from regions;

insert into  regions(region_id, region_name)
values(13,'Antartica');

savepoint sp1;

insert into regions(region_id, region_name)
values(14,'Oceania');

rollback to sp1;

rollback;

--

