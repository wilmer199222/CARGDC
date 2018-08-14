/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;

import com.caracterizacion.dao.AspectoDeViviendaDaoImpl;
import com.caracterizacion.modelo.AspectoDeVivienda;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ESTUDIANTES
 */
@WebServlet(name = "PruebaSvl", urlPatterns = {"/PruebaSvl"})
public class PruebaSvl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
             AspectoDeViviendaDaoImpl  aspectoVivDao = new AspectoDeViviendaDaoImpl();
            AspectoDeVivienda  aspectoViv = new AspectoDeVivienda();
            
            String[] elementos = request.getParameterValues("paredes");
            if (elementos!=null) {
                    for(String elemT : elementos){
                        out.println("<br>" + elemT);
                   
                    }   
                }
            
            /// //Creamos el objetivo Aspecto de Vivienda
                    aspectoViv.setNumeroDormitorios(Integer.parseInt(request.getParameter("dormitorios")));
                    aspectoViv.setNumeroBaños(Integer.parseInt(request.getParameter("banos")));
                    aspectoViv.setCocina(Integer.parseInt(request.getParameter("cocina")));
                    aspectoViv.setSala(Integer.parseInt(request.getParameter("sala")));
                    aspectoViv.setComedor(Integer.parseInt(request.getParameter("comedor")));
                    //aspectoViv.setIdCaracterizacion(caracTDao.buscarIdCaracterizacion(String.valueOf(personaDao.buscarIdPersona(request.getParameter("numeroDocument")))));
                    aspectoViv.setIdTecho(Integer.parseInt(request.getParameter("techos")));
                    aspectoViv.setIdServiciosSanitario(Integer.parseInt(request.getParameter("servSanitarios")));
                    aspectoViv.setIdTenencia(Integer.parseInt(request.getParameter("tenencia")));
                    aspectoViv.setIdTipoVivienda(Integer.parseInt(request.getParameter("tipo")));
                    
                    out.println("vivienda: " + aspectoViv.toString());
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
