/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;

import com.caracterizacion.dao.CondicionSocialDaoImpl;
import com.caracterizacion.modelo.CondicionSocial;
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
@WebServlet(name = "CondicionSocialSvl", urlPatterns = {"/condicionsocialsvl"})
public class CondicionSocialSvl extends HttpServlet {
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            CondicionSocialDaoImpl condicionDao =  new CondicionSocialDaoImpl();
            CondicionSocial condicion = new CondicionSocial();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar")!=null){
                    
                    
                    condicion.setIdCondiconSocial(Integer.parseInt(request.getParameter("idCondiconSocial")));
                    condicion.setNombre(request.getParameter("nombre"));
                    condicion.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("activo");
                    
                    respuesta = condicionDao.insertar(condicion);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarConSoc.jsp");
                    
                }else if(request.getParameter("btnEliminar")!=null){
                    
                    condicion.setIdCondiconSocial(Integer.parseInt(request.getParameter("idCondiconSocial")));
                    condicionDao.eliminar(condicion);
                    
                    request.setAttribute("condicion", condicion);
                    rd = request.getRequestDispatcher("listarConSoc.jsp");
                    
                }else if(request.getParameter("btnVerDetalle")!=null){
                    
                    condicion = (CondicionSocial) condicionDao.buscarPorID(request.getParameter("idCondiconSocial"));

                    request.setAttribute("condicion", condicion);
                    rd = request.getRequestDispatcher("ver_conSoc.jsp");
                    
                }else if (request.getParameter("btnModificar")!=null) {
                    
                    condicion = (CondicionSocial) condicionDao.buscarPorID(request.getParameter("idCondiconSocial"));

                    request.setAttribute("condicion", condicion);
                    rd = request.getRequestDispatcher("modificar_conSoc.jsp");
                    
                }else if (request.getParameter("btnActualizar")!=null) {
                    
                    condicion.setIdCondiconSocial(Integer.parseInt(request.getParameter("idCondiconSocial")));
                    condicion.setNombre(request.getParameter("nombre"));                 
                    condicion.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("Activo");
                    
                    respuesta = condicionDao.modificar(condicion);
                    
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarConSoc.jsp");
                    
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
