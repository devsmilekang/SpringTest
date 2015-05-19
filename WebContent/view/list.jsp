<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>글쓰기</h3>
<hr>
<form action="./insert.do" method="post">
	작성자 : <input type="text" name="id">
		<form:errors path="name" cssClass="error"/> <br>
	제목 : <input type="text" name="name">
		<form:errors path="testModel.name" cssClass="error"/><br>
	내용 <br>
	<textarea rows="6" cols="70" name="contents"></textarea>
	<br>
	<input type="submit" value="등록">
</form>
</body>
</html>