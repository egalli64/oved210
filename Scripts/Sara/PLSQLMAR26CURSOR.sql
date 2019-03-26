-- pl / sql cursor
set serveroutput on 

declare 
    v_first_name coders.first_name%type;
    v_last_name coders.last_name%type;
    
begin
    SELECT first_name, last_name
    into v_first_name, v_last_name
    from coders
    where coder_id = 103;

    DBMS_OUTPUT.put_line('Coder 103 is ' || v_first_name || ' ' || v_last_name);
end;
/

declare 
    v_coder_id coders.coder_id%type;
    v_first_name coders.first_name%type;
    v_last_name coders.last_name%type;
    cursor v_coder_cursor is 
        select coder_id, first_name, last_name
        from coders
        order by last_name;
begin
    open v_coder_cursor; -- esegui select associata a cursor
    
    loop 
        fetch v_coder_cursor --cerca di leggere prossima riga nel cursor
        into v_coder_id, v_first_name, v_last_name;
        exit when v_coder_cursor%notfound; --altrimenti diventa true 
    
    DBMS_OUTPUT.put_line('Coder ' || v_coder_id || ' is ' || v_first_name || ' ' || v_last_name);
    end loop;
end;
/

--implicit fetch cursor
declare 
      cursor v_coder_cursor is 
        select coder_id, first_name, last_name
        from coders
        order by last_name;
begin
    for v_cur in v_coder_cursor loop          
        DBMS_OUTPUT.put_line('Coder ' || v_cur.coder_id || ' is ' || v_cur.first_name || ' ' || v_cur.last_name);
    end loop;
end;
/

-- open cursor for
declare 
    type t_coder_cursor is ref cursor return coders%rowtype; --rowtype: tipo di riga della tabella coders
    v_coder_cursor t_coder_cursor; --creare una variabile di tipo t coder cursor definito alla riga precedente
    v_cur coders%rowtype;
begin     
    open v_coder_cursor for select* from coders where coder_id BETWEEN 103 and 105;
    
    loop
        fetch v_coder_cursor into v_cur;    
        exit when v_coder_cursor%notfound;
        
        DBMS_OUTPUT.put_line('Coder ' || v_cur.coder_id || ' is ' || v_cur.first_name || ' ' || v_cur.last_name);
    end loop;
end;
/

--unconstrained cursor
declare 
    type t_cursor is ref cursor; 
    v_cursor t_cursor; 
    v_cod coders%rowtype;
begin     
    open v_cursor for select* from coders where coder_id BETWEEN 103 and 105;
    
    loop
        fetch v_cursor into v_cod;    
        exit when v_cursor%notfound;
        
        DBMS_OUTPUT.put_line('Coder ' || v_cod.coder_id || ' is ' || v_cod.first_name || ' ' || v_cod.last_name);
    end loop;
end;
/

