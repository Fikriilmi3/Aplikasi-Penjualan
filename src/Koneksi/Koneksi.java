/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class Koneksi {
   private static Connection c;
    public static Connection getKoneksi(){
        if (c == null){
            try {String url = "jdbc:mysql://localhost:3306/elektronik"; // nama databasenya login
                 String user="root"; // username mysql root
                 String pass=""; //passwordnya kosong

                 DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                 c = DriverManager.getConnection(url , user, pass);
                } 
            catch(SQLException e){
            System.out.print("Gagal melakukan koneksi ke database");
            }
        }

    return c;
    }  
}
