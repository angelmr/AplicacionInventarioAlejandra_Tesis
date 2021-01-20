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
public class Devolucion {
    private int id_devolucion;
    private Factura factura;
    private Date fecha;
    private String motivo;
    private int cantidad;

    public Devolucion() {
    }

    public Devolucion(int id_devolucion, Factura factura, Date fecha, String motivo, int cantidad) {
        this.id_devolucion = id_devolucion;
        this.factura = factura;
        this.fecha = fecha;
        this.motivo = motivo;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_devolucion() {
        return id_devolucion;
    }

    public void setId_devolucion(int id_devolucion) {
        this.id_devolucion = id_devolucion;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    
}
