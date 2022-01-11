<%-- 
    Document   : brayan1
    Created on : 30/09/2020, 01:29:35 PM
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
        <h1>--Ejercicio de Brayan--</h1>
        <p> Realiza un programa que te permita saber la cantidad de veces que se repite cada letra dentro 
            de una cadena.
        </p>
             
    <% 
    String cadena="equis";
        char caracter;    
        char [] Araycadena ;
        
            Araycadena=cadena.toCharArray();

                boolean[] Caracterp = new boolean[Character.MAX_VALUE];
                int[] LVeces = new int[Character.MAX_VALUE];

                for(int x = 0; x<Araycadena.length; x++){
                    caracter = Araycadena[x];            
                    if(Araycadena[x] == caracter){
                        LVeces[caracter]++;
                    }
                    Caracterp[caracter] = true;
                }


                for(int i = 0; i <Caracterp.length; i++){
                    if(Caracterp[i])
                       out.print((char) i +"  - - - "+LVeces[i]+"  vez o veces."+"<br>");
                }
     %> 
    </body>
</html>
