interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
}
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private StringBuilder history = new StringBuilder();

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        history.append(record).append("\n");
    }

    @Override
    public String viewRecords() {
        return "In-Patient History:\n" + history.toString();
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private int visits;
    private double consultationFee;
    private StringBuilder history = new StringBuilder();

    public OutPatient(String patientId, String name, int age, int visits, double consultationFee) {
        super(patientId, name, age);
        this.visits = visits;
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return visits * consultationFee;
    }

    @Override
    public void addRecord(String record) {
        history.append(record).append("\n");
    }

    @Override
    public String viewRecords() {
        return "Out-Patient History:\n" + history.toString();
    }
}
public class ProblemSeven {
    public static void main(String[] args) {
        Patient[] patients = new Patient[2];

        patients[0] = new InPatient("P001", "John Doe", 45, 5, 2500);
        patients[1] = new OutPatient("P002", "Jane Smith", 30, 3, 500);

        ((MedicalRecord)patients[0]).addRecord("Admitted for surgery. Recovering well.");
        ((MedicalRecord)patients[1]).addRecord("Visited for flu symptoms. Prescribed medication.");

        System.out.println("=== Patient Billing & Records ===\n");

        double totalBilling = 0;
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Total Bill  : ₹" + p.calculateBill());
            System.out.println(((MedicalRecord)p).viewRecords());
            System.out.println("------------------------------");
            totalBilling += p.calculateBill();
        }

        System.out.println("Total Billing for All Patients: ₹" + totalBilling);
    }
}
