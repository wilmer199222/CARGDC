
package com.caracterizacion.dao;

import com.caracterizacion.db.ConectarDB;
import com.caracterizacion.modelo.DetallaRelacAfectivas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTES
 */
public class DetallaRelacAfectivasDaoImpl implements IDAO{
    ConectarDB con = new ConectarDB();
    PreparedStatement psmt = null;
    ResultSet rs = null;
    String respuesta = null;
    DetallaRelacAfectivas DetallaRelacAfectivas;
    
    public DetallaRelacAfectivasDaoImpl() {
        con = new ConectarDB();
        con.setDriver("com.mysql.jdbc.Driver");
        con.setUrl("jdbc:mysql://localhost:3306/cargdc");
        con.setUsuario("root");
        
        con.setPassword("");
    }
    

    @Override
    public String insertar(Object obj) throws SQLException {
        DetallaRelacAfectivas objDeta = (DetallaRelacAfectivas) obj;
         try {
            psmt = con.conectar().prepareStatement("INSERT INTO detalla_relacafectivas VALUES (?,?,?)");
            psmt.setInt(1, objDeta.getIdDetallaRelacAfectivas());
            psmt.setInt(2, objDeta.getIdRelacionesAfectivas());
            psmt.setInt(3, objDeta.getIdCar()); 
            
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
    public List<DetallaRelacAfectivas> listar() throws SQLException {
        List<DetallaRelacAfectivas> listaDetallaRelacAfectivas = new ArrayList<>();
          try {
            psmt = con.conectar().prepareStatement("SELECT * FROM tipodocumento");
            rs = psmt.executeQuery();
            while (rs.next()) {                
                listaDetallaRelacAfectivas.add(DetallaRelacAfectivas.load(rs));
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
       return listaDetallaRelacAfectivas;
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
//       DetallaRelacAfectivas objDeta = new DetallaRelacAfectivas(1,1,1);
//       DetallaRelacAfectivasDaoImpl dao = new DetallaRelacAfectivasDaoImpl();
//        System.out.println("resultado: "+dao.insertar(objDeta));
//        
//        
//    }
    
}
