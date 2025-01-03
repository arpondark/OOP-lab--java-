package unisystem;

import java.util.ArrayList;

public class Course {
    private String courseId;
    private String courseTitle;
    private double credit;
    public ArrayList<Student> studentList = new ArrayList<>();
    public Faculty faculty;

    public Course() {}

    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseTitle(String title) {
        this.courseTitle = title;
    }

    public void setCredit(double credit) {
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
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Title: " + courseTitle + ", Credit: " + credit +
                (faculty != null ? ", Faculty: " + faculty : "");
    }
}
