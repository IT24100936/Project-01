package Question01;

public class Student {
    private String studentID;
    private String studentName;
    private Course[] courses = new Course[3];
    private int courseCount = 0;

    //Default constructor
    public Student() {
    }

    //Parameterized constructor
    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    //Enroll a course
    public void enrollCourse(Course c) {
        if (courseCount < courses.length) {
            courses[courseCount] = c;
            courseCount++;
        } else {
            System.out.println("Maximum number of courses reached!");
        }
    }

    //Display student details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled Courses:");
        for (int i = 0; i < courseCount; i++) {
            courses[i].displayCourseDetails();
        }
    }
}
