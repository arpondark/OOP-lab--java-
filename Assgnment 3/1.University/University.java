import java.util.*;
class University implements Comparable<University> {
    private String name;
    private String address;
    private int dateEstablished;
    private int numberOfDepartments;

    public University(String name, String address, int dateEstablished, int numberOfDepartments) {
        this.name = name;
        this.address = address;
        this.dateEstablished = dateEstablished;
        this.numberOfDepartments = numberOfDepartments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDateEstablished() {
        return dateEstablished;
    }

    public void setDateEstablished(int dateEstablished) {
        this.dateEstablished = dateEstablished;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Established: " + dateEstablished + ", Departments: "
                + numberOfDepartments;
    }

    @Override
    public int compareTo(University other) {
        return Integer.compare(other.dateEstablished, this.dateEstablished);
    }
}