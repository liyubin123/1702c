<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap3/css/bootstrap-theme.min.css">
<script src="${pageContext.request.contextPath}/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap3/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function createcompanydata(){
		window.location.href="${pageContext.request.contextPath}/company/save.do"
i
	}
	
	function createEcoTypedata(){
		window.location.href="${pageContext.request.contextPath}/ecotype/save.do"
			alert("数据添加成功！");
	}
	
	function searchCompanyInfo(){
		window.location.href="${pageContext.request.contextPath}/company/list.do"
	}
	
	function searchyouxian(){
		window.location.href="${pageContext.request.contextPath}/company/findByyouxian.do"
	}
	function searchgufen(){
		window.location.href="${pageContext.request.contextPath}/company/findByGuFen.do"
	}
	function searchguoqi(){
		window.location.href="${pageContext.request.contextPath}/company/findByGuQi.do"
	}
	function searchother(){
		window.location.href="${pageContext.request.contextPath}/company/findByOther.do"
	}
	function searchalltype(){
		window.location.href="${pageContext.request.contextPath}/company/list.do"
	}
	
	
	function searchlittleCompanyInfo(){
		window.location.href="${pageContext.request.contextPath}/company/findBylittleFunds.do"
	}
	function searchmiddleCompanyInfo(){
		window.location.href="${pageContext.request.contextPath}/company/findBymiddleFunds.do"
	}
	function searchbigCompanyInfo(){
		window.location.href="${pageContext.request.contextPath}/company/findBybigFunds.do"
	}
	function searchallCompanyInfo(){
		window.location.href="${pageContext.request.contextPath}/company/list.do"
	}
	
</script>

<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="row clearfix">
				<div class="col-md-4 column">
					 <button type="button" class="btn btn-primary btn-lg btn-block" onclick="javascript:createcompanydata()">随机生成公司信息</button>
				</div>
				<div class="col-md-4 column">
					 <button type="button" class="btn btn-success btn-lg btn-block" onclick="javascript:createEcoTypedata()">随机生成经济类型</button>
				</div>
				<div class="col-md-4 column">
					 <button type="button" class="btn btn-warning btn-block btn-lg" onclick="javascript:searchCompanyInfo()">查看公司信息</button>
				</div>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-2 column">
			<h4>
				按规模：
			</h4>
		</div>
		<div class="col-md-10 column">
			<div class="col-md-3 column">
				 <button type="button" class="btn btn-primary btn-default" onclick="javascript:searchlittleCompanyInfo()">小型企业</button>
			</div>
			<div class="col-md-3 column">
				 <button type="button" class="btn btn-primary btn-default" onclick="javascript:searchmiddleCompanyInfo()">中型企业</button>
			</div>
			<div class="col-md-3 column">
				 <button type="button" class="btn btn-primary btn-default" onclick="javascript:searchbigCompanyInfo()">大型企业</button>
			</div>
			<div class="col-md-3 column">
				 <button type="button" class="btn btn-primary btn-default" onclick="javascript:searchallCompanyInfo()">全部</button>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-2 column">
			<h4>
				按类型：
			</h4>
		</div>
		<div class="col-md-10 column">
			<div class="col-md-3 column">
				 <button type="button" class="btn btn-primary btn-default" onclick="javascript:searchyouxian()">有限公司</button>
			</div>
			<div class="col-md-3 column">
				 <button type="button" class="btn btn-primary btn-default" onclick="javascript:searchgufen()">股份公司</button>
			</div>
			<div class="col-md-2 column">
				 <button type="button" class="btn btn-primary btn-default" onclick="javascript:searchguoqi()">国企</button>
			</div>
			<div class="col-md-2 column">
				 <button type="button" class="btn btn-primary btn-default" onclick="javascript:searchother()">其他</button>
			</div>
			<div class="col-md-2 column">
				 <button type="button" class="btn btn-primary btn-default" onclick="javascript:searchalltype()">全部</button>
			</div>
		</div>
	</div>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<table class="table">
				<thead>
					<tr>
						<th>公司编号</th>
						<th>
							公司名称
						</th>
						<th>
							注册资金
						</th>
						<th>
							员工数量
						</th>
						<th>
							是否上市
						</th>
						<th>
							经济类型
						</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="company" items="${companyList }">
							<tr>
								<td>${company.id } &nbsp;&nbsp;</td>
								<td>${company.GSName }&nbsp;&nbsp;</td>
								<td>${company.GSFunds }&nbsp;&nbsp;</td>
								<td>${company.GSPeople }&nbsp;&nbsp;</td>
								<td>${company.GSMarket }&nbsp;&nbsp;</td>
								<td>${company.GSEcoType }&nbsp;&nbsp;</td>
						    </tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
	
</div>
</body>
</html>