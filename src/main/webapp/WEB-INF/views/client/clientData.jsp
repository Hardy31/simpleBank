<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 24.10.2023
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <header>
        <a href="login"> Для работы со своим счетом нажмите здесь</a> <br>
    </header>
    <main>
        <table>
            <tr>
                <td>Имя</td> <td>Фамилия</td> <td>Адрес</td> <td>Телефон</td> <td>Номер счета</td> <td>Пароль</td>
            </tr>
            <tr>
                <td>${first_name}</td> <td>${last_name}</td> <td>${address}</td> <td>${phone}</td> <td>${check_number}</td> <td>${pass}</td>
            </tr>
        </table>
    </main>

</body>
</html>


