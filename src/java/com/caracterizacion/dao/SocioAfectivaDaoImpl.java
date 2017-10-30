/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.dao;

import com.caracterizacion.db.ConectarDB;
import com.caracterizacion.modelo.SocioAfectiva;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTES
 */
public class SocioAfectivaDaoImpl implements IDAO {
    ConectarDB con = new ConectarDB();
    PreparedStatement psmt = null;
    ResultSet rs = null;
    String respuesta = null;
    SocioAfectiva socioafectiva;

    public SocioAfectivaDaoImpl(){
      con = new ConectarDB();
        con.setDriver("com.mysql.jdbc.Driver");
        con.setUrl("jdbc:mysql://localhost:3306/gdccar");
        con.setUsuario("root");
        
        con.setPassword("");
        
    }

    @Override
    public String insertar(Object obj) throws SQLException {
         SocioAfectiva objSocioAfectiva =  (SocioAfectiva) obj;
        try {
            psmt = con.conectar().prepareStatement("INSERT INTO SocioAfectiva VALUES (?,?,?)");
            psmt.setInt(1, objSocioAfectiva.getIdSocioAfectiva());
            psmt.setString(2, objSocioAfectiva.getNombre());
            psmt.setString(3, objSocioAfectiva.getEstado());

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
         SocioAfectiva objSocioAfectiva = (SocioAfectiva) obj;
        try {
            psmt = con.conectar().prepareStatement("UPDATE SocioAfectiva SET estado=? WHERE idSocioAfectiva=?");
            psmt.setString(1, "Inactivo");
            psmt.setInt(2,(objSocioAfectiva.getIdSocioAfectiva()));
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
        SocioAfectiva objSocioAfectiva =(SocioAfectiva) obj;
        try {
            psmt = con.conectar().prepareStatement("UPDATE SocioAfectiva SET nombre=? AND estado=? WHERE idSocioAfectiva=?" );
            psmt.setInt(1, objSocioAfectiva.getIdSocioAfectiva());
            psmt.setString(2, objSocioAfectiva.getNombre());
            psmt.setString(3, objSocioAfectiva.getEstado());
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
    public List<SocioAfectiva> listar() throws SQLException {
        List<SocioAfectiva> listaSocioAfectiva = new ArrayList<>();
        try {
            psmt = con.conectar().prepareStatement("SELECT * FROM SocioAfectiva");
            rs = psmt.executeQuery();
            while (rs.next()) {                
                listaSocioAfectiva.add(SocioAfectiva.load(rs));
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
         return listaSocioAfectiva;
    }

    @Override
    public Object buscarPorID(String id) throws SQLException {
         try {
            psmt = con.conectar().prepareStatement("SELECT * FROM SocioAfectiva WHERE idSocioAfectiva=?");
            psmt.setString(1, id);
            rs = psmt.executeQuery();
            
            while (rs.next()) {
                  socioafectiva =  SocioAfectiva.load(rs);
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
            return socioafectiva;
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
            psmt=con.conectar().prepareStatement("SELECT COUNT(idSocioAfectiva) FROM SocioAfectiva");
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

   
