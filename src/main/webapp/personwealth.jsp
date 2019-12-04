<%--
  Created by IntelliJ IDEA.
  User: tanrui
  Date: 2019/12/4
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

        <<<<<<< HEAD
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
            height:30px;
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
                <a href="javascript:">
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

        </div>
        <div class="layui-container" style="width: 1200px;height: 500px">
            <%--列表展示--%>
            <div class="layui-input-block" style="width: 950px;height: 500px;float: left;margin-left: 0px;">
                <div>
                    <span style="font-size: 25px"> 个人账户 </span>
                </div>
                <div class="layui-input-block" style="width: 950px;height: 500px;float: left;margin-left: 0px; margin-top: 10px">
                    <div class="layui-tab">
                        <ul class="layui-tab-title">
                            <li data-status="" class="layui-this">全部基金</li>
                            <li data-status="1">基金收藏</li>
                            <li data-status="3">交易记录</li>
                            <li data-status="5">个人信息</li>
                        </ul>
                        <div class="layui-tab-content">
                            <div class="layui-tab-item layui-show">
                                <table class="layui-table" id="tbdata" lay-filter="tbop">
                                    <thead>
                                    <tr>
                                        <td>基金代码</td>
                                        <td>基金名称</td>
                                        <td>持有资金</td>
                                        <td>日涨幅</td>
                                        <td>昨日收益</td>
                                        <td>总收益</td>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${pageHelper.list}" var="e">
                                        <tr>
                                            <td>${e.no}</td>
                                            <td>${e.name}</td>
                                            <td>${e.wealth}</td>
                                            <td>${e.raise}</td>
                                            <td>${e.yesterdaygains}</td>
                                            <td>${e.gains}</td>

                                            <td><button id="add" class="layui-btn layui-btn-sm">卖出</button></td>

                                             <div class="layui-row" id="test" style="display: none;">
                                                        <div class="layui-col-md10">
                                                            <form class="layui-form" action="" method="post" id="addEmployeeForm">
                                                                <div class="layui-form-item">
                                                                    <label class="layui-form-label" style="padding-left:-50px;">问卷标题:</label>
                                                                    <div class="layui-input-block">
                                                                        <input type="text" placeholder="请输入问卷名称" lay-verify="questionnaireName" name="questionnaireName" id="questionnaireName" class="layui-input">
                                                                    </div>
                                                                </div>
                                                              
                                                                <div class="layui-form-item">
                                                                    <div class="layui-input-block">
                                                                        <button lay-submit="" lay-filter="suu" class="layui-btn layui-btn-normal tijiao">提交</button>
                                                                    </div>
                                                                </div> 
                                                            </form>
                                                        </div>
                                                    </div>

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
                            <div class="layui-tab-item">   <table class="layui-table" id="tbdata" lay-filter="tbop">
                                <thead>
                                <tr>
                                    <td>基金代码</td>
                                    <td>基金名称</td>
                                    <td>收藏日期</td>
                                    <td>日涨幅</td>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${pageHelper.list}" var="e">
                                    <tr>
                                        <td>${e.no}</td>
                                        <td>${e.name}</td>
                                        <td>${e.day}</td>
                                        <td>${e.raise}</td>
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
                                </div></div>
                            <div class="layui-tab-item"> <table class="layui-table" id="tbdata" lay-filter="tbop">
                                <thead>
                                <tr>
                                    <td>基金代码</td>
                                    <td>基金名称</td>
                                    <td>交易金额</td>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${pageHelper.list}" var="e">
                                    <tr>
                                        <td>${e.no}</td>
                                        <td>${e.name}</td>

                                        <td>${e.gains}</td>
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
                            <div class="layui-tab-item"> <table class="layui-table" id="tbdata" lay-filter="tbop">
                                <thead>
                                <tr>
                                    <td>姓名</td>
                                    <td>手机号</td>
                                    <td>银行卡号</td>
                                    <td>身份证号</td>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${pageHelper.list}" var="e">
                                    <tr>
                                        <td>${e.no}</td>
                                        <td>${e.name}</td>
                                        <td>${e.wealth}</td>
                                        <td>${e.raise}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table></div>
                        </div>
                    </div>
                </div>
            </div>

                <script>
                    layui.use(['element', 'table'], function () {
                        // Tab的切换功能，切换事件监听等，需要依赖element模块
                        var $ = layui.jquery, table = layui.table, element = layui.element;
                        // 初始化加载
                        getList('#order_all', '')
                        // 监听tab切换 操作：文档 - 内置模块 - 常用元素操作 element - 监听tab切换
                        element.on('tab(tab-all)', function (data) {
                            // console.log(this);        // 当前Tab标题所在的原始DOM元素
                            // console.log(data.index);  // 得到当前Tab的所在下标
                            // console.log(data.elem);   // 得到当前的Tab大容器
                            var status = $(this).attr('data-status')
                            var position = '#order_all'
                            switch (status) {
                                case '1': position = '#order_pay'; break;
                                case '3': position = '#order_receive'; break;
                                case '5': position = '#order_finish'; break;
                                case '6': position = '#order_cancel'; break;
                                default: position = '#order_all';
                            }
                            getList(position, status)
                        })
                    }
                    )
                </script>


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
