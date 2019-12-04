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

	//跳转到注册页面
    function go2RegPage() {
        location.href="regPage.jsp";
    }
</script>
    <style type="text/css">
        *{ padding:0; margin:0; list-style:none; border:0;}
        .all{
            width:1500px;
            height:200px;
            padding:7px;
            border:1px solid #ccc;
            margin:100px auto;
            position:relative;
        }
        .screen{
            width:500px;
            height:200px;
            overflow:hidden;
            position:relative;
        }
        .screen li{ width:500px; height:200px; overflow:hidden; float:left;}
        .screen ul{ position:absolute; left:0; top:0px; width:3000px;}
        .all ol{ position:absolute; right:10px; bottom:10px; line-height:20px; text-align:center;}
        .all ol li{ float:left; width:20px; height:20px; background:#fff; border:1px solid #ccc; margin-left:10px; cursor:pointer;}
        .all ol li.current{ background:yellow;}

        #arr {display: none;}
        #arr span{ width:40px; height:40px; position:absolute; left:5px; top:50%; margin-top:-20px; background:#000; cursor:pointer; line-height:40px; text-align:center; font-weight:bold; font-family:'黑体'; font-size:30px; color:#fff; opacity:0.3; border:1px solid #fff;}
        #arr #right{right:5px; left:auto;}
    </style>

    <script>
        window.onload = function () {
            //需求：无缝滚动。
            //思路：赋值第一张图片放到ul的最后，然后当图片切换到第五张的时候
            //     直接切换第六章，再次从第一张切换到第二张的时候先瞬间切换到
            //     第一张图片，然后滑动到第二张
            //步骤：
            //1.获取事件源及相关元素。（老三步）
            //2.复制第一张图片所在的li,添加到ul的最后面。
            //3.给ol中添加li，ul中的个数-1个，并点亮第一个按钮。
            //4.鼠标放到ol的li上切换图片
            //5.添加定时器
            //6.左右切换图片（鼠标放上去隐藏，移开显示）
            var screen = document.getElementById("screen");
            var ul = screen.children[0];
            var ol = screen.children[1];
            var div = screen.children[2];
            var imgWidth = screen.offsetWidth;

            //2
            var tempLi = ul.children[0].cloneNode(true);
            ul.appendChild(tempLi);
            //3
            for(var i = 0; i < ul.children.length - 1; i++) {
                var newOlLi = document.createElement("li");
                newOlLi.innerHTML = i + 1;
                ol.appendChild(newOlLi);
            }
            var olLiArr = ol.children;
            olLiArr[0].className = "current";
            //4
            for(var i = 0, len = olLiArr.length; i < len; i++) {
                olLiArr[i].index = i;
                olLiArr[i].onmouseover = function (ev) {
                    for(var j = 0; j < len; j++) {
                        olLiArr[j].className = "";
                    }
                    this.className = "current";
                    key = square = this.index;
                    animate(ul, -this.index * imgWidth);
                }
            }
            //5
            var key = 0;
            var square = 0;
            var timer = setInterval(autoPlay, 1000);
            screen.onmouseover = function (ev) {
                clearInterval(timer);
                div.style.display = "block";
            }
            screen.onmouseout = function (ev) {
                timer = setInterval(autoPlay, 1000);
                div.style.display = "none";
            }
            //6
            var divArr = div.children;
            divArr[0].onclick = function (ev) {
                key--;
                if(key < 0) {
                    ul.style.left = -(ul.children.length-1) * imgWidth + "px";
                    key = 4;
                }
                animate(ul, -key * imgWidth);
                square--;
                if(square < 0) {
                    square = 4;
                }
                for(var k = 0; k < len; k++) {
                    olLiArr[k].className = "";
                }
                olLiArr[square].className = "current";
            }
            divArr[1].onclick = autoPlay;
            function autoPlay() {
                key++;
                //当不满足下面的条件是时候，轮播图到了最后一个孩子，进入条件中后，瞬移到
                //第一张，继续滚动。
                if(key > ul.children.length - 1) {
                    ul.style.left = 0;
                    key = 1;
                }
                animate(ul, -key * imgWidth);
                square++;
                if(square > 4) {
                    square = 0;
                }
                for(var k = 0; k < len; k++) {
                    olLiArr[k].className = "";
                }
                olLiArr[square].className = "current";
            }
            function animate(ele,target){
                clearInterval(ele.timer);
                var speed = target>ele.offsetLeft?10:-10;
                ele.timer = setInterval(function () {
                    var val = target - ele.offsetLeft;
                    ele.style.left = ele.offsetLeft + speed + "px";
                    if(Math.abs(val)<Math.abs(speed)){
                        ele.style.left = target + "px";
                        clearInterval(ele.timer);
                    }
                },10)
            }

        }

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
                <a href="javascript:go2RegPage();">
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
        <div class="all" id='all'>
            <div class="screen" id="screen">
                <ul id="ul">
                    <li><img src="${pageContext.request.contextPath}/media/images/zx_logo.png" width="1500" height="200" /></li>
                    <li><img src="${pageContext.request.contextPath}/media/images/zx_logo.png" width="1500" height="200" /></li>
                    <li><img src="${pageContext.request.contextPath}/media/images/zx_logo.png" width="1500" height="200" /></li>
                    <li><img src="${pageContext.request.contextPath}/media/images/zx_logo.png" width="1500" height="200" /></li>
                    <li><img src="${pageContext.request.contextPath}/media/images/zx_logo.png" width="1500" height="200" /></li>
                </ul>
                <ol>

                </ol>
                <div id="arr">
                    <span id="left"><</span>
                    <span id="right">></span>
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