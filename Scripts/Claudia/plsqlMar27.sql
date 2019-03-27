--procedura che gestisce parametri in output
set SERVEROUTPUT ON

create or replace procedure get_coder_name(
    p_coder_id in coders.coder_id%type,
    p_first_name out coders.first_name%type,
    p_last_name out coders.last_name%type
) as
begin
    select first_name, last_name
    into p_first_name, p_last_name
    from coders
    where coder_id = p_coder_id;
end;
/

--testing per la procudura con parametri output e input
declare
    v_first_name coders.first_name%type;
    v_last_name coders.last_name%type;
begin
    get_coder_name(107, v_first_name, v_last_name);
    dbms_output.put_line('Coder 107 is ' || v_first_name || ' ' || v_last_name);
end;

--find_max(a in, b in e max out)
--find max(3, 12, max) -> max = 12
create or replace procedure find_max(
    p_a in number,
    p_b in number,
    p_max out number
) as
begin 
    if p_a > p_b then
    p_max := p_a;
    elsif
    p_b > p_a then
    p_max := p_b;
    end if;
    end;
    
--testing procedura find_max
declare
    a number;
    b number;
    c number;
begin
    a := 18;
    b := 42;
  
    find_max(a, b, c);
    dbms_output.put_line('Max is ' || c);
    
end;
/
drop procedure find_max;

--funzione
create or replace function find_max(
    p_a in number,
    p_b in number)
    return number as

begin 
    if p_a > p_b then
    return p_a;
    elsif
    p_b > p_a then
    return p_b;
    end if;
    end;
    
--testing funzione find_max
declare
    a number;
    b number;
begin
    a := 18;
    b := 42;
    dbms_output.put_line('Max is ' || find_max(a, b));
end;
/

--uso funzione in tabella Dual per testing
select find_max(12, 45)
from dual;

--my_nvl(a, b) return a when is not null, otherwise b 
create or replace function my_nvl(
    p_a in number,
    p_b in number)
    return number as
    begin
    if p_a is null then
    return p_b;
    else
    return p_a;
    end if;
    end;

--testing my_nvl  
declare
    a number;
    b number;
begin
    a := 18;
    b := 42;
    dbms_output.put_line('Nvl is ' || my_nvl(a, b));
end;
/   

declare
    a number;
    b number;
begin
    a := null;
    b := 42;
    dbms_output.put_line('Nvl is ' || my_nvl(a, b));
end;
/   
select my_nvl(12, 45), my_nvl(null, 14)
from dual;

--applicare funzione nvl alla tabella Employees
select he.employee_id, my_nvl(he.commission_pct, 0)
from HR.employees he;

--funzione circle_area(p_radius numeric) -> circle area
create or replace function circle_area(
        p_radius in number)
    return number as
        v_pi number := acos(-1);
    begin
    return  p_radius * p_radius * v_pi;
    end;

--testing funzione circle_area
select circle_area(7), circle_area(1)
from dual;

--procedura su incremento salary per tutti con 2 parametri 
--low, high: interval coders id to increase salary
--increase: how much to increase salaries

create procedure increase_salary_forcoders(
    p_lowcoder in coders.coder_id%type,
    p_highcoder in coders.coder_id%type,
    p_increase in number
)
as
    cursor v_coderid_cursor is
        select coder_id, salary
        from coders
        where coder_id between p_lowcoder and p_highcoder;
begin
    for v_cur in v_coderid_cursor loop

    update coders
    set salary = salary + p_increase;       
    end loop;
end;

begin
increase_salary_forcoders(104, 105, 1);
end;

--soluzione più semplice
create procedure increase_salary_forcoders(
    p_lowcoder in coders.coder_id%type,
    p_highcoder in coders.coder_id%type,
    p_increase in coders.salary%TYPE)
    as
    begin
    update coders
    set salary = salary + p_increase
    where coder_id between p_lowcoder and p_highcoder;
    end;


