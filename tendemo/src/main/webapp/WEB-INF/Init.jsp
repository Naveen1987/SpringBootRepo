<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<link type="text/css" rel="stylesheet" href="/css/jquery-ui.min.css" />
<link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css" />
<link type="text/css" rel="stylesheet" href="/css/bootstrap-grid.min.css" />
<link type="text/css" rel="stylesheet" href="/css/font-awesome.min.css" />


<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/js/jquery-ui.min.js"></script>
<script type="text/javascript" src="/js/tether.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/bootbox.min.js"></script>
<script type="text/javascript" src="/js/jquery.validate.min.js"></script>
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

