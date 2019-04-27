/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_Swing.model.DAO;

import JDBC_Swing.MainForm;
import JDBC_Swing.model.Student;
import java.sql.SQLException;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author moham
 */
public class StudentDaoImpl implements StudentDAO{
    
    public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    

    /**
     *get connection parameters
     */
    public static final String URL = "jdbc:mysql://localhost:3306/university";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    private static Connection conn;
    private static Statement statement;

    @Override
    public void insert(Student student) throws SQLException {
        
        String query = "INSERT INTO `student`(`id`, `firstName`, `lastName`, `studentId`) VALUES ('"+student.getId()+"','"+student.getFirstName()+"','"+student.getLastName()+"','"+student.getStudentId()+"')";
        
        initConn();


        statement.executeUpdate(query);

        closeConn();
    }

    @Override
    public void delete(Student student) throws SQLException {
        String query = "DELETE FROM `student` WHERE `id`="+student.getId();
        
        initConn();
        
        
        
        statement.executeUpdate(query);
        
        closeConn();  
    }

    @Override
    public void update(Student student) throws SQLException {
        
        String query = "UPDATE `student` SET `id`='"+student.getId()+"',`firstName`='"+student.getFirstName()+"',`lastName`='"+student.getLastName()+"',`studentId`='"+student.getStudentId()+"' WHERE `id` = "+student.getId();
        
        initConn();
        
        statement.executeUpdate(query);
       
        
        closeConn();
    }

    @Override
    public List<Student> findAll() throws SQLException {
        String query = "select * from `student`";
        
        
        initConn();

        ResultSet rs = statement.executeQuery(query);
        
        List<Student> studentList = new ArrayList<>();
        
        while(rs.next()){
            studentList.add(new Student(rs.getInt("id"),rs.getString("firstName"),rs.getString("lastName"),rs.getInt("studentId")));
      }
        
        closeConn();
        
        return studentList;
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
//    public void executeSQlQuery(String query) throws SQLException
//   {
//       Connection con = initConn();
//       Statement st;
//       try{
//           st = con.createStatement();
//           if((st.executeUpdate(query)) == 1)
//           {
//               // refresh jtable data
//               MainForm mainForm= null;
//               DefaultTableModel model = (DefaultTableModel)mainForm.getjTable_student().getModel();
//               model.setRowCount(0);
//               mainForm.showStudentsInTable();
//               
//               
//           }
//       }catch(Exception ex){
//           ex.printStackTrace();
//       }
//   }
    
}
