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
public class SocioAfectiva {
    private int idSocioAfectiva;
    private String nombre;
    private String estado;

    public SocioAfectiva() {
    }

    public SocioAfectiva(int idSocioAfectiva, String nombre, String estado) {
        this.idSocioAfectiva = idSocioAfectiva;
        this.nombre = nombre;
        this.estado = estado;
    }
    
    public static SocioAfectiva load(ResultSet rs)throws SQLException{
        SocioAfectiva objSocioafectiva = new SocioAfectiva();
        objSocioafectiva.setIdSocioAfectiva(rs.getInt(1));
        objSocioafectiva.setNombre(rs.getString(2));
        objSocioafectiva.setEstado(rs.getString(3));
        
        
        return objSocioafectiva;
    }

    public int getIdSocioAfectiva() {
        return idSocioAfectiva;
    }

    public void setIdSocioAfectiva(int idSocioAfectiva) {
        this.idSocioAfectiva = idSocioAfectiva;
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
        return "SocioAfectiva{" + "idSocioAfectiva=" + idSocioAfectiva + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
    
}
