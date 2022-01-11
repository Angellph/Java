<%-- 
    Document   : BrayanYJavier
    Created on : 5/10/2020, 04:05:38 PM
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
        <h1>El de Javier</h1>
        <%!
            public int contarletras(String palabras, String ab) {
                int letra,nv = 0;
               
                letra = palabras.indexOf(ab);
                while (letra != -1) { 
                    nv++;
                    letra = palabras.indexOf(ab, letra + 1);
                }
                return nv;
            }
        %>
        
        <%
            String ab [] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w",
            "x", "y", "z"};
            String palabras = "Hola Amigos";
            out.print("La frase es: "+palabras+"<br><br>");
            palabras= palabras.toLowerCase();
            
            for(int abc = 0; abc < ab.length; abc++){
                int vecesLetra = 0;
                vecesLetra = contarletras(palabras, ab[abc]);
                if (vecesLetra != 0){
                    out.print("La letra " + " " + ab[abc] + " " + " se repite "
                    + vecesLetra + " veces" + "<br>");                   
                }
            }
            %>
            <p>-------------------------------------------------------------------------------</p>
            <h1>El de Irving</h1>
            <%!
                public static int[] identificador(String[] cadena){
                int [] value = new int[cadena.length];
                for(int x = 0; x<cadena.length; x++){
                    if((cadena[x].length()>30)||(cadena[x].equals("int"))||(cadena[x].equals("if"))||(cadena[x].equals("else"))||(cadena[x].equals("while"))||(cadena[x].equals("for"))){
                        value[x] = 0;
                    }else{
                        char letra = cadena[x].charAt(0);
                        if((letra == '_')||(Character.isLetter(letra))){
                            value[x] = 1;
                        }else{
                            value[x] = 0;
                        }
                    }
                }
                return value;
            }
%>
            <%
                String[]cadenas = {"Mexico","if","irving","while"};
                int[] value = identificador(cadenas);
                for(int x = 0; x<cadenas.length; x++){
                    out.print(cadenas[x] + " = " + value[x] + "<br>");
                }
%>                
                                                            


    </body>
</html>
