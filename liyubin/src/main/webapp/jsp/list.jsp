<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script type="text/javascript" src="/liyubin/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
function add1(){
	location="/liyubin/add1.do";
}
function add2(){
	location="/liyubin/add2.do";
}
function list(){
	location="/liyubin/list.do";
}
</script>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-4 column">
					 <button type="button" class="btn btn-lg btn-block btn-primary" onclick="add1()">添加公司信息</button>
				</div>
				<div class="col-md-4 column">
					 <button type="button" class="btn btn-info btn-lg btn-block" onclick="add2()">添加经济类型信息</button>
				</div>
				<div class="col-md-4 column">
					 <button type="button" class="btn btn-success btn-lg btn-block" onclick="list()">查看公司信息</button>
				</div>
			</div>
			<div class="row clearfix">
				<div class="col-md-12 column">
					<table class="table">
						<thead>
							<tr>
								<th>
									编号
								</th>
								<th>
									公司名称
								</th>
								<th>
									公司金额
								</th>
								<th>
									公司人数
								</th>
								<th>
									状态
								</th>
								<th>
									公司类型
								</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${list}" var="a">
						<tr>
						<td>${a.id}</td>
						<td>${a.bname}</td>
						<td>${a.rmb}</td>
						<td>${a.rs }</td>
						<td>${a.ss }</td>
						<td>${a.bid }</td>
						</tr>
						
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>