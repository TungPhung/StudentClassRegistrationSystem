/*
 * Author - Tung Phung
 * 
 * Simulated Registration System for class enrollment consisting of student and course objects
 * 
 * 
 * Date - March 23, 2018
 */
import java.util.*; 

//Creates Registration System
public class RegistrationSystem {
    
    //Takes arraylist and combines all strings together for easy readiability
    public static String prettyPrintArrayList(List<String> array) {
        Iterator<String> itr = array.iterator();
        String s = new String("");
        while (itr.hasNext()) {
            s = s + itr.next() + " ";
        }
        return s;
    }
    
    public static void main(String[] args) {

        //Input stream
        Scanner sc = new Scanner(System.in);

        //Create simulation database of students
        Map<String, Student> studentDatabase = new HashMap<String, Student>();
        studentDatabase = SimulatedStudentDatabase.getStudentIdMap();
        
        //Create simulation database of courses
        Map<String, Course> courseDatabase = new HashMap<String, Course>();
        courseDatabase = SimulatedCourseDatabase.getCourseIdMap();

        //Print Initial Welcome
        System.out.println("******************************************");
        System.out.println("*");
        System.out.println("Welcome to the Course Registration System");
        System.out.println("*");
        System.out.println("******************************************\n\n");

        System.out.println("Please Enter Student ID#: ");
        int i = sc.nextInt();

        System.out.println("You entered " + Integer.toString(i) + " . Is that correct? (Y/N)");

        System.out.println("What course would you like to enroll in?");
        String potentialCourseEnroll = sc.nextLine();
        
        //Checks if course exists in course database
        if (courseDatabase.containsKey(potentialCourseEnroll) == true) {
            //Checks if course has enough space to enroll
            if (courseDatabase.get(potentialCourseEnroll).getMaxCourseSize() > courseDatabase.get(potentialCourseEnroll).getCourseEnrollment()) {
                //Checks if student meets prerequisite
                if (c
            } else {

            }
        } else {

        }
        //courseDatabase()

        System.out.println("Unfortunately you do not meet the prerequisites of the this course. pick another course. ");

        System.out.println("You meet the prerequisite for this course " + courseDatabase("").getPreRequisites() + " and the current capacity is c")
        String j = sc.nextLine();

        

        

        

        String puppy = prettyPrintArrayList(studentDatabase.get("3333").getPreviousCourseList());
        System.out.println(puppy);
        
        /* 
        Student a = studentDatabase.get("3333");
        String x = a.getName();
        System.out.println(x); */
        /* 
        Course b = courseDatabase.get("CS102");
        String c = b.getPreRequisites();
        System.out.println(c); */
/* 
        boolean puppy = stuDatabase.get("3333").getPreviousCourseList().isEmpty();
        //System.out.println("hi");
        System.out.println(String.valueOf(puppy)); */


    //System.out.println("I got this " + Integer.toString(x));

        
    }
}
