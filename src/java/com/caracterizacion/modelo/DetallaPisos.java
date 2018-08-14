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
public class DetallaPisos {
        private int idDetallaPisos;
        private int idCar;
        private int idPiso;

    public DetallaPisos() {
    }
    
    public DetallaPisos(int idDetallaPisos, int idCar, int idPiso) {
        this.idDetallaPisos = idDetallaPisos;
        this.idCar = idCar;
        this.idPiso = idPiso;
    }

    public DetallaPisos load(ResultSet rs) throws SQLException{
        DetallaPisos objDeta = new DetallaPisos();
        objDeta.setIdDetallaPisos(rs.getInt(1));
        objDeta.setIdCar(rs.getInt(2));
        objDeta.setIdPiso(rs.getInt(3));
        
        return objDeta;
    }

    public int getIdDetallaPisos() {
        return idDetallaPisos;
    }

    public void setIdDetallaPisos(int idDetallaPisos) {
        this.idDetallaPisos = idDetallaPisos;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public int getIdPiso() {
        return idPiso;
    }

    public void setIdPiso(int idPiso) {
        this.idPiso = idPiso;
    }

    @Override
    public String toString() {
        return "DetallaPisos{" + "idDetallaPisos=" + idDetallaPisos + ", idCar=" + idCar + ", idPiso=" + idPiso + '}';
    }
    

}
