 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;

import com.caracterizacion.dao.ParedesDaoImpl;
import com.caracterizacion.dao.TipoVivDaoImpl;
import com.caracterizacion.modelo.TipoViv;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Estudiante
 */
@WebServlet(name = "TipoVivSvl", urlPatterns = {"/tipovivsv"})
public class TipoVivSvl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            TipoVivDaoImpl tipoVivDao =  new TipoVivDaoImpl();
            TipoViv tipoViv = new TipoViv();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar")!=null){
                    tipoViv.setIdTipo(Integer.parseInt(request.getParameter("idTipo")));
                    tipoViv.setNombre(request.getParameter("nombre"));
                    tipoViv.setEstado(request.getParameter("estado"));
                    //tipoViv.setEstado("Activo");
                    respuesta =  tipoVivDao.insertar(tipoViv);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarTipoViv.jsp");
                 }else if(request.getParameter("btnEliminar")!=null){
                    tipoViv.setIdTipo(Integer.parseInt(request.getParameter("idTipo")));
                    tipoVivDao.eliminar(tipoViv);
                    //request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarTipoViv.jsp");
                    
                    
                    
                    
                    
                    
                    
                }else if(request.getParameter("btnVerDetalle")!=null){
                    
                      tipoViv = (TipoViv) tipoVivDao.buscarPorID(request.getParameter("idTipo"));

                    request.setAttribute("tipoViv", tipoViv);
                    rd = request.getRequestDispatcher("ver_tipoViv.jsp");
                 }else if(request.getParameter("btnVerDetalle")!=null){
                    
                    tipoViv = (TipoViv) tipoVivDao.buscarPorID(request.getParameter("idTipo"));
                    
                    request.setAttribute("tipoViv", tipoViv);
                    rd = request.getRequestDispatcher("ver_tipoViv.jsp");
                    
                   
                    
                    
                    
                    
                    
                }else if(request.getParameter("btnModificar")!=null){
                    
                 tipoViv = (TipoViv) tipoVivDao.buscarPorID(request.getParameter("idTipo"));
                 
                 request.setAttribute("tipoViv", tipoViv);    
                 rd = request.getRequestDispatcher("modificar_tipoViv.jsp");
                 
                 
                 
                }else if (request.getParameter("btnActualizar")!=null) {
                    
                    tipoViv.setIdTipo(Integer.parseInt(request.getParameter("idTipo")));
                    tipoViv.setNombre(request.getParameter("nombre"));
                    tipoViv.setEstado(request.getParameter("estado"));
                  //paredes.setEstado("Activo");
                    respuesta =  tipoVivDao.modificar (tipoViv);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarTipoViv.jsp");
                    
                }
                 
            } catch (NumberFormatException | SQLException e) {
                System.out.println("Problemas en el server: " + e.toString());
            }
            
            rd.forward(request, response);
            
             }
        }
        
          // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

        
}
