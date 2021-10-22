package ru.itsjava.oop_2;

public class Crows extends Birds {
    public Crows() {
        super("Ворон", "Черный", "Европа");
    }
    @Override
    public void toSinging() {
        System.out.println("Голос ворона — громкое, трубное, гортанное «крух» или отчётливое «ток», а также всем известное карканье");
    }

    @Override
    public void toDomestication() {
        System.out.println("В основном держатся обособленными парами в природе");
    }

    @Override
    public void toHunting() {
        System.out.println("Питаются падалью. Проявляет черты настоящего охотника — ловит разнообразную дичь размером до зайца или небольшого копытного, в том числе грызунов, птиц, ящериц, змей");
    }
}
