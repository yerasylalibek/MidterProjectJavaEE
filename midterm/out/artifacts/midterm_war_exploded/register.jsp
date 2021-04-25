<%--
  Created by IntelliJ IDEA.
  User: erasylalibek
  Date: 3/12/21
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        #formFooter {
            background-color: #f6f6f6;
            border-top: 1px solid #dce8f1;
            padding: 25px;
            text-align: center;
            -webkit-border-radius: 0 0 10px 10px;
            border-radius: 0 0 10px 10px;
        }

        .underlineHover:after {
            display: block;
            left: 0;
            bottom: -10px;
            width: 0;
            height: 2px;
            background-color: #56baed;
            content: "";
            transition: width 0.2s;
        }

        .underlineHover:hover {
            color: #0d0d0d;
        }

        .underlineHover:hover:after{
            width: 100%;
        }

        body {
            background:#333;
        }
        #login {
            -webkit-perspective: 1000px;
            -moz-perspective: 1000px;
            perspective: 1000px;
            margin-top:50px;
            margin-left:30%;
        }
        .login {
            font-family: 'Josefin Sans', sans-serif;
            -webkit-transition: .3s;
            -moz-transition: .3s;
            transition: .3s;
            -webkit-transform: rotateY(40deg);
            -moz-transform: rotateY(40deg);
            transform: rotateY(40deg);
        }
        .login:hover {
            -webkit-transform: rotate(0);
            -moz-transform: rotate(0);
            transform: rotate(0);
        }
        .login article {

        }
        .login .form-group {
            margin-bottom:17px;
        }
        .login .form-control,
        .login .btn {
            border-radius:0;
        }
        .login .btn {
            text-transform:uppercase;
            letter-spacing:3px;
        }
        .input-group-addon {
            border-radius:0;
            color:#fff;
            background:#f3aa0c;
            border:#f3aa0c;
        }
        .forgot {
            font-size:16px;
        }
        .forgot a {
            color:#333;
        }
        .forgot a:hover {
            color:#5cb85c;
        }

        #inner-wrapper, #contact-us .contact-form, #contact-us .our-address {
            color: #1d1d1d;
            font-size: 19px;
            line-height: 1.7em;
            font-weight: 300;
            padding: 50px;
            background: #fff;
            box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.16), 0 2px 10px 0 rgba(0, 0, 0, 0.12);
            margin-bottom: 100px;
        }
        .input-group-addon {
            border-radius: 0;
            border-top-right-radius: 0px;
            border-bottom-right-radius: 0px;
            color: #fff;
            background: #f3aa0c;
            border: #f3aa0c;
            border-right-color: rgb(243, 170, 12);
            border-right-style: none;
            border-right-width: medium;
        }
    </style>
    <title>Register</title>
</head>
<body>

<%@include file="loginHeader.jsp" %>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="col-md-4 col-md-offset-4" id="login">
    <section id="inner-wrapper" class="login">
        <article>
            <form action="register" method="post">
                <div class="form-group">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-user"> </i></span>
                        <input type="text" name = "name" class="form-control" placeholder="Name">
                    </div>
                </div>
                <div class="form-group">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-envelope"> </i></span>
                        <input type="email" name = "username" class="form-control" placeholder="Username">
                    </div>
                </div>
                <div class="form-group">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-key"> </i></span>
                        <input type="password" name = "password1" class="form-control" placeholder="Password">
                    </div>
                </div>
                <div class="form-group">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-key"> </i></span>
                        <input type="password" name = "password2" class="form-control" placeholder="Confirm Password">
                    </div>
                </div>
                <button type="submit" name="submit" class="btn btn-success btn-block">Register</button>
            </form>
        </article>
        <div id="formFooter">
            <a class="underlineHover" href="login.jsp">Back to the Login</a>
        </div>
    </section>

</div>

<%--<form action="register" method="post">--%>
<%--    <table style="background-color: burlywood; margin-left: 20px;">--%>
<%--        <tr style="color: red">--%>
<%--            <td> <h1>Registration Page!!!</h1> </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Name: </td>--%>
<%--            <td><input type="text" name = "name" required></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Username: </td>--%>
<%--            <td><input type="text" name = "username" required></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Password: </td>--%>
<%--            <td><input type="password" name = "password1" required></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Re-Type Password: </td>--%>
<%--            <td><input type="password" name = "password2" required></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>--%>
<%--                <input type="submit" name="submit" value="Register">--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <a href="login.jsp">Back to Login Page</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--</form>--%>
</body>
</html>
