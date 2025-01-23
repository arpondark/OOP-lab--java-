import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class IndoorPatient extends Patient {
    private LocalDate admissionDate;
    private int bedNo;
    private double dailyFee;

    
    public IndoorPatient(String name, int age, int systolic, int diastolic, double diabetesPoint,
                         LocalDate admissionDate, int bedNo, double dailyFee) {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.admissionDate = admissionDate;
        this.bedNo = bedNo;
        this.dailyFee = dailyFee;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public int getBedNo() {
        return bedNo;
    }

    public void setBedNo(int bedNo) {
        this.bedNo = bedNo;
    }

    public double getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }

    public double getInvoice() {
        long days = ChronoUnit.DAYS.between(admissionDate, LocalDate.now());
        return days * dailyFee;
    }


    @Override
    public String toString() {
        return super.toString() + ", Admission Date: " + admissionDate + ", Bed No: " + bedNo +
               ", Daily Fee: " + dailyFee;
    }
}
