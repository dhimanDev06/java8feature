import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args){
        String url = "jdbc:mysql://srv25.cloudserverzone.com:3306/everestg_webesg";
        String username = "everestg_dhimanDB";
        String password = "Dhiman@2025";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Connected successfully!");

            // Create a statement and execute a sample query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SHOW TABLES");

            System.out.println("📋 Tables in the database:");
            while (rs.next()) {
                System.out.println("- " + rs.getString(1));
            }

            // Clean up
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found. Include it in your library path.");
            e.printStackTrace();
        }
    }
}
