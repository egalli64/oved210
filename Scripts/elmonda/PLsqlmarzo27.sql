--procedura che mi gestisce anche i parametri output
--gli passo come paramet di input id coder e voglio passargli sempre due parametri che saranno riempito con firstname  elastname del parametro

create or replace procedure get_coder_name(
    p_coder_id IN coders.coder_id%type,  --mi interesserà il valore che mi passa il cliente perche lo userò nel body
    p_first_name OUT coders.first_name%type,  --parameti di cui mi interessa che siano stringhe in cui metterò il risultato delle mie ricerche
    p_last_name OUT coders.last_name%type
) as
begin
select first_name, last_name
into p_first_name, p_last_name
from coders
where coder_id = p_coder_id;
end;
/

--testing for my procedure
set serveroutput on

declare
    v_first_name coders.first_name%type;
    v_last_name coders.last_name%type;
begin
    get_coder_name(107, v_first_name, v_last_name);
        dbms_output.put_line('Coder 107 is ' || v_first_name || ' ' || v_last_name);
end;
/
--l'idea dei param output è che le var sono dichrte dal chiamante e poi inizializzate

--posso scrivere una procedura che fa a meno di tabelle, 
--find_max(a in, b in, max out) , a sarà in input, b .. in max il più grosso dei due
--find_max(3, 12, max) -> al suo ritorno max sarà = 12


create or replace procedure find_max(
    p_a in number,
    p_b in number,
    p_max out number
) as

begin
        if p_a > p_b then
        p_max := p_a;
    else p_max := p_b;
  end if;
end;
/
---tester
declare
    a number;
    b number;
    c number;
    
begin
    a := 15;
    b := 50;
    
    find_max(a, b, c);
    dbms_output.put_line('Max is ' || c);
end;


drop procedure find_max;

--riscriviamo la procedura come funzione,
--e quindi avremo come ritorno lo statement return e non più la procedura
create or replace function find_max(
    p_a in number,
    p_b in number)
    return number as 
--in questo caso non ci sono le variab locali
begin
        if p_a > p_b then
        return p_a;
    else 
    return p_b;
  end if;
end;
/
-----------------------------
create or replace function find_max(
    p_a in number,
    p_b in number)
    
    return number as 

begin
        if p_a > p_b then
        return p_a;
    else 
    return p_b;
  end if;
end;
/
declare
    a number;
    b number;
    
    
begin
    a := 15;
    b := 50;
    
   
    dbms_output.put_line(' ' || find_max (a, b));
end;
/

select find_max(12, 42)
from dual; --per leggere valori di cose che non sono su nessuna tabella

--my_numeric_nvl(a, b) return a when a is not null, otherwise b---> prende due parametri i infut
--voglio una funzione my_nvl che mi ritorni a se a non è null o se a è null che mi ritorni b.

create or replace function numeric_nvl(
    p_value in number,
    p_alt in number)
    return number as 
--my numeric in questo caso non ci sono le variab locali
begin
        if p_value is null then
        return p_alt;
    else 
    return p_value;
  end if;
end;
/

declare
    a number;
    b number;
   
 begin 
    a := null;
    b := 42;
    
    dbms_output.put_line('Result is ' || my_nvl(a, b));
end;
/

declare
    a number;
    b number;
   
 begin 
    a := 9;
    b := 42;
    
    dbms_output.put_line('Result is ' || my_nvl(a, b));
end;
/

select he.employee_id, numeric_nvl(he.commission_pct, 0) --se è null mettim 0 altrimenti ritorna la commision corretta
from hr.employees he;

--voglio una funzione circle_area(p_radius numeric) e mi ritorna l'area del cerchio

create or replace function circle_area(
    p_radius in number)
    return number as 
--my numeric in questo caso non ci sono le variab locali
begin

  
        return(p_radius * p_radius * 3,14);
   
end;
/

---test 
select circle_area(12), circle_area(1)
from dual;

--procedure increase_salary_for_coders()
--low, high: interval coders id to increase salary
--increase: how much to increase salaries
--increase per quanto voglio incrementare il salario

create or replace procedure increase_salary_for_coders(
    p_low in coders.coder_id%type,
    p_high in coders.coder_id%type,
    p_increase in coders.salary%type
) as
--declare variabile
    v_coder_id  coders.coder_id%type;
    cursor v_coder_cursor is
        select coder_id
        from coders
        where coder_id between p_low and p_high;
begin
    open v_coder_cursor; --apri il cursore

    loop
        fetch v_coder_cursor --cercami il prossimo valore specificato e ritornamelo in v_coder_id
        into v_coder_id;
        exit when v_coder_cursor%notfound;
        
        update coders
        set salary = salary + p_increase
        where coder_id = v_coder_id;
        --end increase_salary_for_coders;
    end loop;
end;
/

--call increase_salary_for_coders();
---------------------------------alternativa senza cursore----------------------------------------------

create or replace procedure increase_salary_for_coders(
    p_low in coders.coder_id%type,
    p_high in coders.coder_id%type,
    p_increase in coders.salary%type
) as
begin
    update coders
    set salary = salary + p_increase
    where coder_id between p_low and p_high;
    commit;
    end;
    /
    
    -----------------------------------------
        

    