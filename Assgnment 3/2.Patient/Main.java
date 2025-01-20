import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=== Patient Management System ===");
            System.out.println("1. Add Indoor Patient");
            System.out.println("2. Add Outdoor Patient");
            System.out.println("3. Display All Patients");
            System.out.println("4. Display Patients with High or Low Blood Pressure");
            System.out.println("5. Sort Patients by Age (Descending)");
            System.out.println("6. Display Patient Bills");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Indoor Patient
                    System.out.println("Enter details for Indoor Patient:");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Systolic: ");
                    int systolic = scanner.nextInt();
                    System.out.print("Diastolic: ");
                    int diastolic = scanner.nextInt();
                    System.out.print("Diabetes Point: ");
                    double diabetesPoint = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Admission Date (yyyy-MM-dd): ");
                    String admissionDate = scanner.nextLine();
                    System.out.print("Bed No: ");
                    int bedNo = scanner.nextInt();
                    System.out.print("Daily Fee: ");
                    double dailyFee = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    patients.add(new IndoorPatient(name, age, systolic, diastolic, diabetesPoint,
                            admissionDate, bedNo, dailyFee));
                    System.out.println("Indoor Patient added successfully!");
                    break;

                case 2:
                    // Add Outdoor Patient
                    System.out.println("Enter details for Outdoor Patient:");
                    System.out.print("Name: ");
                    name = scanner.nextLine();
                    System.out.print("Age: ");
                    age = scanner.nextInt();
                    System.out.print("Systolic: ");
                    systolic = scanner.nextInt();
                    System.out.print("Diastolic: ");
                    diastolic = scanner.nextInt();
                    System.out.print("Diabetes Point: ");
                    diabetesPoint = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Specialty: ");
                    String specialty = scanner.nextLine();
                    System.out.print("Consultation Fee: ");
                    double consultationFee = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    patients.add(new OutdoorPatient(name, age, systolic, diastolic, diabetesPoint,
                            specialty, consultationFee));
                    System.out.println("Outdoor Patient added successfully!");
                    break;

                case 3:
                    // Display All Patients
                    System.out.println("\nAll Patients:");
                    for (Patient patient : patients) {
                        System.out.println(patient);
                    }
                    break;

                case 4:
                    // Display Patients with High or Low Blood Pressure
                    System.out.println("\nPatients with High or Low Blood Pressure:");
                    for (Patient patient : patients) {
                        if (patient.getSystolic() > 120 || patient.getDiastolic() < 80) {
                            System.out.println(patient);
                        }
                    }
                    break;

                case 5:
                    // Sort Patients by Age (Descending)
                    Collections.sort(patients);
                    System.out.println("Patients sorted by age in descending order.");
                    break;

                case 6:
                    // Display Patient Bills
                    System.out.println("\nPatient Bills:");
                    for (Patient patient : patients) {
                        if (patient instanceof OutdoorPatient) {
                            System.out.println("Outdoor: " + patient + ", Invoice: " + ((OutdoorPatient) patient).getInvoice());
                        } else if (patient instanceof IndoorPatient) {
                            System.out.println("Indoor: " + patient + ", Invoice: " + ((IndoorPatient) patient).getInvoice());
                        }
                    }
                    break;

                case 7:
                    // Exit
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}