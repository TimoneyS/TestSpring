<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册用户</title>
</head>
<body>
    <s:url value="/user/login" var="user_login"/>
    <sf:form method="POST" action="${user_login }" commandName="user">
      <sf:errors path="*" element="div" cssClass="error"/>
      <sf:label path="username" cssErrorClass="error">用户名</sf:label>:
            <sf:input path="username" cssErrorClass="error"/><br/>
      <sf:label path="password" cssErrorClass="error">密码</sf:label>:
            <sf:password path="password" cssErrorClass="error"/><br/>
       <input type="submit" value="登陆">
    </sf:form>

</body>
</html>