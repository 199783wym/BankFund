<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>主页</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/media/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/media/css/app.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/media/css/font-awesome.min.css">

    <style type="text/css">
        iframe {
            width: 98%;
            height: 98%;
        }

        .layui-tab-item {
            height: 98%;
        }
    </style>
    <script src="${pageContext.request.contextPath}/media/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/media/layui/layui.js"></script>
    <script>
        //JavaScript代码区域
        var element;
        layui.config({
            base: 'media/layui/lay/modules/'
        }).use(['element', 'app'], function () {
            element = layui.element;
            if (${state==1}) {
                showTab(20000, "${pageContext.request.contextPath}/process/myTask", "首页");
            } else {
                showTab(20000, "${pageContext.request.contextPath}/loginlog/shounumber", "首页");
            }
        });
        var tid = -1;

        function showTab(id, u, n) {
            if (tid > 0) {
                element.tabDelete('demo', tid);
            }
            element.tabAdd('demo', {
                title: n
                ,
                content: '<iframe data-frameid="' + id + '" scrolling="auto" frameborder="0" src="' + u + '"></iframe>' //支持传入html
                ,
                id: id
            });
            element.tabChange('demo', id);
            element.render();
            tid = id;
        }

        //退出
        function exit() {
            if (confirm("确认退出吗？")) {
                location.href = "${pageContext.request.contextPath}/user/exituser";
            }
        }
	
    //退出
    function exit() {
		if(confirm("确认退出吗？")){
			location.href="${pageContext.request.contextPath}/user/exituser";
		}
	}

    </script>
    <style>
        .question{
            font-size: 20px;
            background: #bce8f1;
            border-radius:5px;
        }
        .anwser{
            font-size: 14px;
            background: aliceblue;
        }
    </style>
    <style type="text/css">
        ul {
            list-style: none;
        }


        a:hover{
            color: darkred;
        }

        .banner {
            width: 100%;
            height: 300px;
            margin: 100px auto;
            margin-bottom: 20px;
            position: relative;
            overflow: hidden;
            z-index: 1;
        }

        .img {
            position: absolute;
            top: 0;
            left: 0;
        }

        .des {
            position: absolute;
            bottom: 0;
            left: 0;
            z-index: -2;
            background: rgba(0, 0, 0, .4)
        }

        .des li {
            float: left;
            width: 100%;
        }

        .img li {
            float: left;
        }

        .num {
            position: absolute;
            bottom: 10px;
            width: 100%;
            text-align: center;
            font-size: 0;
        }

        .num li {
            width: 10px;
            height: 10px;
            background: rgba(0, 0, 0, 0.5);
            border-radius: 100%;
            display: inline-block;
            margin: 0 5px;
            cursor: pointer;
        }

        .btn {
            display: none;
        }

        .btn span {
            display: block;
            width: 50px;
            height: 100px;
            background: rgba(0, 0, 0, 0.6);
            color: #fff;
            font-size: 40px;
            line-height: 100px;
            text-align: center;
            cursor: pointer;
        }

        .btn .prev {
            position: absolute;
            left: 0;
            top: 50%;
            margin-top: -50px;
        }

        .btn .next {
            position: absolute;
            right: 0;
            top: 50%;
            margin-top: -50px;
        }

        .num .active {
            background-color: #fff;
        }

        .hide {
            display: none;
        }

    </style>

    <script>

        $(function () {
            //获取屏幕宽度
            var clientwidth = document.body.clientWidth;
            var i = 0;
            var timer = null;
            for (var j = 0; j < $('.img li').length; j++) { //创建圆点
                $('.num').append('<li></li>')
            }
            $('.num li').first().addClass('active'); //给第一个圆点添加样式

            var firstimg = $('.img li').first().clone(); //复制第一张图片
            $('.img').append(firstimg).width($('.img li').length * ($('.img img').width()));
            //第一张图片放到最后一张图片后，设置ul的宽度为图片张数*图片宽度

            $('.des').width($('.img li').length * ($('.img img').width()));
            //对点点位置的文字描述的宽度和图片一样


            // 下一个按钮
            $('.next').click(function () {
                i++;
                if (i == $('.img li').length) {
                    i = 1; //这里不是i=0
                    $('.img').css({
                        left: 0
                    }); //保证无缝轮播，设置left值
                }
                ;

                $('.img').stop().animate({
                    left: -i * clientwidth
                }, 300); //图片宽度为clientwidth

                if (i == $('.img li').length - 1) { //设置小圆点指示
                    $('.num li').eq(0).addClass('active').siblings().removeClass('active');
                    $('.des li').eq(0).removeClass('hide').siblings().addClass('hide');
                } else {
                    $('.num li').eq(i).addClass('active').siblings().removeClass('active');
                    $('.des li').eq(i).removeClass('hide').siblings().addClass('hide');
                }

            })

            // 上一个按钮
            $('.prev').click(function () {
                i--;
                if (i == -1) {
                    i = $('.img li').length - 2;
                    $('.img').css({
                        left: -($('.img li').length - 1) * clientwidth
                    });
                }
                $('.img').stop().animate({
                    left: -i * clientwidth
                }, 300);
                $('.num li').eq(i).addClass('active').siblings().removeClass('active');
                $('.des li').eq(i).removeClass('hide').siblings().addClass('hide');
            })

            //设置按钮的显示和隐藏
            $('.banner').hover(function () {
                $('.btn').show();
            }, function () {
                $('.btn').hide();
            })

            //鼠标划入圆点
            $('.num li').mouseover(function () {
                var _index = $(this).index();
                $('.img').stop().animate({
                    left: -_index * clientwidth
                }, 150);
                $('.num li').eq(_index).addClass('active').siblings().removeClass('active');
                $('.des li').eq(_index).removeClass('hide').siblings().addClass('hide');
            })

            //定时器自动播放
            timer = setInterval(function () {
                i++;
                if (i == $('.img li').length) {
                    i = 1;
                    $('.img').css({
                        left: 0
                    });
                }
                ;

                $('.img').stop().animate({
                    left: -i * clientwidth
                }, 300);
                if (i == $('.img li').length - 1) {
                    $('.num li').eq(0).addClass('active').siblings().removeClass('active');
                    $('.des li').eq(0).removeClass('hide').siblings().addClass('hide');
                } else {
                    $('.num li').eq(i).addClass('active').siblings().removeClass('active');
                    $('.des li').eq(i).removeClass('hide').siblings().addClass('hide');
                }
            }, 3000)

            //鼠标移入，暂停自动播放，移出，开始自动播放
            $('.banner').hover(function () {
                clearInterval(timer);
            }, function () {
                timer = setInterval(function () {
                    i++;
                    if (i == $('.img li').length) {
                        i = 1;
                        $('.img').css({
                            left: 0
                        });
                    }
                    ;

                    $('.img').stop().animate({
                        left: -i * clientwidth
                    }, 300);
                    if (i == $('.img li').length - 1) {
                        $('.num li').eq(0).addClass('active').siblings().removeClass('active');
                        $('.des li').eq(0).removeClass('hide').siblings().addClass('hide');
                    } else {
                        $('.num li').eq(i).addClass('active').siblings().removeClass('active');
                        $('.des li').eq(i).removeClass('hide').siblings().addClass('hide');
                    }
                }, 3000)
            })

        })
    </script>
