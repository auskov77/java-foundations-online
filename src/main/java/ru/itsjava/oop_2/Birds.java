package ru.itsjava.oop_2;

public class Birds {
    private final String view; //Вид
    private final String coverColor; //Цвет покрова
    private final String habitat; // Ареал обитания

    public Birds(String view, String coverColor, String habitat) {
        this.view = view;
        this.coverColor = coverColor;
        this.habitat = habitat;
    }

    public String toString() {
        return "Вид: " + view + ", Цвет перьев: " + coverColor + ", Ареал обитания: " + habitat;
    }

    public void toSinging(){
        System.out.println("Стандартное пение");
    }

    public void toDomestication(){
        System.out.println("Стандартное проживание");
    }

    public void toHunting(){
        System.out.println("Стандартное вдение охоты");
    }
}
