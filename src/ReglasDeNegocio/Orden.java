/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReglasDeNegocio;

import java.sql.Date;

/**
 *
 * @author Angel Ramos
 */
public class Orden {
    private int id_orden;
    private Proveedor proveedor;
    private Producto producto;
    private int cantidad;
    private double preciounitario;
    private int numeroorden;
    private Boolean entregada;
    private Date fechaentrega;

    public Orden() {
    }

    public Orden(int id_orden, Proveedor proveedor, Producto producto, int cantidad, double preciounitario, int numeroorden, Boolean entregada, Date fechaentrega) {
        this.id_orden = id_orden;
        this.proveedor = proveedor;
        this.producto = producto;
        this.cantidad = cantidad;
        this.preciounitario = preciounitario;
        this.numeroorden = numeroorden;
        this.entregada = entregada;
        this.fechaentrega = fechaentrega;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public int getNumeroorden() {
        return numeroorden;
    }

    public void setNumeroorden(int numeroorden) {
        this.numeroorden = numeroorden;
    }

    public Boolean getEntregada() {
        return entregada;
    }

    public void setEntregada(Boolean entregada) {
        this.entregada = entregada;
    }
    
    
}
