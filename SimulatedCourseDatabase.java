/*
 * Author - Tung Phung
 * 
 * Creates simulated course database for simulated registration system. 
 * Course Database consists of course objects based on course class
 * 
 * 
 * Date - March 23, 2018
 */

//Import collections
import java.util.*;

//Creates several courses objects with given attributes
public class SimulatedCourseDatabase {
    /*
     *Course object properties: Course ID, Course Major, Pre-requisites, Current Enrollment, Maximum Enrollment
     * 
     */
    
     //Declare static course
    static Course courseObj;
    
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

        //Add majors to courseMajors arraylist
        courseMajors.add(ee);
        courseMajors.add(cs);
        courseMajors.add(ms);
        courseMajors.add(me);
        
        //Calls init course method to hash all courses
        initCourse();
    }
    
    //Hashes all courses
    public static void initCourse() {
        
        //Define maximum and minimum class sizes for random values
        int maxClassSize = 30;
        int minClassSize = 10;
        
        //Create random object
        Random random = new Random();
       
        //Initialize variables
        String currentMajor;
        String preReq = null;
        
        //Auto-populate courses
        for (int i = 0; i < courseMajors.size(); i++) {
            for (int j = 0; j < courseNumberOrder.size(); j++) {
                int actualClassSize = random.nextInt(maxClassSize - minClassSize + 1) + minClassSize;
                int actualClassEnrollment = random.nextInt(actualClassSize + 1);
                currentMajor = courseMajors.get(i);
                if (j > 0) {
                    preReq = currentMajor + courseNumberOrder.get(j-1);
                } else {
                    preReq = null;
                }
                courseObj = new Course(currentMajor + courseNumberOrder.get(j), currentMajor, preReq, actualClassEnrollment, actualClassSize);
                courseMapById.put(courseObj.getID(), courseObj);
            }  
        }
    }
    
    //Returns hash of courses
    public static Map<String, Course> getCourseIdMap() {		
        return courseMapById;		
    }
}
