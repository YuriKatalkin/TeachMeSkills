package lesson7_homework;

public class Patient extends Hospital {
    private int healingPlan;
    private Hospital doctor;

    public Patient(int healingPlan) {
        this.healingPlan = healingPlan;
    }

    public int getHealingPlan() {
        return healingPlan;
    }

    public Hospital getDoctor() {
        return doctor;
    }

    public void setDoctor(Hospital doctor) {
        this.doctor = doctor;
    }
}
