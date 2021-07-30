<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Nueva Pregunta</title>
</head>
<body>

<h1>Ingresar Nueva Cancion</h1><hr>
 
<form:form action="/questions/new" method="POST" modelAttribute="preguntas">
    
    <p>
        <form:label path="question">Pregunta :</form:label>
        <form:errors path="question"/>
        <form:input type="text" path="question"/>
    </p>     
    
    <!--
    <p>
        <form:label path="subject">Etiqueta :</form:label>
        <form:errors path="subject"/>
        <form:input type="text" path="subject"/>
    </p> <hr>
      --> 
     
    <input type="submit" value="Crear Pregunta"/>      
    
</form:form> 

</body>
</html>