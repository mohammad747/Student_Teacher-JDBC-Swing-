/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_Swing.model.DAO;

import JDBC_Swing.model.Student;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author moham
 */
public interface StudentDAO {
    
    /**
     *
     * @param student
     * @throws SQLException
     */
    void insert(Student student) throws SQLException;
    
    /**
     *
     * @param student
     * @throws SQLException
     */
    void delete(Student student) throws SQLException;
    
    /**
     *
     * @param student
     * @throws SQLException
     */
    void update(Student student) throws SQLException;
    
    /**
     *
     * @return List of students
     * @throws SQLException
     */
    List<Student> findAll()throws SQLException;
    
    
    
}
