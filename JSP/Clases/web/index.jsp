<%-- 
    Document   : index
    Created on : 7/10/2020, 12:29:29 PM
    Author     : thania
--%>
<%@page import="Clase.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Metodos con clases</title>
    </head>
    <body>
        <h1>Operaciones basicas con metodos y clases</h1>
        Llamada a metodos
        Suma <% out.print(Calculos.medotoSuma(7, 8)); %><br>
        Resta <% out.print(Calculos.metodoResta(7, 8)); %><br>
        Multiplicacion <% out.print(Calculos.metodoMulti(7, 8)); %><br>
        Division <% out.print(Calculos.metodoDiv(7, 8)); %><br>                                                                                                                                                
        <p>-----------------------------------------------------------------------------------------------------------------</p>
        <h1>¿Quien es el ganador de la presidencia municipal de Ranchopan?</h1>
        Llamada a metodos <br>             
        El partido ganador con <% out.print(Elecciones.   Partidos(30,150,50,200)); %> votos es: <% out.print(Elecciones.DeterminarPartidos(30,150,50,200)); %><br>              
    </body>
</html>
