/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;

import com.caracterizacion.dao.TiempoDaoImpl;
import com.caracterizacion.modelo.TiempoLibre;
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
@WebServlet(name = "TiempoSvl", urlPatterns = {"/tiemposvl"})
public class TiempoSvl extends HttpServlet {
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            TiempoDaoImpl tiempoDao =  new TiempoDaoImpl();
            TiempoLibre tiempo = new TiempoLibre();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar")!=null){
                    
                    
//                    tiempo.setIdTiempoLibre(Integer.parseInt(request.getParameter("idTiempoLibre")));
                    tiempo.setNombre(request.getParameter("nombre"));
                    tiempo.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("activo");
                    
                    respuesta = tiempoDao.insertar(tiempo);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarTieLib.jsp");
                    
                }else if(request.getParameter("btnEliminar")!=null){
                    
                    tiempo.setIdTiempoLibre(Integer.parseInt(request.getParameter("idTiempoLibre")));
                    tiempoDao.eliminar(tiempo);
                    
                    request.setAttribute("tiempo", tiempo);
                    rd = request.getRequestDispatcher("listarTieLib.jsp");
                    
                }else if(request.getParameter("btnVerDetalle")!=null){
                    
                    tiempo = (TiempoLibre) tiempoDao.buscarPorID(request.getParameter("idTiempoLibre"));

                    request.setAttribute("tiempo", tiempo);
                    rd = request.getRequestDispatcher("ver_tieLib.jsp");
                    
                }else if (request.getParameter("btnModificar")!=null) {
                    
                    tiempo = (TiempoLibre) tiempoDao.buscarPorID(request.getParameter("idTiempoLibre"));

                    request.setAttribute("tiempo", tiempo);
                    rd = request.getRequestDispatcher("modificar_tieLib.jsp");
                    
                }else if (request.getParameter("btnActualizar")!=null) {
                    
                    tiempo.setIdTiempoLibre(Integer.parseInt(request.getParameter("idTiempoLibre")));
                    tiempo.setNombre(request.getParameter("nombre"));                 
                    tiempo.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("Activo");
                    
                    respuesta = tiempoDao.modificar(tiempo);
                    
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarTieLib.jsp");
                    
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
