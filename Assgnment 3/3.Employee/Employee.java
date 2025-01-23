import java.util.Calendar;

public abstract class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private Calendar dateOfBirth;

    
    public Employee(String name, int id, Calendar dateOfBirth) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
    public abstract double getSalary();

    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Date of Birth: " +
                dateOfBirth.get(Calendar.YEAR) + "-" +
                (dateOfBirth.get(Calendar.MONTH) + 1) + "-" +
                dateOfBirth.get(Calendar.DAY_OF_MONTH);
    }

    // Comparable for sorting by salary
    @Override
    public int compareTo(Employee other) {
        return Double.compare(other.getSalary(), this.getSalary());
    }
}
