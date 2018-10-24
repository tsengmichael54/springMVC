<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  

<!--
//<base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
-->
  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>  
<script type="text/javascript" src="js/form2object.js"></script>  
<title>Add User</title>  
<script type="text/javascript">  
    $(function(){  
        $("form :button").click(function(){  
            var name = $("#name").val();  
            var age = $("#age").val();  
            $.ajax({  
                   type: "POST",  
                   url: "addUser1",  
                   data: form2object('myForm'),  
                   success:function(data){  
                       alert("name:" + data.name + "age:" + data.age);  
                   }  
            });  
        });  
    });  
</script>  
</head>  
<body>  
    <form id="myForm"action="addUser1" method="post">  
        Name:<input type="text" id="name" name="name" /><br/>  
        age:<input type="text" id="age" name="age" />  
        <input type="button" value="summit" />  
    </form>  
</body>  
</html>  