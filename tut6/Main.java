import course.Course;
import student.Student;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(
            "S101",
            "Divjot",
            "CSE"
        );

        Course course = new Course(
            "CS101",
            "Java Programming",
            4
        );

        System.out.println("Student Details:");
        student.displayDetails();

        System.out.println();

        System.out.println("Course Details:");
        course.displayDetails();
    }
}