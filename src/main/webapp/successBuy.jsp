<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <title ></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" href="/media/css/bootstrap.min.css">
    <link rel="stylesheet" href="/media/css/bootstrap-theme.min.css">

    <script src="/media/js/jquery-3.4.1.min.js"></script>
    <script src="/media/js/bootstrap.js"></script>
    <link rel="stylesheet" href="/media/css/bootstrap.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">


</head>
<body>

<div class="jumbotron">
    <h1><c:out value="${success}" default="error"></c:out></h1>
    <p></p>
    <p><a class="btn btn-primary btn-lg" href="/" role="button">回到主页</a></p>
</div>
</body>
</html>