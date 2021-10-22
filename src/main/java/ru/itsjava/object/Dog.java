package ru.itsjava.object;

import lombok.*;

@Data//конструктор всех полей
@Getter //конструктор геттеров
@Setter //конструктор сеттеров
@AllArgsConstructor //коструктор от всех аргументов
//@NoArgsConstructor // конструктор по умолчанию без аргументов
@RequiredArgsConstructor //конструктор для всех final полей
public class Dog {

    private final String nickName;
    private int pawsCount;

//    public Dog(String nickName, int pawsCount){
//        this.nickName = nickName;
//        this.pawsCount = pawsCount;
//    }

//    @Override
//    public boolean equals(Object o) { //выдается какой-то обжект на вход
//        if (this == o) return true;// она равна самой себе
//        if (!(o instanceof Dog)) return false;//входящий объект НЕ является объекта Dog
//
//        Dog dog = (Dog) o;//явно приводим тип данных, дальше работаем с собакой
//
//        if (pawsCount != dog.pawsCount) return false;//если кол-во лап не совпадает false
//        return nickName.equals(dog.nickName);//если совпадают то сравниваем nickName
//    }
//
//    @Override
//    public int hashCode() {
//        return nickName.hashCode();//берет хэшКод этого nickName
//    }
//
//    public String toString(){
//        return "Dog {nickName: " + nickName + ", paws: " + pawsCount + "}";
//    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Dog)) return false;
        final Dog other = (Dog) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$nickName = this.getNickName();
        final Object other$nickName = other.getNickName();
        if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false;
        if (this.getPawsCount() != other.getPawsCount()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Dog;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $nickName = this.getNickName();
        result = result * PRIME + ($nickName == null ? 43 : $nickName.hashCode());
        result = result * PRIME + this.getPawsCount();
        return result;
    }

    public String toString() {
        return "Dog(nickName=" + this.getNickName() + ", pawsCount=" + this.getPawsCount() + ")";
    }
}
