<%--
  Created by IntelliJ IDEA.
  User: jang-gyeongseog
  Date: 2022/09/19
  Time: 12:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<body>
EL표기법으로 출력합니다.<br>
${v1} + ${v2} = ${result} <br><br>

스클립틀릿과 표현식을 이용해 출력합니다.<br>
<%
  int v1 = (int)request.getAttribute("v1");
  int v2 = (int)request.getAttribute("v2");
  int result = (int)request.getAttribute("result");
%>

<%=v1%> + <%=v2 %> = <%=result %>
</body>
</html>
