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

    //Main Constructor with all arguments
    public Student (int id, String name, String major, List<String> previousClasses=null, List<String> currentClasses=null) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.previousClasses = previousClasses;
        this.currentClasses = currentClasses;
    }
    
    //Change a student's ID
    public void changeID (int newid) {
        if (this.id == newid) {
            System.out.println("Unable to change ID - new ID is same as old ID");
        } else {
            String oldid = this.id;
            this.id = newid;
            System.out.println("ID changed from " + oldid+ " to " + newid);
        }   
    }

    //Change a student's name if it is different from old name
    public void changeName (String newname) {
        if (this.name.equals(newname)) {
            System.out.println("Unable to change name - new name is same as old name");
        } else {
            String oldname = this.name;
            this.name = newname;
            System.out.println("Name changed from " + oldname + " to " + newname);
        }   
    }

    //Change a student's major if it is different from old major
    public void changeMajor (String newmajor) {
        if (this.major.equals(newmajor)) {
            System.out.println("Unable to change major - new major is same as old major");
        } else {
            String oldmajor = this.major;
            this.major = newmajor;
            System.out.println("Major changed from " + oldmajor + " to " + newmajor);
        }    
    }

    //Add a course to a student's current courses
    public void addCourse (String course) {
        if (this.previousClasses.contains(course) == true) {
            System.out.println("Unable to add course - student already enrolled")
        } else {
            this.previousClasses.add(course);
            System.out.println("Course added");
        }
        
    }

    //Transfer all current courses to previous courses and empty current courses
    public void endSemester() {
        for (Iterator<String> iterator = this.currentClasses.iterator(); iterator.hasNext();) {
            this.previousClasses.add(iterator.next);
            this.previousClasses.remove(iterator.next);
        }
        this.currentClasses.clear();
    }

    //Return ID
    public getID() {
        return this.id();
    }

    //Return Name
    public getName() {
        return this.name();
    }

    //Return Major
    public getMajor() {
        return this.major();
    }

    //Return previousClasses List
    public getPreviousCourseList() {
        return this.previousClasses();
    }

    //Return currentClasses List
    public getCurrentCourseList() {
        return this.currentClasses();
    }

    //Returns true if student currently enrolled in course, else returns false
    public checkCurrentEnrollment(String class_name) {
        if (this.currentClasses.contains(class_name) == true) {
            return true;
        } else {
            return false;
        }
    }

    // Returns true if student previously enrolled in course, else returns false
    public checkPreviousEnrollment(String class_name) {
        if (this.previousClasses.contains(class_name) == true) {
            return true;
        } else {
            return false;
        }
    }

    // Returns true if student is in specified major, else returns false
    public checkMajor(String major) {
        if (this.major.equals(major)) {
            return true;
        } else {
            return false;
        }
    }
    
}