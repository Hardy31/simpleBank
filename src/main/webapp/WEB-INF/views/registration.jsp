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
  <h2>Для открытия счета ваши персональные данные для регистрации</h2>

  <br>
    <form action="login" method="post">
    <input type="text"  name="first_name" placeholder="write your first name " /> <br>
    <input type="text"  name="last_name" placeholder="write your last name "/> <br>
    <input type="text"  name="address" placeholder="write your address "/> <br>
    <input type="text"  name="phone" placeholder="write your phone "/> <br>
    <input type="password"  name="pass" placeholder="write your check "/> <br>

    <input type="submit">
  </form>
</main>
<footer>
  <br><br><br><br><br>
  <h2 align="center">footer</h2>

</footer>


</body>
</html>

