<%-- 
    Document   : NdivJafet
    Created on : 30/09/2020, 12:41:38 PM
    Author     : thania
--%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>   
        <!--CODIGO DE BRAYAN-->
        <h1>Multiplos 3 Brayan</h1>
        <%!
            public ArrayList multiplos(int[] numbers, int divisor){
                ArrayList divisibles = new ArrayList();
                for(int number:numbers) if(number%divisor == 0)divisibles.add(number);
                return divisibles;
            }
        %>
        
        <%! int[] lista = {3, 5, 12, 43, 56, 78, 2, 43, 8}; %>
        Los numeros divisibles entre 3 de la lista <%= Arrays.toString(lista) %> son <%= multiplos(lista,3) %> <br>
        Los numeros divisibles entre 5 de la lista <%= Arrays.toString(lista) %> son <%= multiplos(lista,5) %>
    </body>
</html>
