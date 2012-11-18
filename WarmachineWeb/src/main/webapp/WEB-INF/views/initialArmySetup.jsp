<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Select Factions</title>
	<link rel="stylesheet" type="text/css" href="/warmachine/resources/css/default.css" />
	<img src="/warmachine/resources/images/banner.jpg" alt="banner_img">
	<br>
</head>
<body>
	
	<form:form method="POST" commandName="initialArmySetupVO">
		<div class="form-item">
			<form:label path="selectedFaction" class="form-label">Select your faction:</form:label>
			<form:select path="selectedFaction" items="${initialArmySetupVO.factions}" itemValue="key" itemLabel="value" cssErrorClass="form-error-field" />
			<form:errors path="selectedFaction" class="form-error-message"/>
		</div>
		<div class="form-item">
			<form:label path="numberOfWarcasters" class="form-label">Number of warcasters:</form:label>
			<form:input path="numberOfWarcasters" />
			<form:errors path="numberOfWarcasters" class="form-error-message"/>
		</div>
		<div class="form-item">
			<form:label path="numberOfPoints" class="form-label">Number of points:</form:label>
			<form:input path="numberOfPoints" />
			<form:errors path="numberOfPoints" class="form-error-message"/>
		</div>
		<div class="form-item">
			<form:label path="listName" class="form-label">List Name:</form:label>
			<form:input path="listName" />
			<form:errors path="listName" class="form-error-message"/>
		</div>
        <div>
            <input type="submit" value="Continue"/>
        </div>
	</form:form>
</body>
</html>