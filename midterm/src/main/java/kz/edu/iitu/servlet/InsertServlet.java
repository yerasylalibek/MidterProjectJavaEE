package kz.edu.iitu.servlet;

import kz.edu.iitu.dao.TicketDaoImpl;
import kz.edu.iitu.dao.UserDaoImpl;
import kz.edu.iitu.model.Ticket;
import kz.edu.iitu.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "/insert")
public class InsertServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Insert Ticket");
        int id = Integer.parseInt(request.getParameter("id"));
        String froma = request.getParameter("froma");
        String tob = request.getParameter("tob");
        int price = Integer.parseInt(request.getParameter("price"));

        TicketDaoImpl ticketDao = new TicketDaoImpl();

        Ticket ticket = new Ticket();

        ticket.setId(id);
        ticket.setFrom(froma);
        ticket.setTo(tob);
        ticket.setPrice(price);


        int res = ticketDao.insert(ticket);

        if(res != 0){
            request.setAttribute("success", "Ticket Added!");
            request.getRequestDispatcher("tickets.jsp").forward(request, response);
        }else{
            request.setAttribute("wrong", "Something wrong! PLease try again!");
            request.getRequestDispatcher("tickets.jsp").forward(request, response);
        }

    }

}
