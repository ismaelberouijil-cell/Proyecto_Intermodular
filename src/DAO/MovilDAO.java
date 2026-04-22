package dao;

import modelo.Movil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovilDAO {

    public List<Movil> obtenerMoviles() {
        List<Movil> lista = new ArrayList<>();
        Connection con = Conexion.conectar();

        String sql = "SELECT * FROM Movil";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Movil m = new Movil(
                    rs.getString("Modelo"),
                    rs.getDouble("Precio"),
                    rs.getInt("Stock")
                );
                lista.add(m);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}