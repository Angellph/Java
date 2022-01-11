<%-- 
    Document   : tablas
    Created on : 30/09/2020, 12:53:22 PM
    Author     : thania
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <!--Tablas de la Profesora -->
        <%!
            public int numeros[] = {10, 8, 5, 3, 6, 9, 21, 84};
            public int nElem = numeros.length;
        %>
        <table border="1">
            <%
                out.print("<tr><td>" + "Numeros" + "</td><td> </td><td>" + "Divisible");
                for (int i = 0; i < nElem; i++){
                    out.print("<tr><td>" + numeros[i] + "</td><td></td><td>" + divisible(numeros[i]));
                }
            %>
        </table>
        <%!
            public boolean divisible(int numero){
            boolean divis = false;
            if (numero % 3 == 0){
                divis = true;                
            }
            return divis; 
         }
                
        %>             
    </body>
</html>
