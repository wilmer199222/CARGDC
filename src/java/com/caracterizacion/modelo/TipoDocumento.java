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
public class TipoDocumento {
    private int idTipoDocumento;
    private String nombre;
    private String estado;

    public TipoDocumento() {
    }

    public TipoDocumento(int idTipoDocumento, String nombre, String estado) {
        this.idTipoDocumento = idTipoDocumento;
        this.nombre = nombre;
        this.estado = estado;
    }
     
     public static TipoDocumento load(ResultSet rs)throws SQLException{
        TipoDocumento objDocumento = new TipoDocumento();
        objDocumento.setIdTipoDocumento(rs.getInt(1));
        objDocumento.setNombre(rs.getString(2));
        objDocumento.setEstado(rs.getString(3));
        
        
        return objDocumento;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
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
        return "TipoDocumento{" + "idTipoDocumento=" + idTipoDocumento + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    

    
}
