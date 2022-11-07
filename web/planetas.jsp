<%-- 
    Document   : newjsp
    Created on : 3/11/2022, 09:08:52 PM
    Author     : Luis CR
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Usuario"%>
<%@page import="modelo.Planeta"%>
<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloDAO.PlanetaDAO"%>

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
            out.print("<center><a href='index.jsp?cerrar=true'><h2>Salir</h2></a></center>");
        }else{
            response.sendRedirect("index.jsp");
        }
    %>
    <div class="container">
        <% 
            PlanetaDAO planetaDao = new PlanetaDAO();
            List<Planeta>list = planetaDao.listar();
            
            Iterator<Planeta>iter = list.iterator();
            
            Planeta planeta = null;
            
            while(iter.hasNext()){
                planeta = iter.next();
        
        %>
            <div class="catalogo-container">
                <% out.print("<img src="+ planeta.getPath() + ">");%>
                <div class="catalogo-info-container">
                    <form method="GET" action="verPlaneta">
                        <h3><%= planeta.getName()%></h3>
                        <!--<input class="verPlaneta" type="sumit" value="Ver planeta">-->
                    </form>
                </div>
            </div>
        <%}%>
    </div>
</body>
</html>
