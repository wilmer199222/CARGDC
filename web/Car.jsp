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
                <div class="tab-content"> 
                  <div id="ptab1" class="tab-pane active">
                    <div class="row">
        <div class="col-md-6">
          <div class="block-web">
            <div class="header">
              <h4 class="center">INFORMACION DEL ACUDIENTE</h4>
            </div>
              <br>
            <div class="porlets-content">
              <form action="#" parsley-validate novalidate>
                <div class="form-group">
                  <label>Nombre Del Acudiente</label>
                  <input type="text" name="nombre" parsley-trigger="change" required placeholder="Ingrese Nombre" class="form-control">
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label>Apellido Del Acudiente</label>
                  <input type="text" name="apellido" parsley-trigger="change" required placeholder="Ingrese apellido" class="form-control">
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
                  <input type="number" name="edad" required placeholder="Ingrese edad" class="form-control">
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
                  <label>Numero De Cedula</label>
                  <input type="number" name="numeroCed" required placeholder="Ingrese numero de cedula" class="form-control">
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label>Ciudad</label>
                  <input type="text" name="ciudad" parsley-trigger="change" required placeholder="Ingrese ciudad" class="form-control">
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label>Municipio</label>
                  <input type="text" name="municipio" parsley-trigger="change" required placeholder="Ingrese municipio" class="form-control">
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label>Dirección de la vivienda</label>
                  <input type="text" name="dirrecion" parsley-trigger="change" required placeholder="Ingrese dirección" class="form-control">
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label>Telefono(Celular)</label>
                      <input parsley-type="phone" type="tel" class="form-control parsley-validated" required="" placeholder="(000)0000 000">
                </div><!--/form-group--> 
              </form>
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
              <form class="form-horizontal" role="form"  parsley-validate novalidate>
                <div class="form-group">
                  <label class="col-sm-4 control-label">Fecha</label>
                  <div class="col-sm-6">
                      <input type="date" class="form-control parsley-validated" required="" placeholder="DD-MM-AAAA">
                  </div>
                </div><!--/form-group--> 
                <div class="form-group">
                  <label for="inputEmail3" class="col-sm-4 control-label">Nombre</label>
                  <div class="col-sm-6">
                    <input type="email" required parsley-type="email" class="form-control" id="inputEmail3" placeholder="Nombre">
                  </div>
                </div><!--/form-group-->   
                  <div class="form-group">
                  <label class="col-sm-4 control-label">Telefono(Celular)</label>
                  <div class="col-sm-6">
                      <input parsley-type="phone" type="tel" class="form-control parsley-validated" required="" placeholder="(XXX)XXXX XXX">
                  </div>
                </div><!--/form-group--> 
             
                <div class="form-group">
                  <div class="col-sm-offset-3 col-sm-7">
                    <div class="checkbox">                    
                    </div>
                  </div>
                </div><!--/form-group--> 
              </form>
            </div><!--/porlets-content-->
          </div><!--/block-web--> 
        </div><!--/col-md-6--> 
      </div>
                      
                      <div class="col-md-12">
                      <form class="form">
                          <hr>
                              <div class="header">
                                <h4 class="center">INFORMACION GENERAL DEL NIÑO</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
              <form class="form-horizontal group-border-dashed" action="#" parsley-validate="" novalidate="">
                <div class="form-group">
                  <label class="col-sm-4 control-label">Nombre</label>
                  <div class="col-sm-8">
                    <input type="text" class="form-control parsley-validated" required="" placeholder="Ingrese nombre">
                  </div>
                </div><!--/form-group--> 
                <div class="form-group">
                  <label class="col-sm-5">Sexo</label>
                  <br>
                      <select  name="sexo">
                          
                        <option>--Seleccione--</option>
                        <option>Masculino</option>
                        <option>Femenino</option>
                    </select>
                      
                </div><!--/form-group--> 
                <div class="form-group">
                  <label class="col-sm-4 control-label">Fecha de nacimiento</label>
                  <div class="col-sm-8">
                      <input type="date" name="fecha" class="form-control parsley-validated" required="" parsley-maxlength="6" placeholder="fecha nacimiento">
                  </div>
                </div><!--/form-group--> 
                
                <div class="form-group">
                  <label class="col-sm-4 control-label">Edad</label>
                  <div class="col-sm-8">
                      <input type="number" name="edad2" class="form-control parsley-validated" required="" parsley-maxlength="6" placeholder="edad">
                  </div>
                </div><!--/form-group-->  
                
                <div class="form-group">
                  <label class="col-sm-4  control-label">Documento de Identidad</label>
                  
                      <select class="col-sm-4" name="docIdentidad">
                          <option>Seleccione</option>
                          <option>Registro Civil</option>
                          <option>Tarjeta Identidad</option>
                      </select>
                  
                  <div class="col-sm-4">
                      <input type="number" name="numero" class="form-control parsley-validated" required="" placeholder="numero">
                  </div>
                </div><!--/form-group--> 
                <hr>
            <div class="form-group">
                </div><!--/form-group-->
                
              </form>
            </div>
             </div><!--/porlets-content-->         
               </form>                 
            </div>
                      
                       <div class="col-md-12">
                      <form class="form">
                          <hr>
                              <div class="header">
                                <h4 class="center">SALUD DEL NIÑO</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
              <form class="form-horizontal group-border-dashed" action="#" parsley-validate="" novalidate="">
                
                <div class="form-group">
                  <label class="col-sm-4  control-label">Regimen De Salud:</label>
                  
                      <select class="col-sm-4" name="regSalud">
                          <option>Seleccione</option>
                          <option>Subsidiado</option>
                          <option>Contributivo</option>
                          <option>Ninguno</option>
                      </select>
                 <label class="col-sm-1 control-label">Cual:</label>
                  <div class="col-sm-3">
                      <input type="text" name="cual" class="form-control parsley-validated" required="" placeholder="ingrese">
                  </div>
                </div><!--/form-group--> 
                
                <div class="form-group">
                  <label class="col-sm-4 control-label">Estatura del niño:</label>
                  <div class="col-sm-3">
                    <input type="text" name="estatura" class="form-control parsley-validated" required="" placeholder="ingrese estatura">
                  </div>
                  <label class="col-sm-1 control-label">Peso:</label>
                  <div class="col-sm-4">
                    <input type="text" name="estatura" class="form-control parsley-validated" required=""  placeholder="ingrese peso">
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
                    <input type="text" name="cual2" class="form-control parsley-validated" required=""  placeholder="ingrese cual">
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
                    <input type="text" name="cual3" class="form-control parsley-validated" required=""  placeholder="ingrese cual">
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
                    <input type="text" name="cual4" class="form-control parsley-validated" required=""  placeholder="ingrese cual">
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
                    <input type="text" name="cual5" class="form-control parsley-validated" required=""  placeholder="ingrese cual">
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

              </form>
            </div>
             </div><!--/porlets-content-->         
               </form>                 
            </div>
                      
            <div class="col-md-12">
                      <form class="form">
                          <hr>
                              <div class="header">
                                <h4 class="center">NUCLEO FAMILIAR DEL NIÑO</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
              <form class="form-horizontal group-border-dashed" action="#" parsley-validate="" novalidate="">
            
                <div class="form-group">
                  <label class="col-sm-4 control-label">Tipo de familia:</label>
                  <div class="col-sm-8">
                    <div class="radio-inline">
                            <input type="radio" name="tipo" value="mono" id="mono">
                            <label for="mono">Mono</label>
                          </div>
                          <div class="radio-inline">
                            <input type="radio" name="tipo" id="nuclear" value="nuclear">
                            <label for="nuclear">Nuclear</label>
                          </div>
                      <div class="radio-inline">
                            <input type="radio" name="tipo" value="reconst" id="reconst">
                            <label for="reconstituida">Reconstituida</label>
                          </div>
                      <div class="radio-inline">
                            <input type="radio" name="tipo" value="extensa" id="extensa">
                            <label for="extensa">Extensa</label>
                          </div>
                  </div>
                </div><!--/form-group--> 
                <hr>
                <div class="form-group">
                  <label class="col-sm-4 control-label">Tiempo libre familiar:</label>
                  <div class="col-sm-8">
                    <div class="radio-inline">
                            <input type="radio" name="tiempo" value="verTV" id="verTv">
                            <label for="verTV">Ver Tv</label>
                          </div>
                          <div class="radio-inline">
                            <input type="radio" name="tiempo" id="leer" value="leer">
                            <label for="leer"> Leer</label>
                          </div>
                      <div class="radio-inline">
                            <input type="radio" name="tiempo" value="hacer" id="hacer">
                            <label for="hacer">Hacer Deporte</label>
                          </div>
                      <div class="radio-inline">
                            <input type="radio" name="tiempo" value="irAlParque" id="parque">
                            <label for="parque">Ir al Parque</label>
                          </div>
                      <div class="radio-inline">
                            <input type="radio" name="tiempo" value="otro" id="otro">
                            <label for="otro">Otro</label>
                          </div>
                  </div>
                </div><!--/form-group--> 
                
                <hr>
                <div class="form-group">
                  <label class="col-sm-4 control-label">Armonia familiar:</label>
                  <div class="col-sm-8">
                    <div class="radio-inline">
                            <input type="radio" name="armonia" value="mala" id="mala">
                            <label for="verTV">Mala</label>
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
                
                <div class="col-md-12">
          <div class="block-web">
            <div class="header">
              <div class="actions"> <a class="minimize" href="#"><i class="fa fa-chevron-down"></i></a> <a class="refresh" href="#"><i class="fa fa-repeat"></i></a> <a class="close-down" href="#"><i class="fa fa-times"></i></a> </div>
              <h3 class="content-header">Editable Table</h3>
            </div>
         <div class="porlets-content">
          <div class="adv-table editable-table ">
                          <div class="clearfix">
                              <div class="btn-group">
                                  <button id="editable-sample_new" class="btn btn-primary">
                                      Add New <i class="fa fa-plus"></i>
                                  </button>
                              </div>
                          </div>
                          <div class="margin-top-10"></div>
                          <div id="editable-sample_wrapper" class="dataTables_wrapper form-inline" role="grid"><div class="row"><div class="col-lg-6"><div id="editable-sample_length" class="dataTables_length"><label><select size="1" name="editable-sample_length" aria-controls="editable-sample" class="form-control xsmall"><option value="5">5</option><option value="15">15</option><option value="20">20</option><option value="-1">All</option></select> records per page</label></div></div><div class="col-lg-6"><div class="dataTables_filter" id="editable-sample_filter"><label>Search: <input type="text" aria-controls="editable-sample" class="form-control medium"></label></div></div></div><table class="table table-striped table-hover table-bordered dataTable" id="editable-sample" aria-describedby="editable-sample_info">
                              <thead>
                              <tr role="row"><th class="sorting_disabled" role="columnheader" rowspan="1" colspan="1" aria-label="Username" style="width: 169px;">Username</th><th class="sorting" role="columnheader" tabindex="0" aria-controls="editable-sample" rowspan="1" colspan="1" aria-label="Full Name: activate to sort column ascending" style="width: 264px;">Full Name</th><th class="sorting" role="columnheader" tabindex="0" aria-controls="editable-sample" rowspan="1" colspan="1" aria-label="Points: activate to sort column ascending" style="width: 116px;">Points</th><th class="sorting" role="columnheader" tabindex="0" aria-controls="editable-sample" rowspan="1" colspan="1" aria-label="Notes: activate to sort column ascending" style="width: 167px;">Notes</th><th class="sorting" role="columnheader" tabindex="0" aria-controls="editable-sample" rowspan="1" colspan="1" aria-label="Edit: activate to sort column ascending" style="width: 81px;">Edit</th><th class="sorting" role="columnheader" tabindex="0" aria-controls="editable-sample" rowspan="1" colspan="1" aria-label="Delete: activate to sort column ascending" style="width: 117px;">Delete</th></tr>
                              </thead>
                              
                          <tbody role="alert" aria-live="polite" aria-relevant="all"><tr class="odd">
                                  <td class="  sorting_1">Admin</td>
                                  <td class=" ">Tom Cooper</td>
                                  <td class=" ">216</td>
                                  <td class="center ">new user</td>
                                  <td class=" "><a class="edit" href="javascript:;">Edit</a></td>
                                  <td class=" "><a class="delete" href="javascript:;">Delete</a></td>
                              </tr><tr class="even">
                                  <td class="  sorting_1">Admin</td>
                                  <td class=" "> Shakib Al Hasan</td>
                                  <td class=" ">432</td>
                                  <td class="center ">super user</td>
                                  <td class=" "><a class="edit" href="javascript:;">Edit</a></td>
                                  <td class=" "><a class="delete" href="javascript:;">Delete</a></td>
                              </tr><tr class="odd">
                                  <td class="  sorting_1">Admin</td>
                                  <td class=" ">WebPro</td>
                                  <td class=" ">856</td>
                                  <td class="center ">elite user</td>
                                  <td class=" "><a class="edit" href="javascript:;">Edit</a></td>
                                  <td class=" "><a class="delete" href="javascript:;">Delete</a></td>
                              </tr><tr class="even">
                                  <td class="  sorting_1">Admin</td>
                                  <td class=" "> WebPro</td>
                                  <td class=" ">675</td>
                                  <td class="center ">new user</td>
                                  <td class=" "><a class="edit" href="javascript:;">Edit</a></td>
                                  <td class=" "><a class="delete" href="javascript:;">Delete</a></td>
                              </tr><tr class="odd">
                                  <td class="  sorting_1">Admin</td>
                                  <td class=" ">Alex Hales</td>
                                  <td class=" ">423</td>
                                  <td class="center ">new user</td>
                                  <td class=" "><a class="edit" href="javascript:;">Edit</a></td>
                                  <td class=" "><a class="delete" href="javascript:;">Delete</a></td>
                              </tr><tr class="even">
                                  <td class="  sorting_1">Admin</td>
                                  <td class=" ">Alex Hales</td>
                                  <td class=" ">642</td>
                                  <td class="center ">new user</td>
                                  <td class=" "><a class="edit" href="javascript:;">Edit</a></td>
                                  <td class=" "><a class="delete" href="javascript:;">Delete</a></td>
                              </tr><tr class="odd">
                                  <td class="  sorting_1">Admin</td>
                                  <td class=" "> Aaron Finch</td>
                                  <td class=" ">157</td>
                                  <td class="center ">super user</td>
                                  <td class=" "><a class="edit" href="javascript:;">Edit</a></td>
                                  <td class=" "><a class="delete" href="javascript:;">Delete</a></td>
                              </tr><tr class="even">
                                  <td class="  sorting_1">Admin</td>
                                  <td class=" ">Virat Kohli</td>
                                  <td class=" ">468</td>
                                  <td class="center ">elite user</td>
                                  <td class=" "><a class="edit" href="javascript:;">Edit</a></td>
                                  <td class=" "><a class="delete" href="javascript:;">Delete</a></td>
                              </tr><tr class="odd">
                                  <td class="  sorting_1">Admin</td>
                                  <td class=" "> WebPro</td>
                                  <td class=" ">953</td>
                                  <td class="center ">new user</td>
                                  <td class=" "><a class="edit" href="javascript:;">Edit</a></td>
                                  <td class=" "><a class="delete" href="javascript:;">Delete</a></td>
                              </tr><tr class="even">
                                  <td class="  sorting_1">Admin</td>
                                  <td class=" ">Glenn Maxwell</td>
                                  <td class=" ">546</td>
                                  <td class="center ">new user</td>
                                  <td class=" "><a class="edit" href="javascript:;">Edit</a></td>
                                  <td class=" "><a class="delete" href="javascript:;">Delete</a></td>
                              </tr></tbody></table><div class="row"><div class="col-lg-6"><div class="dataTables_info" id="editable-sample_info">Showing 1 to 10 of 12 entries</div></div><div class="col-lg-6"><div class="dataTables_paginate paging_bootstrap pagination"><ul><li class="prev disabled"><a href="#">← Prev</a></li><li class="active"><a href="#">1</a></li><li><a href="#">2</a></li><li class="next"><a href="#">Next → </a></li></ul></div></div></div></div>
                      </div>
 
            </div><!--/porlets-content-->  
          </div><!--/block-web--> 
        </div>
                <hr>
                <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-primary">Registrar</button>
                    <button class="btn btn-default">Cancelar</button>
                  </div>
                </div><!--/form-group-->         

              </form>
            </div>
             </div><!--/porlets-content-->         
               </form>                 
            </div>     
                      
                  </div> <!--/aqui termina el tab1-->
                      
                    
                  <div id="ptab2" class="tab-pane">
                      
                      <div class="col-md-12">
                      <form class="form">
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
                    <form class="form-horizontal bucket-form" method="get">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">TIPO: </label>

                        <div class="col-sm-9 icheck ">

                            <div class="square single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio"  name="tipo">
                                    <label>Casa</label>
                                </div>
                            </div>
                            <div class="square-red single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio"  name="tipo" >
                                    <label>Apartamento</label>
                                </div>
                            </div>

                            <div class="square-green single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio"  name="tipo">
                                    <label>Obra Negra </label>
                                </div>
                            </div>

                            <div class="square-blue single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio"  name="tipo">
                                    <label>Tugurlo</label>
                                </div>
                            </div>

                            <div class="square-yellow single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio"  name="tipo">
                                    <label>Otros</label>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
                    
                </div> <!-- aqui termina la primera columna-->
                  
        <div class="col-xs-6 col-sm-2">
            
            <form class="form-horizontal bucket-form" method="get">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">TENENCIA: </label>

                        <div class="col-sm-9 icheck ">

                            <div class="square single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio"  name="tenencia">
                                    <label>Propia</label>
                                </div>
                            </div>
                            <div class="square-red single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio"  name="tenencia" >
                                    <label>Alquilada </label>
                                </div>
                            </div>

                            <div class="square-green single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio"  name="tenencia">
                                    <label>Invasión </label>
                                </div>
                            </div>

                            <div class="square-blue single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio"  name="tenencia">
                                    <label>Familiar </label>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
                    
            
        </div><!-- aqui termina la segunda columna-->

                

        <div class="col-xs-6 col-sm-2">
            
            <form class="form-horizontal bucket-form" method="get">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">PISOS: </label>

                        <div class="col-sm-9 icheck ">

                            <div class="square single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio"  name="cemento">
                                    <label>Cemento</label>
                                </div>
                            </div>
                            <div class="square-red single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio"  name="tierra" >
                                    <label>Tierra</label>
                                </div>
                            </div>

                            <div class="square-green single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio"  name="madera">
                                    <label>Madera</label>
                                </div>
                            </div>

                            <div class="square-blue single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio"  name="baldosa">
                                    <label>Baldosa</label>
                                </div>
                            </div>

                            <div class="square-yellow single-row">
                                <div class="radio ">
                                    <input tabindex="3" type="radio"  name="ceramica">
                                    <label>Cerámica</label>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
                    
            
        </div>
        
        <div class="col-xs-6 col-sm-3">
            
            <form class="form-horizontal bucket-form" method="get">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">TECHOS: </label>

                        <div class="col-sm-9 icheck ">

                            <div class="square-red single-row">
                                <div class="checkbox ">
                                    <input type="checkbox">
                                    <label>Zinc</label>
                                </div>
                            </div>
                            <div class="square-red single-row">
                                <div class="checkbox ">
                                    <input type="checkbox">
                                    <label>Eternit</label>
                                </div>
                            </div>

                            <div class="square-red single-row">
                                <div class="checkbox ">
                                    <input type="checkbox">
                                    <label>Teja </label>
                                </div>
                            </div>

                            <div class="minimal-yellow single-row">
                                <div class="checkbox ">
                                    <input type="checkbox">
                                    <label>Desechos</label>
                                </div>
                            </div>

                            <div class="minimal-yellow single-row">
                                <div class="checkbox ">
                                    <input type="checkbox">
                                    <label>Cielo raso </label>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
                    
            
        </div>
                  
        <div class="col-xs-6 col-sm-2">
            
            <form class="form-horizontal bucket-form" method="get">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">PAREDES:</label>

                        <div class="col-sm-9 icheck ">

                            <div class="minimal-yellow single-row">
                                <div class="checkbox ">
                                    <input type="checkbox" >
                                    <label>Pañete</label>
                                </div>
                            </div>
                            <div class="minimal-yellow single-row">
                                <div class="checkbox ">
                                    <input type="checkbox" >
                                    <label>Ladrillo</label>
                                </div>
                            </div>

                            <div class="minimal-yellow single-row">
                                <div class="checkbox ">
                                    <input type="checkbox">
                                    <label>Madera</label>
                                </div>
                            </div>

                            <div class="minimal-yellow single-row">
                                <div class="checkbox ">
                                    <input type="checkbox">
                                    <label>Desecho</label>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
                    
            
        </div>
                  </div><!--Aqui termina EL ROW -->
            </div>
             </div><!--/porlets-content-->         
               </form>                 
            </div> 
                      
                
                  <hr>
                 <div class="block-web">
            <div class="header">
              <h6 class="center">SERVICIOS PUBLICOS CON LOS QUE CUENTAN LA VIVIENDA</h6>
            </div> 
                  <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
              <form class="form-horizontal group-border-dashed" action="#" parsley-validate="" novalidate="">
                  <hr>
                <div class="form-group">
                  <label class="col-sm-3 control-label">Servicios: </label>
                  <div class="col-sm-9">
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox1" value="option1">
                       Agua</label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox2" value="option2">
                       Alcantarillado</label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox3" value="option3">
                      Fluido Eléctrico </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox3" value="option4">
                      Gas Natural </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox3" value="option5">
                      Teléfono</label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox3" value="option6">
                      Telecable</label>
                  </div>
                </div><!--/form-group--> 
                <hr>
              </form>
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
              <form class="form-horizontal group-border-dashed" action="#" parsley-validate="" novalidate="">
                  <hr>
                <div class="form-group">
                  <label class="col-sm-3 control-label">Servicios: </label>
                  <div class="col-sm-9">
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox1" value="option1">
                       No tiene</label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox2" value="option2">
                       Letrina</label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox3" value="option3">
                      Inodoro</label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox3" value="option4">
                     Pozo</label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox3" value="option5">
                     Otro</label> 
                  </div>
                </div><!--/form-group--> 
                <hr>
                       

              </form>
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
              <form class="form-horizontal group-border-dashed" action="#" parsley-validate="" novalidate="">
                  <hr>
                <div class="form-group">
                  <label class="col-sm-3 control-label"># De Dormitorios: </label>
                  <div class="col-sm-9">
                    <div class="col-sm-5">
                          <input type="text" class="form-control" name="Dormitorios">
                        </div>
                  </div>
                </div><!--/form-group--> 
                 <div class="form-group">
                  <label class="col-sm-3 control-label"># De Baños: </label>
                  <div class="col-sm-9">
                    <div class="col-sm-5">
                          <input type="text" class="form-control" name="baños">
                        </div>
                  </div>
                </div><!--/form-group--> 
                <div class="form-group">
                  <label class="col-sm-3 control-label">Cocina: </label>
                  <div class="col-sm-9">
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox1" value="option1">
                       Si Tiene</label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox2" value="option2">
                      No Tiene</label>
                  </div>
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label class="col-sm-3 control-label">Sala: </label>
                  <div class="col-sm-9">
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox1" value="option1">
                       Si Tiene</label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox2" value="option2">
                      No Tiene</label>
                  </div>
                </div><!--/form-group-->
                
                <div class="form-group">
                  <label class="col-sm-3 control-label">Comedor: </label>
                  <div class="col-sm-9">
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox1" value="option1">
                       Si Tiene</label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox2" value="option2">
                      No Tiene</label>
                  </div>
                </div><!--/form-group-->

              </form>
            </div>
             </div><!--/porlets-content--> 
                 </div>  
                      
                   <div class="col-md-12">
                      <form class="form">
                          <hr>
                              <div class="header">
                                <h4 class="center">TIPO DE ANIMALES TIENE EN SU VIVIENDA</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
              <form class="form-horizontal group-border-dashed" action="#" parsley-validate="" novalidate="">
                <div class="form-group">
                  <label class="col-sm-2 control-label">Animales:</label>
                  <div class="col-sm-5">
                    <div class="radio-inline">
                            <input type="radio" name="animales" value="si2" id="si2">
                            <label for="perro">Perro</label>
                          </div>
                          <div class="radio-inline">
                            <input type="radio" name="animales2" id="no2" value="no2">
                            <label for="gato">Gato</label>
                          </div>
                      <div class="radio-inline">
                            <input type="radio" name="animales" value="si2" id="si2">
                            <label for="aves">Aves</label>
                          </div>
                      <div class="radio-inline">
                            <input type="radio" name="animales" value="si2" id="si2">
                            <label for="otro">Otro</label>
                          </div>
                  </div>
                  <label class="col-sm-1 control-label">Cual:</label>
                  <div class="col-sm-3">
                    <input type="text" name="cual3" class="form-control parsley-validated"   placeholder="ingrese cual">
                  </div>
                </div><!--/form-group--> 
                <hr>
                <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-primary">Registrar</button>
                    <button class="btn btn-default">Cancelar</button>
                  </div>
                </div><!--/form-group-->  
              </form>
            </div>
             </div><!--/porlets-content-->         
               </form>                 
            </div>     
                      
                  </div>   <!--Aqui termina el tab2-->
              
                   
                  <div id="ptab3" class="tab-pane">
                    <form class="form">
                      <div class="col-md-12">
                      <form class="form">
                          <hr>
                              <div class="header">
                                <h4 class="center">ASPECTOS EVALUATIVOS DEL NIÑO</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
              <form class="form-horizontal group-border-dashed" action="#" parsley-validate="" novalidate="">
                <div class="form-group">
                  <label class="col-sm-2 control-label">Desplazamiento del niño:</label>
                  <select class="col-sm-4" name="desplazamiento">
                      <option>--Seleccione--</option>
                      <option>Ruta</option>
                      <option>Bus</option>
                      <option>Bicicleta</option>
                      <option>Caminando</option>
                      <option>Otro</option> 
                  </select>
                  
                  <label class="col-sm-1 control-label">Cual:</label>
                  <div class="col-sm-5">
                    <input type="text" name="cual6" class="form-control parsley-validated"   placeholder="ingrese cual">
                  </div>
                </div><!--/form-group--> 
                <hr>
                   <div class="form-group">
                  <label class="col-sm-2 control-label">Quien lo lleva  a la escuela:</label>
                  <select class="col-sm-4" name="desplazamiento">
                      <option>--Seleccione--</option>
                      <option>Papa</option>
                      <option>Mama</option>
                      <option>Hermanos</option>
                      <option>Tio(a)</option>
                      <option>Abuelo(a)</option>
                      <option>Otro</option>
                      
                  </select>
                  
                  <label class="col-sm-1 control-label">Cual:</label>
                  <div class="col-sm-5">
                    <input type="text" name="cual7" class="form-control parsley-validated"   placeholder="ingrese cual">
                  </div>
                </div><!--/form-group--> 
                <hr>
                    
                <div class="form-group">
                  <label class="col-sm-2 control-label">El niño comparte la habitación:</label>
                  <div class="col-sm-4">
                    <div class="radio-inline">
                            <input type="radio" name="padeceEnf" value="si" id="male2">
                            <label for="si">Si</label>
                          </div>
                          <div class="radio-inline">
                            <input type="radio" name="padeceEnf" id="female2" value="no">
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
                      <form class="form">
                          <hr>
                              <div class="header">
                                <h4 class="center">INDICADOR SOCIO AFECTIVO</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-11">
              <form class="form-horizontal group-border-dashed" action="#" parsley-validate="" novalidate="">
                 <div class="form-group">
                  <label class="col-sm-4 control-label">Usted considera a su hijo: </label>
                  <div class="col-sm-8">
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox1" value="option1">
                       Timido </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox2" value="option2">
                       Alegre </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox3" value="option3">
                       Calmado </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox1" value="option4">
                       Agresivo </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox2" value="option5">
                       Triste </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox3" value="option6">
                       Miedoso </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox1" value="option7">
                       Mentiroso </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox2" value="option8">
                       Respetuoso</label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox3" value="option9">
                       Rebelde </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox1" value="option10">
                       Solitario </label>
                  </div>
                </div><!--/form-group--> 
            </div>
             </div><!--/porlets-content-->         
               </form>                 
            </div> 
                    
                <div class="col-md-12">
                      <form class="form">
                          <hr>
                              <div class="header">
                                <h4 class="center">RELACIONES AFECTIVAS DEL NIÑO CON SUS COMPAÑEROS</h4>
                              </div>
                              <br>
             <div class="row">  
                 <div class="col-md-1"></div>
             
            <div class="col-md-10">
              <form class="form-horizontal group-border-dashed" action="#" parsley-validate="" novalidate="">
                 <div class="form-group">
                  <label class="col-sm-4 control-label">Relaciones afectivas:</label>
                  <div class="col-sm-8">
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox1" value="option1">
                       Tolerante </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox2" value="option2">
                       Respetuoso </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox3" value="option3">
                       Cariñoso </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox1" value="option4">
                       Rivalidad  </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox2" value="option5">
                       Agresivo</label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox3" value="option6">
                       Independiente </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox1" value="option7">
                       Liderazgo </label>
                    <label class="checkbox-inline">
                      <input type="checkbox" id="inlinecheckbox2" value="option8">
                       Amable</label>
                  </div>
                </div><!--/form-group-->
                <hr> 
                 
                <div class="form">
                <form action="#" class="form-horizontal">
                  <div class="form-group">
                    <label class="col-sm-2 col-sm-2">Observaciones</label>
                    <div class="col-sm-10">
                      <textarea class="form-control ckeditor" name="editor1" rows="6"></textarea>
                    </div>
                  </div>
                </form>
               
            </div>
             </div><!--/porlets-content-->         
               </form>                 
            </div> 
                  
                <hr>   
                <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-primary">Registrar</button>
                    <button class="btn btn-default">Cancelar</button>
                  </div>
                </div><!--/form-group--> 
                
              </form>
            </div>
             </div><!--/porlets-content-->         
               </form>                 
            </div>     
                    </form>
                  </div>
                </div><!-- /tab-content -->
                
                <ul class="pager wizard">
                  <li class="previous disabled"><a href="javascript:void(0)">Previous</a></li>
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
