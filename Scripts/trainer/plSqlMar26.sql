-- PL/SQL
set SERVEROUTPUT ON;

-- minimal pl/sql block
begin
    DBMS_OUTPUT.PUT_LINE('Hello from PL/SQL');
end;
/

-- declaring variables
declare
    v_width integer;
    v_height integer := 2;
    v_area integer := 6;
begin
    v_width := v_area / v_height;
    DBMS_OUTPUT.PUT_LINE('width is ' || v_width);
end;
/
