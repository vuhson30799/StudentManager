<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 4/1/2019
  Time: 7:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Details</title>
</head>
<body>
<h1><a href="/list">Back to student list</a> </h1>

    <table border="1">
        <tr>
            <td>ID</td>
            <td>NAME</td>
            <td>AGE</td>
            <td>ADDRESS</td>
            <td>SEX</td>
            <td>CLASS</td>
        </tr>

        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.address}</td>
            <td>${student.sex}</td>
            <td>${student.studentClass}</td>
        </tr>
    </table>
</body>
</html>
