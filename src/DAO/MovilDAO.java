package DAO;

import config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Movil;

public class MovilDAO {

    public List<Movil> obtenerTodos() {

        List<Movil> lista = new ArrayList<>();
        String sql = "SELECT * FROM Movil";

        try (Connection con = Conexion.getConexion()){
             

        } catch (SQLException e) {
            System.out.println("Error al obtener móviles:");
            e.printStackTrace();
        }

        return lista;
    }
}