public class StudentRecord {
    String name;
    int age;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println();
    }

    public static void main(String[] args) {

        StudentRecord s1 = new StudentRecord();
        StudentRecord s2 = new StudentRecord();

        s1.name = "Divjot";
        s1.age = 19;

        s2.name = "Anmol";
        s2.age = 19;

        System.out.println("Student 1 Details");
        s1.display();

        System.out.println("Student 2 Details");
        s2.display();
    }
}