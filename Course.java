public class Course {
    private int courseId;
    private String courseName;
    private String courseDuration;
    private double courseFees;

    Course(int courseId, String courseName, String courseDuration, double courseFees){
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseFees = courseFees;
    }

    public void displayCourse(){
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + courseDuration);
        System.out.println("Fees: " + courseFees);
    }
}
