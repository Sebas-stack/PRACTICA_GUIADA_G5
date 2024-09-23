package org.example.Ayudas;

public class Licor {
    private String nombre;
    private Double gradoAlcohol;
    private String region;
    private String Sabor;
    private Double calorias;


    public Licor() {
    }

    public Licor(String nombre, Double gradoAlcohol, String region, String sabor, Double calorias) {
        this.nombre = nombre;
        this.gradoAlcohol = gradoAlcohol;
        this.region = region;
        Sabor = sabor;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(Double gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSabor() {
        return Sabor;
    }

    public void setSabor(String sabor) {
        Sabor = sabor;
    }

    public Double getCalorias() {
        return calorias;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }
}
