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
public class Portatil extends Consola{
    private String size;
    private int duracion;
    private boolean estuche;

    public Portatil() {
    }

    public Portatil(String size, int duracion, boolean estuche, String identificacion, String fabricante, int year, double precio, String modelo) {
        super(identificacion, fabricante, year, precio, modelo);
        this.size = size;
        this.duracion = duracion;
        this.estuche = estuche;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
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
        return "Portatil{" + "size=" + size + ", duracion=" + duracion + ", estuche=" + estuche + '}';
    }
    
}
