/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author clemente
 */
public class ServiciosSanitarios {
    private int idServiciosSanitario;
    private String nombre;
    private String estado;

    public ServiciosSanitarios() {
    }

    public ServiciosSanitarios(int idServiciosSanitario, String nombre, String estado) {
        this.idServiciosSanitario = idServiciosSanitario;
        this.nombre = nombre;
        this.estado = estado;
    }

   
    
    
     public static ServiciosSanitarios load(ResultSet rs)throws SQLException{
        ServiciosSanitarios objSerSan = new ServiciosSanitarios();
        objSerSan.setIdServiciosSanitario(rs.getInt(1));
        objSerSan.setNombre(rs.getString(2));
        objSerSan.setEstado(rs.getString(3));
        
        
        return objSerSan;
    }

    public int getIdServiciosSanitario() {
        return idServiciosSanitario;
    }

    public void setIdServiciosSanitario(int idServiciosSanitario) {
        this.idServiciosSanitario = idServiciosSanitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ServiciosSanitarios{" + "idServiciosSanitario=" + idServiciosSanitario + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
     
}