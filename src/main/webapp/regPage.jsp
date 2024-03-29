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
        layui.use(['form', 'layer'], function(){
            form = layui.form;
            layer = layui.layer;
            form.render();

            //表单验证
            form.verify({
                username: function(value){ //value：表单的值、item：表单的DOM对象
                    if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
                        return '用户名不能有特殊字符';
                    }
                    if(/(^\_)|(\__)|(\_+$)/.test(value)){
                        return '用户名首尾不能出现下划线\'_\'';
                    }
                    if(/^\d+\d+\d$/.test(value)){
                        return '用户名不能全为数字';
                    }
                },
                password: function(value) {
                    if(/^[\S]{6,12}$/.test(value)){
                        return "密码必须6到12位，且不能出现空格";
                    }
                }
            });

            //表单控件监听
            form.on("checkbox(checkAgree)", function (obj) {
                // layer.msg(obj.elem.checked);
                var agreed = obj.elem.checked;
                if (agreed){
                    // layer.msg("ok");
                    $("#addUser").enabled();
                }else{
                    // layer.msg("no");
                    $("#addUser").disabled();
                }
            })
        });
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
            已有账号，<a href="loginPage.jsp" style="color: #d58512">请登录 ></a>
        </div>
    </div>

    <div class="panel panel-primary" style="margin-top: 32px;margin-left: 15%;margin-right: 15%;">
        <div class="panel-heading">
            <b style="font-size: 32px">欢迎注册成为我行基金用户</b>
            <hr>
        </div>

        <div class="panel-body" style="margin-top: 24px; margin-left: 15%">
            <form class="layui-form layui-form-pane" action="/regPage">
                <div class="layui-form-item" style="margin-top: 40px">
                    <label class="layui-form-label">
                        用户名</label>
                    <div class="layui-input-inline" style="width: 240px">
                        <input id="accountName" type="text" name="accountName" required lay-verify="username" placeholder="请设置您的用户名" autocomplete="on" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux"><span style="color: red">*</span>必填项</div>
                </div>

                <div class="layui-form-item" style="margin-top: 40px">
                    <label class="layui-form-label">手机号</label>
                    <div class="layui-input-inline" style="width: 240px">
                        <input id="accountPhone" type="text" name="accountPhone" required lay-verify="required|phone|number" placeholder="请输入您的手机号码" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux"><span style="color: red">*</span>必填项</div>
                </div>

                <div class="layui-form-item" style="margin-top: 40px">
                    <label class="layui-form-label">密码</label>
                    <div class="layui-input-inline" style="width: 240px">
                        <input id="accountPwd1" type="password" name="accountPasswd" required lay-verify="password" placeholder="请输入密码" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux"><span style="color: red">*</span>8-20位字母、数字的组合</div>
                </div>

                <div class="layui-form-item" style="margin-top: 40px">
                    <label class="layui-form-label">密码确认</label>
                    <div class="layui-input-inline" style="width: 240px">
                        <input id="accountPwd2" type="password" name="re_accountPasswd" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux"><span style="color: red">*</span>请重复您设置的密码</div>
                </div>

                <div class="layui-form-item" style="margin-top: 40px">
                    <label class="layui-form-label">绑定身份证</label>
                    <div class="layui-input-inline" style="width: 240px">
                        <input id="idenNumber" type="text" name="accountIdenNumber" required lay-verify="required" placeholder="请输入正确的身份证号" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux"><span style="color: red">*</span>请输入本人的身份证号</div>
                </div>

                <div class="layui-form-item" style="margin-top: 40px">
                    <label class="layui-form-label">绑定银行卡</label>
                    <div class="layui-input-inline" style="width: 240px">
                        <input id="bankCard" type="text" name="accountBankCard" required lay-verify="required|number" placeholder="请输入关联手机号的银行卡" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux"><span style="color: red">*</span>请输入正确的银行卡号</div>
                </div>

                <div class="layui-form-item" style="margin-top: 32px">
                    <div class="layui-input-block">
                        <input id="ck_agree" type="checkbox" lay-filter="checkAgree" title="我已阅读并同意，《用户协议》" lay-skin="primary">
                    </div>
                </div>


                <div style="text-align: left; margin-top: 24px">温馨提示：为保障您的支付安全，请您设置单独的登录密码，请勿使用与您常用软件和网站相同相似的密码。</div>

                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <div style="margin-top: 40px; margin-left: 32.5%;">
                            <button id="addUser" type="submit" class="layui-btn  layui-btn-lg layui-btn-danger layui-btn-radius" >注册</button>
                        </div>
                    </div>
                </div>


            </form>
        </div>
    </div>

</div>
</body>

</html>