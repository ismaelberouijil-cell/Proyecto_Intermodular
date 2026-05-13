package model;

public class Movil {

    private String idMovil;
    private String modelo;
    private double precio;
    private int almacenamiento;
    private int ram;
    private int stock;
    private int idMarca;

    public Movil(String idMovil, String modelo, double precio, int almacenamiento, int ram, int stock, int idMarca) {

        this.idMovil = idMovil;
        this.modelo = modelo;
        this.precio = precio;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.stock = stock;
        this.idMarca = idMarca;
    }

    public String getIdMovil() {
        return idMovil;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public int getStock() {
        return stock;
    }

    public int getIdMarca() {
        return idMarca;
    }
}