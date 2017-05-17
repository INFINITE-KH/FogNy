<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Home</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%-- begin navigatio bar  --%>
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
                        <li class="active"><a href="index.jsp">Home</a></li>
                        <li><a href="Product.jsp">Products</a></li>
                        <li><a href="Contact.jsp">Contact</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">

                        <li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <%-- End navigation bar--%>

      
        <div class="container"><%-- begin div container  --%> 
            <div class="row">
                <div class="col-sm-4">
                    <div class="panel panel-primary">
                        <div class="panel-heading">Carport 1: Færdig bygget</div>
                        <div class="panel-body"><img src="Images/carport1.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
                        <div class="panel-footer">
                            <a href="Carport1.jsp" name="id"><button type="button" class="btn btn-info" name="id" > Læse mere</button></a>
                        </div>

                    </div>
                </div>
                <div class="col-sm-4"> 
                    <div class="panel panel-primary">
                        <div class="panel-heading">Cartport 2: Færdig bygget</div>
                        <div class="panel-body"><img src="Images/carport2.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
                        <div class="panel-footer">
                            <a href="Carport2.jsp" name="id"><button type="button" class="btn btn-info" name="id"> Læse mere</button></a>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4"> 
                    <div class="panel panel-danger">
                        <div class="panel-heading">Cartport 3: Byg selv</div>
                        <div class="panel-body"><img src="Images/bygselv.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
                        <div class="panel-footer">
                            <a href="Product.jsp"><button type="button" class="btn btn-danger"> Byg</button></a>
                        </div>
                    </div>
                </div>

            </div>
        </div><br><br><%-- Ends div container  --%> 

        <footer class="container-fluid text-center">  <%-- Footer div class  --%>
            <p>Online Store Copyright</p>  
            <form class="form-inline">Get deals:
                <input type="email" class="form-control" size="50" placeholder="Email Address">
                <button type="button" class="btn btn-danger">Sign Up</button>
            </form>
        </footer>

    </body>
</html>
