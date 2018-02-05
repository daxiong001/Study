<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<% request.setCharacterEncoding("GBK"); %>
<jsp:useBean id="reg" scope="request" class="core.Register"></jsp:useBean>
<body>
<form action="check.jsp" method="post">

用户名：<input type="text" name="name" value='<jsp:getProperty property="name" name="reg"/>'><%=reg.getEerrorsMsg("errname")%><br>

年&nbsp;&nbsp;&nbsp;龄：<input type="text" name="age" value='<jsp:getProperty property="age" name="reg"/>'><%=reg.getEerrorsMsg("errage") %><br>

邮&nbsp;&nbsp;&nbsp;箱：<input type="text" name="email" value='<jsp:getProperty property="email" name="reg"/>'><%=reg.getEerrorsMsg("erremail") %><br>

<input type="submit" value="注册"><input type="reset" value="重置">

</form>
</body>
</html>