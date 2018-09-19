<%--

  Created by IntelliJ IDEA.
  User: makro
  Date: 13.09.2018
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Fishing Contest - add person</title>
</head>
<body>


<div align="center">
    <h1>New Person</h1>

    <form:form action="savePerson" method="post" modelAttribute="person">
        <table>

            <form:hidden path="id"/>

            <tr>
                <td>Name:</td>
                <td><form:input type="text" path="name" required="required" />
            </tr>
            <tr>
                <td>Surname:</td>
                <td><form:input type="text" path="surname" required="required" />
            </tr>
            <tr>
                <td>Age:</td>
                <td><form:input type="number" path="age" />
           </tr>
            <tr>
                <td>Mail:</td>
                <td><form:input type="email" path="mail" />
            </tr>
            <tr>
                <td>Phone:</td>

                <td><form:input path="phoneNumber" />
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>

    <a href="/people">Back to list</a>

</div>

</body>
</html>
