select *
from regions;

insert into regions (region_id, region_name)
values (11, 'Antartica');

insert into regions (region_id)
values (12);

-- UPDATE
update regions
set region_name = 'Oceania'
where region_id = 12;

update regions
set region_name = 'Region' || region_id
where region_id > 10;

delete from regions
where region_id > 10;

delete from regions

--COMMIT AND rollback
select *
from regions;

insert into regions (region_id, region_name)
values (13, 'Antartica');

savepoint sp1;

insert into regions (region_id, region_name)
values (14, 'Oceania');

rollback to sp1;

delete from regions
where region_id = 14;


rollback;

insert into regions (region_id, region_name)
values (15, 'Korea');

update regions
set region_name = 'North Korea'
where region_id = 15;

delete from regions
where region_id > 10;

commit;

