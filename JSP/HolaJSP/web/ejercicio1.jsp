<%-- 
    Document   : ejercicio1
    Created on : 23/09/2020, 01:05:18 PM
    Author     : thania
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio</title>
    </head>
    <body>
        <h1>Ejercicio 1</h1>
        La fecha actual <%= new java.util.Date() %> <br>
         <% int numero = (int) (Math.random()*10+1); %>
         Numero aleatorio <%= numero %> <br>
         Raiz del: <%= numero%> es: <%= Math.sqrt(numero)%> <br>
         
        
        
    </body>
</html>
