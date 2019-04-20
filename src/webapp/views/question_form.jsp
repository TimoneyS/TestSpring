<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提个问题</title>
</head>
<body>

    <form action="create" method="POST">
                            标题 <input type="text" name="title"/><br/><br/>
                            内容 <textarea rows="5" cols="20" name="describle"></textarea>
         <input type="submit">
    </form>

</body>
</html>