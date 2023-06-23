package com.mycompany.poo_05;

import com.mycompany.poo_05.Cliente;
import com.mycompany.poo_05.Auto;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Reserva {

    private ArrayList<Auto> listaAuto = new ArrayList<Auto>();
    private Cliente cliente;
    private LocalDate fechainic;
    private LocalDate fechafin;
    private int cantDias = 0;
    private int codReserva;
    private double precioTotal = 0;

    public Reserva(Cliente cliente, int cantDias) {
        this.cliente = cliente;
        this.cantDias = cantDias;
        fechainic = LocalDate.now();
        CalcularFechaFin();
    }

    public Reserva(Cliente cliente, LocalDate fechafin) {
        this.cliente = cliente;
        this.fechafin = fechafin;
        fechainic = LocalDate.now();

        CalcularDias();

    }

    public void AgregarAuto(ArrayList<Auto> auto) {

        listaAuto = auto;

    }

    public void CalcularDias() {
        cantDias = Period.between(fechainic, fechafin).getDays();

    }

    public void CalcularFechaFin() {
        fechafin = fechainic.plusDays(cantDias);

    }

    public void CalcularTotalRenta() {
        for (Auto p : listaAuto) {
            precioTotal += p.getPrecio() * cantDias;
        }
    }

    public void ImprimirTicket() {
        System.out.println("Datos del cliente: " + cliente.toString());
        System.out.println(" Precio total de la reserva: " + precioTotal);
        for (Auto p : listaAuto) {
            System.out.println("Datos del auto: " + "Marca :" + p.getMarca() + " modelo: " + p.getModelo() + " color: " + p.getColor() + " precio :" + p.getPrecio() + "matricula" + p.getMatricula());
        }

    }

}
