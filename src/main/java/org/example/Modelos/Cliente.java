package org.example.Modelos;

import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private Integer edad;
    private String ciudad;
    private String genero;
    private LocalDate reserva;

    public Cliente() {
    }

    public Cliente(String nombre, Integer edad, String ciudad, String genero, LocalDate reserva) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.genero = genero;
        this.reserva = reserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getReserva() {
        return reserva;
    }

    public void setReserva(LocalDate reserva) {
        this.reserva = reserva;
    }
}
