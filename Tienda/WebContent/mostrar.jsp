<%@page import="beans.Producto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<title>Caracteristicas del producto - Flexor Bootstrap Theme</title>
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
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="img/icons/114x114.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="img/icons/72x72.png">
<link rel="apple-touch-icon-precomposed" href="img/icons/default.png">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900"
	rel="stylesheet">

<!-- Bootstrap CSS File -->
<link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Libraries CSS Files -->
<link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<link href="lib/owlcarousel/owl.carousel.min.css" rel="stylesheet">
<link href="lib/owlcarousel/owl.theme.min.css" rel="stylesheet">
<link href="lib/owlcarousel/owl.transitions.min.css" rel="stylesheet">

<!-- Main Stylesheet File -->
<link href="css/style.css" rel="stylesheet">
<link href="css/estilos.css" rel="stylesheet">

<!--Your custom colour override - predefined colours are: colour-blue.css, colour-green.css, colour-lavander.css, orange is default-->
<link href="#" id="colour-scheme" rel="stylesheet">

<!-- =======================================================
      Theme Name: Flexor
      Theme URL: https://bootstrapmade.com/flexor-free-multipurpose-bootstrap-template/
      Author: BootstrapMade.com
      Author URL: https://bootstrapmade.com
    ======================================================= -->
</head>
<body class="fullscreen-centered page-login">
	<%
		Producto bproducto = (Producto) request.getAttribute("bproducto");
	%>
	<!--Change the background class to alter background image, options are: benches, boots, buildings, city, metro -->
	<div id="background-wrapper" class="benches"
		data-stellar-background-ratio="0.8">

		<!-- ======== @Region: #content ======== -->
		<div id="content">
			<div class="header">
				<div class="header-inner">
					<!--navbar-branding/logo - hidden image tag & site name so things like Facebook to pick up, actual logo set via CSS for flexibility -->
					<a class="navbar-brand center-block" href="index.html" title="Home">
						<h1 class="hidden">
							<img src="img/logo.png" alt="Flexor Logo"> Flexor
						</h1>
					</a>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6 col-sm-offset-3">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Caracteristicas del Producto</h3>
						</div>
						<div class="panel-body">
							<form accept-charset="UTF-8" role="form" method="GET">
								<fieldset>
									<div class="form-group">
										<div class="input-group input-group-lg">
											<span class="input-group-addon"> <label class="etiqueta" for="nombre">nombre</label></span>
											<input type="text" readonly="readonly" class="form-control"
												placeholder="Producto" size="20" name="nombre"
												value="<%=bproducto.getNombre()%>">
										</div>
									</div>
									<div class="form-group">
										<div class="input-group input-group-lg">
											<span class="input-group-addon"> <label class="etiqueta" for="marca">marca</label></span>
											<input type="text" class="form-control"
												placeholder="Producto" size="20" readonly="readonly" name="marca"
												value="<%=bproducto.getMarca()%>">
										</div>
									</div>

									<div class="form-group">
										<div class="input-group input-group-lg">
											<span class="input-group-addon"> <label class="etiqueta"
												for="descripcion">descripcion</label></span> <input type="text"
												class="form-control" placeholder="Producto" size="20" readonly="readonly"
												name="descripcion" value="<%=bproducto.getDescripcion()%>">
										</div>
									</div>


									<div class="form-group">
										<div class="input-group input-group-lg">
											<span class="input-group-addon"> <label class="etiqueta" for="precio">precio</label></span>
											<input type="text" readonly="readonly" class="form-control"
												placeholder="Producto" size="20" name="precio"
												value="<%=bproducto.getPrecio()%>">
										</div>
									</div>


									<div class="form-group">
										<div class="input-group input-group-lg">
											<span class="input-group-addon"> <label class="etiqueta"
												for="existencia">existencia</label></span> <input type="text" readonly="readonly"
												class="form-control" placeholder="Producto" size="20"
												name="existencia" value="<%=bproducto.getExistencia()%>">
										</div>
									</div>
									
									<div class="form-group">
										<div class="input-group input-group-lg">
											<span class="input-group-addon"> <label class="etiqueta"
												for="imagen">imagen</label></span> <input type="text" readonly="readonly"
												class="form-control" placeholder="Producto" size="20"
												name="imagen" value="<%=bproducto.getImagen()%>">
										</div>
									</div>
								</fieldset>
							</form>

						</div>
					</div>
				</div>
			</div>
			<!-- /row -->
		</div>
	</div>
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
	<script>
		(function(i, s, o, g, r, a, m) {
			i['GoogleAnalyticsObject'] = r;
			i[r] = i[r] || function() {
				(i[r].q = i[r].q || []).push(arguments)
			}, i[r].l = 1 * new Date();
			a = s.createElement(o), m = s.getElementsByTagName(o)[0];
			a.async = 1;
			a.src = g;
			m.parentNode.insertBefore(a, m)
		})(window, document, 'script',
				'//www.google-analytics.com/analytics.js', 'ga');
		ga('create', 'UA-55234356-4', 'auto');
		ga('send', 'pageview');
	</script>
</body>
</html>