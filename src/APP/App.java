package APP;
import servicio.LoginService;
import dao.MovilDAO;
import modelo.Cliente;
import modelo.Movil;

import java.util.List;

public class APP {

    public static void main(String[] args) {

        // LOGIN
        LoginService login = new LoginService();
        Cliente c = login.iniciarSesion("test@email.com");

        if (c != null) {
            System.out.println("Bienvenido " + c.getNombre());
        } else {
            System.out.println("Usuario no encontrado");
        }

        // CATÁLOGO
        MovilDAO dao = new MovilDAO();
        List<Movil> moviles = dao.obtenerMoviles();

        for (Movil m : moviles) {
            System.out.println(m.getModelo() + " - " + m.getPrecio());
        }
    }
}