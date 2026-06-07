package model;

/**
 * Empleado de Llanquihue Tour.
 * Hereda atributos comunes de Persona y agrega cargo y sueldo.
 */
public class Empleado extends Persona {  // ← herencia

    private String cargo;
    private double sueldo;

    public Empleado(String nombre, String rut, String calle, String numero,
                    String ciudad, String cargo, double sueldo) {
        super(nombre, rut, calle, numero, ciudad);  // ← llama al constructor de Persona
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }

    @Override
    public String toString() {
        return super.toString()  // ← reutiliza el toString() de Persona
                + " | Cargo: " + cargo + " | Sueldo: $" + sueldo;
    }
}