<%--
  Created by IntelliJ IDEA.
  User: jang-gyeongseog
  Date: 2022/09/25
  Time: 6:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    try{
        int value = (int)application.getAttribute("value");
        value = value + 2;
        application.setAttribute("value",value);
%>
    <h1>value : <%=value%></h1>
<%
    } catch (NullPointerException ex) {
%>
    <h1>value missing!</h1>
<%
    }
%>
</body>
</html>
