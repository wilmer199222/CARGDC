
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Prueba</title>
<META NAME="ROBOTS" CONTENT="NOINDEX, NOFOLLOW">
<link href="css/font-awesome.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="css/animate.css" rel="stylesheet" type="text/css" />
<link href="css/admin.css" rel="stylesheet" type="text/css" />

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

<script src="js/jquery-3.2.1.js" type="text/javascript"></script>
<!-- CODIGO JQUERY PARA INTEGRANTES DE FAMILIA-->
           <script>
            function addElemento(){
                var nom = document.getElementById("nombre").value;
                //alert(var_nom);
                var ed = document.getElementById("edad").value;
                var parent = document.getElementById("parentesco").value;
                var escol = document.getElementById("escolaridad").value;
                var ocupa = document.getElementById("ocupacion").value;
                
                var fila = "<tr><td>"+nom+"</td><td>"+ed+"</td><td>"+parent+"</td><td>"+escol+"</td><td>"+ocupa+"</td></tr>";
                $("#miTabla").append(fila);
               
                $("#nombre").val("");
                $("#edad").val("");
                $("#parentesco").val("");
                $("#escolaridad").val("");
                $("#ocupacion").val("");
                
                $("#nombre").focus();
                
           
            }
        </script>
 <!-- CODIGO JQUERY  PARA INTEGRANTES DE FAMILIA-->
 
</head>
    <body style="background-color: #f1f1f1;">
     
      <div class="row">     
        
        <div class="col-md-12">
          <div class="block-web">
            
            <div class="porlets-content">
              <div class="basic-wizard" id="progressWizard">


                           
                     <div class="col-md-12">
                       <!-- <form class="form"> -->
                          <hr>
                              <div class="header">
                                <h4 class="center">INTEGRANTES DE FAMILIA</h4>
                              </div>
                              <br>
         <div class="row">  
          <div class="col-md-1"></div>            
           <div class="col-md-10">
            <form class="form-horizontal group-border-dashed" action="#" parsley-validate="" novalidate="">
           <!--Integrantes de familia, formulario y tabla INICIA  -->
                
              <div class="col-md-6">
          <div class="block-web">
          
            <div class="porlets-content">
              <!-- <form action="" class="form-horizontal row-border"> --> 
                  
                <div class="form-group">
                  <label class="col-sm-3 control-label">Nombres</label>
                  <div class="col-sm-9">
                      <input type="text" class="form-control" placeholder="Nombre" id="nombre">
                  </div>
                </div><!--/form-group--> 

                  <div class="form-group">
                  <label class="col-sm-3 control-label">Edad </label>
                  <div class="col-sm-9">
                      <input type="number" class="form-control" placeholder="Edad" id="edad">
                  </div>
                </div><!--/form-group--> 
                
                  <div class="form-group">
                  <label class="col-sm-3 control-label">Parentesco</label>
                  <div class="col-sm-9">
                      <input type="text" class="form-control" placeholder="Parentesco" id="parentesco">
                  </div>
                </div><!--/form-group--> 
                
                
                <div class="form-group">
                  <label class="col-sm-3 control-label">Escolaridad</label>
                  <div class="col-sm-9">
                      <input type="text" class="form-control" placeholder="Escolaridad" id="escolaridad">
                  </div>
                </div><!--/form-group--> 
                
              <!-- <div class="form-group">
                  <label class="col-sm-3 control-label">Escolaridad</label>
                  <div class="col-sm-9">
                      <select class="form-control" id="source" id="escolaridad">                   
                      <optgroup label="Nivel de Estudios">
                      <option value="0"> -Seleccione- </option>                     
                      <option value="1"> pre-escolar </option>
                      <option value="2"> 1° </option>
                      <option value="3"> 2° </option>
                      <option value="4"> 3° </option>
                      <option value="5"> 4° </option>
                      <option value="6"> 5° </option>
                      <option value="7"> 6° </option>
                      <option value="8"> 7° </option>
                      <option value="9"> 8° </option>
                      <option value="10"> 9° </option>
                      <option value="11"> 10° </option>
                      <option value="12"> 11° </option>
                      <option value="13"> Tecnico </option>
                      <option value="14"> Tecnologo </option>
                      <option value="15"> Profecional </option>
                      </optgroup>
                    </select>
                  </div>
                </div>--> 
                
                  <div class="form-group">
                  <label class="col-sm-3 control-label">Ocupación</label>
                  <div class="col-sm-9">
                      <input type="text" class="form-control" placeholder="Ocupación" id="ocupacion">
                  </div>
                  </div><!--/form-group--> 
                  
                  <hr>            
                  <br>
                      <button id="btnAgregar" onclick="addElemento()">Agregar</button> 
                      <br><br></br>
                      
                     
                      
              <!-- </form>--> 
            </div><!--/porlets-content-->
          </div><!--/block-web--> 
        </div><!--/col-md-6-->   
        <br>
  <div class="col-lg-12">
            
              <div class="panel-body">
              
       <table class="table table-bordered">
      <thead>
        <tr>
            
          <th>Nombres</th>
          <th>Edad</th>
          <th>Parentesco</th>
          <th>Escolaridad</th>
          <th>Ocupacion</th>

        </tr>
      </thead>
       <tbody id="miTabla">
       
      </tbody>
    </table>
                  
              </div>
              <div></div>
          </div>
        
           
           
           
           <!--Integrantes de familia, formulario y tabla TERMINA  -->
            </form>      
             <!-- </form>-->
            </div>
          </div><!--/porlets-content-->         
       </div>                    
               
                
              </div><!--/progressWizard-->
            </div><!--/porlets-content--> 
          </div><!--/block-web--> 
        </div><!--/col-md-6--> 
      </div>
      
  
    
    </body>
</html>
