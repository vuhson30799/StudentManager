<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 4/1/2019
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Student List</title>
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
<c:if test="${message != null}">
    <h1>${message}</h1>
</c:if>
<h1>Product List:</h1>
<table border="1">
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>AGE</td>
        <td>ADDRESS</td>
        <td>SEX</td>
        <td>CLASS</td>
        <td>DETAILS</td>
        <td>EDIT</td>
        <td>DELETE</td>
    </tr>
    <c:forEach items="${students}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.address}</td>
            <td>${student.sex}</td>
            <td>${student.studentClass}</td>
            <td><a href="/view?id=${student.id}">view</a></td>
            <td><a href="/editForm?id=${student.id}">edit</a></td>
            <td><a href="/deleteForm?id=${student.id}">delete</a></td>
        </tr>
    </c:forEach>
</table>
<h2><a href="/inputForm">Input New Student</a> </h2>
<h2><a href="/findForm">Find student</a> </h2>

</body>
</html>
