package ru.itsjava.oop;

import ru.itsjava.object.Dog;

public class Phone {
    private final String brand; // НЕизменяемое поле final
    private boolean isHomey; // изменяемое поле

    // если есть fianl поля, то создается конструктор, где поле м.б. задано при создании объекта
    //           входящий параметр
    public Phone(String brand) {
//ссылаемся на поля вот этого конкретного объекта
        this.brand = brand;
    }

    // дополнительный конструктор от двух аргументов
    public Phone(String brand, boolean isHomey) {
        this.brand = brand;
        this.isHomey = isHomey;

    }

    public String toString(){
        return "{ brand:" + brand + " isHomey:" + isHomey + " }";
    }

    @Override
    public boolean equals(Object o) {//выдается какой-то Объект на вход, сначала проверяем две ссылки на кокой-то Объект, то возвращаем true
        if (this == o) return true;// объект равен самому себе - возвращаем true
        if (o == null || getClass() != o.getClass()) return false;//проверяем является ли объект экземпляром другого класса, НЕ является и возвращаем false

        Phone phone = (Phone) o;//если phone является экземпляром класса Phone, то можно явно привести; явно приводим тип данных, дальше работаем с phone. Если здесь лежит не Phone, то получим ошибку

        if (isHomey != phone.isHomey) return false;//если isHomey не совпадает false
        return brand.equals(phone.brand);//если совпадают, то сравниваем brand через equals
    }

    @Override
    public int hashCode() {
        return brand.hashCode();//берет хэшКод этого brand
    }
}
