/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_Swing.model.DAO;

import JDBC_Swing.model.Student;
import java.sql.SQLException;
import java.util.List;
import java.sql.*;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Student student) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Student student) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Initialize the connection
     * @throws SQLException 
     */
    private void initConn() throws SQLException {
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        statement = conn.createStatement();
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
