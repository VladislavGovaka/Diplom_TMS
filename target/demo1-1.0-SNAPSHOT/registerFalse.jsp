<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=1200, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Регистрация</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="registrCss.css">
    <link rel="stylesheet" href="/css/bootstrap.min.css">


</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
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
<div class="login-block">
    <div class="login-block">
        <div class="login-block" style="max-width: 600px; margin: 0 auto">
            <div>
                <h1>Пару слов о вас</h1>
                <form action="/addUser" method="POST">
                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-user ti-user"></i></span>
                            <input name="companyName" class="form-control" placeholder="Имя компании">
                        </div>
                    </div>

                    <hr class="hr-xs">

                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-lock ti-unlock"></i></span>
                            <input type="password" name="password" class="form-control" placeholder="Ваш пароль">
                        </div>

                    </div>
                    <hr class="hr-xs">
                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-lock ti-unlock"></i></span>
                            <input name="email" class="form-control" placeholder="Ваш Email">
                        </div>
                    </div>

                    <hr class="hr-xs">
                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-lock ti-unlock"></i></span>
                            <input name="phoneNumber" class="form-control" placeholder="Номер телефона">
                        </div>
                    </div>

                    <hr class="hr-xs">
                    <div class="form-group">
                        <select name="role" class="form-select">
                            <option value="RESTAURANT">Ресторан</option>
                            <option value="SUPPLIER">Поставщик</option>
                        </select>
                    </div>

                    <button class="btn btn-primary btn-block" type="submit">Регистрация</button>
                </form>
            </div>
        </div>
    </div>
</div>
</body>

