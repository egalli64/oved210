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

-- exception
declare
    v_width integer;
    v_height integer := 0;
    v_area integer := 6;
begin
    v_width := v_area / v_height;
    DBMS_OUTPUT.PUT_LINE('width is ' || v_width);
EXCEPTION WHEN zero_divide then
    DBMS_OUTPUT.PUT_LINE('Can''t divide by zero!');
end;
/

-- catch all exceptions
declare
    v_width integer;
    v_height integer := 0;
    v_area integer := 6;
begin
    v_width := v_area / v_height;
    DBMS_OUTPUT.PUT_LINE('width is ' || v_width);
EXCEPTION
    WHEN zero_divide then
        DBMS_OUTPUT.PUT_LINE('Can''t divide by zero!');
    WHEN others then
        DBMS_OUTPUT.PUT_LINE('An exception occurred');
end;
/

-- conditional logic
declare
    v_a integer := -1;
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


-- loop
declare
    v_x integer;
begin
    v_x := 0;
    loop
        v_x := v_x + 1;
        exit when v_x = 5;
    end loop;

    DBMS_OUTPUT.PUT_LINE('loop completed, x is ' || v_x);

    -- continue
    v_x := 0;
    loop
        v_x := v_x + 1;
        
        if v_x = 3 then
            DBMS_OUTPUT.PUT_LINE('3!');
            continue;
        end if;
        
        DBMS_OUTPUT.PUT_LINE('nothing special (' || v_x || ')');
        exit when v_x = 5;
    end loop;
    
    DBMS_OUTPUT.PUT_LINE('loop/continue completed'); 
    
    -- continue/when
    v_x := 0;
    loop
        v_x := v_x + 1;
        
        continue when v_x = 3;
        DBMS_OUTPUT.PUT_LINE('nothing special (' || v_x || ')');
        exit when v_x = 5;
    end loop;
    
    DBMS_OUTPUT.PUT_LINE('loop/continue-when completed'); 

    -- while loop
    v_x := 0;
    while v_x < 5 loop
        v_x := v_x + 1;
        DBMS_OUTPUT.PUT_LINE('while ' || v_x);
    end loop;
    DBMS_OUTPUT.PUT_LINE('while loop completed');
    
    -- for loop
    for i in 1..5 loop
        DBMS_OUTPUT.PUT_LINE('for ' || i || ' loop');
    end loop;
            
    -- for loop
    for i in reverse 1..5 loop
        DBMS_OUTPUT.PUT_LINE('reversed for ' || i || ' loop');
    end loop;
end;
/
