
package com.caracterizacion.dao;

import com.caracterizacion.db.ConectarDB;
import com.caracterizacion.modelo.Animales;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnimalesDaoImpl implements IDAO{
     ConectarDB con = new ConectarDB();
    PreparedStatement psmt = null;
    ResultSet rs = null;
    String respuesta = null;
    Animales animal;

    public AnimalesDaoImpl(){
      con = new ConectarDB();
        con.setDriver("com.mysql.jdbc.Driver");
        con.setUrl("jdbc:mysql://localhost:3306/gdccar");
        con.setUsuario("root");
        
        con.setPassword("");
        
    }
    
                    
    @Override
    public String insertar(Object obj) throws SQLException {
        Animales objAnimal =  (Animales) obj;
        try {
            psmt = con.conectar().prepareStatement("INSERT INTO animales VALUES (null,?,?)");
//            psmt.setInt(1, objAnimal.getIdAnimal());
            psmt.setString(1, objAnimal.getNombre());
            psmt.setString(2, objAnimal.getEstado());

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
            Animales objAnimal = (Animales) obj;
        try {
            psmt = con.conectar().prepareStatement("UPDATE animales SET estado=? WHERE idAnimal=?");
            psmt.setString(1, "Inactivo");
            psmt.setInt(2,(objAnimal.getIdAnimal()));
            psmt.executeUpdate();
            respuesta = "El registro se realizo con exito";
        } catch (SQLException e) {
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
    public String modificar(Object obj)throws SQLException{
        Animales objPared =(Animales) obj;
        try {
            psmt = con.conectar().prepareStatement("UPDATE animales SET nombre=? AND estado=? WHERE idAnimal=?" );
            psmt.setInt(1, objPared.getIdAnimal());
            psmt.setString(2, objPared.getNombre());
            psmt.setString(3, objPared.getEstado());
            psmt.executeUpdate();
            respuesta = "El registro se actualizo con exito";
            }catch(Exception e){
              throw new SQLException("Error al actualizar:"+e.toString());
            }finally{
                if(psmt!=null){
                psmt.close();
            }
                con.desconectar();
            
            }
            return respuesta;
        
                
           
        
    }

    @Override
    public List<Animales> listar() throws SQLException {
    List<Animales> listaAnimal = new ArrayList<>();
        try {
            psmt = con.conectar().prepareStatement("SELECT * FROM animales");
            rs = psmt.executeQuery();
            while (rs.next()) {                
                listaAnimal.add(Animales.load(rs));
            }
        } catch (Exception e) {
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
         return listaAnimal;
    }

    @Override
    public Object buscarPorID(String id) throws SQLException {
        
        try {
            psmt = con.conectar().prepareStatement("SELECT * FROM animales WHERE idAnimal=?");
            psmt.setString(1, id);
            rs = psmt.executeQuery();
            
            while (rs.next()) {
                  animal =  Animales.load(rs);
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
            return animal;
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
            psmt=con.conectar().prepareStatement("SELECT COUNT(idAnimal) FROM animales");
            rs=psmt.executeQuery();
            while(rs.next()){
                //codigo = "P000" + rs.getString(1).length();
//                codigo = "P000" + rs.getString(1);
                switch(rs.getString(1).length()){
                    case 1:
                        codigo = "P00" + rs.getString(1);
                        break;
                    case 2:
                        codigo = "P0" + rs.getString(1);
                        break;
                    case 3:
                        codigo = "P0" + rs.getString(1);
                        break;
                   default: break;
                     
                    
                }
         }
            
            
        } catch (Exception e) {
            throw new SQLException("Error al generar código: "+e.toString());

        }
         return codigo;
        
    }
    
}
