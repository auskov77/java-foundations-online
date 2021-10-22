package ru.itsjava.object;

public class Dog {

    private final String nickName;
    private int pawsCount;

    public Dog(String nickName, int pawsCount){
        this.nickName = nickName;
        this.pawsCount = pawsCount;
    }

    @Override
    public boolean equals(Object o) { //выдается какой-то обжект на вход
        if (this == o) return true;// она равна самой себе
        if (!(o instanceof Dog)) return false;//входящий объект НЕ является объекта Dog

        Dog dog = (Dog) o;//явно приводим тип данных, дальше работаем с собакой

        if (pawsCount != dog.pawsCount) return false;//если кол-во лап не совпадает false
        return nickName.equals(dog.nickName);//если совпадают то сравниваем nickName
    }

    @Override
    public int hashCode() {
        return nickName.hashCode();//берет хэшКод этого nickName
    }
}
