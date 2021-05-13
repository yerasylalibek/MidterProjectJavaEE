package kz.edu.iitu.dao;

import kz.edu.iitu.connection.DbConnect;
import kz.edu.iitu.model.Ticket;
import kz.edu.iitu.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TicketDaoImpl {


    DbConnect dbConnect = new DbConnect();

    public static List<Ticket> listAllTicket() throws SQLException {
        List<Ticket> listTicket = new ArrayList<Ticket>();
        DbConnect dbConnect = new DbConnect();

        String sql = "SELECT * FROM tickets";

        try {
            Connection connection = dbConnect.getConnection();

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String from = resultSet.getString("froma");
                String to = resultSet.getString("tob");
                int price = resultSet.getInt("price");

                Ticket ticket = new Ticket(id, from, to, price);
                //System.out.println(ticket.toString());
                listTicket.add(ticket);
            }

            resultSet.close();
            statement.close();

            connection.close();

            return listTicket;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int insert(Ticket ticket) {
        int status = 0;

        try{

            Connection connection = dbConnect.getConnection();

            String sql = "INSERT INTO tickets(id, froma, tob, price) VALUES(?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, ticket.getId());
            ps.setString(2, ticket.getFrom());
            ps.setString(3, ticket.getTo());
            ps.setInt(4, ticket.getPrice());

            status = ps.executeUpdate();

            connection.close();

        }catch (Exception e){
            System.out.println(e);
        }

        return status;
    }

    public int delete(int id) {
        int status = 0;

        try{
            Connection connection = dbConnect.getConnection();

            String sql = "DELETE FROM tickets where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);
            status = ps.executeUpdate();

            connection.close();
        }catch (Exception e){
            System.out.println(e);
        }

        return status;
    }

    public static Ticket findByName(String froma) {
        DbConnect dbConnect = new DbConnect();
        Ticket ticket= null;

        try{
            Connection connection = dbConnect.getConnection();

            String sql = "SELECT * FROM tickets WHERE froma=?";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, froma);

            ResultSet resultSet = ps.executeQuery();


        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String from  = resultSet.getString("froma");
            String tob = resultSet.getString("tob");
            int price = resultSet.getInt("price");

            ticket = new Ticket(id, from, tob, price);
        }
            resultSet.close();
            connection.close();
        }catch (Exception e){
            System.out.println(e);
        }
        return ticket;
    }

//    private String jdbcURL;
//    private String jdbcUsername;
//    private String jdbcPassword;
//    private Connection jdbcConnection;
//
//    public TicketDaoImpl(String jdbcURL, String jdbcUsername, String jdbcPassword) {
//        this.jdbcURL = jdbcURL;
//        this.jdbcUsername = jdbcUsername;
//        this.jdbcPassword = jdbcPassword;
//    }
//
//    protected void connect() throws SQLException {
//        if (jdbcConnection == null || jdbcConnection.isClosed()) {
//            try {
//                Class.forName("org.postgresql.Driver");
//            } catch (ClassNotFoundException e) {
//                throw new SQLException(e);
//            }
//            jdbcConnection = DriverManager.getConnection(
//                    jdbcURL, jdbcUsername, jdbcPassword);
//        }
//    }
//
//    protected void disconnect() throws SQLException {
//        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
//            jdbcConnection.close();
//        }
//    }
//
//    public boolean insertBook(Ticket ticket) throws SQLException {
//        String sql = "INSERT INTO tickets (froma, tob, price) VALUES (?, ?, ?)";
//        connect();
//
//        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
//        statement.setString(1, ticket.getFrom());
//        statement.setString(2, ticket.getTo());
//        statement.setFloat(3, ticket.getPrice());
//
//        boolean rowInserted = statement.executeUpdate() > 0;
//        statement.close();
//        disconnect();
//        return rowInserted;
//    }
//
//    public List<Ticket> listAllTickets() throws SQLException {
//        List<Ticket> tickets = new ArrayList<Ticket>();
//
//        String sql = "SELECT * FROM tickets";
//
//        connect();
//
//        Statement statement = jdbcConnection.createStatement();
//        ResultSet resultSet = statement.executeQuery(sql);
//
//        while (resultSet.next()) {
//
//            int id = resultSet.getInt("id");
//            String froma = resultSet.getString("froma");
//            String tob = resultSet.getString("tob");
//            int price = resultSet.getInt("price");
//
//            Ticket ticket = new Ticket(id, froma, tob, price);
//            tickets.add(ticket);
//        }
//
//        resultSet.close();
//        statement.close();
//
//        disconnect();
//
//        return tickets;
//    }
//
//    public boolean deleteTicket(Ticket ticket) throws SQLException {
//        String sql = "DELETE FROM tickets where id = ?";
//
//        connect();
//
//        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
//        statement.setInt(1, ticket.getId());
//
//        boolean rowDeleted = statement.executeUpdate() > 0;
//        statement.close();
//        disconnect();
//        return rowDeleted;
//    }
//
//    public boolean updateTicket(Ticket ticket) throws SQLException {
//        String sql = "UPDATE tickets SET froma = ?, tob = ?, price = ?";
//        sql += " WHERE id = ?";
//        connect();
//
//        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
//
//        statement.setString(1, ticket.getFrom());
//        statement.setString(2, ticket.getTo());
//        statement.setFloat(3, ticket.getPrice());
//        statement.setInt(4, ticket.getId());
//
//        boolean rowUpdated = statement.executeUpdate() > 0;
//        statement.close();
//        disconnect();
//        return rowUpdated;
//    }
//
//    public Ticket getTicket(String from) throws SQLException {
//        Ticket ticket = null;
//        String sql = "SELECT * FROM tickets WHERE froma = ?";
//
//        connect();
//
//        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
//        statement.setString(1, from);
//
//        ResultSet resultSet = statement.executeQuery();
//
//        if (resultSet.next()) {
//            int id = resultSet.getInt("id");
//            String froma  = resultSet.getString("froma");
//            String tob = resultSet.getString("tob");
//            int price = resultSet.getInt("price");
//
//            ticket = new Ticket(id, froma, tob, price);
//        }
//
//        resultSet.close();
//        statement.close();
//
//        return ticket;
//    }

}
