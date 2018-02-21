$(function() {

	$("#btn").click(function() {
		alert("hello world");
	})
	
	
	$("#invisible").click(function() {
		$.ajax({
			   type: "PUT",
			   url: "/rest/content/yuTest",
			   data: {id:1,name:"yuxujian"},
			   success: function(msg){
				   alert('提示: 重命名成功!');
			   },
			   error: function(){
				   alert('提示: 重命名失败!');
			   }
			});
	})
	
	
	$("#del").click(function() {
		$.ajax({
			   type: "POST",
			   url: "/rest/content/yuTest",
			   data : {id:7,"_method":"DELETE"},
			   success: function(msg){
				   alert('提示:删除成功!');
				  
			   },
			   error: function(){
				   $.messager.alert('提示:删除失败!');
			   }
			});
	})

})

//下面这种写法不是Jquery,它是Javascript,所以定义在外面
var myForm = {
	submitForm : function() {
		console.log($("#formData").serialize())
		$.ajax({
			type : "POST",
			url : "/rest/content/yuTest",
			data : $("#formData").serialize(),
			statusCode : {
				201 : function() {
					alert('提示: 新增内容成功!');
					
				},
				500 : function() {
					alert('提示: 新增内容失败!');
				}
			}

		});

	}
}

