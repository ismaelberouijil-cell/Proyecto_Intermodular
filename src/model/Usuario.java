package model;

public class Usuario {
    private int id;
    private String nombre;
    private String password;

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() { 
        return nombre; 
    }
    public String getPassword() { 
        return password; 
    }
}