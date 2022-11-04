<%-- 
    Document   : newjsp
    Created on : 3/11/2022, 09:08:52 PM
    Author     : Luis CR
--%>
<%@page session="true"%>
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
        <div class="catalogo-container">
            <img src="img/Alderaan.jpg">
            <div class="catalogo-info-container">
                <form method="GET" action="verPlaneta">
                    <h3>Planeta Alderaan</h3>
                    <input class="verPlaneta" type="sumit" value="Ver planeta">
                </form>
            </div>
        </div>
        
        <div class="catalogo-container">
            <div class="catalogo-img-container">
                <img src="img/Alderaan.jpg">
            </div>
            <div class="catalogo-info-container">
                <form method="GET" action="verPlaneta">
                    <h3>Planeta Alderaan</h3>
                    <input class="verPlaneta" type="sumit" value="Ver planeta">
                </form>
            </div>
        </div> 
        <div class="catalogo-container">
            <div class="catalogo-img-container">
                <img src="img/Alderaan.jpg">
            </div>
            <div class="catalogo-info-container">
                <form method="GET" action="verPlaneta">
                    <h3>Planeta Alderaan</h3>
                    <input class="verPlaneta" type="sumit", value="Ver planeta">
                </form>
            </div>
        </div>  
        <div class="catalogo-container">
            <div class="catalogo-img-container">
                <img src="img/Alderaan.jpg">
            </div>
            <div class="catalogo-info-container">
                <form method="GET" action="verPlaneta">
                    <h3>Planeta Alderaan</h3>
                    <input class="verPlaneta" type="sumit", value="Ver planeta">
                </form>
            </div>
        </div>  

    </div>
</body>
</html>
