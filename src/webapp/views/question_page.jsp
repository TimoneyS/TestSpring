<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${question.title}</title>
</head>
<body>
    
    <h3>${question.title}</h3>
    <h4>${question.describle}</h4>
    
    ${contextpath}
    <%
		//相对地址 
		String path = request.getContextPath();
		//绝对地址   http：//IP地址：端口号/页面名
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
	%>
	<%=basePath %>
    ${basePath}
</body>
</html>