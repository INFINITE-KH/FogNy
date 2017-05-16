<%@page import="com.Entity.Carport"%>
<%@page import="com.Mapper.CarportMapper"%>
<%@page import="com.Mapper.DBFacade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Carport 2</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
            DBFacade db = new DBFacade();
            CarportMapper cm = new CarportMapper();

        %>
        <%-- starte navigatio bar  --%>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li><a href="index.jsp">Home</a></li>
                        <li class="active"><a href="Product.jsp">Products</a></li>                        
                        <li><a href="Contact.jsp">Contact</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">

                        <li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    </ul>
                </div>
            </div>
        </nav><%-- slutte navigation bar--%>


        <%-- starter div container  --%> 
        <div class="container">
            <div class="well">

                <div class="btn-group btn-group-justified">
                    <a href="Carport1.jsp" class="btn btn-primary">Carport 1</a>
                    <a href="Carport2.jsp" class="btn btn-danger">Carport 2</a>
                    <a href="Product.jsp" class="btn btn-primary">Byg Selv</a>
                </div>
            </div>

            <h2>Carport 2</h2>
            <div class="container-fluid">
                <div class="content-wrapper">	
                    <div class="item-container">	
                        <div class="container">	
                            <div class="col-md-12">
                                <div class="product col-md-3 service-image-left">

                                    <center>
                                        <img id="item-display" src="Images/carport2.jpg" alt=""></img>
                                    </center>
                                </div>                               

                                <%
                                    Carport visOrdre = cm.getCarport(2);
                                    out.print("<div class='col-md-7'>");
                                    out.print("<div class='product-title'> Name of the Carport :: " + visOrdre.getCarname() + " </div>");
                                    out.print("<div class='product-desc'></div>");
                                    out.print("<hr>");
                                    out.print("<div class='product-price'> Measure :: " + visOrdre.getMeasure() + " cm</div>");
                                    out.print("<div class='product-price'> Price :: " + visOrdre.getPrice() + "</div>");
                                %>


                                <hr>

                                <div class="btn-group cart">
                                    <button type="button" class="btn btn-success"> Køb den </button>
                                </div>

                            </div>
                        </div>

                    </div> 
                </div>

            </div>
        </div>

    </div>
    <%-- slutte div container  --%> 




</body>
</html>
