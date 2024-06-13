package com.example.c12_20211049.Daos;

import com.example.c12_20211049.Beans.Contacto;
import com.example.c12_20211049.Beans.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoUsuario extends DaoBase{

    // Método para buscar un usuario por correo y contraseña cifrada
    public Usuario buscarCliente(String correo, String passwd) {
        String sql = "SELECT * FROM usuario WHERE correo = ? AND password = SHA2(?, 256)";
        Usuario usuario = null;

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, correo);
            pstmt.setString(2, passwd);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    usuario = new Usuario(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getString("autorizacion"),
                            rs.getString("correo"),
                            rs.getString("password"),
                            rs.getInt("enabled")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    // Método para crear un nuevo usuario con contraseña cifrada
    public void createusuario(String nombre, String apellido, String rol, String user_correo, String user_pass) {
        String query = "INSERT INTO usuario (nombres, apellidos, autorizacion, correo, password, enabled) VALUES (?, ?, ?, ?, SHA2(?, 256), 1)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.setString(2, apellido);
            stmt.setString(3, rol);
            stmt.setString(4, user_correo);
            stmt.setString(5, user_pass);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para listar contactos de un usuario por usuario_id
    public ArrayList<Contacto> listarContactos(int usuario_id) {
        String query = "SELECT * FROM contacto WHERE usuario_id = ?";
        ArrayList<Contacto> contactos = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, usuario_id);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    contactos.add(new Contacto(
                            rs.getString("nombrecompletos"),
                            rs.getString("correo"),
                            rs.getString("latitud"),
                            rs.getString("longitud"),
                            rs.getString("telefono"),
                            rs.getInt("usuario_id"),
                            rs.getString("pais"),
                            rs.getString("ciudad")
                    ));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contactos;
    }
}
