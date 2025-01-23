import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Patient Management System ---");
            System.out.println("1. Add Outdoor Patient");
            System.out.println("2. Add Indoor Patient");
            System.out.println("3. View All Patients");
            System.out.println("4. View Patients with Abnormal Blood Pressure");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Add Outdoor Patient
                    System.out.print("Enter name: ");
                    String outdoorName = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int outdoorAge = scanner.nextInt();
                    System.out.print("Enter systolic pressure: ");
                    int outdoorSystolic = scanner.nextInt();
                    System.out.print("Enter diastolic pressure: ");
                    int outdoorDiastolic = scanner.nextInt();
                    System.out.print("Enter diabetes point: ");
                    double outdoorDiabetesPoint = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Enter specialty: ");
                    String specialty = scanner.nextLine();
                    System.out.print("Enter consultation fee: ");
                    double consultationFee = scanner.nextDouble();
                    patients.add(new OutdoorPatient(outdoorName, outdoorAge, outdoorSystolic, outdoorDiastolic,
                            outdoorDiabetesPoint, specialty, consultationFee));
                    System.out.println("Outdoor patient added successfully!");
                    break;

                case 2:
                    //for  add indoor
                    System.out.print("Enter name: ");
                    String indoorName = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int indoorAge = scanner.nextInt();
                    System.out.print("Enter systolic pressure: ");
                    int indoorSystolic = scanner.nextInt();
                    System.out.print("Enter diastolic pressure: ");
                    int indoorDiastolic = scanner.nextInt();
                    System.out.print("Enter diabetes point: ");
                    double indoorDiabetesPoint = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Enter admission date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    LocalDate admissionDate = LocalDate.parse(date);
                    System.out.print("Enter bed number: ");
                    int bedNo = scanner.nextInt();
                    System.out.print("Enter daily fee: ");
                    double dailyFee = scanner.nextDouble();
                    patients.add(new IndoorPatient(indoorName, indoorAge, indoorSystolic, indoorDiastolic,
                            indoorDiabetesPoint, admissionDate, bedNo, dailyFee));
                    System.out.println("Indoor patient added successfully!");
                    break;

                case 3:
                    // print all patients 
                    if (patients.isEmpty()) {
                        System.out.println("No patients added yet.");
                    } else {
                        System.out.println("\nAll Patients:");
                        for (Patient patient : patients) {
                            System.out.println(patient);
                            if (patient instanceof OutdoorPatient) {
                                System.out.println("Type: Outdoor");
                                System.out.println("Bill: " + ((OutdoorPatient) patient).getInvoice());
                            } else if (patient instanceof IndoorPatient) {
                                System.out.println("Type: Indoor");
                                System.out.println("Bill: " + ((IndoorPatient) patient).getInvoice());
                            }
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    //blood pressure
                    System.out.println("\nPatients with abnormal blood pressure:");
                    boolean found = false;
                    for (Patient patient : patients) {
                        if (patient.getSystolic() > 120 || patient.getDiastolic() < 80) {
                            System.out.println(patient);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No patients with abnormal blood pressure.");
                    }
                    break;

                case 5:
                    
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
