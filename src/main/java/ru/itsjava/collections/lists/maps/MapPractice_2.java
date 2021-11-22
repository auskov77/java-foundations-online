package ru.itsjava.collections.lists.maps;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class MapPractice_2 {
    public static void main(String[] args) {
        Map<Man, Fruit> manFruitMapOld = new HashMap<>();
        Map<Man, Fruit> manFruitMapNew = new HashMap<>();

        Man ivanov = new Man("Ivanov");
        Man sidorov = new Man("Sidorov");
        Man javov = new Man("Javov");
        Man petrov = new Man("Petrov");
        Man uskov = new Man("Uskov");

        Fruit apple = new Fruit("Apple", 0.100);
        Fruit pear = new Fruit("Pear", 0.150);
        Fruit plum = new Fruit("Plum", 0.050);
        Fruit cherry = new Fruit("Cherry", 0.010);
        Fruit grape = new Fruit("Grape", 0.300);

        System.out.println("manFruitMapOld");
        manFruitMapOld.put(ivanov, apple);
        manFruitMapOld.put(sidorov, pear);
        manFruitMapOld.put(javov, plum);


        for (Map.Entry<Man, Fruit> pair: manFruitMapOld.entrySet()){
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println("manFruitMapOld.size() = " + manFruitMapOld.size());
        System.out.println();

        System.out.println("manFruitMapNew");
        manFruitMapNew.put(ivanov,cherry);
        manFruitMapNew.put(sidorov, cherry);
        manFruitMapNew.put(javov, cherry);
        manFruitMapNew.put(petrov, grape);
        manFruitMapNew.put(uskov, grape);

        for (Map.Entry<Man, Fruit> pair: manFruitMapNew.entrySet()){
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println("manFruitMapNew.size() = " + manFruitMapNew.size());
        System.out.println();

        System.out.println("В новый экземпляр HashMap добавим старую карту");
        manFruitMapNew.putAll(manFruitMapOld);

        for (Map.Entry<Man, Fruit> pair: manFruitMapNew.entrySet()){
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println("manFruitMapNew.size() = " + manFruitMapNew.size());
        System.out.println();

        System.out.println("Получение элемента по ключу (Получить любой фрукт по покупателю)");
        System.out.println("manFruitMapNew.get(ivanov) = " + manFruitMapNew.get(ivanov));
        System.out.println();

        System.out.println("Удалить любой фрукт");
        System.out.println("manFruitMapNew.remove(ivanov, apple) = " + manFruitMapNew.remove(ivanov, apple));
        System.out.println("manFruitMapNew.remove(ivanov, grape) = " + manFruitMapNew.remove(ivanov, grape));
        System.out.println();

        System.out.println("Проверка на наличие ключ и значение (Есть ли покупатель с таким фруктом)");
        System.out.println("manFruitMapNew.containsKey(sidorov) = " + manFruitMapNew.containsKey(sidorov));
        System.out.println("manFruitMapNew.containsKey(ivanov) = " + manFruitMapNew.containsKey(ivanov));
        System.out.println("manFruitMapNew.containsValue(grape) = " + manFruitMapNew.containsValue(grape));
        System.out.println("manFruitMapNew.containsValue(apple) = " + manFruitMapNew.containsValue(apple));
        System.out.println();

        System.out.println("Вывести все ключи (всех покупателей)");
        for (Man keyMan : manFruitMapNew.keySet()){
            System.out.println(keyMan);
        }
        System.out.println();

        System.out.println("Вывести все значения (все фрукты)");
        for (Fruit valueFruit : manFruitMapNew.values()){
            System.out.println(valueFruit);
        }
        System.out.println();

        System.out.println("Вывести все ключи и значения с помощью entrySet (всех покупателей и фрукты)");
        for (Map.Entry<Man, Fruit> pair: manFruitMapOld.entrySet()){
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println();

        System.out.println("Отфильтровать Map вернуть записи по некоторому условию:\n" +
                "//        а) Условие на ключ: вернуть количество ключей длина которых больше 5 (покупателей, чье имя больше 5)");
        Man khun = new Man("Khun");
        manFruitMapNew.put(khun, apple);
        for (Map.Entry<Man, Fruit> pair : manFruitMapNew.entrySet()) {
            if (pair.getKey().getName().length() > 5) {
                System.out.println(pair.getKey() + ":" + pair.getValue());
            }
        }
        System.out.println();

        System.out.println("Отфильтровать Map вернуть записи по некоторому условию:\n" +
                "Условие на значение: Вернуть количество элементов, которые равны \"***\"" +
                "(фруктов, которые равны дыне)");
        Fruit melon = new Fruit("Melon", 2.00);
        manFruitMapNew.put(khun, melon);
        for (Map.Entry<Man, Fruit> pair : manFruitMapNew.entrySet()) {
            if (pair.getValue().getName().contains("Melon")) {
                System.out.println(pair.getKey() + ":" + pair.getValue());
            }
        }
        System.out.println();

        System.out.println("Пропустить 2 элемента, значения которых Арбуз, все остальные вывести");
        Fruit watermelon = new Fruit("Watermelon", 8.00);
        Man noskov = new Man("Noskov");
        manFruitMapNew.put(ivanov, watermelon);
        manFruitMapNew.put(uskov, watermelon);
        manFruitMapNew.put(noskov, watermelon);
        int count = 0;
        Map<Man, Fruit> manFruitMapSuperNew = new HashMap<>(manFruitMapNew);
        System.out.println("Множество до применения условия:");
        for (Map.Entry<Man, Fruit> pair : manFruitMapSuperNew.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println();
        for (Map.Entry<Man, Fruit> pair : manFruitMapNew.entrySet()) {
            if (pair.getValue().getName().contains("Watermelon") && count <= 1) {
                manFruitMapSuperNew.remove(pair.getKey());
                count++;
            }
        }
        System.out.println("Множество - результат применения условия:");
        for (Map.Entry<Man, Fruit> pair : manFruitMapSuperNew.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println();

        System.out.println("Вывести все кроме 2 элементов, ключи которых начинаются на А");
        Man agin = new Man("Agin");
        Man avakov = new Man("Avakov");
        Man abzalov = new Man("Abzalov");
        manFruitMapNew.put(agin, plum);
        manFruitMapNew.put(avakov, cherry);
        manFruitMapNew.put(abzalov, melon);
        Map<Man, Fruit> manFruitMapSuperNew2 = new HashMap<>(manFruitMapNew);
        System.out.println("Множество до применения условия:");
        for (Map.Entry<Man, Fruit> pair : manFruitMapSuperNew2.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println();
        int count2 = 0;
        for (Map.Entry<Man, Fruit> pair : manFruitMapNew.entrySet()) {
            if (pair.getKey().getName().contains("A") & count2 < 2) {
                manFruitMapSuperNew2.remove(pair.getKey());
                count2++;
            }
        }
        System.out.println("Множество - результат применения условия:");
        for (Map.Entry<Man, Fruit> pair : manFruitMapSuperNew2.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println();

        System.out.println("Вернуть первый подходящий элемент: Возвращаем элемент значение которого арбуз или Арбуз или АРбУз");
        for (Map.Entry<Man, Fruit> pair : manFruitMapNew.entrySet()) {
            if (pair.getValue().getName().contains("watermelon") || pair.getValue().getName().contains("Watermelon") || pair.getValue().getName().contains("WATERmelon")) {
                System.out.println(pair.getKey() + ": " + pair.getValue());
                break;
            }
        }
        System.out.println();

        System.out.println("Возвращаем все элементы в другую карту, которые являются дыней или арбузом");
        Map<Man, Fruit> manFruitMapSuperNew3 = new HashMap<>();
        for (Map.Entry<Man, Fruit> pair : manFruitMapNew.entrySet()) {
            if (pair.getValue().equals(melon) || pair.getValue().equals(watermelon)) {
                manFruitMapSuperNew3.put(pair.getKey(), pair.getValue());
            }
        }
        for (Map.Entry<Man, Fruit> pair : manFruitMapSuperNew3.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        System.out.println();

        System.out.println("Найти средний вес всех фруктов");
        double weightAllFruit = 0.0;
//        double mediumWeightAllFruit = 0.0;
        int countFruit = 0;
        for (Map.Entry<Man, Fruit> pair : manFruitMapNew.entrySet()) {
            weightAllFruit = weightAllFruit + pair.getValue().getWeight();
            countFruit++;
        }
        double mediumWeightAllFruit = weightAllFruit / countFruit;
        String formatMediumWeightAllFruit = new DecimalFormat("#0.00").format(mediumWeightAllFruit);
        System.out.println("mediumWeightAllFruit = " + formatMediumWeightAllFruit + " Kg");
        System.out.println();

    }
}

//    Создать класс Fruit с полями: наименование и вес                                      - yes
//        0. Создать экземпляр HashMap (Ключ Имя покупателя Значение Фрукт)                 - yes
//        1.Вставка элементов:
//        а). Добавить 5 фруктов                                                            - yes
//        б). В новый экземпляр HashMap добавим старую карту                                - yes
//        2. Получение элемента по ключу (Получить любой фрукт по покупателю)               - yes
//        3. Удаление элемента
//        а). Удалить любой фрукт                                                           - yes
//        4. Проверка на наличие ключ и значение (Есть ли покупатель с таким фруктом)       - yes
//        5. Вывод Map на экран:
//        a) Вывести все ключи (всех покупателей)                                           - yes
//        б) Вывести все значения (все фрукты)                                              - yes
//        в) Вывести все ключи и значения с помощью entrySet (всех покупателей и фрукты)    - yes

//        6. Отфильтровать Map вернуть записи по некоторому условию:
//        а) Условие на ключ: вернуть количество ключей длина которых больше 5              - yes
//        (покупателей, чье имя больше 5)
//        б) Условие на значение: Вернуть количество элементов, которые равны "***"         - yes
//        (фруктов, которые равны дыне)
//        7. Пропустить несколько элементов
//        а) Пропустить 2 элемента, значения которых Арбуз, все остальные вывести.          - yes
//        б) Вывести все кроме 2 элементов, ключи которых начинаются на А                   - yes
//        8. Вернуть первый подходящий элемент:
//        а) Возвращаем элемент значение которого арбуз или Арбуз или АРбУз.                - yes
//        9. Возвращаем все элементы удовлетворяющие условию:
//        а) Возвращаем все элементы в другую карту, которые являются дыней или арбузом     - yes
//        10. Найти средний вес всех фруктов.                                               - yes