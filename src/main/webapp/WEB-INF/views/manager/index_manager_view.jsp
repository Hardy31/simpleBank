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

    <a href="http://localhost:8080/tmvc/manager/"> Вернуться на стартовую страницу</a>
    <br><br>
</header>
<main>
    <h2>Для входа в качестве МЕНЕДЖЕРА введите Ваши ID </h2>

    <br> <br>
    <form action="id" method="get">
        <input type="text"  name="idex" placeholder="write your ID "/><br>


        <input type="submit">
    </form>
</main>
<footer>
    <br><br><br><br><br>
    <h2 align="center">footer</h2>

</footer>


</body>
</html>

