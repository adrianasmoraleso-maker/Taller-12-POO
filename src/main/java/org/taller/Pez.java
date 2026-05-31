package org.taller;

// Mala práctica: un pez no debería implementar la interfaz Volador.
public class Pez implements Volador, Nadador {

    @Override
    public void volar() {
        System.out.println("El pez está volando");
    }

    @Override
    public void nadar() {
        System.out.println("El pez está nadando");
    }
}


//Ejercicio3: Implementar interfaces en clases que no tienen lógica relevante para esas interfaces

/*Aunque el código compila correctamente, representa una mala práctica de diseño.
 La clase Pez implementa la interfaz Volador, a pesar de que los peces no poseen
 la capacidad de volar. Las interfaces deben utilizarse únicamente cuando los
 comportamientos definidos tengan una relación lógica con la clase que las implementa.
*/