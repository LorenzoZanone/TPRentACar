package com.mycompany.poo_05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lolo
 */
public class Cliente extends Persona {

    private int codCliente;

    public Cliente(int codCliente, int Dni, String nombre, int telefono, String direccion) {
        super(Dni, nombre, telefono, direccion);
        this.codCliente = codCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    @Override
    public String toString() {

        return "Datos del cliente:" + super.toString() + " codCliente:" + codCliente;
    }

}
