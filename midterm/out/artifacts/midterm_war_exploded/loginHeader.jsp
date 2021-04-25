<%--
  Created by IntelliJ IDEA.
  User: erasylalibek
  Date: 4/25/21
  Time: 01:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Header</title>
</head>
<body>

<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
    <h5 class="my-0 mr-md-auto font-weight-normal">Air Company</h5>
    <nav class="my-2 my-md-0 mr-md-3">
        <a class="p-2 text-dark" href="#">About us</a>
    </nav>
    <a class="btn btn-outline-primary" href="login.jsp">Sign In</a>
    <a class="btn btn-outline-primary" href="<c:url value="/logout" ">Log out</a>
</div>

</body>
</html>
