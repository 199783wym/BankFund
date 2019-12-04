<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
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
<div class="container-fluid main profile">

    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading h3" >产品详情</div>
        <div class="panel-body">
            <h2><c:out value="${product.fundName}" default="error"></c:out></h2>
        </div>

        <!-- Table -->
        <table class="table" style="font-size: 20px">

            <tr >
                <td>基金名称</td>
                <td>基金编号</td>
                <td>基金类型</td>
                <td>基金经理人</td>
                <td>基金公司</td>

            </tr>
            <tr style="font-size: 18px">
                <td><c:out value="${product.fundName}" default="error"></c:out></td>
                <td><c:out value="${product.fundCode}" default="error"></c:out></td>
                <td><c:out value="${product.fundType}" default="error"></c:out></td>
                <td><c:out value="${product.fundMger}" default="error"></c:out></td>
                <td><c:out value="${product.compyName}" default="error"></c:out></td>
            </tr>
            <tr>
                <td>基金状态</td>
                <td>风险等级</td>
                <td>风险评星</td>
                <td>基金规模</td>
                <td>风险人</td>

        </tr>
            <tr style="font-size: 18px;margin-top: 30px">
            <td><c:out value="${product.fundStatus}" default="error"></c:out></td>
                <td><c:out value="${product.riskLevel}" default="error"></c:out></td>
                <td><c:out value="${product.fundRating}" default="error"></c:out></td>
                <td><c:out value="${product.fundScale}" default="error"></c:out>元</td>
                <td><c:out value="${product.issueOrgan}" default="error"></c:out></td>
            </tr>

        </table>
    </div>
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                <tr>
                    <td>单位净值:</td>
                    <td></td>
                </tr>
                <tr>
                    <td>日增长率:</td>
                    <td></td>
                </tr>
                <tr>
                    <td>风险等级:</td>
                    <td><c:out value="${product.riskLevel}" default="error"></c:out></td>
                </tr>
                <tr>
                    <td>基金经理:</td>
                    <td></td>
                </tr>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                <tr>
                    <td>基金规模:</td>
                    <td><c:out value="${product.fundScale}" default="error"></c:out>元</td>
                </tr>
                <tr>
                    <td>月增长率:</td>
                    <td></td>
                </tr>
                <tr>
                    <td>基金类别:</td>
                    <td><c:out value="${product.fundType}" default="error"></c:out></td>
                </tr>
                <tr>
                    <td>基金公司:</td>
                    <td><c:out value="${product.fundMger}" default="error"></c:out></td>
                </tr>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                <tr>
                    <td>成立时间:</td>
                    <td></td>
                </tr>
                <tr>
                    <td>年增长率:</td>
                    <td></td>
                </tr>
                <tr>
                    <td>基金状态:</td>
                    <td></td>
                </tr>

            </div>
            <h4><span ></span></h4>
            <span class="text-desc">
                        作者：<span ></span>  |
                        阅读数：<span ></span>  |
                        发布时间：<span ></span>
            </span>
            <hr>

            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" >
            </div>
            <hr class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <a  class="community-menu" >
                    <span class="glyphicon glyphicon-pencil" aria-hidden="true">
                    </span>
                编辑
            </a>

        </div>
        <div class="col-lg-3 col-md-12 col-sm-12 col-xs-12">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <h4>发起人</h4>

                <div class="media" >
                    <div class="media-left" >
                        <a href="#">
                            <img class="media-object img-circle" src="https://avatars3.githubusercontent.com/u/36687898?v=4">
                        </a>
                    </div>
                    <div class="media-body">
                        <h4 class="media-heading">
                            <span   ></span>
                        </h4>
                    </div>
                </div>
                <hr class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            </div>
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <h4>相关问题</h4>
            </div>
        </div>
    </div>
</div>
</body>
</html>