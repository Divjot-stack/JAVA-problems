public class StudentRegistration {
    String name;
    int rollNo;

    void display() {
        System.out.println("Student Details");
        System.out.println("Name     : " + name);
        System.out.println("Roll No. : " + rollNo);
    }

    public static void main(String[] args) {
        StudentRegistration s = new StudentRegistration();

        s.name = "Divjot";
        s.rollNo = 101;

        s.display();
    }
}