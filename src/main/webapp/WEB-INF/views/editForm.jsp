
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit Student</title>
</head>
<body>
<p><a href="/list">Back to student list</a> </p>
<form:form action="edit" method="post" modelAttribute="student">
    <fieldset>
        <legend>
            Student Information
        </legend>
        <table>
            <tr>
                <td><form:label path="id">Id:</form:label></td>
                <td>${student.id}</td>
                <td style="display: none"><form:input path="id"/></td>
            </tr>
            <tr>
                <td><form:label path="name">Name:</form:label></td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td><form:label path="age">Age:</form:label></td>
                <td><form:input  path="age"/></td>
            </tr>
            <tr>
                <td><form:label path="address">Address:</form:label></td>
                <td><form:input  path="address"/></td>
            </tr>
            <tr>
                <td><form:label path="sex">Sex:</form:label></td>
                <td><form:input  path="sex"/></td>
            </tr>
            <tr>
                <td><form:label path="studentClass">StudentClass:</form:label></td>
                <td><form:input  path="studentClass"/></td>
            </tr>
        </table>
        <form:button>Edit this student</form:button>
    </fieldset>
</form:form>
</body>
</html>
