/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReglasDeNegocio;

/**
 *
 * @author Angel Ramos
 */
public class Proveedor {
    private int id_proveedor;
    private String ruc;
    private String representante;
    private String direccion;
    private String convencional;
    private String celular;
    private String email;

    public Proveedor() {
    }

    public Proveedor(int id_proveedor, String ruc, String representante, String direccion, String convencional, String celular, String email) {
        this.id_proveedor = id_proveedor;
        this.ruc = ruc;
        this.representante = representante;
        this.direccion = direccion;
        this.convencional = convencional;
        this.celular = celular;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getConvencional() {
        return convencional;
    }

    public void setConvencional(String convencional) {
        this.convencional = convencional;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
}
