package Question01;

public class Course {
    private String courseCode;
    private String courseTitle;

    //Parameterized constructor
    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }

    //Display course details
    public void displayCourseDetails() {
        System.out.println("Course Code: " + courseCode + ", Course Title: " + courseTitle);
    }
}

