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
 * @author ESTUDIANTES
 */
public class RelacionesAfectivas {
    private int idRelacionesAfectivas;
    private String nombre;
    private String estado;

    public RelacionesAfectivas() {
    }

    public RelacionesAfectivas(int idRelacionesAfectivas, String nombre, String estado) {
        this.idRelacionesAfectivas = idRelacionesAfectivas;
        this.nombre = nombre;
        this.estado = estado;
    }
    
    public static RelacionesAfectivas load(ResultSet rs)throws SQLException{
        RelacionesAfectivas objRelacionesAfectivas = new RelacionesAfectivas();
        objRelacionesAfectivas.setIdRelacionesAfectivas(rs.getInt(1));
        objRelacionesAfectivas.setNombre(rs.getString(2));
        objRelacionesAfectivas.setEstado(rs.getString(3));
        
        
        return objRelacionesAfectivas;
    }

    public int getIdRelacionesAfectivas() {
        return idRelacionesAfectivas;
    }

    public void setIdRelacionesAfectivas(int idRelacionesAfectivas) {
        this.idRelacionesAfectivas = idRelacionesAfectivas;
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
        return "RelacionesAfectivas{" + "idRelacionesAfectivas=" + idRelacionesAfectivas + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
}
