<%@ page import="com.models.*" %>
<%
	VRechargement[] recharge=(VRechargement[]) request.getAttribute("recharge");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Shop &mdash; Free Website Template, Free HTML5 Template by gettemplates.co</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Website Template by gettemplates.co" />
	<meta name="keywords" content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
	<meta name="author" content="gettemplates.co" />

	<!-- 
	//////////////////////////////////////////////////////

	FREE HTML5 TEMPLATE 
	DESIGNED & DEVELOPED by FreeHTML5.co
		
	Website: 		http://freehtml5.co/
	Email: 			info@freehtml5.co
	Twitter: 		http://twitter.com/fh5co
	Facebook: 		https://www.facebook.com/fh5co

	//////////////////////////////////////////////////////
	 -->

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<!-- <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet"> -->
	<!-- <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,400i" rel="stylesheet"> -->
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="../../css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="../../css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="../../css/bootstrap.css">

	<!-- Flexslider  -->
	<link rel="stylesheet" href="../../css/flexslider.css">

	<!-- Owl Carousel  -->
	<link rel="stylesheet" href="../../css/owl.carousel.min.css">
	<link rel="stylesheet" href="../../css/owl.theme.default.min.css">

	<!-- Theme style  -->
	<link rel="stylesheet" href="../../css/style.css">

	<!-- Modernizr JS -->
	<script src="../../js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	</head>
	<body>
		
	<div class="fh5co-loader"></div>
	
	<div id="page">
		<%@include file="header.jsp"%>

	<div id="fh5co-started">
		<div class="container">
			<div class="row animate-box">
				<div class="col-md-8 col-md-offset-2 text-center fh5co-heading">
					<h2>Validation Rechargement de COmpte</h2>
				</div>
			</div>
			<div class="row">
				<% for (int i = 0; i < recharge.length; i++) { %>
				<div class="col-md-4 text-center animate-box">
					<div class="product">
						<div class="desc">
							<h3><%=recharge[i].getNomuser()%> </h3>
							<p>Numero de Compte: <%=recharge[i].getNumerocompte()%></p>
							<span class="price"><%=recharge[i].getRecharge()%> Ar</span>
							<form method="post" action="validationRecharge">
								<input type="hidden" name="idrechargement" value="<%=recharge[i].getIdrechargement()%>">
								<input type="hidden" name="numerocompte" value="<%=recharge[i].getNumerocompte()%>">
								<input type="hidden" name="montant" value="<%=recharge[i].getRecharge()%>">
								<input type="hidden" name="etat" value="<%=recharge[i].getEtat()%>">
								<button type="submit" class="btn btn-default btn-block">Valider</button>
							</form>
						</div>
					</div>
				</div>
				<% } %>
			</div>

		</div>
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>
	
	<!-- jQuery -->
	<script src="../../js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="../../js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="../../js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="../../js/jquery.waypoints.min.js"></script>
	<!-- Carousel -->
	<script src="../../js/owl.carousel.min.js"></script>
	<!-- countTo -->
	<script src="../../js/jquery.countTo.js"></script>
	<!-- Flexslider -->
	<script src="../../js/jquery.flexslider-min.js"></script>
	<!-- Main -->
	<script src="../../js/main.js"></script>

	</body>
</html>

