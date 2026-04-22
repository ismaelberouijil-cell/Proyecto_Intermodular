package model;

public class Movil {
    private String modelo;
    private double precio;
    private int stock;

    public Movil(String modelo, double precio, int stock) {
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getModelo() { return modelo; }
    public double getPrecio() { return precio; }
}