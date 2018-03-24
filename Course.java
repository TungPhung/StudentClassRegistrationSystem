/*
 * Author - Tung Phung
 * 
 * Course class to define course object with id, major, prereqs, current class enrollment,
 * and max class size
 * 
 * Date - March 23, 2018
 */

package Course;

//Import collections
import  java.util.*;

//Main Course Object
public class Course {
    
    //Default Constructor
    public Course() {
        this.id = NE000;
        this.major = "NE";
        this.preReq = null;
        this.classEnrollment = 0;
        this.maxClassSize = 0;
    }
    
    //New Coonstructor Construtor w/ no space availability in course
    public Course(String id, String major, String preReq) {
        this.id = id;
        this.major = major;
        this.preReq = preReq;
        this.classEnrollment = 0;
        this.maxClassSize = 0;
    }

    //Main Constructor with all arguments
    public Course(String id, String major, String preReq, int classEnrollment, int maxClassSize) {
        this.id = id;
        this.major = major;
        this.preReq = preReq;
        this.classEnrollment = classEnrollment;
        this.maxClassSize = maxClassSize;
    }
    
    //Change a course's ID
    public void changeID (Sring newid) {
        if (this.id.equals(newid)) {
            System.out.println("Unable to change ID - new ID is same as old ID");
        } else {
            String oldid = this.id;
            this.id = newid;
            System.out.println("ID changed from " + oldid + " to " + newid);
        }   
    }

    //Change a course's major if it is different from old major
    public void changeMajor (String newmajor) {
        if (this.major.equals(newmajor)) {
            System.out.println("Unable to change major - new major is same as old major");
        } else {
            String oldmajor = this.major;
            this.major = newmajor;
            System.out.println("Name changed from " + oldmajor + " to " + newmajor);
        }   
    }

      //Change a course's pre-requisite if it is different from old pre-requisite course
      public void changeMajor (String newPreReq) {
        if (this.preReq.equals(newPreReq)) {
            System.out.println("Unable to change pre-requisite class - new pre-requisite is same as old pre-prequisite class");
        } else {
            String oldPreReq = this.preReq;
            this.preReq = newPreReq;
            System.out.println("Pre-Requisite changed from " + oldPreReq + " to " + newPreReq);
        }   
    }

    public void checkAvailability

    public void changeEnrollment(int n) {
        if(n >= 0 && n <= ) {
            this.classEnrollment = n;
            System.out.println("CuClass Enrollment successfully changed to " + n);
        } else {}
        
    }

    public void changeClassSize()

    //Transfer all current courses to previous courses and empty current courses
    public void endSemester() {
        for (Iterator<String> iterator = this.currentClasses.iterator(); iterator.hasNext();) {
            this.previousClasses.add(iterator.next);
            this.previousClasses.remove(iterator.next);
        }
        this.currentClasses = null;
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