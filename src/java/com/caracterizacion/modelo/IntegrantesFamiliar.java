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
public class IntegrantesFamiliar {
    private int idIntegrantes;
    private String nombres;
    private String apellidos;
    private int edad;
    private String parentesco;
    private String Ocupacion;
    private int idCar;
    private String escolaridad;
    private int idNivelFormacion;

    public IntegrantesFamiliar() {
    }

    public IntegrantesFamiliar(int idIntegrantes, String nombres, String apellidos, int edad, String parentesco, String Ocupacion, int idCar, String escolaridad, int idNivelFormacion) {
        this.idIntegrantes = idIntegrantes;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.parentesco = parentesco;
        this.Ocupacion = Ocupacion;
        this.idCar = idCar;
        this.escolaridad = escolaridad;
        this.idNivelFormacion = idNivelFormacion;
    }

    
    
    public IntegrantesFamiliar load(ResultSet rs) throws SQLException{
        IntegrantesFamiliar objIntegrantesFamiliar = new IntegrantesFamiliar();
        objIntegrantesFamiliar.setIdIntegrantes(rs.getInt(1));
        objIntegrantesFamiliar.setNombres(rs.getString(2));
        objIntegrantesFamiliar.setApellidos(rs.getString(3));
        objIntegrantesFamiliar.setEdad(rs.getInt(4));
        objIntegrantesFamiliar.setParentesco(rs.getString(5));
        objIntegrantesFamiliar.setOcupacion(rs.getString(6));
        objIntegrantesFamiliar.setIdCar(rs.getInt(7));
        objIntegrantesFamiliar.setEscolaridad(rs.getString(8));
        objIntegrantesFamiliar.setIdNivelFormacion(rs.getInt(9));
        
        return objIntegrantesFamiliar;
    }

    public int getIdIntegrantes() {
        return idIntegrantes;
    }

    public void setIdIntegrantes(int idIntegrantes) {
        this.idIntegrantes = idIntegrantes;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public int getIdNivelFormacion() {
        return idNivelFormacion;
    }

    public void setIdNivelFormacion(int idNivelFormacion) {
        this.idNivelFormacion = idNivelFormacion;
    }

    @Override
    public String toString() {
        return "IntegrantesFamiliar{" + "idIntegrantes=" + idIntegrantes + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", parentesco=" + parentesco + ", Ocupacion=" + Ocupacion + ", idCar=" + idCar + ", escolaridad=" + escolaridad + ", idNivelFormacion=" + idNivelFormacion + '}';
    }
    

    
    
    
    
}
