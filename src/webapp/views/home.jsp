<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:message code="home.title"/></title>
</head>
<body>
    <a href="question/create">提问</a>
<hr>
    <s:url value="/question" var="questionUrl"/>
    <a href="${questionUrl }/123">First Question</a>
</body>
</html>