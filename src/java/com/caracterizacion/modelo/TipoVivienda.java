
package com.caracterizacion.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ESTUDIANTES
 */
public class TipoVivienda {
   private int idTipo;
   private String nombre;
   private String estado;

    public TipoVivienda() {
    }
    
     public static TipoVivienda load(ResultSet rs)throws SQLException{
        TipoVivienda objTipoViv = new TipoVivienda();
        objTipoViv.setIdTipo(rs.getInt(1));
        objTipoViv.setNombre(rs.getString(2));
        objTipoViv.setEstado(rs.getString(3));
        
        
        return objTipoViv;
    }

    public TipoVivienda(int idTipo, String nombre, String estado) {
        this.idTipo = idTipo;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
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
        return "TipoVivienda{" + "idTipo=" + idTipo + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
   
   
    
}
