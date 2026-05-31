package org.taller;

public class PruebaAnimal {

    public static void main(String[] args) {

        System.out.println("\n-------------- Animal --------------\n");

        // Se instancia un objeto capaz de utilizar comportamientos de ambas interfaces
        Animal animal = new Animal("Pato");

        animal.volar();
        animal.nadar();
    }
}