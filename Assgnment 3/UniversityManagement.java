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
        return "University [name=" + name + ", address=" + address + ", dateEstablished=" + dateEstablished
                + ", numberOfDepartments=" + numberOfDepartments + "]";
    }

    public int compareTo(University other) {
        return Integer.compare(other.dateEstablished, this.dateEstablished);
    }

}

class PublicUniversity extends University{
    private int numberOfHall;
    private boolean politicsAllowed;
    public PublicUniversity(String name, String address, int dateEstablished, int numberOfDepartments, int numberOfHall,
            boolean politicsAllowed) {
        super(name, address, dateEstablished, numberOfDepartments);
        this.numberOfHall = numberOfHall;
        this.politicsAllowed = politicsAllowed;
    }
    public int getNumberOfHall() {
        return numberOfHall;
    }
    public void setNumberOfHall(int numberOfHall) {
        this.numberOfHall = numberOfHall;
    }
    public boolean isPoliticsAllowed() {
        return politicsAllowed;
    }
    public void setPoliticsAllowed(boolean politicsAllowed) {
        this.politicsAllowed = politicsAllowed;
    }
    @Override
    public String toString() {
        return "PublicUniversity [numberOfHall=" + numberOfHall + ", politicsAllowed=" + politicsAllowed + "]";
    }
    
}

class privateUniversity extends University{
    private boolean ugcApproved;
    private int numberOfTrusteeMember;
    public privateUniversity(String name, String address, int dateEstablished, int numberOfDepartments,
            boolean ugcApproved, int numberOfTrusteeMember) {
        super(name, address, dateEstablished, numberOfDepartments);
        this.ugcApproved = ugcApproved;
        this.numberOfTrusteeMember = numberOfTrusteeMember;
    }
    public boolean isUgcApproved() {
        return ugcApproved;
    }
    public void setUgcApproved(boolean ugcApproved) {
        this.ugcApproved = ugcApproved;
    }
    public int getNumberOfTrusteeMember() {
        return numberOfTrusteeMember;
    }
    public void setNumberOfTrusteeMember(int numberOfTrusteeMember) {
        this.numberOfTrusteeMember = numberOfTrusteeMember;
    }
    @Override
    public String toString() {
        return "privateUniversity [ugcApproved=" + ugcApproved + ", numberOfTrusteeMember=" + numberOfTrusteeMember
                + "]";
    }
    
}