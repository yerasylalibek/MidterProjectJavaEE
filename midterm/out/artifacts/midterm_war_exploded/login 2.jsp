<%--
  Created by IntelliJ IDEA.
  User: erasylalibek
  Date: 3/12/21
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        html {
            background-color: #56baed;
        }

        body {
            font-family: "Poppins", sans-serif;
            height: 100vh;
        }

        a {
            color: #92badd;
            display:inline-block;
            text-decoration: none;
            font-weight: 400;
        }

        h2 {
            text-align: center;
            font-size: 16px;
            font-weight: 600;
            text-transform: uppercase;
            display:inline-block;
            margin: 40px 8px 10px 8px;
            color: #cccccc;
        }



        /* STRUCTURE */

        .wrapper {
            display: flex;
            align-items: center;
            flex-direction: column;
            justify-content: center;
            width: 100%;
            min-height: 100%;
            padding: 20px;
        }

        #formContent {
            -webkit-border-radius: 10px 10px 10px 10px;
            border-radius: 10px 10px 10px 10px;
            background: #fff;
            padding: 30px;
            width: 90%;
            max-width: 450px;
            position: relative;
            padding: 0px;
            -webkit-box-shadow: 0 30px 60px 0 rgba(0,0,0,0.3);
            box-shadow: 0 30px 60px 0 rgba(0,0,0,0.3);
            text-align: center;
        }

        #formFooter {
            background-color: #f6f6f6;
            border-top: 1px solid #dce8f1;
            padding: 25px;
            text-align: center;
            -webkit-border-radius: 0 0 10px 10px;
            border-radius: 0 0 10px 10px;
        }



        /* TABS */

        h2.inactive {
            color: #cccccc;
        }

        h2.active {
            color: #0d0d0d;
            border-bottom: 2px solid #5fbae9;
        }



        /* FORM TYPOGRAPHY*/

        input[type=button], input[type=submit], input[type=reset]  {
            background-color: #56baed;
            border: none;
            color: white;
            padding: 15px 80px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            text-transform: uppercase;
            font-size: 13px;
            -webkit-box-shadow: 0 10px 30px 0 rgba(95,186,233,0.4);
            box-shadow: 0 10px 30px 0 rgba(95,186,233,0.4);
            -webkit-border-radius: 5px 5px 5px 5px;
            border-radius: 5px 5px 5px 5px;
            margin: 5px 20px 40px 20px;
            -webkit-transition: all 0.3s ease-in-out;
            -moz-transition: all 0.3s ease-in-out;
            -ms-transition: all 0.3s ease-in-out;
            -o-transition: all 0.3s ease-in-out;
            transition: all 0.3s ease-in-out;
        }

        input[type=button]:hover, input[type=submit]:hover, input[type=reset]:hover  {
            background-color: #39ace7;
        }

        input[type=button]:active, input[type=submit]:active, input[type=reset]:active  {
            -moz-transform: scale(0.95);
            -webkit-transform: scale(0.95);
            -o-transform: scale(0.95);
            -ms-transform: scale(0.95);
            transform: scale(0.95);
        }

        input[type=text] {
            background-color: #f6f6f6;
            border: none;
            color: #0d0d0d;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 5px;
            width: 85%;
            border: 2px solid #f6f6f6;
            -webkit-transition: all 0.5s ease-in-out;
            -moz-transition: all 0.5s ease-in-out;
            -ms-transition: all 0.5s ease-in-out;
            -o-transition: all 0.5s ease-in-out;
            transition: all 0.5s ease-in-out;
            -webkit-border-radius: 5px 5px 5px 5px;
            border-radius: 5px 5px 5px 5px;
        }

        input[type=text]:focus {
            background-color: #fff;
            border-bottom: 2px solid #5fbae9;
        }

        input[type=text]:placeholder {
            color: #cccccc;
        }



        /* ANIMATIONS */

        /* Simple CSS3 Fade-in-down Animation */
        .fadeInDown {
            -webkit-animation-name: fadeInDown;
            animation-name: fadeInDown;
            -webkit-animation-duration: 1s;
            animation-duration: 1s;
            -webkit-animation-fill-mode: both;
            animation-fill-mode: both;
        }

        @-webkit-keyframes fadeInDown {
            0% {
                opacity: 0;
                -webkit-transform: translate3d(0, -100%, 0);
                transform: translate3d(0, -100%, 0);
            }
            100% {
                opacity: 1;
                -webkit-transform: none;
                transform: none;
            }
        }

        @keyframes fadeInDown {
            0% {
                opacity: 0;
                -webkit-transform: translate3d(0, -100%, 0);
                transform: translate3d(0, -100%, 0);
            }
            100% {
                opacity: 1;
                -webkit-transform: none;
                transform: none;
            }
        }

        /* Simple CSS3 Fade-in Animation */
        @-webkit-keyframes fadeIn { from { opacity:0; } to { opacity:1; } }
        @-moz-keyframes fadeIn { from { opacity:0; } to { opacity:1; } }
        @keyframes fadeIn { from { opacity:0; } to { opacity:1; } }

        .fadeIn {
            opacity:0;
            -webkit-animation:fadeIn ease-in 1;
            -moz-animation:fadeIn ease-in 1;
            animation:fadeIn ease-in 1;

            -webkit-animation-fill-mode:forwards;
            -moz-animation-fill-mode:forwards;
            animation-fill-mode:forwards;

            -webkit-animation-duration:1s;
            -moz-animation-duration:1s;
            animation-duration:1s;
        }

        .fadeIn.first {
            -webkit-animation-delay: 0.4s;
            -moz-animation-delay: 0.4s;
            animation-delay: 0.4s;
        }

        .fadeIn.second {
            -webkit-animation-delay: 0.6s;
            -moz-animation-delay: 0.6s;
            animation-delay: 0.6s;
        }

        .fadeIn.third {
            -webkit-animation-delay: 0.8s;
            -moz-animation-delay: 0.8s;
            animation-delay: 0.8s;
        }

        .fadeIn.fourth {
            -webkit-animation-delay: 1s;
            -moz-animation-delay: 1s;
            animation-delay: 1s;
        }

        /* Simple CSS3 Fade-in Animation */
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



        /* OTHERS */

        *:focus {
            outline: none;
        }

        #icon {
            width:60%;
        }
    </style>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
    <h5 class="my-0 mr-md-auto font-weight-normal">Air Company</h5>
    <nav class="my-2 my-md-0 mr-md-3">
        <a class="p-2 text-dark" href="#">About us</a>
    </nav>
    <a class="btn btn-outline-primary" href="login.jsp">Sign In</a>
    <a class="btn btn-outline-primary" href="<c:url value="/logout">Log out</a>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>


