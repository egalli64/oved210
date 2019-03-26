-- DML (data Manipultaion Language)
-- INSERT, UPDATE, DELETE

select *
from regions;

insert into regions(region_id, region_name)
values(11, 'Antartica');

insert into regions(region_id)
values(12);

insert into regions(region_id, region_name)
values(13, null);

--UPDATE (WHERE) -- aggiornami la tabella regions per tutte quelle righe che hanno come region id 12
update regions
set region_name = 'Oceania'
where region_id = 12;

update regions
set region_name = 'Regions' || region_id
where region_id > 10;

--DELETE (WHERE)
delete from regions
where region_id >= 10;

--COMMIT and ROLLBACK 
select *
from regions;

insert into regions(region_id, region_name)
values (13, 'Antartica');

savepoint sp1;

insert into regions(region_id, region_name)
values (14, 'Oceania');

--si può fare rollback fino a quando non si effettua il commit
rollback to sp1;

rollback;
