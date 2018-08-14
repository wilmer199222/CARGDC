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
public class DetallaParedes {
        private int idDetallaParedes;
        private int idCar;
        private int idParedes;

    public DetallaParedes() {
    }

    public DetallaParedes(int idDetallaParedes, int idCar, int idParedes) {
        this.idDetallaParedes = idDetallaParedes;
        this.idCar = idCar;
        this.idParedes = idParedes;
    }
        
 public DetallaParedes load(ResultSet rs) throws SQLException{
        DetallaParedes objDeta = new DetallaParedes();
        objDeta.setIdDetallaParedes(rs.getInt(1));
        objDeta.setIdCar(rs.getInt(2));
        objDeta.setIdParedes(rs.getInt(3));
        
        return objDeta;
    }

    public int getIdDetallaParedes() {
        return idDetallaParedes;
    }

    public void setIdDetallaParedes(int idDetallaParedes) {
        this.idDetallaParedes = idDetallaParedes;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public int getIdParedes() {
        return idParedes;
    }

    public void setIdParedes(int idParedes) {
        this.idParedes = idParedes;
    }

    @Override
    public String toString() {
        return "DetallaParedes{" + "idDetallaParedes=" + idDetallaParedes + ", idCar=" + idCar + ", idParedes=" + idParedes + '}';
    }
           

    
}
