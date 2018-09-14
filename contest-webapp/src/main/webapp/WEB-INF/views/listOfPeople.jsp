<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: makro
  Date: 12.09.2018
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fishing Contest</title>
</head>
<body>
<h1>List of people in database</h1>
<a href="/people/addView">Add new</a>

<p>${list}</p>
<br>

<c:if test="${!empty list}">
    <table border="1">

        <th>Id</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Mail</th>
        <th>Details</th>
        <th>Delete</th>

        <c:forEach var="person" items="${list}">
            <tr>
                <td>${person.id}</td>
                <td>${person.name}</td>
                <td>${person.surname}</td>
                <td>${person.mail}</td>
                <td><a href="<c:url value="/people/${person.id}" />">Details</a></td>
                <td><a href="<c:url value="/people/${person.id}" />">Delete</a></td>
            </tr>

        </c:forEach>

    </table>
</c:if>

</body>
</html>
