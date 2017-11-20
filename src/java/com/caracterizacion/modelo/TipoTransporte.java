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
public class TipoTransporte {
    private int idTipoTransporte;
    private String nombre;
    private String estado;

    public TipoTransporte() {
    }

    public TipoTransporte(int idTipoTransporte, String nombre, String estado) {
        this.idTipoTransporte = idTipoTransporte;
        this.nombre = nombre;
        this.estado = estado;
    }
     public static TipoTransporte load(ResultSet rs)throws SQLException{
        TipoTransporte objTransporte = new TipoTransporte();
        objTransporte.setIdTipoTransporte(rs.getInt(1));
        objTransporte.setNombre(rs.getString(2));
        objTransporte.setEstado(rs.getString(3));
        
        
        return objTransporte;
    }

    public int getIdTipoTransporte() {
        return idTipoTransporte;
    }

    public void setIdTipoTransporte(int idTipoTransporte) {
        this.idTipoTransporte = idTipoTransporte;
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
        return "TipoTransporte{" + "idTipoTransporte=" + idTipoTransporte + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
    
}
