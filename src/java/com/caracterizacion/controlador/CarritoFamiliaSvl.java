/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;

import com.caracterizacion.modelo.IntegrantesFamiliar;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ESTUDIANTES
 */
@WebServlet(name = "CarritoFamiliaSvl", urlPatterns = {"/CarritoFamiliaSvl"})
public class CarritoFamiliaSvl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private static final long serialVersionUID = 1L;
    
	private ArrayList<IntegrantesFamiliar> integrantesFamiliar = new ArrayList<>();

	
	
   

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Si lo queremos hacer a traves de un get, tenemos que poner el codigo del post en esta clase
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType( "text/html; charset=iso-8859-1" );
		PrintWriter out = response.getWriter();

		// Obtengo los datos de la peticion
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String edad = request.getParameter("edad");
                String parentesco = request.getParameter("parentesco");
                String escolaridad = request.getParameter("escolaridad"); 
                String ocupacion = request.getParameter("ocupacion");
                               
                    System.out.println("Variable nombre: " + request.getParameter("nombre"));
		// Compruebo qe los campos del formulario tienen datos para añadir a la tabla
////		if (!nombre.equals("") && !apellido.equals("") && !edad.equals("") && !parentesco.equals("") && !escolaridad.equals("") && !ocupacion.equals("")) {
			// Creo el objeto persona y lo añado al arrayList
			IntegrantesFamiliar integrante = new IntegrantesFamiliar(0, nombre, apellido, Integer.parseInt(edad), parentesco, ocupacion, 0, escolaridad, 0);
			integrantesFamiliar.add(integrante);
//		}
                
                out.println("<table class=\"table table-bordered table-striped\">");
		out.println("<tr>");
		out.println("<td>Nombre</td>");			
		out.println("<td>Apellido</td>");
		out.println("<td>Edad</td>");
                out.println("<td>Parentesco</td>");
                out.println("<td>Escolaridad</td>");
                out.println("<td>Ocupacion</td>");
		out.println("</tr>");

		
		for(int i=0; i<integrantesFamiliar.size(); i++){
			IntegrantesFamiliar integranteFamiliar = integrantesFamiliar.get(i);
			out.println("<tr>");
			out.println("<td>"+integranteFamiliar.getNombres()+" </td>");			
                        out.println("<td>"+integranteFamiliar.getApellidos()+"</td>");
                        out.println("<td>"+integranteFamiliar.getEdad()+"</td>");
                        out.println("<td>"+integranteFamiliar.getParentesco()+"</td>");
                        out.println("<td>"+integranteFamiliar.getEscolaridad()+"</td>");
                        out.println("<td>"+integranteFamiliar.getOcupacion()+"</td>");
			out.println("</tr>");
                        
                        System.out.println(" integrantesFamiliar: " + integranteFamiliar.toString());
		}
		out.println("</table>");

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
