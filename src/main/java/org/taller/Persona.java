package org.taller;

// Persona implementa ambas interfaces, simulando herencia múltiple mediante interfaces
public class Persona implements Hablador, Trabajador {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Implementación obligatoria del método definido en Hablador
    @Override
    public void hablar() {
        System.out.println(nombre + " está hablando.");
    }

    // Implementación obligatoria del método definido en Trabajador
    @Override
    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }
}