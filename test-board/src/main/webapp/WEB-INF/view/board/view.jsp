<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>게시판 글보기</h2>
<table>
	<tr>
		<td>글번호</td>
		<td>제목</td>
		<td>조회수</td>
		<td>작성자</td>
		<td>내용</td>
		<td>작성일</td>
		
	</tr>
	<tr>
		<td>${board.no}</td>
		<td>${board.title}</td>
		<td>${board.target}</td>
		<td>${board.writer}</td>
		<td>${board.content}</td>
		<td>${board.wdate}</td>
	</tr>

</table>
</body>
</html>