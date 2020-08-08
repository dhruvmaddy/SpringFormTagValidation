<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
Customer Name: ${customer.firstName} ${customer.lastName}
<br><br>
Age: ${customer.age} Years
<br><br>
Email: ${customer.email} 
<br><br>
Gender: ${customer.gender}
<br><br>
User Name: ${customer.userName}
<br><br>
State: ${customer.state}
<br><br>
Postal Code: ${customer.postalCode}
<br><br>
Favourite City: ${customer.favouriteCity}
<br><br>
</body>
</html>