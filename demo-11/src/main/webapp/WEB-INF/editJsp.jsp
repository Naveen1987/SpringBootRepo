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
Hello here <%=request.getParameter("sid") %>
<span id="btn-clo" class="btn btn-primary" style="cursor:pointer">Open</span>
</body>
</html>

<div id="myModal_1" class="modal fade">
    <div class="modal-dialog  modal-lg" style="max-width: 90% !important;" >
        <div class="modal-content">
            <div class="modal-header">
            	<h4 class="modal-title">List Of All Students</h4>
                <!-- <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button> -->
                <button type="button" class="close" id="btn-me" aria-hidden="true">×</button>
            </div>
            <div class="modal-body">
            Hello
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
$('#btn-clo').click(function(){
	$("#myModal_1").modal({backdrop: 'static', keyboard: false});
});
$("#btn-me").click(function(){
	    $("#myModal_1").hide();
});
</script>