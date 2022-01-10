<%-- 
    Document   : index
    Created on : 28/10/2020, 12:08:18 PM
    Author     : thania
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cinepolis</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link  rel="stylesheet" href="css/estilos.css">        
        <script src="js/bootstrap.min.js"></script>        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </head>
    <body>
        <jsp:include page="Header.html" ></jsp:include><br><br><br><br><br><br>
        <h1>Cinepolis</h1>
        <jsp:include page="formulario.html"></jsp:include>            
            <jsp:include page="Footer.html"></jsp:include>
    </body>
</html>
