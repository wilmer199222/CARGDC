/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caracterizacion.controlador;

import com.caracterizacion.dao.AcudienteDaoImpl;
import com.caracterizacion.dao.AspectoDeViviendaDaoImpl;
import com.caracterizacion.dao.CaracterizacionDaoImpl;
import com.caracterizacion.dao.DetallaAnimalesDaoImpl;
import com.caracterizacion.dao.DetallaParedesDaoImpl;
import com.caracterizacion.dao.DetallaPisosDaoImpl;
import com.caracterizacion.dao.DetallaRelacAfectivasDaoImpl;
import com.caracterizacion.dao.DetallaServPublicoDaoImpl;
import com.caracterizacion.dao.DetallaSocAfectivaDaoImpl;
import com.caracterizacion.dao.DetallaTipoTransporteDaoImpl;
import com.caracterizacion.dao.DetalleTiempoLibreDaoImpl;
import com.caracterizacion.dao.PersonaDaoImpl;
import com.caracterizacion.dao.RegimenDaoImpl;
import com.caracterizacion.dao.SaludDaoImpl;
import com.caracterizacion.dao.TiempoDaoImpl;
import com.caracterizacion.dao.TipoFamiliarDaoImpl;
import com.caracterizacion.modelo.Acudiente;
import com.caracterizacion.modelo.AspectoDeVivienda;
import com.caracterizacion.modelo.Caracterizacion;
import com.caracterizacion.modelo.DetallaAnimales;
import com.caracterizacion.modelo.DetallaParedes;
import com.caracterizacion.modelo.DetallaPisos;
import com.caracterizacion.modelo.DetallaRelacAfectivas;
import com.caracterizacion.modelo.DetallaServPublico;
import com.caracterizacion.modelo.DetallaSocAfectiva;
import com.caracterizacion.modelo.DetallaTipoTransporte;
import com.caracterizacion.modelo.DetalleTiempoLibre;
import com.caracterizacion.modelo.Persona;
import com.caracterizacion.modelo.Salud;
import com.caracterizacion.modelo.TiempoLibre;
import com.caracterizacion.modelo.Tipofamiliar;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "CaracterizacionSvl", urlPatterns = {"/caracterizacionSvl"})
public class CaracterizacionSvl extends HttpServlet {

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
            AcudienteDaoImpl acudienteDao =  new AcudienteDaoImpl();
            Acudiente personaAcudiente = new Acudiente();
            
            PersonaDaoImpl personaDao = new PersonaDaoImpl();
            Persona personaEncuestada = new Persona();
            
            SaludDaoImpl saludDao = new SaludDaoImpl();
            Salud  salud = new Salud();
            
            
            TipoFamiliarDaoImpl tipoFamDao = new TipoFamiliarDaoImpl();
            Tipofamiliar  tipoFamiliar = new Tipofamiliar();
            
            
            TiempoDaoImpl tiempoDao = new TiempoDaoImpl();
            TiempoLibre  tiempoLibre = new TiempoLibre();
            
            RegimenDaoImpl regimenDao = new RegimenDaoImpl();
            
            AspectoDeViviendaDaoImpl  aspectoVivDao = new AspectoDeViviendaDaoImpl();
            AspectoDeVivienda  aspectoViv = new AspectoDeVivienda();
            
            CaracterizacionDaoImpl caracTDao = new CaracterizacionDaoImpl();
            Caracterizacion objCarate = new Caracterizacion();
            
            DetallaParedesDaoImpl detallaParedDao = new DetallaParedesDaoImpl();
            DetallaParedes detallaParedes;
            
            DetallaPisosDaoImpl detallaPisosDao = new DetallaPisosDaoImpl();
            DetallaPisos detallaPisos;
            
            DetallaServPublicoDaoImpl detallaServPublicoDao = new DetallaServPublicoDaoImpl();
            DetallaServPublico detallaServPublico;
            
