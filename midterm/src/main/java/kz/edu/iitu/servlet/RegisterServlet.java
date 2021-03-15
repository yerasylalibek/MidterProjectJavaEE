package kz.edu.iitu.servlet;

import kz.edu.iitu.dao.UserDaoImpl;
import kz.edu.iitu.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("do post!");
        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String password = request.getParameter("password1");

        UserDaoImpl userDao = new UserDaoImpl();

        User user = new User();

        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);

        int res = userDao.insert(user);

        if(res != 0){
            request.setAttribute("success", "Registration done, Please login to continue!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }else{
            request.setAttribute("wrong", "Something wrong! PLease try again!");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
