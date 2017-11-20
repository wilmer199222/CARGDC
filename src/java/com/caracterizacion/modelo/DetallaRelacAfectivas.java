/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author ESTUDIANTES
 */
public class DetallaRelacAfectivas {
        private int idDetallaRelacAfectivas;
        private int idRelacionesAfectivas;
        private int idCar;

    public DetallaRelacAfectivas() {
    }
    
    public DetallaRelacAfectivas(int idDetallaRelacAfectivas, int idRelacionesAfectivas, int idCar) {
        this.idDetallaRelacAfectivas = idDetallaRelacAfectivas;
        this.idRelacionesAfectivas = idRelacionesAfectivas;
        this.idCar = idCar;
    }

    public DetallaRelacAfectivas load(ResultSet rs) throws SQLException{
        DetallaRelacAfectivas objDeta = new DetallaRelacAfectivas();
        objDeta.setIdDetallaRelacAfectivas(rs.getInt(1));
        objDeta.setIdRelacionesAfectivas(rs.getInt(2));
        objDeta.setIdCar(rs.getInt(3));
        
        return objDeta;
    }
    
    
    public int getIdDetallaRelacAfectivas() {
        return idDetallaRelacAfectivas;
    }

    public void setIdDetallaRelacAfectivas(int idDetallaRelacAfectivas) {
        this.idDetallaRelacAfectivas = idDetallaRelacAfectivas;
    }

    public int getIdRelacionesAfectivas() {
        return idRelacionesAfectivas;
    }

    public void setIdRelacionesAfectivas(int idRelacionesAfectivas) {
        this.idRelacionesAfectivas = idRelacionesAfectivas;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    @Override
    public String toString() {
        return "DetallaRelacAfectivas{" + "idDetallaRelacAfectivas=" + idDetallaRelacAfectivas + ", idRelacionesAfectivas=" + idRelacionesAfectivas + ", idCar=" + idCar + '}';
    }
    
     
}
