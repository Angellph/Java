<%-- 
    Document   : examen
    Created on : 8/10/2020, 11:12:47 AM
    Author     : thania
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title>JSP Page</title>
        <link rel="stylesheet" href="Css/estilos.css" type="text/css">
    </head>
    <body>
        <h1>Examen</h1>
        <%!           
            private double prom;            
                public double cali(int cal1, int cal2){
                    prom = (cal1 + cal2) / 2;
                    return prom;
                }
                public String e(int edad, double prom){
                    String b = "0";
                    if(edad>18 && prom>=9){
                     b = "$2000";
                    }
                    if(edad>18 && prom>=7.5 && prom<9){
                        b = "1000";
                    }
                    if(edad>18 && prom>=6 && prom<7.5){
                        b = "500";
                    }
                    if(edad<=18 && prom>=9){
                         b = "3000";
                    }
                    if(edad<=18 && prom>=8 && prom<9){
                        b = "2000";
                    }
                    if(edad>18 && prom>=6 && prom<8){
                        b = "100";
                    }
                    if(prom<6){
                        b = "Te invitamos a estar mas al pendiente para tener una beca, gracias.";
                    }
                    return b;                    
                }
        %>         
         Su calificacion es : <%= cali(9,8) %><br>
         Informacion de beca : <%= e(19,cali(9,8) )%><br>
         
        
        
    </body>
</html>
