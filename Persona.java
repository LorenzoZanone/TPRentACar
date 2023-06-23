package com.mycompany.poo_05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lolo
 */
public abstract class Persona {

    private int Dni;
    private String nombre;
    private int telefono;
    private String direccion;

    public Persona(int Dni, String nombre, int telefono, String direccion) {
        this.Dni = Dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getDni() {
        return Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Dni=" + Dni + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion" + direccion;
    }

}
