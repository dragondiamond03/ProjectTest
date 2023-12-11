<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> <title>JSP Page</title> 
    </head>
    <body>
    <center>       
        <h1 style="color: blue ">Student profile list</h1>
        <h3><a href="Add.jsp">Add new profile</a></h3>
        <form method="get" action="profilelist">
            Name: <input type="text" name="search"><input type="submit" value="Search"><!-- comment -->
        </form>
        <table border="1px" width="50%"> 
            <tr>
                <td width="5%" style="text-align: center; color: red"> Profile ID</td>
                <td width="5%" style="text-align: center; color: red">Student ID</td> 
                <td width="17%" style="text-align: center; color: red">Full Name</td> 
                <td width="7%" style="text-align: center; color: red">Gender</td> 
                <td width="6%" style="text-align: center; color: red">Admission Date</td>      
                <td width="10%" style="text-align: center; color: red">Detail Information</td>                     
            </tr> 
            <c:forEach var="c" items="${data}">
                <tr>
                    <td style="text-align: center">${c.pid}</td> 
                    <td style="text-align: center">${c.id}</td> 
                    <td>${c.fullname}</td> 
                    <td style="text-align: center">
                        <c:if test="${c.sex == 1}">
                            Male
                        </c:if>
                        <c:if test="${c.sex == 0}">
                            Female
                        </c:if>
                    </td>
                    <td style="text-align: center">${c.admissiondate}</td>
                    <td style="text-align: center"><a href="detail?StudentID=${c.id}">Detail</a></td>
                </tr> 
            </c:forEach>
        </table>
    </center>
</body>
</html>
