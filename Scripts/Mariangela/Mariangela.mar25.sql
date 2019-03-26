--- INSERT

select *
from regions

delete from regions
where region_id > 10;

rollback; 

insert into regions(region_id, region_name)
values(11, 'Antartica');

insert into regions(region_id)
values(12);

--- UPDATE

update regions
set region_name = 'Oceania'
where region_id = 12;

update regions
set region_name = 'Region' || region_id
where region_id > 10;

--- DELETE

delete from regions
where region_id > 10;


--- COMMIT and ROLLBACK

insert into regions(region_id, region_name)
values (13, 'Antartica');

rollback;


--- 
insert into regions(region_id, region_name)
values(14, 'Oceania');

commit;

savepoint sp1;

insert into regions(region_id, region_name)
values(14, 'Oceania');

rollback to sp1;
