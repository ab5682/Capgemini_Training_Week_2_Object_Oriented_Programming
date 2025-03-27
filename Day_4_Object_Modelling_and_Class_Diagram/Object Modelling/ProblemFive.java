import java.util.*;

class Patient {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void listConsultedDoctors() {
        System.out.println("Patient " + name + " has consulted:");
        for (Doctor doctor : doctors) {
            System.out.println("  - Dr. " + doctor.getName());
        }
    }
}

class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting with patient " + patient.getName());

        // Associate both sides
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        patient.addDoctor(this);
    }

    public void listPatients() {
        System.out.println("Dr. " + name + " has seen the following patients:");
        for (Patient p : patients) {
            System.out.println("  - " + p.getName());
        }
    }
}

class Hospital {
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showAllDoctors() {
        System.out.println("Hospital Doctors:");
        for (Doctor d : doctors) {
            System.out.println("  - Dr. " + d.getName());
        }
    }

    public void showAllPatients() {
        System.out.println("Hospital Patients:");
        for (Patient p : patients) {
            System.out.println("  - " + p.getName());
        }
    }
}

public class ProblemFive {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor drSmith = new Doctor("Smith");
        Doctor drAdams = new Doctor("Adams");

        Patient alice = new Patient("Alice");
        Patient bob = new Patient("Bob");

        hospital.addDoctor(drSmith);
        hospital.addDoctor(drAdams);
        hospital.addPatient(alice);
        hospital.addPatient(bob);

        drSmith.consult(alice);
        drSmith.consult(bob);

        drAdams.consult(alice); 

        System.out.println();
        drSmith.listPatients();
        drAdams.listPatients();

        System.out.println();
        alice.listConsultedDoctors();
        bob.listConsultedDoctors();
    }
}
