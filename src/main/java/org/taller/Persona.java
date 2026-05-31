package org.taller;

//Ejercicio3: implementar una interfaz sin proporcionar las implementaciones de sus métodos

// Error: la clase implementa interfaces pero no define sus métodos.
public class Persona implements Hablador, Trabajador {

}

/* EXPLICACIÓN:
 La clase implementa las interfaces Hablador y Trabajador, pero no proporciona
 la implementación de sus métodos. Esto genera un error de compilación porque
 toda clase concreta que implemente una interfaz debe definir todos los métodos
 declarados en ella.
*/

//------------------------------------------------------------------------------------------------//
/*

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
*/
//------------------------------------------------------------------------------------------------//