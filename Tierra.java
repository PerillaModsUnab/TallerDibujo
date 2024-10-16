/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

public class Tierra {
    // Atributos
    private String nombre;
    private int edad;
    private double masa;
    private String tipo;
    private boolean habitable;

    // Constructor
    public Tierra(String nombre, int edad, double masa, String tipo, boolean habitable) {
        this.nombre = nombre;
        this.edad = edad;
        this.masa = masa;
        this.tipo = tipo;
        this.habitable = habitable;
    }

    // Getters & Setters
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

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    // Métodos
    public void girar() {
        System.out.println("La Tierra gira sobre su eje.");
    }

    public void orbitar() {
        System.out.println("La Tierra orbita alrededor del Sol.");
    }

    public void soportarVida() {
        if (habitable) {
            System.out.println("La Tierra soporta vida.");
        } else {
            System.out.println("La Tierra no soporta vida.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Tipo: " + tipo);
        System.out.println("Habitable: " + habitable);
    }

    public void cambiarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }
}