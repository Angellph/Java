<%-- 
    Document   : NdivisibleYuleidi
    Created on : 30/09/2020, 12:34:46 PM
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
        <!--Codigo de Yuleidi-->
        <h1>De una lista de numeros determinar cual de ellos es divisible entre tres</h1>
        <%!
        private int DIV;
        public String DIVITRES(int[]numero){
            int total =(int)numero.length;
            String resultado=""; 
            for(int i=0;i<total;i++){
                if(numero[i]%3==0){
                    resultado=resultado+numero[i]+ "      "; 
                }
            }
            return resultado;  
        }
        int []misnumeros={2,3,4,5,6,9,10,15,20,28,30,33,40,45,50,56,60}; 
        %>
           Numeros: <%
        for(int m=0;m<misnumeros.length;m++){
            out.print(misnumeros[m]+",");
        }
        %> <br><br>
        <b>El número proporcional es</b><%= DIVITRES(misnumeros)%><br>
        
    </body>
</html>
