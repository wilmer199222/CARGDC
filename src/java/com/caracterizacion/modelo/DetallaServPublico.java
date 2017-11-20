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
public class DetallaServPublico {
    
    private int idDetallaServPublic;
    private int idCaracterizacion;
    private int idServiciosPublicos;

    public DetallaServPublico() {
    }

    public DetallaServPublico(int idDetallaServPublic, int idCaracterizacion, int idServiciosPublicos) {
        this.idDetallaServPublic = idDetallaServPublic;
        this.idCaracterizacion = idCaracterizacion;
        this.idServiciosPublicos = idServiciosPublicos;
    }
    
    public DetallaServPublico load(ResultSet rs) throws SQLException{
        DetallaServPublico objDeta = new DetallaServPublico();
        objDeta.setIddetallaServPublic(rs.getInt(1));
        objDeta.setIdCaracterizacion(rs.getInt(2));
        objDeta.setIdServiciosPublicos(rs.getInt(3));
        
        return objDeta;
    }
    

    public int getIddetallaServPublic() {
        return idDetallaServPublic;
    }

    public void setIddetallaServPublic(int idDetallaServPublic) {
        this.idDetallaServPublic = idDetallaServPublic;
    }

    public int getIdCaracterizacion() {
        return idCaracterizacion;
    }

    public void setIdCaracterizacion(int idCaracterizacion) {
        this.idCaracterizacion = idCaracterizacion;
    }

    public int getIdServiciosPublicos() {
        return idServiciosPublicos;
    }

    public void setIdServiciosPublicos(int idServiciosPublicos) {
        this.idServiciosPublicos = idServiciosPublicos;
    }

    @Override
    public String toString() {
        return "DetallaServPublico{" + "idDetallaServPublic=" + idDetallaServPublic + ", idCaracterizacion=" + idCaracterizacion + ", idServiciosPublicos=" + idServiciosPublicos + '}';
    }

  
}
