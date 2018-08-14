/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.dao;

import com.caracterizacion.db.ConectarDB;
import com.caracterizacion.modelo.DetallaAnimales;
import com.caracterizacion.modelo.DetallaPisos;
import com.caracterizacion.modelo.DetallaSocAfectiva;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ESTUDIANTES
 */
public class DetallaAnimalesDaoImpl implements IDAO{
   
  ConectarDB con = new ConectarDB();
    PreparedStatement psmt = null;
    ResultSet rs = null;
    String respuesta = null;
    DetallaSocAfectiva detallaSocAfectiva;
    
    public DetallaAnimalesDaoImpl() {
        con = new ConectarDB();
        con.setDriver("com.mysql.jdbc.Driver");
        con.setUrl("jdbc:mysql://localhost:3306/cargdc");
        con.setUsuario("root");
        
        con.setPassword("");
    }
    


    @Override
    public String insertar(Object obj) throws SQLException {
DetallaAnimales objDeta = (DetallaAnimales) obj;
         try {
            psmt = con.conectar().prepareStatement("INSERT INTO detalla_animales VALUES (null,?,?,?)");
//            psmt.setInt(1, objDeta.getIdDetallaPisos());
            psmt.setInt(1, objDeta.getIdCar());
            psmt.setInt(2, objDeta.getIdAnimal()); 
            psmt.setString(3, objDeta.getObservacion()); 
            
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
    
//    public static void main(String[] args) throws SQLException {
//       DetallaAnimales objDeta = new DetallaAnimales(0,1,1,"Conejo");
//       DetallaAnimalesDaoImpl dao = new DetallaAnimalesDaoImpl();
//        System.out.println("resultado: "+dao.insertar(objDeta));
//        
//        
//    }
//    
}
