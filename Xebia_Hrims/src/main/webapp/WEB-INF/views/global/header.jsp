<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<%=request.getContextPath()%>/js/jQuery/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jQuery/jquery-ui.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jQuery/jquery.dataTables.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jQuery/dataTables.bootstrap.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jQuery/jquery-ui.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap/bootstrap-theme.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap/dataTables.bootstrap.css">

<div style="vertical-align: top; margin: 10px 10px 10px 10px;">
	<img width="200px;" height="50px;" src="<%=request.getContextPath()%>/images/logo_xebia.jpg">
	<jsp:include page="clock.jsp"></jsp:include>
</div>
    
<jsp:include page="navigation.jsp"></jsp:include>