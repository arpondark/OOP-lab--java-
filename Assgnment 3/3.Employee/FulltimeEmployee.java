import java.util.Calendar;

public class FulltimeEmployee extends Employee {
    private double monthlySalary;

    // Constructor
    public FulltimeEmployee(String name, int id, Calendar dateOfBirth, double monthlySalary) {
        super(name, id, dateOfBirth);
        this.monthlySalary = Math.max(monthlySalary, 0);
    }

    // Getter and Setter
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = Math.max(monthlySalary, 0);
    }

    // Override getSalary
    @Override
    public double getSalary() {
        return monthlySalary;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", Type: Fulltime, Monthly Salary: " + monthlySalary;
    }
}
