--PL/SQL
--per il blocco si usano
--begin --apri un blocco
--end;--chiudi un blocco
--all'interno possimao mettere il codice
--prima del blocco occorre scrivere set SETTATA A ON per avere la stampa in console
--per eseguire lo script pl/sql occorre inserire lo slash /

set SERVEROUTPUT ON;

declare
    v_width integer;
    v_height integer := 2; --nel caso di assegnamento :=  ... inizializzami la variabile a 2
    v_area integer :=6;
begin
    v_width := v_area / v_height;
    DBMS_OUTPUT.PUT_LINE('Hello from PL/SQL' || v_width);
end;
/

--PER SALVARLO IN MODO DA ESEGUIRLO SULLA RIGA DI COMANDO, ANDIAMO SULLA DIRECTORY

--possiamo anche aggiungere l'uso delle variabili
--per usare le variabili bisogna aggiungere prima di begin (declare)

--exception
declare
    v_width integer;
    v_height integer := 0; --nel caso di assegnamento :=  ... inizializzami la variabile a 2
    v_area integer :=6;
begin
   v_width := v_area / v_height;
    DBMS_OUTPUT.PUT_LINE('Hello from PL/SQL' || v_width); 
EXCEPTION
    WHEN zero_divide then --se conosciamo l'errore, corrispondo al catch in java
         DBMS_OUTPUT.PUT_LINE('Can''t divide by zero!');  
    WHEN others then --per dire catch exception, prendimi tutte le eccezioni in PL/SQL:
        DBMS_OUTPUT.PUT_LINE('An exception occurred');
end;
/

--come fare a gestire la logica per trasformare sql in un linguaggio di programmazione
--conditional logic
declare
    v_a integer := -1;
    v_b integer := 2;
begin
--controlla a se è maggiore di zero e stampa qualcosa, controlla b e se è maggiore di zero stampa qualcosa
    if v_a > 0 then--il blocco comincia qui dove c'è la clausola da verificare e finirà dove finisce end if
        DBMS_OUTPUT.PUT_LINE('a is positive');
        if v_b > 0 then
        DBMS_OUTPUT.PUT_LINE('b is positive');
        end if; --quello che faccimao quando la clausola indicata dall'if è vera
  elsif v_a = 0 then --altrimenti se a è = 0, stampiamo qualcos'altro
        DBMS_OUTPUT.PUT_LINE('a is zero');
  else  --altrimenti stampiamo altro ancora
    DBMS_OUTPUT.PUT_LINE('a is negative');
  end if;
end;
/
--che succede se a è = 0

--ORA VEDIAMO COME SI COMPORTA IL (LOOP)
--il più semplice in sql si chiama loop, avremo bisogno di almeno una variab quindi dichiariamola
declare
    v_x integer;
begin
--inizializziamo la variab
    v_x := 0;
    loop
    v_x := v_x +1;       --voglio incrementare x di 1, loopo su x incrementando alla fine stampo v_x
    exit when v_x = 5;   --= singolo sta per CONFRONTO
 end loop;
 
    DBMS_OUTPUT.PUT_LINE('loop/continue completed');
    
    --ALL'INTERNO DEI LOOP POSSIAMO USARE IL COSTRUTTO CONTINUE CHE MI DICE SEMPLIC DI PASSARE AL COSTRUTTO SUCCESSIVO
    --***************CONTINUE******************
    v_x := 0;
    loop
    v_x := v_x +1;
    
    if v_x = 3 then
        DBMS_OUTPUT.PUT_LINE('3!');
        continue; --non eseguire il resto del loop vai all'iteraz successiva ritorna all'inizio del loop
        end if;
        
        DBMS_OUTPUT.PUT_LINE('nothing special (' || v_x || ')');
        exit when v_x = 5;
    end loop;
     DBMS_OUTPUT.PUT_LINE('loop/continue completed');
     ------------------------------------------------
     
     --******************CONTINUE/WHEN**********************

    v_x := 0;
    loop
    v_x := v_x +1;
    
    continue when v_x = 3; --non fare nulla di quello che segue, saltiamo al loop
        DBMS_OUTPUT.PUT_LINE('nothing special (' || v_x || ')');
        exit when v_x = 5;
    end loop;
    
     DBMS_OUTPUT.PUT_LINE('loop/continue-when completed');
    --------------------------------------------------- 
     --*********************while loop***************************************************************************
     --per fare un incremento normalmente preferiamo fareil for loop
     
     v_x := 0;
     
     
     while v_x < 5 loop --mi incrementa v_x
        v_x := v_x +1;---:= assegna
     DBMS_OUTPUT.PUT_LINE('while ' || v_x ||' is less than five');   
     end loop;
     DBMS_OUTPUT.PUT_LINE('while loop completed');
     
  ---*********************FOR LOOP*********************************************************************************
  --
  for i in 1..5 loop   --è come se fosse un for each e mi viene loop in questo intervallo, che indico con un num di inizio e fine
  DBMS_OUTPUT.PUT_LINE('for ' || i ||' loop'); 
  end loop;
  
  --loop al contrario 
  for i in reverse 1..5 loop
  DBMS_OUTPUT.PUT_LINE('for ' || i ||' loop');
  end loop;
end;
/
