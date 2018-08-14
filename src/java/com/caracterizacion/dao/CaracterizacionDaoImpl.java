/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.dao;

import com.caracterizacion.db.ConectarDB;
import com.caracterizacion.modelo.Caracterizacion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author FINJE
 */
public class CaracterizacionDaoImpl implements IDAO{
    ConectarDB con = new ConectarDB();
    PreparedStatement psmt = null;
    ResultSet rs = null;
    String respuesta = null;
    Caracterizacion caracterizacion;
    
    public CaracterizacionDaoImpl() {
        con = new ConectarDB();
        con.setDriver("com.mysql.jdbc.Driver");
        con.setUrl("jdbc:mysql://localhost:3306/cargdc");
        con.setUsuario("root");
        
        con.setPassword("");
    }

    @Override
    public String insertar(Object obj) throws SQLException {
        Caracterizacion objCaracterizacion = (Caracterizacion) obj;
        try {
            psmt = con.conectar().prepareStatement("INSERT INTO gdcar_caracterizacion VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
//            psmt.setInt(1, objCaracterizacion.getIdCaracterizacion());
            psmt.setString(1, objCaracterizacion.getDeportes());
            psmt.setDate(2, objCaracterizacion.getFechaAsistencia());
            psmt.setDouble(3, objCaracterizacion.getValorIngreso()); 
            psmt.setDouble(4, objCaracterizacion.getVarlorGastos()); 
            psmt.setString(5, objCaracterizacion.getArmoniaFamiliar()); 
            psmt.setString(6, objCaracterizacion.getObservacion()); 
            psmt.setInt(7, objCaracterizacion.getEstado()); 
            psmt.setInt(8, objCaracterizacion.getIdCondicionSocial()); 
            psmt.setInt(9, objCaracterizacion.getIdTipoFamiliar());
            psmt.setInt(10, objCaracterizacion.getIdEmpleado());
            psmt.setInt(11, objCaracterizacion.getIdPersona());
            psmt.setString(12, objCaracterizacion.getCedulaAcudiente());
            psmt.setString(13, objCaracterizacion.getComparteHabitacion());
            psmt.setString(14, objCaracterizacion.getObservacionComparteHabitacion());
            psmt.setString(15, objCaracterizacion.getAcompañante());
            psmt.setString(16, objCaracterizacion.getCual());

            
            
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
                  caracterizacion =  Caracterizacion.load(rs);
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
            return caracterizacion;
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
    
    public int buscarIdCaracterizacion(String idPersona)throws SQLException {
        int idCaract=0;
        try {
            psmt = con.conectar().prepareStatement("SELECT * FROM gdcar_caracterizacion WHERE IdPersona=?");
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
    
    
//          public static void main(String[] args) throws SQLException {
////       Caracterizacion objCar;
////        objCar = new Caracterizacion(1,"Futbol",Date.valueOf("2017-12-11"),12000.00,55000.00,"armonia","Estamos probando",1,1,1,1,"1441485",145411);
//       CaracterizacionDaoImpl dao = new CaracterizacionDaoImpl();
////        System.out.println("resultado: "+dao.insertar(objCar));
//
//
//        
//        
//    }
}
