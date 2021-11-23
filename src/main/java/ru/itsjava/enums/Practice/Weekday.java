package ru.itsjava.enums.Practice;

public enum Weekday {
    MONDAY("Понеделник"), TUESDAY("Вторник"),
    WEDNESDAY("Среда"), THURSDAY("Четверг"),
    FRIDAY("Пятница"), SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String translationOfTheDayOfTheWeek;

    Weekday(String translationOfTheDayOfTheWeek){
        this.translationOfTheDayOfTheWeek = translationOfTheDayOfTheWeek;
    }

    public String getTranslationOfTheDayOfTheWeek() {
        return translationOfTheDayOfTheWeek;
    }

    @Override
    public String toString() {
        return "Weekday{" + this.name() +
                " (translation='" + translationOfTheDayOfTheWeek + '\'' +
                ")}";
    }



}
