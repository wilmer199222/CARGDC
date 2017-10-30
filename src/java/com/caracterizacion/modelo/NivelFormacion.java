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
 * @author Jhon
 */
public class NivelFormacion {
    private int idNivelFormacion;
    private String nombre;
    private String estado;

    public NivelFormacion() {
    }

    public NivelFormacion(int idNivelFormacion, String nombre, String estado) {
        this.idNivelFormacion = idNivelFormacion;
        this.nombre = nombre;
        this.estado = estado;
    }
     
     public static NivelFormacion load(ResultSet rs)throws SQLException{
        NivelFormacion objFormacion = new NivelFormacion();
        objFormacion.setIdNivelFormacion(rs.getInt(1));
        objFormacion.setNombre(rs.getString(2));
        objFormacion.setEstado(rs.getString(3));
        
        
        return objFormacion;
    }

    public int getIdNivelFormacion() {
        return idNivelFormacion;
    }

    public void setIdNivelFormacion(int idNivelFormacion) {
        this.idNivelFormacion = idNivelFormacion;
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
        return "NivelFormacion{" + "idNivelFormacion=" + idNivelFormacion + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
       
}
