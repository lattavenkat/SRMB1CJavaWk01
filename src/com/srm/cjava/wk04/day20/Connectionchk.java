package com.srm.cjava.wk04.day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectionchk {
   static final String url = "jdbc:mysql://localhost:3306/latha";
   static final String user = "root";
   static final String pass = "Latt@1498";
   static final String sql = "SELECT sid, sname, smark, srank FROM student";

   public static void main(String[] args) {
      try(Connection conn = DriverManager.getConnection(url, user, pass);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql);
      ) {		      
         while(rs.next()){
            System.out.print("STUDENT ID: " + rs.getInt("sid"));
            System.out.print(", STUDENT NAME: " + rs.getString("sname"));
            System.out.print(", STUDENT MARK: " + rs.getInt("smark"));
            System.out.println(", STUDENT RANK: " + rs.getInt("srank"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
