/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_Swing.model.DAO;

import JDBC_Swing.MainForm;
import JDBC_Swing.model.Student;
import JDBC_Swing.model.Teacher;
import java.sql.SQLException;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author moham
 */
public class TeacherDaoImpl implements TeacherDAO{
    
     public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
     
     
     public static final String URL = "jdbc:mysql://localhost:3306/university";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    private static Connection conn;
    private static Statement statement;

    @Override
    public void insert(Teacher teacher) throws SQLException {
        
        String query = "INSERT INTO `teacher`(`id`, `firstName`, `lastName`, `personalId`) VALUES ('"+teacher.getId()+"','"+teacher.getFirstName()+"','"+teacher.getLastName()+"','"+teacher.getPersonalID()+"')";
        
        initConn();


        statement.executeUpdate(query);

        closeConn();
        
    }

    @Override
    public void delete(Teacher teacher) throws SQLException {
        
        String query = "DELETE FROM `teacher` WHERE `id`="+teacher.getId();
        
        initConn();
        
        
        
        statement.executeUpdate(query);
        
        closeConn();
        
    }

    @Override
    public void update(Teacher teacher) throws SQLException {
        
        String query = "UPDATE `teacher` SET `id`='"+teacher.getId()+"',`firstName`='"+teacher.getFirstName()+"',`lastName`='"+teacher.getLastName()+"',`personalId`='"+teacher.getPersonalID()+"' WHERE `id` = "+teacher.getId();
        
        initConn();
        
        statement.executeUpdate(query);
        
        
        closeConn();
        
    }

    @Override
    public List<Teacher> findAll() throws SQLException {
        String query = "select * from `teacher`";
        
        
        initConn();

        ResultSet rs = statement.executeQuery(query);
        
        List<Teacher> teacherList = new ArrayList<>();
        
        while(rs.next()){
            teacherList.add(new Teacher(rs.getInt("id"),rs.getString("firstName"),rs.getString("lastName"),rs.getInt("personalId")));
      }
        
        closeConn();
        
        return teacherList;
    }
    
    /**
     * Initialize the connection
     * @throws SQLException 
     */
    private Connection initConn() throws SQLException {
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        statement = conn.createStatement();
        return conn;
    }
    /**
     * Close the connection
     * @throws SQLException 
     */
    private void closeConn() throws SQLException{
        statement.close();
        conn.close();
    }
}
