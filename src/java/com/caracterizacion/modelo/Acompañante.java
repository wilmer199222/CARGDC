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
public class Acompañante {
    private int idAcompañante;
    private String nombre;
    private String estado;

    public Acompañante() {
    }

    public Acompañante(int idAcompañante, String nombre, String estado) {
        this.idAcompañante = idAcompañante;
        this.nombre = nombre;
        this.estado = estado;
    }
    
     public static Acompañante load(ResultSet rs)throws SQLException{
        Acompañante objAcompañante = new Acompañante();
        objAcompañante.setIdAcompañante(rs.getInt(1));
        objAcompañante.setNombre(rs.getString(2));
        objAcompañante.setEstado(rs.getString(3));
        
        
        return objAcompañante;
     }

    public int getIdAcompañante() {
        return idAcompañante;
    }

    public void setIdAcompañante(int idAcompañante) {
        this.idAcompañante = idAcompañante;
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
        return "Acompa\u00f1ante{" + "idAcompa\u00f1ante=" + idAcompañante + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
    
}
