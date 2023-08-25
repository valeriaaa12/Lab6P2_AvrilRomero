/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_avrilromero;

import java.util.ArrayList;

/**
 *
 * @author Valeria Romero
 */
public class Consola {
    protected String identificacion;
    protected String fabricante;
    protected int year;
    protected double precio;
    protected ArrayList<Juego> juegos_disponibles = new ArrayList();
    protected String modelo;

    public Consola() {
    }

    public Consola(String identificacion, String fabricante, int year, double precio, ArrayList<Juego> juegos_disponibles, String modelo) {
        this.identificacion = identificacion;
        this.fabricante = fabricante;
        this.year = year;
        this.precio = precio;
        this.juegos_disponibles = juegos_disponibles;
        this.modelo = modelo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Juego> getJuegos_disponibles() {
        return juegos_disponibles;
    }

    public void setJuegos_disponibles(ArrayList<Juego> juegos_disponibles) {
        this.juegos_disponibles = juegos_disponibles;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Consola{" + "identificacion=" + identificacion + ", fabricante=" + fabricante + ", year=" + year + ", precio=" + precio + ", juegos_disponibles=" + juegos_disponibles + ", modelo=" + modelo + '}';
    }
    
    
    
}
