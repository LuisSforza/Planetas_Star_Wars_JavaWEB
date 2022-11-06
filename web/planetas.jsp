<%-- 
    Document   : newjsp
    Created on : 3/11/2022, 09:08:52 PM
    Author     : Luis CR
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Usuario"%>
<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<%@page import="ModeloDAO.UsuarioDAO"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Planetas del Imperial Galáctico</title>
    <link rel="stylesheet" href="css/style_index.css">
</head>
<body>
    <center><h1>Planetas</h1></center>
    <%
        HttpSession sesion = request.getSession();
        String user;
        
        if(sesion.getAttribute("user")!=null){
            user = sesion.getAttribute("user").toString();
            out.print("<a href='index.jsp?cerrar=true'><h5>Cerrar Session "+ user +"</h5></a>");
        }else{
            response.sendRedirect("index.jsp");
        }
    %>
    <div class="container">
        <% for(int i = 0; i<10; i++){%>
            <div class="catalogo-container">
                <img src="img/Alderaan.jpg">
                <div class="catalogo-info-container">
                    <form method="GET" action="verPlaneta">
                        <h3>Planeta Alderaan</h3>
                        <input class="verPlaneta" type="sumit" value="Ver planeta">
                    </form>
                </div>
            </div>
        <%}%>
    </div>
    <div>
        <%
            UsuarioDAO userDao = new UsuarioDAO();
            List<Usuario>list = userDao.listar();
            
            Iterator<Usuario>iter = list.iterator();
            
            Usuario usuario = null;
            
            while(iter.hasNext()){
                usuario = iter.next();
            
        %>
        <h1>
            <%= usuario.getUser()%>
        </h1>
        <h1>
            <%= usuario.getName()%>
        </h1>
        
        <%}%>
    </div>
</body>
</html>
