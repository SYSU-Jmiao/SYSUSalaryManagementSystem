<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
		<title>特殊情况工资变动</title>
		<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="css/index.css">
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="js/index.js"></script>
</head>
<body>
	 <form class="form-horizontal">
	 <h2>特殊情况工资变动人员列表</h2>
	 <table class="table table-bordered">
	 	<thead>
	 	<tr>
	 		<th>职工号</th>
	 		<th>姓名</th>
	 		<th>单位</th>
	 		<th>工资变动幅度</th>
	 		<th>修改原因</th>
	 		<th>修改时间</th>
	 	</tr>
	 	</thead>
	 	
	 	<tbody>
	 	<s:iterator value="#session.infoChange" id="change">
				 <tr>
				 <td><s:property value="#change[0]"/></td>
				 <td><s:property value="#change[1]"/></td>
				 <td><s:property value="#change[2]"/></td>
				 <td><s:property value="#change[3]"/></td>
				 <td><s:property value="#change[4]"/></td>
				 <td><s:property value="#change[5]"/></td>
				 </tr>
				</s:iterator>
	 	</tbody>
	 </table>
	 <div class="container" align="center">
	 <a class="btn btn-primary">导出</a>	 
	 </div>
	 </form>
</body>
</html>