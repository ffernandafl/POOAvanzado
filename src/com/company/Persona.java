package com.company;

public class Persona {

    //Modificador de acceso privado nos permite acceder a los elementos desde
    //la misma clase
    String nombre;
    int edad;

    void saludar () {
        System.out.println("Hola, soy " + this.nombre + " y tengo " + this.edad + " años.");
    }
}
