<%-- 
    Document   : numerosPrimos
    Created on : 24/09/2020, 07:55:16 PM
    Author     : thania
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web</title>
    </head>
    <body>
        <h1>Numero primos (Ejercicio de Hendrick)</h1>
        <%
            out.print("Numeros primos<br>");

 int i, numero, end, start;
 boolean Nprimo=true; 
 
 start=2; 
 end=18;
 
 numero=start;
do{
     i=2; 
          Nprimo=true; 
    do{       
       while (numero%i==0){ 
        Nprimo=false;   
        break;         
       }
       i=i+1;
     
    }while(i<numero);
  while(Nprimo){ 
  out.print(numero+"<br>"); 
  break;
  }
numero=numero+1;
}while (numero<=end);

out.print(numero); 

for (int a = 1; a < 18; a++) {
      out.print("<br>La tabla del: " + a + "<br>");
            for (int x=1; x<=10; x++) {
                //int num:0;
            out.print(a  + "     X     " + x + "       =      " + a* x + "   <br>    ");
          }
      }
switch(numero){
    default: 
        out.print("<br><br>El número primo se excedido del limitr");     
}
        %>
    </body>
</html>
