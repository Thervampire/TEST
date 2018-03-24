<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/24
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>用户列表</title>
  </head>
  <body>
    <h1 align="center">用户列表</h1>
    <table align="center" border="1" width="66%" cellpadding="1">
      <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>地址</th>
      </tr>
      <c:forEach items="${users}" var="sn">
      <tr>
        <td>${sn.id}</td>
        <td>${sn.name}</td>
        <td>${sn.address}</td>
      </tr>
      </c:forEach>
    </table>

    <div>
      <form action="student/add3.action" method="post">
        学生姓名:<input type="text" name="name"> <br>
        登录密码:<input type="password" name="password"> <br>
        学生爱好:<input type="checkbox" name="hobby" value="LOL"> LOL
        <input type="checkbox" name="hobby" value="DNF"> DNF
        <input type="checkbox" name="hobby" value="DOTA"> DOTA
        <input type="checkbox" name="hobby" value="PBUG"> PBUG
        <br>
        <input type="submit" value="提交">
      </form>
      ${students}
    </div>
  </body>
</html>
