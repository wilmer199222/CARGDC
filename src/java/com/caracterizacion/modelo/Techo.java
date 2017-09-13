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
public class Techo {
    private int idTecho;
    private String nombre;
    private String estado;

    public Techo() {
    }

    public Techo(int idTecho, String nombre, String estado) {
        this.idTecho = idTecho;
        this.nombre = nombre;
        this.estado = estado;
    }

    
      public static Techo load(ResultSet rs)throws SQLException{
        Techo objTecho = new Techo();
        objTecho.setIdTecho(rs.getInt(1));
        objTecho.setNombre(rs.getString(2));
        objTecho.setEstado(rs.getString(3));
        
        
        return objTecho;
    }

    public int getIdTecho() {
        return idTecho;
    }

    public void setIdTecho(int idTecho) {
        this.idTecho = idTecho;
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
        return "Techo{" + "idTecho=" + idTecho + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
      
}
