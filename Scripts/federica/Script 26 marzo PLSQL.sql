--PL / SQL

set SERVEROUTPUT ON;

BEGIN

DBMS_OUTPUT.PUT_LINE('Hello');

end;
/

--declaring variables
declare
v_width integer;
v_height integer := 0;
v_area integer := 6;

BEGIN

v_width := v_area/v_height;
DBMS_OUTPUT.PUT_LINE('width is ' || v_width);

EXCEPTION
WHEN ZERO_DIVIDE THEN --eccezione specifica
DBMS_OUTPUT.PUT_LINE('can''t divide by zero!');

WHEN others THEN --eccezione generica
DBMS_OUTPUT.PUT_LINE('An exception occurred');

end;
/

--coditional logic
declare
v_a integer := 1;
v_b integer := 2;

begin
if v_a > 0 then 
    DBMS_OUTPUT.PUT_LINE('a is positive');
    if v_b > 0 then
       DBMS_OUTPUT.PUT_LINE('b is positive');
       end if;
  elsif v_a = 0 then
  DBMS_OUTPUT.PUT_LINE('a is zero');
  else
  DBMS_OUTPUT.PUT_LINE('a is negative');
  end if;
end;
/

--loop
declare 
v_x integer;

begin
v_x := 0;

loop
v_x := v_x + 1;
exit when v_x = 5;
end loop;

DBMS_OUTPUT.PUT_LINE('loop completed, x is ' || v_x);

--continue

v_x := 0;

loop
v_x := v_x + 1;

if v_x = 3 then
DBMS_OUTPUT.PUT_LINE('3');
continue;
end if;

DBMS_OUTPUT.PUT_LINE('nothing special (' || v_x || ')');
exit when v_x = 5;
end loop;
DBMS_OUTPUT.PUT_LINE('loop/continue completed');

--continue/when
v_x := 0;
loop
v_x := v_x + 1;

continue when v_x = 3;
DBMS_OUTPUT.PUT_LINE('nothing special (' || v_x || ')');
exit when v_x = 5;
end loop;
DBMS_OUTPUT.PUT_LINE('loop/continue completed');

--while loop
v_x := 0;
while v_x < 5 loop
v_x := v_x + 1;
DBMS_OUTPUT.PUT_LINE('while ' || v_x || ' is less than five');
end loop;
DBMS_OUTPUT.PUT_LINE('while loop completed');

--for loop
for i in 1..5 loop
DBMS_OUTPUT.PUT_LINE('for ' || 1 || ' loop');
end loop;

for i in reverse 1..5 loop
DBMS_OUTPUT.PUT_LINE('reverse for ' || 1 || ' loop');
end loop;
end;
/

