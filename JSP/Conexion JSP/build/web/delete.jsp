<%-- 
    Document   : recuperar
    Created on : 2/12/2020, 12:28:04 PM
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
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String cod = request.getParameter("cod");
            
            String driver = "com.mysql.jdbc.Driver";
            
            try{
                Class.forName(driver);
            }catch (Exception e){
                System.out.println("Error de driver, " + e.getMessage());
            }
            
            Connection conexion = java.sql.DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            
             Statement sentencias = conexion.createStatement();
            try {
                if (conexion != null) {
                    String instruccionSQL = "DELETE from clientes where id='"+cod+"'";
                    sentencias.execute(instruccionSQL);                    
                    request.getRequestDispatcher("mostrar.jsp").forward(request, response);
                }
            } catch (Exception e) {
                System.out.println("Oupsis falla!"+ e);
            }
            %>
            
    </body>
</html>

