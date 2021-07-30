<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Tablero de Preguntas</title>
</head>
<body>

<h1>Tablero de Preguntas</h1><hr>

<table border=1>
    <thead>
        <tr>
            <th>Nº</th>
            <th>Preguntas</th>
            <th>Etiquetas</th>                   
        </tr>
        
    </thead>
    <tbody>
        <c:forEach items="${preguntas.etiquetas}" var="pregunta">
        <tr>
            <td><c:out value="${pregunta.id}"/></td>
            <td><a href="/questions/${pregunta.id}"><c:out value="${pregunta.question}"/></a></td>
            <td><c:out value="${pregunta.subject}"/></td>                
        </tr>
        </c:forEach>       
    </tbody>
</table><hr>

<a href="/questions/new">Nueva Pregunta</a>


</body>
</html>