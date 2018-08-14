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
public class Acudiente {
     private int idAcudiente;
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private String tipoIdentidad;
    private String cedulaAcudiente;
    private String ciudad;
    private String municipio;
    private String direccion;
    private String telefono;

    public Acudiente(int idAcudiente, String nombre, String apellido, String sexo, int edad, String tipoIdentidad, String cedulaAcudiente, String ciudad, String municipio, String direccion, String telefono) {
        this.idAcudiente = idAcudiente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.tipoIdentidad = tipoIdentidad;
        this.cedulaAcudiente = cedulaAcudiente;
        this.ciudad = ciudad;
        this.municipio = municipio;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Acudiente() {
    }
    
    public static Acudiente load(ResultSet rs)throws SQLException{
        Acudiente objAcud = new Acudiente();
        objAcud.setIdAcudiente(rs.getInt(1));
        objAcud.setNombre(rs.getString(2));
        objAcud.setApellido(rs.getString(3));
        objAcud.setSexo(rs.getString(4));
        objAcud.setEdad(rs.getInt(5));
        objAcud.setTipoIdentidad(rs.getString(6));
        objAcud.setCedulaAcudiente(rs.getString(7));
        objAcud.setCiudad(rs.getString(8));
        objAcud.setMunicipio(rs.getString(9));
        objAcud.setDireccion(rs.getString(10));
        objAcud.setTelefono(rs.getString(11));
        
        
        return objAcud;
        
    }

    public int getIdAcudiente() {
        return idAcudiente;
    }

    public void setIdAcudiente(int idAcudiente) {
        this.idAcudiente = idAcudiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getTipoIdentidad() {
        return tipoIdentidad;
    }

    public void setTipoIdentidad(String tipoIdentidad) {
        this.tipoIdentidad = tipoIdentidad;
    }

    public String getCedulaAcudiente() {
        return cedulaAcudiente;
    }

    public void setCedulaAcudiente(String cedulaAcudiente) {
        this.cedulaAcudiente = cedulaAcudiente;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Acudiente{" + "idAcudiente=" + idAcudiente + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad=" + edad + ", tipoIdentidad=" + tipoIdentidad + ", cedulaAcudiente=" + cedulaAcudiente + ", ciudad=" + ciudad + ", municipio=" + municipio + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
}
