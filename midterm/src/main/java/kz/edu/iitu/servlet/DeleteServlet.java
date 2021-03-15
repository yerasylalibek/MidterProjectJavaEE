package kz.edu.iitu.servlet;

import kz.edu.iitu.dao.TicketDaoImpl;
import kz.edu.iitu.model.Ticket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "/delete")
public class DeleteServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Delete Ticket");
        int id = Integer.parseInt(request.getParameter("id"));

        TicketDaoImpl ticketDao = new TicketDaoImpl();

        int res = ticketDao.delete(id);

        if(res != 0){
            request.setAttribute("success", "Ticket Deleted!");
            request.getRequestDispatcher("tickets.jsp").forward(request, response);
        }else{
            request.setAttribute("wrong", "Something wrong! PLease try again!");
            request.getRequestDispatcher("tickets.jsp").forward(request, response);
        }

    }
}
