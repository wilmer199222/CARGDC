
package com.caracterizacion.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Estudiante
 */
public class Pisos {
    private int idPiso;
    private String nombre;
    private String estado;

    public Pisos() {
    }

    public Pisos(int idPiso, String nombre, String estado) {
        this.idPiso = idPiso;
        this.nombre = nombre;
        this.estado = estado;
    }
    
     public static Pisos load(ResultSet rs)throws SQLException{
        Pisos objPisos = new Pisos();
        objPisos.setIdPiso(rs.getInt(1));
        objPisos.setNombre(rs.getString(2));
        objPisos.setEstado(rs.getString(3));
        
        
        return objPisos;
    }

    public int getIdPiso() {
        return idPiso;
    }

    public void setIdPiso(int idPiso) {
        this.idPiso = idPiso;
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
        return "Pisos{" + "idPiso=" + idPiso + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
     
  
    
}
