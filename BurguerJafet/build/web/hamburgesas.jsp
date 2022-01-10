<%-- 
    Document   : hamburgesas
    Created on : 4/11/2020, 03:00:18 PM
    Author     : thania
--%>
<%@page import="puesto.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        int edad=(Integer.parseInt(request.getParameter("edad")));
        String nombre=(request.getParameter("nombre"));
        String tamaño=(request.getParameter("tamaño"));
        String domicilio=(request.getParameter("dom"));
        %>
        Nombre:<br><% out.print(nombre);%> <br><br>
        Edad:<br><% out.print(edad);%><br><br>
        Ingredientes: <br><%
        for(int i=0; i<=8; i++){
           if (request.getParameter("i" + i) == null) {
                } else {
                    out.print(request.getParameter("i" + i));
                    out.print("<br>");
                }
                
        }
        %>
        <br><br>
        Llevar a domicilio:<br><% out.print(domicilio);%><br><br>
        Precio:<br><% out.print((calculo.calculo(edad, tamaño, domicilio)));%><br><br>
    </body>
</html>
