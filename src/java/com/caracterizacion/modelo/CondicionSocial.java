package com.caracterizacion.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Estudiante
 */
public class CondicionSocial {
    private int idCondiconSocial;
    private String nombre;
    private String estado;

    public CondicionSocial() {
    }

    public CondicionSocial(int idCondiconSocial, String nombre, String estado) {
        this.idCondiconSocial = idCondiconSocial;
        this.nombre = nombre;
        this.estado = estado;
    }
     public static CondicionSocial load(ResultSet rs)throws SQLException{
        CondicionSocial objCondicion = new CondicionSocial();
        objCondicion.setIdCondiconSocial(rs.getInt(1));
        objCondicion.setNombre(rs.getString(2));
        objCondicion.setEstado(rs.getString(3));
        
        
        return objCondicion;
    }

    public int getIdCondiconSocial() {
        return idCondiconSocial;
    }

    public void setIdCondiconSocial(int idCondiconSocial) {
        this.idCondiconSocial = idCondiconSocial;
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
        return "CondicionSocial{" + "idCondiconSocial=" + idCondiconSocial + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
    
}
