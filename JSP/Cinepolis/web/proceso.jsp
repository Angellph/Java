<%-- 
    Document   : proceso
    Created on : 28/10/2020, 12:35:19 PM
    Author     : thania
--%>
<%@page import="clases.*" %>
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
    <body><br>
        <a href="index.jsp" style="padding-left: 1em"><svg width="3em" height="3em" viewBox="0 0 16 16" class="bi bi-arrow-left-circle-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zm-4.5.5a.5.5 0 0 0 0-1H5.707l2.147-2.146a.5.5 0 1 0-.708-.708l-3 3a.5.5 0 0 0 0 .708l3 3a.5.5 0 0 0 .708-.708L5.707 8.5H11.5z"/>
  </svg></a>
        <%      String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");                
                String gridRadios1 = request.getParameter("gridRadios1");
                String [] pago = request.getParameterValues("gridCheck1");
                int AMayors = 50;
                int nino = 50;
                int maestro= 75;
         %>
         <div class="card" style="width: 20rem; margin: 0 auto;">
             <div class="card-body">
                 <h5 class="card-title"><%out.println("Nombre: "+nombre+"<br/>");%></h5><br>
                        <h6 class="card-subtitle mb-2 text-muted"><%out.println("Apellidos: "+apellido+"<br/>");%></h6>                        
                        <p class="card-text"><%out.println("Pelicula: "+gridRadios1+"<br/>");%> </p>                        
                        <p class="card-text"> <%
                    if(pago !=null){
                    for(int i=0;i<pago.length; i++){
                    if(pago[i].matches("Nino")){
                       out.print("Boleto: Nino, Pago:"+ calcular.ninos(nino) + "$<br>");
                    }%></p>
                        <p class="card-text"><%
                        if(pago[i].matches("Adultos mayores")){
                       out.print("boleto: Adultos mayores, Pago: " + calcular.AMayor(AMayors) + "$<br>");
                        }%></p>
                        <p class="card-text"><%
                        if(pago[i].matches("Maestros")){
                       out.print("Boleto: Maestros, Pago: " + calcular.Miss(maestro) + "$<br>");
                        }%></p>
                        <%
                    }
                }else
                out.print("No ah seleccionado nada");                                                                                                                                                    
                    %>
             </div>
         </div>
    </body>
</html>

