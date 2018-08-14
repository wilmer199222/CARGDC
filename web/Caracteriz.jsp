<%@page import="com.caracterizacion.modelo.RelacionesAfectivas"%>
<%@page import="com.caracterizacion.dao.RelacionesAfectivasDaoImpl"%>
<%@page import="com.caracterizacion.modelo.SocioAfectiva"%>
<%@page import="com.caracterizacion.dao.SocioAfectivaDaoImpl"%>
<%@page import="com.caracterizacion.modelo.Acompañante"%>
<%@page import="com.caracterizacion.dao.AcompañanteDaoImpl"%>
<%@page import="com.caracterizacion.dao.AnimalesDaoImpl"%>
<%@page import="com.caracterizacion.modelo.Animales"%>
<%@page import="com.caracterizacion.modelo.ServiciosSanitarios"%>
<%@page import="com.caracterizacion.dao.ServiciosSanitariosDaoImpl"%>
<%@page import="com.caracterizacion.modelo.ServPublicos"%>
<%@page import="com.caracterizacion.dao.ServPublicosDaoImpl"%>
<%@page import="com.caracterizacion.modelo.Paredes"%>
<%@page import="com.caracterizacion.dao.ParedesDaoImpl"%>
<%@page import="com.caracterizacion.dao.TechoDaoImpl"%>
<%@page import="com.caracterizacion.modelo.Techo"%>
<%@page import="com.caracterizacion.modelo.Pisos"%>
<%@page import="com.caracterizacion.dao.PisosDaoImpl"%>
<%@page import="com.caracterizacion.modelo.TenenciaVivienda"%>
<%@page import="com.caracterizacion.modelo.TipoVivienda"%>
<%@page import="com.caracterizacion.dao.TenenciaDaoImpl"%>
<%@page import="com.caracterizacion.dao.TipoViviendaDaoImpl"%>
<%@page import="com.caracterizacion.dao.TiempoDaoImpl"%>
<%@page import="com.caracterizacion.modelo.TiempoLibre"%>
<%@page import="com.caracterizacion.modelo.RegimenSalud"%>
<%@page import="com.caracterizacion.dao.RegimenDaoImpl"%>
<%@page import="com.caracterizacion.modelo.TipoDocumento"%>
<%@page import="com.caracterizacion.dao.DocumentoDaoImpl"%>
<%@page import="com.caracterizacion.modelo.Tipofamiliar"%>
<%@page import="com.caracterizacion.dao.TipoFamiliarDaoImpl"%>
<%@page import="com.caracterizacion.dao.TransporteDaoImpl"%>
<%@page import="com.caracterizacion.modelo.TipoTransporte"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Fundacion</title>
<META NAME="ROBOTS" CONTENT="NOINDEX, NOFOLLOW">
<script src="js/jquery-3.2.1.js" type="text/javascript"></script>   
<link href="css/font-awesome.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="css/animate.css" rel="stylesheet" type="text/css" />
<link href="css/admin.css" rel="stylesheet" type="text/css" />
<link href="plugins/toggle-switch/toggles.css" rel="stylesheet" type="text/css" />
<link href="plugins/checkbox/icheck.css" rel="stylesheet" type="text/css" />
<link href="plugins/checkbox/minimal/blue.css" rel="stylesheet" type="text/css" />
<link href="plugins/checkbox/minimal/green.css" rel="stylesheet" type="text/css" />
<link href="plugins/checkbox/minimal/grey.css" rel="stylesheet" type="text/css" />
<link href="plugins/checkbox/minimal/orange.css" rel="stylesheet" type="text/css" />
<link href="plugins/checkbox/minimal/pink.css" rel="stylesheet" type="text/css" />
<link href="plugins/checkbox/minimal/purple.css" rel="stylesheet" type="text/css" />
<link href="plugins/bootstrap-fileupload/bootstrap-fileupload.min.css" rel="stylesheet">
<link href="plugins/dropzone/dropzone.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="plugins/bootstrap-datepicker/css/datepicker.css" />
<link rel="stylesheet" type="text/css" href="plugins/bootstrap-timepicker/compiled/timepicker.css" />
<link rel="stylesheet" type="text/css" href="plugins/bootstrap-colorpicker/css/colorpicker.css" />
<link href="plugins/data-tables/DT_bootstrap.css" rel="stylesheet">
<link href="plugins/advanced-datatable/css/demo_table.css" rel="stylesheet">
<link href="plugins/advanced-datatable/css/demo_page.css" rel="stylesheet">

<script>
          jQuery(document).ready(function() {
              EditableTable.init();
          });
    
 </script>

