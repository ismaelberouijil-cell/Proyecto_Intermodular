package DAO;

import modelo.Cliente;
import java.sql.*;

public class ClienteDAO {

    public Cliente login(String email) {
        Connection con = Conexion.conectar();
        String sql = "SELECT * FROM Cliente WHERE email = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Cliente(
                    rs.getString("ID_Cliente"),
                    rs.getString("email"),
                    rs.getString("Nombre")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}