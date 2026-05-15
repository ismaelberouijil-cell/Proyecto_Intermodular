

import dao.MovilDAO;
import dao.UsuarioDAO;
import java.util.List;
import java.util.Scanner;
import model.Movil;
import model.Usuario;

public class MenuService {

    private Scanner sc = new Scanner(System.in);
    private UsuarioDAO usuarioDAO = new UsuarioDAO();
    private MovilDAO movilDAO = new MovilDAO();

    public void iniciar() {
        int opcion;

        do {
            System.out.println("--- TIENDA DE MÓVILES ---");
            System.out.println("1. Ver catálogo");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Información de la tienda");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> mostrarCatalogo();
                case 2 -> login();
                case 3 -> infoTienda();
            }

        } while (opcion != 0);
    }

    private void mostrarCatalogo() {
        List<Movil> moviles = movilDAO.obtenerMoviles();

        for (Movil m : moviles) {
            System.out.println(m.getId() + " - " + m.getMarca() + " " + m.getModelo() + " - " + m.getPrecio() + "€");
        }
    }

    private void login() {
        System.out.print("Usuario: ");
        String nombre = sc.next();
        System.out.print("Contraseña: ");
        String pass = sc.next();

        Usuario u = new Usuario(nombre, pass);

        if (usuarioDAO.login(u)) {
            System.out.println("Login correcto");
        } else {
            System.out.println("Error en login");
        }
    }

    private void infoTienda() {
        System.out.println("Somos una tienda especializada en smartphones.");
        System.out.println("Ofrecemos las mejores marcas al mejor precio.");
    }

    public static void main(String[] args) {
        MenuService menu = new MenuService();
        menu.iniciar();
    } 
}