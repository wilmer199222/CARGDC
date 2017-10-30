
package com.caracterizacion.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Estudiante
 */
public class RegimenSalud {
    private int idregimenSalud;
    private String nombre;
    private String estado;

    public RegimenSalud() {
    }

    public RegimenSalud(int idregimenSalud, String nombre, String estado) {
        this.idregimenSalud = idregimenSalud;
        this.nombre = nombre;
        this.estado = estado;
    }

      public static RegimenSalud load(ResultSet rs)throws SQLException{
        RegimenSalud objRegimen = new RegimenSalud();
        objRegimen.setIdregimenSalud(rs.getInt(1));
        objRegimen.setNombre(rs.getString(2));
        objRegimen.setEstado(rs.getString(3));
        
        
        return objRegimen;
    }
    public int getIdregimenSalud() {
        return idregimenSalud;
    }

    public void setIdregimenSalud(int idregimenSalud) {
        this.idregimenSalud = idregimenSalud;
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
        return "RegimenSalud{" + "idregimenSalud=" + idregimenSalud + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
    
}
