/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;

import com.caracterizacion.dao.TechoDaoImpl;
import com.caracterizacion.modelo.Pisos;
import com.caracterizacion.modelo.Techo;
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
@WebServlet(name = "Techo", urlPatterns = {"/techosv"})
public class TechoSvl extends HttpServlet {

      protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            TechoDaoImpl techoDao =  new TechoDaoImpl();
            Techo techo = new Techo();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar")!=null){
                    
                    techo.setIdTecho(Integer.parseInt(request.getParameter("idTecho")));
                    techo.setNombre(request.getParameter("nombre"));
                    techo.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("activo");
                    
                    respuesta =  techoDao.insertar(techo);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarTechos.jsp");
                    
                }else if(request.getParameter("btnEliminar")!=null){
                    
                    techo.setIdTecho(Integer.parseInt(request.getParameter("idTecho")));
                    techoDao.eliminar(techo);
                    
                    request.setAttribute("techo", techo);
                    rd = request.getRequestDispatcher("listarTechos.jsp");
                    
                }else if(request.getParameter("btnVerDetalle")!=null){
                    
                    techo = (Techo) techoDao.buscarPorID(request.getParameter("idTecho"));

                    request.setAttribute("techo", techo);
                    rd = request.getRequestDispatcher("ver_techos.jsp");
                    
                }else if (request.getParameter("btnModificar")!=null) {
                    
                    techo = (Techo) techoDao.buscarPorID(request.getParameter("idTecho"));

                    request.setAttribute("techo", techo);
                    rd = request.getRequestDispatcher("modificar_techos.jsp");
                    
                }else if (request.getParameter("btnActualizar")!=null) {
                    
                    techo.setIdTecho(Integer.parseInt(request.getParameter("idTecho")));
                    techo.setNombre(request.getParameter("nombre"));                 
                    techo.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("Activo");
                    
                    respuesta = techoDao.modificar(techo);
                    
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarTechos.jsp");
                    
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
