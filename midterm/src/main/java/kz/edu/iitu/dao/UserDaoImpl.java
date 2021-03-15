package kz.edu.iitu.dao;

import kz.edu.iitu.connection.DbConnect;
import kz.edu.iitu.model.User;

import java.sql.*;

public class UserDaoImpl {

    DbConnect dbConnect = new DbConnect();

    public User checkLogin(String username, String password) throws SQLException,
            ClassNotFoundException {
        Connection connection = dbConnect.getConnection();

        String sql = "SELECT * FROM users WHERE username = ? and password = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, username);
        statement.setString(2, password);

        ResultSet result = statement.executeQuery();

        User user = null;

        if (result.next()) {
            user = new User();
            user.setName(result.getString("name"));
            user.setUsername(username);
            user.setPassword(password);
        }

        connection.close();

        return user;
    }

    public int insert(User user) {
        int status = 0;

        try{

            Connection connection = dbConnect.getConnection();

            String sql = "INSERT INTO users VALUES(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());

            status = ps.executeUpdate();

            connection.close();

        }catch (Exception e){
            System.out.println(e);
        }

        return status;
    }

}
