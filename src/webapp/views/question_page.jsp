<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${question.title}</title>
</head>
<body>
    
    <h3>${question.title}</h3>
    <h4>${question.describle}</h4>
    
    
    <a href="<s:url value="/question/123"/>">12434</a>
</body>
</html>