/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_Swing.model.DAO;

import JDBC_Swing.model.Teacher;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author moham
 */
public interface TeacherDAO {
    
    /**
     *
     * @param teacher
     * @throws SQLException
     */
    void insert(Teacher teacher) throws SQLException;
    
    /**
     *
     * @param teacher
     * @throws SQLException
     */
    void delete(Teacher teacher) throws SQLException;
    
    /**
     *
     * @param teacher
     * @throws SQLException
     */
    void update(Teacher teacher) throws SQLException;
    
    /**
     *
     * @return
     * @throws SQLException
     */
    List<Teacher> findAll() throws SQLException;
    
    
    
}
