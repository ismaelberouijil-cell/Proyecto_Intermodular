<<<<<<< HEAD
package DAO;
=======
package dao;
>>>>>>> b3f5fe0822668d9ce88265406619450b067ab161

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/Catalogo";
    private static final String USER = "root";
    private static final String PASSWORD = "mysql";

<<<<<<< HEAD
    // Método estático para establecer conexión con MySQL
=======
>>>>>>> b3f5fe0822668d9ce88265406619450b067ab161
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
<<<<<<< HEAD
            // Mostrar mensaje de error si falla la conexión
            System.out.println("Error al conectar con la BD");
            e.printStackTrace();
            // Devolver null si no se pudo conectar
=======
            System.out.println("Error al conectar con la BD");
            e.printStackTrace();
>>>>>>> b3f5fe0822668d9ce88265406619450b067ab161
            return null;
        }
    }
}