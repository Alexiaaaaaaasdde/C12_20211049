<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Principal</title>
</head>
<body>
<h1>Bienvenido, Administrador</h1>
<p>Esta es la vista principal para administradores.</p>
<a href="logout">Cerrar Sesión</a>
<br>
<h2>Registrar Nuevo Usuario</h2>
<form action="registrar" method="post">
    <!-- Campos para registrar un nuevo usuario -->
    <input type="submit" value="Registrar">
</form>
</body>
</html>