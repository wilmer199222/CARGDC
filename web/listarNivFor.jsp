
<%@page import="com.caracterizacion.modelo.NivelFormacion"%>
<%@page import="com.caracterizacion.dao.FormacionDaoImpl"%>
<%@page import="com.caracterizacion.modelo.Pisos"%>
<%@page import="com.caracterizacion.dao.PisosDaoImpl"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Fundacion</title>
<META NAME="ROBOTS" CONTENT="NOINDEX, NOFOLLOW">
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

</head>
    <%
    FormacionDaoImpl dao = new FormacionDaoImpl();
    List<NivelFormacion> listFormacion = new ArrayList();
    
    %>

    <body style="background-color: #f1f1f1;">

      <div class="pull-left breadcrumb_admin clear_both">
        
  
      </div>
      <div class="container clear_both padding_fix">
        <!--\\\\\\\ container  start \\\\\\-->
             <div class="row">
        <div class="col-md-12">
          <div class="block-web">
            <div class="header">
              
              <h3 class="content-header">Listar Nivel Formacion</h3>
            </div>
          <div class="container clear_both padding_fix"> 
      <div class="row">
  <div class="col-md-3"></div>   
      <div class="row">
        <div class="col-md-6">           
          <div class="block-web">          
            <div class="panel-heading">
              <div class="col-xs-6 col-sm-3"><button type="button" class="btn btn-primary" onclick="window.location.href='registrar_nivFor.jsp'">Nuevo</button></div>
                
                <form class="form-inline">
             
                  <label class="sr-only" for="inlineFormCustomSelect">Parametro</label>
                        <select class="form-control" id="inlineFormCustomSelect">
                          <option selected>- Seleccione -</option>
                          <option value="1">C�digo</option>
                          <option value="2">Nombre</option>
                          <option value="3">Estado</option> 
                        </select>
                        <input type="text" class="form-control" id="inputBuscar" >
                        <button type="submit" class="btn btn-primary">Buscar</button>
               
              </form>
                
            </div><!--/porlets-content-->
            <table id="example1" class="table table-bordered table-striped">
                <thead>
                <tr>
                  <th>C�digo</th>
                  <th>Nombre</th>
                  <th>Estado</th> 
                  <th>Operaciones</th>                   
                </tr>
                </thead>
                <tbody>
                   <%
                    listFormacion = dao.listar();
                    for(NivelFormacion f : listFormacion){

                        %>
                <tr>
                  <td><%= f.getIdNivelFormacion()%></td>
                  <td><%= f.getNombre() %></td>
                  <td><%= f.getEstado() %></td>
                    <td>
                    <div class="row">
                        <div class="col-1 col-md-1">
                            
                             <form action="formacionsvl" method="get">
                                <a href="javascript:;" onclick="parentNode.submit();" name="btnVerDetalle">
                                <span class="glyphicon glyphicon-eye-open"></span>
                                </a>
                             <input type="hidden" name="btnVerDetalle" value="ver"/>
                             <input type="hidden" name="idNivelFormacion" value='<%= f.getIdNivelFormacion() %>'/>
                            </form> 
                        </div>
                        <div class="col-1 col-md-1">
                            
                            <form action="formacionsvl" method="get">
                                <a href="javascript:;" onclick="parentNode.submit();" name="btnEliminar">
                                    <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                </a>
                                <input type="hidden" name="btnEliminar" value="eliminar"/>
                                <input type="hidden" name="idNivelFormacion" value='<%= f.getIdNivelFormacion() %>'/>
                            </form>                  
                        </div>
                        <div class="col-1 col-md-1">
                            
                             <form action="formacionsvl" method="get">
                                <a href="javascript:;" onclick="parentNode.submit();" name="btnModificar">
                                <span class="glyphicon glyphicon-check"></span>
                                </a>
                             <input type="hidden" name="btnModificar" value="modificar"/>
                             <input type="hidden" name="idNivelFormacion" value='<%= f.getIdNivelFormacion() %>'/>
                            </form> 
                        </div>
                   </div>
                  </td>
                </tr>
                <% } %>            
                </tbody>          
              </table> 
          <!--/block-web--> 
        </div><!--/col-md-6-->
       

      </div>
      <!--\\\\\\\ container  end \\\\\\-->
    </div>
    <!--\\\\\\\ content panel end \\\\\\-->
  </div>
  <!--\\\\\\\ inner end\\\\\\-->
</div>
<!--\\\\\\\ wrapper end\\\\\\-->




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
