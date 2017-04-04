<%-- 
    Document   : inPatient
    Created on : Mar 28, 2017, 11:35:09 AM
    Author     : Saiteja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Inpatient Registration</h2>

        <form method="post" action="InpatientController">
            Patient Name:<input type="text" name="patientName"/>
            <br>
            Age:<input type="number" min="1" max="100" name="pAge"/>
            <br>
            Gender:<br>
            <input type="radio" name="gender" value="male"> Male<br>
            <input type="radio" name="gender" value="female"> Female<br>
            <input type="radio" name="gender" value="other"> Other
            <br>
            Phone Number:<input type="number" name="pPhoneNumber"/>
            <br>
            Address:<input type="text" name="pAddress"/>    
            <br>
            Choose Doctor:<br>
            <select name="doctors">
                <option value="1">Smith</option>
                <option value="2">John</option>
                <option value="3">Felina</option>
            </select>
            <br>
            Admit Date:<input type="date" name="admitDate"/>
            <br>
            Discharge Date:<input type="date" name="dischargeDate"/>
<!--            <br>
            Room Type:<br>
            <select name="roomType">
                <option value="1">Luxury</option>
                <option value="2">Deluxe</option>
                <option value="3">Economy</option>
            </select>-->
            <br>
            Room Number:<input type="number" name="roomNum"/>
            <br>

            <input type="submit" name="addPatient" value="Add Patient"/>
            <!--            <button id="addPatient" name="addPatient">Add Patient</button>-->

        </form>

    </body>
</html>
