package DAO;

<<<<<<< HEAD
import model.Movil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovilDAO {

    // MOSTRAR CATÁLOGO
    public List<Movil> obtenerMoviles() {

        // Lista donde se guardarán los móviles obtenidos
        List<Movil> lista = new ArrayList<>();

        // Consulta SQL para obtener todos los registros
        String sql = "SELECT * FROM Movil";
=======
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Movil;

public class MovilDAO {

    public List<Movil> obtenerMoviles() {
        List<Movil> lista = new ArrayList<>();
        String sql = "SELECT * FROM moviles";
>>>>>>> b3f5fe0822668d9ce88265406619450b067ab161

        try (Connection con = ConexionDB.conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
<<<<<<< HEAD

                // Crear objeto móvil con los datos del ResultSet
                Movil movil = new Movil(
                        rs.getString("ID_Movil"),
                        rs.getString("Modelo"),
                        rs.getDouble("Precio"),
                        rs.getInt("almacenamiento"),
                        rs.getInt("RAM"),
                        rs.getInt("Stock"),
                        rs.getInt("ID_Marca")
                );
                 // Añadir móvil a la lista
                lista.add(movil);
            }

        } catch (SQLException e) {
            // Mostrar error si falla la consulta
=======
                Movil m = new Movil(
                    rs.getInt("id"),
                    rs.getString("marca"),
                    rs.getString("modelo"),
                    rs.getDouble("precio")
                );
                lista.add(m);
            }

        } catch (SQLException e) {
>>>>>>> b3f5fe0822668d9ce88265406619450b067ab161
            e.printStackTrace();
        }

        return lista;
    }

<<<<<<< HEAD
    // INSERTAR MÓVIL
    public void insertarMovil(Movil movil) {

         // Consulta SQL con parámetros
        String sql = "INSERT INTO Movil VALUES (?, ?, ?, ?, ?, ?, ?) ";
=======
    public void insertarMovil(Movil m) {
        String sql = "INSERT INTO moviles (marca, modelo, precio) VALUES (?, ?, ?)";
>>>>>>> b3f5fe0822668d9ce88265406619450b067ab161

        try (Connection con = ConexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

<<<<<<< HEAD
            // Asignar valores a cada parámetro de la consulta
            ps.setString(1, movil.getIdMovil());
            ps.setString(2, movil.getModelo());
            ps.setDouble(3, movil.getPrecio());
            ps.setInt(4, movil.getAlmacenamiento());
            ps.setInt(5, movil.getRam());
            ps.setInt(6, movil.getStock());
            ps.setInt(7, movil.getIdMarca());

             // Ejecutar la inserción
            ps.executeUpdate();

            System.out.println("Móvil añadido correctamente");

        } catch (SQLException e) {
             // Mostrar error en caso de excepción SQL
            e.printStackTrace();
        }
    }

    // ELIMINAR MÓVIL
    public void eliminarMovil(String id) {

        // Consulta SQL para eliminar el móvil
        String sql = "DELETE FROM Movil WHERE ID_Movil = ?";

        try (Connection con = ConexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            // Asignar el ID al parámetro de la consulta
            ps.setString(1, id);

             // Ejecutar eliminación y guardar filas afectadas
            int filas = ps.executeUpdate();

            // Comprobar si el móvil existía y se elimina
            if (filas > 0) {
                System.out.println("Móvil eliminado");
            } else {
                System.out.println("No existe el móvil");
            }

=======
            ps.setString(1, m.getMarca());
            ps.setString(2, m.getModelo());
            ps.setDouble(3, m.getPrecio());
            ps.executeUpdate();

>>>>>>> b3f5fe0822668d9ce88265406619450b067ab161
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}