</head>
    
     <%
      TransporteDaoImpl dao = new TransporteDaoImpl();
      List<TipoTransporte> listTipoTransportes = new ArrayList();
       listTipoTransportes = dao.listar();
       
       TipoFamiliarDaoImpl daoimpl = new TipoFamiliarDaoImpl();
       List<Tipofamiliar> listTipofamiliar = new ArrayList();
       
       TiempoDaoImpl  daoImpl4 = new TiempoDaoImpl();
       List<TiempoLibre> listTiempoLibre = new ArrayList();
      
       
       DocumentoDaoImpl daoimpl2 = new DocumentoDaoImpl();
       List<TipoDocumento> listTipoDocumentos = new ArrayList();
       listTipoDocumentos = daoimpl2.listar();
       
       RegimenDaoImpl daoimpl3 = new RegimenDaoImpl();
       List<RegimenSalud> listRegimenSaluds = new ArrayList();
       listRegimenSaluds = daoimpl3.listar();
       
       TipoViviendaDaoImpl daoimpl5 = new TipoViviendaDaoImpl();
       List<TipoVivienda> listTipoViviendas = new ArrayList();
       listTipoViviendas = daoimpl5.listar();
       
       
       TenenciaDaoImpl daoimpl6 = new TenenciaDaoImpl();
       List<TenenciaVivienda> listTenenciaVivienda = new ArrayList();
       listTenenciaVivienda = daoimpl6.listar();
       
       PisosDaoImpl  daoimpl7 = new PisosDaoImpl();
       List<Pisos>  listPisos = new ArrayList();
       listPisos = daoimpl7.listar();
       
       TechoDaoImpl daoimpl8 = new TechoDaoImpl();
       List<Techo> listTecho = new ArrayList();
       listTecho = daoimpl8.listar();

       ParedesDaoImpl daoimpl9 = new ParedesDaoImpl();
       List<Paredes> listParedes = new ArrayList();
       listParedes = daoimpl9.listar();
      
       ServPublicosDaoImpl daoimpl10 = new ServPublicosDaoImpl();
       List<ServPublicos> listServPublicos = new ArrayList();
       listServPublicos = daoimpl10.listar();
       
       ServiciosSanitariosDaoImpl daoimpl11 = new ServiciosSanitariosDaoImpl();
       List<ServiciosSanitarios> listServiciosSanitarios = new ArrayList();
       listServiciosSanitarios  = daoimpl11.listar();
       
       AnimalesDaoImpl daoimpl12 = new AnimalesDaoImpl();
       List<Animales> listAnimales = new ArrayList();
       
        AcompañanteDaoImpl daoimpl13 = new AcompañanteDaoImpl();
        List<Acompañante> listAcompañante = new ArrayList();
        listAcompañante = daoimpl13.listar();

        SocioAfectivaDaoImpl daoimpl14 = new SocioAfectivaDaoImpl();
        List<SocioAfectiva> listSocioAfectiva = new ArrayList();
        listSocioAfectiva = daoimpl14.listar();

        RelacionesAfectivasDaoImpl daoimpl15 = new RelacionesAfectivasDaoImpl();        
        List<RelacionesAfectivas> listRelacionesAfectivas = new ArrayList();
        listRelacionesAfectivas = daoimpl15.listar();

   %>
   
   <%
                TipoTransporte trans = (TipoTransporte) request.getAttribute("TipoTransporte");
                Tipofamiliar  tipoFam = (Tipofamiliar) request.getAttribute("Tipofamiliar");
                TipoDocumento tipoDoc = (TipoDocumento) request.getAttribute("TipoDocumento");
                RegimenSalud  RegimenSal = (RegimenSalud) request.getAttribute("RegimenSalud");
                TipoVivienda tipoViv = (TipoVivienda) request.getAttribute("TipoVivienda");
                TenenciaVivienda tenenciaViv = (TenenciaVivienda) request.getAttribute("TenenciaViviendo");
                Pisos pisos = (Pisos) request.getAttribute("Pisos");
                Techo techo = (Techo) request.getAttribute("Techo");
                Paredes paredes = (Paredes) request.getAttribute("Paredes");
                ServPublicos servPublicos = (ServPublicos) request.getAttribute("ServPublicos");
                ServiciosSanitarios servicioSanitarios = (ServiciosSanitarios) request.getAttribute("ServiciosSanitarios");
                Animales animales = (Animales) request.getAttribute("Animales");
                Acompañante acompañante = (Acompañante) request.getAttribute("Acompañante");
                SocioAfectiva socioAfectiva = (SocioAfectiva) request.getAttribute("SocioAfectiva");
                RelacionesAfectivas relacionesAfectivas = (RelacionesAfectivas) request.getAttribute("RelacionesAfectivas");
                
                //String id = String.valueOf(prod.getIdCategoria());
                //String valor = String.valueOf(trans.getIdTipoTransporte());
                %>
   
    <body style="background-color: #f1f1f1;">

      <div class="pull-left breadcrumb_admin clear_both">
        
  
      </div>
 <div class="col-md-12"></div>
          <div class="block-web">
            <div class="header">
              <h3 class="center"  >CARACTERIZACION</h3>
            </div>
            <div class="porlets-content">
              <div class="basic-wizard" id="progressWizard">
                <ul class="nav nav-pills nav-justified">
                  <li class="active"><a data-toggle="tab" href="#ptab1"><span>1.  </span> Información</a></li>
                  <li><a data-toggle="tab" href="#ptab2"><span>2. </span> Aspectos De Vivivenda</a></li>
                  <li><a data-toggle="tab" href="#ptab3"><span>3. </span> Aspectos Del Niño</a></li>
                </ul>
              <form action="caracterizacionSvl">
                  <div class="tab-content">   
                  <div id="ptab1" class="tab-pane active">
                      <form action="">
                    <div class="row">
        <div class="col-md-6">
          <div class="block-web">
            <div class="header">
              <h4 class="center">INFORMACION DEL ACUDIENTE</h4>
            </div>
              <br>
            <div class="porlets-content">
              
                <div class="form-group">
                  <label>Nombre Del Acudiente</label>
                  <input type="text" name="nombre" parsley-trigger="change"  placeholder="Ingrese Nombre" class="form-control">
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label>Apellido Del Acudiente</label>
                  <input type="text" name="apellido" parsley-trigger="change"  placeholder="Ingrese apellido" class="form-control">
                </div><!--/form-group-->
                
                <div class="form-group">
                    <label>Sexo</label>
                    <br>
                    <select name="sexo">
                        <option>--Seleccione--</option>
                        <option>Masculino</option>
                        <option>Femenino</option>
                    </select>
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label>Edad</label>
                  <input type="number" name="edad"  min="18" max="120" placeholder="Ingrese edad" class="form-control" pattern="\d+">
                </div><!--/form-group-->
                
                <div class="form-group">
                    <label>Tipo Identificación</label>
                    <br>
                    <select name="tipoIdentidad">
                        <option>--Seleccione--</option>
                        <option>Cedula</option>
                        <option>T. Identidad</option>
                        <option>Pasaporte</option>
                    </select>
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label>Numero De Documento</label>
                  <input type="number" name="numeroDoc"  placeholder="Ingrese numero de cedula" class="form-control">
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label>Ciudad</label>
                  <input type="text" name="ciudad" parsley-trigger="change"  placeholder="Ingrese ciudad" class="form-control">
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label>Municipio</label>
                  <input type="text" name="municipio" parsley-trigger="change" placeholder="Ingrese municipio" class="form-control">
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label>Dirección de la vivienda</label>
                  <input type="text" name="direccion" parsley-trigger="change"  placeholder="Ingrese dirección" class="form-control">
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label>Telefono(Celular)</label>
                  <input parsley-type="phone" name="telefono" type="tel" class="form-control parsley-validated"  placeholder="(000)0000 000">
                </div><!--/form-group--> 
            
            </div><!--/porlets-content-->
          </div><!--/block-web--> 
        </div><!--/col-md-6-->
        
        <div class="col-md-6">
          <div class="block-web">
            <div class="header">
              <h4 class="center">INFORMACION DEL ENCUESTADOR</h4>
            </div>
              <br>
            <div class="porlets-content">
                <div class="form">
                <div class="form-group">
                  <label class="col-sm-4 control-label">Fecha</label>
                  <div class="col-sm-6">
                      <input type="date" name="fecha1" class="form-control parsley-validated"  placeholder="DD-MM-AAAA">
                  </div>
                </div><!--/form-group--> 
                <div class="form-group">
                  <label class="col-sm-4 control-label">Nombre</label>
                  <div class="col-sm-6">
                      <input type="text" name="nombre2" parsley-type="text"  class="form-control"  placeholder="Nombre">
                  </div>
                </div><!--/form-group-->   
                  <div class="form-group">
                  <label class="col-sm-4 control-label">Telefono(Celular)</label>
                  <div class="col-sm-6">
                      <input  name="telefono" type="tel" class="form-control parsley-validated"  placeholder="(XXX)XXXX XXX">
                  </div>
                </div><!--/form-group--> 
             
                <div class="form-group">
                  <div class="col-sm-offset-3 col-sm-7">
                    <div class="checkbox">                    
                    </div>
                  </div>
                </div><!--/form-group--> 
                </div>
            </div><!--/porlets-content-->
          </div><!--/block-web--> 
        </div><!--/col-md-6--> 
      </div>
                      
                      <div class="col-md-12">
                      <div class="form">
                          <hr>
                              <div class="header">
                                <h4 class="center">INFORMACION GENERAL DEL NIÑO</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
              
                <div class="form-group">
                  <label class="col-sm-4 control-label">Nombre</label>
                  <div class="col-sm-8">
                      <input type="text" name="nombre3" parsley-trigger="change"  placeholder="Ingrese Nombre" class="form-control" maxlength="100">
                  </div>
                </div><!--/form-group--> 
                <div class="form-group">
                  <label class="col-sm-5">Sexo</label>
                  <br>
                      <select  name="sexo2">
                          
                        <option>--Seleccione--</option>
                        <option>Masculino</option>
                        <option>Femenino</option>
                    </select>
                      
                </div><!--/form-group--> 
                <div class="form-group">
                  <label class="col-sm-4 control-label">Fecha de nacimiento</label>
                  <div class="col-sm-8">
                      <input type="date" name="fecha2" class="form-control parsley-validated"  parsley-maxlength="6" placeholder="fecha nacimiento">
                  </div>
                </div><!--/form-group--> 
                
                <div class="form-group">
                  <label class="col-sm-4 control-label">Edad</label>
                  <div class="col-sm-8">
                      <input type="number" name="edad2" class="form-control parsley-validated"  parsley-maxlength="6" placeholder="edad" min="5" max="15">
                  </div>
                </div><!--/form-group-->  
                
                <div class="form-group">
                  <label class="col-sm-4  control-label">Documento de Identidad</label>
                      <select class="col-sm-4" name="docIdentidad">
                          <option>Seleccione</option>
                                                <%
       
                             for(TipoDocumento tipoDocumento : listTipoDocumentos){
                                 %><option value="<%= tipoDocumento.getIdTipoDocumento()%>"><%= tipoDocumento.getNombre()%></option><%
                             }
                           
                           %>

                      </select>
                  
                  <div class="col-sm-4">
                      <input type="number" name="numeroDocument" class="form-control parsley-validated"  placeholder="numero">
                  </div>
                </div><!--/form-group--> 
                <hr>
            <div class="form-group">
                </div><!--/form-group-->
                
              
            </div>
             </div><!--/porlets-content-->         
               </div>                 
            </div>
                      
                       <div class="col-md-12">
                           <div class="form">     
                          <hr>
                              <div class="header">
                                <h4 class="center">SALUD DEL NIÑO</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
             
                
                <div class="form-group">
                  <label class="col-sm-4  control-label">Regimen De Salud:</label>
                  
                      <select class="col-sm-4" name="regSalud">
                          <option>Seleccione</option>
                            <%
       
                             for(RegimenSalud regimenSalud : listRegimenSaluds){
                                 %><option value="<%= regimenSalud.getIdregimenSalud()%>"><%= regimenSalud.getNombre()%></option><%
                             }
                           
                           %>
                      </select>
                 <label class="col-sm-1 control-label">Cual:</label>
                  <div class="col-sm-3">
                      <input type="text" name="cualRegimen" class="form-control parsley-validated"  placeholder="ingrese">
                  </div>
                </div><!--/form-group--> 
                
                <div class="form-group">
                  <label class="col-sm-4 control-label">Estatura del niño:</label>
                  <div class="col-sm-3">
                    <input type="text" name="estatura" class="form-control parsley-validated"  placeholder="ingrese estatura">
                  </div>
                  <label class="col-sm-1 control-label">Peso:</label>
                  <div class="col-sm-4">
                    <input type="text" name="peso" class="form-control parsley-validated"   placeholder="ingrese peso">
                  </div>
                </div><!--/form-group--> 
                
                <div class="form-group">
                  <label class="col-sm-4 control-label">Padece Enfermedad:</label>
                  <div class="col-sm-3">
                    <div class="radio-inline">
                            <input type="radio" name="padeceEnf" value="si" id="male2">
                            <label for="si">Si</label>
                          </div>
                          <div class="radio-inline">
                            <input type="radio" name="padeceEnf" id="female2" value="no">
                            <label for="no">No</label>
                          </div>
                  </div>
                  <label class="col-sm-1 control-label">Cual:</label>
                  <div class="col-sm-4">
                    <input type="text" name="cualEnferm" class="form-control parsley-validated"   placeholder="ingrese cual">
                  </div>
                </div><!--/form-group--> 
                
                <div class="form-group">
                  <label class="col-sm-4 control-label">Padece Discapacidad:</label>
                  <div class="col-sm-3">
                    <div class="radio-inline">
                            <input type="radio" name="padeceDis" value="si2" id="si2">
                            <label for="si1">Si</label>
                          </div>
                          <div class="radio-inline">
                            <input type="radio" name="padeceDis" id="no2" value="no2">
                            <label for="no2">No</label>
                          </div>
                  </div>
                  <label class="col-sm-1 control-label">Cual:</label>
                  <div class="col-sm-4">
                    <input type="text" name="cualDiscapac" class="form-control parsley-validated"   placeholder="ingrese cual">
                  </div>
                </div><!--/form-group--> 
                
                <div class="form-group">
                  <label class="col-sm-4 control-label">Presenta alergia:</label>
                  <div class="col-sm-3">
                    <div class="radio-inline">
                            <input type="radio" name="presenta" value="si3" id="si3">
                            <label for="si3">Si</label>
                          </div>
                          <div class="radio-inline">
                            <input type="radio" name="presenta" id="no3" value="no3">
                            <label for="no3">No</label>
                          </div>
                  </div>
                  <label class="col-sm-1 control-label">Cual:</label>
                  <div class="col-sm-4">
                    <input type="text" name="cualAlergia" class="form-control parsley-validated"   placeholder="ingrese cual">
                  </div>
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label class="col-sm-4 control-label">Toma algun medicamento:</label>
                  <div class="col-sm-3">
                    <div class="radio-inline">
                            <input type="radio" name="toma" value="si4" id="si4">
                            <label for="si4">Si</label>
                          </div>
                          <div class="radio-inline">
                            <input type="radio" name="toma" id="no4" value="no4">
                            <label for="no4">No</label>
                          </div>
                  </div>
                  <label class="col-sm-1 control-label">Cual:</label>
                  <div class="col-sm-4">
                    <input type="text" name="cualMedicamen" class="form-control parsley-validated"   placeholder="ingrese cual">
                  </div>
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label class="col-sm-4 control-label">Asistencia al medico:</label>
                  <div class="col-sm-8">
                    <div class="radio-inline">
                            <input type="radio" name="asistencia" value="siempre" id="siempre">
                            <label for="siempre">Siempre</label>
                          </div>
                          <div class="radio-inline">
                            <input type="radio" name="asistencia" id="casi" value="casi">
                            <label for="casi">Casi Siempre</label>
                          </div>
                      <div class="radio-inline">
                            <input type="radio" name="asistencia" id="nunca" value="nunca">
                            <label for="nunca">Nunca</label>
                          </div>
                  </div>
                </div><!--/form-group-->
                
                <hr>

              
            </div>
             </div><!--/porlets-content-->         
             </div>                  
            </div>
                      
            <div class="col-md-12">
                      
                          <hr>
                              <div class="header">
                                <h4 class="center">NUCLEO FAMILIAR DEL NIÑO</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
              
            
                <div class="form-group">
                  <label class="col-sm-4 control-label">Tipo de familia:</label>
                  <div class="col-sm-8">
                      <%
                           listTipofamiliar = daoimpl.listar();
                           for(Tipofamiliar tp : listTipofamiliar){
                               
                          
                          %>
                      <div class="radio-inline">
                            <input type="radio" name="tipo" value="<%= tp.getIdTipoFamiliar()%>" id="mono">
                                <label for="mono"><%= tp.getNombre() %></label>
                          </div>
                      
                          <%
                               }
                              %>
                          
                  </div>
                </div><!--/form-group--> 
                <hr>
                    
                <div class="form-group">
                  <label class="col-sm-4 control-label">Tiempo libre familiar:</label>
                  <div class="col-sm-8">
                    <%
                           listTiempoLibre = daoImpl4.listar();
                           for(TiempoLibre tL : listTiempoLibre){
                               
                          
                          %>
                      <div class="radio-inline">
                 
                          <input type="checkbox" name="tiempo" value="<%= tL.getIdTiempoLibre()%>" id="verTv">
                                <label for="verTv"><%= tL.getNombre()%></label>
                          </div>
                      
                          <%
                               }
                              %>
                  </div>
                </div><!--/form-group--> 
                
                <hr>
                <div class="form-group">
                  <label class="col-sm-4 control-label">Armonia familiar:</label>
                  <div class="col-sm-8">
                    <div class="radio-inline">
                            <input type="radio" name="armonia" value="mala" id="mala">
                            <label for="mala">Mala</label>
                          </div>
                          <div class="radio-inline">
                            <input type="radio" name="armonia" id="regular" value="regular">
                            <label for="regular">Regular</label>
                          </div>
                      <div class="radio-inline">
                            <input type="radio" name="armonia" value="buena" id="buena">
                            <label for="buena">Buena</label>
                          </div>
                      <div class="radio-inline">
                            <input type="radio" name="armonia" value="excelente" id="excelente">
                            <label for="excelente">Excelente</label>
                          </div>
                  </div>
                </div><!--/form-group--> 
                

            </div>
             </div><!--/porlets-content-->         
                               
            </div>     
                  </form>
                  </div> <!--/aqui termina el tab1-->
                      
                    
                  <div id="ptab2" class="tab-pane">
                      
                      <div class="col-md-12">
                      <div class="form">
                          <hr>
                              <div class="header">
                                <h4 class="center">ASPECTOS DE LA VIVIENDA</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
                <div class="row">
                <div class="col-xs-6 col-sm-3">
                    <div class="form-horizontal bucket-form">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">TIPO: </label>

                        <div class="col-sm-9 icheck ">
                       <%
                           listTipoViviendas = daoimpl5.listar();
                           for(TipoVivienda tipoVivienda : listTipoViviendas){
                               
                          
                          %>
                            
                            <div class="square-red single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio" value="<%= tipoVivienda.getIdTipo()%>" name="tipo" >
                                        <label for="casa"><%= tipoVivienda.getNombre()%></label>
                                </div>
                            </div>
                          <%
                               }
                              %>

                        </div>
                    </div>
                </div>
                    
                </div> <!-- aqui termina la primera columna-->
                  
        <div class="col-xs-6 col-sm-2">
            
            <div class="form-horizontal bucket-form" method="get">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">TENENCIA: </label>

                        <div class="col-sm-9 icheck ">
                            
                          <%
                           listTenenciaVivienda = daoimpl6.listar();
                           for(TenenciaVivienda tenenciaVivienda : listTenenciaVivienda){
                               
                          
                          %>

                            <div class="square single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio" value="<%= tenenciaVivienda.getIdTenencia()%>" name="tenencia" >
                                        <label for="propia"><%= tenenciaVivienda.getNombre()%></label>
                                </div>
                            </div>
                          <%
                               }
                              %>
                          
                        </div>
                    </div>
                </div>
                    
            
        </div><!-- aqui termina la segunda columna-->

                

        <div class="col-xs-6 col-sm-2">
            
            <div class="form-horizontal bucket-form" method="get">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">PISOS: </label>

                        <div class="col-sm-9 icheck ">

                            <%
                           listPisos = daoimpl7.listar();
                           for(Pisos piso : listPisos){
                               
                          
                          %>

                            <div class="square single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="checkbox" value="<%= piso.getIdPiso()%>" name="pisos" >
                                        <label for="cemento"><%= piso.getNombre()%></label>
                                </div>
                            </div>
                          <%
                               }
                              %>
                        </div>
                    </div>
                </div>
                    
            
        </div>
        
        <div class="col-xs-6 col-sm-3">
            
            <div class="form-horizontal bucket-form" method="get">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">TECHOS: </label>

                        <div class="col-sm-9 icheck ">
                            
                      <%
                           listTecho = daoimpl8.listar();
                           for(Techo techos : listTecho){
                               
                          
                          %>

                            <div class="square-red single-row">
                                <div class="checkbox ">
                                    <input type="radio" value="<%= techos.getIdTecho()%>" name="techos">
                                    <label for="zinc"><%= techos.getNombre()%></label>
                                </div>
                            </div>
                            
                                 <%
                               }
                              %>
                        </div>
                    </div>
                </div>
                    
            
        </div>
                  
        <div class="col-xs-6 col-sm-2">
            
            <div class="form-horizontal bucket-form" method="get">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">PAREDES:</label>

                        <div class="col-sm-9 icheck ">
                             <%
                           listParedes = daoimpl9.listar();
                           for(Paredes pared : listParedes){
                               
                          
                          %>                       
                            <div class="minimal-yellow single-row">
                                <div class="checkbox ">
                                    <input type="checkbox" value="<%= pared.getIdParedes()%>" name="paredes">
                                    <label for="pañete"><%= pared.getNombre()%></label>
                                </div>
                            </div>

                            <%
                               }
                              %>
                        </div>
                    </div>
                </div>
                    
            
        </div>
                  </div><!--Aqui termina EL ROW -->
            </div>
             </div><!--/porlets-content-->         
               </div>                 
            </div> 
                      
                
                  <hr>
                 <div class="block-web">
            <div class="header">
              <h6 class="center">SERVICIOS PUBLICOS CON LOS QUE CUENTAN LA VIVIENDA</h6>
            </div> 
                  <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
              <div class="form-horizontal group-border-dashed" action="#" parsley-validate="" novalidate="">
                  <hr>
                <div class="form-group">
                    
                  <label class="col-sm-3 control-label">Servicios: </label>
                  <div class="col-sm-9">
                      
                     <%
                           listServPublicos = daoimpl10.listar();
                           for(ServPublicos servPublico : listServPublicos){
                               
                          
                          %>    
                      
                      <label for="agua"><%= servPublico.getNombre()%>
                      <input type="checkbox" id="inlinecheckbox1" value="<%= servPublico.getIdServiciosPublicos()%>" name="servPublicos">
                       </label>
                          
                     <%
                               }
                              %>     
                  </div>
                </div><!--/form-group--> 
                <hr>
              </div>
            </div>
             </div><!--/porlets-content--> 
                 </div>    
                      
                  <div class="block-web">
            <div class="header">
              <h6 class="center">SERVICIOS SANITARIOS</h6>
            </div> 
                  <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
              <div class="form-horizontal group-border-dashed"  parsley-validate="" novalidate="">
                  <hr>
                <div class="form-group">
                  <label class="col-sm-3 control-label">Servicios: </label>
                  <div class="col-sm-9">
                      
                       <%
                           listServiciosSanitarios = daoimpl11.listar();
                           for(ServiciosSanitarios serviciosSanitarios : listServiciosSanitarios){
                               
                          
                          %>  
                      
                    <label for="notiene"><%= serviciosSanitarios.getNombre()%>
                        <input type="radio" id="inlinecheckbox1" value="<%= serviciosSanitarios.getIdServiciosSanitario()%>" name="servSanitarios">
                       </label>
                    
                        <%
                               }
                              %>      
                          
                  </div>
                </div><!--/form-group--> 
                <hr>
                       

              </div>
            </div>
             </div><!--/porlets-content--> 
                 </div>      
                      
                       <div class="block-web">
            <div class="header">
              <h6 class="center">DEPENDENCIA DE LA CASA</h6>
            </div> 
                  <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
              <div class="form-horizontal group-border-dashed" action="#" parsley-validate="" novalidate="">
                  <hr>
                <div class="form-group">
                  <label class="col-sm-3 control-label"># De Dormitorios: </label>
                  <div class="col-sm-9">
                    <div class="col-sm-5">
                          <input type="text" class="form-control" name="dormitorios">
                        </div>
                  </div>
                </div><!--/form-group--> 
                 <div class="form-group">
                  <label class="col-sm-3 control-label"># De Baños: </label>
                  <div class="col-sm-9">
                    <div class="col-sm-5">
                          <input type="text" class="form-control" name="banos">
                        </div>
                  </div>
                </div><!--/form-group--> 
                <div class="form-group">
                  <label class="col-sm-3 control-label">Cocina: </label>
                  <div class="col-sm-9">
                    <label class="checkbox-inline">
                        <input type="radio" id="inlinecheckbox1" value="1" name="cocina">
                       Si Tiene</label>
                    <label class="checkbox-inline">
                        <input type="radio" id="inlinecheckbox2" value="2" name="cocina">
                      No Tiene</label>
                  </div>
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label class="col-sm-3 control-label">Sala: </label>
                  <div class="col-sm-9">
                    <label class="checkbox-inline">
                        <input type="radio" id="inlinecheckbox1" value="1" name="sala">
                       Si Tiene</label>
                    <label class="checkbox-inline">
                        <input type="radio" id="inlinecheckbox2" value="2" name="sala">
                      No Tiene</label>
                  </div>
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label class="col-sm-3 control-label">Comedor: </label>
                  <div class="col-sm-9">
                    <label class="checkbox-inline">
                        <input type="radio" id="inlinecheckbox1" value="1" name="comedor">
                       Si Tiene</label>
                    <label class="checkbox-inline">
                        <input type="radio" id="inlinecheckbox2" value="2" name="comedor">
                      No Tiene</label>
                  </div>
                </div><!--/form-group-->

              </div>
            </div>
             </div><!--/porlets-content--> 
                 </div>  
                      
                   <div class="col-md-12">
                      <div class="form">
                          <hr>
                              <div class="header">
                                <h4 class="center">TIPO DE ANIMALES TIENE EN SU VIVIENDA</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
              <div class="form-horizontal group-border-dashed" action="#" parsley-validate="" novalidate="">
                <div class="form-group">
                  <label class="col-sm-2 control-label">Animales:</label>
                  <div class="col-sm-5">
                    <%
                           listAnimales = daoimpl12.listar();
                           for(Animales animal : listAnimales){
                               
                          
                          %>    
                      
                      <label for="perro"><%= animal.getNombre()%>
                      <input type="checkbox" id="inlinecheckbox1" value="<%= animal.getIdAnimal()%>" name="animales">
                       </label>
                          
                     <%
                               }
                              %> 
                  </div>
                  <label class="col-sm-1 control-label">Cual:</label>
                  <div class="col-sm-3">
                    <input type="text" name="cualAnimal" class="form-control parsley-validated"   placeholder="Ingrese cual">
                  </div>
                </div><!--/form-group--> 
                <hr>
              </div>
            </div>
             </div><!--/porlets-content-->         
               </div>                 
            </div>     
                      
                  </div>   <!--Aqui termina el tab2-->
              
                   
                  <div id="ptab3" class="tab-pane">
                    <div class="form">
                      <div class="col-md-12">
                      <div class="form">
                          <hr>
                              <div class="header">
                                <h4 class="center">ASPECTOS EVALUATIVOS DEL NIÑO</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
                
              
              <div class="form-horizontal group-border-dashed"  parsley-validate="" novalidate="">
                <div class="form-group">
                  <label class="col-sm-2 control-label">Desplazamiento del niño:</label>
                  <select class="col-sm-4" name="desplazamiento">
                      <option>Seleccione</option>
                      <%
                               //
                               
                             for(TipoTransporte tipoTrans : listTipoTransportes){
                                 %><option value="<%=tipoTrans.getIdTipoTransporte()%>"><%= tipoTrans.getNombre()%></option><%
                             }
                           
                           %>
                      
                      
                      <!--<option>Seleccione</option>
                      <option>Ruta</option>
                      <option>Bus</option>
                      <option>Bicicleta</option>
                      <option>Caminando</option>
                      <option>Otro</option>-->
                  </select>
                  
                  <label class="col-sm-1 control-label">Cual:</label>
                  <div class="col-sm-5">
                    <input type="text" name="cual6" class="form-control parsley-validated"   placeholder="ingrese cual">
                  </div>
                </div><!--/form-group--> 
                <hr>
                   <div class="form-group">
                  <label class="col-sm-2 control-label">Quien lo lleva  a la escuela:</label>
                  <select class="col-sm-4" name="escuela">
                      <option>Seleccione</option>
                     <%
                               //
                               
                             for(Acompañante acompaña : listAcompañante){
                                 %><option value="<%= acompaña.getIdAcompañante()%>"><%= acompaña.getNombre()%></option><%
                             }
                           
                           %>                           
                      
                      <!--<option>Papa</option>
                      <option>Mama</option>
                      <option>Hermanos</option>
                      <option>Tio(a)</option>
                      <option>Abuelo(a)</option>
                      <option>Otro</option>-->
                      
                  </select>
                  
                  <label class="col-sm-1 control-label">Cual:</label>
                  <div class="col-sm-5">
                    <input type="text" name="cualAcompaña" class="form-control parsley-validated"   placeholder="ingrese cual">
                  </div>
                </div><!--/form-group--> 
                <hr>
                    
                <div class="form-group">
                  <label class="col-sm-2 control-label">El niño comparte la habitación:</label>
                  <div class="col-sm-4">
                    <div class="radio-inline">
                            <input type="radio" name="comparteHabitacion" value="si" id="male2">
                            <label for="si">Si</label>
                          </div>
                          <div class="radio-inline">
                            <input type="radio" name="comparteHabitacion" id="female2" value="no">
                            <label for="no">No</label>
                          </div>
                  </div>
                  <label class="col-sm-2 control-label">Con Quien:</label>
                  <div class="col-sm-4">
                    <input type="text" name="conquien" class="form-control parsley-validated"   placeholder="ingrese con quien">
                  </div>
                </div><!--/form-group-->
                <hr>
                
                <div class="form-group">
                  <label class="col-sm-4 control-label">Desde cuando asiste niño al E.I.F.D:</label>
                  <div class="col-sm-6">
                      <input type="date" name="asiste" class="form-control parsley-validated" placeholder="ingrese fecha">
                  </div>
                  <label class="col-sm-4 control-label">Que deporte le gusta al niño:</label>
                  <div class="col-sm-6">
                    <input type="text" name="deporte" class="form-control parsley-validated"   placeholder="ingrese deporte">
                  </div>
                </div><!--/form-group-->
                <hr>
                
                <div class="col-md-12">
                      <div class="form">
                          <hr>
                              <div class="header">
                                <h4 class="center">INDICADOR SOCIO AFECTIVO</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-11">
              <div class="form-horizontal group-border-dashed" parsley-validate="" novalidate="">
                 <div class="form-group">
                  <label class="col-sm-4 control-label">Usted considera a su hijo: </label>
                  <div class="col-sm-8">
                    <%
                           listSocioAfectiva = daoimpl14.listar();
                           for(SocioAfectiva socio : listSocioAfectiva){
                               
                          
                          %>    
                      
                      <label for="timido"><%= socio.getNombre()%>
                      <input type="checkbox" id="inlinecheckbox1" value="<%= socio.getIdSocioAfectiva()%>" name="socioAfectiva">
                       </label>
                          
                     <%
                               }
                              %> 
                  </div>
                </div><!--/form-group--> 
            </div>
             </div><!--/porlets-content-->         
               </div>    
                </div>
            </div> 
                     
                    
                <div class="col-md-12">
                      <div class="form">
                          <hr>
                              <div class="header">
                                <h4 class="center">RELACIONES AFECTIVAS DEL NIÑO CON SUS COMPAÑEROS</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
              <div class="form-horizontal group-border-dashed"  parsley-validate="" novalidate="">
                 <div class="form-group">
                  <label class="col-sm-4 control-label">Relaciones afectivas:</label>
                  <div class="col-sm-8">
                     <%
                           listRelacionesAfectivas = daoimpl15.listar();
                           for(RelacionesAfectivas relacion : listRelacionesAfectivas){
                               
                          
                          %>    
                      
                      <label for="tolerante"><%= relacion.getNombre()%>
                      <input type="checkbox" id="inlinecheckbox1" value="<%= relacion.getIdRelacionesAfectivas()%>" name="relacionAfec">
                       </label>
                          
                     <%
                               }
                              %> 
                  </div>
                </div><!--/form-group-->
              </div>
                <hr> 
                 
                <div class="form">
                <div action="#" class="form-horizontal">
                  <div class="form-group">
                    <label class="col-sm-2 col-sm-2">Observaciones</label>
                    <div class="col-sm-10">
                      <textarea class="form-control ckeditor" name="editor" rows="6"></textarea>
                    </div>
                  </div>
                </div>
               
                     <div>
                   <div class="col-sm-offset-2 col-sm-10">
                      <button type="submit" name="btnRegistrar1" class="btn btn-primary" value="Registrar">Registrar</button>
                    <button class="btn btn-default">Cancelar</button>
                  </div>
                    </div>   
                    
            </div>
             </div><!--/porlets-content-->         
               </div>                 
            </div> 
                  
                <hr>   
               
              </div>
            </div>
             </div><!--/porlets-content-->         
               </div>                 
            </div>     
                    </div>
                  </div>
                  </div> 
                           
                      
                           
                  
                </div><!-- /tab-content -->
                </form>
                     
                
                <ul class="pager wizard">
                  <li class="previous enabled"><a href="javascript:void(0)">Previous</a></li>
                  <li class="next"><a href="javascript:void(0)">Next</a></li>
                </ul>
              </div><!--/progressWizard-->
              
              
                 
              
                
            </div><!--/porlets-content--> 
            
          </div><!--/block-web--> 
       
      




          
          
    
 
