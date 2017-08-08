<%@page import="com.elv.models.Student"%>
<%@include file="Init.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Student std=(Student)request.getAttribute("student"); %>
<center>
<form  id="fn_1" method="POST">
<input type="hidden" class="form-control" name="id" value="<%=std.getId() %>"/>
<table>
<tr>

<td>Name</td><td><input name="sname"  class="form-control" value="<%=std.getSname() %>" required/></td>
</tr> 
<tr>
<td>Course</td><td><input name="scourse" class="form-control" value="<%=std.getScourse() %>" required/></td>
</tr> 
<tr>
<td>Fee</td><td><input name="sfee" class="form-control" value="<%=std.getSfee() %>" required/></td>
</tr>
<tr>
<td>Email</td><td><input type="email" name="email" value="<%=std.getEmail() %>" class="form-control" required/></td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td colspan="2"><span class="btn btn-warning" style="cursor:pointer" id="btn-submit-edit">Submit</span></tr> 
</table> 
</form>
</center>
</body>
</html>

<script type="text/javascript">
/* You are making Form With validate Rule You can Give Message also
  sfee have requred default and you put number rule so there are two rules now you can chnage message 
  with messages(Optional) otherwise default message will work. 
 */ 
$( "#fn_1" ).validate({
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
$("#btn-submit-edit").click(function(){
	//alert('Hello');
	/*This validating You form*/
   if($("#fn_1").valid()){
		var formdata=JSON.stringify($('#fn_1').serializeObject());
		 $.ajax({
	    	    type: 'POST',
	    	    url: 'editStd',
	    	    contentType: 'application/json',
	    	    async: true,
	    	    data: formdata,
	    	    success: function (result) {
	    	    var returnedData = JSON.parse(result);
	    	    //for reset all values
	    	     bootbox.alert(returnedData.data);  
	    	    }
	    	 });
	}
	else{
		console.log("Form Data is Not Valid");
		return;
	}
});
</script>


