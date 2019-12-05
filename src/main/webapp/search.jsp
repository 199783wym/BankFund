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
                        <%--                    <dd><a href="javascript:showTab(1001,'/personal','我的信息');">我的信息</a></dd>--%>
                    <dd><a href="/personal">我的信息</a></dd>
                    <dd><a href="/logout">退出登录</a></dd>
                </dl>
                </c:if>
        </ul>
    </div>
    <div class="layui-body" id="container">
        <%--轮播图--%>
        <div class="banner">
            <ul class="img">
                <li>
                    <a href="#"><img src="${pageContext.request.contextPath}/media/images/1.jpg" alt="第1张图片"
                                     width="1440px" height="300"></a>
                </li>
                <li>
                    <a href="#"><img src="${pageContext.request.contextPath}/media/images/2.jpg" alt="第2张图片"
                                     width="1440px" height="300"></a>
                </li>
                <li>
                    <a href="#"><img src="${pageContext.request.contextPath}/media/images/3.jpg" alt="第3张图片"
                                     width="1440px" height="300"></a>
                </li>
            </ul>
            <ul class="num"></ul>
            <ul class="des">
                <li>第一个</li>
                <li>第二个</li>
                <li>第三个</li>
            </ul>
            <div class="btn">
                <span class="prev">&lt;</span>
                <span class="next">&gt;</span>
            </div>
        </div>
            <%----%>
        <div class="layui-container" style="width: 1200px;height: 500px">
            <%--列表展示--%>
            <div class="layui-input-block" style="width: 950px;height: 500px;float: left;margin-left: 0px;">
                <div>
                    <span style="font-size: 25px"> 基金产品 </span>
                    <button class="layui-btn" lay-submit lay-filter="search"
                            style="width: 80px;float: right;background-color: darkred" id="btn">搜索
                    </button>
                    <input id="searchName" type="text" name="title" required lay-verify="required" placeholder="请输入基金名称"
                           autocomplete="off" class="layui-input" style="width: 300px;float: right" value="${key}">
                </div>
                <div class="layui-input-block"
                     style="width: 930px;height: 500px;float: left;margin-left: 0px; margin-top: 10px">
                   <%--选项卡--%>
                    <div class="layui-tab">
                        <div class="layui-tab-content">
                            <%--tab——全部--%>
                            <div class="layui-tab-item layui-show">
                                <table class="layui-table" lay-data="{height: 308, url:'${pageContext.request.contextPath}/searchList?key=${key}'} " lay-filter="demoEvent">
                                    <thead>
                                    <tr>
                                        <th lay-data="{field:'fundName', width:120, event: 'setSign', style:'cursor: pointer;'}">基金名称</th>
                                        <th lay-data="{field:'fundCode', width:100}">基金代码</th>
                                        <th lay-data="{field:'fundType', width:100}">基金类型</th>
                                        <th lay-data="{field:'unit', width:120, sort: true}">单位净值</th>
                                        <th lay-data="{field:'day', width:120, sort: true}">日涨幅</th>
                                        <th lay-data="{field:'month', width:120,sort: true}">月涨幅</th>
                                        <th lay-data="{field:'year', width:120,sort: true}">年涨幅</th>
                                        <th lay-data="{field:'riskLevel', width:100}">风险等级</th>
                                    </tr>
                                    </thead>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <%--排行榜--%>
            <div style="width: 220px;height: 500px;float: right;margin-right: -12px;margin-top: 100px">
                <div style="width: 265px;border: 1px solid #e6e6e6;height: 300px;">
                    <i class="layui-icon layui-icon-praise"
                       style="font-size: 30px; color: #e00808;float: left;margin:14px;"></i>
                    <span style="float: left;margin-top: 15px;font-size: 20px;">排行榜</span>

                    <table class="layui-table" id="phb" lay-filter="tbop">
                        <thead>
                        <tr>
                            <td>排名</td>
                            <td>基金名称</td>
                            <td>最近涨幅</td>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${productList6}" var="list1" varStatus="status">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${list1.fundName}</td>
                                <td>${list1.day}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>

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
<script type="text/html" id="toolbarDemo">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
        <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
        <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
    </div>
</script>
</body>
<table class="layui-hide" id="test" lay-filter="test"></table>

<script>
    layui.use('table', function(){
        var table = layui.table;
        //监听行单击事件（双击事件为：rowDouble）
        table.on('row(tbdata1)', function(obj){
            var data = obj.data;
            layer.alert(JSON.stringify(data), {
                title: '当前行数据：'
            });

            //标注选中样式
            obj.tr.addClass('layui-table-click').siblings().removeClass('layui-table-click');
        });

    });
</script>


<script>
    layui.use('table', function(){
        var table = layui.table;
        //监听单元格事件
        table.on('tool(demoEvent)', function(obj){
            var data = obj.data;
            if(obj.event === 'setSign'){
                var id = data.id;
                location.href="${pageContext.request.contextPath}/product/"+id;
            }
        });
    });

    var oBtn=document.getElementsByTagName('button')[0];
    oBtn.onclick = function(){
        var name = document.getElementById("searchName").value;
        location.href="${pageContext.request.contextPath}/search?name="+name;
    }
</script>
</html>