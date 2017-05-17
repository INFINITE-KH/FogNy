<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Product:</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
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
                    <a href="Carport2.jsp" class="btn btn-primary">Carport 2</a>
                    <a href="Product.jsp" class="btn btn-danger">Byg Selv</a>
                </div>
            </div>
            <h2>Jfog Byg selv</h2>
            <form action="CreateDetail" method="POST">
                <div class="form-group">
                    <label for="sel1">Vælge længden:</label>
                    <select class="form-control" id="sel1" name="length" required>                        
                        <option class="form-control" value="3">3 m</option>
                        <option class="form-control" value="4">4 m</option>
                        <option class="form-control" value="5">5 m</option>
                        <option class="form-control" value="6">6 m</option>
                        <option class="form-control" value="7">7 m</option>
                    </select>
                    <br>
                    <label for="sel1">Vælge Højden:</label>
                    <select class="form-control" id="sel1" name="heigth" required>                        
                        <option class="form-control" value="2">2 m</option>
                        <option class="form-control" value="3">3 m</option>
                        <option class="form-control" value="4">4 m</option>
                        <option class="form-control" value="5">5 m</option>

                    </select>
                    <br>
                    <label for="sel1">Vælge Bredden:</label>
                    <select class="form-control" id="sel1" name="width" required>                        
                        <option class="form-control" value="2">2 m</option>
                        <option class="form-control" value="3">3 m</option>
                        <option class="form-control" value="4">4 m</option>
                        <option class="form-control" value="5">5 m</option>

                    </select>
                    <br>
                    <label for="sel1">Vælge Roof:</label>
                    <select class="form-control" id="sel1" name="roof" required>                        
                        <option class="form-control" value=""></option>
                        <option class="form-control" value="roof">roof</option>

                    </select>
                    <br>
                    <br>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="fname"> First Name:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="email" name="fname" required>
                        </div>
                    </div>
                    <br>
                    <br>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="lname"> Last Name:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="email" name="lname" required>
                        </div>
                    </div>
                    <br>
                    <br> 
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="adress"> Adress:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="email" name="adress" required>
                        </div>
                    </div>
                    <br>
                    <br>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="cphone"> Phone:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="email"  name="cphone" required>
                        </div>
                    </div>
                    <br>
                    <br> 
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="mail"> Email:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="email"  name="mail" required>
                        </div>
                    </div>
                    <br>
                    <br>        
                    <div class="form-group">        
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-primary">Send order</button>
                        </div>
                    </div>


                </div>


            </form>


        </div>
        <%-- slutte div container  --%> 




    </body>
</html>
