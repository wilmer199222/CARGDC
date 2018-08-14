/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.dao;

import com.caracterizacion.db.ConectarDB;
import com.caracterizacion.modelo.Caracterizacion;
import com.caracterizacion.modelo.IntegrantesFamiliar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ESTUDIANTES
 */
public class IntegrantesDaoImpl implements IDAO{
    
    ConectarDB con = new ConectarDB();
    PreparedStatement psmt = null;
    ResultSet rs = null;
    String respuesta = null;
    IntegrantesFamiliar integrantes;
    Caracterizacion caracterizacion;
    
    public IntegrantesDaoImpl() {
        con = new ConectarDB();
        con.setDriver("com.mysql.jdbc.Driver");
        con.setUrl("jdbc:mysql://localhost:3306/cargdc");
        con.setUsuario("root");
        
        con.setPassword("");
    }

    @Override
    public String insertar(Object obj) throws SQLException {
         IntegrantesFamiliar objIntegrantes = (IntegrantesFamiliar) obj;
        try {
            psmt = con.conectar().prepareStatement("INSERT INTO integrantes VALUES (null,?,?,?,?,?,?,?)");
//            psmt.setInt(1, objIntegrantes.getIdIntegrantes());
            psmt.setString(1, objIntegrantes.getNombres());
            psmt.setString(2, objIntegrantes.getApellidos()); 
            psmt.setInt(3, objIntegrantes.getEdad());
            psmt.setString(4, objIntegrantes.getParentesco());
            psmt.setString(5, objIntegrantes.getOcupacion());
            psmt.setInt(6, objIntegrantes.getIdCar()); 
            psmt.setString(7, objIntegrantes.getEscolaridad());
            psmt.setInt(8, objIntegrantes.getIdNivelFormacion()); 
            
            psmt.executeUpdate();
       
            respuesta = "El registro se realizo con exito";
            
        } catch (Exception e) {
           throw new SQLException("Error al registrar: " + e.toString());
        }finally{
            if(psmt!=null){
                psmt.close();
            }
            con.desconectar();
          }
        return respuesta;
    }


    @Override
    public String eliminar(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String modificar(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<?> listar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object buscarPorID(String id) throws SQLException {
     try {
            psmt = con.conectar().prepareStatement("SELECT * FROM gdcar_caracterizacion WHERE idCaracterizacion=?");
            psmt.setString(1, id);
            rs = psmt.executeQuery();
            
            while (rs.next()) {
                  integrantes =  integrantes.load(rs);
            }
        } catch (Exception e) {
            System.out.println("Error en la consulta"+e.toString());
        }finally{
            if(psmt!=null){
                psmt.close();
            }
            if(rs!=null){
                rs.close();
            }
            
            con.desconectar();
        }
            return integrantes;

    }

    @Override
    public int contar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existe(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<?> busquedaPorParametro(String field, Object param) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<?> existeUsuario(String usuario, String clave) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String generarCodigo() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int buscarIdAspectoDeVivienda(String idPersona)throws SQLException {
        int idCaract=0;
        try {
            psmt = con.conectar().prepareStatement("SELECT * FROM aspectosvivienda WHERE IdPersona=?");
            psmt.setString(1, idPersona);
            rs = psmt.executeQuery();
            
            while (rs.next()) {
                  caracterizacion =  Caracterizacion.load(rs);
                  
            }
            
            idCaract=caracterizacion.getIdCaracterizacion();
        } catch (Exception e) {
            System.out.println("Error en la consulta"+e.toString());
        }finally{
            if(psmt!=null){
                psmt.close();
            }
            if(rs!=null){
                rs.close();
            }
            
            con.desconectar();
        }
            return idCaract;
    }
    
}
