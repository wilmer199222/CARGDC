/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;

import com.caracterizacion.dao.PersonaDaoImpl;
import com.caracterizacion.modelo.Persona;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "PersonaSvl", urlPatterns = {"/personaSvl"})
public class PersonaSvl extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           PersonaDaoImpl personaDao =  new PersonaDaoImpl();
            Persona persona = new Persona();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar1")!=null){
//                    Persona.setIdPersona(Integer.parseInt(request.getParameter("idPersona")));
                    persona.setDocIdentidad(request.getParameter("numeroDoc"));
                    persona.setNombre(request.getParameter("nombre3"));
                    persona.setSexo(request.getParameter("sexo2"));
                    persona.setEdad(Integer.parseInt(request.getParameter("edad")));
                    persona.setFechaNacimiento(Date.valueOf(request.getParameter("fecha2")));
                    persona.setIdTipoDocumento(Integer.parseInt(request.getParameter("tipoIdentidad")));
                    respuesta =  personaDao.insertar(persona);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("Prueba.jsp");
                 
                }
                
                } catch (NumberFormatException e) {
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(PersonaSvl.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(PersonaSvl.class.getName()).log(Level.SEVERE, null, ex);
        }
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
