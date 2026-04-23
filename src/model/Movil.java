package model;

public class Movil {
    private int id;
    private String marca;
    private String modelo;
    private double precio;

    public Movil(int id, String marca, String modelo, double precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public int getId() { 
        return id; 
    }
    public String getMarca() { 
        return marca; 
    }
    public String getModelo() { 
        return modelo; 
    }
    public double getPrecio() { 
        return precio; 
    }
}