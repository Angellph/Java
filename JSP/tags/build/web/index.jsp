<%-- 
    Document   : index
    Created on : 28/09/2020, 11:17:04 AM
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
        <h4>Suma, resta, multiplicacion y division</h4>
        <%!
          private int resultado;

          public int suma (int num, int num2){
                resultado = num + num2;
                return resultado;
          }
          public int resta(int num, int num2){
                resultado = num - num2;
                return resultado;
          }
          public int multi(int num, int num2){
                resultado = num * num2;
                return resultado;
          }
          public int divi(int num, int num2){
                resultado = num / num2;
                return resultado;
          }                       
        %>
        El resultado de la suma es <%= suma(5,8) %><br>                                  
        El resultado de la resta es <%= resta(5,8) %><br>
        El resultado de la multiplicacion es <%= multi(5,8) %><br>
        El resultado de la division es <%= divi(5,8) %><br>
        
        
    </body>
</html>
