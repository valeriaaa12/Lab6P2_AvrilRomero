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
public class Estacionaria extends Consola{
    private int controles;
    private int almacenamiento;
    private String conexion;

    public Estacionaria() {
    }

    public Estacionaria(int controles, int almacenamiento, String conexion, String identificacion, String fabricante, int year, double precio, String modelo) {
        super(identificacion, fabricante, year, precio, modelo);
        this.controles = controles;
        this.almacenamiento = almacenamiento;
        this.conexion = conexion;
    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
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
        return "Estacionaria{" + "controles=" + controles + ", almacenamiento=" + almacenamiento + ", conexion=" + conexion + '}';
    }
    
}
