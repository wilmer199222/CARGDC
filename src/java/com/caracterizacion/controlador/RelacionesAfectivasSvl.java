

package com.caracterizacion.controlador;


import com.caracterizacion.dao.RelacionesAfectivasDaoImpl;
import com.caracterizacion.modelo.RelacionesAfectivas;
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
@WebServlet(name = "RelacionesAfectivasSvl", urlPatterns = {"/relacionesafectivassv"})
public class RelacionesAfectivasSvl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            RelacionesAfectivasDaoImpl relacionesafectivasDao =  new RelacionesAfectivasDaoImpl();
            RelacionesAfectivas relacionesafec= new RelacionesAfectivas();
            
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar")!=null){
                    relacionesafec.setIdRelacionesAfectivas(Integer.parseInt(request.getParameter("idRelacionesAfectivas")));
                    relacionesafec.setNombre(request.getParameter("nombre"));
                    relacionesafec.setEstado(request.getParameter("estado"));
                    //paredes.setEstado("Activo");
                    respuesta =  relacionesafectivasDao.insertar(relacionesafec);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarRelacionesAfectivas.jsp");
                 }else if(request.getParameter("btnEliminar")!=null){
                    relacionesafec.setIdRelacionesAfectivas(Integer.parseInt(request.getParameter("idRelacionesAfectivas")));
                    relacionesafectivasDao.eliminar(relacionesafec);
                    //request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarRelacionesAfectivas.jsp");
                    
                    
                    
                    
                    
                    
                    
                }else if(request.getParameter("btnVerDetalle")!=null){
                    
                      relacionesafec = (RelacionesAfectivas) relacionesafectivasDao.buscarPorID(request.getParameter("idRelacionesAfectivas"));

                    request.setAttribute("relacionesafec", relacionesafec);
                    rd = request.getRequestDispatcher("ver_relacionesafectivas.jsp");
                 }else if(request.getParameter("btnVerDetalle")!=null){
                    
                    relacionesafec = (RelacionesAfectivas) relacionesafectivasDao.buscarPorID(request.getParameter("idRelacionesAfectivas"));
                    
                    request.setAttribute("relacionesafec", relacionesafec);
                    rd = request.getRequestDispatcher("ver_relacionesafectivas.jsp");
                    
                   
                    
                    
                    
                    
                    
                }else if(request.getParameter("btnModificar")!=null){
                    
                relacionesafec = (RelacionesAfectivas) relacionesafectivasDao.buscarPorID(request.getParameter("idRelacionesAfectivas"));
                 
                 request.setAttribute("relacionesafec", relacionesafec);    
                 rd = request.getRequestDispatcher("modificar_relacionesafectivas.jsp");
                 
                 
                 
                }else if (request.getParameter("btnActualizar")!=null) {
                    relacionesafec.setIdRelacionesAfectivas(Integer.parseInt(request.getParameter("idRelacionesAfectivas")));
                    relacionesafec.setNombre(request.getParameter("nombre"));
                    relacionesafec.setEstado(request.getParameter("estado"));
                  //paredes.setEstado("Activo");
                    respuesta =  relacionesafectivasDao.modificar (relacionesafec);
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("listarRelacionesAfectivas.jsp");
                    
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
