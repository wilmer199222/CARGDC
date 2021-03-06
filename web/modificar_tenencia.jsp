
<%@page import="com.caracterizacion.modelo.Pisos"%>
<%@page import="com.caracterizacion.dao.PisosDaoImpl"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
    PisosDaoImpl dao = new PisosDaoImpl();
    List<Pisos> listPisos = new ArrayList();
    listPisos = dao.listar();

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
              
              <h3 class="content-header">Modificar Tenencia de Vivienda</h3>
            </div>
      
      <div class="container clear_both padding_fix"> 
      <div class="row">
  <div class="col-md-3"></div>   
      <div class="row">
        <div class="col-md-6">           
          <div class="block-web">          
            <div class="porlets-content">
                <%
                Pisos piso = (Pisos) request.getAttribute("pisos");
                %>  
                
                <form action="pisossv" method="get">
                <div class="form-group">
                  <label>C�digo</label>
                  <input type="text" name="idPiso" parsley-trigger="change" placeholder="C�digo" class="form-control" value='<%= piso.getIdPiso() %>'>
                </div><!--/form-group-->
                <div class="form-group">
                  <label>Nombre</label>
                  <input type="text" name="nombre" parsley-trigger="change"  placeholder="Nombre" class="form-control" value='<%= piso.getNombre() %>'>
                </div><!--/form-group-->  
                  <div class="form-group">
                  <label>Estado</label>
                  <input type="text" name="estado" parsley-trigger="change" placeholder="Estado" class="form-control" value='<%= piso.getEstado() %>'>
                </div><!--/form-group-->
                </div><!--/checkbox-->
                <div class="col-xs-6 col-sm-3"><button class="btn btn-primary" type="submit" name="btnActualizar" value="Actualizar">Actualizar</button></div>     
                
                <button type="button" class="btn btn-primary" onclick="window.location.href='listarTenencia.jsp'">Cancelar</button>
           
                </div>
              </form>
            </div><!--/porlets-content-->
          <!--/block-web--> 
        </div><!--/col-md-6-->
       

      </div>
      <!--\\\\\\\ container  end \\\\\\-->
    </div>








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
