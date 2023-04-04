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
        <form action="BasicServlet" method="GET">
            <button type="submit">Get</button>
        </form>
        <br>
        <form action="BasicServlet" method="POST">
            <button type="submit">Post</button>
        </form>
    </body>
</html>
