<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 24.10.2023
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<header>

    <a href="http://localhost:8080/tmvc/"> Вернуться на стартовую страницу</a>
    <br> <br>
</header>
<main>
    <h2>Для входв в систему введите  Ваши данные</h2>

    <br>
    <form action="employeeData" method="post">
        <input type="text"  name="manager_id" placeholder="write your code "/> <br>
        <input type="password"  name="passWorker" placeholder="write your password"/> <br>

        <input type="submit">
    </form>
</main>
<footer>
    <br> <br> <br> <br> <br>
    <h2 align="center">footer</h2>

</footer>


</body>
</html>

