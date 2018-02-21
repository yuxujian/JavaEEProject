<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="./css/myCss.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8"
	src="./js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" charset="utf-8" src="./js/myJs.js"></script>
</head>
<body>
	<h1>Test Html</h1>
	<div class="myDiv">Test Css</div>
	<button id="btn">Test Jquery</button>


<br/>
<br/>
<br/>
	<h3>Save Data to Backend</h3>
	<form method="post" id="formData">
		<p>
			username: <input type="text" name="username" />
		</p>
		<p>
			age: <input type="text" name="age" />
		</p>
		<p>
			address:<input type="text" name="address" />
		</p>
		<p>
			phone:<input type="text" name="phone" />
		</p>

		<a href="javascript:void(0)" id="send" onclick="myForm.submitForm()">send</a>
	</form>
	
<br/>
<br/>
<br/>	
	<h3>修改数据库某行值</h3>
	<button id="invisible"> Send invisible Data(not from URL) </button>
	
	
<br/>
<br/>
<br/>	
	<h3>delete a data</h3>
	<button id="del"> delete </button>
</body>
</html>