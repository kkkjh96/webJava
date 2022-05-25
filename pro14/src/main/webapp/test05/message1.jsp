<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  request.setCharacterEncoding("UTF-8");
%>    
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL 다국어 기능</title>
</head>
<body>  
	<fmt:setLocale value="en_US" />
	<%-- <fmt:setLocale value="ko_KR" /> --%>
	<h1>	
 		<fmt:bundle basename="resource.member" >  
			<fmt:message key="mem.information" /><br><br>
  			<fmt:message key="mem.title_name" /> : <fmt:message key="mem.name" /><br>
  			<fmt:message key="mem.title_address" /> : <fmt:message key="mem.address" /><br>
  			<fmt:message key="mem.title_job" /> : <fmt:message key="mem.job" />
		</fmt:bundle>
	</h1>
</body>
</html>
