package com.example.c12_20211049.Controllers;

import com.example.c12_20211049.Beans.Contacto;
import com.example.c12_20211049.Beans.Usuario;
import com.example.c12_20211049.Daos.DaoUsuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/login")
public class SessionServlet extends HttpServlet {
    private static final String ADMIN_CORREO = "abuendia@pucp.pe";
    private static final String ADMIN_PASSWORD = "root";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirigir a la vista index.jsp
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String correo = request.getParameter("correo");
        String password = request.getParameter("password");

        DaoUsuario daoUsuario = new DaoUsuario();
        Usuario usuario = daoUsuario.buscarCliente(correo, password);

        if (usuario != null) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);

            if (usuario.getAutorizacion().equals("ADMIN")) {
                // Redirigir a la vista principal.jsp para administradores
                request.getRequestDispatcher("/login/principal.jsp").forward(request, response);
            } else {
                // Obtener los contactos del usuario
                ArrayList<Contacto> contactos = daoUsuario.listarContactos(usuario.getId());
                request.setAttribute("contactos", contactos);

                // Redirigir a la vista de lista de contactos
                request.getRequestDispatcher("/agenda/lista.jsp").forward(request, response);
            }
        } else {
            // Credenciales incorrectas, redirigir a index.jsp
            request.getRequestDispatcher("/login/index.jsp").forward(request, response);
        }
    }
}