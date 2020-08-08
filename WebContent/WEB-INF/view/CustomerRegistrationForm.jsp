<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration Form</title>
<style>
	.error{color:red}
</style>
</head>
<body>
Fill out the form. Asterisk (*) means required.
<br><br>
	<form:form action="processForm" modelAttribute="customer">
		First Name(*):<form:input path="firstName" />
		<form:errors path="firstName" cssClass="error"/>
		<br><br>
		
		Last Name(*):<form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		<br><br>
		
		Age(*):<form:input path="age"/>
		<form:errors path="age" cssClass="error"/>
		<br><br>
		
		Email(*):<form:input path="email"/>
		<form:errors path="email" cssClass="error"/>
		<br><br>
		
		Gender: <br>
		Male<form:radiobutton path="gender" value="Male"/>
		Female<form:radiobutton path="gender" value="Female"/>
		TransGender<form:radiobutton path="gender" value="TransGender"/>
		Other<form:radiobutton path="gender" value="Other"/>
		<br><br>
		
		User Name(*):<form:input path="userName"/>
		<form:errors path="userName" cssClass="error"/>
		<br><br>
		
		State:<form:select path="state">
			<form:options items="${customer.stateOptions }"/>
		</form:select>
		<br><br>
		
		Postal Code(*):<form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"/>
		<br><br>
		
		Favourite City: <br>
		Delhi<form:checkbox path="favouriteCity" value="Delhi"/>
		Surat<form:checkbox path="favouriteCity" value="Surat"/>
		Bengaluru<form:checkbox path="favouriteCity" value="Bengaluru"/>
		Kolkata<form:checkbox path="favouriteCity" value="Kolkata"/>
		Chennai<form:checkbox path="favouriteCity" value="Chennai"/>

<br><br>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>