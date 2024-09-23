package org.example;

import org.example.Ayudas.Licor;
import org.example.Modelos.Cliente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Licor licor = new Licor();
        Licor licor2 = new Licor("Ron", 4.5,"Colombia","Amargo",8.5);

        Cliente cliente = new Cliente();
        Cliente client = new Cliente("Sebastian", 24 ,"Medellin","Masculine", null);


        //accediendo a los atributos
        System.out.println("**************************CLIENTES************************");

        System.out.println(client.getNombre());
        System.out.println(client.getEdad());
        System.out.println(client.getCiudad());
        System.out.println(client.getGenero());
        System.out.println(client.getReserva());

        System.out.println("*************************LICORES****************************");

        System.out.println(licor2.getNombre());
        System.out.println(licor2.getGradoAlcohol());
        System.out.println(licor2.getRegion());
        System.out.println(licor2.getSabor());
        System.out.println(licor2.getCalorias());




    }
}