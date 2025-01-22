import java.util.*;

// Parent class
class Patient implements Comparable<Patient> {
    private String name;
    private int age;
    private int systolic;
    private int diastolic;
    private double diabetesPoint;

    // Constructor
    public Patient(String name, int age, int systolic, int diastolic, double diabetesPoint) {
        this.name = name;
        this.age = age;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.diabetesPoint = diabetesPoint;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public double getDiabetesPoint() {
        return diabetesPoint;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public void setDiabetesPoint(double diabetesPoint) {
        this.diabetesPoint = diabetesPoint;
    }

    // Comparable implementation for sorting by age in descending order
    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.age, this.age);
    }

    // toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Systolic: " + systolic + ", Diastolic: " + diastolic
                + ", Diabetes Point: " + diabetesPoint;
    }

    // Abstract getInvoice method to be overridden by subclasses
    public double getInvoice() {
        return 0;
    }
}

// OutdoorPatient subclass
class OutdoorPatient extends Patient {
    private String specialty;
    private double consultationFee;

    public OutdoorPatient(String name, int age, int systolic, int diastolic, double diabetesPoint, String specialty,
            double consultationFee) {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.specialty = specialty;
        this.consultationFee = consultationFee;
    }

    // Getters and setters
    public String getSpecialty() {
        return specialty;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    @Override
    public double getInvoice() {
        return consultationFee;
    }

    @Override
    public String toString() {
        return super.toString() + ", Specialty: " + specialty + ", Consultation Fee: " + consultationFee;
    }
}

// IndoorPatient subclass
class IndoorPatient extends Patient {
    private int admissionDate; // days since admission
    private int bedNo;
    private double dailyFee;

    public IndoorPatient(String name, int age, int systolic, int diastolic, double diabetesPoint, int admissionDate,
            int bedNo, double dailyFee) {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.admissionDate = admissionDate;
        this.bedNo = bedNo;
        this.dailyFee = dailyFee;
    }

    // Getters and setters
    public int getAdmissionDate() {
        return admissionDate;
    }

    public int getBedNo() {
        return bedNo;
    }

    public double getDailyFee() {
        return dailyFee;
    }

    public void setAdmissionDate(int admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void setBedNo(int bedNo) {
        this.bedNo = bedNo;
    }

    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }

    @Override
    public double getInvoice() {
        return admissionDate * dailyFee;
    }

    @Override
    public String toString() {
        return super.toString() + ", Admission Days: " + admissionDate + ", Bed No: " + bedNo + ", Daily Fee: "
                + dailyFee;
    }
}

// Main class with menu
public class PatientManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Patient> patients = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Outdoor Patient");
            System.out.println("2. Add Indoor Patient");
            System.out.println("3. Display All Patients");
            System.out.println("4. Sort Patients by Age (Descending)");
            System.out.println("5. Display Patients with High or Low Blood Pressure");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter systolic: ");
                    int systolic = scanner.nextInt();
                    System.out.print("Enter diastolic: ");
                    int diastolic = scanner.nextInt();
                    System.out.print("Enter diabetes point: ");
                    double diabetesPoint = scanner.nextDouble();
                    System.out.print("Enter specialty: ");
                    String specialty = scanner.next();
                    System.out.print("Enter consultation fee: ");
                    double consultationFee = scanner.nextDouble();
                    patients.add(new OutdoorPatient(name, age, systolic, diastolic, diabetesPoint, specialty, consultationFee));
                    break;
                }
                case 2: {
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter systolic: ");
                    int systolic = scanner.nextInt();
                    System.out.print("Enter diastolic: ");
                    int diastolic = scanner.nextInt();
                    System.out.print("Enter diabetes point: ");
                    double diabetesPoint = scanner.nextDouble();
                    System.out.print("Enter admission days: ");
                    int admissionDate = scanner.nextInt();
                    System.out.print("Enter bed number: ");
                    int bedNo = scanner.nextInt();
                    System.out.print("Enter daily fee: ");
                    double dailyFee = scanner.nextDouble();
                    patients.add(new IndoorPatient(name, age, systolic, diastolic, diabetesPoint, admissionDate, bedNo, dailyFee));
                    break;
                }
                case 3: {
                    for (Patient patient : patients) {
                        System.out.println(patient.toString() + ", Invoice: " + patient.getInvoice());
                    }
                    break;
                }
                case 4: {
                    Collections.sort(patients);
                    System.out.println("Patients sorted by age (descending).\n");
                    break;
                }
                case 5: {
                    for (Patient patient : patients) {
                        if (patient.getSystolic() > 120 || patient.getDiastolic() < 80) {
                            System.out.println(patient);
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default: {
                    System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
