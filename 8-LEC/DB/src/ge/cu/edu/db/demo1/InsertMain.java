package ge.cu.edu.db.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertMain {
    public static void main(String[] args) {
        try {
            // 1. Get a Connection to Database
            String connectionString = "jdbc:sqlserver://localhost:63031;DatabaseName=TESTODB;user=HBG\\ZTikaradze;integratedSecurity=true";
            Connection myConn = DriverManager.getConnection(connectionString);

            // 2. Create Statment
            Statement myStatement = myConn.createStatement();

            // 3. Execute SQL Query
            String query="INSERT INTO Person (id,name ,surname,age) VALUES ('12','zura','tikaradze1', '24');";

            myStatement.executeUpdate(query);
            System.out.println("Succsess");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
