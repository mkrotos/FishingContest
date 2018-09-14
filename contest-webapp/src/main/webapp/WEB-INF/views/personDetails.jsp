<%--
  Created by IntelliJ IDEA.
  User: makro
  Date: 12.09.2018
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fishing Contest: ${person.name} ${person.surname}</title>
</head>
<body>
<h1>${person.name} ${person.surname}</h1>

<p>Id: ${person.id}</p>
<p>Name: ${person.name}</p>
<p>Surname: ${person.surname}</p>
<p>Age: ${person.age}</p>
<p>Sex: ${person.sex}</p>
<p>Phone number: ${person.phoneNumber}</p>
<p>Mail: ${person.mail}</p>

<a href="/people">Back to list</a>
</body>
</html>
