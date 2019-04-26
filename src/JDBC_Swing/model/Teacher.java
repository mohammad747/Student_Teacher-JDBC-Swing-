/*
 * @author mohammd hashemi
 * created on saturday, 7th Ordibehesht
 * 
 */
package JDBC_Swing.model;

/**
 *
 * Teacher class
 */
public class Teacher {
    
    private int id;
    private String firstName;
    private String lastName;
    private int personalID;

    public Teacher(int id, String firstName, String lastName, int personalID) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalID = personalID;
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

    public int getPersonalID() {
        return personalID;
    }
    
    
    
}
