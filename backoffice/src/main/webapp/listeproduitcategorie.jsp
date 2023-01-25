<%@page import="com.example.models.*" %>
<%
    VProduit[] vproduit = (VProduit[]) request.getAttribute("vproduit");
    Photo[] sary = (Photo[]) request.getAttribute("photo");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Produits valide par catégorie</title>
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
    <div id="fh5co-product">
            <div class="container">
                <div class="row animate-box">
                    <div class="col-md-8 col-md-offset-2 text-center fh5co-heading">
                        <h2>Produits valide pour catégorie: <%=vproduit[0].getNomcategorie()%></h2>
                    </div>
                </div>
                <% for (int i = 0; i < vproduit.length; i++) { %>
                <div class="row">
                    <div class="col-md-4 text-center animate-box">
                    </div>
                    <div class="col-md-4 text-center animate-box">
                        <div class="product">
                            <div class="desc">
                                <p>
                                    <img src="data:image/*;base64,<%=sary[i].getImage()[0]%>">
                                </p>
                                <h3><%= vproduit[i].getNomproduit() %></h3>
                                <span class="price">Durée : <%= vproduit[i].getDuree() %> h</span></br>
                                <span class="price">Prix min : <%= vproduit[i].getPrixmin() %></span></br>
                                <span class="price">Modification Duree</span>
                                <form  action="" method="POST" class="form-inline">
                                    <div class="col-md-6 col-sm-6">
                                        <div class="form-group">
                                            <input type="number" name="duree" min="1" value="<%= vproduit[i].getDuree() %>" class="form-control" id="duree" >
                                            <input type="hidden" name="p" value="<%= vproduit[i].getIdproduit() %>">
                                        </div>
                                    </div>
                                    <div class="col-md-6 col-sm-6">
                                        <button type="submit" class="btn btn-default btn-block">Modifier</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 text-center animate-box">
                    </div>
                </div>
                </br>

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
