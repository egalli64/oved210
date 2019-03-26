--PL/SQL
set SERVEROUTPUT ON;

begin
    DBMS_OUTPUT.PUT_LINE('Hello');
end;
/

--dichiarare variabili e operazioni
declare
v_width integer;
v_height integer := 2;
v_area integer:= 6;
begin
v_width := v_area / v_height;
dbms_output.put_line('width is ' || v_width);
end;
/

--eccezione particolare
declare
v_width integer;
v_height integer := 0;
v_area integer:= 6;
begin
v_width := v_area / v_height;
dbms_output.put_line('width is ' || v_width);
EXCEPTION when zero_divide then
dbms_output.put_line('Can''t divide by zero');
end;
/

--eccezione generale (tutte le eccezioni)
declare
v_width integer;
v_height integer := 0;
v_area integer:= 6;
begin
v_width := v_area / v_height;
dbms_output.put_line('width is ' || v_width);
EXCEPTION when others then
dbms_output.put_line('An exception occurred');
end;
/

--conditional logic
declare
v_a integer := 1;
v_b integer := 2;
begin
    if v_a > 0 then
     dbms_output.put_line('a is positive'); 
     if v_b > 0 then
     dbms_output.put_line('b is positive'); 
        end if;
        elsif v_a = 0 then
         dbms_output.put_line('a is zero'); 
         else
         dbms_output.put_line('a is negative');
        end if;
end;
/

--loop
declare
    v_x integer;
begin
    v_x := 0;
    loop
    v_x := v_x +1;
    exit when v_x = 5;
    end loop;
    dbms_output.put_line('loop completed, x is ' || v_x);

--continue
 v_x := 0;
loop
    v_x := v_x +1;
    if v_x = 3 then
     dbms_output.put_line('3!');
     continue;
     end if;
     
dbms_output.put_line('nothing special');
 exit when v_x = 5;
    end loop;
    
--continue/when
v_x := 0;
loop
    v_x := v_x +1;
    continue when v_x = 3;
   
dbms_output.put_line('nothing special');
 exit when v_x = 5;
    end loop;
    dbms_output.put_line('loop completed');
  
--while loop
v_x := 0;
while v_x < 5 loop
    v_x := v_x +1;
    dbms_output.put_line('while ' || v_x || ' is less than 5');
end loop;
dbms_output.put_line('while loop completed');

--for loop
for i in 1..5 loop
dbms_output.put_line('for ' || i || ' loop');
end loop;

--for loop reverse
for i in reverse 1..5 loop
dbms_output.put_line('for ' || i || ' loop');
end loop;

end;
/








