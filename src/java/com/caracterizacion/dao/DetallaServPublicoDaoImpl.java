/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.dao;

import com.caracterizacion.db.ConectarDB;
import com.caracterizacion.modelo.DetallaServPublico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTES
 */
public class DetallaServPublicoDaoImpl implements IDAO{
    
    ConectarDB con = new ConectarDB();
    PreparedStatement psmt = null;
    ResultSet rs = null;
    String respuesta = null;
    DetallaServPublico DetallaServPublico;
    
    public DetallaServPublicoDaoImpl() {
        con = new ConectarDB();
        con.setDriver("com.mysql.jdbc.Driver");
        con.setUrl("jdbc:mysql://localhost:3306/cargdc");
        con.setUsuario("root");
        
        con.setPassword("");
    }
    

    @Override
    public String insertar(Object obj) throws SQLException {
    DetallaServPublico objDeta = (DetallaServPublico) obj;
         try {
            psmt = con.conectar().prepareStatement("INSERT INTO detalla_servpublic VALUES (?,?,?)");
            psmt.setInt(1, objDeta.getIddetallaServPublic());
            psmt.setInt(2, objDeta.getIdCaracterizacion());
            psmt.setInt(3, objDeta.getIdServiciosPublicos()); 
            
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
    public List<DetallaServPublico> listar() throws SQLException {
         List<DetallaServPublico> listaDetallaServPublicos = new ArrayList<>();
          try {
            psmt = con.conectar().prepareStatement("SELECT * FROM tipodocumento");
            rs = psmt.executeQuery();
            while (rs.next()) {                
                listaDetallaServPublicos.add(DetallaServPublico.load(rs));
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
       return listaDetallaServPublicos; 
        
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
    
    
    public static void main(String[] args) throws SQLException {
       DetallaServPublico objDeta = new DetallaServPublico(1,1,1);
       DetallaServPublicoDaoImpl dao = new DetallaServPublicoDaoImpl();
        System.out.println("resultado: "+dao.insertar(objDeta));
        
        
    }
    
}
