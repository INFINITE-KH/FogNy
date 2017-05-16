<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                            <li><a href="home.jsp">Home</a></li>
                            <li class="active"><a href="ViewCustomerInfo.jsp">View Customer</a></li>
                            <li><a href="#section3">OrderList</a></li>
                            <li><a href="InsertNewEmp.jsp">Create New Employee</a></li>
                        </ul><br>                        
                    </div>
                    <%-- here is the left side --%>
                    <div class="col-sm-9">
                        <h3><small>Welcomme mr: <% out.print(session.getAttribute("ename"));%></small></h3>
                        <hr>
                        <h5><span class="glyphicon glyphicon-time"></span> Post by Jane Dane, Sep 27, 2015.</h5>     


                        <%
                            String keyword = "";
                            if (request.getParameter("Keyword") != null) {
                                keyword = request.getParameter("Keyword");
                            }
                        %>
                        <form name="frmSearch" method="GET" action="ViewCustomerInfo.jsp">
                            <div class="input-group">
                                <input type="text" class="form-control" id="Keyword" placeholder="Search Customer ID" name="Keyword" value="<%=keyword%>">
                                <div class="input-group-btn">
                                    <button class="btn btn-default" type="submit" value="Search"><i class="glyphicon glyphicon-search"></i></button>
                                </div>
                            </div>
                        </form>
                        <%

                            Connection connect = null;
                            Statement s = null;
                            try {

                                Class.forName("com.mysql.jdbc.Driver");

                                connect = DriverManager.getConnection("jdbc:mysql://localhost/jfog" + "?user=root&password=1234");

                                s = connect.createStatement();

                                String sql = "SELECT * FROM customer WHERE id like '%" + keyword + "%' " + " ORDER BY id ASC";

                                System.out.println(sql);

                                ResultSet rec = s.executeQuery(sql);
                        %>

                        <h2>List of customer</h2>
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th>CustomerID</th>
                                    <th>FirstName</th>
                                    <th>Lastname</th>
                                    <th>Adress</th>
                                    <th>Phone</th>
                                    <th>Email</th>
                                    <th>FK_ono</th>
                                </tr>
                            </thead>
                            <%while ((rec != null) && (rec.next())) {%>
                            <tbody>
                                <tr>

                                    <td><%=rec.getInt("id")%></td>
                                    <td><%=rec.getString("fname")%></td>
                                    <td><%=rec.getString("lname")%></td>
                                    <td><%=rec.getString("adress")%></td>
                                    <td><%=rec.getInt("cphone")%></td>
                                    <td><%=rec.getString("mail")%></td>             

                                </tr>
                            </tbody>
                            <%}%>          
                        </table>


                        <%

                            } catch (Exception e) {

                                // TODO Auto-generated catch block
                                out.println(e.getMessage());

                                e.printStackTrace();

                            }

                            try {

                                if (s != null) {

                                    s.close();

                                    connect.close();

                                }

                            } catch (SQLException e) {

                                // TODO Auto-generated catch block
                                out.println(e.getMessage());

                                e.printStackTrace();

                            }

                        %>


                    </div>
                </div>
            </div> <%-- End the left side--%>
        </div><br><br><%-- her slutter div container  --%> 


    </body>
</html>
