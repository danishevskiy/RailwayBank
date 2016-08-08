<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>


</head>
<body>
<div class="container">
    <h2>List clients</h2>

    <table class="table table-hover">
        <thead>
    <tr>
        <td><b>Name</b></td>
        <td><b>Age</b></td>
    </tr>
    </thead>
        <c:forEach items="${MyTest}" var="client">
            <tr>
                <td>${client.name}</td>
                <td>${client.age}</td>
            </tr>
        </c:forEach>
    </table>

</div>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<!--<script src="../../js/bootstrap.min.js"></script>-->
</body>
</html>