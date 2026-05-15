package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/Catalogo";
    private static final String USER = "root";
    private static final String PASSWORD = "mysql";

    // Método estático para establecer conexión con MySQL
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            // Mostrar mensaje de error si falla la conexión
            System.out.println("Error al conectar con la BD");
            e.printStackTrace();
            // Devolver null si no se pudo conectar
            return null;
        }
    }
}