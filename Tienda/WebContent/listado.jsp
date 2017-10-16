<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <title>Productos</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">
    
    <!-- Facebook Opengraph integration: https://developers.facebook.com/docs/sharing/opengraph -->
    <meta property="og:title" content="">
    <meta property="og:image" content="">
    <meta property="og:url" content="">
    <meta property="og:site_name" content="">
    <meta property="og:description" content="">
    
    <!-- Twitter Cards integration: https://dev.twitter.com/cards/  -->
    <meta name="twitter:card" content="summary">
    <meta name="twitter:site" content="">
    <meta name="twitter:title" content="">
    <meta name="twitter:description" content="">
    <meta name="twitter:image" content="">

    <!-- Fav and touch icons -->
    <link rel="shortcut icon" href="img/icons/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="img/icons/114x114.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="img/icons/72x72.png">
    <link rel="apple-touch-icon-precomposed" href="img/icons/default.png">
  
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900" rel="stylesheet">
    
    <!-- Bootstrap CSS File -->
    <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  
    <!-- Libraries CSS Files -->
    <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="lib/owlcarousel/owl.carousel.min.css" rel="stylesheet">
    <link href="lib/owlcarousel/owl.theme.min.css" rel="stylesheet">
    <link href="lib/owlcarousel/owl.transitions.min.css" rel="stylesheet">
    
    <!-- Main Stylesheet File -->
    <link href="css/style.css" rel="stylesheet">
    
    <!--Your custom colour override - predefined colours are: colour-blue.css, colour-green.css, colour-lavander.css, orange is default-->
    <link href="#" id="colour-scheme" rel="stylesheet">
    
    <!-- =======================================================
      Theme Name: Flexor
      Theme URL: https://bootstrapmade.com/flexor-free-multipurpose-bootstrap-template/
      Author: BootstrapMade.com
      Author URL: https://bootstrapmade.com
    ======================================================= -->
  </head>
  
  <body class="page-index has-hero">
    <!--Change the background class to alter background image, options are: benches, boots, buildings, city, metro -->
     <%@include file="cabecera.html"%>
    <!-- ======== @Region: #content ======== -->
   <div id="content">
      <!-- Mission Statement -->
      <div class="mission text-center block block-pd-sm block-bg-noise">
        <div class="container">
          <h2 class="text-shadow-white">
            We are a full digital agency based in London. We are experienced professionals in building websites, applications, mobile solutions. 
          </h2>
        </div>
      </div>
      <!--Showcase-->
      <div class="showcase block block-border-bottom-grey">
        <div class="container">
          <h2 class="block-title">
            Productos ${nuevos}
          </h2>
          <p>This is Photoshop's version of Lorem Ipsum. Proin gravida nibh vel velit auctor aliquet. Aenean sollicitudin, lorem quis bibendum auctor, nisi elit consequat ipsum, nec sagittis sem nibh id elit. Duis sed odio sit amet nibh vulputate cursus a sit amet mauris.</p>
            
        
        </div>
        
    	<div id="products" class="row list-group">
    	
    	<c:forEach var="producto" items="${productos}">
	        <div class="item  col-xs-4 col-lg-4">
	            <div class="thumbnail">
	                <img class="group list-group-image" src="img/showcase/project12.png" alt="" />
	                <div class="caption">
	                    <h4 class="group inner list-group-item-heading">
	                        ${producto.nombre}</h4>
	                    <p class="group inner list-group-item-text">
	                        ${producto.descripcion}</p>
	                    <div class="row">
	                        <div class="col-xs-12 col-md-6">
	                            <p class="lead">
	                                ${producto.precio} €</p>
	                        </div>
	                        <div class="col-xs-12 col-md-6">
	                            <a class="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
	                        </div>
	                    </div>
	                </div>
	            </div>
            </div>
	        
        </c:forEach>
        </div>
      </div>   
      <!--
      
Background image callout with CSS overlay
Usage: data-block-bg-img="IMAGE-URL" to apply a background image clearly via jQuery .block-bg-overlay = overlays the background image, colour is inherited from block-bg-* classes .block-bg-overlay-NUMBER = determines opcacity value of overlay from 1-9 (default is 5) ie. .block-bg-overlay-2 or .block-bg-overlay-6
-->
      <!--Customer testimonial & Latest Blog posts-->
    <!-- /content -->
    <!-- Call out block -->
    <!-- ======== @Region: #footer ======== -->
    <%@include file="pie.html" %>
    
    <!-- Required JavaScript Libraries -->
    <script src="lib/jquery/jquery.min.js"></script>
    <script src="lib/bootstrap/js/bootstrap.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="lib/stellar/stellar.min.js"></script>
    <script src="lib/waypoints/waypoints.min.js"></script>
    <script src="lib/counterup/counterup.min.js"></script>
    <script src="lib/contactform/contactform.js"></script>
    
    <!-- Template Specisifc Custom Javascript File -->
    <script src="lib/js/custom.js"></script>
    
    <!--Custom scripts demo background & colour switcher - OPTIONAL -->
    <script src="lib/js/color-switcher.js"></script>
    
    <!--Contactform script -->
    <script type="text/javascript">
	    $(document).ready(function() {
	        $('#list').click(function(event){event.preventDefault();$('#products .item').addClass('list-group-item');});
	        $('#grid').click(function(event){event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');});
	    });    </script>
    <script src="lib/contactform/contactform.js"></script>
    <script>(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
      m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
      ga('create', 'UA-55234356-4', 'auto');
      ga('send', 'pageview');
    </script>
  
  </body>
</html>