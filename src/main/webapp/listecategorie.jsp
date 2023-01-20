<%@page import="com.example.models.*" %>
<%
    Categorie[] categories = (Categorie[]) request.getAttribute("categories");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste categorie</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/icomoon.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/flexslider.css">
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">
        <link rel="stylesheet" href="css/style.css">
        <script src="js/modernizr-2.6.2.min.js"></script>
    </head>
    <body>
    <%@include file="header.jsp"%>
    <div id="fh5co-started">
    <div class="container">
            <div class="row">
                <% for (Categorie categorie : categories) {%>
                <div class="col-md-4 col-sm-4 text-center">
                    <div class="feature-center animate-box" data-animate-effect="fadeIn">
                        <span class="icon">
                            <i class="icon-credit-card"></i>
                        </span>
                        <h3><%= categorie.getNomCategorie()%></h3>
                        <form action="CategorieUpdate" method="get">
                            <input type="hidden" name="idc" value="<%= categorie.getIdcategorie()%>">
                            <input type="hidden" name="nom" value="<%= categorie.getNomCategorie()%>">
                            <p><input type="submit" class="btn btn-primary btn-outline" value="Modifier"></p>
                        </form>
                        <p><a href="ProduitDureeList?c=<%= categorie.getIdcategorie() %>" class="btn btn-primary btn-outline">Modifier Duree Produit</a></p>
                    </div>
                </div>
                <% }%>
            </div>
        </div>
    </div>

        <script src="js/jquery.min.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.waypoints.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/jquery.countTo.js"></script>
        <script src="js/jquery.flexslider-min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
