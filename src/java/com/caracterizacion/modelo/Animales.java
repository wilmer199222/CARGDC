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
public class Animales {
    
    private int idAnimal;
    private String nombre;
    private String estado;

    public Animales() {
    }

    public Animales(int idAnimal, String nombre, String estado) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.estado = estado;
    }
    
      public static Animales load(ResultSet rs)throws SQLException{
        Animales objAnimal = new Animales();
        objAnimal.setIdAnimal(rs.getInt(1));
        objAnimal.setNombre(rs.getString(2));
        objAnimal.setEstado(rs.getString(3));
        
        
        return objAnimal;
    }


    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
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
        return "Animales{" + "idAnimal=" + idAnimal + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
}
