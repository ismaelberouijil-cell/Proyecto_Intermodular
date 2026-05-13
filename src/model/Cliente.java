package model;

/**
 * Clase Cliente
 * @author diegocouto-ismaelberouijil
 * @version 1.0
 */

public class Cliente {

     String nombre;
     String prApellido;
     String dni;
     String sgapellido;
     String id_cliente;
     int telefono;
     String email;
     String contraseña;
     String direccion;
    
   /**
     * @param nombre
     * @param prApellido
     * @param dni
     * @param sgApellido
     * @param id_cliente
     * @param telefono
     * @param email
     * @param contraseña
     * @param direccion
    */
    public Cliente(String nombre, String prApellido, String dni, String sgapellido, String id_cliente, int telefono,
            String email, String contraseña, String direccion) {
        this.nombre = nombre;
        this.prApellido = prApellido;
        this.dni = dni;
        this.sgapellido = sgapellido;
        this.id_cliente = id_cliente;
        this.telefono = telefono;
        this.email = email;
        this.contraseña = contraseña;
        this.direccion = direccion;
    }

    /**
     * Getter del atributo nombre
     * @return el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del atributo nombre
     * @param nombre estable del id del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del atributo prApellido
     * @return el prApellido del cliente
     */
    public String getPrApellido() {
        return prApellido;
    }

    /**
     * Setter del atributo sgApellido
     * @param sgApellido estable del id del cliente
     */
    public void setPrApellido(String prApellido) {
        this.prApellido = prApellido;
    }

    /**
     * Getter del atributo dni
     * @return el dni del cliente
     */
    public String getDni() {
        return dni;
    }

    /**
     * Setter del atributo dni
     * @param dni estable del id del cliente
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Getter del atributo sgApellido
     * @return el sgApellido del cliente
     */
    public String getSgapellido() {
        return sgapellido;
    }

    /**
     * Setter del atributo sgApellido
     * @param sgApellido estable del id del cliente
     */
    public void setSgapellido(String sgapellido) {
        this.sgapellido = sgapellido;
    }

    /**
     * Getter del atributo Id_cliente
     * @return el id_cliente del cliente
     */
    public String getId_cliente() {
        return id_cliente;
    }

    /**
     * Setter del atributo id_cliente
     * @param id_cliente estable del id del cliente
     */
    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * Getter del atributo telefono
     * @return el telefono del cliente
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Setter del atributo telefono
     * @param telefono estable del id del cliente
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Getter del atributo email
     * @return el email del cliente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter del atributo email
     * @param email estable del id del cliente
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter del atributo contraseña
     * @return la  contraseña del cliente
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Setter del atributo coontraseña
     * @param contraseña estable del id del cliente
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Getter del atributo direccion
     * @return la direccion del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Setter del atributo direccion
     * @param direccion estable del id del cliente
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", prApellido=" + prApellido + ", dni=" + dni + ", sgapellido="
                + sgapellido + ", id_cliente=" + id_cliente + ", telefono=" + telefono + ", email=" + email
                + ", contraseña=" + contraseña + ", direccion=" + direccion + "]";
    }
    
    
}
