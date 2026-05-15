package model;

/**
 * Clase Movil
 * 
 * @author diegocouto-ismaelberouijil
 * @version 1.0
 */
public class Movil {

    private String idMovil;
    private String modelo;
    private double precio;
    private int almacenamiento;
    private int ram;
    private int stock;
    private int idMarca;

    /**
     * @param idMovil
     * @param modelo
     * @param precio
     * @param almacenamiento
     * @param ram
     * @param stock
     * @param idMarca
     */

    public Movil(String idMovil, String modelo, double precio, int almacenamiento, int ram, int stock, int idMarca) {

        this.idMovil = idMovil;
        this.modelo = modelo;
        this.precio = precio;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.stock = stock;
        this.idMarca = idMarca;
    }

    /**
     * Getter del atributo idMovil
     * 
     * @return el ID del móvil
     */
    public String getIdMovil() {
        return idMovil;
    }

    /**
     * Setter del atributo idMovil
     * 
     * @param idMovil el ID del móvil
     */
    public void setIdMovil(String idMovil) {
        this.idMovil = idMovil;
    }

    /**
     * Getter del atributo modelo
     * 
     * @return el modelo del móvil
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Setter del atributo modelo
     * 
     * @param modelo el modelo del móvil
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Getter del atributo precio
     * 
     * @return el precio del móvil
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter del atributo precio
     * 
     * @param precio el precio del móvil
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Getter del atributo almacenamiento
     * 
     * @return el almacenamiento del móvil
     */
    public int getAlmacenamiento() {
        return almacenamiento;
    }

    /**
     * Setter del atributo almacenamiento
     * 
     * @param almacenamiento el almacenamiento del móvil
     */
    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    /**
     * Getter del atributo ram
     * 
     * @return la RAM del móvil
     */
    public int getRam() {
        return ram;
    }

    /**
     * Setter del atributo ram
     * 
     * @param ram la RAM del móvil
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * Getter del atributo stock
     * 
     * @return el stock del móvil
     */
    public int getStock() {
        return stock;
    }

    /**
     * Setter del atributo stock
     * 
     * @param stock el stock del móvil
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Getter del atributo idMarca
     * 
     * @return el ID de la marca del móvil
     */
    public int getIdMarca() {
        return idMarca;
    }

    /**
     * Setter del atributo idMarca
     * 
     * @param idMarca el ID de la marca del móvil
     */
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {

        return "ID: " + idMovil + "\n" +
                "Modelo: " + modelo + "\n" +
                "Precio: " + precio + "€\n" +
                "Almacenamiento: " + almacenamiento + "GB\n" +
                "RAM: " + ram + "GB\n" +
                "Stock: " + stock + "\n" +
                "ID Marca: " + idMarca;

    }
}