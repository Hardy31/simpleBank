<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Введите данные</h2>
<h2>для добавления  нового менеджера в БД</h2>


<br>


<%--<p>${ manager.getFirstName()}</p>--%>



<%--<form action="addManager" method="post">--%>
<%--    <input type="text"  name="first_name" placeholder="write your first name " /> <br>--%>
<%--    <input type="text"  name="last_name" placeholder="write your last name "/> <br>--%>

<%--    <select name="status" >--%>
<%--        <option value="">--Please choose an option--</option>--%>
<%--        <option value="ACTIVE">ACTIVE</option>--%>
<%--        <option value="NOT_ACTIVE">NOT_ACTIVE</option>--%>
<%--        <option value="ON_VACATION">ON_VACATION</option>--%>
<%--        <option value="SICK_LEAVE">SICK_LEAVE</option>--%>
<%--        <option value="BUSINESS_TRIP">BUSINESS_TRIP</option>--%>
<%--        <option value="PENSION">PENSION</option>--%>
<%--        <option value="DISMISSED">DISMISSED</option>--%>
<%--    </select>--%>
<%--    <br>--%>
<%--    --%>
<%--    <input type="submit">--%>
<%--</form>--%>

<form:form action="addManager" method="post" modelAttribute="manager">
    Name <form:input path="firstName" /> <br>
    Surname <form:input path="lastName" /> <br>
<%--    <form:input path="ManagerStatus." />--%>
<%--    Status <form:select path="status">--%>
<%--        <form:option value=""--%>
<%--    </form:select>--%>

    <input type="submit" value="ok">
</form:form>



</body>
</html>
