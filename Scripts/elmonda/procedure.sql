--pl/sql procedure , function, trigger

--connect as: sqlplus / as sysdba
--alter session set container = xepdb1;
--grant create procedure to oved;
--grant create trigger to oved;

--la procedura � la procedura che NON RITORNA NIENTE
--la funzione � una procedura che ritorna.

--id coder e percentuale di aumento stipendio, faremo una select  per vedere lo stipendio e un update per inserire il nuovo stipendio
--come ricevere parametri dall'esterno,occorre una funzione ovvero procedura , DOPO ( inserire i parametri che saranno coder_id e % di salario
--convenzione: chiamare parametri con p, specifichiamo in per dirgli che � un parametro in input
--tipo parametro coders.coder_id%type


create or replace procedure update_coder_salary(
    p_coder_id in coders.coder_id%type,
    p_factor in number
    --dopo as ci vanno le variabili locali che vogliamo usare all'interno della nostra funzione
) as 
     v_count integer;
begin
--il count mi serve per vedere se ci sono coder id con l'id passato dall'utente, dovrebbe essere pk, quindi dovremmo avere 0 o 1 come valori
--in quanto non voglio fare un  ... su campi vuoti inesistenti
--dopo il begin metter� il body della mia funzione
    select count(rowid)
    into v_count
    from coders
    where coder_id = p_coder_id;

if v_count = 1 then  --solo se il mio count � = 1 far� quello che mi interessa eseguire
        update coders
        set salary = salary + (salary * p_factor)
        where coder_id = p_coder_id;
        commit;
    end if;
exception
    when others then
            rollback;

end update_coder_salary;
/

call update_coder_salary(103, 1);

call update_coder_salary(p_coder_id => 104, p_factor => 1.5);

begin
--dico che voglio chiam il mio metodo passandogli 105
    update_coder_salary(105, 3);
end;
/

drop procedure update_coder_salary;



        
    