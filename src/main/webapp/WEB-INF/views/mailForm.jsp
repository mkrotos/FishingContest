<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: makro
  Date: 20.09.2018
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Send Mail</title>
</head>
<body>
<div align="center">
    <h1>Send mail</h1>

    <form:form action=""  method="post" modelAttribute="mail">
        <table>

            <form:hidden path="recipientEmail"/>

            <tr>
                <td>Subject:</td>
                <td><form:input size="40" type="text" path="subject" required="required" />
            </tr>
            <tr>
                <td>Content:</td>
                <td><form:input size="40" type="text" path="content" required="required" />
            </tr>

            <tr>
                <td colspan="2" align="center"><input type="submit" value="Send"></td>
            </tr>
        </table>
    </form:form>

    <a href="/people">Back to list</a>

</div>
</body>
</html>
