import unisystem.Student;
import unisystem.Faculty;
import unisystem.Course;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static final ArrayList<Student> students = new ArrayList<>();
    private static final ArrayList<Course> courses = new ArrayList<>();
    private static final ArrayList<Faculty> faculties = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
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
        System.out.println("\nAdd:");
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
        System.out.println("\nDelete:");
        System.out.println("1. Delete Student");
        System.out.println("2. Delete Course");
        System.out.println("3. Delete Faculty");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter Student ID to delete: ");
                int id = scanner.nextInt();
                students.removeIf(student -> student.getStudentId() == id);
                System.out.println("Student deleted if found.");
            }
            case 2 -> {
                System.out.print("Enter Course ID to delete: ");
                String id = scanner.nextLine();
                courses.removeIf(course -> course.getCourseId().equals(id));
                System.out.println("Course deleted if found.");
            }
            case 3 -> {
                System.out.print("Enter Faculty ID to delete: ");
                int id = scanner.nextInt();
                faculties.removeIf(faculty -> faculty.getFacultyId() == id);
                System.out.println("Faculty deleted if found.");
            }
            default -> System.out.println("Invalid option! Returning to main menu.");
        }
    }

    private static void updateMenu() {
        System.out.println("\nUpdate:");
        System.out.println("1. Update Student");
        System.out.println("2. Update Course");
        System.out.println("3. Update Faculty");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter Student ID to update: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                for (Student student : students) {
                    if (student.getStudentId() == id) {
                        System.out.print("Enter new name: ");
                        student.setStudentName(scanner.nextLine());
                        System.out.print("Enter new CGPA: ");
                        student.setStudentCGPA(scanner.nextDouble());
                        System.out.println("Student updated.");
                        return;
                    }
                }
                System.out.println("Student not found.");
            }
            case 2 -> {
                System.out.print("Enter Course ID to update: ");
                String id = scanner.nextLine();
                for (Course course : courses) {
                    if (course.getCourseId().equals(id)) {
                        System.out.print("Enter new title: ");
                        course.setCourseTitle(scanner.nextLine());
                        System.out.print("Enter new credit: ");
                        course.setCredit(scanner.nextDouble());
                        System.out.println("Course updated.");
                        return;
                    }
                }
                System.out.println("Course not found.");
            }
            case 3 -> {
                System.out.print("Enter Faculty ID to update: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                for (Faculty faculty : faculties) {
                    if (faculty.getFacultyId() == id) {
                        System.out.print("Enter new name: ");
                        faculty.setFacultyName(scanner.nextLine());
                        System.out.print("Enter new position: ");
                        faculty.setFacultyPosition(scanner.nextLine());
                        System.out.println("Faculty updated.");
                        return;
                    }
                }
                System.out.println("Faculty not found.");
            }
            default -> System.out.println("Invalid option! Returning to main menu.");
        }
    }

    private static void printMenu() {
        System.out.println("\nPrint:");
        System.out.println("1. Print All Students");
        System.out.println("2. Print All Courses");
        System.out.println("3. Print All Faculties");
        System.out.println("4. Print Information of a Student");
        System.out.println("5. Print Information of a Course");
        System.out.println("6. Print Information of a Faculty");
        System.out.println("7. Print Student List and Faculty Information of a Course");
        System.out.println("8. Print Courses Taken by a Student");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> students.forEach(System.out::println);
            case 2 -> courses.forEach(System.out::println);
            case 3 -> faculties.forEach(System.out::println);
            case 4 -> {
                System.out.print("Enter Student ID: ");
                int id = scanner.nextInt();
                students.stream()
                        .filter(student -> student.getStudentId() == id)
                        .forEach(System.out::println);
            }
            case 5 -> {
                System.out.print("Enter Course ID: ");
                String id = scanner.nextLine();
                courses.stream()
                        .filter(course -> course.getCourseId().equals(id))
                        .forEach(System.out::println);
            }
            case 6 -> {
                System.out.print("Enter Faculty ID: ");
                int id = scanner.nextInt();
                faculties.stream()
                        .filter(faculty -> faculty.getFacultyId() == id)
                        .forEach(System.out::println);
            }
            case 7 -> {
                System.out.print("Enter Course ID: ");
                String id = scanner.nextLine();
                courses.stream()
                        .filter(course -> course.getCourseId().equals(id))
                        .forEach(course -> {
                            System.out.println(course);
                            course.printStudentList();
                        });
            }
            case 8 -> {
                System.out.print("Enter Student ID: ");
                int id = scanner.nextInt();
                courses.stream()
                        .filter(course -> course.studentList.stream()
                                .anyMatch(student -> student.getStudentId() == id))
                        .forEach(System.out::println);
            }
            default -> System.out.println("Invalid option! Returning to main menu.");
        }
    }

    private static void searchMenu() {
        System.out.println("\nSearch:");
        System.out.println("1. Search a Student");
        System.out.println("2. Search a Course");
        System.out.println("3. Search a Faculty");
        System.out.println("4. Search Whether a Student Takes a Course");
        System.out.println("5. Search Whether a Faculty Teaches a Course");
        System.out.println("6. Search Courses Taken by a Student");
        System.out.println("7. Search Courses Taught by a Faculty");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter Student ID: ");
                int id = scanner.nextInt();
                students.stream()
                        .filter(student -> student.getStudentId() == id)
                        .forEach(System.out::println);
            }
            case 2 -> {
                System.out.print("Enter Course ID: ");
                String id = scanner.nextLine();
                courses.stream()
                        .filter(course -> course.getCourseId().equals(id))
                        .forEach(System.out::println);
            }
            case 3 -> {
                System.out.print("Enter Faculty ID: ");
                int id = scanner.nextInt();
                faculties.stream()
                        .filter(faculty -> faculty.getFacultyId() == id)
                        .forEach(System.out::println);
            }
            case 4 -> {
                System.out.print("Enter Student ID: ");
                int studentId = scanner.nextInt();
                System.out.print("Enter Course ID: ");
                String courseId = scanner.next();
                boolean isTaking = courses.stream()
                        .filter(course -> course.getCourseId().equals(courseId))
                        .anyMatch(course -> course.studentList.stream()
                                .anyMatch(student -> student.getStudentId() == studentId));
                System.out.println(isTaking ? "Student is taking the course." : "Student is NOT taking the course.");
            }
            case 5 -> {
                System.out.print("Enter Faculty ID: ");
                int facultyId = scanner.nextInt();
                System.out.print("Enter Course ID: ");
                String courseId = scanner.next();
                boolean isTeaching = courses.stream()
                        .filter(course -> course.getCourseId().equals(courseId))
                        .anyMatch(course -> course.faculty != null && course.faculty.getFacultyId() == facultyId);
                System.out.println(isTeaching ? "Faculty is teaching the course." : "Faculty is NOT teaching the course.");
            }
            case 6 -> {
                System.out.print("Enter Student ID: ");
                int studentId = scanner.nextInt();
                courses.stream()
                        .filter(course -> course.studentList.stream()
                                .anyMatch(student -> student.getStudentId() == studentId))
                        .forEach(System.out::println);
            }
            case 7 -> {
                System.out.print("Enter Faculty ID: ");
                int facultyId = scanner.nextInt();
                courses.stream()
                        .filter(course -> course.faculty != null && course.faculty.getFacultyId() == facultyId)
                        .forEach(System.out::println);
            }
            default -> System.out.println("Invalid option! Returning to main menu.");
        }
    }
}

