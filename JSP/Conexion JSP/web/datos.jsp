<%-- 
    Document   : datos
    Created on : 18/11/2020, 01:12:17 PM
    Author     : thania
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link  rel="stylesheet" href="css/estilos.css">        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </head>
    <body><a href="index.jsp" style="padding-left: 1em"><svg width="3em" height="3em" viewBox="0 0 16 16" class="bi bi-arrow-left-circle-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zm-4.5.5a.5.5 0 0 0 0-1H5.707l2.147-2.146a.5.5 0 1 0-.708-.708l-3 3a.5.5 0 0 0 0 .708l3 3a.5.5 0 0 0 .708-.708L5.707 8.5H11.5z"/>
  </svg></a>
        <%
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String edad = request.getParameter("edad");
            String domicilio = request.getParameter("domicilio");
            
            String driver = "com.mysql.jdbc.Driver";
            
            try{
                Class.forName(driver);
            }catch (Exception e){
                System.out.println("Error de driver, " + e.getMessage());
            }
            
            java.sql.Connection conexion = java.sql.DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            
             java.sql.Statement sentencias = conexion.createStatement();
            try {
                if (conexion != null) {
                    String instruccionSQL = "INSERT INTO clientes (nombre, apellidos, edad, domicilio) VALUES('" + nombre + "','" + apellidos + "','" + edad + "','" + domicilio + "') ";
                    sentencias.execute(instruccionSQL);
                    request.getRequestDispatcher("mostrar.jsp").forward(request, response);
                    
                }
            } catch (Exception e) {
                System.out.println("There was an error when tried insert into table " + e);
            }%>
            <div class="alert alert-success alert-dismissible fade show col-12" role="alert" >
                <strong>Registrado correctamente</strong> Yupi!.
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <%
            request.getRequestDispatcher("mostrar.jsp").forward(request, response);
            %>
            
        
    </body>
</html>
