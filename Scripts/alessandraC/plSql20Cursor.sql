--pl/sql cursor
set serveroutput on


declare
    v_first_name coders.first_name%type;
    v_last_name coders.last_name%type;
begin
    select first_name, last_name
    into v_first_name, v_last_name
    from coders
    where coder_id = 103;
    
    dbms_output.put_line('Coder 103 is ' ||
    v_first_name || ' ' || v_last_name);
end;
/

--cursore = collezione di dati tipici della select
declare
    v_coder_id coders.coder_id%type;
    v_first_name coders.first_name%type;
    v_last_name coders.last_name%type;
    cursor v_coder_cursor is
        select coder_id, first_name, last_name
        from coders
        order by last_name;
begin
    open v_coder_cursor;
--apri il cursore
    
    loop
        fetch v_coder_cursor
--cerca di leggere la prossima riga (prima riga) del cursore
        into v_coder_id, v_first_name, v_last_name;
        exit when v_coder_cursor%notfound;
--altrimenti, se non trova l'elemento successivo, il not found = true e non c'è niente da leggere nel cursore quindi usciamo dal loop
--al contrario, se trova un elemento questo può essere stampato

    dbms_output.put_line('Coder' || v_coder_id ||
        'is ' || v_first_name || ' ' || v_last_name);
    end loop;
   
end;
/

-- implicit fetch cursor
--altro metodo simile come rappresentazione della fetch all'interno del cursor, che riporta i campi come definiti nella select e va in automatico senza dover spiegare la var booleana
--non richiede la definizione di variabili
declare
    cursor v_coder_cursor is
        select coder_id, first_name, last_name
        from coders
        order by last_name;
begin
    for v_cur in v_coder_cursor loop
        dbms_output.put_line('Coder' || v_cur.coder_id || 'is ' || v_cur.first_name || ' ' || v_cur.last_name);
    end loop;
   
end;
/


--open cursor for
declare
--le singole righe all'interno del cursore sono fatte allo stesso modo delle righe della tabella coders (= rowtype)
    type t_coder_cursor is ref cursor return coders%rowtype; --definizione di classe type estensione di cursor
    v_coder_cursor t_coder_cursor; -- crea un oggetto v_coder_cursor del tipo definito nella prima riga
    v_cur coders%rowtype; -- iteratore sul cursore = legge la singola riga all'interno del cursore
    
begin
    open v_coder_cursor for select * from coders where coder_id between 103 and 105;
    loop
        fetch v_coder_cursor into v_cur;
        exit when v_coder_cursor%notfound;
        
         dbms_output.put_line('Coder' || v_cur.coder_id || 'is ' || v_cur.first_name || ' ' || v_cur.last_name);
        
    end loop;
end;
/

--oppure, usando un codice più semplice
--unconstrained cursor (non conosco il cursore, ma imposto una variabile t_cursor che sarà di tipo generico)

declare
    type t_cursor is ref cursor; --operatore generico, senza specificazione del tipo
    v_cursor t_cursor;
    v_cod coders%rowtype;
    
begin
    open v_cursor for select * from coders where coder_id between 103 and 105;
    loop
        fetch v_cursor into v_cod;
        exit when v_cursor%notfound;
        
         dbms_output.put_line('Coder' || v_cod.coder_id || ' is ' || v_cod.first_name || ' ' || v_cod.last_name);
        
    end loop;
end;
/




