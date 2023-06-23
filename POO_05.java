/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.poo_05;

import static com.mycompany.poo_05.POO_05.reserva;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lolo
 */
public class POO_05 {

    static Scanner entrada = new Scanner(System.in);
 
    public static void main(String[] args) {

        int opc = 1;
        Cliente cliente = CrearCliente();
        Auto array[] = CrearAutos();

        while (opc == 1) {
            ArrayList<Auto> auto = ElegirAuto(array);

            Reserva reserva = reserva(cliente, auto);
            CalcularRentaTotal(reserva);
            MostrarDatos(reserva);
            System.out.println("Desea seguir ingresando 1 -Si - Otro numero No");
            opc = entrada.nextInt();
        }

    }

    public static Cliente CrearCliente() {
        int dni;
        String nombre;
        int telefono;
        String direccion;
        int codCliente = 0;

        System.out.println("Digite su nombre");
        nombre = entrada.next();

        System.out.println("Digite su dni");
        dni = entrada.nextInt();
        System.out.println("Digite su telefono");
        telefono = entrada.nextInt();
        System.out.println("Digite su direccion");
        direccion = entrada.next();
        codCliente++;
        Cliente cliente = new Cliente(codCliente, dni, nombre, telefono, direccion);
        return cliente;

    }

    public static Auto[] CrearAutos() {
        Auto array[] = new Auto[3];
        array[0] = new Auto("Peugeot", "404", "AEF45645", "Rojo", 500.0);
        array[1] = new Auto("Chevrolet", "Espin", "AELFS973", "Azul", 1000.0);
        array[2] = new Auto("Fiat", "Palio", "LFVH678", "Negro", 2000.0);

        return array;

    }

    public static Reserva reserva(Cliente cliente, ArrayList<Auto> auto) {
        int dia;
        int mes;
        int año;
        int opc = 0;
        int cantdias;
        System.out.println("1-indicar la fecha final de la reserva o 2-la cantidad de dias");
        opc = entrada.nextInt();
        if (opc == 1) {
            System.out.println("    ");
            System.out.println("Digite hasta que dia desea realizar una reserva");
            dia = entrada.nextInt();
            System.out.println("Digite hasta que mes desea reservar");
            mes = entrada.nextInt();
            System.out.println("Digite hasta que año desea reservar");
            año = entrada.nextInt();
            LocalDate fecha = LocalDate.of(año, mes, dia);
            Reserva reserva = new Reserva(cliente, fecha);
            reserva.AgregarAuto(auto);
            return reserva;

        } else if (opc == 2) {
            System.out.println("    ");
            System.out.println("Digite la cantidad de dias que desea realizar una reserva");
            cantdias = entrada.nextInt();
            Reserva reserva = new Reserva(cliente, cantdias);
            reserva.AgregarAuto(auto);
            return reserva;
        }

        return null;
    }

    public static ArrayList<Auto> ElegirAuto(Auto array[]) {
        int cantAutos = 0;
        ArrayList<Auto> auto = new ArrayList<Auto>();
        System.out.println("Cuantos autos desea elegir");
        cantAutos = entrada.nextInt();
        while (cantAutos < 1 || cantAutos > 3) {
            System.out.println("Error, ingrese nuevamente");
            System.out.println("Cuantos autos desea elegir");
            cantAutos = entrada.nextInt();

        }

        System.out.println("Eliga de la opcion 1 a la 3");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " " + array[i].toString());
        }

        for (int i = 0; i < cantAutos; i++) {

            int opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    auto.add(array[0]);
                    break;
                case 2:
                    auto.add(array[1]);
                    break;
                case 3:
                    auto.add(array[2]);
                    break;
            }

        }

        return auto;

    }

    public static void CalcularRentaTotal(Reserva reserva) {

        reserva.CalcularTotalRenta();
    }

    public static void MostrarDatos(Reserva reserva) {
        reserva.ImprimirTicket();
    }
}
