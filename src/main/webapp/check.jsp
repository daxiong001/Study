<%@page import="org.omg.PortableServer.ForwardRequest"%>
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

<jsp:setProperty property="*" name="reg"/>

<body>

<%
	if(reg.isValidate()){
%>	
	<jsp:forward page="successed.jsp"></jsp:forward>
<%
	}else{
%>		
	<jsp:forward page="index.jsp"></jsp:forward>
	<% 
	}
%>	

</body>
</html>