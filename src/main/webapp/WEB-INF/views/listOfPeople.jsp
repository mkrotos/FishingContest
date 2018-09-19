

<%--
  Created by IntelliJ IDEA.
  User: makro
  Date: 12.09.2018
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Fishing Contest</title>
</head>
<body>
<h1>List of people in database</h1>
<a href="/people/addView">Add new</a>


<br>

<c:if test="${!empty list}">
    <table border="1">

        <th width="80">Id</th>
        <th width="120">Name</th>
        <th width="120">Surname</th>
        <th width="200">Mail</th>
        <th width="80">Details</th>
        <th width="80">Delete</th>

        <c:forEach var="person" items="${list}">
            <tr>
                <td>${person.id}</td>
                <td>${person.name}</td>
                <td>${person.surname}</td>
                <td>${person.mail}</td>
                <td><a href="<c:url value="/people/${person.id}" />">Details</a></td>
                <td><a href="<c:url value="/people/${person.id}/delete" />">Delete</a></td>
            </tr>

        </c:forEach>

    </table>
</c:if>

<a href="/">Back to main page</a>


</body>
</html>
