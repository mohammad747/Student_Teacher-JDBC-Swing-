/*
 * @author mohammd hashemi
 * created on saturday, 7th Ordibehesht
 * 
 */
package JDBC_Swing.model;

/**
 *
 * student class
 */
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int studentId;

    public Student(int id, String firstName, String lastName, int studentId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentId() {
        return studentId;
    }
    
    
    
}
