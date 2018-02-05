<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%request.setCharacterEncoding("GBK"); %>
<jsp:useBean id="reg" scope="request" class="core.Register"></jsp:useBean>
<body>
用户名：<jsp:getProperty property="name" name="reg"/><br>
年&nbsp;&nbsp;&nbsp;龄:<jsp:getProperty property="age" name="reg"/><br>
邮&nbsp;&nbsp;&nbsp;箱:<jsp:getProperty property="email" name="reg"/>
</body>
</html>