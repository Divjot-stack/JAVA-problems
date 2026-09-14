class student {
    String name;
    int rollno;
    String department;
    public static void main(String[] args) {

        student s = new student();

        s.name = "Divjot";
        s.rollno = 101;
        s.department = "CSE";

        System.out.println("Student Name : " + s.name);
        System.out.println("Roll No : " + s.rollno);
        System.out.println("Department : " + s.department);
    }
}