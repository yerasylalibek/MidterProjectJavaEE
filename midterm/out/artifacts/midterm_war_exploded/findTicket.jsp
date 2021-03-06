<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<jsp:useBean id="user" class="kz.edu.iitu.model.User" scope="session"/>
<jsp:setProperty name="user" property="*"/>
<%@ page import="java.util.List" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="kz.edu.iitu.model.Ticket" %>
<%@ page import="kz.edu.iitu.dao.TicketDaoImpl" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
            <a class="nav-item nav-link active" href="ticket">Tickets <span class="sr-only">(current)</span></a>
            <a class="nav-item nav-link" href="addTicket.jsp">Add</a>
            <a class="nav-item nav-link" href="findTicket.jsp">Find Ticket</a>
            <a class="nav-item nav-link" href="deleteTicket.jsp">Delete</a>
        </div>
    </div>
</nav>

<jsp:useBean id="ticket" class="kz.edu.iitu.dao.TicketDaoImpl"></jsp:useBean>

<form action="find" method="post" style="margin: 5px">
    <h2 style="text-align: center">Find Ticket</h2>
    <div style="margin: 15px">
        <div class="form-group">
            <label for="exampleInputEmail1">Enter id</label>
            <input type="text" name="froma" class="form-control" id="exampleInputEmail1" placeholder="From where?">
        </div>
        <button type="submit" name="submit" class="btn btn-success ">Find</button>
    </div>
</form>



<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

</body>
</html>
