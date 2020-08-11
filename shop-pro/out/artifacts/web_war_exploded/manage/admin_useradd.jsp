<%--
  Created by IntelliJ IDEA.
  User: ayang
  Date: 2020/7/31
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="admin_menu.jsp" %>
<!--/sidebar-->
<div class="main-wrap">

    <div class="crumb-wrap">
        <div class="crumb-list"><i class="icon-font"></i><a href="/jscss/admin/design/">首页</a><span class="crumb-step">&gt;</span><a
                class="crumb-name" href="/jscss/admin/design/">用户管理</a><span
                class="crumb-step">&gt;</span><span>新增用户</span></div>
    </div>
    <div class="result-wrap">
        <div class="result-content">
            <form action="admin_douseradd" method="post" id="myform" name="myform">
                <table class="insert-tab" width="100%">
                    <tbody>
                    <tr>
                        <th width="120"><i class="require-red">*</i>用户分类：</th>
                        <td>
                            <select name="colId" id="catid" class="required">
                                <option value="">请选择</option>
                                <option value="19">普通用户</option>
                                <option value="20">管理员</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th><i class="require-red">*</i>用户名：</th>
                        <td>
                            <input class="common-text required" id="userid" name="username" size="50" value="" type="text">
                        </td>
                    </tr>
                    <tr>
                        <th><i class="require-red">*</i>用户姓名：</th>
                        <td>
                            <input class="common-text required" id="username" name="name" size="50" value="" type="text">
                        </td>
                    </tr>
                    <tr>
                        <th><i class="require-red">*</i>登录密码：</th>
                        <td>
                            <input class="common-text required" id="passwd" name="passwd" size="50" value="" type="text">
                        </td>
                    </tr>
                    <tr>
                        <th><i class="require-red">*</i>确认密码：</th>
                        <td>
                            <input class="common-text required" id="repasswd" name="repasswd" size="50" value="" type="text">
                        </td>
                    </tr>
                    <tr>
                        <th width="120">性别：</th>
                        <td>
                            <select name="catid_sex" id="catid_sex" class="required">
                                <option value="">请选择</option>
                                <option value="19">男</option>
                                <option value="20">女</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>出生日期：</th>
                        <td><input class="common-text" name="birthday" size="50" type="text"></td>
                    </tr>
                    <tr>
                        <th><i class="require-red">*</i>电子邮箱：</th>
                        <td>
                            <input class="common-text required" id="email" name="email" size="50" value="" type="text">
                        </td>
                    </tr>
                    <tr>
                        <th><i class="require-red">*</i>收货地址：</th>
                        <td>
                            <input class="common-text required" id="address" name="address" size="50" value="" type="text">
                        </td>
                    </tr>
                    <tr>
                        <th><i class="require-red">*</i>手机号：</th>
                        <td>
                            <input class="common-text required" id="phong" name="phong" size="50" value="" type="text">
                        </td>
                    </tr>
                    <tr>
                        <th></th>
                        <td>
                            <input class="btn btn-primary btn6 mr10" value="提交" type="submit">
                            <input class="btn btn6" onClick="history.go(-1)" value="返回" type="button">
                        </td>
                    </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </div>

</div>
<!--/main-->
</div>
</body>
</html>
