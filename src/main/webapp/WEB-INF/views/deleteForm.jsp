<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Delete Product</title>
</head>
<body>
<p><a href="/list">Back to student list</a> </p>
<form method="post" action="/delete?id=${student.id}">
    <fieldset>
        <legend>Student Information</legend>
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
    </fieldset>

    <input type="submit" value="Delete This Student"/>
</form>
</body>
</html>