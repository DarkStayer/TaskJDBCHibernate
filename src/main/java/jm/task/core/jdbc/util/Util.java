package jm.task.core.jdbc.util;
import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/users" + "?autoReconnect=true";
    private static final String USER = "root";
    private static final String PASSWORD ="root";

    public Connection getConnection (){
        Connection connection = null;
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            return DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR");
        } return null;
    }
}
