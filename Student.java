/*
 * Author - Tung Phung
 * 
 * Student Class with the following attributes, int ID, name, major, previous courses
 * and current courses as arraylists
 * 
 * Date - March 23, 2018
 */

package Student;

//Import collections
import  java.util.*;

//Main Student Object
public class Student {
    
    //Default Constructor
    public Student() {
        this.id = 0000;
        this.name = "John Doe";
        this.major = "UNDECLARED";
        this.previousClasses = null;
        this.currentClasses = null;
    }
    
    //New Student Construtor w/ No Courses
    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.previousClasses = null;
        this.currentClasses = null;
    }

    //Main Constructor
    public Student (int id, String name, String major, List<String> previousClasses, List<String> currentClasses) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.previousClasses = previousClasses;
        this.currentClasses = currentClasses;
    }
    
    //Change a student's ID
    public void changeID (int id) {
        this.id = id
    }

    //Change a student's name
    public void changeName (String name) {
        this.name = name;
    }

    //Change a student's major
    public void changeMajor (String major) {
        this.major = major;
    }

    //Add a course to a student's current courses
    public void addCourse (String course) {
        this.previousClasses.add("course");
    }

    public void 
    
    
        
}