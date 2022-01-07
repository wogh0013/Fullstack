<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    String name=request.getParameter("name");
    String work_time=request.getParameter("work_time");
    String per_pay=request.getParameter("per_pay");
    
    int pay = Integer.parseInt(work_time) * Integer.parseInt(per_pay);
    String result = name + "님의 주급은 " + pay + "원입니다.";
    %>
    
<%=result %>