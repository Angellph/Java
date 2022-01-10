<%-- 
    Document   : Examenirvig
    Created on : 8/10/2020, 12:21:12 PM
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
        <%!
            public String calcularBeca(double promedio,int edad){
                String beca = "0";
                if(edad>18){
                    if(promedio>=9){
                        beca = "2000";
                    }
                    if((promedio<9)&&(promedio>=7.5)){
                        beca = "1000";
                    }
                    if((promedio<7.5)&&(promedio>=6)){
                        beca = "500";
                    }
                    if(promedio<6){
                        beca = "No fuiste aprovado para recibir beca este año, Estudia mas el proximo año";
                    }
                }
                if((edad<=18)&&(edad>0)){
                    if(promedio>=9){
                        beca = "3000";
                    }
                    if((promedio<9)&&(promedio>=8)){
                        beca = "2000";
                    }
                    if((promedio<8)&&(promedio>=6)){
                        beca = "1000";
                    }
                    if(promedio<6){
                        beca = "No fuiste aprovado para recibir beca este año, Estudia mas el proximo año";
                    }
                }
                if(edad<=0){
                    beca = "Edad ingresada no valida";
                }
                return beca;
            }
            public double calcularPromedio(double calif1,double calif2,double calif3){
                double total = 0;
                total = calif1 + calif2 + calif3;
                total = total/3;
                return total;
            }
        %>
        <h1>El presidente de la republica ha decidido estimular a todos los estudiantes de una universidad mediante la asignacion de becas mensuales</h1>
        <% int edad = 17; %>
        <% int cali_1 = 4,cali_2 = 5, cali_3 = 3; %>
        <h2>Edad: <%= edad %> </h2>
        <h2>Promedio: <%= calcularPromedio(cali_1,cali_2,cali_3)%> </h2>
        <h3>Beca: <%= calcularBeca(calcularPromedio(cali_1,cali_2,cali_3),edad)%>
    </body>
</html>
