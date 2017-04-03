<%-- 
    Document   : home
    Created on : Mar 28, 2017, 11:32:07 AM
    Author     : Saiteja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>HMS Home</title>
    </head>
    <body id="home">
        <header id="homeheader">
            WELCOME TO HOSPITAL MANAGEMENT TOOL
            <a id="logout" href="index.jsp">Logout</a>
        </header>
        <ul>
           <li><a id="doc">Doctor Details</a></li> 
           <li><a id="in">In Patients</a> </li>
           <li><a id="out">Out Patient</a></li>
           <li><a id="bill">Billing</a></li>
           <li><a id="room">Room</a></li>
        </ul>
        <aside id="pageloading">
            
        </aside>
        
        <script>
            $(document).ready(function (){
                $("#doc").click(function (){
                    $("#pageloading").load("doctor.jsp");
                });
                $("#in").click(function (){
                    $("#pageloading").load("inPatient.jsp");
                });
                $("#out").click(function (){
                    $("#pageloading").load("outPatient.jsp");
                });
                $("#bill").click(function (){
                    $("#pageloading").load("inPatientBilling.jsp");
                });
                $("#room").click(function (){
                    $("#pageloading").load("room.jsp");
                });
            });
        </script>
    </body>
</html>
