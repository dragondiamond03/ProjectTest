<%-- 
    Document   : Add
    Created on : Jul 20, 2023, 11:12:40 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <center>
        <h1 style="color: red">Update profile</h1> 
        <form method = "post" action="add">
            <table >
                <tbody>
                    <tr>
                        <td>Student ID:</td>
                        <td><input type="text" value="" name="studentid"></td>
                    </tr>
                    <tr>
                        <td>First Name:</td>
                        <td><input value="" type="text" name="firstname"/></td>
                    </tr>
                    <tr>
                        <td>Last Name: </td>
                        <td><input value="" type="text" name="lastname"/></td>
                    </tr>
                    <tr>
                        <td>Date of Birth: </td>
                        <td><input value="" type="date" name="dateofbirth"/></td>
                    </tr>
                    <tr>
                        <td>Gender: </td>
                        <td>
                            <input value="1" type="radio" name="gender"/>Male
                            <input value="0" type="radio" name="gender"/>Female
                        </td>
                    </tr>
                    <tr>
                        <td>Address: </td>
                        <td><input value="" type="text" name="address"/></td>
                    </tr>
                    <tr>
                        <td>Email: </td>
                        <td><input value="" type="text" name="email"/></td>
                    </tr>
                    <tr>
                        <td>Phone: </td>
                        <td><input value="" type="text" name="phone"/></td>
                    </tr>
                    <tr>
                        <td>Guardian Name: </td>
                        <td><input value="" type="text" name="guardianname"/></td>
                    </tr>
                    <tr>
                        <td>Guardian Phone: </td>
                        <td><input value="" type="text" name="guardianphone"/></td>
                    </tr>
                    <tr>
                        <td>Admission Date: </td>
                        <td><input value="" type="date" name="admissiondate"/></td>
                    </tr>
                    <tr>
                        <td>Field of Study: </td>
                        <td><input value="" type="text" name="field_of_study"/></td>
                    </tr>
                    <tr>
                        <td>Class Section: </td>
                        <td><input value="" type="text" name="classsection"/></td>
                    </tr>
                    <tr>
                        <td>Photo:</td>
                        <td><input value="" type="text" name="photoid"/><br/></td>
                    </tr>
                </tbody>
            </table>                   
            <input type="submit" value="SAVE"/>
        </form> 
    </center>
    </body>
</html>
