/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;

import com.caracterizacion.dao.ParedesDaoImpl;
import com.caracterizacion.modelo.Paredes;
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
@WebServlet(name = "ParedesSvl", urlPatterns = {"/paredessv"})
public class ParedesSvl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            ParedesDaoImpl paredDao =  new ParedesDaoImpl();
            Paredes paredes = new Paredes();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar")!=null){
                    paredes.setIdParedes(Integer.parseInt(request.getParameter("idParedes")));
                    paredes.setNombre(request.getParameter("nombre"));
                    paredes.setEstado(request.getParameter("estado"));
                    //paredes.setEstado("Activo");
                    respuesta =  paredDao.insertar(paredes);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarParedes.jsp");
                 }else if(request.getParameter("btnEliminar")!=null){
                    paredes.setIdParedes(Integer.parseInt(request.getParameter("idParedes")));
                    paredDao.eliminar(paredes);
                    //request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarParedes.jsp");
                    
                    
                    
                    
                    
                    
                    
                }else if(request.getParameter("btnVerDetalle")!=null){
                    
                      paredes = (Paredes) paredDao.buscarPorID(request.getParameter("idParedes"));

                    request.setAttribute("paredes", paredes);
                    rd = request.getRequestDispatcher("ver_paredes.jsp");
                 }else if(request.getParameter("btnVerDetalle")!=null){
                    
                    paredes = (Paredes) paredDao.buscarPorID(request.getParameter("idParedes"));
                    
                    request.setAttribute("paredes", paredes);
                    rd = request.getRequestDispatcher("ver_paredes.jsp");
                    
                   
                    
                    
                    
                    
                    
                }else if(request.getParameter("btnModificar")!=null){
                    
                 paredes = (Paredes) paredDao.buscarPorID(request.getParameter("idParedes"));
                 
                 request.setAttribute("paredes", paredes);    
                 rd = request.getRequestDispatcher("modificar_paredes.jsp");
                 
                 
                 
                }else if (request.getParameter("btnActualizar")!=null) {
                    
                    paredes.setIdParedes(Integer.parseInt(request.getParameter("idParedes")));
                    paredes.setNombre(request.getParameter("nombre"));
                    paredes.setEstado(request.getParameter("estado"));
                  //paredes.setEstado("Activo");
                    respuesta =  paredDao.modificar (paredes);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarParedes.jsp");
                    
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