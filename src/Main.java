import java.util.List;
import java.util.Scanner;
import modelo.Cliente;
import modelo.Movil;
import servicio.CatalogoService;

public class Main {

    public static void main(String[] args) {

        CatalogoService service = new CatalogoService();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== LOGIN ===");
        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        Cliente cliente = service.login(email, password);

        if (cliente != null) {
            System.out.println("Bienvenido " + cliente.getNombre());

            System.out.println("CATÁLOGO:");
            List<Movil> moviles = service.obtenerCatalogo();

            for (Movil m : moviles) {
                System.out.println("- " + m.getModelo() + " | " + m.getPrecio() + "€");
            }

        } else {
            System.out.println("Login incorrecto");
        }
    }
}