package ru.itsjava.oop_3;

public class CarDriver {
    private final String qualificationCategory; //Квалификационный разряд
    private final String characteristicsWorksr; //Характеристика работ
    private final String mustKnow; // Должен знать

    public CarDriver(String qualificationCategory, String characteristicsWorksr, String mustKnow) {
        this.qualificationCategory = qualificationCategory;
        this.characteristicsWorksr = characteristicsWorksr;
        this.mustKnow = mustKnow;
    }

    public String toString() {
        return "Квалификационный разряд: " + qualificationCategory + "\n Характеристика работ: \n" + characteristicsWorksr + "\n Должен знать: \n" + mustKnow;
    }
    public void toEliminationMalfunctions(){
    }

}
