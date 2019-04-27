/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_Swing;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author moham
 */
public class JDBC_Swing extends javax.swing.JFrame{
    
     private javax.swing.JTable jTable_student;
     private javax.swing.JTable jTable_teacher;
     
     
     public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
     
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
         
         
         Class.forName(DRIVER_NAME);
     
         MainForm mainForm = new MainForm();
     }
     
     
    
}
