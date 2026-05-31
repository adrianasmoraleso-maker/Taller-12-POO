package org.taller;

// Animal implementa dos interfaces para adquirir múltiples comportamientos.
public class Animal implements Volador, Nadador {

    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    // Implementación del comportamiento definido en Volador
    @Override
    public void volar() {
        System.out.println("El "+ especie + " está volando");
    }

    // Implementación del comportamiento definido en Nadador
    @Override
    public void nadar() {
        System.out.println("El "+ especie + " está nadando");
    }
}