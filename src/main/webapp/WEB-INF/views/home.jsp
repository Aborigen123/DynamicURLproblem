<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
<h4> Перехід на список лістів виконується добре н-д: http://localhost:8080/User4 <br />
а от коли переходжу далі на наступну сторінку в мене http://localhost:8080/user/profile User4 пропадає <br />
я не дуже розумію як з цими url працювати могли б ви мені пояснити на уроці.
</h4>
<c:forEach items="${newUser}" var="list">
<a href="${pageContext.request.contextPath}/${list}" >Show Profile ${list}</a><br />
</c:forEach>
<h1><a href="${pageContext.request.contextPath}/admin">Admin</a></h1>

</body>
</html>