<%@include file="Init.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
/* .modal-lg {
    max-width: 90% !important;
} */
/* .modal-dialog {
         max-width: 90% !important;
         height:900px !important;
        } */
</style>

</head>
<body>
<div class="container-fluid-1280">
<div class="row">
<div class="col-md-12">
<br/>
<div class="pull-right">
<span class="btn btn-danger"  style="cursor:pointer" id="showStd" >Show Students</span>
</div>
</div>
</div>

<div class="row">
<div class="col-md-12">
<center>
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
<td>Email</td><td><input type="email" name="email" class="form-control" required/></td>
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
<%-- <!-- <div id="dialog" title="Basic dialog"></div> -->
This is demo
<script>
  $("#showStd").click(function(){
	//  $('#dialog').load('/all').dialog();
	bootbox.alert('Show All');
  });

</script> --%>

<div id="myModal" class="modal fade">
    <div class="modal-dialog  modal-lg" style="max-width: 90% !important;">
        <div class="modal-content">
            <div class="modal-header">
            	<h4 class="modal-title">List Of All Students</h4>
                <!-- <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button> -->
                <button type="button" class="close" id="btn-all" aria-hidden="true">×</button>
            </div>
            <div class="modal-body" id="jspdata">
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
	$("#showStd").click(function(){
		$('#jspdata').load('/all');
		/*It will disable all key effect and outside click*/
		$("#myModal").modal({backdrop: 'static', keyboard: false});
	});
	
	 $("#btn-all").click(function(){
		 $('body').removeClass('modal-open');
		 $('.modal-backdrop').remove();
		 $("#myModal").hide();
	});
</script>


<%--This is demo --%>

<script type="text/javascript">
/* You are making Form With validate Rule You can Give Message also
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
	if($("#fn").valid()){
		var formdata=JSON.stringify($('#fn').serializeObject());
		 $.ajax({
	    	    type: 'POST',
	    	    url: 'save',
	    	    contentType: 'application/json',
	    	    async: true,
	    	    data: formdata,
	    	    success: function (result) {
	    	    var returnedData = JSON.parse(result);
	    	    //for reset all values
	    	    $('#fn')[0].reset();
	    	    bootbox.alert(returnedData.data);  
	    	    }
	    	 });
	}
	else{
		console.log("Form Data is Not Valid");
		return;
	}
});
$("#btn-reset").click(function(){
	$('#fn')[0].reset();
	bootbox.alert("Reset");
	
});
</script>

