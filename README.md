# Calculator

## Introduktion
Skapa en enkel miniräknare som beräknar de fyra räknesätten
enligt kravspecifikationen nedan!

## Kravspecifikation!
1. Du måste läsa in ett matematiskt uttryck som en enda sträng.
Exempel på giltiga uttryck: 1+2 , -200-100 , 2*5.5 , 10/2  <br/> <br/>
2. Skriv testkod för att testa ogiltiga uttryck och visa felmeddelanden i terminalen. <br/>
   - Uttrycket får inte vara tomt. Visa ett lämpligt felmeddelande.
   - Uttrycket måste innehålla en av följande operatorer: +, -, *, / <br/>
     Följande uttryck är t.ex. ogiltiga: <br/>
     10%12 (modulus/procent)<br/>
     1234 (ingen operator alls)<br/>
     Visa ett felmeddelande om en giltig operator saknas!
   - Uttrycket måste innehålla två operander och en operator.<br/>
     Uttrycket får alltså inte innehålla flera operatorer t.ex. 1+2*2 <br/>
     och inte heller en enda operand t.ex. 5/ eller *3<br/>
     Operanderna måste vara reella tal t.ex. 3, -5, 4.5, -1.5 (ej andra tecken)<br/>
     Visa ett lämpligt felmeddelande vid fel.<br/>  
   - Man får inte dividera med 0. Visa ett lämpligt felmeddelande.<br/>  <br/>
3. OBS! Du får inte använda RegEx för att testa uttrycket.
Använd metoder i klasserna String, Character och Double.<br/>  <br/>
4. Använd selektioner och iterationer för att lösa uppgiften.  <br/> <br/>
5. Du får inte använda arrayer!
