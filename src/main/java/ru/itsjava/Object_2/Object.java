package ru.itsjava.Object_2;

public class Object {
    public static void main(String[] args) {
        Berry strawberry = new Strawberry();
        System.out.println("Ягода = " + strawberry);

        Berry cranberry = new Cranberry();
        System.out.println("Ягода = " + cranberry);

        Berry currantRed = new CurrantRed();
        System.out.println("Ягода = " + currantRed);

        System.out.println("strawberry.getNameBerry() = " + strawberry.getNameBerry());

        System.out.println("cranberry.getBerryColor() = " + cranberry.getBerryColor());

        System.out.println("currantRed.getBerryFlavor() = " + currantRed.getBerryFlavor());

        Berry currentBlack = new CurrantRed();

        currentBlack.setBerryColor("Черный");

        System.out.println("Ягода = Название: Смородина черная" + ", Вид растения: " + currantRed.getTypePlant() + ", Цвет ягоды: " + currentBlack.getBerryColor() + ", Вкус ягоды: " + currantRed.getBerryFlavor());
    }
}
