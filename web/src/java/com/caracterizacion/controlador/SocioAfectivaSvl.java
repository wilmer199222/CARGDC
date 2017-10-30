/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.caracterizacion.controlador;


import com.caracterizacion.dao.SocioAfectivaDaoImpl;
import com.caracterizacion.modelo.SocioAfectiva;
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
@WebServlet(name = "SocioAfectivaSvl", urlPatterns = {"/socioafectivasv"})
public class SocioAfectivaSvl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            SocioAfectivaDaoImpl socioafectivaDao =  new SocioAfectivaDaoImpl();
            SocioAfectiva socioAfectiva = new SocioAfectiva();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar")!=null){
                    socioAfectiva.setIdSocioAfectiva(Integer.parseInt(request.getParameter("idSocioAfectiva")));
                    socioAfectiva.setNombre(request.getParameter("nombre"));
                    socioAfectiva.setEstado(request.getParameter("estado"));
                    //paredes.setEstado("Activo");
                    respuesta =  socioafectivaDao.insertar(socioAfectiva);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarSocioAfectiva.jsp");
                 }else if(request.getParameter("btnEliminar")!=null){
                    socioAfectiva.setIdSocioAfectiva(Integer.parseInt(request.getParameter("idSocioAfectiva")));
                    socioafectivaDao.eliminar(socioAfectiva);
                    //request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarSocioAfectiva.jsp");
                    
                    
                    
                    
                    
                    
                    
                }else if(request.getParameter("btnVerDetalle")!=null){
                    
                      socioAfectiva = (SocioAfectiva) socioafectivaDao.buscarPorID(request.getParameter("idSocioAfectiva"));

                    request.setAttribute("socioAfectiva", socioAfectiva);
                    rd = request.getRequestDispatcher("ver_socioafectiva.jsp");
                 }else if(request.getParameter("btnVerDetalle")!=null){
                    
                    socioAfectiva = (SocioAfectiva) socioafectivaDao.buscarPorID(request.getParameter("idSocioAfectiva"));
                    
                    request.setAttribute("socioAfectiva", socioAfectiva);
                    rd = request.getRequestDispatcher("ver_socioafectiva.jsp");
                    
                   
                    
                    
                    
                    
                    
                }else if(request.getParameter("btnModificar")!=null){
                    
                 socioAfectiva = (SocioAfectiva) socioafectivaDao.buscarPorID(request.getParameter("idSocioAfectiva"));
                 
                 request.setAttribute("socioAfectiva", socioAfectiva);    
                 rd = request.getRequestDispatcher("modificar_socioafectiva.jsp");
                 
                 
                 
                }else if (request.getParameter("btnActualizar")!=null) {
                   socioAfectiva.setIdSocioAfectiva(Integer.parseInt(request.getParameter("idSocioAfectiva")));
                    socioAfectiva.setNombre(request.getParameter("nombre"));
                    socioAfectiva.setEstado(request.getParameter("estado"));
                  //paredes.setEstado("Activo");
                    respuesta =  socioafectivaDao.modificar (socioAfectiva);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarSocioAfectiva.jsp");
                    
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
