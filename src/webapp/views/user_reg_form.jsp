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
    <s:url value="/user/reg" var="user_reg"/>
    <sf:form method="POST" action="${user_reg }" commandName="user">
      <sf:errors path="*" element="div" cssClass="error"/>
      <sf:label path="username" cssErrorClass="error">用户名</sf:label>:
            <sf:input path="username" cssErrorClass="error"/><br/>
      <sf:label path="password" cssErrorClass="error">密码</sf:label>:
            <sf:password path="password" cssErrorClass="error"/><br/>
      <sf:label path="realName" cssErrorClass="error">真实姓名</sf:label>:
            <sf:input path="realName" cssErrorClass="error"/><br/>
      <sf:label path="userJob" cssErrorClass="error">职业</sf:label>:
            <sf:input path="userJob" cssErrorClass="error"/><br/>
      <sf:label path="userTitle" cssErrorClass="error">个性签名</sf:label>:
            <sf:textarea path="userTitle" cssErrorClass="error"/><br/>
       <input type="submit" value="提交">
    </sf:form>

</body>
</html>