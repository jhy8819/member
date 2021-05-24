<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import = "com.dev.vo.MemberVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String result = (String)request.getAttribute("result");
		if(result !=null) {
			out.print(result);
		}else{
	
	%>
	${member.id }/${member.pwd }/${member.name }
	<%} %>
	
	<%@include file="home.jsp" %>
</body>
</html>