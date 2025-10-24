package lesson7_homework;

public class Therapist extends Hospital {
    @Override
    public void healing() {
        System.out.println("\"Терапевт\"" + " - лечит терапевтическим путём");
    }

    public void givePlan(Patient patient) {
        int healingPlan = patient.getHealingPlan();
        if (healingPlan == 1) {
            patient.setDoctor(new Surgeon());
        } else if (healingPlan == 2) {
            patient.setDoctor(new Dantist());
        } else {
            patient.setDoctor(new Therapist());
        }
        System.out.print("Пациенту назначен врач - ");
        patient.getDoctor().healing();
    }
}
