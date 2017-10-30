/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;


import com.caracterizacion.dao.TipofamiliarDaoImpl;
import com.caracterizacion.modelo.Tipofamiliar;
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
 * @author ESTUDIANTES
 */
@WebServlet(name = "TipofamiliarSvl", urlPatterns = {"/tipofamiliarsv"})
public class TipofamiliarSvl extends HttpServlet {
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            TipofamiliarDaoImpl tipofamiliarDao =  new TipofamiliarDaoImpl();
            Tipofamiliar tipofamiliar = new Tipofamiliar();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar")!=null){
                    tipofamiliar.setIdTipoFamiliar(Integer.parseInt(request.getParameter("idTipoFamiliar")));
                    tipofamiliar.setNombre(request.getParameter("nombre"));
                    tipofamiliar.setEstado(request.getParameter("estado"));
                    //paredes.setEstado("Activo");
                    respuesta =  tipofamiliarDao.insertar(tipofamiliar);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarTipofamiliar.jsp");
                 }else if(request.getParameter("btnEliminar")!=null){
                    tipofamiliar.setIdTipoFamiliar(Integer.parseInt(request.getParameter("idTipoFamiliar")));
                    tipofamiliarDao.eliminar(tipofamiliar);
                    //request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarTipoFamiliar.jsp");
                    
                    
                    
                    
                    
                    
                    
                }else if(request.getParameter("btnVerDetalle")!=null){
                    
                     tipofamiliar = (Tipofamiliar) tipofamiliarDao.buscarPorID(request.getParameter("idTipoFamiliar"));

                    request.setAttribute("tipofamiliar", tipofamiliar);
                    rd = request.getRequestDispatcher("ver_tipofamiliar.jsp");
                 }else if(request.getParameter("btnVerDetalle")!=null){
                    
                    tipofamiliar = (Tipofamiliar) tipofamiliarDao.buscarPorID(request.getParameter("idTipoFamiliar"));
                    
                    request.setAttribute("tipofamiliar", tipofamiliar);
                    rd = request.getRequestDispatcher("ver_tipofamiliar.jsp");
                    
                   
                    
                    
                    
                    
                    
                }else if(request.getParameter("btnModificar")!=null){
                    
                 tipofamiliar = (Tipofamiliar) tipofamiliarDao.buscarPorID(request.getParameter("idTipoFamiliar"));                 
                 request.setAttribute("tipofamiliar", tipofamiliar);    
                 rd = request.getRequestDispatcher("modificar_tipofamiliar.jsp");
                 
                 
                 
                }else if (request.getParameter("btnActualizar")!=null) {
                    tipofamiliar.setIdTipoFamiliar(Integer.parseInt(request.getParameter("idTipoFamiliar")));
                    tipofamiliar.setNombre(request.getParameter("nombre"));
                    tipofamiliar.setEstado(request.getParameter("estado"));
                  //paredes.setEstado("Activo");
                    respuesta =  tipofamiliarDao.modificar (tipofamiliar);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarTipofamiliar.jsp");
                    
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
