
package com.caracterizacion.dao;

import com.caracterizacion.db.ConectarDB;
import com.caracterizacion.modelo.Acompañante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class AcompañanteDaoImpl implements IDAO {

    ConectarDB con = new ConectarDB();
    PreparedStatement psmt = null;
    ResultSet rs = null;
    String respuesta = null;
    Acompañante acompañante;
    
    public AcompañanteDaoImpl() {
        con = new ConectarDB();
        con.setDriver("com.mysql.jdbc.Driver");
        con.setUrl("jdbc:mysql://localhost:3306/cargdc");
        con.setUsuario("root");
        
        con.setPassword("");
    }
    
    @Override
    public String insertar(Object obj) throws SQLException {
       Acompañante objAcompañante = (Acompañante) obj;
        try {
            psmt = con.conectar().prepareStatement("INSERT INTO acompañante VALUES (null,?,?)");
//            psmt.setInt(1, objAcompañante.getIdAcompañante());
            psmt.setString(1, objAcompañante.getNombre());
            psmt.setString(2, objAcompañante.getEstado()); 
            
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
         Acompañante objAcompañante = (Acompañante) obj;
         
         try {
            psmt = con.conectar().prepareStatement("UPDATE acompañante SET estado=? WHERE idAcompañante=?");
            psmt.setString(1, "Inactivo");
            psmt.setInt(2, (objAcompañante.getIdAcompañante()));
            
            psmt.executeUpdate();
            respuesta = "La eliminacion se realizo con exito";
        } catch (Exception e) {
            throw new SQLException("Error al eliminar: " + e.toString()); 
        }finally{
            if(psmt!=null){
                psmt.close();
            }
            con.desconectar();
          }
        return respuesta;
    }

    @Override
    public String modificar(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Acompañante> listar() throws SQLException {
     List<Acompañante> listAcompañante = new ArrayList<>();
          try {
            psmt = con.conectar().prepareStatement("SELECT * FROM acompañante");
            rs = psmt.executeQuery();
            while (rs.next()) {                
                listAcompañante.add(Acompañante.load(rs));
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
       return listAcompañante;
    }
    @Override
    public Object buscarPorID(String id) throws SQLException {
            try {
            psmt = con.conectar().prepareStatement("SELECT * FROM acompañante WHERE idAcompañante=?");
            psmt.setString(1,id);
            rs = psmt.executeQuery();
            while (rs.next()) {                
                
                acompañante =  Acompañante.load(rs);
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e);
        }finally{
            if(psmt!=null){
                psmt.close();
            }
            if(rs!=null){
                rs.close();
            }
            
            con.desconectar();
        }
        
           return acompañante;
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
