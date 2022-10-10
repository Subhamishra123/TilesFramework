<%@ page language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
<c:when test="${!empty facultiesList }">
<table border="1" align="center">
<tr>
<th>FACULTYID</th><th>FACULTYNAME</th><th>FACULTYQLFY</th><th>FACULTYSUBJECT</th>
</tr>
<c:forEach var="faculty" items="${facultiesList}">
<tr>
<td>${faculty.facultyId}</td>

<td>${faculty.facultyName}</td>


<td>${faculty.facultyQlfy}</td>

<td>${faculty.facultySubject}</td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color:red;text-align: center;">Empty Table</h1>
</c:otherwise>

</c:choose>