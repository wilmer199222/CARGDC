/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.dao;

import com.caracterizacion.db.ConectarDB;
import com.caracterizacion.modelo.Tipofamiliar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTES
 */
public class TipofamiliarDaoImpl implements IDAO {
    ConectarDB con = new ConectarDB();
    PreparedStatement psmt = null;
    ResultSet rs = null;
    String respuesta = null;
    Tipofamiliar tipofamiliar;
    
     public TipofamiliarDaoImpl(){
      con = new ConectarDB();
        con.setDriver("com.mysql.jdbc.Driver");
        con.setUrl("jdbc:mysql://localhost:3306/gdccar");
        con.setUsuario("root");
        
        con.setPassword("");
        
    }

    @Override
    public String insertar(Object obj) throws SQLException {
          Tipofamiliar objtipofamiliar =  (Tipofamiliar) obj;
        try {
            psmt = con.conectar().prepareStatement("INSERT INTO TipoFamiliar VALUES (?,?,?)");
            psmt.setInt(1, objtipofamiliar.getIdTipoFamiliar());
            psmt.setString(2, objtipofamiliar.getNombre());
            psmt.setString(3, objtipofamiliar.getEstado());

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
         Tipofamiliar objTipofamiliar = (Tipofamiliar) obj;
        try {
            psmt = con.conectar().prepareStatement("UPDATE TipoFamiliar  SET estado=? WHERE idTipoFamiliar=?");
            psmt.setString(1, "Inactivo");
            psmt.setInt(2,(objTipofamiliar.getIdTipoFamiliar()));
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
    public String modificar(Object obj) throws SQLException {
         Tipofamiliar objTipofamiliar = (Tipofamiliar) obj;
        try {
            psmt = con.conectar().prepareStatement("UPDATE TipoFamiliar SET nombre=? AND estado=? WHERE idTipoFamiliar=?" );
            psmt.setInt(1, objTipofamiliar.getIdTipoFamiliar());
            psmt.setString(2, objTipofamiliar.getNombre());
            psmt.setString(3, objTipofamiliar.getEstado());
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
    public List<Tipofamiliar> listar() throws SQLException {
        List<Tipofamiliar> listaTipofamiliar = new ArrayList<>();
        try {
            psmt = con.conectar().prepareStatement("SELECT * FROM TipoFamiliar");
            rs = psmt.executeQuery();
            while (rs.next()) {                
                listaTipofamiliar.add(tipofamiliar.load(rs));
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
         return listaTipofamiliar;
    }

    @Override
    public Object buscarPorID(String id) throws SQLException {
         try {
            psmt = con.conectar().prepareStatement("SELECT * FROM TipoFamiliar WHERE idTipoFamiliar=?");
            psmt.setString(1, id);
            rs = psmt.executeQuery();
            
            while (rs.next()) {
                  tipofamiliar =  Tipofamiliar.load(rs);
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
            return tipofamiliar;
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
            psmt=con.conectar().prepareStatement("SELECT COUNT(idTipoFamiliar) FROM TipoFamiliar");
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
