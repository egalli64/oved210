--DML (Data Manipulation Language)
--INSERT, UPDATE, DELETE
--vediamo come funziona insert, per inserire una nuva regione:
select*
from regions;
--nome delle colonne interessate e valori che voglio inserire
insert into regions(region_id, region_name)
values(11, 'Antartica');

delete from regions
where region_id > 10;

rollback;

insert into regions(region_id)
values(12);

insert into regions(region_id, region_name)
values(13, null);

--UPDATE, permette di modificare una riga già esistente. l'update richiede quasi sempre di essere cmpletato con un where
--fammi un set del region name mettendoci dentro oceania per quelle righe che hanno dentro oceania
update regions
set region_name = 'Oceania'
where region_id = 12;

--le regioni che ho inserito voglio che si chiamino 1, 2, 3...
--dove region id è maggiore di 10 ci mette la stringa 'region' concatenata a quella che è la region corrente
update regions
set region_name = 'Region' || region_id
where region_id > 10;

--la DELETE funziona come UPDATE, quindi fare attenzione al WHERE
delete from regions
where region_id > 10;
--la riga mi viene cancellata se e solo se non ci sono dipendenze con altre tabelle.
delete from regions

--COMMIT and ROLLBACK
insert into regions(region_id, region_name)
values(11, 'Antartica');

--cancellami i cambiamenti che ho fatto
rollback;


select*
from regions;

insert into regions(region_id, region_name)
values(12, 'Antartica');

insert into regions(region_id, region_name)
values(13, 'oceania');

update regions
set region_name = 'Americas'
where region_id = 3;

rollback;


update regions
set region_name = 'Region' || region_id
where region_id > 3;


select*
from regions;

commit;

--per una sequenza di operazioni:
insert into regions(region_id, region_name)
values(13, 'Antartica');

--posso creare un oggetto 
--blocchi di codiche che pssono essere committati o rollbackati
savepoint sp1;

insert into regions(region_id, region_name)
values(14, 'Oceania');

--mi vengono canc le operazioni che ho fatto sa savepoint in poi..
rollback to sp1;

rollback;

--