<script src="js/jquery-2.1.0.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/common-script.js"></script>
<script src="js/jquery.slimscroll.min.js"></script>
<script src="js/jquery.sparkline.js"></script>
<script src="js/sparkline-chart.js"></script>
<script src="js/graph.js"></script>
<script src="js/edit-graph.js"></script>
<script src="plugins/kalendar/kalendar.js" type="text/javascript"></script>
<script src="plugins/kalendar/edit-kalendar.js" type="text/javascript"></script>

<script src="plugins/sparkline/jquery.sparkline.js" type="text/javascript"></script>
<script src="plugins/sparkline/jquery.customSelect.min.js" ></script> 
<script src="plugins/sparkline/sparkline-chart.js"></script> 
<script src="plugins/sparkline/easy-pie-chart.js"></script>
<script src="plugins/morris/morris.min.js" type="text/javascript"></script> 
<script src="plugins/morris/raphael-min.js" type="text/javascript"></script>  
<script src="plugins/morris/morris-script.js"></script> 


<script src="plugins/demo-slider/demo-slider.js"></script>
<script src="plugins/knob/jquery.knob.min.js"></script> 

<script src="js/jPushMenu.js"></script> 
<script src="js/side-chats.js"></script>
<script src="js/jquery.slimscroll.min.js"></script>
<script src="plugins/scroll/jquery.nanoscroller.js"></script>






</body>
</html>
