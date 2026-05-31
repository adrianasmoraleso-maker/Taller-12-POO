package org.taller;

public class PruebaPersona {

    public static void main(String[] args) {

        System.out.println("\n------------- Persona -------------\n");

        // La clase Persona puede utilizar los comportamientos definidos por ambas interfaces
        Persona persona = new Persona("Mateo");

        persona.hablar();
        persona.trabajar();
    }
}