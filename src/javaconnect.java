/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ram Sundar
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
 Connection conn;
 public static Connection ConnecrDb(){
     try{
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Ram Sundar\\Documents\\NetBeansProjects\\Library_Management_System\\library.sqlite");
        return conn;
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
         return null;
     }
 }
}