package main.initial.service;

import main.models.Persona;

public class Initial {

    public static void main(String[] args) {
        //TODO: Hola chicos 😊 ¡Bienvenidos al primer desafío de Programación Orientada a Objetos en Java!

        // CONSIGNA 1:
        // Crear un nuevo package dentro del path src/main llamado models.
        // Ese package es donde deben colocar las clases que van a crear a continuación.


        // CONSIGNA 2:
        // Crear una clase llamada "Persona" dentro del path src/main.
        // La clase debe tener los siguientes atributos privados:
        // - String nombre
        // - int edad
        // - String dni

        // CONSIGNA 3:
        // En la clase Persona, crear un constructor que reciba los 3 atributos por parámetro
        // y los asigne correctamente.

        // CONSIGNA 4:
        // Crear los métodos getter y setter para todos los atributos.

        // CONSIGNA 5:
        // Crear un método llamado mostrarInformacion() que imprima los datos de la persona.

        // CONSIGNA 6:
        // Desde este método main, crear al menos 2 objetos Persona con diferentes datos.
        // Luego, llamar al método mostrarInformacion() de cada uno.

        // CONSIGNA 7:
        // Cambiar la edad de una de las personas utilizando el setter correspondiente,
        // y luego volver a mostrar la información actualizada.

        // CONSIGNA 8 (DESAFÍO EXTRA):
        // Crear un método llamado esMayorDeEdad() que devuelva true si la edad es mayor o igual a 18.
        // Usar este método desde el main para saber si las personas son mayores de edad.

        // TODO: ↓ Acá podés comenzar a resolver desde el main:

        // ¡A codear!

                // Crear objetos Persona
                Persona persona1 = new Persona("Claudia", 55, "22869333");
                Persona persona2 = new Persona("Gaston", 15, "47867234");

                // Mostrar información de ambas personas
                System.out.println("== Persona 1 ==");
                persona1.mostrarInformacion();
                System.out.println("¿Es mayor de edad? " + persona1.esMayorDeEdad());

                System.out.println("\n== Persona 2 ==");
                persona2.mostrarInformacion();
                System.out.println("¿Es mayor de edad? " + persona2.esMayorDeEdad());

                // Cambiar edad de persona2
                persona2.setEdad(19);
                System.out.println("\n== Persona 2 (Edad actualizada) ==");
                persona2.mostrarInformacion();
                System.out.println("¿Es mayor de edad? " + persona2.esMayorDeEdad());
            }
        }


