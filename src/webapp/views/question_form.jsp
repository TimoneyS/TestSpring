<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css" >
        div.error {
            background-color: #ffcccc;
            boarder: 2px solid red;
        }
        label.error {
            color: red
        }
        input.error {
            background-color: #ffcccc;
        }
        
    </style>
    <title>提个问题</title>
</head>
<body>

    <sf:form method="POST" action="create" commandName="question">
        <sf:errors path="*" element="div" cssClass="error"/>
      <sf:label path="title" cssErrorClass="error">标题</sf:label>:             
      <sf:input path="title" cssErrorClass="error"/><br/>
                    描述 <sf:textarea path="describle"/><br/>
       <input type="submit" value="提交">
    </sf:form>

</body>
</html>