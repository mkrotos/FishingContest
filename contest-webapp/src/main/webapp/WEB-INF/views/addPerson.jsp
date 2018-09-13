<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: makro
  Date: 13.09.2018
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fishing Contest - add person</title>
</head>
<body>
<div align="center">
    <h1>New Person</h1>

    <form:form action="savePerson" method="post" modelAttribute="person">
        <table>
            <tr>
                <td>Id:</td>
                <td><form:input path="id" /></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Surname:</td>
                <td><form:input path="surname" /></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><form:input path="age" /></td>
            </tr>
            <tr>
                <td>Mail:</td>
                <td><form:input path="mail" /></td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td><form:input path="phoneNumber" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>

    <p>${message}</p>
    <a href="/people">Back to list</a>

</div>

</body>
</html>
