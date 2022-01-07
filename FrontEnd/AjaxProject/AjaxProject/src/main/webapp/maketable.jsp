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
	<table id="mytable">
		<thead>
			<tr> 
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
		</tbody>
	</table>
</body>
</html>

<script>
$(()=>{
		//ajax-는 함수이다. 함수의 파라미터가 JSON 형태로 전달된다.
		//키값 url:서버에서 응답을 받아 처리할 파일명
		$.ajax({url:"board_list.jsp", dataType:"json"})
		.done(function(data){
			//데이터 타입을 주지 않으면 String(문자열)로 온다. 
			//데이터 타입을 JSON으로 지정해주든가 JSON.parse함수를 사용하든지 해서
			//String 말고 JSON객체로 받아야 한다.
			console.log(data);
			
			data.forEach((e)=>{
				var row = '<tr>';
					row += '<td>'+ e.id +'</td>';
					row += '<td>'+ e.title +'</td>';
					row += '<td>'+ e.writer +'</td>';
					row += '<td>'+ e.hit +'</td>';
					row += '</tr>';
					
				$("#mytable > tbody:last").append(row);
			});
		})
		.fail(function(error){
			console.log(error);
		});
})
</script>