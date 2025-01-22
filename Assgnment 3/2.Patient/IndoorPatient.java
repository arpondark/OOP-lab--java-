class IndoorPatient extends Patient {
    private int admissionDate; 
    private int bedNo;
    private double dailyFee;

    public IndoorPatient(String name, int age, int systolic, int diastolic, double diabetesPoint, int admissionDate,
            int bedNo, double dailyFee) {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.admissionDate = admissionDate;
        this.bedNo = bedNo;
        this.dailyFee = dailyFee;
    }

    
    public int getAdmissionDate() {
        return admissionDate;
    }

    public int getBedNo() {
        return bedNo;
    }

    public double getDailyFee() {
        return dailyFee;
    }

    public void setAdmissionDate(int admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void setBedNo(int bedNo) {
        this.bedNo = bedNo;
    }

    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }

    @Override
    public double getInvoice() {
        return admissionDate * dailyFee;
    }

    @Override
    public String toString() {
        return super.toString() + ", Admission Days: " + admissionDate + ", Bed No: " + bedNo + ", Daily Fee: "
                + dailyFee;
    }
}