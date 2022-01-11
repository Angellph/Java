<%-- 
    Document   : index
    Created on : 24/09/2020, 11:17:37 AM
    Author     : thania
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web</title>
    </head>
    <body>
        <h1>Scriptles</h1>
        <h3>Tabla del 5</h3>
        <%
            for(int i=1; i <=10; i++){
                out.print ("5 * " + i +" = "+ 5 * i + "<br>");
            }            
          %>
          <h3>Tabla del 8</h3>
          <%
            int i = 1;
            while(i <=10){
                out.print("8 * " + i +" = "+ 8 * i + "<br>");
                i++;
            }
            out.print( i );
          %>
          <h3>Tabla del 9</h3>
          <%
              if(i > 10)
              {
                  i = 1;
                  do{
                      out.print("9 * " + i +" = "+ 9 * i + "<br>");
              i++;
                  }while (i <=10);
              }
          %>
          <h3>Tabla de 4</h3>
          <%
              switch(i){
                  case 1:
                      i = 1;
                      do{
                          out.print("4 * " + i +" = "+ 4 * i + "<br>");
                          i++;                          
                      }while (i<=10);
                      break;
                  default:
                      out.print("Estas son todas las tablas");
              }
              %>            
    </body>
</html>
