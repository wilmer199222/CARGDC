/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.modelo;

/**
 *
 * @author ESTUDIANTES
 */
public class DetalleTipoTransporte {
    private int idDetalleTipoTransporte;
    private int idCaracterizacion;
    private int idTipoTransporte;

    public DetalleTipoTransporte() {
    }

    public DetalleTipoTransporte(int idDetalleTipoTransporte, int idCaracterizacion, int idTipoTransporte) {
        this.idDetalleTipoTransporte = idDetalleTipoTransporte;
        this.idCaracterizacion = idCaracterizacion;
        this.idTipoTransporte = idTipoTransporte;
    }

    public int getIdDetalleTipoTransporte() {
        return idDetalleTipoTransporte;
    }

    public void setIdDetalleTipoTransporte(int idDetalleTipoTransporte) {
        this.idDetalleTipoTransporte = idDetalleTipoTransporte;
    }

    public int getIdCaracterizacion() {
        return idCaracterizacion;
    }

    public void setIdCaracterizacion(int idCaracterizacion) {
        this.idCaracterizacion = idCaracterizacion;
    }

    public int getIdTipoTransporte() {
        return idTipoTransporte;
    }

    public void setIdTipoTransporte(int idTipoTransporte) {
        this.idTipoTransporte = idTipoTransporte;
    }
    
    
    
}
