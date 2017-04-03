<%-- 
    Document   : index
    Created on : Mar 28, 2017, 11:30:18 AM
    Author     : Saiteja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HMS Login</title>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body >
        <div id="first">
            <header>
                <h1>HOSPITAL MANAGEMENT SYSTEM</h1>
            </header>
            <div id="main">
                <center id="border">
                    <table style="text-align:center;">
                        <tr>
                            <td>ADMIN ID:</td>
                            <td><input type="text" id="uname"/></td>
                        </tr>
                        <tr>
                            <td>PASSWORD:</td>
                            <td><input type="password" id="pass"/></td>
                        </tr>
                    </table>

                    <input type="button" value="submit" id="button"/>

                    <div>
                        <p id ="error"></p>
                    </div>
                </center>
            </div>
        </div>
        <div id="second">
            <article>
                This Hospital Management system manages patient info, staff info, stores and medicines, billing and report generation. This complex application communicates with a backend database server and manages all information related to Hospital logistics.
            </article>
        </div>
        <script>
            $(document).ready(function () {
                $("#button").click(function () {
                    var uname = $('#uname').val();
                    var pass = $('#pass').val();
                    $.ajax({
                        type: 'POST',
                        data: {uname: uname, pass: pass},
                        url: 'LoginController',
                        success: function (result) {
                            $('#error').html(result);
                            if(result==="correctPassword")
                               window.location.href = "home.jsp";
                        }
                    });
                });
            });
        </script>
    </body>
</html>
