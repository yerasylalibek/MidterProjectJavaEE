//package kz.edu.iitu.servlet;
//
//import kz.edu.iitu.dao.TicketDaoImpl;
//import kz.edu.iitu.model.Ticket;
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * ControllerServlet.java
// * This servlet acts as a page controller for the application, handling all
// * requests from the user.
// * @author www.codejava.net
// */
//
//public class ControllerServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//    private TicketDaoImpl ticketDao;
//
//    public void init() {
//        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
//        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
//        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
//
//        ticketDao = new TicketDaoImpl(jdbcURL, jdbcUsername, jdbcPassword);
//
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        doGet(request, response);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        String action = request.getServletPath();
//
//        try {
//            if ("/new".equals(action)) {
//                showNewForm(request, response);
//            } else if ("/insert".equals(action)) {
//                insertTicket(request, response);
//            } else if ("/delete".equals(action)) {
//                deleteTicket(request, response);
//            } else if ("/edit".equals(action)) {
//                showEditForm(request, response);
//            } else if ("/update".equals(action)) {
//                updateTicket(request, response);
//            } else {
//                listTickets(request, response);
//            }
//        } catch (SQLException ex) {
//            throw new ServletException(ex);
//        }
//    }
//
//    private void listTickets(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException, ServletException {
//        List<Ticket> listTicket = ticketDao.listAllTickets();
//        request.setAttribute("listTicket", listTicket);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("TicketList.jsp");
//        dispatcher.forward(request, response);
//    }
//
//    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        RequestDispatcher dispatcher = request.getRequestDispatcher("TicketForm.jsp");
//        dispatcher.forward(request, response);
//    }
//
//    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, ServletException, IOException {
//
//        String from = request.getParameter("from");
//        Ticket existingTicket = ticketDao.getTicket(from);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("TicketForm.jsp");
//        request.setAttribute("ticket", existingTicket);
//        dispatcher.forward(request, response);
//
//    }
//
//    private void insertTicket(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException {
//
//        String froma = request.getParameter("from");
//        String tob = request.getParameter("to");
//        int price = Integer.parseInt(request.getParameter("price"));
//
//        Ticket newTicket = new Ticket(froma, tob, price);
//        ticketDao.insertBook(newTicket);
//        response.sendRedirect("list");
//    }
//
//    private void updateTicket(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException {
//
//        int id = Integer.parseInt(request.getParameter("id"));
//        String froma = request.getParameter("from");
//        String tob = request.getParameter("to");
//        int price = Integer.parseInt(request.getParameter("price"));
//
//        Ticket ticket = new Ticket(id, froma, tob, price);
//        ticketDao.updateTicket(ticket);
//        response.sendRedirect("list");
//    }
//
//    private void deleteTicket(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//
//        Ticket ticket = new Ticket(id);
//        ticketDao.deleteTicket(ticket);
//        response.sendRedirect("list");
//    }
//}
