<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Home</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="../CSS/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>       
        <link href="../CSS/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%-- her starte navigatio bar  --%>
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

                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="active"><a href="../index.jsp"><span class="glyphicon glyphicon-log-out"></span> Log-out</a></li>                        
                    </ul>
                </div>
            </div>
        </nav>
        <%-- her slutte navigation bar--%>

        <%--  her starte div container som ligger ind i body --%> 
        <div class="container">               
            <div class="container-fluid">
                <div class="row content">
                    <div class="col-sm-3 sidenav">
                        <h2>Admin menu </h2>
                        <ul class="nav nav-pills nav-stacked">
                            <li class="active"><a href="home.jsp">Home</a></li>
                            <li><a href="ViewCustomerInfo.jsp">View Customer</a></li>
                            <li><a href="#section3">OrderList</a></li>
                            <li><a href="InsertNewEmp.jsp">Create New Employee</a></li>
                        </ul><br>                        
                    </div>
                    <%-- here is the left side --%>
                    <div class="col-sm-9">
                        <h3><small>Welcome mr: <% out.print(session.getAttribute("ename"));%></small></h3>
                        <hr>
                        <h5><span class="glyphicon glyphicon-time"></span> Post by Jane Dane, Sep 27, 2015.</h5>


                    </div> <%-- End the left side--%>
                </div>
            </div>


        </div><br><br><%-- her slutter div container  --%> 

        <footer class="container-fluid text-center">  <%-- Footer div class  --%>
            <p>Online Store Copyright</p>  
            <form class="form-inline">Get deals:
                <input type="email" class="form-control" size="50" placeholder="Email Address">
                <button type="button" class="btn btn-danger">Sign Up</button>
            </form>
        </footer>

    </body>
</html>
