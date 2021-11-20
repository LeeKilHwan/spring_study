<%@page import="kr.smhrd.domain.Board"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	List<Board> list = (List<Board>)request.getAttribute("list");
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>작성일</td>
		<td>조회수</td>
	</tr>
	<% for(Board vo : list){ %>
		<tr>
			<td><%=vo.getIdx() %></td>
			<td><%=vo.getTitle() %></td>
			<td><%=vo.getWriter() %></td>
			<td><%=vo.getIndate() %></td>
			<td><%=vo.getCount() %></td>
		</tr>
	
	
	<%} %>
</table>
</body>
</html>