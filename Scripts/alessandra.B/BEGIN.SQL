--PL/SQL

SET SERVEROUTPUT ON;

DECLARE 
V_WIDTH INTEGER;
V_HEIGHT INTEGER := 0;
V_AREA INTEGER:=6;

BEGIN 
V_WIDTH := V_AREA/ V_HEIGHT;
   DBMS_OUTPUT.PUT_LINE('WIDTH IS '|| V_WIDTH);
   EXCEPTION 
   WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('AN EXCETION OCCURED');
   WHEN ZERO_DIVIDE THEN
    DBMS_OUTPUT.PUT_LINE('CANT''T DIVIDE BY ZERO!');
    
END;
/

DECLARE
V_A INTEGER:= 0;
V_B INTEGER:= 2;

 BEGIN
 IF V_A > 0 THEN 
      DBMS_OUTPUT.PUT_LINE('A IS POSITIVE');
      IF V_B > 0 THEN
        DBMS_OUTPUT.PUT_LINE('B IS POSITIVE');
      END IF;
      
  ELSIF V_A = 0 THEN
       DBMS_OUTPUT.PUT_LINE('A IS ZERO');
 END IF;
 END;
 /
 
 
 --LOOP
 
DECLARE
    V_X INTEGER;
BEGIN
    V_X := 0;

    LOOP
        V_X := V_X +1;
        EXIT WHEN V_X = 5; -- L'UGUALE SENZA : STA PER CONFRONTO   
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('LOOP COMPLETED,X IS '||V_X);
    
    --CONTINUE
    
    V_X := 0;
 
    LOOP
        V_X := V_X +1;
        IF V_X = 3 THEN 
            DBMS_OUTPUT.PUT_LINE('3!');
            CONTINUE; -- non eseguire il resto del loop ma eseguisci l'iterazione successiva
        END IF;
        
        DBMS_OUTPUT.PUT_LINE('NOTHING SPECIAL ('|| V_X|| ') ');
        EXIT WHEN V_X = 5;    
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('LOOP CONTINUE COMPLETED');
END;
/

DECLARE
    V_X INTEGER;
BEGIN
    V_X := 0;

    LOOP
        V_X := V_X +1;
        EXIT WHEN V_X = 5; -- L'UGUALE SENZA : STA PER CONFRONTO   
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('LOOP COMPLETED,X IS '||V_X);
    
    --CONTINUE
    
    V_X := 0;
 
    LOOP
        V_X := V_X +1;
        
         CONTINUE WHEN V_X =3; -- non eseguire il resto del loop ma eseguisci l'iterazione successiva
         DBMS_OUTPUT.PUT_LINE('NOTHING SPECIAL ('|| V_X|| ') ');
         EXIT WHEN V_X = 5;    
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('LOOP CONTINUE COMPLETED');
    
    -- WHILE LOOP

V_X := 0;

    WHILE V_X <5 LOOP
    
        V_X := V_X +1;
        DBMS_OUTPUT.PUT_LINE('WHLE '||V_X||' IS LESS THAN FIVE');
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('WHILE LOOP COMPLETED');
    
    --FOR LOOP
    FOR I IN 1..5 LOOP --PER TUTTI I VALORI DI I TRA 1 E 5 
      DBMS_OUTPUT.PUT_LINE('FOR '||I||' LOOP');
    END LOOP;
END;
/
