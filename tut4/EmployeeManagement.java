import java.util.Scanner;

class Employee {
    int id;
    String name;
    double monthlySalary;

    Employee(int id, String name, double monthlySalary) {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    void displayDetails() {
        System.out.println("\nEmployee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: ₹" + monthlySalary);
    }

    double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    double calculateBonus() {
        if (monthlySalary >= 30000) {
            return calculateAnnualSalary() * 0.10;
        } else {
            return 0;
        }
    }

    void checkBonusEligibility() {
        if (monthlySalary >= 30000) {
            System.out.println("Bonus Eligibility: Eligible");
        } else {
            System.out.println("Bonus Eligibility: Not Eligible");
        }
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[5];

        // Input details of 5 employees
        for (int i = 0; i < 5; i++) {

            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Employee ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Monthly Salary: ");
            double salary = sc.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        // Display details
        System.out.println("\n===== EMPLOYEE DETAILS =====");

        for (int i = 0; i < 5; i++) {

            employees[i].displayDetails();

            System.out.println("Annual Salary: "
                    + employees[i].calculateAnnualSalary());

            System.out.println("Bonus: "
                    + employees[i].calculateBonus());

            employees[i].checkBonusEligibility();
        }

        sc.close();
    }
}