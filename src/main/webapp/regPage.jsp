<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>欢迎您注册成为我行用户</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/media/layui/css/layui.css" media="all">
    <!-- <link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css"> -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/media/css/app.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/media/css/font-awesome.min.css">
    <script src="${pageContext.request.contextPath}/media/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/media/layui/layui.js"></script>
    <script>
        //Demo
        layui.use(['form'], function(){
            var form = layui.form;
            form.render();
            // //监听提交
            // form.on('submit(formDemo)', function(data){
            //     layer.msg(JSON.stringify(data.field));
            //     return false;
            // });
        });
    </script>



    <script type="text/javascript" language="JavaScript">

        $(document).ready(function(){
            $('#addUser').click(function () {
                $.ajax({
                    type: "post",
                    url: "/",
                    data: {
                        user_id: $,
                        user_name: $,
                        user_pwd: $,
                    },
                    datatype: "JSON",
                    async: false,
                    beforeSend: function () {
                        alert("正在提交....");
                    },
                    success: function (data) {
                        if (data == -1){

                        } else if (data == 0){

                        } else {
                            alert("注册成功");
                            window.location.href("#loginPage.jsp");
                        }
                    },
                    error: function(){
                        alert("提交失败，请重试！");
                    }
                })
            });
        })

    </script>
</head>

<body>
    <div class="layui-layout layui-layout-admin kit-layout-admin">
        <div class="layui-header">
            <div class="layui-logo">
                <img src="${pageContext.request.contextPath}/media/images/zx_logo.png" style="margin-left: 10px;padding-top: 10px;height: 50px" />
                <span style="font-size: 22px"></span>
            </div>
            <div class="layui-nav-item" style="margin-left: 85%;padding-top: 30px">
                <a href="loginPage.jsp" style="color: #d58512">已有账号，请登录 ></a>
            </div>
        </div>

        <div class="panel panel-primary" style="margin-top: 32px;margin-left: 15%;margin-right: 15%;">
            <div class="panel-heading">
                <b style="font-size: 32px">欢迎注册成为我行基金用户</b>
                <hr>
            </div>

            <div class="panel-body" style="margin-top: 24px; margin-left: 15%">
                <form class="layui-form layui-form-pane" action="">
                    <div class="layui-form-item" style="margin-top: 40px">
                        <label class="layui-form-label">用户名</label>
                        <div class="layui-input-inline" style="width: 240px">
                            <input type="text" name="user-name" placeholder="请设置您的用户名" autocomplete="on" class="layui-input">
                        </div>
                    </div>

                    <div class="layui-form-item" style="margin-top: 40px">
                        <label class="layui-form-label">手机号</label>
                        <div class="layui-input-inline" style="width: 240px">
                            <input type="text" name="password" placeholder="请输入您的手机号码" autocomplete="off" class="layui-input">
                        </div>
                    </div>

                    <div class="layui-form-item" style="margin-top: 40px">
                        <label class="layui-form-label">密码</label>
                        <div class="layui-input-inline" style="width: 240px">
                            <input type="password" name="password" placeholder="请输入密码" autocomplete="off" class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux">8-20位字母、数字的组合</div>
                    </div>

                    <div class="layui-form-item" style="margin-top: 40px">
                        <label class="layui-form-label">密码确认</label>
                        <div class="layui-input-inline" style="width: 240px">
                            <input type="password" name="password" placeholder="请输入密码" autocomplete="off" class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux">请重复您设置的密码</div>
                    </div>

                    <div class="layui-form-item" style="margin-top: 40px">
                        <label class="layui-form-label">绑定身份证</label>
                        <div class="layui-input-inline" style="width: 240px">
                            <input type="text" name="password" placeholder="请输入正确的身份证号" autocomplete="off" class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux">请输入本人的身份证号</div>
                    </div>

                    <div class="layui-form-item" style="margin-top: 40px">
                        <label class="layui-form-label">绑定银行卡</label>
                        <div class="layui-input-inline" style="width: 240px">
                            <input type="text" name="password" placeholder="请输入关联手机号的银行卡" autocomplete="off" class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux">请输入正确的银行卡号</div>
                    </div>

                    <div class="layui-form-item" style="margin-top: 40px">
                        <div class="layui-input-block">
                            <input type="checkbox" name="" title="我已阅读并同意，《用户协议》" lay-skin="primary">
                        </div>
                    </div>
                </form>

                <div style="text-align: left; margin-top: 40px">温馨提示：为保障您的支付安全，请您设置单独的登录密码，请勿使用与您常用软件和网站相同相似的密码。</div>


                <div style="margin-top: 40px; margin-left: 32.5%;">
                    <button id="addUser" type="button" class="layui-btn layui-btn-lg layui-btn-danger layui-btn-radius">注册</button>
                </div>

            </div>
        </div>



        <div class="layui-footer">
            <p>
                Copyright 2011-2018
                <a href="/" rel="nofollow" target="_blank" title="中信银行">中信银行有限公司版权所有</a> 京ICP备12003911号-3 京公网安备11010802011455号
            </p>
        </div>
    </div>
</body>

</html>