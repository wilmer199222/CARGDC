/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.modelo;

import java.sql.ResultSet;

/**
 *
 * @author ESTUDIANTES
 */
public class DetallaTipoTransporte {
    private  int idDetallaTipoTransporte;
    private int idCar;
    private int idTransporte;

    public DetallaTipoTransporte() {
    }

    public DetallaTipoTransporte(int idDetallaTipoTransporte, int idCar, int idTransporte) {
        this.idDetallaTipoTransporte = idDetallaTipoTransporte;
        this.idCar = idCar;
        this.idTransporte = idTransporte;
    }

    public int getIdDetallaTipoTransporte() {
        return idDetallaTipoTransporte;
    }

    public void setIdDetallaTipoTransporte(int idDetallaTipoTransporte) {
        this.idDetallaTipoTransporte = idDetallaTipoTransporte;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public int getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
    }

    @Override
    public String toString() {
        return "DetallaTipoTransporte{" + "idDetallaTipoTransporte=" + idDetallaTipoTransporte + ", idCar=" + idCar + ", idTransporte=" + idTransporte + '}';
    }

    public DetallaTipoTransporte load(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
