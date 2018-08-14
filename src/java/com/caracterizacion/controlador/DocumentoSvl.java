/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;

import com.caracterizacion.dao.DocumentoDaoImpl;
import com.caracterizacion.modelo.TipoDocumento;
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
@WebServlet(name = "DocumentoSvl", urlPatterns = {"/documentosvl"})
public class DocumentoSvl extends HttpServlet {
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            DocumentoDaoImpl documentoDao =  new DocumentoDaoImpl();
            TipoDocumento documento = new TipoDocumento();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar")!=null){
                    
                    
//                    documento.setIdTipoDocumento(Integer.parseInt(request.getParameter("idTipoDocumento")));
                    documento.setNombre(request.getParameter("nombre"));
                    documento.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("activo");
                    
                    respuesta = documentoDao.insertar(documento);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarTipoDoc.jsp");
                    
                }else if(request.getParameter("btnEliminar")!=null){
                    
                    documento.setIdTipoDocumento(Integer.parseInt(request.getParameter("idTipoDocumento")));
                    documentoDao.eliminar(documento);
                    
                    request.setAttribute("documento", documento);
                    rd = request.getRequestDispatcher("listarTipoDoc.jsp");
                    
                }else if(request.getParameter("btnVerDetalle")!=null){
                    
                    documento = (TipoDocumento) documentoDao.buscarPorID(request.getParameter("idTipoDocumento"));

                    request.setAttribute("documento", documento);
                    rd = request.getRequestDispatcher("ver_tipoDoc.jsp");
                    
                }else if (request.getParameter("btnModificar")!=null) {
                    
                    documento = (TipoDocumento) documentoDao.buscarPorID(request.getParameter("idTipoDocumento"));

                    request.setAttribute("documento", documento);
                    rd = request.getRequestDispatcher("modificar_tipoDoc.jsp");
                    
                }else if (request.getParameter("btnActualizar")!=null) {
                    
                    documento.setIdTipoDocumento(Integer.parseInt(request.getParameter("idTipoDocumento")));
                    documento.setNombre(request.getParameter("nombre"));                 
                    documento.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("Activo");
                    
                    respuesta = documentoDao.modificar(documento);
                    
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarTipoDoc.jsp");
                    
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
