package kz.edu.iitu.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    public Connection getConnection() throws SQLException,
            ClassNotFoundException{

        String jdbcURL = "jdbc:postgresql://localhost:5432/midterm_javaee";
        String dbUser = "midterm";
        String dbPassword = "123456";

        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
    }
}
