<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.c12_20211049.Beans.Contacto" %>
<html>
<head>
    <title>Lista de Contactos</title>
</head>
<body>
<h1>Lista de Contactos</h1>
<table>
    <tr>
        <th>Nombre Completo</th>
        <th>Correo</th>
        <th>Teléfono</th>
        <th>País</th>
        <th>Ciudad</th>
    </tr>
    <%
        ArrayList<Contacto> contactos = (ArrayList<Contacto>) request.getAttribute("contactos");
        if (contactos != null && !contactos.isEmpty()) {
            for (Contacto contacto : contactos) {
    %>
    <tr>
        <td><%= contacto.getNombrecompletos() %></td>
        <td><%= contacto.getCorreo() %></td>
        <td><%= contacto.getTelefono() %></td>
        <td><%= contacto.getPais() %></td>
        <td><%= contacto.getCiudad() %></td>
    </tr>
    <%
        }
    } else {
    %>
    <tr>
        <td colspan="5">No hay contactos disponibles</td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
