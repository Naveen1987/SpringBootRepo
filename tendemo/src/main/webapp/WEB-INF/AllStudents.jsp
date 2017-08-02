<%@page import="com.fasterxml.jackson.core.format.InputAccessor.Std"%>
<%@page import="java.io.IOException"%>
<%@page import="com.ten.models.Student"%>
<%@page import="java.util.List"%>
<%@include file="Init.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid-1280">
<div class="row">
<div class="col-md-12">
<table class="table  table-striped">
<thead>
<tr>
<th>Name</th>
<th>Course</th>
<th>Email ID</th>
<th>Fee</th>
<th>Action</th>
</tr>
</thead>
<tbody>
<%
List<Student> st=(List<Student>)request.getAttribute("data");
for(Student s:st)
{
%>
<tr>
<td><%=s.getSname() %></td>
<td><%=s.getScourse() %></td>
<td><%=s.getEmail() %></td>
<td><%=s.getSfee() %></td>
<td>
<span class="ui-icon ui-icon-scissors" style="cursor:pointer" onClick="editInfo('<%=s.getId()%>')"></span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="ui-icon ui-icon-trash" style="cursor:pointer" onClick="deleteInfo('<%=s.getId()%>')"></span>
</td>
</tr>
<%	
}
%>
</tbody>
</table>
</div>
</div>
</div>
</body>
</html>

<script type="text/javascript">
function editInfo(stdId){
	$.ajax({
		type: 'Put',
	    url: 'edit',
	    async: true,
	    contentType: 'application/json',
	    data:{'sid':stdId},
	    success: function (result) {
	  
	    }
	});
	bootbox.alert(stdId);
}
function deleteInfo(stdId){
	
	/* $.ajax({
		type: 'POST',
	    url: 'delete',
	    contentType: 'application/json',
	    data:{'sid":stdId},
	    success: function (result) {
	    	location.reload();
	    }
	}); */
	
	$.post({
	    url: 'delete',
	    contentType: 'application/json',
	    async: true,
	    data:{'sid':stdId},
	    success: function (result) {
	    }
	});
	bootbox.alert(stdId);
}
</script>