
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Signup</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
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
                        <li><a href="#">Products</a></li>
                        <li><a href="#">Stores</a></li>
                        <li><a href="Contact.jsp">Contact</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="active"><a href="Signup.jsp"><span class="glyphicon glyphicon-user"></span> Signup</a></li>
                        <li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container">
            <h2>Empolyee Registration: </h2>
            <form class="form-horizontal" action="../CreateCustomer" name="Signup" method="POST">
                
                <div class="form-group">
                    <label class="control-label col-sm-2" for="ename">Youy Fname:</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" name="fname" placeholder="Enter your name">
                    </div>
                    <label class="control-label col-sm-2" for="ename">Youy Lname:</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" name="lname" placeholder="Enter your name">
                    </div>
                    <label class="control-label col-sm-2" for="ename">Adress:</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" name="adress" placeholder="Enter your name">
                    </div>
                    <label class="control-label col-sm-2" for="ename">phone:</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" name="cphone" placeholder="Enter your name">
                    </div>
                    <label class="control-label col-sm-2" for="ename">mail:</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" name="mail" placeholder="Enter your name">
                    </div>
                </div>
                

                <div class="form-group">        
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">Signup</button>
                    </div>
                </div>
            </form>
        </div>

    </body>
</html>

