<%-- 
    Document   : DetailProfile
    Created on : Jul 19, 2023, 5:22:33 AM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "model.Profile" %>
<%@page import= "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>    
    <center>
        <%--<c:set var="c" value="${requestScope.info}"/>--%>
        <h1 style="color: blue ">Student profile</h1>

        <br><br><br>
        <table outerborder="1" width="42%">
            <c:forEach var="o" items="${requestScope.info}">
                <c:set var="id" value="${o.studentid}"/> 
                <a href="edit?studentid=${o.studentid}">Update</a>   
                <tr>
                    <td >Student ID: </td>
                    <td>${o.studentid}</td>
                </tr>
                <tr>
                    <td>First Name: </td>
                    <td>${o.firstname}</td>
                </tr>
                <tr>
                    <td>Last Name: </td>
                    <td>${o.lastname}</td>
                </tr>
                <tr>
                    <td width="10%">Date of Birth: </td>
                    <td width="12%">${o.dateofbirth}</td>
                    <td width="6%" >Gender: </td>
                    <td width="14%" >
                        <c:if test="${o.gender == 1}">
                            Male
                        </c:if>
                        <c:if test="${o.gender == 0}">
                            Female
                        </c:if>
                    </td>
                </tr>
                <tr>
                    <td>Address: </td>
                    <td>${o.address}</td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td>${o.email}</td>
                </tr>
                <tr>
                    <td>Phone: </td>
                    <td>${o.phone}</td>
                </tr>
                <tr>
                    <td>Guardian Name: </td>
                    <td>${o.guardianname}</td>
                </tr>
                <tr>
                    <td>Guardian Phone: </td>
                    <td>${o.guardianphone}</td>
                </tr>
                <tr>
                    <td>Admission Date: </td>
                    <td>${o.admissiondate}</td>
                </tr>
                <tr>
                    <td>Field of study: </td>
                    <td>${o.field_of_study}</td>
                </tr>
                <tr>
                    <td>Class Section: </td>
                    <td>${o.classsection}</td>
                </tr>
                <tr>
                    <td>Scholarship Type: </td>
                    <td>${o.photoid}</td>
                </tr>
            </c:forEach>
        </table>        
    </center>
    <center>
        <a href="#" onclick="doDelete(${id})">Delete</a>
    </center>
</body>
    <script>
        function doDelete(studentid) {
            var option = confirm("Do you want to delete this student?");
            if (option === true) {
                window.location.href = 'delete?studentid='+studentid;
            }
        }
    </script>
</html>
