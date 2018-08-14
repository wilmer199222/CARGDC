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
public class Persona {
    private int idPersona;
    private String docIdentidad;
    private String nombre;
    private String sexo;
    private int edad;
    private Date fechaNacimiento;
    private int idTipoDocumento;

    public Persona() {
    }
    
    
    public static Persona load(ResultSet rs)throws SQLException{
        Persona objPersona = new Persona();
        objPersona.setIdPersona(rs.getInt(1));
        objPersona.setDocIdentidad(rs.getString(2));
        objPersona.setNombre(rs.getString(3));
        objPersona.setSexo(rs.getString(4));
        objPersona.setEdad(rs.getInt(5));
        objPersona.setFechaNacimiento(rs.getDate(6));
        objPersona.setIdTipoDocumento(rs.getInt(7));
        
        
        return objPersona;
    }
    

    public Persona(int idPersona, String docIdentidad, String nombre, String sexo, int edad, Date fechaNacimiento, int idTipoDocumento) {
        this.idPersona = idPersona;
        this.docIdentidad = docIdentidad;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.idTipoDocumento = idTipoDocumento;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getDocIdentidad() {
        return docIdentidad;
    }

    public void setDocIdentidad(String docIdentidad) {
        this.docIdentidad = docIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", docIdentidad=" + docIdentidad + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", idTipoDocumento=" + idTipoDocumento + '}';
    }

    
}
