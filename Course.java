/*
 * Author - Tung Phung
 * 
 * Course class to define course object with id, major, prereqs, current class enrollment,
 * and max class size
 * 
 * Date - March 23, 2018
 */

//Import collections
import  java.util.*;

//Main course Object
public class Course {
    //Initialize variables
    private String id;
    private String major;
    private String preReq;
    private int courseEnrollment;
    private int maxCourseSize;

    //Default Constructor
    public Course() {
        this.id = "NE000";
        this.major = "NE";
        this.preReq = null;
        this.courseEnrollment = 0;
        this.maxCourseSize = 0;
    }
    
    //New Coonstructor Construtor w/ no space availability in course
    public Course(String id, String major, String preReq) {
        this.id = id;
        this.major = major;
        this.preReq = preReq;
        this.courseEnrollment = 0;
        this.maxCourseSize = 0;
    }

    //Main Constructor with all arguments
    public Course(String id, String major, String preReq, int courseEnrollment, int maxCourseSize) {
        this.id = id;
        this.major = major;
        this.preReq = preReq;
        this.courseEnrollment = courseEnrollment;
        this.maxCourseSize = maxCourseSize;
    }

    //Accessor Methods

    //Return ID
    public String getID() {
        return this.id;
    }
    
    //Return Major
    public String getMajor() {
        return this.major;
    }

    //Return Pre-Requisite course
    public String getPreRequisites() {
        return this.preReq;
    }

    //Return Current Enrollment
    public int getCourseEnrollment() {
        return this.courseEnrollment;
    }

    //Return Max Course Size
    public int getMaxCourseSize() {
        return this.maxCourseSize;
    }

    //Modification Methods
    
    //Change a course's ID
    public void changeID (String newid) {
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
      public void changePreReq (String newPreReq) {
        if (this.preReq.equals(newPreReq)) {
            System.out.println("Unable to change pre-requisite class - new pre-requisite is same as old pre-prequisite class");
        } else {
            String oldPreReq = this.preReq;
            this.preReq = newPreReq;
            System.out.println("Pre-Requisite changed from " + oldPreReq + " to " + newPreReq);
        }   
    }

    //Change a course's current enrollment size given that the new number makes sense
    public void changeEnrollment(int n) {
        if(n >= 0 && n <= this.maxCourseSize) {
            this.courseEnrollment = n;
            System.out.println("Class enrollment successfully changed to " + Integer.toString(n));
        } else {
            System.out.println("Unable to change current enrollment due to number mis-match");
        }
    }

    //Change a courses current max size given it is greater than the number of students enrolled
    public void changeMaxCourseSize(int n) {
        if(n >= this.courseEnrollment) {
            this.maxCourseSize = n;
            System.out.println("Max course enrollment successfully changed to " + Integer.toString(n));
        } else {
            System.out.println("Unable to change max course enrollment due to number mis-match");
        }
    }
    
    //Returns true if class has opening
    public boolean checkAvailability() {
        if (this.courseEnrollment < this.maxCourseSize) {
            return true;
        } else {
            return false;
        }
    }
    
    //Returns true given prerequisite course matches course's real pre-requisite
    public boolean checkPreReq(String checkPreReq) {
        if (checkPreReq.equals(this.preReq)) {
            return true;
        } else {
            return false;
        }
    }
    
    //Returns true if given major matches course's major
    public boolean checkMajor(String checkMajor) {
        if (checkMajor.equals(this.major)) {
            return true;
        } else {
            return false;
        }
    }
}