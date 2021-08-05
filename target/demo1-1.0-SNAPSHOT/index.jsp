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
    <link rel="stylesheet" href="style.css">


</head>
<body>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

<style>
    body {
        background:  url(foto/patte.png) ;
    }
</style>
<header>

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-xxl">
            <a class="navbar-brand" href="#"><b>IPRIVEZ</b></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarText">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="index.jsp">Домой</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="aboutUs.jsp">О Нас</a>
                    </li>
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
<section>
    <div class="container-xxl">
        <div class="topnav-right">

            <div class="row">
                <div class="col-4">
                    <a href="/logInPage.jsp"><button type="button" style="width:300px" class="btn btn-dark">Войти</button>
                    </a>
                </div>
            </div>
        </div>
    </div>
    </div>
</section>
<section>
    <div class="container-xxl">
        <div class="row">
            <div class="col-4">
                <a href="/registerFalse.jsp"> <button type="button" style="width:300px" class="btn btn-dark">Регистрация</button></a>
            </div>
        </div>
    </div>
    <br>
</section>

<br>
<br>


<div class="hero-image">

    <div class="hero-text">
        <h1><b>IPRIVEZ</b></h1>
        <br>
        <a href="/aboutUs.jsp"><button type="button" style="width:400px"  class="btn btn-dark">Как это работает? </button></a>

    </div>
</div>
<br>
<br>

<br>
</body>
</html>