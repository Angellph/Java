<%-- 
    Document   : update
    Created on : 26/11/2020, 11:17:34 AM
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
        <title>Actualizar</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link  rel="stylesheet" href="css/estilos.css">        
        <script src="js/bootstrap.min.js"></script>        
    </head>
    <body><br><a href="mostrar.jsp" style="padding-left: 1em"><svg width="3em" height="3em" viewBox="0 0 16 16" class="bi bi-arrow-left-circle-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zm-4.5.5a.5.5 0 0 0 0-1H5.707l2.147-2.146a.5.5 0 1 0-.708-.708l-3 3a.5.5 0 0 0 0 .708l3 3a.5.5 0 0 0 .708-.708L5.707 8.5H11.5z"/>
  </svg></a>        
            <h2>Actualizar registro</h2>
            <%
                String cod= request.getParameter("cod");
                String driver = "com.mysql.jdbc.Driver";
                try{
                    Class.forName(driver);
                    Connection conexion = java.sql.DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                    
                    if(conexion != null){
                        String sql = "select * from clientes where id='"+cod+"'";
                        Statement sentencias = conexion.createStatement();
                        
                        ResultSet rs = sentencias.executeQuery(sql);
                        //ponemos 
                        while (rs.next()){
            %>
        <div class="card" style="width: 40rem; margin: 0 auto;">
        <div class="card-body">
            <form action=" " method="POST">
                <div class="form-group row">
                    <label  class="col-sm-2 col-form-label">Id</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="id" readonly="readonly" value="<%=rs.getObject("id") %>">
                        </div>
                </div>
                <div class="form-group row">
                    <label  class="col-sm-2 col-form-label">Nombre</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="nombre" value="<%=rs.getObject("nombre") %>">
                        </div>
                </div>
            <div class="form-group row">
                <label  class="col-sm-2 col-form-label">Apellidos</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="inputPassword3" name="apellidos" value="<%=rs.getObject("apellidos") %>">
                    </div>
            </div>
                <div class="form-group row">
                    <label  class="col-sm-2 col-form-label">Edad</label>
                <div class="col-sm-2">
                    <input type="number" class="form-control" name="edad" value="<%=rs.getObject("edad") %>">
                </div>
              </div>
            <div class="form-group row">
                <label  class="col-sm-2 col-form-label">Domicilio</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" id="inputPassword3" name="domicilio" value="<%=rs.getObject("domicilio") %>">
                    </div>
            </div>    
                <div class="form-group row">
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary text-center" name="btnActualizar">Actualizar </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
                        <%
            }
            if(request.getParameter("btnActualizar")!=null){
                    String id=request.getParameter("id");
                    String nombre=request.getParameter("nombre");
                    String apellidos=request.getParameter("apellidos");
                    int edad=Integer.parseInt(request.getParameter("edad"));
                    String domicilio=request.getParameter("domicilio");
                    sentencias.executeUpdate("update clientes set nombre='"+nombre+"',apellidos='"+apellidos+"',edad="+edad+",domicilio='"+domicilio+"' where id='"+id+"' ");
                    request.getRequestDispatcher("mostrar.jsp").forward(request, response);
                 }
            conexion.close();
            }else{ //error en la conexion
                 out.println("Oupsis falla!");
                 }
                 }catch(Exception e){ //error en algun momento
                 
                    out.println("Excepcion " + e);
                    e.printStackTrace();
                }
                %>
    </body>
</html>
