 package com.caracterizacion.dao;

import com.caracterizacion.db.ConectarDB;
import com.caracterizacion.modelo.TipoViv;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TipoVivDaoImpl implements IDAO{
    ConectarDB con = new ConectarDB();
    PreparedStatement psmt = null;
    ResultSet rs = null;
    String respuesta = null;
    TipoViv tipoViv;

    public TipoVivDaoImpl() {
      con = new ConectarDB();
        con.setDriver("com.mysql.jdbc.Driver");
        con.setUrl("jdbc:mysql://localhost:3306/cargdc");
        con.setUsuario("root");
        
        con.setPassword("");
        
    }
    
                    
    @Override
    public String insertar(Object obj) throws SQLException {
        TipoViv objTipoViv =  (TipoViv) obj;
        try {
            psmt = con.conectar().prepareStatement("INSERT INTO tipovivienda VALUES (?,?,?)");
//            psmt.setInt(1,   objTipoViv.getIdTipo());
            psmt.setString(1, objTipoViv.getNombre());
            psmt.setString(2, objTipoViv.getEstado());

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
            TipoViv objTipoViv =  (TipoViv) obj;
        try {
            psmt = con.conectar().prepareStatement("UPDATE tipovivienda SET estado=? WHERE idTipo=?");
            psmt.setString(1, "Inactivo");
            psmt.setInt(2,(objTipoViv.getIdTipo()));
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
        TipoViv objTipoViv =  (TipoViv) obj;
        try {
            psmt = con.conectar().prepareStatement("UPDATE tipovivienda SET nombre=? AND estado=? WHERE idTipo=?" );
            psmt.setInt(1, objTipoViv.getIdTipo());
            psmt.setString(2, objTipoViv.getNombre());
            
            psmt.setString(3, objTipoViv.getEstado());
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
    public List<TipoViv> listar() throws SQLException {
    List<TipoViv> listaTipoViv = new ArrayList<>();
        try {
            psmt = con.conectar().prepareStatement("SELECT * FROM tipovivienda");
            rs = psmt.executeQuery();
            while (rs.next()) {                
                listaTipoViv.add(tipoViv.load(rs));
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
         return listaTipoViv;
    }

    @Override
    public Object buscarPorID(String id) throws SQLException {
        
        try {
            psmt = con.conectar().prepareStatement("SELECT * FROM paredes WHERE idTipo=?");
            psmt.setString(1, id);
            rs = psmt.executeQuery();
            
            while (rs.next()) {
                  tipoViv =  TipoViv.load(rs);
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
            return tipoViv;
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
            psmt=con.conectar().prepareStatement("SELECT COUNT(idtipo) FROM tipovivienda");
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



