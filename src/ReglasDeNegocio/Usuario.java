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
public class Usuario {
    private int id_usuario;
    private Rol rol;
    private String nombre;
    private String apellido;
    private String nom_usuario;
    private String contrasenia;
    private Date fecha_registro;

    public Usuario() {
    }

    public Usuario(int id_usuario, Rol rol, String nombre, String apellido, String nom_usuario, String contrasenia, Date fecha_registro) {
        this.id_usuario = id_usuario;
        this.rol = rol;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nom_usuario = nom_usuario;
        this.contrasenia = contrasenia;
        this.fecha_registro = fecha_registro;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
}
