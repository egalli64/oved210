-- INSERT
select *
from regions

delete from regions
where region_id > 10

rollback

insert into regions(region_id, region_name)
values(11, 'Antartica')

insert into regions(region_id)
values(12)


--UPDATE (WHERE)
update regions
set region_name = 'Oceania'
where region_id = 12;

update regions
set region_name = 'Region' || region_id
where region_id > 10


--DELETE
delete from regions
where region_id > 10:


--COMMIT AND ROLLBACK
insert into regions(region_id, region_name)
values(13, 'Antartica')


rollback

select *
from regions

insert into regions (region_id, region_name)
values(14, 'Zanzibar')

update regions
set region_name = 'Zambia'
where region_id = 14

delete from regions
where region_id > 11

rollback

--save point
select *
from regions


insert into regions(region_id, region_name)
values(16, 'Antartica')

savepoint sp1

insert into regions (region_id, region_name)
values(14, 'Oceania')

rollback to sp1

rollback






