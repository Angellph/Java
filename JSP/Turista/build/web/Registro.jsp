<%-- 
    Document   : Registro
    Created on : 19/10/2020, 12:20:23 PM
    Author     : thania
--%>

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
        <jsp:include page="Encabezado.html" ></jsp:include><br><br><br><br><br><br>
        <a href="index.jsp"><img src="img/flechita.png" width="100" ></a>
        <h1>Usuario registrado</h1>   
        <%  String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String dias = request.getParameter("dias");
                String gridRadios = request.getParameter("gridRadios");
                String[]gridCheck1= request.getParameterValues("gridCheck1");
                String[]select= request.getParameterValues("select");
            %>
        <div class="card" style="width: 20rem; margin: 0 auto;">
                    <div class="card-body">
                        <h5 class="card-title"><%out.println("Nombre: "+nombre+"<br/>");%></h5><br>
                        <h6 class="card-subtitle mb-2 text-muted"><%out.println("Apellidos: "+apellido+"<br/>");%></h6>
                        <p class="card-text"><%out.println("Dias: ");
                            for(int i=0;i<select.length;i++){
                                out.println("<pre>"+select[i]+"</pre>");
                                }%>
                        </p>
                        <p class="card-text"><%out.println("Tipo de transporte: "+gridRadios+"<br/>");%>
                        <p class="card-text"><%out.println("Destino: ");
                            for(int i=0;i<gridCheck1.length;i++){
                                out.println("<pre>"+gridCheck1[i]+"</pre>");
                            }%>
                        </p>
                    </div>
                </div>
        <jsp:include page="Footer.html"></jsp:include>
    </body>
</html>
