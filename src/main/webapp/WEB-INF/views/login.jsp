<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<style>
    .errMsg {
        color: red;
        font-size: 16px;
    }
</style>
</head>
<body>
    <form action="user/login" method="POST">
        <table>
            <tr>
                <td>用户名:</td>
                <td><input name="username" /></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password" /></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="登录">
                </td>
                <td><span class="errMsg">${request.errMsg }</span></td>
            </tr>
        </table>
    </form>
</body>
</html>