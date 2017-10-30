

package com.caracterizacion.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Estudiante
 */
public class TiempoLibre {
    private int idTiempoLibre;
    private String nombre;
    private String estado;

    public TiempoLibre() {
    }

    public TiempoLibre(int idTiempoLibre, String nombre, String estado) {
        this.idTiempoLibre = idTiempoLibre;
        this.nombre = nombre;
        this.estado = estado;
    }
    
      public static TiempoLibre load(ResultSet rs)throws SQLException{
        TiempoLibre objTiempo = new TiempoLibre();
        objTiempo.setIdTiempoLibre(rs.getInt(1));
        objTiempo.setNombre(rs.getString(2));
        objTiempo.setEstado(rs.getString(3));
        
        
        return objTiempo;
    }


    public int getIdTiempoLibre() {
        return idTiempoLibre;
    }

    public void setIdTiempoLibre(int idTiempoLibre) {
        this.idTiempoLibre = idTiempoLibre;
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
        return "TiempoLibre{" + "idTiempoLibre=" + idTiempoLibre + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
    
}
