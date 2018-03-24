/*
 * Author - Tung Phung
 * 
 * Creates simulated student database for simulated registration system. 
 * Student database consists of student objects with unsigned-integer IDs
 * based on student student class
 * 
 * Date - March 23, 2018
 */

package StudentDB.SimulatedStudentDatabase;

//Import Collections and Student class to build each individual student object
import java.util.*;
import Student;

//Creates several students objects with given attribute s
public class SimulatedStudentDatabase {
    /*
     * Test Student Attributes
     * StudentA (ID:1111) - EE (Electrical Engineering) Major, Previous Courses - None, Current Courses - None
     * StudentB (ID:2222)- CS (Computer Science) Major, Previous Courses - CS101, CS102, Current Courses - None
     * StudentC (ID:3333)- MS (Materials Science) Major, Previouses Courses - MS101, MS102, MS201, MS202, Current Courses - MS301, MS302
     * StudentD (ID:4444)- ME (Mechanical Engineering) Major, Previous Courses - None, Current Courses - ME101, ME102
     */
    static Student studentA; 
    static Student studentB;  	 
    static Student StudentC;	 
    static Student studentD;
    
    //Creates previous courses for students with previous courses
    static List<String> studentBPreviousCourses = new ArrayList<String>();
    static List<String> studentCPreviousCourses = new ArrayList<String>();
   
    //Creates current courses for students with current courses
    static List<String> studentCCurrentCourses = new ArrayList<String>();
    static List<String> studentDCurrentCourses = new ArrayList<String>();

    //Crates Hash for keyed student ID
    static Map<String, Student> studentMapById = new HashMap<String, Student>();
         
    //Creates static declarations to create objects
    static {      
        //Adds Previous Courses
        studentBPreviousCourses.add("CS101");
        studentBPreviousCourses.add("CS102");
        studentCPreviousCourses.add("MS101");
        studentCPreviousCourses.add("MS102");
        studentCPreviousCourses.add("MS201");
        studentCPreviousCourses.add("MS202");
        
        //Adds Current Courses
        studentCCurrentCourses.add("MS301");
        studentCCurrentCourses.add("MS303");
        studentDCurrentCourses.add("ME101");
        studentDCurrentCourses.add("MS102");

        //Instantiates Students with courses
        studentA = new StudentA(1111, "StudentA", "EE", null, null);
        studentB = new StudentB(2222, "StudentB", "CS", studentBPreviousCourses, null);
        studentC = new StudentC(3333, "StudentC", "MS", studentCPreviousCourses, studentCCurrentCourses);
        studentD = new studentD(4444, "StudentD", "ME", null, studentDCurrentCourses);
        
        //Calls init student method to hash all students
        initStudent();	
    }
    
    //Hashes all students
    public static void initStudent() {
        studentMapById.put("1111", studentA);
        studentMapById.put("2222", studentB);
        studentMapById.put("3333", studentC);
        studentMapById.put("4444", studentD);	
    }
    
    //Returns hash of students
    public static Map<String, Student> getStudentIdMap(){		
        return studentMapById;		
    }
}
