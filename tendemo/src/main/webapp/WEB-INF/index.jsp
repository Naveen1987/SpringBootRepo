<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css" />
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/bootbox.min.js"></script>
<script type="text/javascript" src="/js/jquery.validate.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid-1280">
<div class="row">
<div class="col-md-12">
<center>
<br/>
<form action="/save" id="fn" method="POST">
<table>
<tr>
<td>Name</td><td><input name="sname" class="form-control" required/></td>
</tr> 
<tr>
<td>Course</td><td><input name="scourse" class="form-control" required/></td>
</tr> 
<tr>
<td>Fee</td><td><input name="sfee" class="form-control" required/></td>
</tr>
<tr>
<td>Email</td><td><input type="email" name="semail" class="form-control" required/></td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td colspan="2"><span class="btn btn-warning" style="cursor:pointer" id="btn-submit">Submit</span>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<span class="btn btn-primary" style="cursor:pointer" id="btn-reset">Reset </span></td>
</tr> 
</table> 
</form>
</center>
</div>
</div>
</div>
</body>
</html>
<script type="text/javascript">
<%--This to convert form value into Json It not default function I have created It--%>
$.fn.serializeObject = function()
{
   var o = {};
   var a = this.serializeArray();
   $.each(a, function() {
       if (o[this.name]) {
           if (!o[this.name].push) {
               o[this.name] = [o[this.name]];
           }
           o[this.name].push(this.value || '');
       } else {
           o[this.name] = this.value || '';
       }
   });
   return o;
};
</script>

<script type="text/javascript">
/*You are making Form With validate Rule You can Give Message also
  sfee have requred default and you put number rule so there are two rules now you can chnage message 
  with messages(Optional) otherwise default message will work. 
 
 */
$( "#fn" ).validate({
	  rules: {
	    sfee: {
	         number: true
	    }
	  },
	  messages:{
		  sfee:{
			  number:'Please Enter valid number decimal also Accepted'
		  }
	  }
	});
$("#btn-submit").click(function(){
	/*This validating You form*/
	$("#fn").valid();
	/*Working Fine R&D-1*/
    /*  var form = $('#fn');  
    bootbox.alert(form.attr('method'));
    bootbox.alert(form.attr('action'));
    var formdata=JSON.stringify(form.serializeObject());
    bootbox.alert(formdata);
 	$.ajax({
    type: form.attr('method'),
    url: form.attr('action'),
    contentType: "application/json",
    data: formdata,
    success: function (data) {
    var result=data;
    $('#result').attr("value",result);
     
    }
    });
   */
   
   /*Working Fine R&D-2*/
   /*  var formdata=JSON.stringify($('#fn').serializeObject());
      $.ajax({
    	    type: 'POST',
    	    url: 'save',
    	    contentType: "application/json",
    	    data: formdata,
    	    success: function (result) {
    	    var returnedData = JSON.parse(result);  
    	    bootbox.alert(returnedData.data);
    	    }
    	    });
	*/
});
$("#btn-reset").click(function(){
	$('#fn')[0].reset();
	bootbox.alert("Reset");
	
});
</script>

