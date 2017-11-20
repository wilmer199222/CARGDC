
package com.caracterizacion.dao;

import com.caracterizacion.db.ConectarDB;
import com.caracterizacion.modelo.Pisos;
import com.caracterizacion.modelo.Techo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class TechoDaoImpl implements IDAO {
    
    ConectarDB con = new ConectarDB();
    PreparedStatement psmt = null;
    ResultSet rs = null;
    String respuesta = null;
    Techo techo;
    
    public TechoDaoImpl() {
        con = new ConectarDB();
        con.setDriver("com.mysql.jdbc.Driver");
        con.setUrl("jdbc:mysql://localhost:3306/cargdc");
        con.setUsuario("root");
        
        con.setPassword("");
    }

    @Override
    public String insertar(Object obj) throws SQLException {
         Techo objTecho = (Techo) obj;
        try {
            psmt = con.conectar().prepareStatement("INSERT INTO techo VALUES (?,?,?)");
            psmt.setInt(1, objTecho.getIdTecho());
            psmt.setString(2, objTecho.getNombre());
            psmt.setString(3, objTecho.getEstado()); 
            
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
          Techo objTecho = (Techo) obj;
         try {
            psmt = con.conectar().prepareStatement("UPDATE techo SET estado=? WHERE idTecho=?");
            psmt.setString(1, "Inactivo");
            psmt.setInt(2, (objTecho.getIdTecho()));
            
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
         Techo objTecho = (Techo) obj;
        try {
            psmt = con.conectar().prepareStatement("UPDATE techo SET nombre=? AND estado=? WHERE idTecho=?");
            
            psmt.setInt(1, objTecho.getIdTecho());
            psmt.setString(2, objTecho.getNombre());            
            psmt.setString(3, objTecho.getEstado());
          
            psmt.executeUpdate();
            respuesta = "El registro se Actualizo con exito";
            
        } catch (Exception e) {
              throw new SQLException("Error al modificar: " + e.toString()); 
        }finally{
            if(psmt!=null){
                psmt.close();
            }
            con.desconectar();
          }
        
        return respuesta;
    }

    @Override
    public List<Techo> listar() throws SQLException {
          List<Techo> listaTecho = new ArrayList<>();
          try {
            psmt = con.conectar().prepareStatement("SELECT * FROM techo");
            rs = psmt.executeQuery();
            while (rs.next()) {                
                listaTecho.add(Techo.load(rs));
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
       return listaTecho;
    }

    @Override
    public Object buscarPorID(String id) throws SQLException {
        
          try {
            psmt = con.conectar().prepareStatement("SELECT * FROM techo WHERE idtecho=?");
            psmt.setString(1,id);
            rs = psmt.executeQuery();
            while (rs.next()) {                
                
                techo =  Techo.load(rs);
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
        
       return techo;
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
        String codigo = null;
        try {
            psmt=con.conectar().prepareStatement("SELECT COUNT(idTecho) FROM techo");
            rs=psmt.executeQuery();
            while(rs.next()){
                
                switch(rs.getString(1).length()){
                    case 1:
                        codigo = "P000" + rs.getString(1);
                        break;
                    case 2:
                        codigo = "P00" + rs.getString(1);
                        break;
                    case 3:
                        codigo = "P0" + rs.getString(1);
                        break;
                    case 4:
                        codigo = "P" + rs.getString(1);
                        break;
                   default: break;
                     
                    
                }
         }
            
            
        } catch (Exception e) {
            throw new SQLException("Erro al generar código: "+e.toString());

        }
         return codigo;

    }
    
}
