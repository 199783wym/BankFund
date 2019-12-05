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
            <%----%>
                <div class="container-fluid" style="margin-top:90px ">
                    <div class="row">
                        <div class="col-lg-2"></div>
                        <div class="col-lg-8" >
                            <hr style="border: solid ;border-color:dodgerblue" >
                            <strong class="question">Q:基金是什么？具体是怎样赚钱的呢?</strong>
                            <p class="anwser"><span style="font-size: 20px">A:</span>基金就是很多人把很多钱交给一个基金公司去买股票或是买债券。一只基金购买股票的资金比例较多，就是股票型基金。资金用于购买债券的就是债券型基金。按一定比例购买债券和股票的就是混合型基金。 基金投资者将钱要交给基金公司，由基金公司的专业人员来炒股或者炒债券，无论是技术水平上还是时间上，都比普通投资者更占优势，获利机会也大得多。所以投资者需要向基金公司支付一定的劳务费，这也就是基金的申购费、认购费、赎回费和管理费。
                            </p>
                            <br>

                            <strong class="question">Q:基金的分类？各类基金的风险</strong>
                            <p class="anwser"><span style="font-size: 20px">A:</span>
                                基金的分类：货币基金、债券基金、股票基金、混合型基金
                                股票型基金：投资股票型基金就是间接的投资股票，基金公司选的股票涨了，基金公司赚钱了，基金净值自然就高了;反之，基金公司选的股票跌了，基金公司赔钱了，基金净值就低了。所以，股票基金受股市波动影响最大，其风险也是基金中最大的，仅次于股票。
                                混合型基金因为主要分别投资于股票和债券，所以属于中高风险。债券基金投资于债券，就是中低风险。货币基金就是低风险投资了，一般情况下不会出现亏损。
                                混合型基金因为主要分别投资于股票和债券，所以属于中高风险。
                                债券基金投资于债券，就是中低风险。货币基金就是低风险投资了，一般情况下不会出现亏损。
                            </p>
                            <br>

                            <strong class="question">Q:各类基金的投资费用</strong>
                            <p class="anwser"><span style="font-size: 20px">A:</span>股票型基金：申购费1.5%左右，赎回费0.5%(一年以内)，一般三年以上免收赎回费。
                                债券型基金：申购费0.8%左右;赎回费0.1%-0.3%(一年以内)，一般三年以上免收赎回费。
                                货币型基金：无费用
                                <span style="background: red">注意：
                在银行柜台、银行网银、基金公司网站和第三方购买网站上买基金费率都是不同的，其中基金公司网站和第三方购买网站是最优惠的，一般都在4~6折。</span>
                            </p>
                            <br>

                            <strong class="question">Q:定投基金</strong>
                            <p class="anwser"><span style="font-size: 20px">A:</span>定投基金是最简单的基金投资方式，长期的投资时间可以将投资成本平摊。在市场单边下跌时开始定投是最佳时期。大成基金提示您定投需要长期的积累才能看到效果，建议持有定投基金至少1年以上。 而定投基金的类型可以锁定在股票型基金和混合型基金这两者中，不要考虑货币型基金和保本基金，因为这一类基金收益太小，定投也无法获得什么收益。</p>
                            <br>

                            <strong class="question">Q:挑选哪只基金?</strong>
                            <p class="anwser"><span style="font-size: 20px">A:</span>
                                挑选具体哪只基金，就要详细了解大 成基金管理公司的情况，考察其投资风格、业绩。可以将该基金与同类型基金收益情况作一个对比。再将基金收益与大盘走势相比较。如果一只基金大多数时间的业绩表现都比同期大盘指数好，那么可以说这只基金的管理是比较有效的。最后考察基金累计净值增长率，查看其稳定程度</p>
                            <br>

                            <button type="button" class="btn btn-primary" style="float: right">我已了解，点击返回</button>
                            <br>

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