package com.company;

import com.company.banco.CuentaBancaria;
import com.company.paquete1.Person;
import com.company.paquete2.Animal;

public class Main {

    public static int numerador = 10;
    public static int denominador = 0;
    public static float division;

    public static void main(String[] args) {

        System.out.println("Antes de hacer la división");

        try {
            division = numerador/denominador;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Soy finally");
        }
        //de la tablita de jerarquía, se acomoda los ex de abajo a arriba
        //(específicaa a general)


        System.out.println("Después de la división");

        /*CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("Fernanda Flores");
        cuenta.setClave("ABCD-100291");
        cuenta.setSaldo(1000000);

        System.out.println(cuenta.getNombre());
        cuenta.mostrarSaldo();
         */



        /*Animal animal = new Animal();
        animal.nombre = "Iguana";
         */
        /*
        Persona persona = new Persona();
        persona.nombre = "Fer";
        persona.edad = 22;
         */


        //Person person= new Person("Fernanda", 22, "102045455");
        //o Person person= new Person();
        // person.setName("Fernanda");
        //person.setId("holaa");
        //person.getAge(22);
        /*System.out.println( "Name: " + person.getName());
        System.out.println( "Age: "+ person.getAge());
        System.out.println( "Id: " +  person.getId());
         */



        }
    }

