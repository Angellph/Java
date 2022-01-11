<%-- 
    Document   : factorial
    Created on : 24/09/2020, 12:02:06 PM
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
        <h1>Numero factorial</h1><br>
        <% 
        int Nfactorial = 15 ,Factorial = 1 ;        
        for(int x=Nfactorial; x>1; x--){
            Factorial = Factorial * x;              
        }
        %>
        <%=
            " El factorial del numero " + Nfactorial + " es: " +Factorial        
        %>     
    </body>
</html>
