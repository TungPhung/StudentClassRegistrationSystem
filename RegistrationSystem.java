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

    //Main Method
    public static void main(String[] args) {

        //Input stream
        Scanner sc = new Scanner(System.in);

        //Break Variable
        int breakInt = 1;
        int currentStudent;
        int failState = 0;
        String classFailReasons = "";
        String response = "";
        String potentialCourseEnroll;

        //Create simulation database of students
        Map<String, Student> studentDatabase = new HashMap<String, Student>();
        studentDatabase = SimulatedStudentDatabase.getStudentIdMap();
        
        //Create simulation database of courses
        Map<String, Course> courseDatabase = new HashMap<String, Course>();
        courseDatabase = SimulatedCourseDatabase.getCourseIdMap();

        //Print Initial Welcome
        System.out.println("\n\n******************************************");
        System.out.println("*");
        System.out.println("*  Welcome to the Course Registration System");
        System.out.println("*");
        System.out.println("******************************************\n");

        //Gets Student ID and if break = 0, it moves on
        do {
            System.out.println("Please Enter Student ID#: ");
            currentStudent = sc.nextInt();
            sc.nextLine();
            System.out.println("");
            System.out.println("You entered Student ID #" + Integer.toString(currentStudent) + " . Is that correct? (Y/N)");
            response = sc.nextLine();
            System.out.println("");
            if ((response.equals("Y") || response.toUpperCase().equals("Y")) && studentDatabase.containsKey(Integer.toString(currentStudent)) == true) {
                System.out.println("Student Found");
                System.out.println("");
                breakInt = 0;
            } else {
                String studentNotFound = "";
                if (studentDatabase.containsKey(Integer.toString(currentStudent)) == false) {
                    studentNotFound = " : Student Not Found";
                }
                System.out.println("Please try again" + studentNotFound);
                System.out.println("");
            }    
        }while (breakInt == 1);
        
        //Reset breakInt to 1 for next grouping evaluation
        breakInt = 1;

        //Gets Course and if breakInt = 0
        do {
            System.out.println("What course would you like to enroll in?");
            potentialCourseEnroll = sc.nextLine();
            System.out.println("You entered " + potentialCourseEnroll + " . Is that correct? (Y/N)");
            response = sc.nextLine();
            if (response.equals("Y") || response.toUpperCase().equals("Y")) {
                if (courseDatabase.containsKey(potentialCourseEnroll) == true) {
                    //Checks if course has enough space to enroll
                    if (courseDatabase.get(potentialCourseEnroll).checkAvailability() == true) {
                        //Checks if student meets prerequisite
                        if (studentDatabase.get(Integer.toString(currentStudent)).checkPreviousEnrollment(courseDatabase.get(potentialCourseEnroll).getPreRequisites()) == true) {
                            //Checks if student is currently enrolled in course
                            if (studentDatabase.get(Integer.toString(currentStudent)).checkCurrentEnrollment(courseDatabase.get(potentialCourseEnroll).getPreRequisites()) == true) {
                                //Adds adds course to student current course list
                                studentDatabase.get(Integer.toString(currentStudent)).addCourse(potentialCourseEnroll);
                                //Increments course to reflect change
                                courseDatabase.get(potentialCourseEnroll).studentAdd();
                                breakInt = 0;
                                System.out.println("You have met all requirements - " + courseDatabase.get(potentialCourseEnroll) + " has been added to " + studentDatabase.get(Integer.toString(currentStudent)).getName() + " 's schedule");
                            } else {
                                classFailReasons += " Currently Enrolled ";
                            }
                        } else {
                            classFailReasons += " Does not meet prerequisite ";
                        }
                    } else {
                        classFailReasons += " Course does not not have enough space ";
                    }
                } else { 
                    classFailReasons += " Course does not exist ";
                }
                System.out.println("Cannot join course for the following reasons: " + classFailReasons);
            } else {
                System.out.println("Please try again");
                System.out.println("");
            }
        } while (breakInt == 1);
        
        //End Program
        System.exit(0);
    }
}