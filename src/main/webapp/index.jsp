<%-- 
    Document   : index
    Created on : 4 abr. 2023, 13:27:56
    Author     : germa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del estudiante</h1>
        <form action="BasicServlet" method="POST">
            <p><label>Nombre: </label> <input type="text" name="nombre"></p>
            <p><label>Apelido: </label> <input type="text" name="apellido"></p>
            <button type="submit    ">Enviar</button>
        </form>
        <br>
        
        <h1>Lista de estudiantes</h1>
        <form action="BasicServlet" method="GET">
            <button>Mostrar estudiantes</button>
        </form>
    </body>
</html>
