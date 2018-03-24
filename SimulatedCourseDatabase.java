/*
 * Author - Tung Phung
 * 
 * Creates simulated course database for simulated registration system. 
 * Course Database consists of course objects based on course class
 * 
 * 
 * Date - March 23, 2018
 */

//Import Collections and Course class to build each individual course objects
import java.util.*;

//Creates several courses objects with given attributes
public class SimulatedCourseDatabase {
    /*
     *Course object properties: Course ID, Course Major, Pre-requisites, Current Enrollment, Maximum Enrollment
     * 
     */
    
    //Create arraylists of course number and course order
    static List<String> courseNumberOrder = new ArrayList<String>();
    static List<String> courseMajors = new ArrayList<String>();
    
    //Create majors
    static String ee = new String("EE");
    static String cs = new String("CS");
    static String ms = new String("MS");
    static String me = new String("ME");

    //Crates Hash for keyed course ID
    static Map<String, Course> courseMapById = new HashMap<String, Course>();
         
    //Creates static declarations
    static {
        
        //Creates Arraylist of numerical course numbers (i.e. - 101, 102, 201, 202, etc..)
        for(int i=100; i < 500; i+=100) {
        courseNumberOrder.add(Integer.toString(i + 1));
        courseNumberOrder.add(Integer.toString(i + 2));
        courseNumberOrder.add(Integer.toString(i + 3));
        }
        
        //Calls init course method to hash all courses
        initCourse();
    }
    
    //Hashes all courses
    public static void initCourse() {
        //Create Course objects
        int maxClassSize = 30;
        int minClassSize = 10;
        Random random = new Random();
        String currentMajor;
        String preReq = null;
        for (int i = 0; i < courseMajors.size(); i++) {
            for (int j = 0; i <courseNumberOrder.size(); j++) {
                int actualClassSize = random.nextInt(maxClassSize - minClassSize + 1) + minClassSize;
                int actualClassEnrollment = random.nextInt(actualClassSize + 1);
                currentMajor = courseMajors.get(i);
                if (j > 0) {
                    preReq = currentMajor + courseNumberOrder.get(j-1);
                } else {
                    preReq = null;
                }
                Course courseobj = new Course(currentMajor + courseNumberOrder.get(j), currentMajor, preReq, actualClassEnrollment, actualClassSize);
                courseMapById.put(courseobj.getID(), courseobj);
            }  
        }
    }
    
    //Returns hash of courses
    public static Map<String, Course> getcourseIdMap() {		
        return courseMapById;		
    }
}
