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
public class AspectoDeVivienda {
    
       private int idAspectoVivienda;
      private  int NumeroDormitorios;
       private int NumeroBaños;
       private int Cocina;
        private int Sala;
      private  int Comedor;
      private  int idCaracterizacion;
      private  int idTecho;
      private  int idServiciosSanitario;
      private  int idTenencia;
      private  int idTipoVivienda;

   

    public AspectoDeVivienda(int idAspectoVivienda, int NumeroDormitorios, int NumeroBaños, int Cocina, int Sala, int Comedor, int idCaracterizacion, int idTecho, int idServiciosSanitario, int idTenencia, int idTipoVivienda) {
        this.idAspectoVivienda = idAspectoVivienda;
        this.NumeroDormitorios = NumeroDormitorios;
        this.NumeroBaños = NumeroBaños;
        this.Cocina = Cocina;
        this.Sala = Sala;
        this.Comedor = Comedor;
        this.idCaracterizacion = idCaracterizacion;
        this.idTecho = idTecho;
        this.idServiciosSanitario = idServiciosSanitario;
        this.idTenencia = idTenencia;
        this.idTipoVivienda = idTipoVivienda;
    }
    
     public AspectoDeVivienda() {
    }
    
    public static AspectoDeVivienda load(ResultSet rs)throws SQLException{
        AspectoDeVivienda objAspectoDeVivienda = new AspectoDeVivienda();
        objAspectoDeVivienda.setIdAspectoVivienda(rs.getInt(1));
        objAspectoDeVivienda.setNumeroDormitorios(rs.getInt(2));
        objAspectoDeVivienda.setNumeroBaños(rs.getInt(3));
        objAspectoDeVivienda.setCocina(rs.getInt(4));
        objAspectoDeVivienda.setSala(rs.getInt(5));
        objAspectoDeVivienda.setComedor(rs.getInt(6));
        objAspectoDeVivienda.setIdCaracterizacion(rs.getInt(7));
        objAspectoDeVivienda.setIdTecho(rs.getInt(8));
        objAspectoDeVivienda.setIdServiciosSanitario(rs.getInt(9));
        objAspectoDeVivienda.setIdTenencia(rs.getInt(10));
        objAspectoDeVivienda.setIdTipoVivienda(rs.getInt(11));
       
        
        return objAspectoDeVivienda;
    }

    public int getIdAspectoVivienda() {
        return idAspectoVivienda;
    }

    public void setIdAspectoVivienda(int idAspectoVivienda) {
        this.idAspectoVivienda = idAspectoVivienda;
    }

    public int getNumeroDormitorios() {
        return NumeroDormitorios;
    }

    public void setNumeroDormitorios(int NumeroDormitorios) {
        this.NumeroDormitorios = NumeroDormitorios;
    }

    public int getNumeroBaños() {
        return NumeroBaños;
    }

    public void setNumeroBaños(int NumeroBaños) {
        this.NumeroBaños = NumeroBaños;
    }

    public int getCocina() {
        return Cocina;
    }

    public void setCocina(int Cocina) {
        this.Cocina = Cocina;
    }

    public int getSala() {
        return Sala;
    }

    public void setSala(int Sala) {
        this.Sala = Sala;
    }

    public int getComedor() {
        return Comedor;
    }

    public void setComedor(int Comedor) {
        this.Comedor = Comedor;
    }

    public int getIdCaracterizacion() {
        return idCaracterizacion;
    }

    public void setIdCaracterizacion(int idCaracterizacion) {
        this.idCaracterizacion = idCaracterizacion;
    }

    public int getIdTecho() {
        return idTecho;
    }

    public void setIdTecho(int idTecho) {
        this.idTecho = idTecho;
    }

    public int getIdServiciosSanitario() {
        return idServiciosSanitario;
    }

    public void setIdServiciosSanitario(int idServiciosSanitario) {
        this.idServiciosSanitario = idServiciosSanitario;
    }

    public int getIdTenencia() {
        return idTenencia;
    }

    public void setIdTenencia(int idTenencia) {
        this.idTenencia = idTenencia;
    }

    public int getIdTipoVivienda() {
        return idTipoVivienda;
    }

    public void setIdTipoVivienda(int idTipoVivienda) {
        this.idTipoVivienda = idTipoVivienda;
    }

    @Override
    public String toString() {
        return "AspectoDeVivienda{" + "idAspectoVivienda=" + idAspectoVivienda + ", NumeroDormitorios=" + NumeroDormitorios + ", NumeroBa\u00f1os=" + NumeroBaños + ", Cocina=" + Cocina + ", Sala=" + Sala + ", Comedor=" + Comedor + ", idCaracterizacion=" + idCaracterizacion + ", idTecho=" + idTecho + ", idServiciosSanitario=" + idServiciosSanitario + ", idTenencia=" + idTenencia + ", idTipoVivienda=" + idTipoVivienda + '}';
    }
        
        
   
}
