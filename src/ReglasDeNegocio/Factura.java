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
public class Factura {
    private int id_factura;
    private Cliente cliente;
    private  Producto producto;
    private int cantidad;
    private double prociounitarioventa;
    private Date fechatransaccion;
    private int numerofactura;
    private double preciototal;

    public Factura() {
    }

    public Factura(int id_factura, Cliente cliente, Producto producto, int cantidad, double prociounitarioventa, Date fechatransaccion, int numerofactura, double preciototal) {
        this.id_factura = id_factura;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.prociounitarioventa = prociounitarioventa;
        this.fechatransaccion = fechatransaccion;
        this.numerofactura = numerofactura;
        this.preciototal = preciototal;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public double getProciounitarioventa() {
        return prociounitarioventa;
    }

    public void setProciounitarioventa(double prociounitarioventa) {
        this.prociounitarioventa = prociounitarioventa;
    }

    public Date getFechatransaccion() {
        return fechatransaccion;
    }

    public void setFechatransaccion(Date fechatransaccion) {
        this.fechatransaccion = fechatransaccion;
    }

    public int getNumerofactura() {
        return numerofactura;
    }

    public void setNumerofactura(int numerofactura) {
        this.numerofactura = numerofactura;
    }
    
    
    
}
