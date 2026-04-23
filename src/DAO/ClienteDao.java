package dao;

import config.Conexion;
import modelo.Cliente;
import java.sql.*;

public class ClienteDAO {

    public Cliente login(String email, String password) {

        String sql = "SELECT * FROM Cliente WHERE email = ? AND password = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Cliente(
                        rs.getString("ID_Cliente"),
                        rs.getString("email"),
                        rs.getString("Nombre"),
                        rs.getString("password"), sql, 0, sql, sql, sql
                );
            }

        } catch (SQLException e) {
            System.out.println("Error en login:");
            e.printStackTrace();
        }

        return null;
    }
}