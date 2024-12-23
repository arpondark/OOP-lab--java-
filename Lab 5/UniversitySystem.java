import java.util.*;

class Student {
    private int studentId;
    private String studentName;
    private double studentCGPA;

    public Student() {}

    public Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + studentName + ", CGPA: " + studentCGPA;
    }
}

class Faculty {
    private int facultyId;
    private String facultyName;
    private String facultyPosition;

    public Faculty() {}

    public Faculty(int facultyId, String facultyName, String facultyPosition) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

    @Override
    public String toString() {
        return "Faculty ID: " + facultyId + ", Name: " + facultyName + ", Position: " + facultyPosition;
    }
}

class Course {
    private String courseId;
    private String courseTitle;
    private double credit;
    private ArrayList<Student> studentList = new ArrayList<>();
    private Faculty faculty;

    public Course() {}

    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void dropStudent(int studentId) {
        studentList.removeIf(student -> student.getStudentId() == studentId);
    }

    public void addFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void dropFaculty() {
        this.faculty = null;
    }

    public void printStudentList() {
        if (studentList.isEmpty()) {
            System.out.println("No students enrolled in this course.");
        } else {
            System.out.println("Students enrolled:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Title: " + courseTitle + ", Credit: " + credit;
    }
}

public class UniversitySystem {
    private static final ArrayList<Student> students = new ArrayList<>();
    private static final ArrayList<Course> courses = new ArrayList<>();
    private static final ArrayList<Faculty> faculties = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Print");
            System.out.println("5. Search");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addMenu();
                case 2 -> deleteMenu();
                case 3 -> updateMenu();
                case 4 -> printMenu();
                case 5 -> searchMenu();
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option! Try again.");
            }
        }
    }

    private static void addMenu() {
        System.out.println("Add:");
        System.out.println("1. Add Student");
        System.out.println("2. Add Course");
        System.out.println("3. Add Faculty");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter Student ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Student CGPA: ");
                double cgpa = scanner.nextDouble();
                students.add(new Student(id, name, cgpa));
                System.out.println("Student added successfully.");
            }
            case 2 -> {
                System.out.print("Enter Course ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Course Title: ");
                String title = scanner.nextLine();
                System.out.print("Enter Course Credit: ");
                double credit = scanner.nextDouble();
                courses.add(new Course(id, title, credit));
                System.out.println("Course added successfully.");
            }
            case 3 -> {
                System.out.print("Enter Faculty ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Faculty Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Faculty Position: ");
                String position = scanner.nextLine();
                faculties.add(new Faculty(id, name, position));
                System.out.println("Faculty added successfully.");
            }
            default -> System.out.println("Invalid option! Returning to main menu.");
        }
    }

    private static void deleteMenu() {
        
        System.out.println("Delete functionality not implemented yet.");
    }

    private static void updateMenu() {
        
        System.out.println("Update functionality not implemented yet.");
    }

    private static void printMenu() {
        System.out.println("Print:");
        System.out.println("1. Print All Students");
        System.out.println("2. Print All Courses");
        System.out.println("3. Print All Faculties");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                if (students.isEmpty()) {
                    System.out.println("No students available.");
                } else {
                    for (Student student : students) {
                        System.out.println(student);
                    }
                }
            }
            case 2 -> {
                if (courses.isEmpty()) {
                    System.out.println("No courses available.");
                } else {
                    for (Course course : courses) {
                        System.out.println(course);
                    }
                }
            }
            case 3 -> {
                if (faculties.isEmpty()) {
                    System.out.println("No faculties available.");
                } else {
                    for (Faculty faculty : faculties) {
                        System.out.println(faculty);
                    }
                }
            }
            default -> System.out.println("Invalid option! Returning to main menu.");
        }
    }

    private static void searchMenu() {
        
        System.out.println("Search functionality not implemented yet.");
    }
}
