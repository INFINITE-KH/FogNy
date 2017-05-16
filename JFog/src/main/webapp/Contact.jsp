
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Contact</title>
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
        <jsp:include page="includes/Header.jsp"></jsp:include> <%-- header son indhold boostrap--%>
        <title> Contact form</title>
        <style>
            #formwrapper {
                width: 300px;
                height: auto;
            /*background-color: #FFF;*/
            }
            form{
                width: 300px;
                height: auto;
              /*  background-color:#FFF;*/ 
            }
            fieldset{
                /*background-color:#F1FBFB;*/
                border: none;
                padding-bottom: 10px;
            }
            label{
                width: 250px;
                display:block;
                font-family: "Trebuchet MS", Helvetica, sans-serif;
                font-size: 11px;
                color: #000;
                margin-top: 5px;
                margin-right: 0px;
                margin-bottom: 5px;
                margin-left: 0px;
            }
            input {
                width: 259px;
                border: thin solid #6CF;
                margin-bottom: 10px;
            }
            .btn{
                width:70px;
                height: 50px;
                font-family: "trebuchet MS", Selvetica, sans-serif;
                color: #FFF;
                font-weight: bold;
                background-color: #6CF;
                margin-left: 10px;
                float: left;
            }
        </style>
    </head>    

    <body>
                <div class="container" style="background-color: white;">

        <div id="formwrapper" style="float:left;">
            <form action="" method="post">
                <fieldset>
                    <h1>Contact form</h1>
                    <label for="name">Your name:</label>
                    <input name="name" type="text" size="40" maxlength="100">
                    <label for="email">Your Email:</label>
                    <input name="email" type="text" size="40" maxlength="100">
                    <label for="phone">Your phone number:</label>
                    <input name="phone" type="text" size="40" maxlength="100">
                    <label for="message">Your message:</label>
                    <textarea name="message" cols="40" rows="10"></textarea>
                    <input class="btn" name="submit" type="submit" value="send">


                </fieldset>
            </form>

        </div>



            <form style="float:right;">

                <legend><span class="glyphicon glyphicon-globe"></span>Â Kontakt</legend>
                <address>
                    <strong>Johannes Fog A/S </strong><br>
                    Firskovvej 20<br>
                    2800 Lyngby <br>
                    <abbr title="Phone">
                        P:</abbr>
                    45 87 10 01 
                </address>
                <address>
                    <strong>Full Name</strong><br>
                    <a href="mailto:#">first.last@example.com</a>
                </address>
            </form>


        </div>

    </body>
</html>
