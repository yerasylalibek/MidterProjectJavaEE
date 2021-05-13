package kz.edu.iitu.servlet;

import kz.edu.iitu.dao.TicketDaoImpl;
import kz.edu.iitu.model.Ticket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "/find")
public class FindServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Find Ticket");

        String froma = request.getParameter("froma");
        Ticket ticket = TicketDaoImpl.findByName(froma);

        if(ticket != null){
            System.out.println(ticket.toString());

            request.setAttribute("success", ticket);
            request.getRequestDispatcher("showTicket.jsp").forward(request, response);
        }else{
            request.setAttribute("wrong", "Something wrong! PLease try again!");
            request.getRequestDispatcher("showTicket.jsp").forward(request, response);
        }
    }
}
