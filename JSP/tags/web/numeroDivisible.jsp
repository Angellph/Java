<%-- 
    Document   : numeroDivisible
    Created on : 28/09/2020, 12:17:02 PM
    Author     : thania
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Declaraciones y metodos</title>
    </head>
    <body>
        <h3>¿Que numeros son divisibles entre 3?</h3>
            
        <%!
          private int divisible;          
          
          public void div(int num, int num2, int num3, int num4, int num5 ){                        

            if(num % 3 == 0){
                divisible = num;
            }
            if(num2 % 3 == 0){
                divisible = num2;
            }
            if(num3 % 3 == 0){
                divisible = num3;
            }
            if(num4 % 3 == 0){
                divisible = num4;
            }
            if(num5 % 3 == 0){
                divisible = num5;
            }            
          }
        %>               
        Entre estos 5 numeros 10, 46, 7, 5, 9 cual es divisible entre 3?<br> <% div(10,46,7,5,9);
        out.print(divisible);
        %><br> 
    </body>
</html>
