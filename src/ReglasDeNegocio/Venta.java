/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReglasDeNegocio;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Angel Ramos
 */
public class Venta {
    private int id_venta;
    private Cliente cliente;
    private Usuario usuario;
    private Date fecha;
    private Time hora;
    private double total;
    private boolean terminada; 

    public Venta() {
    }

    public Venta(int id_venta, Cliente cliente, Usuario usuario, Date fecha, Time hora, double total, boolean terminada) {
        this.id_venta = id_venta;
        this.cliente = cliente;
        this.usuario = usuario;
        this.fecha = fecha;
        this.hora = hora;
        this.total = total;
        this.terminada = terminada;
    }

    public boolean isTerminada() {
        return terminada;
    }

    public void setTerminada(boolean terminada) {
        this.terminada = terminada;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
