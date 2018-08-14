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
public class DetallaAnimales {
        private int idDetallaAnimales;
        private int idCar;
        private int idAnimal;
        private String observacion;

    public DetallaAnimales() {
    }

    public DetallaAnimales(int idDetallaAnimales, int idCar, int idAnimal, String observacion) {
        this.idDetallaAnimales = idDetallaAnimales;
        this.idCar = idCar;
        this.idAnimal = idAnimal;
        this.observacion = observacion;
    }
    
        
 public DetallaAnimales load(ResultSet rs) throws SQLException{
        DetallaAnimales objDeta = new DetallaAnimales();
        objDeta.setIdDetallaAnimales(rs.getInt(1));
        objDeta.setIdCar(rs.getInt(2));
        objDeta.setIdAnimal(rs.getInt(3));
        objDeta.setObservacion(rs.getString(4));
        
        return objDeta;
    }

    public int getIdDetallaAnimales() {
        return idDetallaAnimales;
    }

    public void setIdDetallaAnimales(int idDetallaAnimales) {
        this.idDetallaAnimales = idDetallaAnimales;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimales(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "DetallaAnimales{" + "idDetallaAnimales=" + idDetallaAnimales + ", idCar=" + idCar + ", idAnimal=" + idAnimal + ", observacion=" + observacion + '}';
    }

    private void setIdAnimal(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
