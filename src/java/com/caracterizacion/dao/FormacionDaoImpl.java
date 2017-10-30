/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.dao;

import com.caracterizacion.db.ConectarDB;
import com.caracterizacion.modelo.NivelFormacion;
import com.caracterizacion.modelo.Pisos;
import com.caracterizacion.modelo.TipoTransporte;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhon
 */
public class FormacionDaoImpl implements IDAO {
    ConectarDB con = new ConectarDB();
    PreparedStatement psmt = null;
    ResultSet rs = null;
    String respuesta = null;
    NivelFormacion formacion;
    
    public FormacionDaoImpl() {
        con = new ConectarDB();
        con.setDriver("com.mysql.jdbc.Driver");
        con.setUrl("jdbc:mysql://localhost:3306/gdccar");
        con.setUsuario("root");
        
        con.setPassword("");
    }

    @Override
    public String insertar(Object obj) throws SQLException {
     NivelFormacion objFormacion = (NivelFormacion) obj;
        try {
            psmt = con.conectar().prepareStatement("INSERT INTO nivelformacion VALUES (?,?,?)");
            psmt.setInt(1, objFormacion.getIdNivelFormacion());
            psmt.setString(2, objFormacion.getNombre());
            psmt.setString(3, objFormacion.getEstado()); 
            
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
    public List<NivelFormacion> listar() throws SQLException {
         List<NivelFormacion> listaFormacion = new ArrayList<>();
          try {
            psmt = con.conectar().prepareStatement("SELECT * FROM nivelformacion");
            rs = psmt.executeQuery();
            while (rs.next()) {                
                listaFormacion.add(NivelFormacion.load(rs));
            }
            
        } catch (Exception e){
            System.out.println("Error en la consulta: " + e);
        }finally {
            if(psmt!=null){
                psmt.close();
            }
            if(rs!=null){
                rs.close();
            }
            
            con.desconectar();
        }
       return listaFormacion;
    }
    @Override
    public Object buscarPorID(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
