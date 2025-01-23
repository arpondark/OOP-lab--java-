import java.util.*;

public class ParttimeEmployee extends Employee {
    private double hours;
    private double hourlyRate;

    // Constructor
    public ParttimeEmployee(String name, int id, Calendar dateOfBirth, double hours, double hourlyRate) {
        super(name, id, dateOfBirth);
        this.hours = hours;
        this.hourlyRate = Math.max(hourlyRate, 200); // Ensure minimum wage
    }

    // Getters and Setters
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = Math.max(hourlyRate, 200);
    }

    // Override getSalary
    @Override
    public double getSalary() {
        return hours * hourlyRate;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", Type: Parttime, Hours: " + hours + ", Hourly Rate: " + hourlyRate;
    }
}
