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
    </div>
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">


                <%--<div class="panel panel-default col-lg-12 col-md-12 col-sm-12 col-xs-12" >--%>
                    <%--<!-- Default panel contents -->--%>
                    <%--<div class="panel-heading h3" >产品详情</div>--%>
                    <%--<div class="panel-body">--%>
                        <%--<h2><c:out value="${product.fundName}" default="error"></c:out></h2>--%>
                    <%--</div>--%>

                    <!-- Table -->
                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4"><table class="table" style="font-size: 15px">
                        <tr>
                            <td>单位净值:</td>
                            <td>1.238</td>
                        </tr>
                        <tr>
                            <td>日增长率:</td>
                            <td style="color: red;">0.8</td>
                        </tr>
                        <tr>
                            <td>风险等级:</td>
                            <td><c:out value="${product.riskLevel}" default="error"></c:out></td>
                        </tr>
                        <tr>
                            <td>基金经理:</td>
                            <td><c:out value="${product.fundMger}" default="error"></c:out></td>
                        </tr>

                    </table>
                    </div>
                    <div class="col-wlg-4 col-md-4 col-sm-4 col-xs-4">
                        <table class="table"  style="font-size: 15px" >

                            <tr>
                                <td>基金规模:</td>
                                <td><c:out value="${product.fundScale}" default="error"></c:out>元</td>
                            </tr>
                            <tr>
                                <td>月增长率:</td>
                                <td style="color:red">0.77</td>
                            </tr>
                            <tr>
                                <td>基金类别:</td>
                                <td><c:out value="${product.fundType}" default="error"></c:out></td>
                            </tr>
                            <tr>
                                <td>基金公司:</td>
                                <td><c:out value="${product.fundMger}" default="error"></c:out></td>
                            </tr>

                        </table>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                        <table class="table" style="font-size: 15px" >
                            <tr>
                                <td>公司地址:</td>
                                <td><c:out value="${compy.compyAddr}" default="error"></c:out></td>
                            </tr>
                            <tr>
                                <td>年增长率:</td>
                                <td style="color: red;">0.66</td>
                            </tr>
                            <tr>
                                <td>基金状态:</td>
                                <td>正常状态</td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                            </tr>
                        </table>

                    </div>
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" >
            </div>
            <hr class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                <form class="form-inline" action="/buyFund">
                    <input type="hidden" value="${product.fundCode}"  name="productId">
                    <div class="form-group">
                        <label for="amount">购买金额</label>
                        <input type="text" class="form-control" id="amount" name="amount" placeholder="请输入购买金额">元
                    </div>
                    <button type="submit" class="btn btn-primary">购买</button>
                </form>
            </div>

        </div>

    </div>
</div>
</body>
</html>