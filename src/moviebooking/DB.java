package moviebooking;

import java.io.*;
import java.sql.*;
import java.util.logging.*;

public class DB {
    private static final String url = "jdbc:mysql://localhost:3306/bookingusr?useSSL=false";
    private static final String username = "root";
    private static final String password = "jing.,18x";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() throws SQLException, IOException {
        return DriverManager.getConnection(url, username, password);
    }
}
