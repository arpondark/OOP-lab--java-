class OutdoorPatient extends Patient {
    private String specialty;
    private double consultationFee;

    public OutdoorPatient(String name, int age, int systolic, int diastolic, double diabetesPoint,
                          String specialty, double consultationFee) {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.specialty = specialty;
        this.consultationFee = consultationFee;
    }

    public double getInvoice() {
        return consultationFee;
    }

    @Override
    public String toString() {
        return super.toString() + ", Specialty: " + specialty + ", Consultation Fee: " + consultationFee;
    }
}