<%-- 
    Document   : mostrar
    Created on : 19/11/2020, 11:48:28 AM
    Author     : thania
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registros</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilos.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
        <!-- Font Awesome 
        <link rel="stylesheet" href="fontawesome-free/Css/all.css">        -->
    </head>    
    <body>
        <jsp:include page="nav.html" ></jsp:include><br><br><br><br><br><br>
        <br><a href="index.jsp" style="padding-left: 1em"><svg width="3em" height="3em" viewBox="0 0 16 16" class="bi bi-arrow-left-circle-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zm-4.5.5a.5.5 0 0 0 0-1H5.707l2.147-2.146a.5.5 0 1 0-.708-.708l-3 3a.5.5 0 0 0 0 .708l3 3a.5.5 0 0 0 .708-.708L5.707 8.5H11.5z"/>
  </svg></a>
        <br><br>

        <!--Tablita-->
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">Registros</h3>                
              </div>
              <!-- /.card-header -->
              <div class="card-body table-responsive p-0">
                <table class="table table-hover text-nowrap">
                  <thead>
                    <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Apellidos</th>
                    <th>Edad</th>
                    <th>Domicilio</th>
                    <th>Actualizar</th>
                    <th>Eliminar</th>
                    </tr>                   
                  </thead>
                  <%
                String driver = "com.mysql.jdbc.Driver";
                try{
                    Class.forName(driver);
                    Connection conexion = java.sql.DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    
                    if(conexion != null){
                        String sql = "select * from clientes";
                        Statement sentencias = conexion.createStatement();
                        
                        ResultSet rs = sentencias.executeQuery(sql);
                        //ponemos 
                        while (rs.next()){
                            %>
                            <tbody>
                                <tr>
                                    <th scope="row"><%=  rs.getObject("id") %> </th>
                                    <td><%= rs.getObject("nombre") %> </td>
                                    <td><%= rs.getObject("apellidos")%></td>
                                    <td><%= rs.getObject("edad")  %></td>
                                    <td><%= rs.getObject("domicilio") %></td>
                                    <td><a href="update.jsp?cod=<%=rs.getObject("id") %>"><button class="btn btn-success"><i class="fa fa-user-edit"></i></button></a></td>
                                    <td><a href="delete.jsp?cod=<%=rs.getObject("id")%>"><button onclick="return EliminarUsuario()" class="btn btn-danger"><i class="fa fa-user-times"></i></button></a></td>
                                </tr>
                            </tbody>
                            <%
                        }
                        out.println("</table>");
                        out.println("</div>");
                        out.println("</div>");
                        out.println("</div>");
                        out.println("</div>");
                        conexion.close();
                    }else{ //error en la conexion
                        out.println("Oupsis falla!");
                    }
                }catch(Exception e){ //error en algun momento
                    out.println("Excepcion " + e);
                    e.printStackTrace();
                }
                                
            %>              

            <script type="text/javascript">                                  
                function EliminarUsuario(){
                    var respuesta = confirm("Desea eliminar el usuario?");
                    if(respuesta==true){
                        return true;
                    }else{
                        return false;
                    }
                }
                    
            </script>
            <!--<tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>Jacob</td>
                    <td>Thornton</td>
                    <td>@fat</td>
                </tr>
                <tr>
                    <th scope="row">3</th>
                    <td>Larry</td>
                    <td>the Bird</td>
                    <td>@twitter</td>
                </tr>
            </tbody>-->
        <jsp:include page="Footer.html"></jsp:include>
    </body>
</html>

