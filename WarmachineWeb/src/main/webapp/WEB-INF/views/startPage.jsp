<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="/warmachine/resources/scripts/startPage.js"></script>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Warmachine Army Creator</title>
	<link rel="stylesheet" type="text/css" href="/warmachine/resources/css/default.css" />
	<img src="/warmachine/resources/images/banner.jpg" alt="banner_img">
	<br>
</head>
<body>
	
	<form:form method="POST" commandName="startPageVO">
		<div class="form-item">
			<div class="form-label">Select your action:</div>
			<c:forEach var="action" items="${startPageVO.availableActions}">
				<form:radiobutton path="selectedAction" value="${action.key}"/> ${action.value}
			</c:forEach>
			<div class="form-error-message">
				<form:errors path="selectedAction" class="form-error-message"/>
			</div>
		</div>
		<div id="armyList"></div>
        <div>
            <input type="submit" value="Continue"/>
        </div>
	</form:form>
</body>
</html>