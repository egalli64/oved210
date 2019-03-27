--IncreaseSalaryCoder107

set serveroutput on 

create procedure increase_coder_salary
  as
    
begin
        update coders
        set salary = salary + 1
        where coder_id = 107;
        commit;
end increase_coder_salary;
/    

--Incrementa salario dal coder id con un paramentro in input

create procedure  update_salary_coder (
p_coder_id in coders.coder_id%type
)
as
begin
    update coders
    set salary = salary + 1
        where coder_id = p_coder_id ;
        commit;
end update_salary_coder;
/    
begin 
 update_salary_coder(104);
end;
/
call  update_salary_coder(104);

--scriviamo una procedure che riceve l'output invece che l'input
create procedure get_coder_name (
    p_coder_id in coders.coder_id%type,  --paramentro in input specificato da IN
    p_first_name out coders.first_name%type,  -- parametro in output
    p_last_name out coders.last_name%type   --parametro in output
) as 
    
begin
        select first_name, Last_name
        into p_first_name, p_last_name
        from coders
        where coder_id = p_coder_id;       
end;
/

--test della procedura precedente

declare 
    v_first_name coders.first_name%type;
    v_last_name coders.last_name%type;
begin 
    get_coder_name(107, v_first_name, v_last_name);

    dbms_output.put_line( 'Coder 107 is ' || v_first_name || ' ' || v_last_name);


end;
/

-- find max(a in , b in  , max out)
-- ex: find max (3,12, max) -> max = 12

create procedure find_max (
    p_a in number,  --paramentro in input specificato da IN
    p_b in number,  -- parametro in 
    p_max out number   --parametro in output
) as 
    begin 
    if p_a > p_b then
       p_max := p_a;
    else
        p_max := p_b;
    end if;
             
end;
/

--test codice sopra
 declare 
    a number;
    b number;
    c number;
begin 
    a:= 18;
    b:= 42;
    
    find_max(a,b,c);
    dbms_output.put_line('Max is ' || c);
end;
/    

drop procedure find_max;


--adesso la daccio diventare funzione

create function find_max (
    p_a in number,  --paramentro in input specificato da IN
    p_b in number)  -- parametro in 

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
    a:= 18;
    b:= 42;
    
    
    dbms_output.put_line('Max is ' || find_max(a,b));
end;
/    

--
select find_max(12,42)
from dual;

--
create function my_numeric_nvl (
    p_a in number,
    p_b in number)
return number as
    begin 
    if p_a is not null then
       return p_a;
    else
     return p_b;
    end if;
             
end;
/

--test 

  select my_numeric_nvl (null,42), my_numeric_nvl (12,42)
    from dual;  

--
 
 select he.employee_id, my_numeric_nvl(he.commission_pct, 0)
 from hr.employees he;

--
create function circle_area (
    p_radius in number)
return number as
begin 
    return  p_radius * p_radius * acos(-1);
    
end;
/
    
-- test area del cerchio

select circle_area(7), circle_area(1)
from dual;

--procedura con in input due parametri e aumentare il salario nell'intervallo id che ci interessa e di quanto ci interessa aumentarlo

create procedure increase_salary_for_coders (
    p_low in number,  --paramentro in input specificato da IN
    p_high in number,  -- parametro in 
    p_increase in number   --parametro in output
) as 
    v_salary coders.salary%type;
    v_coder_id coders.coder_id%type;
    
    cursor v_coder_cursor is 
     select coder_id, salary
     from coders
     where coder_id between p_low and p_high ;
 
 begin 
    open v_coder_cursor;
    
    loop
        fetch v_coder_cursor     --cerca di leggere il prossimo elemento nel cursore
        into v_coder_id, v_salary;
        exit when v_coder_cursor%notfound;
        
        update coders
        set  salary = salary + p_increase
        where coder_id = v_coder_id;
        
    end loop;
     
 end;
 /
    
    
    
    
    