</head>

<body>
<div class="layui-layout layui-layout-admin kit-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">
            <a href="/"><img src="${pageContext.request.contextPath}/media/images/zx_logo.png"
                             style="margin-left: 10px;margin-top: 10px;height: 50px"/><span
                    style="font-size: 22px"></span>
            </a>
        </div>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <c:if test="${empty sessionScope}">
                <a href="loginPage.jsp">
                    登录
                </a>
                </c:if>
                <c:if test="${not empty sessionScope}">
                <a href="/personal">
                        ${sessionScope.user.accountName}
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="/personal">我的信息</a></dd>
                    <dd><a href="/logout">退出登录</a></dd>
                </dl>
                </c:if>
        </ul>
    </div>
    <div class="layui-body" id="container">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-2"></div>
                <div class="col-lg-8" >

                    <img src="media/images/zx_logo.png"/>
                    <div>
                        <h2 style="color: dodgerblue">风险评测</h2>
                        <hr style="border: solid ;border-color:dodgerblue" >
                        <h4>您的年龄</h4>
                        <div>
                            <label><input type="radio" name="age" value="1">0-18</label>
                            <label><input type="radio" name="age" value="2">19-26</label>
                            <label><input type="radio" name="age" value="3">26-40</label>
                            <label><input type="radio" name="age" value="4">40岁以上</label>
                        </div>
                        <br>

                        <h4>您的主要收入来源是</h4>
                        <div>
                            <label><input type="radio" name="source1" value="1">工资劳务报酬</label>
                            <label><input type="radio" name="source1" value="2">股票、基金等</label>
                        </div>
                        <br>

                        <h4>您的可支配收入中，可用于金融投资的比例为</h4>
                        <div>
                            <label><input type="radio" name="source" value="1">10%至25%</label>
                            <label><input type="radio" name="source" value="2">25%至40%</label>
                        </div>
                        <br>
                        <div>
                            <input type="button" id="sbm" value="提交评测">
                        </div>
                    </div>
                </div>

            </div>

        </div>
    </div>

    <div class="layui-footer">
        <p>
            Copyright 2011-2018 <a href=""
                                   rel="nofollow" target="_blank" title="中信银行">中信银行有限公司
            版权所有</a> 京ICP备12003911号-3 京公网安备11010802011455号
        </p>
    </div>
</div>


<script>
    var sbm = document.getElementById("sbm");
    sbm.onclick = function () {
            var result = document.getElementsByName("age");
            for(var i=0; i<result.length; i ++){
                if(result[0].checked){
                    alert("保守型投资者，可进行低风险投资。");
                    return;
                }
                if(result[1].checked){
                    alert("谨慎型投资者，可进行中低风险投资。");
                    return;
                }
                if(result[2].checked){
                    alert("稳健型投资者，可进行中等风险投资。");
                    return;
                }
                if(result[3].checked){
                    alert("积极型投资者，可进行中高风险投资。");
                    return;
                }
            }
        }
</script>
</html>