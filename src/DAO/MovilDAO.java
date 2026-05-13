package DAO;

import model.Movil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovilDAO {

    // MOSTRAR CATÁLOGO
    public List<Movil> obtenerMoviles() {

        List<Movil> lista = new ArrayList<>();

        String sql = "SELECT * FROM Movil";

        try (Connection con = ConexionDB.conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                Movil movil = new Movil(
                        rs.getString("ID_Movil"),
                        rs.getString("Modelo"),
                        rs.getDouble("Precio"),
                        rs.getInt("almacenamiento"),
                        rs.getInt("RAM"),
                        rs.getInt("Stock"),
                        rs.getInt("ID_Marca")
                );

                lista.add(movil);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // INSERTAR MÓVIL
    public void insertarMovil(Movil movil) {

        String sql = "INSERT INTO Movil VALUES (?, ?, ?, ?, ?, ?, ?) ";

        try (Connection con = ConexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, movil.getIdMovil());
            ps.setString(2, movil.getModelo());
            ps.setDouble(3, movil.getPrecio());
            ps.setInt(4, movil.getAlmacenamiento());
            ps.setInt(5, movil.getRam());
            ps.setInt(6, movil.getStock());
            ps.setInt(7, movil.getIdMarca());

            ps.executeUpdate();

            System.out.println("Móvil añadido correctamente");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ELIMINAR MÓVIL
    public void eliminarMovil(String id) {

        String sql = "DELETE FROM Movil WHERE ID_Movil = ?";

        try (Connection con = ConexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, id);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Móvil eliminado");
            } else {
                System.out.println("No existe el móvil");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}