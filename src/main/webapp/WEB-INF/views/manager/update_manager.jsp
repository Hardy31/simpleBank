<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 09.11.2023
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update_manager</title>
</head>
<body>
<form:form action="addManager" method="post" modelAttribute="manager">
    Name <form:input path="firstName" /> <br>
    Surname <form:input path="lastName" /> <br>
        <form:input path="ManagerStatus." />
        Status <form:select path="status">
            <form:option value="ACTIVE" label="Активный"/>
            <form:option value="NOT_ACTIVE" label="Не активный"/>
            <form:option value="ON_VACATION" label="В отпуске"/>
            <form:option value="SICK_LEAVE" label="Больничный"/>
            <form:option value="BUSINESS_TRIP" label="Камандировка"/>
            <form:option value="PENSION" label="Пенсия"/>
            <form:option value="DISMISSED" label="Уволен"/>
        </form:select>

    <input type="submit" value="ok">
</form:form>
</body>
</html>
