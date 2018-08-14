/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;

import com.caracterizacion.dao.PisosDaoImpl;
import com.caracterizacion.dao.TransporteDaoImpl;
import com.caracterizacion.modelo.Pisos;
import com.caracterizacion.modelo.TipoTransporte;
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
 * @author Jhon
 */
@WebServlet(name = "TransporteSvl", urlPatterns = {"/transportesvl"})
public class TransporteSvl extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            TransporteDaoImpl transDao =  new TransporteDaoImpl();
            TipoTransporte trans = new TipoTransporte();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar")!=null){
                    
                    
//                    trans.setIdTipoTransporte(Integer.parseInt(request.getParameter("idTipoTransporte")));
                    trans.setNombre(request.getParameter("nombre"));
                    trans.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("activo");
                    
                    respuesta = transDao.insertar(trans);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarTipoTrans.jsp");
                    
                }else if(request.getParameter("btnEliminar")!=null){
                    
                    trans.setIdTipoTransporte(Integer.parseInt(request.getParameter("idTipoTransporte")));
                    transDao.eliminar(trans);
                    
                    request.setAttribute("trans", trans);
                    rd = request.getRequestDispatcher("listarTipoTrans.jsp");
                    
                }else if(request.getParameter("btnVerDetalle")!=null){
                    
                    trans = (TipoTransporte) transDao.buscarPorID(request.getParameter("idTipoTransporte"));

                    request.setAttribute("trans", trans);
                    rd = request.getRequestDispatcher("ver_tipoTrans.jsp");
                    
                }else if (request.getParameter("btnModificar")!=null) {
                    
                    trans = (TipoTransporte) transDao.buscarPorID(request.getParameter("idTipoTransporte"));

                    request.setAttribute("trans", trans);
                    rd = request.getRequestDispatcher("modificar_tipoTrans.jsp");
                    
                }else if (request.getParameter("btnActualizar")!=null) {
                    
                    trans.setIdTipoTransporte(Integer.parseInt(request.getParameter("idTipoTransporte")));
                    trans.setNombre(request.getParameter("nombre"));                 
                    trans.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("Activo");
                    
                    respuesta = transDao.modificar(trans);
                    
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarTipoTrans.jsp");
                    
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
