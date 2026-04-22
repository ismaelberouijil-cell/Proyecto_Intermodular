



import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AppConex {
    public static void main(String[] args) {
        
        //crea el DAO para acceder a la tabla alumno
        Cliente cliente = new Cliente();

        List<Clientes> Clien = new ArrayList<>();

        try {
            //establecer la conexion a mysql, bdcentroidiomas
            Connection conex = Conexion.getConexion();

            //llamar al metodo del DAO
            alumnos = daoAlumn.obtenerAlumnos(conex);

            for(AlumnoVO alum : alumnos){
                System.out.println(alum);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
