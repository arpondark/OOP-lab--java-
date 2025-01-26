import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Fulltime Employee");
            System.out.println("2. Add Parttime Employee");
            System.out.println("3. View All Employees");
            System.out.println("4. View Employees by Birth Year");
            System.out.println("5. Sort and View Employees by Salary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    int fullId = scanner.nextInt();
                    if (isIdDuplicate(employees, fullId)) {
                        System.out.println("Error: Employee with this ID already exists!");
                        break;
                    }
                    System.out.print("Enter date of birth (YYYY MM DD): ");
                    int fYear = scanner.nextInt();
                    int fMonth = scanner.nextInt() - 1; // Month is 0-based
                    int fDay = scanner.nextInt();
                    Calendar fullDob = Calendar.getInstance();
                    fullDob.set(fYear, fMonth, fDay);
                    System.out.print("Enter monthly salary: ");
                    double monthlySalary = scanner.nextDouble();
                    employees.add(new FulltimeEmployee(fullName, fullId, fullDob, monthlySalary));
                    System.out.println("Fulltime employee added successfully!");
                    break;

                case 2:
                    // Add Parttime Employee
                    System.out.print("Enter name: ");
                    String partName = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    int partId = scanner.nextInt();
                    if (isIdDuplicate(employees, partId)) {
                        System.out.println("Error: Employee with this ID already exists!");
                        break;
                    }
                    System.out.print("Enter date of birth (YYYY MM DD): ");
                    int pYear = scanner.nextInt();
                    int pMonth = scanner.nextInt() - 1; // Month is 0-based
                    int pDay = scanner.nextInt();
                    Calendar partDob = Calendar.getInstance();
                    partDob.set(pYear, pMonth, pDay);
                    System.out.print("Enter hours worked: ");
                    double hours = scanner.nextDouble();
                    System.out.print("Enter hourly rate: ");
                    double hourlyRate = scanner.nextDouble();
                    if (hourlyRate < 200) {
                        System.out.println("Hourly rate is below the minimum wage of 200. It will be set to 200.");
                        hourlyRate = 200;
                    }
                    employees.add(new ParttimeEmployee(partName, partId, partDob, hours, hourlyRate));
                    System.out.println("Parttime employee added successfully!");
                    break;

                case 3:
                    // View All Employees
                    if (employees.isEmpty()) {
                        System.out.println("No employees added yet.");
                    } else {
                        System.out.println("\nAll Employees:");
                        for (Employee emp : employees) {
                            System.out.println(emp);
                            System.out.println("Salary: " + emp.getSalary());
                        }
                    }
                    break;

                case 4:
                    // View Employees by Birth Year
                    System.out.print("Enter the birth year: ");
                    int year = scanner.nextInt();
                    boolean found = false;
                    System.out.println("\nEmployees born in " + year + ":");
                    for (Employee emp : employees) {
                        if (emp.getDateOfBirth().get(Calendar.YEAR) == year) {
                            System.out.println(emp);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No employees found for the given year.");
                    }
                    break;

                case 5:
                    // Sort and View Employees by Salary
                    Collections.sort(employees);
                    System.out.println("\nEmployees sorted by salary:");
                    for (Employee emp : employees) {
                        System.out.println(emp);
                        System.out.println("Salary: " + emp.getSalary());
                    }
                    break;

                case 6:
                    // Exit
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Method to check for duplicate IDs
    private static boolean isIdDuplicate(ArrayList<Employee> employees, int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
