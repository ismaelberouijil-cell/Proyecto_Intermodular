package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Movil;

public class MovilDAO {

    public List<Movil> obtenerMoviles() {
        List<Movil> lista = new ArrayList<>();
        String sql = "SELECT * FROM moviles";

        try (Connection con = ConexionDB.conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Movil m = new Movil(
                    rs.getInt("id"),
                    rs.getString("marca"),
                    rs.getString("modelo"),
                    rs.getDouble("precio")
                );
                lista.add(m);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void insertarMovil(Movil m) {
        String sql = "INSERT INTO moviles (marca, modelo, precio) VALUES (?, ?, ?)";

        try (Connection con = ConexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, m.getMarca());
            ps.setString(2, m.getModelo());
            ps.setDouble(3, m.getPrecio());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}