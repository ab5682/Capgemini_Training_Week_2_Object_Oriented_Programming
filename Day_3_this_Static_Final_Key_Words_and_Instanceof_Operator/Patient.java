public class Patient {
    static String hospitalName = "SRM Hospital";
    static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final String patientID;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Patient ) {
            Patient p = (Patient) obj;
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("Not a Patient instance.");
        }
    }

    public static void main(String[] args){
        Patient p1 = new Patient("Aadarsh", 21, "Ear Infection", "AB6582");
        Patient p2 = new Patient("Abhay", 56, "Cataract", "asd2321");
        getTotalPatients();
        p1.displayDetails(p2);
        p2.displayDetails(p2);
    }

}
