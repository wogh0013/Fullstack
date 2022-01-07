<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    String userid=request.getParameter("userid");
    String password=request.getParameter("password");
    %>
    
아이디 : <%=userid %><br/>
패스워드 : <%=password %><br/>