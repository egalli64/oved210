--trigger
--storia dei salari per i miei programmatori, mi interesserà il coder_id
--voglio che sia del tipo della tabella coders, e gli dico che sarà una FK che mi andrà a referenziare
create table coder_salaries (
    coder_id number(6, 0),
    old_salary number(8, 2),
    new_salary number(8, 2)
);

--
create or replace trigger coder_salary_update
--diciamo a oracle quando chiamarlo, 
--voglio creare un trigger coder_salary_update, e spiego che voglio che venga chiamato quando c'è un update sulla tabella coders, nella colonna salary
--prima di fare l'update  creeremo una nuova tabella nell'altra riga
before update of salary on coders
for each row  --per ogni riga che è stata condizionata da update/ modificata, devi fare qualcosa, begin
begin
insert into coder_salaries values(
        :old.coder_id, :old.salary, :new.salary); --> è un marker(prima dei camb, la versione vecchia della tabella su cui sto lavorando) per dire che sto facendo cambiamenti, quindi avrò due versioni, prima dei cambiamneti e dopo
end coder_salary_update;
/

update coders
set salary = salary + 100;