            DetallaSocAfectivaDaoImpl detallaSocAfectivaDao = new DetallaSocAfectivaDaoImpl();
            DetallaSocAfectiva detallaSocAfectiva;
            
            DetallaRelacAfectivasDaoImpl detallaRelacAfectivasDao = new DetallaRelacAfectivasDaoImpl();
            DetallaRelacAfectivas detallaRelacAfectivas;
            
            DetallaAnimalesDaoImpl detallaAnimalesDao = new DetallaAnimalesDaoImpl();
            DetallaAnimales detallaAnimales;
            
            DetallaTipoTransporteDaoImpl detallaTipoTransporteDao = new DetallaTipoTransporteDaoImpl();
            DetallaTipoTransporte detallaTipoTransporte;
            
            DetalleTiempoLibreDaoImpl detalleTiempoLibreDao = new DetalleTiempoLibreDaoImpl();
            DetalleTiempoLibre detalleTiempoLibre;
            
            
 
            List<Persona> listPersona = new ArrayList();
             
            String respuesta = null;
            RequestDispatcher rd = null;
            try {
                if(request.getParameter("btnRegistrar1")!=null){
                    
                    //Creamos el objetivo Acudiente
//                    personaAcudiente.setNombre(request.getParameter("nombre"));
//                    personaAcudiente.setApellido(request.getParameter("apellido"));
//                    personaAcudiente.setSexo(request.getParameter("sexo"));
//                    personaAcudiente.setEdad(Integer.parseInt(request.getParameter("edad")));
//                    personaAcudiente.setCiudad(request.getParameter("ciudad"));
//                    personaAcudiente.setTipoIdentidad(request.getParameter("tipoIdentidad"));
//                    personaAcudiente.setCedulaAcudiente(request.getParameter("numeroDoc"));
//                    personaAcudiente.setMunicipio(request.getParameter("municipio"));
//                    personaAcudiente.setDireccion(request.getParameter("direccion"));
//                    personaAcudiente.setTelefono(request.getParameter("telefono"));
//                    
//                    respuesta= acudienteDao.insertar(personaAcudiente);
//                    
//                    //Creamos El objetivo Persona Encuestada
                    personaEncuestada.setDocIdentidad(request.getParameter("numeroDocument"));
                    System.out.println("documento persona encuestada "+request.getParameter("numeroDocument"));
                    personaEncuestada.setNombre(request.getParameter("nombre3"));
                    personaEncuestada.setSexo(request.getParameter("sexo2"));
                    personaEncuestada.setEdad(Integer.parseInt(request.getParameter("edad2")));
                    personaEncuestada.setFechaNacimiento(Date.valueOf(request.getParameter("fecha2")));
                    System.out.println("Doc: " + request.getParameter("docIdentidad"));
                    personaEncuestada.setIdTipoDocumento(Integer.parseInt(request.getParameter("docIdentidad")));
//                    
//                    
//                    
////                    respuesta =  personaDao.insertar(personaAcudiente);
                    personaDao.insertar(personaEncuestada);
//                 
                     
                    //Creamos el objetivo tipo familiar
                    
                    
                    //Creamos el objetivo Caracterizacion
                    objCarate.setDeportes(request.getParameter("deporte"));
                    System.out.println("resp: "+request.getParameter("asiste"));
                    objCarate.setFechaAsistencia(Date.valueOf(request.getParameter("asiste")));
                    objCarate.setValorIngreso(12000.00);
                    objCarate.setVarlorGastos(55000.00);
                    objCarate.setArmoniaFamiliar(request.getParameter("armonia"));
                    objCarate.setObservacion("Estamos probado");
                    objCarate.setEstado(Integer.parseInt("1"));
                    objCarate.setIdCondicionSocial(Integer.parseInt("1"));
                    objCarate.setIdTipoFamiliar(Integer.parseInt(request.getParameter("tipo")));
                    objCarate.setIdEmpleado(Integer.parseInt("1"));
                    objCarate.setIdPersona(personaDao.buscarIdPersona(request.getParameter("numeroDocument")));
                    System.out.println("valor: " + personaDao.buscarIdPersona("numeroDocument"));
                    
                    objCarate.setCedulaAcudiente(request.getParameter("numeroDoc"));
                    objCarate.setComparteHabitacion(request.getParameter("comparteHabitacion"));
                    objCarate.setObservacionComparteHabitacion(request.getParameter("conquien"));
                    
                    objCarate.setAcompañante(request.getParameter("escuela"));
                    if (request.getParameter("escuela").equals(6)) {
                    objCarate.setCual(request.getParameter("cualAcompaña"));
                        
                    }
                    
                    
                    
                    caracTDao.insertar(objCarate);
                    
  
                    //creamos el objetivo salud
                    salud.setDiscapacidad(request.getParameter("cualDiscapac"));
                    salud.setFrecuenciaMedico(request.getParameter("asistencia"));
                    salud.setAlergia(request.getParameter("cualAlergia"));
                    salud.setPeso(request.getParameter("peso"));
                    salud.setMedicamento(request.getParameter("cualMedicamen"));
                    salud.setEstatura(request.getParameter("estatura"));
                    salud.setEnfermedad(request.getParameter("cualEnferm"));
                    salud.setIdCaracterizacion(caracTDao.buscarIdCaracterizacion(String.valueOf(personaDao.buscarIdPersona(request.getParameter("numeroDocument")))));
//                    salud.setIdCaracterizacion((int) caracTDao.buscarPorID(request.getParameter("idCaracterizacion")));
                    System.out.println("IdCaracte "+caracTDao.buscarIdCaracterizacion(String.valueOf(personaDao.buscarIdPersona(request.getParameter("numeroDocument")))));
                    salud.setIdregimenSalud(Integer.parseInt(request.getParameter("regSalud")));
                    salud.setCualRegimen(request.getParameter("cualRegimen"));
                      
                    saludDao.insertar(salud);
                    
                  
                    
                    //Creamos el objetivo Aspecto de Vivienda
                    aspectoViv.setNumeroDormitorios(Integer.parseInt(request.getParameter("dormitorios")));
                    aspectoViv.setNumeroBaños(Integer.parseInt(request.getParameter("banos")));
                    aspectoViv.setCocina(Integer.parseInt(request.getParameter("cocina")));
                    aspectoViv.setSala(Integer.parseInt(request.getParameter("sala")));
                    aspectoViv.setComedor(Integer.parseInt(request.getParameter("comedor")));
                    aspectoViv.setIdCaracterizacion(caracTDao.buscarIdCaracterizacion(String.valueOf(personaDao.buscarIdPersona(request.getParameter("numeroDocument")))));
                    aspectoViv.setIdTecho(Integer.parseInt(request.getParameter("techos")));
                    aspectoViv.setIdServiciosSanitario(Integer.parseInt(request.getParameter("servSanitarios")));
                    aspectoViv.setIdTenencia(Integer.parseInt(request.getParameter("tenencia")));
                    aspectoViv.setIdTipoVivienda(Integer.parseInt(request.getParameter("tipo")));
                    
                    out.println("vivienda: " +aspectoViv.toString());
                    
                   aspectoVivDao.insertar(aspectoViv);
                    
                    // registra  en la  tabla detalla paredes
                    String[] elementos = request.getParameterValues("paredes");
                    if (elementos!=null) {
                           
                        for (String idPared : elementos) {
                            detallaParedes =  new DetallaParedes(0,caracTDao.buscarIdCaracterizacion(String.valueOf(personaDao.buscarIdPersona(request.getParameter("numeroDocument")))),Integer.parseInt(idPared));
                              detallaParedDao.insertar(detallaParedes);
                        }
                        
                    }
                    
                    // registra en la  tabla detalla pisos
                     String[] elementos2 = request.getParameterValues("pisos");
                    if (elementos2!=null) {
                           
                        for (String idPiso : elementos2) {
                            detallaPisos =  new DetallaPisos(0,caracTDao.buscarIdCaracterizacion(String.valueOf(personaDao.buscarIdPersona(request.getParameter("numeroDocument")))),Integer.parseInt(idPiso));
                              detallaPisosDao.insertar(detallaPisos);
                        }
                        
                    }
                    
                    // registra en la  tabla detalla  servicio publicos
                    String[] elementos3 = request.getParameterValues("servPublicos");
                    if (elementos3!=null) {
                           
                        for (String idServiciosPublicos : elementos3) {
                            detallaServPublico =  new DetallaServPublico(0,caracTDao.buscarIdCaracterizacion(String.valueOf(personaDao.buscarIdPersona(request.getParameter("numeroDocument")))),Integer.parseInt(idServiciosPublicos));
                              detallaServPublicoDao.insertar(detallaServPublico);
                        }
                        
                    }
                    
                    // registra en la tabla detalla socioAfectiva
                    String[] elementos4 = request.getParameterValues("socioAfectiva");
                    if (elementos4!=null) {
                           
                        for (String idSocioAfectiva: elementos4) {
                            detallaSocAfectiva =  new DetallaSocAfectiva(0,caracTDao.buscarIdCaracterizacion(String.valueOf(personaDao.buscarIdPersona(request.getParameter("numeroDocument")))),Integer.parseInt(idSocioAfectiva));
                              detallaSocAfectivaDao.insertar(detallaSocAfectiva);
                        }
                        
                    }
                    
                    //Registra en la  tabla detalla relacionesAfectivas
                     String[] elementos5 = request.getParameterValues("relacionAfec");
                    if (elementos5!=null) {
                           
                        for (String idRelacionesAfectivas: elementos5) {
                            detallaRelacAfectivas =  new DetallaRelacAfectivas(0,caracTDao.buscarIdCaracterizacion(String.valueOf(personaDao.buscarIdPersona(request.getParameter("numeroDocument")))),Integer.parseInt(idRelacionesAfectivas));
                              detallaRelacAfectivasDao.insertar(detallaRelacAfectivas);
                        }
                        
                    }
                    
                    //Registra en la tabla detalla animales
                    String[] elementos6 = request.getParameterValues("animales");
                    if (elementos6!=null) {
                           
                        for (String  idAnimal: elementos6) {
                            detallaAnimales  =  new DetallaAnimales(0,caracTDao.buscarIdCaracterizacion(String.valueOf(personaDao.buscarIdPersona(request.getParameter("numeroDocument")))),Integer.parseInt(idAnimal),request.getParameter("cualAnimal"));
                              detallaAnimalesDao.insertar(detallaAnimales);
                        }
                        
                    }
                    
                    //Registra en la tabla detalla tipoTransporte
                    String[] elementos7 = request.getParameterValues("desplazamiento");
                    if (elementos7!=null) {
                           
                        for (String idTipoTransporte : elementos7) {
                            detallaTipoTransporte =  new DetallaTipoTransporte(0,caracTDao.buscarIdCaracterizacion(String.valueOf(personaDao.buscarIdPersona(request.getParameter("numeroDocument")))),Integer.parseInt(idTipoTransporte));
                              detallaTipoTransporteDao.insertar(detallaTipoTransporte);
                        }
                        
                    }
                    
                    //Registra en La Tabla Detalla Tiempo Libre
                    String[] elementos8 = request.getParameterValues("tiempo");
                    if (elementos8!=null) {
                           
                        for (String idTiempoLibre : elementos8) {
                            detalleTiempoLibre =  new DetalleTiempoLibre(0,caracTDao.buscarIdCaracterizacion(String.valueOf(personaDao.buscarIdPersona(request.getParameter("numeroDocument")))),Integer.parseInt(idTiempoLibre));
                              detalleTiempoLibreDao.insertar(detalleTiempoLibre);
                        }
                        
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    request.setAttribute("respuesta", respuesta);
                    rd = request.getRequestDispatcher("index.jsp");
                    
                    
//                    producto.setCodProducto(request.getParameter("codigo"));
//                    producto.setNombre(request.getParameter("nombre"));
//                    producto.setPrecioCompra(Double.parseDouble(request.getParameter("compra")));
//                    producto.setPrecioVenta(Double.parseDouble(request.getParameter("venta")));
//                    producto.setCantidad(Integer.parseInt(request.getParameter("cantidad")));
//                    producto.setIdCa
//                    rd = request.getRequestDispatcher("productos.jsp");tegoria(Integer.parseInt(request.getParameter("categoria")));
//                    //prod.setEstado(request.getParameter("estado"));
//                    producto.setEstado("Activo");
//                    respuesta =  prodDao.insertar(producto);
//                    request.setAttribute("respuesta", respuesta);
//                    rd = request.getRequestDispatcher("productos.jsp");
                }else if(request.getParameter("btnEliminar")!=null){
//                    producto.setIdProducto(request.getParameter("cod"));
//                    prodDao.eliminar(producto);
//                    //request.setAttribute("respuesta", respuesta);
//                    rd = request.getRequestDispatcher("productos.jsp");
                }else if(request.getParameter("btnVerDetalle")!=null){
//                      producto = (Producto) prodDao.buscarPorID(request.getParameter("codigo"));
//
//                    request.setAttribute("producto", producto);
//                    rd = request.getRequestDispatcher("ver_producto.jsp");
                }else if(request.getParameter("btnModificar")!=null){
//                    producto = (Producto) prodDao.buscarPorID(request.getParameter("codigo"));
//
//                    request.setAttribute("producto", producto);
//                    rd = request.getRequestDispatcher("update_product.jsp");
                }else if(request.getParameter("btnActualizar")!=null){
//                    producto.setIdProducto(request.getParameter("idCod"));
//                    producto.setCodProducto(request.getParameter("codigo"));
//                    producto.setNombre(request.getParameter("nombre"));
//                    producto.setPrecioCompra(Double.parseDouble(request.getParameter("compra")));
//                    producto.setPrecioVenta(Double.parseDouble(request.getParameter("venta")));
//                    producto.setCantidad(Integer.parseInt(request.getParameter("cantidad")));
//                    producto.setIdCategoria(Integer.parseInt(request.getParameter("categoria")));
//                    producto.setEstado(request.getParameter("estado"));
//                    //producto.setEstado("Activo");
//                    respuesta =  prodDao.modificar(producto);
//                    request.setAttribute("respuesta", respuesta);
//                    rd = request.getRequestDispatcher("productos.jsp");
                }else if(request.getParameter("btnBuscar")!=null){
//                    int id = Integer.valueOf(request.getParameter("idBusqueda").trim());
//                    switch (id) {
//                        case 0:
//                            producto.setCodProducto(request.getParameter("valor"));
//                            break;
//                        case 1:
//                            producto.setCodProducto(request.getParameter("valor"));
//                            break;
//                        case 2:
//                            producto.setNombre(request.getParameter("valor"));
//                            break;
//                        case 3:
//                            producto.setCantidad(Integer.parseInt(request.getParameter("valor")));
//                            break;
//                        case 4:
//                            producto.setIdCategoria(Integer.parseInt(request.getParameter("valor")));
//                            break;
//                        case 5:
//                            producto.setEstado(request.getParameter("valor"));
//                            break;
//                        
//                        default:
//                            throw new AssertionError();
//                    }
//                    listProducto = (List<Producto>)prodDao.busquedaPorParametro(request.getParameter("idBusqueda"), producto);
//                    request.setAttribute("listProducto", listProducto);
//                    rd = request.getRequestDispatcher("search_products.jsp");
                }
                 
            } catch (NumberFormatException | SQLException e) {
                System.out.println("Problemas en el server: " + e.toString());
                e.printStackTrace();
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
