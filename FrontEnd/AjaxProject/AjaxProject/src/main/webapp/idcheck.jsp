<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String userid=request.getParameter("userid");
if(userid.equals("test1")){
%>
{"result":"success"}
<%}else {%>
{"result":"false"}
<%} %>		