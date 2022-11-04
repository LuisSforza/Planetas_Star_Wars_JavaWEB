<%-- 
    Document   : login
    Created on : 3/11/2022, 05:25:53 PM
    Author     : Luis CR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema Imperial Planeta</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="login-container"> <!--Contenedor que contiene la imagen y el texto-->
        <div class="login-info-container">
            <h1 class="title">Ingresar al sistema</h1>
            <form class="inputs-container" method="POST" action="serveltLogin">
                <input class="input" type="text" placeholder="Usuario" name="user">
                <input class="input" type="password" placeholder="Contraseña" name="password">
                <input class="input-btn" type="submit" value="Ingresar">
            </form>
            ${mensajeInfo}
        </div>
        <div class="login-img-container">
            <img class="img-log" src="img/Logo-imperio-galáctico.png" alt="Imperio galáctico">
        </div>
    </div>

</body>
</html>
