<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Warmachine Army Creator</title>
	<link rel="stylesheet" type="text/css" href="/warmachine/resources/css/default.css" />
	<img src="/warmachine/resources/images/banner.jpg" alt="banner_img">
	<br>
</head>
<body>
	
	<form:form method="POST" commandName="selectWarcasterVO">
		<c:out value="You must choose ${selectWarcasterVO.numberOfWarcasters} warcasters"/>
		<div class="form-item">
			<form:label path="selectedWarcasters" class="form-label">Select your warcaster(s):</form:label>
			<form:select path="selectedWarcasters" items="${selectWarcasterVO.availableWarcasters}" itemValue="key" itemLabel="value" cssErrorClass="form-error-field" />
			<form:errors path="selectedWarcasters" class="form-error-message"/>
		</div>
        <div>
            <input type="submit" value="Continue"/>
        </div>
	</form:form>
</body>
</html>