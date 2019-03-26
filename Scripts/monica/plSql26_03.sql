--plSql cursor 
set serveroutput on 

--dichiaro la variabile dicendo di prendere come riferimento la colonna first_name della tabella coders
declare 
    v_first_name coders.first_name%type;
    v_last_name coders.first_name%type;
begin
    select first_name, last_name
    into v_first_name, v_last_name       -- cosi metto nelle due variabili i campi
    from coders
    where coder_id = 103;

    DBMS_OUTPUT.PUT_LINE('Coder 103 is ' || v_first_name || ' ' || v_last_name);
end;
/



declare 
    v_coder_id coders.coder_id%type;
    v_first_name coders.first_name%type;
    v_last_name coders.first_name%type;
   
    cursor v_coder_cursor is 
        select coder_id, first_name, last_name
        from coders
        order by last_name;
begin
   open v_coder_cursor;
   
   loop
        fetch v_coder_cursor     --cerca di leggere il prossimo elemento nel cursore
        into v_coder_id,v_first_name,v_last_name;
        exit when v_coder_cursor%notfound;
   
    DBMS_OUTPUT.PUT_LINE('Coder ' || v_coder_id || ' is ' || v_first_name || ' ' || v_last_name);
   
    end loop;

end;
/


declare 
   
    cursor v_coder_cursor is 
        select coder_id, first_name, last_name
        from coders
        order by last_name;
begin
   
   for v_cur in v_coder_cursor loop  -- v_cur oggetto che contiene le variabili
        
   
    DBMS_OUTPUT.PUT_LINE('Coder ' || v_cur.coder_id || ' is ' || v_cur.first_name || ' ' || v_cur.last_name);
   
    end loop;

end;
/

declare

    type t_coder_cursor is ref cursor return coders%rowtype;  -- type è come se fosse una classe e lavora in una classe derivate
    
    v_coder_cursor t_coder_cursor;  --creo una variabile o oggetto? di tipo t_coder_cursor
    v_cur coders%rowtype; -- variabile che rappresenta la signola riga di tipo coders%rowtype
    
    begin 
        open v_coder_cursor for select * from coders where coder_id between 103 and 105;
        
        loop
        fetch v_coder_cursor into v_cur;
        exit when v_coder_cursor%notfound;
    
     DBMS_OUTPUT.PUT_LINE('Coder ' || v_cur.coder_id || ' is ' || v_cur.first_name || ' ' || v_cur.last_name);
    
    end loop;

end;
/

--unconstrained cursor quando non conosco il tipo di cursore su cui lavoro

declare

    type t_cursor is ref cursor ;  
    
    v_cursor t_cursor;  
    v_cod coders%rowtype; -- variabile che si riferisce alla tabella
    
    begin 
        open v_cursor for select * from coders where coder_id between 103 and 105;
        
        loop
        fetch v_cursor into v_cod;
        exit when v_cursor%notfound;
    
     DBMS_OUTPUT.PUT_LINE('Coder ' || v_cod.coder_id || ' is ' || v_cod.first_name || ' ' || v_cod.last_name);
    
    end loop;

end;
/
