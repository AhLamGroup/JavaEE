<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!doctype html>
<html>
<head>
<title>首页</title>
</head>
<body>
	<jsp:include page='<%="/servlet/NewsServlet?type1=homepageTypes"%>'
		flush="true" />
</body>
</html>
