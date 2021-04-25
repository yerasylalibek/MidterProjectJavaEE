package kz.edu.iitu.servlet;

import kz.edu.iitu.dao.TicketDaoImpl;
import kz.edu.iitu.model.Ticket;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "/ticket")
public class TicketServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        TicketDaoImpl ticketDao = new TicketDaoImpl();

        List<Ticket> listTickets = null;
        try {
            listTickets = ticketDao.listAllTicket();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        for(Ticket ticket : listTickets){
            System.out.println(ticket.toString());
        }

        request.setAttribute("tickets", listTickets);
        System.out.println("We came here)");

        request.getRequestDispatcher("tickets.jsp").forward(request, response);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("tickets.jsp");
//        dispatcher.forward(request, response);

    }

}
