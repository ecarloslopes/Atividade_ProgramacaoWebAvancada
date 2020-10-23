<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exerc�cio</title>
</head>
<body>
	<form:form method="Post" modelAttribute="banco">
		<p>Conversor de valores em d�lares ($) para Real (R$).</p>
		<p>Entre com a cota��o do d�lar: <form:input path="cotacaoDollar" /></p>
		<p>Entre com o valor em d�lares : <form:input path="dollar" /></p>
		<p><form:button>Converter</form:button></p>
		<p>${mensagem}</p>
	</form:form>
</body>
</html>