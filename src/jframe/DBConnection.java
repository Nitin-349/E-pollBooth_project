/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;
//import com.mysql.jdbc.Driver;
//import com.mysql.cj.jdbc.ConnectionGroupManager;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lenovo
 */
public class DBConnection {
    static Connection con=null;
    public static Connection getConnection(){
        try{
        //  com.sun.jdi.connect.spi.Connection con=(com.sun.jdi.connect.spi.Connection)
        Class.forName("com.mysql.jdbc.Driver");
                   con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms","root","Nitin*1122");
    
}catch(Exception e){
    e.printStackTrace();
    
}
        return con;
    }
}
