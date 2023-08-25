/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_avrilromero;

import java.util.Date;

/**
 *
 * @author Valeria Romero
 */
public class Juego {
    private String nombre;
    private String descripcion;
    private Date fecha;
    private double precio;
    private String estado;
    private boolean rentable;
    private boolean agregado;
    private int cantidad;

    public Juego() {
    }

    public Juego(String nombre, String descripcion, Date fecha, double precio, String estado, boolean rentable, boolean agregado, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.precio = precio;
        this.estado = estado;
        this.rentable = rentable;
        this.agregado = agregado;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Juego{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha + ", precio=" + precio + ", estado=" + estado + ", rentable=" + rentable + ", agregado=" + agregado + ", cantidad=" + cantidad + '}';
    }
    
}
