<%@page import="com.dev.vo.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%  ArrayList<MemberVO> list = (ArrayList<MemberVO>) request.getAttribute("list"); 
    if(!list.isEmpty()) {  %>
	   <table border="1">
	   		<tr><th>ID</th><th>��й�ȣ</th><th>�̸�</th><th>�̸���</th></tr>
			
			<%   for(int i=0; i<list.size(); i++){   
			       MemberVO member = list.get(i);   %>
			       
			        <tr><td><%=member.getId() %></td>
			            <td><%=member.getPwd() %></td>
			            <td><%=member.getName() %></td>
			            <
			       </tr>
			       
			<%   }
       }else{
    	   out.print("<h3>��ϵ� ȸ�� ������ �����ϴ�.</h3>");
       }
	%>
	  </table>

<%@ include file="home.jsp" %> 
</body>
</html>