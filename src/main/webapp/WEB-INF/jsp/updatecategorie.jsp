<%@page import="com.models.*" %>
<%
    Categorie categorie=(Categorie) request.getAttribute("categorie");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update categorie</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="../../css/animate.css">
        <link rel="stylesheet" href="../../css/icomoon.css">
        <link rel="stylesheet" href="../../css/bootstrap.css">
        <link rel="stylesheet" href="../../css/flexslider.css">
        <link rel="stylesheet" href="../../css/owl.carousel.min.css">
        <link rel="stylesheet" href="../../css/owl.theme.default.min.css">
        <link rel="stylesheet" href="../../css/style.css">
        <script src="../../js/modernizr-2.6.2.min.js"></script>
    </head>
    <body>
    <%@include file="header.jsp"%>
    <div id="fh5co-started">

    <div class="container">
            <div class="row animate-box">
                <div class="col-md-8 col-md-offset-2 text-center fh5co-heading">
                    <h2>Update catégorie</h2>
                </div>
            </div>
            <div class="row animate-box">
                <div class="col-md-8 col-md-offset-2">
                    <form method="POST" action="/CategorieUpdate" class="form-inline">
                        <div class="col-md-6 col-sm-6">
                            <div class="form-group">
                                <label for="nom" class="sr-only">Nom de catégorie</label>
                                <input type="hidden" name="idcategorie" value="<%= categorie.getIdcategorie() %>">
                                <input type="text" name="nomcategorie" class="form-control" id="nom" value="<%= categorie.getNomCategorie() %>">
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-6">
                            <button type="submit" class="btn btn-default btn-block" >Valider</button>
                        </div>
                    </form>
                </div>
            </div>
    </div>
        </div>
        <script src="../../js/jquery.min.js"></script>
        <script src="../../js/jquery.easing.1.3.js"></script>
        <script src="../../js/bootstrap.min.js"></script>
        <script src="../../js/jquery.waypoints.min.js"></script>
        <script src="../../js/owl.carousel.min.js"></script>
        <script src="../../js/jquery.countTo.js"></script>
        <script src="../../js/jquery.flexslider-min.js"></script>
        <script src="../../js/main.js"></script>
    </body>
</html>
