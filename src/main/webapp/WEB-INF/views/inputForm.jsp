
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create New Product</title>
</head>
<body>
<p><a href="/list">Back to student list</a> </p>
<form:form action="/input" method="post" modelAttribute="student">
    <fieldset>
        <legend>
            Student Information
        </legend>
        <table>
            <tr>
                <td>Id:</td>
                <td><input type="text" placeholder="xxxx" name="id"/></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" placeholder="Name" name="name"/></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><input type="text" placeholder="Age" name="age"/></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" placeholder="Address" name="address"/></td>
            </tr>
            <tr>
                <td>Sex:</td>
                <td><input type="text" placeholder="Sex" name="sex"/></td>
            </tr>
            <tr>
                <td>Class:</td>
                <td><input type="text" placeholder="class" name="studentClass"/></td>
            </tr>
        </table>
        <input type="submit" value="Create New Student"/>
    </fieldset>
</form:form>
</body>
</html>
