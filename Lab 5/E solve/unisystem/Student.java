package unisystem;

public class Student {
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

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public void setStudentCGPA(double cgpa) {
        this.studentCGPA = cgpa;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + studentName + ", CGPA: " + studentCGPA;
    }
}
