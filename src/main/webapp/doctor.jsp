<%-- 
    Document   : doctor
    Created on : Mar 28, 2017, 11:35:33 AM
    Author     : Saiteja
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.model.Doctor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/doctorCss.css">
        
        <script src="scripts/doctorScript.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <header class="doctor">
            <nav class="doctor">
                <a class="doctor" id="add">Add Doctor</a>
                <a class="doctor" id="show">Show Doctors</a>
                <a class="doctor" id="delete">Delete Doctor</a>
                <a class="doctor" id="edit">Edit Doctor</a>
            </nav>
        </header>

        <div class="doctor" id="adddisplay">
            <form action="DoctorController" method="get">
                <table>
                    <tr>
                        <td>Enter Name</td>
                        <td><input type="text" name="name" value="" required=""/></td>
                    </tr>
                    <tr>
                        <td>Enter Gender</td>
                        <td><input type="text" name="gender" value="" required=""/></td>
                    </tr>
                    <tr>
                        <td>Enter Phone Number</td>
                        <td><input type="number" max="10" name="phoneNumber" value="" required=""/></td>
                    </tr>
                    <tr>
                        <td>Enter Address</td>
                        <td><input type="text" name="address" value="" required=""/></td>
                    </tr>
                    <tr>
                        <td>Enter Qualification</td>
                        <td><input type="text" name="qualification" value="" required=""/></td>
                    </tr>
                    <tr><td colspan="2"><input type="submit" value="click" name="click" /></td></tr>
                </table>
                
            </form>

        </div>
        <div class="doctor" id="showdisplay">
            
            <table border="1px">
                <tr>
                    <th>Doctor Id</th><th>Address</th><th>Gender</th><th>Name</th><th>Phone Number</th><th>Qualification</th>
                </tr>
                <c:if test="${sessionScope.doctor!=null}" >
                    <c:set var="doclist" value="${sessionScope.doctor}"></c:set>
                    <c:forEach var="doc" items="${doclist}">
                        <tr>
                            <td><c:out value="${doc.getDoctorID()}"></c:out></td>
                        </tr>
                    </c:forEach>
                </c:if>
            </table>
        </div>
        <div class="doctor" id="deletedisplay">
            in delete
        </div>
        <div class="doctor" id="editdisplay">
            in edit
        </div>

        
    </body>
</html>
