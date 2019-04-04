<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 4/3/2019
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Student</title>
    <style>
        table{
            width: 50%;
            height: 50%;
            margin: 10px 10px 10px 30%;
            border-collapse: collapse;
            text-align: center;
        }
        form{
            margin-left: 50%;
        }
        h1,h2{
            padding-left: 50%;
        }
    </style>
</head>
<body>
<h1>Student List:</h1>
<table border="1">
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>AGE</td>
        <td>ADDRESS</td>
        <td>SEX</td>
        <td>CLASS</td>
    </tr>
    <c:forEach items="${students}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.address}</td>
            <td>${student.sex}</td>
            <td>${student.studentClass}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
