<%-- 
    Document   : brayan2
    Created on : 30/09/2020, 07:27:59 PM
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
        <h1>Identificador</h1>
        <p>Un identificador es una cadena que empieza con guión bajo, letras, además de no ser una 
              palabra reservada (tomaremos como palabras reservadas int, if, else, while, for).                                                             
              Escribe un programa que lea una cadena e indique si es o no un identificador. 
              Entrada la cadena máximo de 30 caracteres, Salida: 1 si es identificador, 0 si no lo es</p>
        <%!
            public int res;
            String resu;
            public int iden(String cadena) {
                res = 0;
                resu="";
                if (cadena == "if" || cadena == "int" || cadena == "else" || cadena == "while" || cadena == "for") {
                    res = 0;
                    resu="Es una palabra reservada";
                } else if (cadena.startsWith("_")) {
                    res = 1;
                    resu="";
                }
                
                return res;
            }
            
        %>
        <table border="1" style="margin: 0 auto;">
            <tr>
             <th>Palabra</th>
             <th>Identificador</th>
        </tr>
         <tr>
    <td>Angel</td>
    <td><%=iden("Angel")%><%out.print("  "+resu);%></td>
         </tr>
         <tr>
     <td>Melon</td>
    <td><%=iden("Melon")%><%out.print("  "+resu);%></td>
  </tr>
  <tr>
     <td>Mundo</td>
    <td><%=iden("_Mundo")%><%out.print("  "+resu);%></td>
  </tr>
        </table>
    </body>
</html>
