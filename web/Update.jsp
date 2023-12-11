<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "model.Profile" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1 style="color: red">Update profile</h1> 
        <form method = "post" action="edit">
            <table >
                <tbody>
                    <tr>
                        <td>Student ID:</td>
                        <td><input type="text" value="${u.studentid}" name="studentid" readonly></td>
                    </tr>
                    <tr>
                        <td>First Name:</td>
                        <td><input value="${u.firstname}" type="text" name="firstname"/></td>
                    </tr>
                    <tr>
                        <td>Last Name: </td>
                        <td><input value="${u.lastname}" type="text" name="lastname"/></td>
                    </tr>
                    <tr>
                        <td>Date of Birth: </td>
                        <td><input value="${u.dateofbirth}" type="date" name="dateofbirth"/></td>
                    </tr>
                    <tr>
                        <td>Gender: </td>
                        <td>
                            <input value="1" type="radio" name="gender" ${u.gender==1?"checked":""}/>Male
                            <input value="0" type="radio" name="gender" ${u.gender==0?"checked":""}/>Female
                        </td>
                    </tr>
                    <tr>
                        <td>Address: </td>
                        <td><input value="${u.address}" type="text" name="address"/></td>
                    </tr>
                    <tr>
                        <td>Email: </td>
                        <td><input value="${u.email}" type="text" name="email"/></td>
                    </tr>
                    <tr>
                        <td>Phone: </td>
                        <td><input value="${u.phone}" type="text" name="phone"/></td>
                    </tr>
                    <tr>
                        <td>Guardian Name: </td>
                        <td><input value="${u.guardianname}" type="text" name="guardianname"/></td>
                    </tr>
                    <tr>
                        <td>Guardian Phone: </td>
                        <td><input value="${u.guardianphone}" type="text" name="guardianphone"/></td>
                    </tr>
                    <tr>
                        <td>Admission Date: </td>
                        <td><input value="${u.admissiondate}" type="date" name="admissiondate"/></td>
                    </tr>
                    <tr>
                        <td>Field of Study: </td>
                        <td><input value="${u.field_of_study}" type="text" name="field_of_study"/></td>
                    </tr>
                    <tr>
                        <td>Class Section: </td>
                        <td><input value="${u.classsection}" type="text" name="classsection"/></td>
                    </tr>
                    <tr>
                        <td>Scholarship Type:</td>
                        <td><input value="${u.photoid}" type="text" name="photoid"/><br/></td>
                    </tr>
                </tbody>
            </table>                   
            <input type="submit" value="SAVE"/>
        </form> 
    </center>
    </body>
</html>
