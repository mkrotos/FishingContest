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
                <td><form:input type="number"  path="id" required="required" />
                    <form:errors path="id" cssClass="error"/> </td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><form:input type="text" path="name" required="required" />
                    <form:errors path="name" cssClass="error"/></td>
            </tr>
            <tr>
                <td>Surname:</td>
                <td><form:input type="text" path="surname" required="required" />
                    <form:errors path="surname" cssClass="error"/></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><form:input type="number" path="age" />
                    <form:errors path="age" cssClass="error"/></td>
            </tr>
            <tr>
                <td>Mail:</td>
                <td><form:input type="email" path="mail" />
                    <form:errors path="mail" cssClass="error"/></td>
            </tr>
            <tr>
                <td>Phone:</td>

                <td><form:input  type="number" path="phoneNumber" />
                    <form:errors path="phoneNumber" cssClass="error"/></td>
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
