<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<form:form action="/actor" method="post">
    <input type="text" name="firstName"><br>
    <input type="text" name="lastName">
    <button type="button" name="confirmation">Save</button>
</form:form>
<div class="container">
    <table class="table table-bordered">
        <thead>
        <tr>
            <td>first Name</td>
            <td>last Name</td>
            <td>delete</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="actor" items="${actors}">
            <tr>
                <td>${actor.name}</td>
                <td><a href="/deleteCountry/${actor.id}" style="text-decoration: none">delete</a></td>
                <%--<td><a href="/updateCountry/${country.id}" style="text-decoration: none"><spring:message code="label.update"/></a></td>--%>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>