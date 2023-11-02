<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 02.11.2023
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Managers</title>
</head>
<body>
 <h2>Все менеджеры!</h2>
<table>
    <tr>
        <th>ID</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Статус</th>
        <th>дата рег</th>
        <th>дата изм</th>
    </tr>

    <c:forEach var="man" items="${allManags}">
        <tr>
            <td>${man.id}</td>
            <td>${man.firstName}</td>
            <td>${man.lastName}</td>
            <td>${man.status}</td>
            <td>${man.createdAt}</td>
            <td>${man.updatedAt}</td>
        </tr>

    </c:forEach>

</table>

</body>
</html>
