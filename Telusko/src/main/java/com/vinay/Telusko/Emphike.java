package com.vinay.Telusko;

import java.sql.*;

public class Emphike {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/springjdbc";
            String username = "root";
            String password = "Vinay1999@";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from organ");
            
            while (rs.next()) {
                String id = rs.getString(1);  // Correct index: 1 for id
                String name = rs.getString(2);  // Correct index: 2 for name
                int exp = rs.getInt(3);  // Correct index: 3 for experience

                if (exp > 20) {
                    System.out.println("Enter the id" + id + " Name is " + name + " Experience " + exp + " hike 30%");
                }
                if (exp > 15) {
                    System.out.println("Enter the id" + id + " Name is " + name + " Experience " + exp + " hike 20%");
                }
                if (exp > 9) {
                    System.out.println("Enter the id" + id + " Name is " + name + " Experience " + exp + " hike 20%");
                }
                if (exp < 5) {
                    System.out.println("Enter the id" + id + " Name is " + name + " Experience " + exp + " hike 15%");
                }
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
