/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;

import com.caracterizacion.dao.AcompañanteDaoImpl;
import com.caracterizacion.modelo.Acompañante;
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
@WebServlet(name = "Acompañante", urlPatterns = {"/acompañantesv"})
public class AcompañanteSvl extends HttpServlet {
      protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            AcompañanteDaoImpl acompañanteDao =  new AcompañanteDaoImpl();
            Acompañante acompañante = new Acompañante();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar")!=null){
                                   
                    acompañante.setIdAcompañante(Integer.parseInt(request.getParameter("idAcompañante")));
                    acompañante.setNombre(request.getParameter("nombre"));
                    acompañante.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("activo");                   
                    respuesta = acompañanteDao.insertar(acompañante);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarAcompañante.jsp");
                    
                }else if(request.getParameter("btnEliminar")!=null){
                    
                    acompañante.setIdAcompañante(Integer.parseInt(request.getParameter("idAcompañante")));
                    acompañanteDao.eliminar(acompañante);                 
                    request.setAttribute("acompañante", acompañante);
                    rd = request.getRequestDispatcher("listarAcompañante.jsp");
                    
                }else if(request.getParameter("btnVerDetalle")!=null){
                    
                    acompañante = (Acompañante) acompañanteDao.buscarPorID(request.getParameter("idAcompañante"));
                    request.setAttribute("acompañante", acompañante);
                    rd = request.getRequestDispatcher("ver_acompañante.jsp");
                    
                }else if (request.getParameter("btnModificar")!=null) {
                    
                    acompañante = (Acompañante) acompañanteDao.buscarPorID(request.getParameter("idAcompañante"));
                    request.setAttribute("acompañante", acompañante);
                    rd = request.getRequestDispatcher("modificar_acompañante.jsp");
                    
                }else if (request.getParameter("btnActualizar")!=null) {
                    
                    acompañante.setIdAcompañante(Integer.parseInt(request.getParameter("idAcompañante")));
                    acompañante.setNombre(request.getParameter("nombre"));                 
                    acompañante.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("Activo");                 
                    respuesta = acompañanteDao.modificar(acompañante);                    
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarAcompañante.jsp");
                    
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
