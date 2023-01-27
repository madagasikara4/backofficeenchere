<%@ page import="com.models.*" %>
<%
    CAclient[] recharge=(CAclient[])  request.getAttribute("CAclient");
    CAcategorie[] cat=(CAcategorie[])  request.getAttribute("CAcategorie");
    Resultat maxprod=(Resultat) request.getAttribute("maxprod");
    Resultat minprod=(Resultat) request.getAttribute("minprod");
    CAcategorie maxcat=(CAcategorie) request.getAttribute("maxcat");
    CAcategorie mincat=(CAcategorie) request.getAttribute("badcat");
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
            <div class="row row-pb-md">
                <div class="col-md-4 fh5co-widget">
                    <h3>Chiffres d'affaire par client</h3>
                    <div class="col-md-2 fh5co-widget">
                    </div>
                    <div class="col-md-8 col-sm-4 col-xs-6 col-md-push-1">
                        <ul class="fh5co-footer-links">
                            <% for (int i = 0; i < recharge.length; i++) { %>
                            <li><%=recharge[i].getNomuser()%>: <%=recharge[i].getSum()%></li>
                            <% } %>
                        </ul>
                    </div>
                </div>

            </div>
                <div class="row row-pb-md">
                <div class="col-md-4 fh5co-widget">
                    <h3>Chiffres d'affaire par Categorie</h3>
                    <div class="col-md-2 fh5co-widget">
                    </div>
                    <div class="col-md-8 col-sm-4 col-xs-6 col-md-push-1">
                        <ul class="fh5co-footer-links">
                            <% for (int i = 0; i < cat.length; i++) { %>
                            <li><%=cat[i].getNomcategorie()%>: <%=cat[i].getSum()%></li>
                            <% } %>
                        </ul>
                    </div>
                </div>

                </div>
                    <div class="row row-pb-md">
                <div class="col-md-12 fh5co-widget">
                    <h3>Record de prix atteint</h3>
                    <% if(maxprod!=null){ %>
                    <p><%=maxprod.getNomproduit()%> <%=maxprod.getNomcategorie()%> <%=maxprod.getPrix()%></p>
                    <% } %>
                </div>
                    </div>
                        <div class="row row-pb-md">
                <div class="col-md-12 fh5co-widget">
                    <h3>Prix le plus bas</h3>
                    <% if(minprod!=null){ %>
                    <p><%=minprod.getNomproduit()%> <%=minprod.getNomcategorie()%> <%=minprod.getPrix()%></p>
                    <% } %>
                </div>
                        </div>
                            <div class="row row-pb-md">
                <div class="col-md-12 fh5co-widget">
                    <h3>Categorie qui raporte le plus d'argent</h3>
                    <% if(maxcat!=null){ %>
                    <p><%=maxcat.getNomcategorie()%> <%=maxcat.getSum()%></p>
                    <% } %>
                </div>

                            </div>
                                <div class="row row-pb-md">
                <div class="col-md-12 fh5co-widget">
                    <h3>Categorie qui raporte le moins d'argent</h3>
                    <% if(mincat!=null){ %>
                    <p><%=mincat.getNomcategorie()%> <%=mincat.getSum()%></p>
                    <% } %>


                </div>

                                </div>




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

