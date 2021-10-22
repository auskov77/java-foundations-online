package ru.itsjava.Object_2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Berry {

    private final String nameBerry; //название
    private final String typePlant; //вид растения
    private String berryColor;// цвет ягоды
    private final String berryFlavor; //вкус

    public String toString() {
        return "Название: " + nameBerry + " , Вид растения: " + typePlant + ", Цвет ягоды: " + berryColor + ", Вкус ягоды: " + berryFlavor;
    }

}
