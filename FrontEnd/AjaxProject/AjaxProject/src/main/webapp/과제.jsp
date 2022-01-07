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

<h1>Ajax를 배워보자</h1>
<form name="form" action="">
	아이디 : <input type="text" name="userid" id="userid">
	<button type="button" id="btnCall">아이디중복체크</button> <br/>
	<span id="result"></span>
</form>

</body>
</html>

<script>
$(()=>{
	$("#btnCall").click(()=>{
		$.ajax({url:"idcheck.jsp", 
				data:{"userid":$("#userid").val()}, 
				dataType:"json"})
		.done(function(data){
			if(data.result=="success")
				$("#result").html("사용가능한 아이디입니다.");
			else
				$("#result").html("이미 사용 중인 아이디입니다.");
		})
		.fail(function(error){
			console.log(error);
		});
	});
});

function goIDCheck()
{
   var frm = document.form;  //form의 name속성값 
   frm.method="post"; //기본이 get이다 
   frm.action = "./receive.jsp";
   frm.submit();//서버로 전송하라 
}

</script>