<%-- 
    Document   : ResFactorial
    Created on : 15/10/2020, 05:41:29 PM
    Author     : thania
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body>
        <a href="index.jsp"><img src="img/flechita.png" width="100" ></a>
        <h1>Resultado del numero </h1>
        <%  
        double NFactor = 1;    
        double num=Double.parseDouble(request.getParameter("numero"));                
        while(num!=0){
            NFactor = NFactor * num;
            num--;
        }        
        %>
        <table style="margin: 0 auto;">
            <% out.print("<tr>"
                    +"<td>El factorial de " 
                    + request.getParameter("numero")
                    +" es </td><tr>");%>
                    <% out.print("<tr><td>"
                    +NFactor);%> 
        </table>
        
    </body>
</html>
