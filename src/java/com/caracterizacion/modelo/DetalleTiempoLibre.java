/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.modelo;

/**
 *
 * @author FINJE
 */
public class DetalleTiempoLibre {
    
   private int idDetalleTiempoLibre;
   private int idTiempoLibre;
   private int idCar;

    public DetalleTiempoLibre() {
    }

    public DetalleTiempoLibre(int idDetalleTiempoLibre, int idTiempoLibre, int idCar) {
        this.idDetalleTiempoLibre = idDetalleTiempoLibre;
        this.idTiempoLibre = idTiempoLibre;
        this.idCar = idCar;
    }

    public int getIdDetalleTiempoLibre() {
        return idDetalleTiempoLibre;
    }

    public void setIdDetalleTiempoLibre(int idDetalleTiempoLibre) {
        this.idDetalleTiempoLibre = idDetalleTiempoLibre;
    }

    public int getIdTiempoLibre() {
        return idTiempoLibre;
    }

    public void setIdTiempoLibre(int idTiempoLibre) {
        this.idTiempoLibre = idTiempoLibre;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    @Override
    public String toString() {
        return "DetalleTiempoLibre{" + "idDetalleTiempoLibre=" + idDetalleTiempoLibre + ", idTiempoLibre=" + idTiempoLibre + ", idCar=" + idCar + '}';
    }
   
    
   
    
}
