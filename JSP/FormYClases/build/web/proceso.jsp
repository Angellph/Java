<%-- 
    Document   : proceso
    Created on : 22/10/2020, 12:08:30 PM
    Author     : thania
--%>
<%@page import="Clases.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link  rel="stylesheet" href="css/estilos.css">        
        <script src="js/bootstrap.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </head>
    <body>
        <br>
        <a href="index.jsp" style="padding-left: 1em"><svg width="3em" height="3em" viewBox="0 0 16 16" class="bi bi-arrow-left-circle-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zm-4.5.5a.5.5 0 0 0 0-1H5.707l2.147-2.146a.5.5 0 1 0-.708-.708l-3 3a.5.5 0 0 0 0 .708l3 3a.5.5 0 0 0 .708-.708L5.707 8.5H11.5z"/>
  </svg></a>
        <% /*Recibimos los datos del form*/
            Integer n1 = Integer.parseInt(request.getParameter("numero1"));
            Integer n2 = Integer.parseInt(request.getParameter("numero2"));
            
                String [] operaciones = request.getParameterValues("operacion");
        %><br>
        <br>  <div class="card" style="width: 20rem; margin: 0 auto;">
                    <div class="card-body">
                        <h5 class="card-title"><%out.print("<h1> Resultados </h1>");%></h5><br>
                    <h6 class="card-subtitle mb-2 text-muted"><%
                    if(operaciones !=null){
                    for(int i = 0; i < operaciones.length; i++){
                    if(operaciones[i].matches("suma")){
                       out.print("Suma " + Calculos.medotoSuma(n1, n2) + "<br>");
                    }%></h6>
                    <p class="card-text"><%
                        if(operaciones[i].matches("resta")){
                       out.print("Resta " + Calculos.metodoResta(n1, n2) + "<br>");
                        }%></p>
                    <p class="card-text"><%if(operaciones[i].matches("multiplicacion")){
                       out.print("Multiplicacion " + Calculos.metodoMulti(n1, n2) + "<br>");
                    }%></p>
                    <p class="card-text"><%if(operaciones[i].matches("division")){
                       out.print("Division " + Calculos.metodoDivi(n1, n2) + "<br>");
                    }%></p>
                        <%
                    }
                }else
                out.print("No hay operaciones seleccionadas");                                                                                                                                                    
                    %>
                    </div>
                </div>
    </body>
</html>
