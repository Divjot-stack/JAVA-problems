class Employee {
    String name;
    int employeeId;
    double basicSalary;

    Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }
}

class Professor extends Employee {
    Professor(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 10000;
    }
}

class LabAssistant extends Employee {
    LabAssistant(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 5000;
    }
}

class AdministrativeStaff extends Employee {
    AdministrativeStaff(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 3000;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Professor professor = new Professor("Rahul", 101, 50000);
        LabAssistant labAssistant = new LabAssistant("Aman", 102, 30000);
        AdministrativeStaff staff = new AdministrativeStaff("Priya", 103, 25000);

        System.out.println("Professor Salary: " + professor.calculateSalary());
        System.out.println("Lab Assistant Salary: " + labAssistant.calculateSalary());
        System.out.println("Administrative Staff Salary: " + staff.calculateSalary());
    }
}



