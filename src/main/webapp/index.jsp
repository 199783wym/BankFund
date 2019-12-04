<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>主页</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/media/layui/css/layui.css" media="all">
    <!-- <link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css"> -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/media/css/app.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/media/css/font-awesome.min.css">
    <style type="text/css">
        iframe{
            width: 98%;
            height: 98%;
        }
        .layui-tab-item{
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
        }).use(['element','app'], function(){
            element = layui.element;
            if(${state==1}){
                showTab(20000,"${pageContext.request.contextPath}/process/myTask","首页");
            }else{
                showTab(20000,"${pageContext.request.contextPath}/loginlog/shounumber","首页");
            }
        });
        var tid=-1;
        function showTab(id,u,n) {
            if(tid>0){
                element.tabDelete('demo',tid);
            }
            element.tabAdd('demo', {
                title:n
                ,content: '<iframe data-frameid="'+id+'" scrolling="auto" frameborder="0" src="'+u+'"></iframe>' //支持传入html
                ,id:id
            });
            element.tabChange('demo', id);
            element.render();
            tid=id;
        }

        //退出
        function exit() {
            if(confirm("确认退出吗？")){
                location.href="${pageContext.request.contextPath}/user/exituser";
            }
        }

        element.tabAdd('demo', {
            title:n
            ,content: '<iframe data-frameid="'+id+'" scrolling="auto" frameborder="0" src="'+u+'"></iframe>' //支持传入html
            ,id:id
        });
        element.tabChange('demo', id);
        element.render();
        tid=id;
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
            list-style:none;
        }
        .banner {
            width:100%;
            height:300px;
            margin:100px auto;
            margin-bottom: 20px;
            position:relative;
            overflow:hidden;
            z-index:1;
        }
        .img {
            position:absolute;
            top:0;
            left:0;
        }
        .des {
            position:absolute;
            bottom:0;
            left:0;
            z-index:-2;
            background:rgba(0,0,0,.4)
        }
        .des li {
            float:left;
            width:100%;
        }
        .img li {
            float:left;
        }
        .num {
            position:absolute;
            bottom:10px;
            width:100%;
            text-align:center;
            font-size:0;
        }
        .num li {
            width:10px;
            height:10px;
            background:rgba(0,0,0,0.5);
            border-radius:100%;
            display:inline-block;
            margin:0 5px;
            cursor:pointer;
        }
        .btn {
            display:none;
        }
        .btn span {
            display:block;
            width:50px;
            height:100px;
            background:rgba(0,0,0,0.6);
            color:#fff;
            font-size:40px;
            line-height:100px;
            text-align:center;
            cursor:pointer;
        }
        .btn .prev {
            position:absolute;
            left:0;
            top:50%;
            margin-top:-50px;
        }
        .btn .next {
            position:absolute;
            right:0;
            top:50%;
            margin-top:-50px;
        }
        .num .active {
            background-color:#fff;
        }
        .hide {
            display:none;
        }

    </style>

    <script>

        $(function() {
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
            $('.next').click(function() {
                i++;
                if (i == $('.img li').length) {
                    i = 1; //这里不是i=0
                    $('.img').css({
                        left: 0
                    }); //保证无缝轮播，设置left值
                };

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
            $('.prev').click(function() {
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
            $('.banner').hover(function() {
                $('.btn').show();
            }, function() {
                $('.btn').hide();
            })

            //鼠标划入圆点
            $('.num li').mouseover(function() {
                var _index = $(this).index();
                $('.img').stop().animate({
                    left: -_index * clientwidth
                }, 150);
                $('.num li').eq(_index).addClass('active').siblings().removeClass('active');
                $('.des li').eq(_index).removeClass('hide').siblings().addClass('hide');
            })

            //定时器自动播放
            timer = setInterval(function() {
                i++;
                if (i == $('.img li').length) {
                    i = 1;
                    $('.img').css({
                        left: 0
                    });
                };

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
            $('.banner').hover(function() {
                clearInterval(timer);
            }, function() {
                timer = setInterval(function() {
                    i++;
                    if (i == $('.img li').length) {
                        i = 1;
                        $('.img').css({
                            left: 0
                        });
                    };

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
            <img src="${pageContext.request.contextPath}/media/images/zx_logo.png" style="margin-left: 10px;margin-top: 10px;height: 50px" /><span
                style="font-size: 22px"></span>
        </div>

        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item kit-side-fold" lay-unselect >
                <a href="javascript:flexible();" title="侧边伸缩">
                    <i class="layui-icon layui-icon-shrink-right" id="LAY_flexible"></i>
                </a>

            </li>
            <li class="layui-nav-item" lay-unselect>
                <a href="index.jsp" layadmin-event="refresh" title="刷新">
                    <i class="layui-icon layui-icon-refresh-3"></i>
                </a>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <%--<li class="layui-nav-item" style="margin-right: 20px">--%>
            <%--<a href="javascript:showTab(1001,'${pageContext.request.contextPath}/process/myTask','待办事项');">待办事项<span class="layui-badge">${sessionScope.taskSum}</span></a>--%>
            <%--</li>--%>
            <li class="layui-nav-item">
                <a href="loginPage.jsp">
                    登录
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:showTab(1001,'userInfo.jsp','我的信息');">我的信息</a></dd>
                    <dd><a href="javascript:showTab(1001,'photo.jsp','更改头像');">更改头像</a></dd>
                    <dd><a href="javascript:showTab(1002,'password.jsp','修改密码');">修改密码</a></dd>
                </dl>
            </li>
<%--            <li class="layui-nav-item"><a href="#" onclick="exit();">注销</a></li>--%>
            <li class="layui-nav-item">
                <a href="regPage.jsp">
                    注册
                </a>
            </li>
        </ul>
    </div>
    <div class="layui-body" id="container" >
        <!-- 内容主体区域 -->
        <%--<div class="layui-tab" lay-filter="demo" style="width: 100%;height: 90%">--%>
        <%--<ul class="layui-tab-title"></ul>--%>
        <%--<div class="layui-tab-content" style="width: 99%;height: 98%"></div>--%>
        <%--</div>--%>
        <%--轮播图--%>
        <div class="banner">
            <ul class="img">
                <li>
                    <a href="#"><img src="${pageContext.request.contextPath}/media/images/1.jpg" alt="第1张图片" width="1440px" height="300"></a>
                </li>
                <li>
                    <a href="#"><img src="${pageContext.request.contextPath}/media/images/2.jpg" alt="第2张图片" width="1440px"  height="300"></a>
                </li>
                <li>
                    <a href="#"><img src="${pageContext.request.contextPath}/media/images/3.jpg" alt="第3张图片" width="1440px" height="300"></a>
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
        <div class="layui-container" style="width: 1200px;height: 500px">
            <%--列表展示--%>
            <div class="layui-input-block" style="width: 950px;height: 500px;float: left;margin-left: 0px;">
                <div>
                    <span style="font-size: 25px"> 基金产品 </span>
                    <button class="layui-btn" lay-submit lay-filter="formDemo" style="width: 80px;float: right;background-color: darkred">搜索</button>
                    <input type="text" name="title" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input" style="width: 300px;float: right">
                </div>
                <div class="layui-input-block" style="width: 950px;height: 500px;float: left;margin-left: 0px; margin-top: 10px">
                    <div class="layui-tab">
                        <ul class="layui-tab-title">
                            <li class="layui-this">全部</li>
                            <li>货币基金</li>
                            <li>股票基金</li>
                            <li>债券基金</li>
                            <li>混合型基金</li>
                        </ul>
                        <div class="layui-tab-content">
                            <div class="layui-tab-item layui-show">
                                <table class="layui-table" id="tbdata" lay-filter="tbop">
                                    <thead>
                                    <tr>
                                        <td>基金代码</td>
                                        <td>基金名称</td>
                                        <td>单位净值</td>
                                        <td>日涨幅</td>
                                        <td>月涨幅</td>
                                        <td>年涨幅</td>
                                        <td>风险等级</td>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${pageHelper.list}" var="e">
                                        <tr>
                                            <td>${e.id}</td>
                                            <td>${e.no}</td>
                                            <td>${e.name}</td>
                                            <td>${e.depart.name}</td>
                                            <td>${e.sex}</td>
                                            <td>${e.phone}</td>
                                            <td>${e.qq}</td>
                                            <td>${e.email}</td>
                                            <td><f:formatDate value="${e.createdate}" pattern="yyyy-MM-dd"/></td>
                                            <td><a class="layui-btn layui-btn-mini" href="${pageContext.request.contextPath}/emp/goupdate/${e.id}">编辑</a>
                                                <a class="layui-btn layui-btn-danger layui-btn-mini"
                                                   lay-event="del" onclick="deleteCourse(${e.id});">删除</a></td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                                <div class="layui-box layui-laypage layui-laypage-default" id="layui-laypage-1">
                                    <c:if test="${hasPrevious!=true}">
                                        <a href="javascript:;" class="layui-laypage-prev layui-disabled" data-page="0">
                                            <i class="layui-icon">&lt;</i>
                                        </a>
                                    </c:if>
                                    <c:if test="${hasPrevious!=false}">
                                        <a href="javascript:goPage(${pageHelper.pageIndex-1});" class="layui-laypage-prev" data-page="0">
                                            <i class="layui-icon">&lt;</i>
                                        </a>
                                    </c:if>

                                    <c:forEach begin="${pageHelper.startPage}" end="${pageHelper.endPage}" step="1" var="i">
                                        <c:if test="${pageHelper.pageIndex==i}">
                                            <span style="color:#009688;font-weight: bold;">${i}</span>
                                        </c:if>
                                        <c:if test="${pageHelper.pageIndex!=i}">
                                            <a href="#" onclick="goPage(${i})">${i}</a>
                                        </c:if>
                                    </c:forEach>
                                    <c:if test="${hasNext!=true}">
                                        <a href="javascript:;" class="layui-laypage-next layui-disabled" data-page="2">
                                            <i class="layui-icon">&gt;</i>
                                        </a>
                                    </c:if>
                                    <c:if test="${hasNext!=false}">
                                        <a href="javascript:goPage(${pageHelper.pageIndex+1});" class="layui-laypage-prev" data-page="0">
                                            <i class="layui-icon">&gt;</i>
                                        </a>
                                    </c:if>
                                    <span class="layui-laypage-skip">到第
							   <input type="text" min="1" class="layui-input" id="page" value="${pageHelper.pageIndex }">页
							   <button type="button" class="layui-laypage-btn" onclick="tiaozhuan(${pageHelper.totalPage});">确定</button>
							</span>
                                    <span class="layui-laypage-count">共${pageHelper.totalCount}条</span>
                                    <span class="layui-laypage-limits">
							<select onchange="changePageSize(this)" id="pageSize">
							        <option value="5"  selected>5条/页</option>
									<option value="10" >10 条/页</option>
									<option value="15" >15 条/页</option>
							</select>
							</span>
                                </div>
                            </div>
                            <div class="layui-tab-item">内容2</div>
                            <div class="layui-tab-item">内容3</div>
                            <div class="layui-tab-item">内容4</div>
                            <div class="layui-tab-item">内容5</div>
                        </div>
                    </div>
                </div>
            </div>

            <%--排行榜--%>
            <div style="width: 220px;height: 500px;float: right;margin-right: -12px;margin-top: 100px">
                <div style="width: 220px;border: 1px solid #e6e6e6;height: 300px;">
                    <i class="layui-icon layui-icon-praise" style="font-size: 30px; color: #e00808;float: left;margin:23px;"></i>
                    <span style="float: left;margin-top: 23px;font-size: 20px;">排行榜</span>

                    <ul style="margin-left: 10px">
                        <li style="width: 200px;border: 1px solid #e6e6e6;float: left;height: 20px;margin-bottom: 5px">
                            <span>1</span>
                        </li>
                        <li style="width: 200px;border: 1px solid #e6e6e6;float: left;height: 20px;margin-bottom: 5px"></li>
                        <li style="width: 200px;border: 1px solid #e6e6e6;float: left;height: 20px;margin-bottom: 5px"></li>
                        <li style="width: 200px;border: 1px solid #e6e6e6;float: left;height: 20px;margin-bottom: 5px"></li>
                        <li style="width: 200px;border: 1px solid #e6e6e6;float: left;height: 20px;margin-bottom: 5px"></li>
                        <li style="width: 200px;border: 1px solid #e6e6e6;float: left;height: 20px;margin-bottom: 5px"></li>
                    </ul>
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


</body>

</html>