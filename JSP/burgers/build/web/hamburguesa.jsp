<%-- 
    Document   : hamburguesa
    Created on : 4/11/2020, 01:06:16 PM
    Author     : thania
--%>
<%@page import="venta.*" %>
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
        <h1>Ticket</h1>
                <!--Nombre-->
                <%                
                int edad = (Integer.parseInt(request.getParameter("edad")));
                String tamano = request.getParameter("gridRadios");
                int precio = pedidos.tam(tamano);
                String llevar = request.getParameter("gridCheck1");                                
         %>
        <div class="card" style="width: 20rem; margin: 0 auto;">
             <div class="card-body">
                 <h5 class="card-title">Nombre: <%out.print(request.getParameter("nombre"));%></h5><br>
                        <h6 class="card-subtitle mb-2 text-muted">Apellidos: <%out.println(request.getParameter("apellido"));%></h6>                        
                        <p class="card-text">Edad: <% out.print(edad);%> años</p>
                        <p class="card-text">Tama&ntilde;o: <%
                                String[] tam = request.getParameterValues("gridRadios");
                                for(int n=0; n < tam.length; n++){
                                    String tama = tam[n];
                                    out.print(tama + "<br>");
                                }%> </p>                    
                        <p class="card-text">Que lleva su burger: <%
                            String [] lle = request.getParameterValues("gridCheck1");
                    if(lle !=null){
                    for(int n=0;n < lle.length; n++){
                        if(lle[n].matches("Jitomate")){
                            out.print("Jitomate " + "<br>");
                        }
                        if(lle[n].matches("Cebolla")){
                            out.print("Cebolla " + "<br>");
                        }
                        if(lle[n].matches("Mostaza")){
                            out.print("Mostaza " + "<br>");
                        }
                        if(lle[n].matches("Captsu")){
                            out.print("Captsu " + "<br>");
                        }
                        if(lle[n].matches("Chile")){
                            out.print("Chile " + "<br>");
                        }
                       
                    %></p> 
                        
                        <%
                    }
                    
                }else{
                    out.print("No ah seleccionado nada");  
                }
                
                    %>
                    <h3>Precio: </h3>
                    $<%out.print(pedidos.des(edad, precio, llevar));%>
                    
                        
             </div>
         </div>                
                        
        
        
        
        
        
        
        
        
        
    </body>
</html>