<div class="wrapper fadeInDown">
    <div id="formContent">

        <div class="fadeIn first">
            <img src="data:image/png;base64,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" id="icon" alt="User Icon" />
        </div>
        <h3 style="color: red">${message}</h3> <h3 style="color: greenyellow">${success}</h3>

        <!-- Login Form -->
        <form action="login" method="post">
            <input type="text" id="login" class="fadeIn second" name="username" placeholder="username">
            <input type="text" id="password" class="fadeIn third" name="password" placeholder="password">
            <input type="submit" name="submit" class="fadeIn fourth" value="Login">
        </form>

        <div id="formFooter">
            <a class="underlineHover" href="register.jsp">Registration</a>
        </div>

    </div>
</div>

<%--    <form action="login" method="post">--%>
<%--        <table style="background-color: skyblue; margin-left: 20px;">--%>

<%--            <tr>--%>
<%--                <td>Username: </td>--%>
<%--                <td><input type="text" name = "username"></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>Password: </td>--%>
<%--                <td><input type="password" name = "password"></td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>--%>
<%--                    <input type="submit" name="submit" value="Login">--%>
<%--                </td>--%>
<%--                <td>--%>
<%--                    <a href="register.jsp"> Registration</a>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--        </table>--%>
<%--    </form>--%>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
</body>
</html>
