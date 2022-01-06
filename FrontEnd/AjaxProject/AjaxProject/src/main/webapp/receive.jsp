<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//jsp - html + java (html에 java 코드를 두는 것이다.) 
		//php - html + c
		//asp - html + visual basic
		//request - 톰캣이 제공하는 기본 객체
		//브라우저에서 오는 정보를 request 객체가 받아온다. HashMap과 사용이 비슷하다.
		
		//자바코드를 둘 수 있다.
		//request.getParameter("input태그의 name속성"); // 값을 반환한다.
		String userid = request.getParameter("userid");
	%>
	<%=userid %>
</body>
</html>