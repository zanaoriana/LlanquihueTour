package model;

/**
 * Clase base que representa cualquier persona de Llanquihue Tour.
 * Mantiene composición con Direccion.
 */
public class Persona {

    private String nombre;
    private String rut;
    private Direccion direccion;  // ← composición

    public Persona(String nombre, String rut, String calle, String numero, String ciudad) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = new Direccion(calle, numero, ciudad);  // ← se crea aquí
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | RUT: " + rut
                + " | Dirección: " + direccion.toString();
    }
}