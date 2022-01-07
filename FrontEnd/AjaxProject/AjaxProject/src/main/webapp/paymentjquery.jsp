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
		이름 : <input type="text" name="name" id="name"><br/>
		근무시간 : <input type="text" name="work_time" id="work_time"><br/>
		시간당 급여액 : <input type="text" name="per_pay" id="per_pay"><br/>
		
		<button type="button" id="btnCall">계산하기</button>
	</form>
	<div id="demo"></div>
</body>
</html>

<script>
$(()=>{
	$("#btnCall").click(()=>{
		//ajax-는 함수이다. 함수의 파라미터가 JSON 형태로 전달된다.
		//키값 url:서버에서 응답을 받아 처리할 파일명
		name = document.getElementById("name").value;
		work_time = document.getElementById("work_time").value;
		per_pay = document.getElementById("per_pay").value;
		
		$.ajax({
			url:"paymentjquery_receive.jsp",
			data:{"name":name, "work_time":work_time , "per_pay":per_pay},
			method:"post"
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