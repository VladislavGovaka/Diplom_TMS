<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All offers</title>
</head>
<body>


</body>
</html>

<%--        <input type="submit" value="подтвердить">--%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All items of Restaurant</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>
<body>


</body>
</html>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=1200, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Main page</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="TableForRest.css">


</head>
<body>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

<style>
    body {
        background: url(foto/1587328199_29-p-svetlie-foni-dlya-saitov-60.jpg);
    }
</style>
<header>

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-xxl">
            <a class="navbar-brand" href="#"><b>IPRIVEZ</b></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText"
                    aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarText">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="index.jsp">Домой</a>
                    </li>
                    <%--                    <li class="nav-item">--%>
                    <%--                        <a class="nav-link" href="#">О Нас</a>--%>
                    <%--                    </li>--%>
                    <li class="nav-item">
                        <a class="nav-link" href="info.jsp">Разработчики</a>
                    </li>
                </ul>
                <span class="navbar-text">
        С нами быстрее
      </span>
            </div>
        </div>
    </nav>
</header>

<br>
<table align="center" class="table" style="max-width: 500px">
    <thead>
    <tr>
        <th scope="col">Компания</th>
        <th scope="col">Товар</th>
        <th scope="col">Колличество</th>
        <th scope="col">Цена</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ItemList}" var="item" varStatus="loop">
        <form action="/offerPrice" method="post">
            <tr>
                <td><c:out value="${item.companyName}"/></td>
                <td><c:out value="${item.name}"/></td>
                <td><c:out value="${item.quantity}"/></td>
                <td><input type="text" size="7px" name="offer_price"></td>
                <td><input type="hidden" id="product_id" name="id" value="${item.id}"></td>
                <td><input type="submit" value="Подтвердить">
        </form>
        </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</section>
<br>
</body>
</html>






