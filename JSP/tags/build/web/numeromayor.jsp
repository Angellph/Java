<%-- 
    Document   : numeromayor
    Created on : 28/09/2020, 11:49:48 AM
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
        <h3>¿Que numero es mayor?</h3>
        <%!
        private int mayor;

        public void Nmayor(int num, int num2, int num3){
        if(num>num2 && (num>num3)){
        mayor = num;
        }
        else{
        if(num2>num && (num2>num3)){
        mayor = num2;
        }    
        }     
        if(num3>num2 && (num3>num)){
        mayor = num3;
        }        
     }
        %>        
        El numero mayor entre 10, 46 y 1 es <% Nmayor(10,46,1);
        out.print(mayor);
        %><br>  
        
    </body>
</html>
