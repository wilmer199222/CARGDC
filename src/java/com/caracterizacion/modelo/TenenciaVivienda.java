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
public class TenenciaVivienda {
    private int idTenencia;
    private String nombre;
    private String estado;

    public TenenciaVivienda() {
    }

    public TenenciaVivienda(int idTenencia, String nombre, String estado) {
        this.idTenencia = idTenencia;
        this.nombre = nombre;
        this.estado = estado;
    }
      public static TenenciaVivienda load(ResultSet rs)throws SQLException{
        TenenciaVivienda objTenencia = new TenenciaVivienda();
        objTenencia.setIdTenencia(rs.getInt(1));
        objTenencia.setNombre(rs.getString(2));
        objTenencia.setEstado(rs.getString(3));
        
        return objTenencia;
        
      }

    public int getIdTenencia() {
        return idTenencia;
    }

    public void setIdTenencia(int idTenencia) {
        this.idTenencia = idTenencia;
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
        return "TenenciaVivienda{" + "idTenencia=" + idTenencia + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
    
}
