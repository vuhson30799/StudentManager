
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create New Product</title>
</head>
<body>
<p><a href="/list">Back to student list</a> </p>
<h1>Find Student By Id</h1>
<form:form action="find" method="post" modelAttribute="findForm">
    <fieldset>
        <legend>
            ID
        </legend>
        <table>
            <tr>
                <td><form:label path="id">Id:</form:label></td>
                <td><form:input path="id"/></td>
            </tr>
        </table>
        <form:button>Find This Student</form:button>
    </fieldset>
</form:form>
<h1>Find Student By Name</h1>
<form:form action="find" method="post" modelAttribute="findForm">
    <fieldset>
        <legend>
            Name
        </legend>
        <table>
            <tr>
                <td><form:label path="name">Name:</form:label></td>
                <td><form:input path="name"/></td>
            </tr>
        </table>
        <form:button>Find This Student</form:button>
    </fieldset>
</form:form>
</body>
</html>
