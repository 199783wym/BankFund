<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html >
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>欢迎回来</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/media/layui/css/layui.css" media="all">
    <!-- <link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css"> -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/media/css/app.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/media/css/font-awesome.min.css">
    <script src="${pageContext.request.contextPath}/media/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/media/layui/layui.js"></script>

</head>

<body>
    <div class="layui-layout layui-layout-admin kit-layout-admin">
        <div class="layui-header" style="">
            <div class="layui-logo">
                <img src="${pageContext.request.contextPath}/media/images/zx_logo.png" style="margin-left: 10px;padding-top: 10px;height: 50px" />
                <span style="font-size: 22px"></span>
            </div>
            <div class="layui-nav-item" style="margin-left: 85%;padding-top: 30px">
                尚未有账号，
                <a href="regPage.jsp" style="color: #d58512">请注册 ></a>
            </div>
        </div>

        <div class="layui-fluid" >
            <div class="layui-row" style="margin-top: 64px">
                <div class="layui-col-md1" style="height: 200px"></div>
                <div class="layui-col-md7"
                     style="background: url(${pageContext.request.contextPath}/media/images/bgk.jpg) no-repeat center center;
                             height: 300px"></div>

                <div class="layui-col-md4" style="height: 300px; padding-left: 20px">
                    <div class="panel panel-primary">
                        <div class="panel-heading" style="margin-left: 80px">
                            <b style="font-size: 32px; color: #eb7350; text-align: center">欢迎回来</b>
                        </div>
                        <div class="panel-body" style="">
                            <form class="layui-form layui-form-pane" action="/login">

                                <div class="layui-form-item" style="margin-top: 16px">
                                    <label class="layui-form-label">手机号：</label>
                                    <div class="layui-input-inline">
                                        <input type="text" name="number" placeholder="请输入手机号" autocomplete="on" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-form-item" style="margin-top: 36px">
                                    <label class="layui-form-label">登录密码：</label>
                                    <div class="layui-input-inline">
                                        <input type="password" name="password" placeholder="请输入登录密码" autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                                <div style="margin-top: 40px; margin-left: 104px">
                                <button type="submit" class="layui-btn layui-btn-lg layui-btn-danger layui-btn-radius">登录</button>
                                </div>
                            </form>
                        </div>

                    </div>
                </div>
            </div>
        </div>

        <div class="layui-footer" style="background-color: transparent">
            <p>
                Copyright 2011-2018
                <a href="/" rel="nofollow" target="_blank" title="中信银行">中信银行有限公司 版权所有</a> 京ICP备12003911号-3 京公网安备11010802011455号
            </p>
        </div>
    </div>
</body>

</html>