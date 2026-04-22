
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //para conectar a la BD hay que especificar la cadena de conexion

    public static  Connection getConexion() throws SQLException{
        //metodo estatico para utilizar las clases dao
        String url = "jdbc:mysql://localhost:3306/Catalogo";
        String user = "root";
        String pwd = "mysql";
        
        return  DriverManager.getConnection(url,user, pwd);
    }

}
