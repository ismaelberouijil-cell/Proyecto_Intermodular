package service;
import DAO.ClienteDAO;
import DAO.MovilDAO;
import model.Movil;

import java.util.List;
import java.util.Scanner;

public class MenuService {

    Scanner sc = new Scanner(System.in);

    MovilDAO movilDAO = new MovilDAO();
    ClienteDAO clienteDAO = new ClienteDAO();

    public void iniciar() {

        int opcion;

        do {

            System.out.println("\n===== TIENDA DE MÓVILES =====");
            System.out.println("1. Ver catálogo");
            System.out.println("2. Añadir móvil");
            System.out.println("3. Eliminar móvil");
            System.out.println("4. Iniciar sesión");
            System.out.println("5. Información tienda");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1 -> mostrarCatalogo();
                case 2 -> insertarMovil();
                case 3 -> eliminarMovil();
                case 4 -> login();
                case 5 -> infoTienda();
            }

        } while (opcion != 0);
    }

    private void mostrarCatalogo() {

        List<Movil> moviles = movilDAO.obtenerMoviles();

        for (Movil m : moviles) {

            System.out.println("----------------------");

            System.out.println("ID: " + m.getIdMovil());
            System.out.println("Modelo: " + m.getModelo());
            System.out.println("Precio: " + m.getPrecio() + "€");
            System.out.println("RAM: " + m.getRam() + "GB");
            System.out.println("Almacenamiento: " +
                    m.getAlmacenamiento() + "GB");

            System.out.println("Stock: " + m.getStock());
        }
    }

    private void insertarMovil() {

        System.out.println("ID:");
        String id = sc.next();

        System.out.println("Modelo:");
        String modelo = sc.next();

        System.out.println("Precio:");
        double precio = sc.nextDouble();

        System.out.println("Almacenamiento:");
        int almacenamiento = sc.nextInt();

        System.out.println("RAM:");
        int ram = sc.nextInt();

        System.out.println("Stock:");
        int stock = sc.nextInt();

        System.out.println("ID Marca:");
        int idMarca = sc.nextInt();

        Movil movil = new Movil(
                id,
                modelo,
                precio,
                almacenamiento,
                ram,
                stock,
                idMarca
        );

        movilDAO.insertarMovil(movil);
    }

    private void eliminarMovil() {

        System.out.println("ID del móvil:");

        String id = sc.next();

        movilDAO.eliminarMovil(id);
    }

    private void login() {

        System.out.println("Email:");
        String email = sc.next();

        System.out.println("Contraseña:");
        String password = sc.next();

        boolean acceso =
                clienteDAO.login(email, password);

        if (acceso) {
            System.out.println("Login correcto");
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }

    private void infoTienda() {

        System.out.println("""
                ===== SOBRE NOSOTROS =====
                
                Somos una tienda especializada
                en smartphones de última generación.
                
                Trabajamos con Samsung,
                Apple, Xiaomi y más marcas.
                
                Ofrecemos envíos rápidos
                y soporte técnico.
                """);
    }

}