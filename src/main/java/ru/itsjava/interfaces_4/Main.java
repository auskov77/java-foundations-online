package ru.itsjava.interfaces_4;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.eat();

        Man man = new Man();
        man.talk();
    }
}
//2. Создать интерфейсы Talkable и Eatable                                  - Yes
//        - реализовать default методы в этих интерфейсах talk() и eat()    - Yes
//        - классы Cow, Man, Plant (растение) и                             - Yes
//        реализовать эти интерфейсы                                        - Yes