--DML - Data Manipulation Language
--insert:
select *
from regions;

insert into regions(region_id, region_name)
values(11, 'Antartica');

--update:
update regions
set region_name = 'Oceania'
where region_id = 12;

update regions
set region_name = 'Region' || region_id
where region_id > 10; 

--delete:
delete from regions
where region_id > 10;

--Commit e rollback:
insert into regions(region_id, region_name)
values (13, 'Antartica');

rollback;

--Esempio:
select *
from regions;

insert into regions(region_id, region_name)
values (14, 'Africa');

commit;

--savepoint:
select *
from regions;

insert into regions(region_id, region_name)
values (13, 'Antartica');

savepoint sp1;

insert into regions(region_id, region_name)
values (14, 'Oceania');

rollback to sp1;

rollback;