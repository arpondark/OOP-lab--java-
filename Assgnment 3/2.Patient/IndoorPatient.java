class IndoorPatient extends Patient{
    private String admissionDate;
    private int bedNo;
    private double dailyFee;
    public IndoorPatient(String name, int age, int systolic, int diastolic, double diabetesPoint, String admissionDate,
            int bedNo, double dailyFee) {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.admissionDate = admissionDate;
        this.bedNo = bedNo;
        this.dailyFee = dailyFee;
    }
    public String getAdmissionDate() {
        return admissionDate;
    }
    public void setAdmissionDate(String admissionDate) {
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
        int daysInHospital = calculateDaysInHospital();
        return dailyFee * daysInHospital;
    }
    @Override
    public String toString() {
        return "IndoorPatient [admissionDate=" + admissionDate + ", bedNo=" + bedNo + ", dailyFee=" + dailyFee + "]";
    }
    
}
