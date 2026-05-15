package service;

import DAO.ClienteDAO;
import DAO.MovilDAO;
import model.Movil;

import java.util.List;
import java.util.Scanner;

public class MenuService {

    Scanner sc = new Scanner(System.in);

    /**
     * Objeto DAO para gestionar operaciones relacionadas con móviles.
     */
    MovilDAO movilDAO = new MovilDAO();
    /*
     * Objeto DAO para gestionar operaciones relacionadas con clientes.
     */
    ClienteDAO clienteDAO = new ClienteDAO();

    /**
     * Muestra las opciones disponibles y ejecuta la acción
     * correspondiente según la opción elegida por el usuario.
     */
    public void iniciar() {

        int opcion;

        do {

            System.out.println("===== TIENDA DE MÓVILES =====");
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

    /**
     * Muestra por pantalla el catálogo completo de móviles.
     *
     * Obtiene la lista de móviles desde la base de datos
     * mediante el DAO y muestra toda su información.
     */
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

    /**
     * Solicita al usuario los datos de un nuevo móvil
     * y lo inserta en la base de datos.
     *
     * Donde los datos solicitados son:
     * ID
     * Modelo
     * Precio
     * Almacenamiento
     * RAM
     * Stock
     * ID de marca
     */
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
                idMarca);

        movilDAO.insertarMovil(movil);
    }

    /**
     * Elimina un móvil de la base de datos.
     * Y solicita al usuario el ID del móvil que desea eliminar
     * y ejecuta la operación mediante el DAO.
     */
    private void eliminarMovil() {

        System.out.println("ID del móvil:");

        String id = sc.next();

        movilDAO.eliminarMovil(id);
    }

    /**
     * Gestiona el inicio de sesión de un cliente.
     *
     * Solicita email y contraseña al usuario y comprueba
     * las credenciales mediante el DAO de clientes.
     *
     * Muestra un mensaje indicando si el acceso ha sido correcto
     * o si las credenciales son incorrectas.
     */
    private void login() {

        System.out.println("Email:");
        String email = sc.next();

        System.out.println("Contraseña:");
        String password = sc.next();

        boolean acceso = clienteDAO.login(email, password);

        if (acceso) {
            System.out.println("Login correcto");
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }

    /**
     * Muestra información general sobre la tienda.
     */
    private void infoTienda() {

        System.out.println("""
                ===== SOBRE NOSOTROS =====

                        Somos una tienda especializada
                        en smartphones de ultima generacion.

                        Trabajamos con Samsung,
                        Apple, Xiaomi y mas marcas.
                        """);
    }

}