/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.dao;

import com.caracterizacion.db.ConectarDB;
import com.caracterizacion.modelo.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.sql.Date;

/**
 *
 * @author ESTUDIANTES
 */
public class PersonaDaoImpl implements IDAO{
    ConectarDB con = new ConectarDB();
    PreparedStatement psmt = null;
    ResultSet rs = null;
    String respuesta = null;
    Persona persona;
    
    public PersonaDaoImpl() {
        con = new ConectarDB();
        con.setDriver("com.mysql.jdbc.Driver");
        con.setUrl("jdbc:mysql://localhost:3306/cargdc");
        con.setUsuario("root");
        
        con.setPassword("");
    }

    @Override
    public String insertar(Object obj) throws SQLException {
        Persona objPer = (Persona) obj;
        try {
            psmt = con.conectar().prepareStatement("INSERT INTO persona VALUES (null,?,?,?,?,?,?)");
//            psmt.setInt(1, objPer.getIdPersona());
            psmt.setString(1, objPer.getDocIdentidad());
            psmt.setString(2, objPer.getNombre());
            psmt.setString(3, objPer.getSexo());
            psmt.setInt(4, objPer.getEdad());
            psmt.setDate(5, objPer.getFechaNacimiento());
            psmt.setInt(6, objPer.getIdTipoDocumento());
            
            
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
            psmt = con.conectar().prepareStatement("SELECT * FROM persona WHERE id=?");
            psmt.setString(1, id);
            rs = psmt.executeQuery();
            
            while (rs.next()) {
                  persona =  Persona.load(rs);
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
            return persona;
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
    
      public int buscarIdPersona(String docIdentidad)throws SQLException {
       int idPerson = 0;
        try {
            psmt = con.conectar().prepareStatement("SELECT * FROM persona WHERE DocIdentidad=?");
            psmt.setString(1, docIdentidad);
            rs = psmt.executeQuery();
            
            while (rs.next()) {
                  persona =  Persona.load(rs);
                  
            }
            
            idPerson=persona.getIdPersona();
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
            return idPerson;
    }
    
//    public static void main(String[] args) throws SQLException {
////       Persona objPer = new Persona(0,"1143362588","wilmer", "guerrero", "masculino", 25,Date.valueOf("1992-11-22"), "cartagena", "bolivar", "olaya", "300000000",1);
//       PersonaDaoImpl dao = new PersonaDaoImpl();
////        System.out.println("resultado: "+dao.insertar(objPer));
//System.out.println("Resp: " + dao.buscarIdPersona("1441485"));
//        
//        
//    }
    
}
