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
public class Tipofamiliar {
    
    private int idTipoFamiliar;
    private String nombre;
    private String estado;

    public Tipofamiliar() {
    }

    public Tipofamiliar(int idTipoFamiliar, String nombre, String estado) {
        this.idTipoFamiliar = idTipoFamiliar;
        this.nombre = nombre;
        this.estado = estado;
    }
    
      public static Tipofamiliar load(ResultSet rs)throws SQLException{
        Tipofamiliar objTipofamiliar = new Tipofamiliar();
        objTipofamiliar.setIdTipoFamiliar(rs.getInt(1));
        objTipofamiliar.setNombre(rs.getString(2));
        objTipofamiliar.setEstado(rs.getString(3));
        
        
        return objTipofamiliar;
    }

    public int getIdTipoFamiliar() {
        return idTipoFamiliar;
    }

    public void setIdTipoFamiliar(int idTipoFamiliar) {
        this.idTipoFamiliar = idTipoFamiliar;
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
        return "Tipofamiliar{" + "idTipoFamiliar=" + idTipoFamiliar + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
   
}
