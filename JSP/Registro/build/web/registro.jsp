<%-- 
    Document   : registro
    Created on : 15/10/2020, 11:28:13 AM
    Author     : thania
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario registrado</title>
        <link rel="stylesheet" href="css/estilos.css">
        
    </head>
    <body>
        <a href="index.jsp"><img src="img/flechita.png" width="100" ></a>
        <h1>Usuario registrado</h1>
        <table class="table table-sm table-hover table-bordered table-responsive-lg" style="margin: 0 auto;" >
            <% out.print("<tr>"
                    +"<td>Nombre: </td>"
                    +"<td>Apellidos: </td>"
                    +"</tr>");%>
                    <% out.print("<tr><td>"
                            + request.getParameter("nombre")
                            +"</td><td>"+request.getParameter("apellido")
                            +"</td></tr>");%>            
        </table>
        
    </body>
</html>
