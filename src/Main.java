package app;

import model.Empleado;
import model.Persona;

public class Main {
    public static void main(String[] args) {

        Persona cliente = new Persona("Ana Torres", "12.345.678-9",
                "Av. Frutillar", "450", "Llanquihue");

        Empleado guia = new Empleado("Pedro Soto", "9.876.543-2",
                "Los Canelos", "120", "Puerto Montt",
                "Guía Turístico", 850000);

        Empleado coordinadora = new Empleado("Valentina Ruiz", "15.432.100-K",
                "Calle Volcán", "88", "Llanquihue",
                "Coordinadora de Tours", 1100000);

        System.out.println("=== Sistema Llanquihue Tour ===\n");
        System.out.println("-- Cliente --");
        System.out.println(cliente.toString());
        System.out.println("\n-- Guía Turístico --");
        System.out.println(guia.toString());
        System.out.println("\n-- Coordinadora --");
        System.out.println(coordinadora.toString());
    }
}