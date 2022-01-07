<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="demo"></div>
	<button id="btnCall" onclick="loadDoc()">ajax call</button>
</body>
</html>

<script>
function loadDoc(){
	var xhttp = new XMLHttpRequest(); //객체를 생성한다.
	//onreadystatechange 속성에 callback 함수를 전달한다.
	//이 함수는 서버와 통신 중간중간에 계속 호출된다.
	//readyState라는 속성에는 통신 중인 상태에 대한 정보가 담긴다.
	//0 1 2 3 4로 상태값이 계속 바뀌는데 4일 때가 최종 정보를 받은 상태이다.
	//status라는 속성에는 응답을 받은 상태에 대한 정보가 있다. 
	//http 프로토콜은 서버의 상태에 대한 정보를 전송하는데 200이 성공적으로 응답을 한 상태이고,
	// 그밖의 숫자들은 모두 오류상태를 뜻한다.
	//그리고 전달된 callback 함수에서 위 두 개의 속성에 접근하려면 반드시 this를 사용해야 한다.
	//자바와 달리 자바스크립트는 클래스 내에서 this를 절대 생략할 수 없다.
	xhttp.onreadystatechange = function(){
		console.log(this.readyState, this.status); //여러 번 호출됨
		if(this.readyState==4 && this.status==200){
			//이 부분에서 작업한다.
			console.log(this.responseText);
			document.getElementById("demo").innerHTML=this.responseText;
		}
	}
	
	xhttp.open('get', 'ajax_info.txt', true); //true - 비동기
	xhttp.send();
}
</script>