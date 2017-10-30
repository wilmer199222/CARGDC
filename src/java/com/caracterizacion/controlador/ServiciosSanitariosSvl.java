/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;

import com.caracterizacion.dao.ServiciosSanitariosDaoImpl;
import com.caracterizacion.modelo.ServiciosSanitarios;
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
@WebServlet(name = "ServiciosSanitarios", urlPatterns = {"/sanitariosv"})
public class ServiciosSanitariosSvl extends HttpServlet {

      protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            ServiciosSanitariosDaoImpl sanitarioDao =  new ServiciosSanitariosDaoImpl();
            ServiciosSanitarios sanitario = new ServiciosSanitarios();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar")!=null){
                    
                    
                    sanitario.setIdServiciosSanitario(Integer.parseInt(request.getParameter("idServiciosSanitario")));
                    sanitario.setNombre(request.getParameter("nombre"));
                    sanitario.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("activo");
                    
                    respuesta =  sanitarioDao.insertar(sanitario);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarSerSan.jsp");
                    
                }else if(request.getParameter("btnEliminar")!=null){
                    
                    sanitario.setIdServiciosSanitario(Integer.parseInt(request.getParameter("idServiciosSanitario")));
                    sanitarioDao.eliminar(sanitario);
                    
                    request.setAttribute("sanitario", sanitario);
                    rd = request.getRequestDispatcher("listarSerSan.jsp");
                    
                }else if(request.getParameter("btnVerDetalle")!=null){
                    
                    sanitario = (ServiciosSanitarios) sanitarioDao.buscarPorID(request.getParameter("idServiciosSanitario"));

                    request.setAttribute("sanitario", sanitario);
                    rd = request.getRequestDispatcher("ver_serSan.jsp");
                    
                }else if (request.getParameter("btnModificar")!=null) {
                    
                    sanitario = (ServiciosSanitarios) sanitarioDao.buscarPorID(request.getParameter("idServiciosSanitario"));

                    request.setAttribute("sanitario", sanitario);
                    rd = request.getRequestDispatcher("modificar_serSan.jsp");
                    
                }else if (request.getParameter("btnActualizar")!=null) {
                    
                    sanitario.setIdServiciosSanitario(Integer.parseInt(request.getParameter("idServiciosSanitario")));
                    sanitario.setNombre(request.getParameter("nombre"));                 
                    sanitario.setEstado(request.getParameter("estado"));
                    //pisos.setEstado("Activo");
                    
                    respuesta = sanitarioDao.modificar(sanitario);
                    
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarSerSan.jsp");
                    
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
