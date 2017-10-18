/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.caracterizacion.controlador;

import com.caracterizacion.dao.ServPublicosDaoImpl;
import com.caracterizacion.modelo.ServPublicos;
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
@WebServlet(name = "ServpublicosSvl", urlPatterns = {"/servpublicossv"})
public class ServpublicosSvl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            ServPublicosDaoImpl servpublicosDao =  new ServPublicosDaoImpl();
            ServPublicos servPublicos = new ServPublicos();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar")!=null){
                    servPublicos.setIdServiciosPublicos(Integer.parseInt(request.getParameter("idServiciosPublicos")));
                    servPublicos.setNombre(request.getParameter("nombre"));
                    servPublicos.setEstado(request.getParameter("estado"));
                    //paredes.setEstado("Activo");
                    respuesta =  servpublicosDao.insertar(servPublicos);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarServiciosPublicos.jsp");
                 }else if(request.getParameter("btnEliminar")!=null){
                    servPublicos.setIdServiciosPublicos(Integer.parseInt(request.getParameter("idServiciosPublicos")));
                    servpublicosDao.eliminar(servPublicos);
                    //request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarServiciosPublicos.jsp");
                    
                    
                    
                    
                    
                    
                    
                }else if(request.getParameter("btnVerDetalle")!=null){
                    
                      servPublicos = (ServPublicos) servpublicosDao.buscarPorID(request.getParameter("idServiciosPublicos"));

                    request.setAttribute("servPublicos", servPublicos);
                    rd = request.getRequestDispatcher("ver_serviciospublicos.jsp");
                 }else if(request.getParameter("btnVerDetalle")!=null){
                    
                    servPublicos = (ServPublicos) servpublicosDao.buscarPorID(request.getParameter("idServiciosPublicos"));
                    
                    request.setAttribute("servPublicos", servPublicos);
                    rd = request.getRequestDispatcher("ver_serviciospublicos.jsp");
                    
                   
                    
                    
                    
                    
                    
                }else if(request.getParameter("btnModificar")!=null){
                    
                 servPublicos = (ServPublicos) servpublicosDao.buscarPorID(request.getParameter("idServiciosPublicos"));
                 
                 request.setAttribute("servPublicos", servPublicos);    
                 rd = request.getRequestDispatcher("modificar_serviciospublicos.jsp");
                 
                 
                 
                }else if (request.getParameter("btnActualizar")!=null) {
                    servPublicos.setIdServiciosPublicos(Integer.parseInt(request.getParameter("idServiciosPublicos")));
                    servPublicos.setNombre(request.getParameter("nombre"));
                    servPublicos.setEstado(request.getParameter("estado"));
                  //paredes.setEstado("Activo");
                    respuesta =  servpublicosDao.modificar (servPublicos);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarServiciosPublicos.jsp");
                    
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
