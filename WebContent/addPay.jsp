<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>

<script type="text/javascript">
	//var myfrom=document.getElementById("myform1");
	function addPay()
	{
		var myform=document.forms[0];
		myform.action="manage/addPay_chooseFun";
		myform.method="post";
		myform.submit();
	}
</script>
</head>
<body>
<form id="myform1" >
	薪级：<input type="text" name="managePaylevelSalary.payLevel" /><br />
	工资标准：<input type="text" name="managePaylevelSalary.salaryStandard" /><br />
	<input type="button" name="btnadd" onclick="addPay()" value="确定" />
 </form>
</body>
</html>