<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Página de inicio</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h1>Página de inicio</h1>
<form action="login" method="post">
    <h2>Inicio de Sesión</h2>
    <label for="correo">Correo:</label>
    <input type="text" id="correo" name="correo" class="form-control" placeholder="Correo" autofocus="">
    <br>
    <label for="password">Contraseña:</label>
    <input type="password" id="password" name="password" class="form-control" placeholder="Password">
    <br>
    <% if (request.getParameter("error") != null) { %>
    <div class="text-danger mb-2">Error en usuario o contraseña</div>
    <% } %>
    <button type="submit">Ingresar</button>
</form>
</body>
</html>