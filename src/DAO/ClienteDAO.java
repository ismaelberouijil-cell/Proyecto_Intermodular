package DAO;

import model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {

    // Método para comprobar el login del cliente
    public boolean login(String email, String password) {

        // Consulta SQL para buscar un cliente
        // con el email y contraseña introducidos
        String sql = "SELECT *FROM Cliente WHERE email = ? AND contraseña = ?";

        try (Connection con = ConexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            // Asigna un email al primer parámetro y asigna un contraseña al segundo parámetro
            ps.setString(1, email);
            ps.setString(2, password);

            // Ejecutar consulta
            ResultSet rs = ps.executeQuery();

            // Si existe un registro devuelve true
            return rs.next();

        } catch (SQLException e) {

            e.printStackTrace();
            // Devolver false si ocurre un error
            return false;
        }
    }
}