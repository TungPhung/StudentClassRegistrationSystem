# Student Class Registration System #
Exercise to simulate student registration system. Creates simulated database using Collections of Students and Courses and takes input via commandline to register students for simulated courses. Properties as follows:

## Students ##
Students have the following properties:
1. Name - Student's name represented by string
2. Unique ID identifier -  a unique ID identifier number for each student allowing for lookup by ID, no alpha character, only represented by unsigned integer. 
3. Major - Student's chosen major/school (i.e. - EE, CS, ME, ENG) - Short string representing chosen student's major. For this program's purposes, students cannot enroll in majors outside their own. Represented as string.
4. Previous Classes - Student's previous classes (i.e. - EE101, CS101, CS201, etc..)  Classes previously taken by the student as to determine elgibility for future classes which requirement pre-requisites. Represented as string.
5. Current Classes - Student's current classes, same classes as Previous Classes, however used for determining whether a student is in a course and whether enrollment should proceed if student is not yet registered. Represented as string.

## Courses ##
Courses have the following properties:
1. Course Major - What major the course belongs to (i.e. EE, CS, ME, ENG). While some courses may belong to multiple majors, implementation of a course belonging to multiple majors is not yet implemented. As of initial implementation, courses are only locked to certain majors to determine eligibility.
2. Name - Course's name as represented by string (EE101, CS101, CS201, ENG302)
3. Pre-requisites - Courses may or may not have pre-requisites listed that go by course name. For simplicity initially, courses will only have one pre-requisite maximum   
4. Current Enrollment - Current number of students currently registered for course
5. Maximum Enrollment - Course enrollment - maximum number of students allowed in a course

## To be implemented ##
1. Student Priority Ranking - Senior, Junior, etc..
2. Randomized Database
