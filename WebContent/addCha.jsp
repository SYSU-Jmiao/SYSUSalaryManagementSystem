<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>

<script type="text/javascript">
	//var myfrom=document.getElementById("myform1");
	function addCha()
	{
		var myform=document.forms[0];
		myform.action="manage/addCha_chooseFun";
		myform.method="post";
		myform.submit();
	}
</script>
</head>
<body>
<form id="myform1" >
	级别：<input type="text" name="manageSalaryChange.positionLevel" /><br />
	任职年限下限：<input type="text" name="manageSalaryChange.lowBoundOfOfficeYear" /><br />
	任职年限上限：<input type="text" name="manageSalaryChange.upperBoundOfOfficeYear" /><br />
	套改年限下限：<input type="text" name="manageSalaryChange.lowBoundOfChangeYear" /><br />
	套改年限上限：<input type="text" name="manageSalaryChange.upperBoundOfChangeYear" /><br />
	新的薪级：<input type="text" name="manageSalaryChange.payLevel" /><br />
	<input type="button" name="btnadd" onclick="addCha()" value="确定" />
 </form>
</body>
</html>