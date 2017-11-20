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
public class DetallaSocAfectiva {
    
    private int idDetallaSocAfectiva;
    private int idCar;
    private int idSocioAfectiva;

    public DetallaSocAfectiva() {
    }

    public DetallaSocAfectiva(int idDetallaSocAfectiva, int idCar, int idSocioAfectiva) {
        this.idDetallaSocAfectiva = idDetallaSocAfectiva;
        this.idCar = idCar;
        this.idSocioAfectiva = idSocioAfectiva;
    }

    public DetallaSocAfectiva load(ResultSet rs) throws SQLException{
        DetallaSocAfectiva  objDeta = new DetallaSocAfectiva();
        objDeta.setIdDetallaSocAfectiva(rs.getInt(1));
        objDeta.setIdCar(rs.getInt(2));
        objDeta.setIdSocioAfectiva(rs.getInt(3));
        
        return objDeta;
    }
    
    
    public int getIdDetallaSocAfectiva() {
        return idDetallaSocAfectiva;
    }

    public void setIdDetallaSocAfectiva(int idDetallaSocAfectiva) {
        this.idDetallaSocAfectiva = idDetallaSocAfectiva;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public int getIdSocioAfectiva() {
        return idSocioAfectiva;
    }

    public void setIdSocioAfectiva(int idSocioAfectiva) {
        this.idSocioAfectiva = idSocioAfectiva;
    }

    @Override
    public String toString() {
        return "DetallaSocAfectiva{" + "idDetallaSocAfectiva=" + idDetallaSocAfectiva + ", idCar=" + idCar + ", idSocioAfectiva=" + idSocioAfectiva + '}';
    }
    
    
    
}
