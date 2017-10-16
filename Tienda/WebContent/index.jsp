<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Index</title>
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
            En nuestra tienda podrá encontrar todo tipo de ofertas.  
          </h2>
        </div>
      </div>
      <!-- Services -->
      <div class="services block block-bg-gradient block-border-bottom">
        <div class="container">
          <h2 class="block-title">
            Nuestros servicios
          </h2>
          <div class="row">
            <div class="col-md-6 text-center">
              <span class="fa-stack fa-5x">
              <i class="fa fa-circle fa-stack-2x text-primary"></i>
              <i class="fa fa-group fa-stack-1x fa-inverse"></i> </span>
              <h4 class="text-weight-strong">
                Comunidad
              </h4>
              <p>Queremos formar una amplia comunidad de clientes que con sus comentarios
              nos ayuden a tener un buen feedback para dar un mejor servicio.</p>
            </div>
            <div class="col-md-4 text-center">
              <span class="fa-stack fa-5x">
              <i class="fa fa-circle fa-stack-2x text-primary"></i>
              <i class="fa fa-pencil fa-stack-1x fa-inverse"></i> </span>
              <h4 class="text-weight-strong">
                Servicio Postventa
              </h4>
              <p>Queremos que nuestros clientes estén siempre contentos, por eso ofrecemos un servicio postventa.</p>
            </div>
          </div>
        </div>
      </div>
      <!--
Background image callout with CSS overlay
Usage: data-block-bg-img="IMAGE-URL" to apply a background image clearly via jQuery .block-bg-overlay = overlays the background image, colour is inherited from block-bg-* classes .block-bg-overlay-NUMBER = determines opcacity value of overlay from 1-9 (default is 5) ie. .block-bg-overlay-2 or .block-bg-overlay-6
-->
      <div class="block block-pd-sm block-bg-grey-dark block-bg-overlay block-bg-overlay-6 text-center" data-block-bg-img="https://picjumbo.imgix.net/HNCK1088.jpg?q=40&amp;w=1650&amp;sharp=30" data-stellar-background-ratio="0.3">
        <h2 class="h-xlg h1 m-a-0">
          <span data-counter-up>100,000,0</span>s
        </h2>
        <h3 class="h-lg m-t-0 m-b-lg">
          ¡De clientes contentos!
        </h3>
      </div>
      <!--Customer testimonial & Latest Blog posts-->
      <div class="testimonials block-contained">
        <div class="row">
          <!--Customer testimonial-->
          <div class="col-md-6 m-b-lg">
            <h3 class="block-title">
              Comentarios
            </h3>
            <blockquote>
              <p>Yo la verdad es que estoy muy contento con esta gente! :)</p>
              <img src="img/misc/charles-quote.png" alt="Charles Spencer Chaplin">
              <small>
                <strong>Carlillos</strong>
              </small>
            </blockquote>
          </div>
        </div>
      </div>
    </div>
    <!-- /content -->

    
    <!-- ======== @Region: #footer ======== -->
    <%@include file="pie.html" %>
    <!-- Required JavaScript Libraries -->
    <script src="lib/jquery/jquery.min.js"></script>
    <script src="lib/bootstrap/js/bootstrap.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="lib/stellar/stellar.min.js"></script>
    <script src="lib/waypoints/waypoints.min.js"></script>
    <script src="lib/counterup/counterup.min.js"></script>
    <script src="contactform/contactform.js"></script>
    
    <!-- Template Specisifc Custom Javascript File -->
    <script src="js/custom.js"></script>
    
    <!--Custom scripts demo background & colour switcher - OPTIONAL -->
    <script src="js/color-switcher.js"></script>
    
    <!--Contactform script -->
    <script src="contactform/contactform.js"></script>
    <script>(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
      m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
      ga('create', 'UA-55234356-4', 'auto');
      ga('send', 'pageview');
    </script>
  
  </body>
</html>