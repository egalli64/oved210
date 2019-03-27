--DML
--Insert, Update, Delete


--insert
select*
from regions;

insert into regions(region_id, region_name)
values( 11, 'Antartica');

insert into regions(region_id)
values( 12 );



--update
update regions
set region_name = 'Oceania'
where region_id = 12;

update regions
set region_name = 'Region' || region_id
where region_id > 10;



--delete
delete from regions
where region_id > 10;



--COMMIT AND ROLLBACK
insert into regions(region_id, region_name)
values( 11, 'Antartica');

rollback;

commit;


--Esempio
 select*
 from regions;

insert into regions(region_id, region_name)
values( 14, 'Antartide');

rollback;
-----


--Savepoint
select*
from regions;

insert into regions(region_id, region_name)
values( 11, 'Antartica');

savepoint sp1;

insert into regions(region_id, region_name)
values( 12, 'Oceania');

rollback to sp1;

rollback;

