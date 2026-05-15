import service.MenuService;

/**
 * Desde aquí se crea una instancia de MenuService
 * y se inicia el menú principal de la tienda de móviles.
 */
public class Main {

    public static void main(String[] args) {

        // Crear objeto del menú principal
        MenuService menu = new MenuService();
        // Iniciar el menú
        menu.iniciar();
    }
}