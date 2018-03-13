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
<c:forEach items="${newUser}" var="list">
<a href="${pageContext.request.contextPath}/${list}" >Show Profile ${list}</a><br />
</c:forEach>
<h1><a href="${pageContext.request.contextPath}/admin">Admin</a></h1>

</body>
</html>