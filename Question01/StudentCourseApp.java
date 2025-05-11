package Question01;

public class StudentCourseApp {
    public static void main(String[] args) {

        // Create 3 Course objects
        Course course1 = new Course("1001", "Software Engineering");
        Course course2 = new Course("1002", "Cyber Security");
        Course course3 = new Course("1003", "Network Engineering");

        // Create 1 Student object using parameterized constructor
        Student student = new Student("001", "Nimesh");

        // Enroll student in the 3 courses
        student.enrollCourse(course1);
        student.enrollCourse(course2);
        student.enrollCourse(course3);

        // Display student details and enrolled courses
        student.displayStudentDetails();
    }
}

