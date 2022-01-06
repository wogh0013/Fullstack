<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Ajax를 배워보자</h1>
<!-- 
form - 태그의 주요 속성
name - 폼태그 객체를 접근하고자 할 때 사용한다 document.name 속성값으로 객체 접근이 가능하다.
id - 폼태그 객체를 접근하고자 할 때 사용한다, 주로 jquery는 id를 사용한다. 
action - 요청을 받을 페이지 url을 지정한다. 
	     submit을 누르면 action에 있는 파일이 호출되고, 만약 비어있으면 자신을 호출한다.
	     <button>전송하기</button> <- 이것이 submit 함수를 자체 호출한다.
method - 전송방식을 지정한다. get, post가 있는데
		 get은 1000바이트 이내의 보안을 요하지 않는 가벼운 정보를 전송할 때 주로 사용한다.
		 post는 사실상 보내는 데이터 크기에 대한 제한을 받지는 않으나, 보통은 30MB가 넘어가는 데이터를 보내진 않는다.
		 서버와 클라이언트 간 http 프로토콜의 정보 전달 방식은 먼저 header라는 패킷을 보내고 나중에 body라는 패킷을 보낸다.
		 header에는 브라우저 정보나 운영체제 정보 등 비교적 간단한 정보를 보내고,
		 body에는 1000바이트 이상의 데이터들, 파일, 이미지, 그리고 텍스트 등을 전송한다.
		 post 방식은 header와 body를 둘 다 보내고,
		 get 방식은 header만 보낸다.
-->
<form name="form" action="./receive.jsp">
	아이디 : <input type="text" name="userid">
	<button type="button" onclick="goIDCheck()">아이디중복체크</button>
	<!-- button태그는 무조건 서버로 전송된다. -->
</form>

</body>
</html>

<script>
function goIDCheck()
{
	var frm = document.form}; //form의 name속성값
	frm.method="post"; //기본이 get방식이다.
	frm.action = "./receive.jsp";
	frm.submit(); //서버로 전송처리
}
</script>