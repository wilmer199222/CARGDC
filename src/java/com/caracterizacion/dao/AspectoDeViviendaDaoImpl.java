/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.dao;

import com.caracterizacion.db.ConectarDB;
import com.caracterizacion.modelo.AspectoDeVivienda;
import com.caracterizacion.modelo.Caracterizacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ESTUDIANTES
 */
public class AspectoDeViviendaDaoImpl implements IDAO{
    ConectarDB con = new ConectarDB();
    PreparedStatement psmt = null;
    ResultSet rs = null;
    String respuesta = null;
    Caracterizacion caracterizacion;
    
    
    
    public AspectoDeViviendaDaoImpl() {
        con = new ConectarDB();
        con.setDriver("com.mysql.jdbc.Driver");
        con.setUrl("jdbc:mysql://localhost:3306/cargdc");
        con.setUsuario("root");
        
        con.setPassword("");
    }

    @Override
    public String insertar(Object obj) throws SQLException {
       AspectoDeVivienda objAspectoDeVivienda = (AspectoDeVivienda) obj;
        try {
            psmt = con.conectar().prepareStatement("INSERT INTO aspectosvivienda VALUES (null,?,?,?,?,?,?,?,?,?,?)");
//            psmt.setInt(1, objAspectoDeVivienda.getIdAspectoVivienda());
            psmt.setInt(1, objAspectoDeVivienda.getNumeroDormitorios());
            psmt.setInt(2, objAspectoDeVivienda.getNumeroBaños());
            psmt.setInt(3, objAspectoDeVivienda.getCocina()); 
            psmt.setInt(4, objAspectoDeVivienda.getSala()); 
            psmt.setInt(5, objAspectoDeVivienda.getComedor()); 
            psmt.setInt(6, objAspectoDeVivienda.getIdCaracterizacion()); 
            psmt.setInt(7, objAspectoDeVivienda.getIdTecho()); 
            psmt.setInt(8, objAspectoDeVivienda.getIdServiciosSanitario()); 
            psmt.setInt(9, objAspectoDeVivienda.getIdTenencia());
            psmt.setInt(10,objAspectoDeVivienda.getIdTipoVivienda());

            
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
    
//      public static void main(String[] args) throws SQLException {
//       AspectoDeVivienda objAspectoDeVivienda;
//        objAspectoDeVivienda = new AspectoDeVivienda(0,1,1,1,1,1,1,1,1,1,1);
//       AspectoDeViviendaDaoImpl dao = new AspectoDeViviendaDaoImpl();
//        System.out.println("resultado: "+dao.insertar(objAspectoDeVivienda));
//  
//        
//    }
    
}
