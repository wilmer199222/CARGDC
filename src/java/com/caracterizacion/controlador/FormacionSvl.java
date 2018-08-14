/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;

import com.caracterizacion.dao.FormacionDaoImpl;
import com.caracterizacion.dao.PisosDaoImpl;
import com.caracterizacion.modelo.NivelFormacion;
import com.caracterizacion.modelo.Pisos;
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
@WebServlet(name = "FormacionSvl", urlPatterns = {"/formacionsvl"})
public class FormacionSvl extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            FormacionDaoImpl formacionDao =  new FormacionDaoImpl();
            NivelFormacion formacion = new NivelFormacion();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar")!=null){
                    
                    
//                    formacion.setIdNivelFormacion(Integer.parseInt(request.getParameter("idNivelFormacion")));
                    formacion.setNombre(request.getParameter("nombre"));
                    formacion.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("activo");
                    
                    respuesta = formacionDao.insertar(formacion);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarNivFor.jsp");
                    
                }else if(request.getParameter("btnEliminar")!=null){
                    
                    formacion.setIdNivelFormacion(Integer.parseInt(request.getParameter("idNivelFormacion")));
                    formacionDao.eliminar(formacion);
                    
                    request.setAttribute("formacion", formacion);
                    rd = request.getRequestDispatcher("listarNivFor.jsp");
                    
                }else if(request.getParameter("btnVerDetalle")!=null){
                    
                    formacion = (NivelFormacion) formacionDao.buscarPorID(request.getParameter("idNivelFormacion"));

                    request.setAttribute("formacion", formacion);
                    rd = request.getRequestDispatcher("ver_nivFor.jsp");
                    
                }else if (request.getParameter("btnModificar")!=null) {
                    
                    formacion = (NivelFormacion) formacionDao.buscarPorID(request.getParameter("idNivelFormacion"));

                    request.setAttribute("formacion", formacion);
                    rd = request.getRequestDispatcher("modificar_nivFor.jsp");
                    
                }else if (request.getParameter("btnActualizar")!=null) {
                    
                    formacion.setIdNivelFormacion(Integer.parseInt(request.getParameter("idNivelFormacion")));
                    formacion.setNombre(request.getParameter("nombre"));                 
                    formacion.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("Activo");
                    
                    respuesta = formacionDao.modificar(formacion);
                    
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarNivFor.jsp");
                    
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
