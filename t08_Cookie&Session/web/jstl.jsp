<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="cn.wang.JSTL.user" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List list = new ArrayList();
        list.add(new user("xm",16,new Date()));
        list.add(new user("xh",17,new Date()));
        list.add(new user("xg",18,new Date()));
        request.setAttribute("list",list);
    %>

    <table border="1" width="500" align="center">
        <tr>
            <th>id</th>
            <th>name</th>
            <th>age</th>
            <th>brithday</th>
        </tr>
        <c:forEach var="u" items="${list}" varStatus="s">
            <c:if test="${s.count % 2 == 0}"><tr bgcolor="red"></c:if>
            <c:if test="${s.count % 2 == 1}"><tr bgcolor="green"></c:if>
                <td>${s.count}</td>
                <td>${u.name}</td>
                <td>${u.age}</td>
                <td>${u.briday}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
