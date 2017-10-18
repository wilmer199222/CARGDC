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
 * @author Estudiante
 */
public class ServPublicos {
    
    private int idServiciosPublicos;
    private String nombre;
    private String estado;

    public ServPublicos() {
    }
    

   
     public static ServPublicos load(ResultSet rs)throws SQLException{
        ServPublicos objServPublicos = new ServPublicos();
        objServPublicos.setIdServiciosPublicos(rs.getInt(1));
        objServPublicos.setNombre(rs.getString(2));
        objServPublicos.setEstado(rs.getString(3));
        
        
        return objServPublicos;
    }

    public ServPublicos(int idServiciosPublicos, String nombre, String estado) {
        this.idServiciosPublicos = idServiciosPublicos;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdServiciosPublicos() {
        return idServiciosPublicos;
    }

    public void setIdServiciosPublicos(int idServiciosPublicos) {
        this.idServiciosPublicos = idServiciosPublicos;
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
        return "ServPublicos{" + "idServiciosPublicos=" + idServiciosPublicos + ", nombre=" + nombre + ", estado=" + estado + '}';
    }

    
    
}
