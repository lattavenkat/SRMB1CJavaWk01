package com.srm.cjava.wk04.day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertion {
    static final String url = "jdbc:mysql://localhost:3306/latha";
    static final String user = "root";
    static final String pass = "Latt@1498";
    static final String sql = "SELECT sid, sname, smark, srank FROM student";

    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("org.apache.jdbc.derby.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/latha", "root", "Latt@1498");
            Statement stmt = conn.createStatement();
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO student VALUES (101, 'Akash', 198, 1)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO student VALUES (102, 'Sachin', 170, 3)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO student VALUES (104, 'Gomathy', 190, 2)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO student VALUES(103, 'Tharun', 120, 4)";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
