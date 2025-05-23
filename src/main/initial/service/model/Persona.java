package main.initial.service.model;

public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;
    private String dni;

    // Constructor
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Metodo para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
    }

    // Metodo extra: verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}
