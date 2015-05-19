<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>     
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 헤더영역 -->
	<tiles:insertAttribute name="header"/>
	<hr>	
	
	<!-- 바디영역 -->
	<tiles:insertAttribute name="body"/>
	<hr>	
	
	<!-- 푸터영역 -->
	<tiles:insertAttribute name="footer"/>
	
	
</body>
</html>