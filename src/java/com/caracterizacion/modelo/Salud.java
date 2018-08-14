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
 * @author FINJE
 */
public class Salud {
    
    private int idSalud;	
    private String discapacidad;
    private String  frecuenciaMedico;	
    private String alergia;
    private String peso;	
    private String medicamento;	
    private String estatura;
    private String enfermedad;
    private int idCaracterizacion;	
    private int idregimenSalud;
    private String cualRegimen;

    public Salud() {
    }
    
    public static Salud load(ResultSet rs)throws SQLException{
        Salud objSalud = new Salud();
        objSalud.setIdSalud(rs.getInt(1));
        objSalud.setDiscapacidad(rs.getString(2));
        objSalud.setFrecuenciaMedico(rs.getString(3));
        objSalud.setAlergia(rs.getString(4));
        objSalud.setPeso(rs.getString(5));
        objSalud.setMedicamento(rs.getString(6));
        objSalud.setEstatura(rs.getString(7));
        objSalud.setEnfermedad(rs.getString(8));
        objSalud.setIdCaracterizacion(rs.getInt(9));
        objSalud.setIdregimenSalud(rs.getInt(10));
        objSalud.setCualRegimen(rs.getString(11));
        
        
        return objSalud;
    }

    public Salud(int idSalud, String discapacidad, String frecuenciaMedico, String alergia, String peso, String medicamento, String estatura, String enfermedad, int idCaracterizacion, int idregimenSalud, String cualRegimen) {
        this.idSalud = idSalud;
        this.discapacidad = discapacidad;
        this.frecuenciaMedico = frecuenciaMedico;
        this.alergia = alergia;
        this.peso = peso;
        this.medicamento = medicamento;
        this.estatura = estatura;
        this.enfermedad = enfermedad;
        this.idCaracterizacion = idCaracterizacion;
        this.idregimenSalud = idregimenSalud;
        this.cualRegimen = cualRegimen;
    }

    public int getIdSalud() {
        return idSalud;
    }

    public void setIdSalud(int idSalud) {
        this.idSalud = idSalud;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getFrecuenciaMedico() {
        return frecuenciaMedico;
    }

    public void setFrecuenciaMedico(String frecuenciaMedico) {
        this.frecuenciaMedico = frecuenciaMedico;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public int getIdCaracterizacion() {
        return idCaracterizacion;
    }

    public void setIdCaracterizacion(int idCaracterizacion) {
        this.idCaracterizacion = idCaracterizacion;
    }

    public int getIdregimenSalud() {
        return idregimenSalud;
    }

    public void setIdregimenSalud(int idregimenSalud) {
        this.idregimenSalud = idregimenSalud;
    }

    public String getCualRegimen() {
        return cualRegimen;
    }

    public void setCualRegimen(String cualRegimen) {
        this.cualRegimen = cualRegimen;
    }

    @Override
    public String toString() {
        return "Salud{" + "idSalud=" + idSalud + ", discapacidad=" + discapacidad + ", frecuenciaMedico=" + frecuenciaMedico + ", alergia=" + alergia + ", peso=" + peso + ", medicamento=" + medicamento + ", estatura=" + estatura + ", enfermedad=" + enfermedad + ", idCaracterizacion=" + idCaracterizacion + ", idregimenSalud=" + idregimenSalud + ", cualRegimen=" + cualRegimen + '}';
    }

   
    
}
