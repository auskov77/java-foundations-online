package ru.itsjava.strings;

public class StringPractice {
    public static void main(String[] args) {
//        String name = "Alex";
//        String copyName = "Alex"; //
//        System.out.println("(name == copyName) = " + (name == copyName));
//        String constructorName = new String("Alex");
//        System.out.println("(constructorName == name) = " + (constructorName == name));
//        String internConstructorName = constructorName.intern();
//        System.out.println("(internConstructorName == name) = " + (internConstructorName == name));

        String str = "Я строка";
        System.out.println("str.length() = " + str.length());
        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("str.equals(\"Я строкА\") = " + str.equals("Я строкА"));
        System.out.println("str.equalsIgnoreCase(\"Я строкА\") = "
                + str.equalsIgnoreCase("Я строкА"));

        String[] strs = str.split(" ");
        System.out.println(strs[0]);
        System.out.println(strs[1]);
//        for (int i = 0; i < 1_000_000; i++) {
//            str = str + "!";
//        }
        StringBuilder builderStr = new StringBuilder(str);
        for (int i = 0; i < 1_000_000; i++) {
            builderStr.append("!");
        }
        System.out.println(builderStr.toString());

        str.toString(); // возвращает содержание объекта - строковое значение
        str.equals("Я строКа"); // возвращает логическое выражение true/false при сравнении содержимого объекта str и строкового значения в ()
        str.equalsIgnoreCase("Я строКа"); // возвращает логическое выражение true/false при сравнении содержимого объекта str и строкового значения в () игнорируя регистр (верхний/нижний)
        str.split("!"); //  разделяет строку на подстроки, используя разделитель
        str.length(); // возвращает количество символов в строке
        str.isEmpty(); // возвращает логическое выражение true/false от количества символов в строке
        str.getBytes(); // кодирует данную строку в последовательность байтов
        str.toLowerCase(); // преобразует все символы в данной строки в нижний регистр, используя правила языкового стандарта
        str.toUpperCase(); // преобразует все символы в данной строки в верхний регистр, используя правила языкового стандарта
        str.intern(); // метод для помещения строки в пул
        str.charAt(1); // возвращает символ строки соответствующий значению в ()
        str.compareTo(" "); // сравнивает вызывающий объект с объектом, переданным в качестве параметра, и возвращает в результате выполнения сравнения целое число
        str.compareToIgnoreCase(" "); // сравнивает вызывающий объект с объектом, переданным в качестве параметра, и возвращает в результате выполнения сравнения целое число игнорируя регистр (верхний/нижний)
        str.concat(" "); // объединяет строки, путем добавления одной строки в конец к другой
        str.contains(" "); // метод Java, позволяющий проверить, содержит ли String другую подстроку или нет
        str.endsWith(" "); // проверяет, заканчивается ли эта строка указанным окончанием
        str.replace("а", "D"); // метод позволяет заменить символ в строке
        str.toCharArray(); // преобразует данную строку в новый массив символов
        str.trim(); // метод позволяет в Java удалить пробелы в начале и конце строки
        str.strip(); // возвращает строку со всеми удаленными начальными и конечными пробелами

    }
}
