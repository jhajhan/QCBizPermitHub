/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Jhanna
 */

public class DataBaseConnection {
    protected static Connection con;
    protected static PreparedStatement prep;
    protected static Statement state;
    protected static ResultSet result;

    final static String URL = "jdbc:mysql://localhost:3306/qc_bizpermit_hub";
    final static String USERNAME = "root";
    final static String PASSWORD = "";
    final static String DRIVER = "com.mysql.cj.jdbc.Driver";

    /**
     * Establishes a connection to the database, this method loads 
     * the MySQL JDBC driver.
     */
    public static void connect() {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (con!=null) {
                System.out.println("Connected!");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void insert(){
        String s = "Gadgets";
        String query = "insert into business_line(BusinessLineName) values (?)";

        try {
            connect();
            prep = con.prepareStatement(query);
            prep.setString(0, s);

            int result = prep.executeUpdate();

            if (result>0){
                System.out.println("Inserted");
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
        }
    }

}
