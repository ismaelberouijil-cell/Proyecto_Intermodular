package DAO;

import model.Usuario;
import java.sql.*;
import java.sql.Connection;


public class UsuarioDAO {

    public boolean login(UsuarioDAO usuario) {
        String sql = "SELECT * FROM usuarios WHERE nombre=? AND password=?";
        
        try (Connection con = ConexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getPassword());

            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}