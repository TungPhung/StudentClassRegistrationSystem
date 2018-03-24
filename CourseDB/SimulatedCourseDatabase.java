/*
 * Author - Tung Phung
 * 
 * Creates simulated course database for simulated registration system. 
 * Course Database consists of course objects based on course class
 * 
 * 
 * Date - March 23, 2018
 */

package CourseDB.SimulatedCourseDatabase;

//Import Collections and Course class to build each individual course objects
import java.util.*;
import Course;

//Creates several courses objects with given attributes
public class SimulatedCourseDatabase {
    /*
     *Course object properties: Course ID, Course Major, Pre-requisites, Current Enrollment, Maximum Enrollment
     * 
     */

    
    
    static List<String> courseMajors = new ArrayList<String>();
    static Course courseA; 
    static Course courseB;  	 
    static Course courseC;	 
    static Course courseD;
    
    //Creates previous courses for courses with previous courses
    static List<String> courseBPreviousCourses = new ArrayList<String>();
    static List<String> courseCPreviousCourses = new ArrayList<String>();
   
    //Creates current courses for courses with current courses
    static List<String> courseCCurrentCourses = new ArrayList<String>();
    static List<String> courseDCurrentCourses = new ArrayList<String>();

    //Crates Hash for keyed course ID
    static Map<String, course> courseMapById = new HashMap<String, course>();
         
    //Creates static declarations to create objects
    static {
        
        //Creates Arraylist of numerical course numbers (i.e. - 101, 102, 201, 202, etc..)
        static List<String> courseNumberOrder = new ArrayList<String>();
        for(int i=100; i < 500; i+100) {
        courseNumberOrder.add(Integer.toString(i + 1));
        courseNumberOrder.add(Integer.toString(i + 2));
        courseNumberOrder.add(Integer.toString(i + 3));
    
        static List<String> courseMajor = new ArrayList<String>();
        courseMajor.add("EE");
        courseMajor.add("CS");
        courseMajor.add("MS");
        courseMajor.add("ME");

        //Adds Previous Courses
        courseBPreviousCourses.add("CS101");
        courseBPreviousCourses.add("CS102");
        courseCPreviousCourses.add("MS101");
        courseCPreviousCourses.add("MS102");
        courseCPreviousCourses.add("MS201");
        courseCPreviousCourses.add("MS202");
        
        //Adds Current Courses
        courseCCurrentCourses.add("MS301");
        courseCCurrentCourses.add("MS303");
        courseDCurrentCourses.add("ME101");
        courseDCurrentCourses.add("MS102");

        //Instantiates courses with courses
        courseA = new courseA(1111, "courseA", "EE", null, null);
        courseB = new courseB(2222, "courseB", "CS", courseBPreviousCourses, null);
        courseC = new courseC(3333, "courseC", "MS", courseCPreviousCourses, courseCCurrentCourses);
        courseD = new courseD(4444, "courseD", "ME", null, courseDCurrentCourses);
        
        //Calls init course method to hash all courses
        initcourse();	
    }
    
    //Hashes all courses
    public static void initcourse() {
        courseMapById.put("1111", courseA);
        courseMapById.put("2222", courseB);
        courseMapById.put("3333", courseC);
        courseMapById.put("4444", courseD);	
    }
    
    //Returns hash of courses
    public static Map<String, course> getcourseIdMap() {		
        return courseMapById;		
    }
}
