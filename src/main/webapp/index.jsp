<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-1.10.1.min.js"></script>
<script>
function test(){
	
	$.ajax({
		 url:"/test2/test.do",
		 data:{},
		 type:"post",
		 dataType:"json",
		 success:function(data){
			 alert("success");
		 },
		 error:function(){
			 alert("error");
		 }
	 });
	
	
}

</script>
<body>
<input type="button" value="test" onclick="test();"/>
</body>
</html>