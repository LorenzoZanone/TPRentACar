package com.mycompany.poo_05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Auto {

    private String marca;
    private String modelo;

    private String matricula;
    private String color;

    private double precio;

    public Auto(String marca, String modelo, String matricula, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.color = color;
        this.precio = precio;
    }

    

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Auto"+ "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", color=" + color + ", precio=" + precio ;
    }
    

}
