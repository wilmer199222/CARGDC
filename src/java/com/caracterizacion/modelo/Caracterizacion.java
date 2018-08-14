/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.modelo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ESTUDIANTES
 */
public class Caracterizacion {
    private int idCaracterizacion;
    private String deportes;
    private Date fechaAsistencia;
    private double valorIngreso;
    private double varlorGastos;
    private String armoniaFamiliar;
    private String observacion;
    private int estado;
    private int idCondicionSocial;
    private int idTipoFamiliar;
    private int idEmpleado;
    private String cedulaAcudiente;
    private int idPersona;
    private String comparteHabitacion;
    private String observacionComparteHabitacion;
    private String acompañante;
    private String cual;

    

    

    public Caracterizacion() {
    }

    public Caracterizacion(int idCaracterizacion, String deportes, Date fechaAsistencia, double valorIngreso, double varlorGastos, String armoniaFamiliar, String observacion, int estado, int idCondicionSocial, int idTipoFamiliar, int idEmpleado, String cedulaAcudiente, int idPersona, String comparteHabitacion, String observacionComparteHabitacion, String acompañante, String cual) {
        this.idCaracterizacion = idCaracterizacion;
        this.deportes = deportes;
        this.fechaAsistencia = fechaAsistencia;
        this.valorIngreso = valorIngreso;
        this.varlorGastos = varlorGastos;
        this.armoniaFamiliar = armoniaFamiliar;
        this.observacion = observacion;
        this.estado = estado;
        this.idCondicionSocial = idCondicionSocial;
        this.idTipoFamiliar = idTipoFamiliar;
        this.idEmpleado = idEmpleado;
        this.cedulaAcudiente = cedulaAcudiente;
        this.idPersona = idPersona;
        this.comparteHabitacion = comparteHabitacion;
        this.observacionComparteHabitacion = observacionComparteHabitacion;
        this.acompañante = acompañante;
        this.cual = cual;
    }
    
    
     public static Caracterizacion load(ResultSet rs)throws SQLException{
        Caracterizacion objCaracterizacion = new Caracterizacion();
        objCaracterizacion.setIdCaracterizacion(rs.getInt(1));
        objCaracterizacion.setDeportes(rs.getString(2));
        objCaracterizacion.setFechaAsistencia(rs.getDate(3));
        objCaracterizacion.setValorIngreso(rs.getDouble(4));
        objCaracterizacion.setVarlorGastos(rs.getDouble(5));
        objCaracterizacion.setArmoniaFamiliar(rs.getString(6));
        objCaracterizacion.setObservacion(rs.getString(7));
        objCaracterizacion.setEstado(rs.getInt(8));
        objCaracterizacion.setIdCondicionSocial(rs.getInt(9));
        objCaracterizacion.setIdTipoFamiliar(rs.getInt(10));
        objCaracterizacion.setIdEmpleado(rs.getInt(11));
        objCaracterizacion.setCedulaAcudiente(rs.getString(12));
        objCaracterizacion.setIdPersona(rs.getInt(13));
        objCaracterizacion.setComparteHabitacion(rs.getString(14));
        objCaracterizacion.setObservacionComparteHabitacion(rs.getString(15));
        objCaracterizacion.setAcompañante(rs.getString(16));
        objCaracterizacion.setCual(rs.getString(17));
        
        
        return objCaracterizacion;
    }

    public int getIdCaracterizacion() {
        return idCaracterizacion;
    }

    public void setIdCaracterizacion(int idCaracterizacion) {
        this.idCaracterizacion = idCaracterizacion;
    }

    public String getDeportes() {
        return deportes;
    }

    public void setDeportes(String deportes) {
        this.deportes = deportes;
    }

    public Date getFechaAsistencia() {
        return fechaAsistencia;
    }

    public void setFechaAsistencia(Date fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }

    public double getValorIngreso() {
        return valorIngreso;
    }

    public void setValorIngreso(double valorIngreso) {
        this.valorIngreso = valorIngreso;
    }

    public double getVarlorGastos() {
        return varlorGastos;
    }

    public void setVarlorGastos(double varlorGastos) {
        this.varlorGastos = varlorGastos;
    }

    public String getArmoniaFamiliar() {
        return armoniaFamiliar;
    }

    public void setArmoniaFamiliar(String armoniaFamiliar) {
        this.armoniaFamiliar = armoniaFamiliar;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdCondicionSocial() {
        return idCondicionSocial;
    }

    public void setIdCondicionSocial(int idCondicionSocial) {
        this.idCondicionSocial = idCondicionSocial;
    }

    public int getIdTipoFamiliar() {
        return idTipoFamiliar;
    }

    public void setIdTipoFamiliar(int idTipoFamiliar) {
        this.idTipoFamiliar = idTipoFamiliar;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCedulaAcudiente() {
        return cedulaAcudiente;
    }

    public void setCedulaAcudiente(String cedulaAcudiente) {
        this.cedulaAcudiente = cedulaAcudiente;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getComparteHabitacion() {
        return comparteHabitacion;
    }

    public void setComparteHabitacion(String comparteHabitacion) {
        this.comparteHabitacion = comparteHabitacion;
    }

    public String getObservacionComparteHabitacion() {
        return observacionComparteHabitacion;
    }

    public void setObservacionComparteHabitacion(String observacionComparteHabitacion) {
        this.observacionComparteHabitacion = observacionComparteHabitacion;
    }

    public String getAcompañante() {
        return acompañante;
    }

    public void setAcompañante(String acompañante) {
        this.acompañante = acompañante;
    }

    public String getCual() {
        return cual;
    }

    public void setCual(String cual) {
        this.cual = cual;
    }

  
    
      
    
        
}
