<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<form name="myform" id="myform">
		userid : <input type="text" name="userid" id="userid"><br/>
		password : <input type="text" name="password" id="password"><br/><br/>
		
		<button type="button" id="btnCall">로그인</button>
	</form>
	<div id="demo"></div>
</body>
</html>

<script>
$(()=>{
	$("#btnCall").click(()=>{
		//ajax-는 함수이다. 함수의 파라미터가 JSON 형태로 전달된다.
		//키값 url:서버에서 응답을 받아 처리할 파일명
		var userid = $("#userid").val();
		var password = $("#password").val();
		
		$.ajax({
			url:"receive2.jsp",
			data:{"userid":userid, "password":password}
		})
		.done(function(data){
			console.log(data);
			$("#demo").html(data);
			})
			.fail(function(error){
				console.log(error);
			});
		});
});		
</script>