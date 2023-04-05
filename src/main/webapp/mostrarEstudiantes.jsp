<%-- 
    Document   : mostrarEstudiantes
    Created on : 5 abr. 2023, 12:54:25
    Author     : germa
--%>

<%@page import="logica.Estudiante"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estudiantes</title>
    </head>
    <body>
        <h1>Lista de estudiantes</h1>
        <% 
            List<Estudiante>listaEstudiantes = (List) request.getSession().getAttribute("listaEstudiantes");
            
            for(Estudiante e : listaEstudiantes) {
        %>
        <table>
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
            </tr>
            <tr>
                <td><%=e.getNombre()%></td>
                <td><%=e.getApellido()%></td>
            </tr>
        </table>
        <% } %>
    </body>
</html>
