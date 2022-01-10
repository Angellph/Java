<%-- 
    Document   : mostrar
    Created on : 19/11/2020, 11:48:28 AM
    Author     : thania
--%>
<%@page import="clases.*" %>
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
    </head>
    <body>
        <jsp:include page="nav.html" ></jsp:include><br><br><br><br><br><br>
        <br><a href="index.jsp" style="padding-left: 1em"><svg width="3em" height="3em" viewBox="0 0 16 16" class="bi bi-arrow-left-circle-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zm-4.5.5a.5.5 0 0 0 0-1H5.707l2.147-2.146a.5.5 0 1 0-.708-.708l-3 3a.5.5 0 0 0 0 .708l3 3a.5.5 0 0 0 .708-.708L5.707 8.5H11.5z"/>
  </svg></a>
        <h1>Mostrar registros</h1>
        <table class="table">
            <thead class="thead-light">
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellidos</th>
                    <th scope="col">Edad</th>
                    <th scope="col">Domicilio</th>
                </tr>
                
            </thead>
            <%
                int edad = 0;
                String criterio = request.getParameter("texto");                
                String driver = "com.mysql.jdbc.Driver";
                try{
                    Class.forName(driver);
                    Connection conexion = java.sql.DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    
                    if(conexion != null){
                        //String sql = "select * from clientes where id=" +criterio;
                        String sql = "select * from clientes where id like '%"+ criterio +"%' or nombre like '%"+ criterio +"%'";
                        Statement sentencias = conexion.createStatement();
                        
                        ResultSet rs = sentencias.executeQuery(sql);
                        //ponemos 
                        while (rs.next()){
                            out.println("<tbody>");
                            out.println("<tr>");
                            out.println("<th scope='row'>" + rs.getObject("id") + "</th>");
                            out.println("<td>" + rs.getObject("nombre") + "</td>");
                            out.println("<td>" + rs.getObject("apellidos") + "</td>");
                            out.println("<td>" + rs.getObject("edad") + "</td>");
                            edad = rs.getInt("edad");
                            out.println("<td>" + rs.getObject("domicilio") + "</td>");
                            out.println("</tr>");
                            out.println("</tbody>");
                        }                       
                        out.println("</table>");
                        out.println("Dias vividos: "+ Metodos.calcularDias(edad));
                        conexion.close();                        
                        
                    }                                                                    
                    else{ //error en la conexion
                        out.println("Oupsis falla!");
                    }
                }catch(Exception e){ //error en algun momento
                    out.println("Excepcion " + e);
                    e.printStackTrace();
                }
                                
            %>
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