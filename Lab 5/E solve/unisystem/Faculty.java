package unisystem;

public class Faculty {
    private int facultyId;
    private String facultyName;
    private String facultyPosition;

    public Faculty() {}

    public Faculty(int facultyId, String facultyName, String facultyPosition) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyName(String name) {
        this.facultyName = name;
    }

    public void setFacultyPosition(String position) {
        this.facultyPosition = position;
    }

    @Override
    public String toString() {
        return "Faculty ID: " + facultyId + ", Name: " + facultyName + ", Position: " + facultyPosition;
    }
}
