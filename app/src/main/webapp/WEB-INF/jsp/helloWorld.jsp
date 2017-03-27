<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta HTTP-EQUIV="pragma" CONTENT="no-cache">
<meta HTTP-EQUIV="Cache-Control" CONTENT="no-cache, must-revalidate">
<meta HTTP-EQUIV="expires" CONTENT="0"> 
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/main.css" />
<title>Insert title here</title>
</head>
<%
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragrma","no-cache");
response.setDateHeader("Expires",0);
%> 
<body>
This is a static text line!<br/>
Message: ${message}<br/>
book:<br>
<ul>
<li>id:${book.id }
<li>name:${book.name }
<li>press:${book.press })
<li><f:formatDate value="${book.pressDate }" pattern="yyyy-MM-dd" />
<li>date:${book.pressDate }
</ul>
</body>
</html>